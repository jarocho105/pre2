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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.inventario.util.TipoProductoConstantesFunciones;

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
public class TipoProductoDetalleFormJInternalFrame extends TipoProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoProducto;
	
	protected JMenuBar jmenuBarDetalleTipoProducto;
	
	protected JMenu jmenuDetalleTipoProducto;
	protected JMenu jmenuDetalleArchivoTipoProducto;
	protected JMenu jmenuDetalleAccionesTipoProducto;
	protected JMenu jmenuDetalleDatosTipoProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoProducto;	
	protected GridBagConstraints gridBagConstraintsTipoProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoProductoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoProducto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoProductoSessionBean tipoproductoSessionBean;
	
	

	public ModeloProductoBeanSwingJInternalFrame modeloproductoBeanSwingJInternalFrame=null;
	public ModeloProductoBeanSwingJInternalFrame modeloproductoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteModeloProducto=false;
	public ModeloProductoSessionBean modeloproductoSessionBean;

	public MaterialProductoBeanSwingJInternalFrame materialproductoBeanSwingJInternalFrame=null;
	public MaterialProductoBeanSwingJInternalFrame materialproductoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteMaterialProducto=false;
	public MaterialProductoSessionBean materialproductoSessionBean;

	public MarcaProductoBeanSwingJInternalFrame marcaproductoBeanSwingJInternalFrame=null;
	public MarcaProductoBeanSwingJInternalFrame marcaproductoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteMarcaProducto=false;
	public MarcaProductoSessionBean marcaproductoSessionBean;

	public SegmentoProductoBeanSwingJInternalFrame segmentoproductoBeanSwingJInternalFrame=null;
	public SegmentoProductoBeanSwingJInternalFrame segmentoproductoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSegmentoProducto=false;
	public SegmentoProductoSessionBean segmentoproductoSessionBean;

	public ColorProductoBeanSwingJInternalFrame colorproductoBeanSwingJInternalFrame=null;
	public ColorProductoBeanSwingJInternalFrame colorproductoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteColorProducto=false;
	public ColorProductoSessionBean colorproductoSessionBean;

	public EfectoProductoBeanSwingJInternalFrame efectoproductoBeanSwingJInternalFrame=null;
	public EfectoProductoBeanSwingJInternalFrame efectoproductoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEfectoProducto=false;
	public EfectoProductoSessionBean efectoproductoSessionBean;

	public TallaProductoBeanSwingJInternalFrame tallaproductoBeanSwingJInternalFrame=null;
	public TallaProductoBeanSwingJInternalFrame tallaproductoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTallaProducto=false;
	public TallaProductoSessionBean tallaproductoSessionBean;

	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;
	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroInventarioDefecto=false;
	public ParametroInventarioDefectoSessionBean parametroinventariodefectoSessionBean;

	public ClaseProductoBeanSwingJInternalFrame claseproductoBeanSwingJInternalFrame=null;
	public ClaseProductoBeanSwingJInternalFrame claseproductoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteClaseProducto=false;
	public ClaseProductoSessionBean claseproductoSessionBean;

	public ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame=null;
	public ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProducto=false;
	public ProductoSessionBean productoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoProductoLogic tipoproductoLogic;
	
	public JScrollPane jScrollPanelDatosTipoProducto;
	public JScrollPane jScrollPanelDatosEdicionTipoProducto;
	public JScrollPane jScrollPanelDatosGeneralTipoProducto;
	
	protected JPanel jPanelCamposTipoProducto;    
	protected JPanel jPanelCamposOcultosTipoProducto;    	
	protected JPanel jPanelAccionesTipoProducto;
	protected JPanel jPanelAccionesFormularioTipoProducto;
    
	
	
	protected Integer iXPanelCamposTipoProducto=0;
	protected Integer iYPanelCamposTipoProducto=0;
	
	protected Integer iXPanelCamposOcultosTipoProducto=0;
	protected Integer iYPanelCamposOcultosTipoProducto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoProducto;
	public JButton jButtonModificarTipoProducto;
	public JButton jButtonActualizarTipoProducto;
    public JButton jButtonEliminarTipoProducto;
	public JButton jButtonCancelarTipoProducto;
    public JButton jButtonGuardarCambiosTipoProducto;
	public JButton jButtonGuardarCambiosTablaTipoProducto;
	protected JButton jButtonCerrarTipoProducto;
	
	
	protected JButton jButtonProcesarInformacionTipoProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoProducto;
	protected JButton jButtonModificarToolBarTipoProducto;
	protected JButton jButtonActualizarToolBarTipoProducto;
    protected JButton jButtonEliminarToolBarTipoProducto;
	protected JButton jButtonCancelarToolBarTipoProducto;
    protected JButton jButtonGuardarCambiosToolBarTipoProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoProducto;
	protected JButton jButtonCerrarToolBarTipoProducto;
	
	protected JButton jButtonProcesarInformacionToolBarTipoProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoProducto;
	protected JMenuItem jMenuItemModificarTipoProducto;
	protected JMenuItem jMenuItemActualizarTipoProducto;
    protected JMenuItem jMenuItemEliminarTipoProducto;
	protected JMenuItem jMenuItemCancelarTipoProducto;
    protected JMenuItem jMenuItemGuardarCambiosTipoProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoProducto;
	protected JMenuItem jMenuItemCerrarTipoProducto;
	protected JMenuItem jMenuItemDetalleCerrarTipoProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoProducto;
	protected JMenuItem jMenuItemMostrarOcultarTipoProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoProducto;
	public JLabel jLabelIdTipoProducto;
	public JLabel jLabelidTipoProducto;
	public JButton jButtonidTipoProductoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoProducto;
	public JLabel jLabelcodigoTipoProducto;
	public JTextField jTextFieldcodigoTipoProducto;
	public JButton jButtoncodigoTipoProductoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoProducto;
	public JLabel jLabelnombreTipoProducto;
	public JTextArea jTextAreanombreTipoProducto;
	public JScrollPane jscrollPanenombreTipoProducto;
	public JButton jButtonnombreTipoProductoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTipoProducto;
	public JLabel jLabeldescripcionTipoProducto;
	public JTextArea jTextAreadescripcionTipoProducto;
	public JScrollPane jscrollPanedescripcionTipoProducto;
	public JButton jButtondescripcionTipoProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoProducto;
	public JLabel jLabelid_empresaTipoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoProducto;
	public JButton jButtonid_empresaTipoProducto= new JButtonMe();
	public JButton jButtonid_empresaTipoProductoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoProductoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoProducto;
	
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
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoProducto=new JPanel();
				this.jPanelAccionesFormularioTipoProducto=new JPanel();
				this.jmenuBarDetalleTipoProducto=new JMenuBar();
				this.jTtoolBarDetalleTipoProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoProducto() {
		return this.jButtonActualizarToolBarTipoProducto;
	}
	
	public JButton getjButtonEliminarToolBarTipoProducto() {
		return this.jButtonEliminarToolBarTipoProducto;
	}
	
	public JButton getjButtonCancelarToolBarTipoProducto() {
		return this.jButtonCancelarToolBarTipoProducto;
	}		
	
	public JButton getjButtonProcesarInformacionTipoProducto() {
		return this.jButtonProcesarInformacionTipoProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoProducto)	{
		this.jButtonProcesarInformacionTipoProducto = jButtonProcesarInformacionTipoProducto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoProducto() {
		return this.jComboBoxTiposAccionesTipoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoProducto(
			JComboBox jComboBoxTiposRelacionesTipoProducto) {
		this.jComboBoxTiposRelacionesTipoProducto = jComboBoxTiposRelacionesTipoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoProducto(
			JComboBox jComboBoxTiposAccionesTipoProducto) {
		this.jComboBoxTiposAccionesTipoProducto = jComboBoxTiposAccionesTipoProducto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoProducto() {
		return this.jComboBoxTiposAccionesFormularioTipoProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoProducto(
			JComboBox jComboBoxTiposAccionesFormularioTipoProducto) {
		this.jComboBoxTiposAccionesFormularioTipoProducto = jComboBoxTiposAccionesFormularioTipoProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoproductoSessionBean=new TipoProductoSessionBean();
		
		this.tipoproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.modeloproductoSessionBean=new ModeloProductoSessionBean();
		//this.materialproductoSessionBean=new MaterialProductoSessionBean();
		//this.marcaproductoSessionBean=new MarcaProductoSessionBean();
		//this.segmentoproductoSessionBean=new SegmentoProductoSessionBean();
		//this.colorproductoSessionBean=new ColorProductoSessionBean();
		//this.efectoproductoSessionBean=new EfectoProductoSessionBean();
		//this.tallaproductoSessionBean=new TallaProductoSessionBean();
		//this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		//this.claseproductoSessionBean=new ClaseProductoSessionBean();
		//this.productoSessionBean=new ProductoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoProducto=new JButtonMe();
				this.jButtonModificarToolBarTipoProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoProducto,this.jTtoolBarDetalleTipoProducto,
							"actualizar","actualizar","Actualizar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoProducto,this.jTtoolBarDetalleTipoProducto,
							"eliminar","eliminar","Eliminar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoProducto,this.jTtoolBarDetalleTipoProducto,
							"cancelar","cancelar","Cancelar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoProducto,this.jTtoolBarDetalleTipoProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoProducto.add(this.jMenuItemDetalleCerrarTipoProducto);
		
		this.jmenuDetalleAccionesTipoProducto.add(this.jMenuItemActualizarTipoProducto);
		this.jmenuDetalleAccionesTipoProducto.add(this.jMenuItemEliminarTipoProducto);
		this.jmenuDetalleAccionesTipoProducto.add(this.jMenuItemCancelarTipoProducto);		
		
		//this.jmenuDetalleDatosTipoProducto.add(this.jMenuItemDetalleAbrirOrderByTipoProducto);				
		this.jmenuDetalleDatosTipoProducto.add(this.jMenuItemDetalleMostarOcultarTipoProducto);				
				
		//this.jmenuDetalleAccionesTipoProducto.add(this.jMenuItemGuardarCambiosTipoProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoProducto.add(this.jmenuDetalleArchivoTipoProducto);		
		this.jmenuBarDetalleTipoProducto.add(this.jmenuDetalleAccionesTipoProducto);		
		this.jmenuBarDetalleTipoProducto.add(this.jmenuDetalleDatosTipoProducto);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoProducto.add(this.jmenuDetalleTipoProducto);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoProducto);				
	}
	
	
	public void inicializarElementosCamposTipoProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoProducto = new JLabelMe();
		jLabelIdTipoProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoProducto.setToolTipText(TipoProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoProducto= new GridBagLayout();

		this.jPanelidTipoProducto.setLayout(this.gridaBagLayoutTipoProducto);

		jLabelidTipoProducto = new JLabel();
		jLabelidTipoProducto.setText("Id");

		jLabelidTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoProducto = new JLabelMe();
		this.jLabelcodigoTipoProducto.setText(""+TipoProductoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoProducto.setToolTipText("Codigo");
		this.jLabelcodigoTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoProducto.setToolTipText(TipoProductoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoProducto = new GridBagLayout();
		this.jPanelcodigoTipoProducto.setLayout(this.gridaBagLayoutTipoProducto);


		jTextFieldcodigoTipoProducto= new JTextFieldMe();

		jTextFieldcodigoTipoProducto.setEnabled(false);
		jTextFieldcodigoTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoProductoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoProductoBusqueda.setText("U");
		this.jButtoncodigoTipoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoProductoBusqueda"));

		if(this.tipoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoProductoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoProducto = new JLabelMe();
		this.jLabelnombreTipoProducto.setText(""+TipoProductoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoProducto.setToolTipText("Nombre");
		this.jLabelnombreTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoProducto.setToolTipText(TipoProductoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoProducto = new GridBagLayout();
		this.jPanelnombreTipoProducto.setLayout(this.gridaBagLayoutTipoProducto);


		jTextAreanombreTipoProducto= new JTextAreaMe();
		jTextAreanombreTipoProducto.setEnabled(false);
		jTextAreanombreTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProducto.setLineWrap(true);
		jTextAreanombreTipoProducto.setWrapStyleWord(true);
		jTextAreanombreTipoProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoProducto.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoProducto = new JScrollPane(jTextAreanombreTipoProducto);
		jscrollPanenombreTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoProductoBusqueda= new JButtonMe();
		this.jButtonnombreTipoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoProductoBusqueda.setText("U");
		this.jButtonnombreTipoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoProductoBusqueda"));

		if(this.tipoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoProductoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTipoProducto = new JLabelMe();
		this.jLabeldescripcionTipoProducto.setText(""+TipoProductoConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionTipoProducto.setToolTipText("Descripcion");
		this.jLabeldescripcionTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTipoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTipoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTipoProducto.setToolTipText(TipoProductoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTipoProducto = new GridBagLayout();
		this.jPaneldescripcionTipoProducto.setLayout(this.gridaBagLayoutTipoProducto);


		jTextAreadescripcionTipoProducto= new JTextAreaMe();
		jTextAreadescripcionTipoProducto.setEnabled(false);
		jTextAreadescripcionTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoProducto.setLineWrap(true);
		jTextAreadescripcionTipoProducto.setWrapStyleWord(true);
		jTextAreadescripcionTipoProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTipoProducto.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTipoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTipoProducto = new JScrollPane(jTextAreadescripcionTipoProducto);
		jscrollPanedescripcionTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionTipoProductoBusqueda= new JButtonMe();
		this.jButtondescripcionTipoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTipoProductoBusqueda.setText("U");
		this.jButtondescripcionTipoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTipoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTipoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTipoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTipoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTipoProductoBusqueda"));

		if(this.tipoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTipoProductoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoProducto = new JLabelMe();
		this.jLabelid_empresaTipoProducto.setText(""+TipoProductoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoProducto.setToolTipText("Empresa");
		this.jLabelid_empresaTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoProducto.setToolTipText(TipoProductoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoProducto = new GridBagLayout();
		this.jPanelid_empresaTipoProducto.setLayout(this.gridaBagLayoutTipoProducto);


		jComboBoxid_empresaTipoProducto= new JComboBoxMe();
		jComboBoxid_empresaTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoProducto.setEnabled(false);

		this.jButtonid_empresaTipoProducto= new JButtonMe();
		this.jButtonid_empresaTipoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoProducto.setText("Buscar");
		this.jButtonid_empresaTipoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoProducto"));

		this.jButtonid_empresaTipoProductoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoProductoBusqueda.setText("U");
		this.jButtonid_empresaTipoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoProductoBusqueda"));

		if(this.tipoproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoProductoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoProductoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoProductoUpdate.setText("U");
		this.jButtonid_empresaTipoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoProductoUpdate"));



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
		//this.jInternalFrameDetalleTipoProducto = new TipoProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoProducto= new GridBagLayout();
		

		
		String sToolTipTipoProducto="";
		sToolTipTipoProducto=TipoProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoProducto+="(Inventario.TipoProducto)";
		}
		
		if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoProducto = new JButtonMe();
		this.jButtonModificarTipoProducto = new JButtonMe();
        this.jButtonActualizarTipoProducto = new JButtonMe();
        this.jButtonEliminarTipoProducto = new JButtonMe();
        this.jButtonCancelarTipoProducto = new JButtonMe();
        this.jButtonGuardarCambiosTipoProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoProducto = new JButtonMe();
		this.jButtonCerrarTipoProducto = new JButtonMe();
		
		this.jScrollPanelDatosTipoProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoProducto = new JScrollPane();
				
		
		
		this.jPanelCamposTipoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Producto";
		
		if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoProducto.setName("jPanelCamposTipoProducto"); 

		this.jPanelCamposOcultosTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoProducto.setName("jPanelCamposOcultosTipoProducto"); 

        this.jPanelAccionesTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoProducto.setToolTipText("Acciones");
        this.jPanelAccionesTipoProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoProducto.setText("Nuevo");
		this.jButtonModificarTipoProducto.setText("Editar");
        this.jButtonActualizarTipoProducto.setText("Actualizar");
        this.jButtonEliminarTipoProducto.setText("Eliminar");
        this.jButtonCancelarTipoProducto.setText("Cancelar");
        this.jButtonGuardarCambiosTipoProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoProducto.setText("Guardar");
		this.jButtonCerrarTipoProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoProducto,"nuevo_button","Nuevo",this.tipoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoProducto,"modificar_button","Editar",this.tipoproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoProducto,"actualizar_button","Actualizar",this.tipoproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoProducto,"eliminar_button","Eliminar",this.tipoproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoProducto,"cancelar_button","Cancelar",this.tipoproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoProducto,"guardarcambios_button","Guardar",this.tipoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoProducto,"guardarcambiostabla_button","Guardar",this.tipoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoProducto,"cerrar_button","Salir",this.tipoproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoProducto.setToolTipText("Nuevo"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoProducto.setToolTipText("Editar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoProducto.setToolTipText("Actualizar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoProducto.setToolTipText("Eliminar)"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoProducto.setToolTipText("Cancelar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoProducto.setToolTipText("Guardar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoProducto.setToolTipText("Guardar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoProducto.setToolTipText("Salir"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoProducto";
		inputMap = this.jButtonNuevoTipoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoProducto";
		inputMap = this.jButtonActualizarTipoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoProducto";
		inputMap = this.jButtonEliminarTipoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoProducto";
		inputMap = this.jButtonCancelarTipoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoProducto"));
		
		//CERRAR		
		sMapKey = "CerrarTipoProducto";
		inputMap = this.jButtonCerrarTipoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoProducto";
		inputMap = this.jButtonGuardarCambiosTablaTipoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoProducto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoProducto.setToolTipText("Nuevo TipoProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoProducto.setToolTipText("Sin Cerrar Ventana TipoProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoProducto.setText("Accion");
		this.jComboBoxTiposAccionesTipoProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoProducto = new JLabelMe();
		
		this.jLabelAccionesTipoProducto.setText("Acciones");		
		this.jLabelAccionesTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoProducto = new GridBagLayout();
		
		this.jPanelCamposTipoProducto.setLayout(gridaBagLayoutCamposTipoProducto);
		this.jPanelCamposOcultosTipoProducto.setLayout(gridaBagLayoutCamposOcultosTipoProducto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoProducto = new GridBagConstraints();
	this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProducto.gridy = 0;
	this.gridBagConstraintsTipoProducto.gridx = 0;
	this.gridBagConstraintsTipoProducto.ipadx = 0;
	this.gridBagConstraintsTipoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoProducto.add(jLabelIdTipoProducto, this.gridBagConstraintsTipoProducto);



	this.gridBagConstraintsTipoProducto = new GridBagConstraints();
	this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProducto.gridy = 0;
	this.gridBagConstraintsTipoProducto.gridx = 1;
	this.gridBagConstraintsTipoProducto.ipadx = 0;
	this.gridBagConstraintsTipoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoProducto.add(jLabelidTipoProducto, this.gridBagConstraintsTipoProducto);


	this.gridBagConstraintsTipoProducto = new GridBagConstraints();
	this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProducto.gridy = 0;
	this.gridBagConstraintsTipoProducto.gridx = 0;
	this.gridBagConstraintsTipoProducto.ipadx = 0;
	this.gridBagConstraintsTipoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoProducto.add(jLabelid_empresaTipoProducto, this.gridBagConstraintsTipoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		//this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProducto.gridy = 0;
		this.gridBagConstraintsTipoProducto.gridx = 2;
		this.gridBagConstraintsTipoProducto.ipadx = 0;
		this.gridBagConstraintsTipoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoProducto.add(jButtonid_empresaTipoProductoBusqueda, this.gridBagConstraintsTipoProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		//this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProducto.gridy = 0;
		this.gridBagConstraintsTipoProducto.gridx = 3;
		this.gridBagConstraintsTipoProducto.ipadx = 0;
		this.gridBagConstraintsTipoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoProducto.add(jButtonid_empresaTipoProductoUpdate, this.gridBagConstraintsTipoProducto);
	}

	this.gridBagConstraintsTipoProducto = new GridBagConstraints();
	this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProducto.gridy = 0;
	this.gridBagConstraintsTipoProducto.gridx = 1;
	this.gridBagConstraintsTipoProducto.ipadx = 0;
	this.gridBagConstraintsTipoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoProducto.add(jComboBoxid_empresaTipoProducto, this.gridBagConstraintsTipoProducto);


	this.gridBagConstraintsTipoProducto = new GridBagConstraints();
	this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProducto.gridy = 0;
	this.gridBagConstraintsTipoProducto.gridx = 0;
	this.gridBagConstraintsTipoProducto.ipadx = 0;
	this.gridBagConstraintsTipoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoProducto.add(jLabelcodigoTipoProducto, this.gridBagConstraintsTipoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		//this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProducto.gridy = 0;
		this.gridBagConstraintsTipoProducto.gridx = 2;
		this.gridBagConstraintsTipoProducto.ipadx = 0;
		this.gridBagConstraintsTipoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoProducto.add(jButtoncodigoTipoProductoBusqueda, this.gridBagConstraintsTipoProducto);
	}

	this.gridBagConstraintsTipoProducto = new GridBagConstraints();
	this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProducto.gridy = 0;
	this.gridBagConstraintsTipoProducto.gridx = 1;
	this.gridBagConstraintsTipoProducto.ipadx = 0;
	this.gridBagConstraintsTipoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoProducto.add(jTextFieldcodigoTipoProducto, this.gridBagConstraintsTipoProducto);


	this.gridBagConstraintsTipoProducto = new GridBagConstraints();
	this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProducto.gridy = 0;
	this.gridBagConstraintsTipoProducto.gridx = 0;
	this.gridBagConstraintsTipoProducto.ipadx = 0;
	this.gridBagConstraintsTipoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoProducto.add(jLabelnombreTipoProducto, this.gridBagConstraintsTipoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		//this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProducto.gridy = 0;
		this.gridBagConstraintsTipoProducto.gridx = 2;
		this.gridBagConstraintsTipoProducto.ipadx = 0;
		this.gridBagConstraintsTipoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoProducto.add(jButtonnombreTipoProductoBusqueda, this.gridBagConstraintsTipoProducto);
	}

	this.gridBagConstraintsTipoProducto = new GridBagConstraints();
	this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProducto.gridy = 0;
	this.gridBagConstraintsTipoProducto.gridx = 1;
	this.gridBagConstraintsTipoProducto.ipadx = 0;
	this.gridBagConstraintsTipoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoProducto.add(jscrollPanenombreTipoProducto, this.gridBagConstraintsTipoProducto);


	this.gridBagConstraintsTipoProducto = new GridBagConstraints();
	this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProducto.gridy = 0;
	this.gridBagConstraintsTipoProducto.gridx = 0;
	this.gridBagConstraintsTipoProducto.ipadx = 0;
	this.gridBagConstraintsTipoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTipoProducto.add(jLabeldescripcionTipoProducto, this.gridBagConstraintsTipoProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		//this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProducto.gridy = 0;
		this.gridBagConstraintsTipoProducto.gridx = 2;
		this.gridBagConstraintsTipoProducto.ipadx = 0;
		this.gridBagConstraintsTipoProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTipoProducto.add(jButtondescripcionTipoProductoBusqueda, this.gridBagConstraintsTipoProducto);
	}

	this.gridBagConstraintsTipoProducto = new GridBagConstraints();
	this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProducto.gridy = 0;
	this.gridBagConstraintsTipoProducto.gridx = 1;
	this.gridBagConstraintsTipoProducto.ipadx = 0;
	this.gridBagConstraintsTipoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTipoProducto.add(jscrollPanedescripcionTipoProducto, this.gridBagConstraintsTipoProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoProducto = new GridBagConstraints();
	this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProducto.gridy = iYPanelCamposTipoProducto;
	this.gridBagConstraintsTipoProducto.gridx = iXPanelCamposTipoProducto++;
	this.gridBagConstraintsTipoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProducto.add(this.jPanelidTipoProducto, this.gridBagConstraintsTipoProducto);



	if(iXPanelCamposTipoProducto % 1==0) {
		iXPanelCamposTipoProducto=0;
		iYPanelCamposTipoProducto++;
	}
	this.gridBagConstraintsTipoProducto = new GridBagConstraints();
	this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProducto.gridy = iYPanelCamposTipoProducto;
	this.gridBagConstraintsTipoProducto.gridx = iXPanelCamposTipoProducto++;
	this.gridBagConstraintsTipoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProducto.add(this.jPanelcodigoTipoProducto, this.gridBagConstraintsTipoProducto);



	if(iXPanelCamposTipoProducto % 1==0) {
		iXPanelCamposTipoProducto=0;
		iYPanelCamposTipoProducto++;
	}
	this.gridBagConstraintsTipoProducto = new GridBagConstraints();
	this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProducto.gridy = iYPanelCamposTipoProducto;
	this.gridBagConstraintsTipoProducto.gridx = iXPanelCamposTipoProducto++;
	this.gridBagConstraintsTipoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProducto.add(this.jPanelnombreTipoProducto, this.gridBagConstraintsTipoProducto);



	if(iXPanelCamposTipoProducto % 1==0) {
		iXPanelCamposTipoProducto=0;
		iYPanelCamposTipoProducto++;
	}
	this.gridBagConstraintsTipoProducto = new GridBagConstraints();
	this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProducto.gridy = iYPanelCamposTipoProducto;
	this.gridBagConstraintsTipoProducto.gridx = iXPanelCamposTipoProducto++;
	this.gridBagConstraintsTipoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProducto.add(this.jPaneldescripcionTipoProducto, this.gridBagConstraintsTipoProducto);



	if(iXPanelCamposTipoProducto % 1==0) {
		iXPanelCamposTipoProducto=0;
		iYPanelCamposTipoProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoProducto = new GridBagConstraints();
	this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProducto.gridy = iYPanelCamposOcultosTipoProducto;
	this.gridBagConstraintsTipoProducto.gridx = iXPanelCamposOcultosTipoProducto++;
	this.gridBagConstraintsTipoProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoProducto.add(this.jPanelid_empresaTipoProducto, this.gridBagConstraintsTipoProducto);



	if(iXPanelCamposOcultosTipoProducto % 1==0) {
		iXPanelCamposOcultosTipoProducto=0;
		iYPanelCamposOcultosTipoProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoProducto= new GridBagLayout();
		this.jPanelAccionesTipoProducto.setLayout(gridaBagLayoutAccionesTipoProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoProducto= new GridBagLayout();
		this.jPanelAccionesFormularioTipoProducto.setLayout(gridaBagLayoutAccionesFormularioTipoProducto);
		
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoProducto.add(this.jComboBoxTiposAccionesFormularioTipoProducto, this.gridBagConstraintsTipoProducto);

		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoProducto.add(this.jCheckBoxPostAccionNuevoTipoProducto, this.gridBagConstraintsTipoProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoProducto.add(this.jCheckBoxPostAccionSinCerrarTipoProducto, this.gridBagConstraintsTipoProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoProducto.add(this.jCheckBoxPostAccionSinMensajeTipoProducto, this.gridBagConstraintsTipoProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProducto.gridy = 0;
		this.gridBagConstraintsTipoProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoProducto.add(this.jButtonModificarTipoProducto, this.gridBagConstraintsTipoProducto);							

		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProducto.gridy = 0;
		this.gridBagConstraintsTipoProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoProducto.add(this.jButtonEliminarTipoProducto, this.gridBagConstraintsTipoProducto);
		
			
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.gridy = 0;		
		this.gridBagConstraintsTipoProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoProducto.add(this.jButtonActualizarTipoProducto, this.gridBagConstraintsTipoProducto);


		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.gridy = 0;		
		this.gridBagConstraintsTipoProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoProducto.add(this.jButtonGuardarCambiosTipoProducto, this.gridBagConstraintsTipoProducto);	
		
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.gridy = 0;		
		this.gridBagConstraintsTipoProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoProducto.add(this.jButtonCancelarTipoProducto, this.gridBagConstraintsTipoProducto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoProducto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();						
			this.gridBagConstraintsTipoProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoProducto.gridx = 0;		
			//this.gridBagConstraintsTipoProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoProducto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoProducto.gridx =0;
		this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoProducto, this.gridBagConstraintsTipoProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoProducto = new TipoProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoProductoModel tipoproductoModel=new TipoProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoProductoModel.TipoProductoFocusTraversalPolicy tipoproductoFocusTraversalPolicy = tipoproductoModel.new TipoProductoFocusTraversalPolicy(this);
			
			//tipoproductoFocusTraversalPolicy.settipoproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoproductoModel);
			
			
			this.jContentPaneDetalleTipoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoProducto = new GridBagLayout();	
			this.jContentPaneDetalleTipoProducto.setLayout(gridaBagLayoutDetalleTipoProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoProducto = new GridBagConstraints();
				this.gridBagConstraintsTipoProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoProducto.gridx = 0;
					
				
				this.jContentPaneDetalleTipoProducto.add(jTtoolBarDetalleTipoProducto, gridBagConstraintsTipoProducto);								
				
}
			
			this.jScrollPanelDatosEdicionTipoProducto=   new JScrollPane(jContentPaneDetalleTipoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoProducto.gridx = 0;
	        
			this.jContentPaneDetalleTipoProducto.add(jPanelCamposTipoProducto, gridBagConstraintsTipoProducto);
			
			
			
			
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
						&& tipoproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameClaseProducto(this.puedeCargarPorParteClaseProducto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameColorProducto(this.puedeCargarPorParteColorProducto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEfectoProducto(this.puedeCargarPorParteEfectoProducto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameMarcaProducto(this.puedeCargarPorParteMarcaProducto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameMaterialProducto(this.puedeCargarPorParteMaterialProducto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameModeloProducto(this.puedeCargarPorParteModeloProducto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(this.puedeCargarPorParteParametroInventarioDefecto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProducto(this.puedeCargarPorParteProducto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSegmentoProducto(this.puedeCargarPorParteSegmentoProducto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTallaProducto(this.puedeCargarPorParteTallaProducto,false,-1);
					
					if(this.tipoproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoProducto= new GridBagConstraints();
						this.gridBagConstraintsTipoProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoProducto.gridx = 0;
						this.jContentPaneDetalleTipoProducto.add(this.jTabbedPaneRelacionesTipoProducto, this.gridBagConstraintsTipoProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoProducto.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameClaseProducto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameColorProducto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEfectoProducto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameMarcaProducto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameMaterialProducto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameModeloProducto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProducto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSegmentoProducto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTallaProducto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoProducto = new GridBagConstraints();
					this.gridBagConstraintsTipoProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoProducto.gridx = 0;
					
				
					this.jContentPaneDetalleTipoProducto.add(jPanelCamposOcultosTipoProducto, gridBagConstraintsTipoProducto);
				
					this.jPanelCamposOcultosTipoProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.gridy = iGridyRelaciones++;//31;		
	        this.gridBagConstraintsTipoProducto.gridx = 0;
	        this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoProducto.add(this.jPanelAccionesFormularioTipoProducto, this.gridBagConstraintsTipoProducto);							
			
			
			
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
	        this.gridBagConstraintsTipoProducto.gridy = iGridyRelaciones;//31;		
	        this.gridBagConstraintsTipoProducto.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoProducto.add(this.jPanelAccionesTipoProducto, this.gridBagConstraintsTipoProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoProducto=   new JScrollPane(this.jPanelCamposTipoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoProducto.gridx = 0;
			this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoProducto, this.gridBagConstraintsTipoProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoProducto, this.gridBagConstraintsTipoProducto);			
			
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoProducto, this.gridBagConstraintsTipoProducto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoProducto, this.gridBagConstraintsTipoProducto);
			
			
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoProducto, this.gridBagConstraintsTipoProducto);
		
			
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoProducto, this.gridBagConstraintsTipoProducto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoProducto;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameClaseProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.claseproductoSessionBean=new ClaseProductoSessionBean();
		this.claseproductoSessionBean.setConGuardarRelaciones(false);
		this.claseproductoSessionBean.setEsGuardarRelacionado(true);

		this.claseproductoBeanSwingJInternalFrame=null;//new ClaseProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.claseproductoBeanSwingJInternalFramePopup=new ClaseProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.claseproductoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.claseproductoSessionBean.getEsGuardarRelacionado()) {

				ClaseProductoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClaseProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.claseproductoSessionBean.setEsGuardarRelacionado(true);

				this.claseproductoBeanSwingJInternalFrame=new ClaseProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.claseproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.claseproductoBeanSwingJInternalFrame.setclaseproductoSessionBean(this.claseproductoSessionBean);

				//this.gridBagConstraintsTipoProducto = new GridBagConstraints();
				//this.gridBagConstraintsTipoProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoProducto.gridx = 0;
				//this.jContentPaneDetalleTipoProducto.add(this.claseproductoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoProducto.add("Clase Productos",this.claseproductoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoProducto.setComponentAt(iIndexTab,this.claseproductoBeanSwingJInternalFrame.getContentPane());
				}

				//ClaseProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.claseproductoSessionBean.setEsGuardarRelacionado(false);
				this.claseproductoBeanSwingJInternalFrame=null;//new ClaseProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.claseproductoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteClaseProducto) {
					this.jTabbedPaneRelacionesTipoProducto.add("Clase Productos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameColorProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.colorproductoSessionBean=new ColorProductoSessionBean();
		this.colorproductoSessionBean.setConGuardarRelaciones(false);
		this.colorproductoSessionBean.setEsGuardarRelacionado(true);

		this.colorproductoBeanSwingJInternalFrame=null;//new ColorProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.colorproductoBeanSwingJInternalFramePopup=new ColorProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.colorproductoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.colorproductoSessionBean.getEsGuardarRelacionado()) {

				ColorProductoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ColorProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.colorproductoSessionBean.setEsGuardarRelacionado(true);

				this.colorproductoBeanSwingJInternalFrame=new ColorProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.colorproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.colorproductoBeanSwingJInternalFrame.setcolorproductoSessionBean(this.colorproductoSessionBean);

				//this.gridBagConstraintsTipoProducto = new GridBagConstraints();
				//this.gridBagConstraintsTipoProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoProducto.gridx = 0;
				//this.jContentPaneDetalleTipoProducto.add(this.colorproductoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoProducto.add("Color Productoes",this.colorproductoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoProducto.setComponentAt(iIndexTab,this.colorproductoBeanSwingJInternalFrame.getContentPane());
				}

				//ColorProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.colorproductoSessionBean.setEsGuardarRelacionado(false);
				this.colorproductoBeanSwingJInternalFrame=null;//new ColorProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.colorproductoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteColorProducto) {
					this.jTabbedPaneRelacionesTipoProducto.add("Color Productoes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEfectoProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.efectoproductoSessionBean=new EfectoProductoSessionBean();
		this.efectoproductoSessionBean.setConGuardarRelaciones(false);
		this.efectoproductoSessionBean.setEsGuardarRelacionado(true);

		this.efectoproductoBeanSwingJInternalFrame=null;//new EfectoProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.efectoproductoBeanSwingJInternalFramePopup=new EfectoProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.efectoproductoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.efectoproductoSessionBean.getEsGuardarRelacionado()) {

				EfectoProductoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				EfectoProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.efectoproductoSessionBean.setEsGuardarRelacionado(true);

				this.efectoproductoBeanSwingJInternalFrame=new EfectoProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.efectoproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.efectoproductoBeanSwingJInternalFrame.setefectoproductoSessionBean(this.efectoproductoSessionBean);

				//this.gridBagConstraintsTipoProducto = new GridBagConstraints();
				//this.gridBagConstraintsTipoProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoProducto.gridx = 0;
				//this.jContentPaneDetalleTipoProducto.add(this.efectoproductoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoProducto.add("Efecto Productos",this.efectoproductoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoProducto.setComponentAt(iIndexTab,this.efectoproductoBeanSwingJInternalFrame.getContentPane());
				}

				//EfectoProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.efectoproductoSessionBean.setEsGuardarRelacionado(false);
				this.efectoproductoBeanSwingJInternalFrame=null;//new EfectoProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEfectoProducto) {
					this.jTabbedPaneRelacionesTipoProducto.add("Efecto Productos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameMarcaProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.marcaproductoSessionBean=new MarcaProductoSessionBean();
		this.marcaproductoSessionBean.setConGuardarRelaciones(false);
		this.marcaproductoSessionBean.setEsGuardarRelacionado(true);

		this.marcaproductoBeanSwingJInternalFrame=null;//new MarcaProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.marcaproductoBeanSwingJInternalFramePopup=new MarcaProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.marcaproductoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.marcaproductoSessionBean.getEsGuardarRelacionado()) {

				MarcaProductoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				MarcaProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.marcaproductoSessionBean.setEsGuardarRelacionado(true);

				this.marcaproductoBeanSwingJInternalFrame=new MarcaProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.marcaproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.marcaproductoBeanSwingJInternalFrame.setmarcaproductoSessionBean(this.marcaproductoSessionBean);

				//this.gridBagConstraintsTipoProducto = new GridBagConstraints();
				//this.gridBagConstraintsTipoProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoProducto.gridx = 0;
				//this.jContentPaneDetalleTipoProducto.add(this.marcaproductoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoProducto.add("Marca Productos",this.marcaproductoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoProducto.setComponentAt(iIndexTab,this.marcaproductoBeanSwingJInternalFrame.getContentPane());
				}

				//MarcaProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.marcaproductoSessionBean.setEsGuardarRelacionado(false);
				this.marcaproductoBeanSwingJInternalFrame=null;//new MarcaProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteMarcaProducto) {
					this.jTabbedPaneRelacionesTipoProducto.add("Marca Productos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameMaterialProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.materialproductoSessionBean=new MaterialProductoSessionBean();
		this.materialproductoSessionBean.setConGuardarRelaciones(false);
		this.materialproductoSessionBean.setEsGuardarRelacionado(true);

		this.materialproductoBeanSwingJInternalFrame=null;//new MaterialProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.materialproductoBeanSwingJInternalFramePopup=new MaterialProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.materialproductoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.materialproductoSessionBean.getEsGuardarRelacionado()) {

				MaterialProductoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				MaterialProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.materialproductoSessionBean.setEsGuardarRelacionado(true);

				this.materialproductoBeanSwingJInternalFrame=new MaterialProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.materialproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.materialproductoBeanSwingJInternalFrame.setmaterialproductoSessionBean(this.materialproductoSessionBean);

				//this.gridBagConstraintsTipoProducto = new GridBagConstraints();
				//this.gridBagConstraintsTipoProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoProducto.gridx = 0;
				//this.jContentPaneDetalleTipoProducto.add(this.materialproductoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoProducto.add("Material Productos",this.materialproductoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoProducto.setComponentAt(iIndexTab,this.materialproductoBeanSwingJInternalFrame.getContentPane());
				}

				//MaterialProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.materialproductoSessionBean.setEsGuardarRelacionado(false);
				this.materialproductoBeanSwingJInternalFrame=null;//new MaterialProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.materialproductoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteMaterialProducto) {
					this.jTabbedPaneRelacionesTipoProducto.add("Material Productos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameModeloProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.modeloproductoSessionBean=new ModeloProductoSessionBean();
		this.modeloproductoSessionBean.setConGuardarRelaciones(false);
		this.modeloproductoSessionBean.setEsGuardarRelacionado(true);

		this.modeloproductoBeanSwingJInternalFrame=null;//new ModeloProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.modeloproductoBeanSwingJInternalFramePopup=new ModeloProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.modeloproductoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.modeloproductoSessionBean.getEsGuardarRelacionado()) {

				ModeloProductoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ModeloProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.modeloproductoSessionBean.setEsGuardarRelacionado(true);

				this.modeloproductoBeanSwingJInternalFrame=new ModeloProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.modeloproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.modeloproductoBeanSwingJInternalFrame.setmodeloproductoSessionBean(this.modeloproductoSessionBean);

				//this.gridBagConstraintsTipoProducto = new GridBagConstraints();
				//this.gridBagConstraintsTipoProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoProducto.gridx = 0;
				//this.jContentPaneDetalleTipoProducto.add(this.modeloproductoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoProducto.add("Modelo Productos",this.modeloproductoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoProducto.setComponentAt(iIndexTab,this.modeloproductoBeanSwingJInternalFrame.getContentPane());
				}

				//ModeloProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.modeloproductoSessionBean.setEsGuardarRelacionado(false);
				this.modeloproductoBeanSwingJInternalFrame=null;//new ModeloProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteModeloProducto) {
					this.jTabbedPaneRelacionesTipoProducto.add("Modelo Productos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		this.parametroinventariodefectoSessionBean.setConGuardarRelaciones(false);
		this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);

		this.parametroinventariodefectoBeanSwingJInternalFrame=null;//new ParametroInventarioDefectoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametroinventariodefectoBeanSwingJInternalFramePopup=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametroinventariodefectoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {

				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametroinventariodefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametroinventariodefectoBeanSwingJInternalFrame.setparametroinventariodefectoSessionBean(this.parametroinventariodefectoSessionBean);

				//this.gridBagConstraintsTipoProducto = new GridBagConstraints();
				//this.gridBagConstraintsTipoProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoProducto.gridx = 0;
				//this.jContentPaneDetalleTipoProducto.add(this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoProducto.add("Parametro Inventario Defectos",this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoProducto.setComponentAt(iIndexTab,this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametroinventariodefectoBeanSwingJInternalFrame=null;//new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroInventarioDefecto) {
					this.jTabbedPaneRelacionesTipoProducto.add("Parametro Inventario Defectos",new JPanel());
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

				ProductoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoSessionBean.setEsGuardarRelacionado(true);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoBeanSwingJInternalFrame.setproductoSessionBean(this.productoSessionBean);

				//this.gridBagConstraintsTipoProducto = new GridBagConstraints();
				//this.gridBagConstraintsTipoProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoProducto.gridx = 0;
				//this.jContentPaneDetalleTipoProducto.add(this.productoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoProducto.add("Productos",this.productoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoProducto.setComponentAt(iIndexTab,this.productoBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoSessionBean.setEsGuardarRelacionado(false);
				this.productoBeanSwingJInternalFrame=null;//new ProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProducto) {
					this.jTabbedPaneRelacionesTipoProducto.add("Productos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameSegmentoProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.segmentoproductoSessionBean=new SegmentoProductoSessionBean();
		this.segmentoproductoSessionBean.setConGuardarRelaciones(false);
		this.segmentoproductoSessionBean.setEsGuardarRelacionado(true);

		this.segmentoproductoBeanSwingJInternalFrame=null;//new SegmentoProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.segmentoproductoBeanSwingJInternalFramePopup=new SegmentoProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.segmentoproductoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {

				SegmentoProductoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				SegmentoProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.segmentoproductoSessionBean.setEsGuardarRelacionado(true);

				this.segmentoproductoBeanSwingJInternalFrame=new SegmentoProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.segmentoproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.segmentoproductoBeanSwingJInternalFrame.setsegmentoproductoSessionBean(this.segmentoproductoSessionBean);

				//this.gridBagConstraintsTipoProducto = new GridBagConstraints();
				//this.gridBagConstraintsTipoProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoProducto.gridx = 0;
				//this.jContentPaneDetalleTipoProducto.add(this.segmentoproductoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoProducto.add("Segmento Productos",this.segmentoproductoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoProducto.setComponentAt(iIndexTab,this.segmentoproductoBeanSwingJInternalFrame.getContentPane());
				}

				//SegmentoProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.segmentoproductoSessionBean.setEsGuardarRelacionado(false);
				this.segmentoproductoBeanSwingJInternalFrame=null;//new SegmentoProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSegmentoProducto) {
					this.jTabbedPaneRelacionesTipoProducto.add("Segmento Productos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTallaProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.tallaproductoSessionBean=new TallaProductoSessionBean();
		this.tallaproductoSessionBean.setConGuardarRelaciones(false);
		this.tallaproductoSessionBean.setEsGuardarRelacionado(true);

		this.tallaproductoBeanSwingJInternalFrame=null;//new TallaProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.tallaproductoBeanSwingJInternalFramePopup=new TallaProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.tallaproductoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.tallaproductoSessionBean.getEsGuardarRelacionado()) {

				TallaProductoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				TallaProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.tallaproductoSessionBean.setEsGuardarRelacionado(true);

				this.tallaproductoBeanSwingJInternalFrame=new TallaProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.tallaproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.tallaproductoBeanSwingJInternalFrame.settallaproductoSessionBean(this.tallaproductoSessionBean);

				//this.gridBagConstraintsTipoProducto = new GridBagConstraints();
				//this.gridBagConstraintsTipoProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoProducto.gridx = 0;
				//this.jContentPaneDetalleTipoProducto.add(this.tallaproductoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoProducto.add("Talla Productos",this.tallaproductoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoProducto.setComponentAt(iIndexTab,this.tallaproductoBeanSwingJInternalFrame.getContentPane());
				}

				//TallaProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.tallaproductoSessionBean.setEsGuardarRelacionado(false);
				this.tallaproductoBeanSwingJInternalFrame=null;//new TallaProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTallaProducto) {
					this.jTabbedPaneRelacionesTipoProducto.add("Talla Productos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarModeloProductoBeanSwingJInternalFrame(List<TipoProducto> tipoproductos,TipoProducto tipoproducto,ModeloProductoBeanSwingJInternalFrame modeloproductoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//modeloproductoBeanSwingJInternalFrame=new ModeloProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					modeloproductoBeanSwingJInternalFrame.getModeloProductoLogic().setConnexion(this.tipoproductoLogic.getConnexion());

					modeloproductoBeanSwingJInternalFrame.settipoproductosForeignKey(tipoproductos);
					modeloproductoBeanSwingJInternalFrame.settipoproductoForeignKey(tipoproducto);
					modeloproductoBeanSwingJInternalFrame.modeloproductoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProducto(true);
					modeloproductoBeanSwingJInternalFrame.modeloproductoSessionBean.setlidTipoProductoActual(tipoproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					modeloproductoBeanSwingJInternalFrame.cargarCombosForeignKeyModeloProducto(modeloproductoBeanSwingJInternalFrame.isCargarCombosDependencia);
					modeloproductoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoProducto(true);
					modeloproductoBeanSwingJInternalFrame.setid_tipo_productoFK_IdTipoProducto(tipoproducto.getId());

					if(!this.conCargarFormDetalle) {
						modeloproductoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					modeloproductoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoProductoForeignKey(tipoproducto,1,false,true,true);
					modeloproductoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					modeloproductoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoProducto");
					modeloproductoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoProducto");
					modeloproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaModeloProducto(true);
					modeloproductoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesModeloProducto("n",modeloproductoBeanSwingJInternalFrame.isGuardarCambiosEnLote, modeloproductoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					modeloproductoBeanSwingJInternalFrame.setAutoscrolls(true);
					modeloproductoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						modeloproductoBeanSwingJInternalFrame.actualizarEstadoPanelsModeloProducto("relacionado");
					} else {
						modeloproductoBeanSwingJInternalFrame.actualizarEstadoPanelsModeloProducto("no_relacionado");
					}

					modeloproductoBeanSwingJInternalFrame.getjButtonRecargarInformacionModeloProducto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarMaterialProductoBeanSwingJInternalFrame(List<TipoProducto> tipoproductos,TipoProducto tipoproducto,MaterialProductoBeanSwingJInternalFrame materialproductoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//materialproductoBeanSwingJInternalFrame=new MaterialProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					materialproductoBeanSwingJInternalFrame.getMaterialProductoLogic().setConnexion(this.tipoproductoLogic.getConnexion());

					materialproductoBeanSwingJInternalFrame.settipoproductosForeignKey(tipoproductos);
					materialproductoBeanSwingJInternalFrame.settipoproductoForeignKey(tipoproducto);
					materialproductoBeanSwingJInternalFrame.materialproductoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProducto(true);
					materialproductoBeanSwingJInternalFrame.materialproductoSessionBean.setlidTipoProductoActual(tipoproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					materialproductoBeanSwingJInternalFrame.cargarCombosForeignKeyMaterialProducto(materialproductoBeanSwingJInternalFrame.isCargarCombosDependencia);
					materialproductoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoProducto(true);
					materialproductoBeanSwingJInternalFrame.setid_tipo_productoFK_IdTipoProducto(tipoproducto.getId());

					if(!this.conCargarFormDetalle) {
						materialproductoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					materialproductoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoProductoForeignKey(tipoproducto,1,false,true,true);
					materialproductoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					materialproductoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoProducto");
					materialproductoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoProducto");
					materialproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaMaterialProducto(true);
					materialproductoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesMaterialProducto("n",materialproductoBeanSwingJInternalFrame.isGuardarCambiosEnLote, materialproductoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					materialproductoBeanSwingJInternalFrame.setAutoscrolls(true);
					materialproductoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						materialproductoBeanSwingJInternalFrame.actualizarEstadoPanelsMaterialProducto("relacionado");
					} else {
						materialproductoBeanSwingJInternalFrame.actualizarEstadoPanelsMaterialProducto("no_relacionado");
					}

					materialproductoBeanSwingJInternalFrame.getjButtonRecargarInformacionMaterialProducto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarMarcaProductoBeanSwingJInternalFrame(List<TipoProducto> tipoproductos,TipoProducto tipoproducto,MarcaProductoBeanSwingJInternalFrame marcaproductoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//marcaproductoBeanSwingJInternalFrame=new MarcaProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					marcaproductoBeanSwingJInternalFrame.getMarcaProductoLogic().setConnexion(this.tipoproductoLogic.getConnexion());

					marcaproductoBeanSwingJInternalFrame.settipoproductosForeignKey(tipoproductos);
					marcaproductoBeanSwingJInternalFrame.settipoproductoForeignKey(tipoproducto);
					marcaproductoBeanSwingJInternalFrame.marcaproductoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProducto(true);
					marcaproductoBeanSwingJInternalFrame.marcaproductoSessionBean.setlidTipoProductoActual(tipoproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					marcaproductoBeanSwingJInternalFrame.cargarCombosForeignKeyMarcaProducto(marcaproductoBeanSwingJInternalFrame.isCargarCombosDependencia);
					marcaproductoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoProducto(true);
					marcaproductoBeanSwingJInternalFrame.setid_tipo_productoFK_IdTipoProducto(tipoproducto.getId());

					if(!this.conCargarFormDetalle) {
						marcaproductoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					marcaproductoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoProductoForeignKey(tipoproducto,1,false,true,true);
					marcaproductoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					marcaproductoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoProducto");
					marcaproductoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoProducto");
					marcaproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaMarcaProducto(true);
					marcaproductoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesMarcaProducto("n",marcaproductoBeanSwingJInternalFrame.isGuardarCambiosEnLote, marcaproductoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					marcaproductoBeanSwingJInternalFrame.setAutoscrolls(true);
					marcaproductoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						marcaproductoBeanSwingJInternalFrame.actualizarEstadoPanelsMarcaProducto("relacionado");
					} else {
						marcaproductoBeanSwingJInternalFrame.actualizarEstadoPanelsMarcaProducto("no_relacionado");
					}

					marcaproductoBeanSwingJInternalFrame.getjButtonRecargarInformacionMarcaProducto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarSegmentoProductoBeanSwingJInternalFrame(List<TipoProducto> tipoproductos,TipoProducto tipoproducto,SegmentoProductoBeanSwingJInternalFrame segmentoproductoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//segmentoproductoBeanSwingJInternalFrame=new SegmentoProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					segmentoproductoBeanSwingJInternalFrame.getSegmentoProductoLogic().setConnexion(this.tipoproductoLogic.getConnexion());

					segmentoproductoBeanSwingJInternalFrame.settipoproductosForeignKey(tipoproductos);
					segmentoproductoBeanSwingJInternalFrame.settipoproductoForeignKey(tipoproducto);
					segmentoproductoBeanSwingJInternalFrame.segmentoproductoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProducto(true);
					segmentoproductoBeanSwingJInternalFrame.segmentoproductoSessionBean.setlidTipoProductoActual(tipoproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					segmentoproductoBeanSwingJInternalFrame.cargarCombosForeignKeySegmentoProducto(segmentoproductoBeanSwingJInternalFrame.isCargarCombosDependencia);
					segmentoproductoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoProducto(true);
					segmentoproductoBeanSwingJInternalFrame.setid_tipo_productoFK_IdTipoProducto(tipoproducto.getId());

					if(!this.conCargarFormDetalle) {
						segmentoproductoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					segmentoproductoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoProductoForeignKey(tipoproducto,1,false,true,true);
					segmentoproductoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					segmentoproductoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoProducto");
					segmentoproductoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoProducto");
					segmentoproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaSegmentoProducto(true);
					segmentoproductoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSegmentoProducto("n",segmentoproductoBeanSwingJInternalFrame.isGuardarCambiosEnLote, segmentoproductoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					segmentoproductoBeanSwingJInternalFrame.setAutoscrolls(true);
					segmentoproductoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						segmentoproductoBeanSwingJInternalFrame.actualizarEstadoPanelsSegmentoProducto("relacionado");
					} else {
						segmentoproductoBeanSwingJInternalFrame.actualizarEstadoPanelsSegmentoProducto("no_relacionado");
					}

					segmentoproductoBeanSwingJInternalFrame.getjButtonRecargarInformacionSegmentoProducto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarColorProductoBeanSwingJInternalFrame(List<TipoProducto> tipoproductos,TipoProducto tipoproducto,ColorProductoBeanSwingJInternalFrame colorproductoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//colorproductoBeanSwingJInternalFrame=new ColorProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					colorproductoBeanSwingJInternalFrame.getColorProductoLogic().setConnexion(this.tipoproductoLogic.getConnexion());

					colorproductoBeanSwingJInternalFrame.settipoproductosForeignKey(tipoproductos);
					colorproductoBeanSwingJInternalFrame.settipoproductoForeignKey(tipoproducto);
					colorproductoBeanSwingJInternalFrame.colorproductoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProducto(true);
					colorproductoBeanSwingJInternalFrame.colorproductoSessionBean.setlidTipoProductoActual(tipoproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					colorproductoBeanSwingJInternalFrame.cargarCombosForeignKeyColorProducto(colorproductoBeanSwingJInternalFrame.isCargarCombosDependencia);
					colorproductoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoProducto(true);
					colorproductoBeanSwingJInternalFrame.setid_tipo_productoFK_IdTipoProducto(tipoproducto.getId());

					if(!this.conCargarFormDetalle) {
						colorproductoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					colorproductoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoProductoForeignKey(tipoproducto,1,false,true,true);
					colorproductoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					colorproductoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoProducto");
					colorproductoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoProducto");
					colorproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaColorProducto(true);
					colorproductoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesColorProducto("n",colorproductoBeanSwingJInternalFrame.isGuardarCambiosEnLote, colorproductoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					colorproductoBeanSwingJInternalFrame.setAutoscrolls(true);
					colorproductoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						colorproductoBeanSwingJInternalFrame.actualizarEstadoPanelsColorProducto("relacionado");
					} else {
						colorproductoBeanSwingJInternalFrame.actualizarEstadoPanelsColorProducto("no_relacionado");
					}

					colorproductoBeanSwingJInternalFrame.getjButtonRecargarInformacionColorProducto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEfectoProductoBeanSwingJInternalFrame(List<TipoProducto> tipoproductos,TipoProducto tipoproducto,EfectoProductoBeanSwingJInternalFrame efectoproductoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//efectoproductoBeanSwingJInternalFrame=new EfectoProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					efectoproductoBeanSwingJInternalFrame.getEfectoProductoLogic().setConnexion(this.tipoproductoLogic.getConnexion());

					efectoproductoBeanSwingJInternalFrame.settipoproductosForeignKey(tipoproductos);
					efectoproductoBeanSwingJInternalFrame.settipoproductoForeignKey(tipoproducto);
					efectoproductoBeanSwingJInternalFrame.efectoproductoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProducto(true);
					efectoproductoBeanSwingJInternalFrame.efectoproductoSessionBean.setlidTipoProductoActual(tipoproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					efectoproductoBeanSwingJInternalFrame.cargarCombosForeignKeyEfectoProducto(efectoproductoBeanSwingJInternalFrame.isCargarCombosDependencia);
					efectoproductoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoProducto(true);
					efectoproductoBeanSwingJInternalFrame.setid_tipo_productoFK_IdTipoProducto(tipoproducto.getId());

					if(!this.conCargarFormDetalle) {
						efectoproductoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					efectoproductoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoProductoForeignKey(tipoproducto,1,false,true,true);
					efectoproductoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					efectoproductoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoProducto");
					efectoproductoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoProducto");
					efectoproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEfectoProducto(true);
					efectoproductoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEfectoProducto("n",efectoproductoBeanSwingJInternalFrame.isGuardarCambiosEnLote, efectoproductoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					efectoproductoBeanSwingJInternalFrame.setAutoscrolls(true);
					efectoproductoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						efectoproductoBeanSwingJInternalFrame.actualizarEstadoPanelsEfectoProducto("relacionado");
					} else {
						efectoproductoBeanSwingJInternalFrame.actualizarEstadoPanelsEfectoProducto("no_relacionado");
					}

					efectoproductoBeanSwingJInternalFrame.getjButtonRecargarInformacionEfectoProducto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarTallaProductoBeanSwingJInternalFrame(List<TipoProducto> tipoproductos,TipoProducto tipoproducto,TallaProductoBeanSwingJInternalFrame tallaproductoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//tallaproductoBeanSwingJInternalFrame=new TallaProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					tallaproductoBeanSwingJInternalFrame.getTallaProductoLogic().setConnexion(this.tipoproductoLogic.getConnexion());

					tallaproductoBeanSwingJInternalFrame.settipoproductosForeignKey(tipoproductos);
					tallaproductoBeanSwingJInternalFrame.settipoproductoForeignKey(tipoproducto);
					tallaproductoBeanSwingJInternalFrame.tallaproductoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProducto(true);
					tallaproductoBeanSwingJInternalFrame.tallaproductoSessionBean.setlidTipoProductoActual(tipoproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					tallaproductoBeanSwingJInternalFrame.cargarCombosForeignKeyTallaProducto(tallaproductoBeanSwingJInternalFrame.isCargarCombosDependencia);
					tallaproductoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoProducto(true);
					tallaproductoBeanSwingJInternalFrame.setid_tipo_productoFK_IdTipoProducto(tipoproducto.getId());

					if(!this.conCargarFormDetalle) {
						tallaproductoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					tallaproductoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoProductoForeignKey(tipoproducto,1,false,true,true);
					tallaproductoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					tallaproductoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoProducto");
					tallaproductoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoProducto");
					tallaproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTallaProducto(true);
					tallaproductoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTallaProducto("n",tallaproductoBeanSwingJInternalFrame.isGuardarCambiosEnLote, tallaproductoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					tallaproductoBeanSwingJInternalFrame.setAutoscrolls(true);
					tallaproductoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						tallaproductoBeanSwingJInternalFrame.actualizarEstadoPanelsTallaProducto("relacionado");
					} else {
						tallaproductoBeanSwingJInternalFrame.actualizarEstadoPanelsTallaProducto("no_relacionado");
					}

					tallaproductoBeanSwingJInternalFrame.getjButtonRecargarInformacionTallaProducto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarParametroInventarioDefectoBeanSwingJInternalFrame(List<TipoProducto> tipoproductos,TipoProducto tipoproducto,ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametroinventariodefectoBeanSwingJInternalFrame.getParametroInventarioDefectoLogic().setConnexion(this.tipoproductoLogic.getConnexion());

					parametroinventariodefectoBeanSwingJInternalFrame.settipoproductosForeignKey(tipoproductos);
					parametroinventariodefectoBeanSwingJInternalFrame.settipoproductoForeignKey(tipoproducto);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProducto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setlidTipoProductoActual(tipoproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametroinventariodefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroInventarioDefecto(parametroinventariodefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametroinventariodefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoProducto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.setid_tipo_productoFK_IdTipoProducto(tipoproducto.getId());

					if(!this.conCargarFormDetalle) {
						parametroinventariodefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametroinventariodefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoProductoForeignKey(tipoproducto,1,false,true,true);
					parametroinventariodefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametroinventariodefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoProducto");
					parametroinventariodefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoProducto");
					parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroInventarioDefecto("n",parametroinventariodefectoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametroinventariodefectoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametroinventariodefectoBeanSwingJInternalFrame.setAutoscrolls(true);
					parametroinventariodefectoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("relacionado");
					} else {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("no_relacionado");
					}

					parametroinventariodefectoBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroInventarioDefecto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarClaseProductoBeanSwingJInternalFrame(List<TipoProducto> tipoproductos,TipoProducto tipoproducto,ClaseProductoBeanSwingJInternalFrame claseproductoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//claseproductoBeanSwingJInternalFrame=new ClaseProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					claseproductoBeanSwingJInternalFrame.getClaseProductoLogic().setConnexion(this.tipoproductoLogic.getConnexion());

					claseproductoBeanSwingJInternalFrame.settipoproductosForeignKey(tipoproductos);
					claseproductoBeanSwingJInternalFrame.settipoproductoForeignKey(tipoproducto);
					claseproductoBeanSwingJInternalFrame.claseproductoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProducto(true);
					claseproductoBeanSwingJInternalFrame.claseproductoSessionBean.setlidTipoProductoActual(tipoproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					claseproductoBeanSwingJInternalFrame.cargarCombosForeignKeyClaseProducto(claseproductoBeanSwingJInternalFrame.isCargarCombosDependencia);
					claseproductoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoProducto(true);
					claseproductoBeanSwingJInternalFrame.setid_tipo_productoFK_IdTipoProducto(tipoproducto.getId());

					if(!this.conCargarFormDetalle) {
						claseproductoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					claseproductoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoProductoForeignKey(tipoproducto,1,false,true,true);
					claseproductoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					claseproductoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoProducto");
					claseproductoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoProducto");
					claseproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaClaseProducto(true);
					claseproductoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesClaseProducto("n",claseproductoBeanSwingJInternalFrame.isGuardarCambiosEnLote, claseproductoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					claseproductoBeanSwingJInternalFrame.setAutoscrolls(true);
					claseproductoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						claseproductoBeanSwingJInternalFrame.actualizarEstadoPanelsClaseProducto("relacionado");
					} else {
						claseproductoBeanSwingJInternalFrame.actualizarEstadoPanelsClaseProducto("no_relacionado");
					}

					claseproductoBeanSwingJInternalFrame.getjButtonRecargarInformacionClaseProducto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProductoBeanSwingJInternalFrame(List<TipoProducto> tipoproductos,TipoProducto tipoproducto,ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.tipoproductoLogic.getConnexion());

					productoBeanSwingJInternalFrame.settipoproductosForeignKey(tipoproductos);
					productoBeanSwingJInternalFrame.settipoproductoForeignKey(tipoproducto);
					productoBeanSwingJInternalFrame.productoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProducto(true);
					productoBeanSwingJInternalFrame.productoSessionBean.setlidTipoProductoActual(tipoproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoBeanSwingJInternalFrame.cargarCombosForeignKeyProducto(productoBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoProducto(true);
					productoBeanSwingJInternalFrame.setid_tipo_productoFK_IdTipoProducto(tipoproducto.getId());

					if(!this.conCargarFormDetalle) {
						productoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoProductoForeignKey(tipoproducto,1,false,true,true);
					productoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoProducto");
					productoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoProducto");
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
