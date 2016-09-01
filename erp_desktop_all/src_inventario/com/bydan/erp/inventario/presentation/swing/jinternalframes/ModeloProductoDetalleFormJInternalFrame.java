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
import com.bydan.erp.inventario.util.ModeloProductoConstantesFunciones;

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
public class ModeloProductoDetalleFormJInternalFrame extends ModeloProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleModeloProducto;
	
	protected JMenuBar jmenuBarDetalleModeloProducto;
	
	protected JMenu jmenuDetalleModeloProducto;
	protected JMenu jmenuDetalleArchivoModeloProducto;
	protected JMenu jmenuDetalleAccionesModeloProducto;
	protected JMenu jmenuDetalleDatosModeloProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleModeloProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutModeloProducto;	
	protected GridBagConstraints gridBagConstraintsModeloProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ModeloProductoBeanSwingJInternalFrameAdditional jInternalFrameDetalleModeloProducto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproducto="";
	
	public ModeloProductoSessionBean modeloproductoSessionBean;
	
	

	public ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame=null;
	public ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProducto=false;
	public ProductoSessionBean productoSessionBean;

	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;
	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroInventarioDefecto=false;
	public ParametroInventarioDefectoSessionBean parametroinventariodefectoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoProductoSessionBean tipoproductoSessionBean;	
	
	public ModeloProductoLogic modeloproductoLogic;
	
	public JScrollPane jScrollPanelDatosModeloProducto;
	public JScrollPane jScrollPanelDatosEdicionModeloProducto;
	public JScrollPane jScrollPanelDatosGeneralModeloProducto;
	
	protected JPanel jPanelCamposModeloProducto;    
	protected JPanel jPanelCamposOcultosModeloProducto;    	
	protected JPanel jPanelAccionesModeloProducto;
	protected JPanel jPanelAccionesFormularioModeloProducto;
    
	
	
	protected Integer iXPanelCamposModeloProducto=0;
	protected Integer iYPanelCamposModeloProducto=0;
	
	protected Integer iXPanelCamposOcultosModeloProducto=0;
	protected Integer iYPanelCamposOcultosModeloProducto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoModeloProducto;
	public JButton jButtonModificarModeloProducto;
	public JButton jButtonActualizarModeloProducto;
    public JButton jButtonEliminarModeloProducto;
	public JButton jButtonCancelarModeloProducto;
    public JButton jButtonGuardarCambiosModeloProducto;
	public JButton jButtonGuardarCambiosTablaModeloProducto;
	protected JButton jButtonCerrarModeloProducto;
	
	
	protected JButton jButtonProcesarInformacionModeloProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoModeloProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarModeloProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeModeloProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarModeloProducto;
	protected JButton jButtonModificarToolBarModeloProducto;
	protected JButton jButtonActualizarToolBarModeloProducto;
    protected JButton jButtonEliminarToolBarModeloProducto;
	protected JButton jButtonCancelarToolBarModeloProducto;
    protected JButton jButtonGuardarCambiosToolBarModeloProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarModeloProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarModeloProducto;
	protected JButton jButtonCerrarToolBarModeloProducto;
	
	protected JButton jButtonProcesarInformacionToolBarModeloProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoModeloProducto;
	protected JMenuItem jMenuItemModificarModeloProducto;
	protected JMenuItem jMenuItemActualizarModeloProducto;
    protected JMenuItem jMenuItemEliminarModeloProducto;
	protected JMenuItem jMenuItemCancelarModeloProducto;
    protected JMenuItem jMenuItemGuardarCambiosModeloProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaModeloProducto;
	protected JMenuItem jMenuItemCerrarModeloProducto;
	protected JMenuItem jMenuItemDetalleCerrarModeloProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarModeloProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionModeloProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosModeloProducto;
	protected JMenuItem jMenuItemMostrarOcultarModeloProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesModeloProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesModeloProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesModeloProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioModeloProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidModeloProducto;
	public JLabel jLabelIdModeloProducto;
	public JLabel jLabelidModeloProducto;
	public JButton jButtonidModeloProductoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoModeloProducto;
	public JLabel jLabelcodigoModeloProducto;
	public JTextField jTextFieldcodigoModeloProducto;
	public JButton jButtoncodigoModeloProductoBusqueda= new JButtonMe();

	public JPanel jPanelnombreModeloProducto;
	public JLabel jLabelnombreModeloProducto;
	public JTextArea jTextAreanombreModeloProducto;
	public JScrollPane jscrollPanenombreModeloProducto;
	public JButton jButtonnombreModeloProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaModeloProducto;
	public JLabel jLabelid_empresaModeloProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaModeloProducto;
	public JButton jButtonid_empresaModeloProducto= new JButtonMe();
	public JButton jButtonid_empresaModeloProductoUpdate= new JButtonMe();
	public JButton jButtonid_empresaModeloProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_productoModeloProducto;
	public JLabel jLabelid_tipo_productoModeloProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_productoModeloProducto;
	public JButton jButtonid_tipo_productoModeloProducto= new JButtonMe();
	public JButton jButtonid_tipo_productoModeloProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_productoModeloProductoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesModeloProducto;
	
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
	
	public ModeloProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposModeloProducto=new JPanel();
				this.jPanelAccionesFormularioModeloProducto=new JPanel();
				this.jmenuBarDetalleModeloProducto=new JMenuBar();
				this.jTtoolBarDetalleModeloProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ModeloProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ModeloProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ModeloProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ModeloProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ModeloProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ModeloProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ModeloProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ModeloProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ModeloProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ModeloProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarModeloProducto() {
		return this.jButtonActualizarToolBarModeloProducto;
	}
	
	public JButton getjButtonEliminarToolBarModeloProducto() {
		return this.jButtonEliminarToolBarModeloProducto;
	}
	
	public JButton getjButtonCancelarToolBarModeloProducto() {
		return this.jButtonCancelarToolBarModeloProducto;
	}		
	
	public JButton getjButtonProcesarInformacionModeloProducto() {
		return this.jButtonProcesarInformacionModeloProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionModeloProducto)	{
		this.jButtonProcesarInformacionModeloProducto = jButtonProcesarInformacionModeloProducto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesModeloProducto() {
		return this.jComboBoxTiposAccionesModeloProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesModeloProducto(
			JComboBox jComboBoxTiposRelacionesModeloProducto) {
		this.jComboBoxTiposRelacionesModeloProducto = jComboBoxTiposRelacionesModeloProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesModeloProducto(
			JComboBox jComboBoxTiposAccionesModeloProducto) {
		this.jComboBoxTiposAccionesModeloProducto = jComboBoxTiposAccionesModeloProducto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioModeloProducto() {
		return this.jComboBoxTiposAccionesFormularioModeloProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioModeloProducto(
			JComboBox jComboBoxTiposAccionesFormularioModeloProducto) {
		this.jComboBoxTiposAccionesFormularioModeloProducto = jComboBoxTiposAccionesFormularioModeloProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.modeloproductoSessionBean=new ModeloProductoSessionBean();
		
		this.modeloproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.modeloproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.modeloproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.productoSessionBean=new ProductoSessionBean();
		//this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ModeloProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ModeloProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ModeloProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Modelo Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
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
	
		ModeloProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleModeloProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarModeloProducto=new JButtonMe();
				this.jButtonModificarToolBarModeloProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarModeloProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarModeloProducto,this.jTtoolBarDetalleModeloProducto,
							"actualizar","actualizar","Actualizar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarModeloProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarModeloProducto,this.jTtoolBarDetalleModeloProducto,
							"eliminar","eliminar","Eliminar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarModeloProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarModeloProducto,this.jTtoolBarDetalleModeloProducto,
							"cancelar","cancelar","Cancelar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarModeloProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarModeloProducto,this.jTtoolBarDetalleModeloProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarModeloProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarModeloProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarModeloProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleModeloProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleModeloProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoModeloProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesModeloProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosModeloProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoModeloProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoModeloProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoModeloProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarModeloProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarModeloProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarModeloProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarModeloProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarModeloProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarModeloProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarModeloProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarModeloProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarModeloProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarModeloProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarModeloProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarModeloProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosModeloProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosModeloProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosModeloProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarModeloProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarModeloProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarModeloProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarModeloProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarModeloProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarModeloProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarModeloProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarModeloProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarModeloProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarModeloProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarModeloProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarModeloProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoModeloProducto.add(this.jMenuItemDetalleCerrarModeloProducto);
		
		this.jmenuDetalleAccionesModeloProducto.add(this.jMenuItemActualizarModeloProducto);
		this.jmenuDetalleAccionesModeloProducto.add(this.jMenuItemEliminarModeloProducto);
		this.jmenuDetalleAccionesModeloProducto.add(this.jMenuItemCancelarModeloProducto);		
		
		//this.jmenuDetalleDatosModeloProducto.add(this.jMenuItemDetalleAbrirOrderByModeloProducto);				
		this.jmenuDetalleDatosModeloProducto.add(this.jMenuItemDetalleMostarOcultarModeloProducto);				
				
		//this.jmenuDetalleAccionesModeloProducto.add(this.jMenuItemGuardarCambiosModeloProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleModeloProducto.add(this.jmenuDetalleArchivoModeloProducto);		
		this.jmenuBarDetalleModeloProducto.add(this.jmenuDetalleAccionesModeloProducto);		
		this.jmenuBarDetalleModeloProducto.add(this.jmenuDetalleDatosModeloProducto);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleModeloProducto.add(this.jmenuDetalleModeloProducto);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleModeloProducto);				
	}
	
	
	public void inicializarElementosCamposModeloProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdModeloProducto = new JLabelMe();
		jLabelIdModeloProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdModeloProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidModeloProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidModeloProducto.setToolTipText(ModeloProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutModeloProducto= new GridBagLayout();

		this.jPanelidModeloProducto.setLayout(this.gridaBagLayoutModeloProducto);

		jLabelidModeloProducto = new JLabel();
		jLabelidModeloProducto.setText("Id");

		jLabelidModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoModeloProducto = new JLabelMe();
		this.jLabelcodigoModeloProducto.setText(""+ModeloProductoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoModeloProducto.setToolTipText("Codigo");
		this.jLabelcodigoModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoModeloProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoModeloProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoModeloProducto.setToolTipText(ModeloProductoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutModeloProducto = new GridBagLayout();
		this.jPanelcodigoModeloProducto.setLayout(this.gridaBagLayoutModeloProducto);


		jTextFieldcodigoModeloProducto= new JTextFieldMe();

		jTextFieldcodigoModeloProducto.setEnabled(false);
		jTextFieldcodigoModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoModeloProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoModeloProductoBusqueda= new JButtonMe();
		this.jButtoncodigoModeloProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoModeloProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoModeloProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoModeloProductoBusqueda.setText("U");
		this.jButtoncodigoModeloProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoModeloProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoModeloProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoModeloProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoModeloProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoModeloProductoBusqueda"));

		if(this.modeloproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoModeloProductoBusqueda.setVisible(false);		}


					
		this.jLabelnombreModeloProducto = new JLabelMe();
		this.jLabelnombreModeloProducto.setText(""+ModeloProductoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreModeloProducto.setToolTipText("Nombre");
		this.jLabelnombreModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreModeloProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreModeloProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreModeloProducto.setToolTipText(ModeloProductoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutModeloProducto = new GridBagLayout();
		this.jPanelnombreModeloProducto.setLayout(this.gridaBagLayoutModeloProducto);


		jTextAreanombreModeloProducto= new JTextAreaMe();
		jTextAreanombreModeloProducto.setEnabled(false);
		jTextAreanombreModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreModeloProducto.setLineWrap(true);
		jTextAreanombreModeloProducto.setWrapStyleWord(true);
		jTextAreanombreModeloProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreModeloProducto.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreModeloProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreModeloProducto = new JScrollPane(jTextAreanombreModeloProducto);
		jscrollPanenombreModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreModeloProductoBusqueda= new JButtonMe();
		this.jButtonnombreModeloProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreModeloProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreModeloProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreModeloProductoBusqueda.setText("U");
		this.jButtonnombreModeloProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreModeloProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreModeloProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreModeloProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreModeloProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreModeloProductoBusqueda"));

		if(this.modeloproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreModeloProductoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysModeloProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaModeloProducto = new JLabelMe();
		this.jLabelid_empresaModeloProducto.setText(""+ModeloProductoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaModeloProducto.setToolTipText("Empresa");
		this.jLabelid_empresaModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaModeloProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaModeloProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaModeloProducto.setToolTipText(ModeloProductoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutModeloProducto = new GridBagLayout();
		this.jPanelid_empresaModeloProducto.setLayout(this.gridaBagLayoutModeloProducto);


		jComboBoxid_empresaModeloProducto= new JComboBoxMe();
		jComboBoxid_empresaModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaModeloProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaModeloProducto.setEnabled(false);

		this.jButtonid_empresaModeloProducto= new JButtonMe();
		this.jButtonid_empresaModeloProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaModeloProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaModeloProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaModeloProducto.setText("Buscar");
		this.jButtonid_empresaModeloProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaModeloProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaModeloProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaModeloProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaModeloProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaModeloProducto"));

		this.jButtonid_empresaModeloProductoBusqueda= new JButtonMe();
		this.jButtonid_empresaModeloProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaModeloProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaModeloProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaModeloProductoBusqueda.setText("U");
		this.jButtonid_empresaModeloProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaModeloProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaModeloProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaModeloProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaModeloProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaModeloProductoBusqueda"));

		if(this.modeloproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaModeloProductoBusqueda.setVisible(false);		}

		this.jButtonid_empresaModeloProductoUpdate= new JButtonMe();
		this.jButtonid_empresaModeloProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaModeloProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaModeloProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaModeloProductoUpdate.setText("U");
		this.jButtonid_empresaModeloProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaModeloProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaModeloProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaModeloProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaModeloProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaModeloProductoUpdate"));



					
		this.jLabelid_tipo_productoModeloProducto = new JLabelMe();
		this.jLabelid_tipo_productoModeloProducto.setText(""+ModeloProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO+" : *");
		this.jLabelid_tipo_productoModeloProducto.setToolTipText("Tipo Producto");
		this.jLabelid_tipo_productoModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_productoModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_productoModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_productoModeloProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_productoModeloProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_productoModeloProducto.setToolTipText(ModeloProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
		this.gridaBagLayoutModeloProducto = new GridBagLayout();
		this.jPanelid_tipo_productoModeloProducto.setLayout(this.gridaBagLayoutModeloProducto);


		jComboBoxid_tipo_productoModeloProducto= new JComboBoxMe();
		jComboBoxid_tipo_productoModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_productoModeloProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_productoModeloProducto= new JButtonMe();
		this.jButtonid_tipo_productoModeloProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoModeloProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoModeloProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoModeloProducto.setText("Buscar");
		this.jButtonid_tipo_productoModeloProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_productoModeloProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoModeloProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_productoModeloProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoModeloProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoModeloProducto"));

		this.jButtonid_tipo_productoModeloProductoBusqueda= new JButtonMe();
		this.jButtonid_tipo_productoModeloProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoModeloProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoModeloProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_productoModeloProductoBusqueda.setText("U");
		this.jButtonid_tipo_productoModeloProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_productoModeloProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoModeloProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_productoModeloProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoModeloProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoModeloProductoBusqueda"));

		if(this.modeloproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_productoModeloProductoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_productoModeloProductoUpdate= new JButtonMe();
		this.jButtonid_tipo_productoModeloProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoModeloProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoModeloProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_productoModeloProductoUpdate.setText("U");
		this.jButtonid_tipo_productoModeloProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_productoModeloProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoModeloProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_productoModeloProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoModeloProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoModeloProductoUpdate"));



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
		//this.jInternalFrameDetalleModeloProducto = new ModeloProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Modelo Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutModeloProducto= new GridBagLayout();
		

		
		String sToolTipModeloProducto="";
		sToolTipModeloProducto=ModeloProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipModeloProducto+="(Inventario.ModeloProducto)";
		}
		
		if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipModeloProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoModeloProducto = new JButtonMe();
		this.jButtonModificarModeloProducto = new JButtonMe();
        this.jButtonActualizarModeloProducto = new JButtonMe();
        this.jButtonEliminarModeloProducto = new JButtonMe();
        this.jButtonCancelarModeloProducto = new JButtonMe();
        this.jButtonGuardarCambiosModeloProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaModeloProducto = new JButtonMe();
		this.jButtonCerrarModeloProducto = new JButtonMe();
		
		this.jScrollPanelDatosModeloProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionModeloProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralModeloProducto = new JScrollPane();
				
		
		
		this.jPanelCamposModeloProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosModeloProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesModeloProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioModeloProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Modelo Producto";
		
		if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosModeloProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Modelo Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosModeloProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionModeloProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralModeloProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposModeloProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposModeloProducto.setName("jPanelCamposModeloProducto"); 

		this.jPanelCamposOcultosModeloProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosModeloProducto.setName("jPanelCamposOcultosModeloProducto"); 

        this.jPanelAccionesModeloProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesModeloProducto.setToolTipText("Acciones");
        this.jPanelAccionesModeloProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioModeloProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioModeloProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioModeloProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionModeloProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralModeloProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosModeloProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposModeloProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosModeloProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioModeloProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoModeloProducto.setText("Nuevo");
		this.jButtonModificarModeloProducto.setText("Editar");
        this.jButtonActualizarModeloProducto.setText("Actualizar");
        this.jButtonEliminarModeloProducto.setText("Eliminar");
        this.jButtonCancelarModeloProducto.setText("Cancelar");
        this.jButtonGuardarCambiosModeloProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaModeloProducto.setText("Guardar");
		this.jButtonCerrarModeloProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoModeloProducto,"nuevo_button","Nuevo",this.modeloproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarModeloProducto,"modificar_button","Editar",this.modeloproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarModeloProducto,"actualizar_button","Actualizar",this.modeloproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarModeloProducto,"eliminar_button","Eliminar",this.modeloproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarModeloProducto,"cancelar_button","Cancelar",this.modeloproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosModeloProducto,"guardarcambios_button","Guardar",this.modeloproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaModeloProducto,"guardarcambiostabla_button","Guardar",this.modeloproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarModeloProducto,"cerrar_button","Salir",this.modeloproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarModeloProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarModeloProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarModeloProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoModeloProducto.setToolTipText("Nuevo"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarModeloProducto.setToolTipText("Editar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarModeloProducto.setToolTipText("Actualizar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarModeloProducto.setToolTipText("Eliminar)"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarModeloProducto.setToolTipText("Cancelar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosModeloProducto.setToolTipText("Guardar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaModeloProducto.setToolTipText("Guardar"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarModeloProducto.setToolTipText("Salir"+" "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoModeloProducto";
		inputMap = this.jButtonNuevoModeloProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoModeloProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoModeloProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarModeloProducto";
		inputMap = this.jButtonActualizarModeloProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarModeloProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarModeloProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarModeloProducto";
		inputMap = this.jButtonEliminarModeloProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarModeloProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarModeloProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarModeloProducto";
		inputMap = this.jButtonCancelarModeloProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarModeloProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarModeloProducto"));
		
		//CERRAR		
		sMapKey = "CerrarModeloProducto";
		inputMap = this.jButtonCerrarModeloProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarModeloProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarModeloProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaModeloProducto";
		inputMap = this.jButtonGuardarCambiosTablaModeloProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaModeloProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaModeloProducto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoModeloProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoModeloProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoModeloProducto.setToolTipText("Nuevo ModeloProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoModeloProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarModeloProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarModeloProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarModeloProducto.setToolTipText("Sin Cerrar Ventana ModeloProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarModeloProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeModeloProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeModeloProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeModeloProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeModeloProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesModeloProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesModeloProducto.setText("Accion");
		this.jComboBoxTiposAccionesModeloProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioModeloProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioModeloProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioModeloProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesModeloProducto = new JLabelMe();
		
		this.jLabelAccionesModeloProducto.setText("Acciones");		
		this.jLabelAccionesModeloProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesModeloProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesModeloProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposModeloProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysModeloProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesModeloProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesModeloProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesModeloProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesModeloProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesModeloProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesModeloProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesModeloProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioModeloProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioModeloProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioModeloProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioModeloProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposModeloProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosModeloProducto = new GridBagLayout();
		
		this.jPanelCamposModeloProducto.setLayout(gridaBagLayoutCamposModeloProducto);
		this.jPanelCamposOcultosModeloProducto.setLayout(gridaBagLayoutCamposOcultosModeloProducto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsModeloProducto = new GridBagConstraints();
	this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModeloProducto.gridy = 0;
	this.gridBagConstraintsModeloProducto.gridx = 0;
	this.gridBagConstraintsModeloProducto.ipadx = 0;
	this.gridBagConstraintsModeloProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidModeloProducto.add(jLabelIdModeloProducto, this.gridBagConstraintsModeloProducto);



	this.gridBagConstraintsModeloProducto = new GridBagConstraints();
	this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModeloProducto.gridy = 0;
	this.gridBagConstraintsModeloProducto.gridx = 1;
	this.gridBagConstraintsModeloProducto.ipadx = 0;
	this.gridBagConstraintsModeloProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidModeloProducto.add(jLabelidModeloProducto, this.gridBagConstraintsModeloProducto);


	this.gridBagConstraintsModeloProducto = new GridBagConstraints();
	this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModeloProducto.gridy = 0;
	this.gridBagConstraintsModeloProducto.gridx = 0;
	this.gridBagConstraintsModeloProducto.ipadx = 0;
	this.gridBagConstraintsModeloProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaModeloProducto.add(jLabelid_empresaModeloProducto, this.gridBagConstraintsModeloProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		//this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModeloProducto.gridy = 0;
		this.gridBagConstraintsModeloProducto.gridx = 2;
		this.gridBagConstraintsModeloProducto.ipadx = 0;
		this.gridBagConstraintsModeloProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaModeloProducto.add(jButtonid_empresaModeloProductoBusqueda, this.gridBagConstraintsModeloProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		//this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModeloProducto.gridy = 0;
		this.gridBagConstraintsModeloProducto.gridx = 3;
		this.gridBagConstraintsModeloProducto.ipadx = 0;
		this.gridBagConstraintsModeloProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaModeloProducto.add(jButtonid_empresaModeloProductoUpdate, this.gridBagConstraintsModeloProducto);
	}

	this.gridBagConstraintsModeloProducto = new GridBagConstraints();
	this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModeloProducto.gridy = 0;
	this.gridBagConstraintsModeloProducto.gridx = 1;
	this.gridBagConstraintsModeloProducto.ipadx = 0;
	this.gridBagConstraintsModeloProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaModeloProducto.add(jComboBoxid_empresaModeloProducto, this.gridBagConstraintsModeloProducto);


	this.gridBagConstraintsModeloProducto = new GridBagConstraints();
	this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModeloProducto.gridy = 0;
	this.gridBagConstraintsModeloProducto.gridx = 0;
	this.gridBagConstraintsModeloProducto.ipadx = 0;
	this.gridBagConstraintsModeloProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_productoModeloProducto.add(jLabelid_tipo_productoModeloProducto, this.gridBagConstraintsModeloProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		//this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModeloProducto.gridy = 0;
		this.gridBagConstraintsModeloProducto.gridx = 2;
		this.gridBagConstraintsModeloProducto.ipadx = 0;
		this.gridBagConstraintsModeloProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_productoModeloProducto.add(jButtonid_tipo_productoModeloProductoBusqueda, this.gridBagConstraintsModeloProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		//this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModeloProducto.gridy = 0;
		this.gridBagConstraintsModeloProducto.gridx = 3;
		this.gridBagConstraintsModeloProducto.ipadx = 0;
		this.gridBagConstraintsModeloProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_productoModeloProducto.add(jButtonid_tipo_productoModeloProductoUpdate, this.gridBagConstraintsModeloProducto);
	}

	this.gridBagConstraintsModeloProducto = new GridBagConstraints();
	this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModeloProducto.gridy = 0;
	this.gridBagConstraintsModeloProducto.gridx = 1;
	this.gridBagConstraintsModeloProducto.ipadx = 0;
	this.gridBagConstraintsModeloProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_productoModeloProducto.add(jComboBoxid_tipo_productoModeloProducto, this.gridBagConstraintsModeloProducto);


	this.gridBagConstraintsModeloProducto = new GridBagConstraints();
	this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModeloProducto.gridy = 0;
	this.gridBagConstraintsModeloProducto.gridx = 0;
	this.gridBagConstraintsModeloProducto.ipadx = 0;
	this.gridBagConstraintsModeloProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoModeloProducto.add(jLabelcodigoModeloProducto, this.gridBagConstraintsModeloProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		//this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModeloProducto.gridy = 0;
		this.gridBagConstraintsModeloProducto.gridx = 2;
		this.gridBagConstraintsModeloProducto.ipadx = 0;
		this.gridBagConstraintsModeloProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoModeloProducto.add(jButtoncodigoModeloProductoBusqueda, this.gridBagConstraintsModeloProducto);
	}

	this.gridBagConstraintsModeloProducto = new GridBagConstraints();
	this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModeloProducto.gridy = 0;
	this.gridBagConstraintsModeloProducto.gridx = 1;
	this.gridBagConstraintsModeloProducto.ipadx = 0;
	this.gridBagConstraintsModeloProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoModeloProducto.add(jTextFieldcodigoModeloProducto, this.gridBagConstraintsModeloProducto);


	this.gridBagConstraintsModeloProducto = new GridBagConstraints();
	this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModeloProducto.gridy = 0;
	this.gridBagConstraintsModeloProducto.gridx = 0;
	this.gridBagConstraintsModeloProducto.ipadx = 0;
	this.gridBagConstraintsModeloProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreModeloProducto.add(jLabelnombreModeloProducto, this.gridBagConstraintsModeloProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		//this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModeloProducto.gridy = 0;
		this.gridBagConstraintsModeloProducto.gridx = 2;
		this.gridBagConstraintsModeloProducto.ipadx = 0;
		this.gridBagConstraintsModeloProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreModeloProducto.add(jButtonnombreModeloProductoBusqueda, this.gridBagConstraintsModeloProducto);
	}

	this.gridBagConstraintsModeloProducto = new GridBagConstraints();
	this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModeloProducto.gridy = 0;
	this.gridBagConstraintsModeloProducto.gridx = 1;
	this.gridBagConstraintsModeloProducto.ipadx = 0;
	this.gridBagConstraintsModeloProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreModeloProducto.add(jscrollPanenombreModeloProducto, this.gridBagConstraintsModeloProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsModeloProducto = new GridBagConstraints();
	this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModeloProducto.gridy = iYPanelCamposModeloProducto;
	this.gridBagConstraintsModeloProducto.gridx = iXPanelCamposModeloProducto++;
	this.gridBagConstraintsModeloProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModeloProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModeloProducto.add(this.jPanelidModeloProducto, this.gridBagConstraintsModeloProducto);



	if(iXPanelCamposModeloProducto % 1==0) {
		iXPanelCamposModeloProducto=0;
		iYPanelCamposModeloProducto++;
	}
	this.gridBagConstraintsModeloProducto = new GridBagConstraints();
	this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModeloProducto.gridy = iYPanelCamposModeloProducto;
	this.gridBagConstraintsModeloProducto.gridx = iXPanelCamposModeloProducto++;
	this.gridBagConstraintsModeloProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModeloProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModeloProducto.add(this.jPanelid_tipo_productoModeloProducto, this.gridBagConstraintsModeloProducto);



	if(iXPanelCamposModeloProducto % 1==0) {
		iXPanelCamposModeloProducto=0;
		iYPanelCamposModeloProducto++;
	}
	this.gridBagConstraintsModeloProducto = new GridBagConstraints();
	this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModeloProducto.gridy = iYPanelCamposModeloProducto;
	this.gridBagConstraintsModeloProducto.gridx = iXPanelCamposModeloProducto++;
	this.gridBagConstraintsModeloProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModeloProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModeloProducto.add(this.jPanelcodigoModeloProducto, this.gridBagConstraintsModeloProducto);



	if(iXPanelCamposModeloProducto % 1==0) {
		iXPanelCamposModeloProducto=0;
		iYPanelCamposModeloProducto++;
	}
	this.gridBagConstraintsModeloProducto = new GridBagConstraints();
	this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModeloProducto.gridy = iYPanelCamposModeloProducto;
	this.gridBagConstraintsModeloProducto.gridx = iXPanelCamposModeloProducto++;
	this.gridBagConstraintsModeloProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModeloProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModeloProducto.add(this.jPanelnombreModeloProducto, this.gridBagConstraintsModeloProducto);



	if(iXPanelCamposModeloProducto % 1==0) {
		iXPanelCamposModeloProducto=0;
		iYPanelCamposModeloProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsModeloProducto = new GridBagConstraints();
	this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModeloProducto.gridy = iYPanelCamposOcultosModeloProducto;
	this.gridBagConstraintsModeloProducto.gridx = iXPanelCamposOcultosModeloProducto++;
	this.gridBagConstraintsModeloProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModeloProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosModeloProducto.add(this.jPanelid_empresaModeloProducto, this.gridBagConstraintsModeloProducto);



	if(iXPanelCamposOcultosModeloProducto % 1==0) {
		iXPanelCamposOcultosModeloProducto=0;
		iYPanelCamposOcultosModeloProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesModeloProducto= new GridBagLayout();
		this.jPanelAccionesModeloProducto.setLayout(gridaBagLayoutAccionesModeloProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioModeloProducto= new GridBagLayout();
		this.jPanelAccionesFormularioModeloProducto.setLayout(gridaBagLayoutAccionesFormularioModeloProducto);
		
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsModeloProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioModeloProducto.add(this.jComboBoxTiposAccionesFormularioModeloProducto, this.gridBagConstraintsModeloProducto);

		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsModeloProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioModeloProducto.add(this.jCheckBoxPostAccionNuevoModeloProducto, this.gridBagConstraintsModeloProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.modeloproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsModeloProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioModeloProducto.add(this.jCheckBoxPostAccionSinCerrarModeloProducto, this.gridBagConstraintsModeloProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.modeloproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsModeloProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioModeloProducto.add(this.jCheckBoxPostAccionSinMensajeModeloProducto, this.gridBagConstraintsModeloProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModeloProducto.gridy = 0;
		this.gridBagConstraintsModeloProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesModeloProducto.add(this.jButtonModificarModeloProducto, this.gridBagConstraintsModeloProducto);							

		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModeloProducto.gridy = 0;
		this.gridBagConstraintsModeloProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesModeloProducto.add(this.jButtonEliminarModeloProducto, this.gridBagConstraintsModeloProducto);
		
			
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.gridy = 0;		
		this.gridBagConstraintsModeloProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesModeloProducto.add(this.jButtonActualizarModeloProducto, this.gridBagConstraintsModeloProducto);


		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.gridy = 0;		
		this.gridBagConstraintsModeloProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesModeloProducto.add(this.jButtonGuardarCambiosModeloProducto, this.gridBagConstraintsModeloProducto);	
		
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.gridy = 0;		
		this.gridBagConstraintsModeloProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesModeloProducto.add(this.jButtonCancelarModeloProducto, this.gridBagConstraintsModeloProducto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutModeloProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutModeloProducto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.modeloproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();						
			this.gridBagConstraintsModeloProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsModeloProducto.gridx = 0;		
			//this.gridBagConstraintsModeloProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsModeloProducto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsModeloProducto.gridx =0;
		this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsModeloProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosModeloProducto, this.gridBagConstraintsModeloProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ModeloProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleModeloProducto = new ModeloProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Modelo Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Modelo Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Modelo Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ModeloProductoModel modeloproductoModel=new ModeloProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//ModeloProductoModel.ModeloProductoFocusTraversalPolicy modeloproductoFocusTraversalPolicy = modeloproductoModel.new ModeloProductoFocusTraversalPolicy(this);
			
			//modeloproductoFocusTraversalPolicy.setmodeloproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(modeloproductoModel);
			
			
			this.jContentPaneDetalleModeloProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleModeloProducto = new GridBagLayout();	
			this.jContentPaneDetalleModeloProducto.setLayout(gridaBagLayoutDetalleModeloProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosModeloProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsModeloProducto = new GridBagConstraints();
				this.gridBagConstraintsModeloProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsModeloProducto.gridx = 0;
					
				
				this.jContentPaneDetalleModeloProducto.add(jTtoolBarDetalleModeloProducto, gridBagConstraintsModeloProducto);								
				
}
			
			this.jScrollPanelDatosEdicionModeloProducto=   new JScrollPane(jContentPaneDetalleModeloProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionModeloProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionModeloProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionModeloProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralModeloProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralModeloProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralModeloProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralModeloProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsModeloProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsModeloProducto.gridx = 0;
	        
			this.jContentPaneDetalleModeloProducto.add(jPanelCamposModeloProducto, gridBagConstraintsModeloProducto);
			
			
			
			
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
						&& modeloproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(this.puedeCargarPorParteParametroInventarioDefecto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProducto(this.puedeCargarPorParteProducto,false,-1);
					
					if(this.modeloproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsModeloProducto= new GridBagConstraints();
						this.gridBagConstraintsModeloProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsModeloProducto.gridx = 0;
						this.jContentPaneDetalleModeloProducto.add(this.jTabbedPaneRelacionesModeloProducto, this.gridBagConstraintsModeloProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesModeloProducto.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProducto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosModeloProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsModeloProducto = new GridBagConstraints();
					this.gridBagConstraintsModeloProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsModeloProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsModeloProducto.gridx = 0;
					
				
					this.jContentPaneDetalleModeloProducto.add(jPanelCamposOcultosModeloProducto, gridBagConstraintsModeloProducto);
				
					this.jPanelCamposOcultosModeloProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsModeloProducto.gridx = 0;
	        this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleModeloProducto.add(this.jPanelAccionesFormularioModeloProducto, this.gridBagConstraintsModeloProducto);							
			
			
			
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
	        this.gridBagConstraintsModeloProducto.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsModeloProducto.gridx = 0;
	        
			
			this.jContentPaneDetalleModeloProducto.add(this.jPanelAccionesModeloProducto, this.gridBagConstraintsModeloProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionModeloProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionModeloProducto=   new JScrollPane(this.jPanelCamposModeloProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionModeloProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionModeloProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionModeloProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsModeloProducto.gridx = 0;
			this.gridBagConstraintsModeloProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsModeloProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsModeloProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionModeloProducto, this.gridBagConstraintsModeloProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsModeloProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioModeloProducto, this.gridBagConstraintsModeloProducto);			
			
			this.gridBagConstraintsModeloProducto = new GridBagConstraints();
			this.gridBagConstraintsModeloProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsModeloProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesModeloProducto, this.gridBagConstraintsModeloProducto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsModeloProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposModeloProducto, this.gridBagConstraintsModeloProducto);
			
			
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsModeloProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosModeloProducto, this.gridBagConstraintsModeloProducto);
		
			
		this.gridBagConstraintsModeloProducto = new GridBagConstraints();
		this.gridBagConstraintsModeloProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsModeloProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesModeloProducto, this.gridBagConstraintsModeloProducto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralModeloProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionModeloProducto;
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

				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=ModeloProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ModeloProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametroinventariodefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametroinventariodefectoBeanSwingJInternalFrame.setparametroinventariodefectoSessionBean(this.parametroinventariodefectoSessionBean);

				//this.gridBagConstraintsModeloProducto = new GridBagConstraints();
				//this.gridBagConstraintsModeloProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsModeloProducto.gridx = 0;
				//this.jContentPaneDetalleModeloProducto.add(this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsModeloProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesModeloProducto.add("Parametro Inventario Defectos",this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesModeloProducto.setComponentAt(iIndexTab,this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametroinventariodefectoBeanSwingJInternalFrame=null;//new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroInventarioDefecto) {
					this.jTabbedPaneRelacionesModeloProducto.add("Parametro Inventario Defectos",new JPanel());
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

				ProductoJInternalFrame.STIPO_TAMANIO_GENERAL=ModeloProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ModeloProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoSessionBean.setEsGuardarRelacionado(true);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoBeanSwingJInternalFrame.setproductoSessionBean(this.productoSessionBean);

				//this.gridBagConstraintsModeloProducto = new GridBagConstraints();
				//this.gridBagConstraintsModeloProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsModeloProducto.gridx = 0;
				//this.jContentPaneDetalleModeloProducto.add(this.productoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsModeloProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesModeloProducto.add("Productos",this.productoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesModeloProducto.setComponentAt(iIndexTab,this.productoBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoSessionBean.setEsGuardarRelacionado(false);
				this.productoBeanSwingJInternalFrame=null;//new ProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProducto) {
					this.jTabbedPaneRelacionesModeloProducto.add("Productos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarProductoBeanSwingJInternalFrame(List<ModeloProducto> modeloproductos,ModeloProducto modeloproducto,ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.modeloproductoLogic.getConnexion());

					productoBeanSwingJInternalFrame.setmodeloproductosForeignKey(modeloproductos);
					productoBeanSwingJInternalFrame.setmodeloproductoForeignKey(modeloproducto);
					productoBeanSwingJInternalFrame.productoSessionBean.setisBusquedaDesdeForeignKeySesionModeloProducto(true);
					productoBeanSwingJInternalFrame.productoSessionBean.setlidModeloProductoActual(modeloproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoBeanSwingJInternalFrame.cargarCombosForeignKeyProducto(productoBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoBeanSwingJInternalFrame.setVisibilidadBusquedasParaModeloProducto(true);
					productoBeanSwingJInternalFrame.setid_modelo_productoFK_IdModeloProducto(modeloproducto.getId());

					if(!this.conCargarFormDetalle) {
						productoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoBeanSwingJInternalFrame.setSelectedItemCombosFrameModeloProductoForeignKey(modeloproducto,1,false,true,true);
					productoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoBeanSwingJInternalFrame.procesarBusqueda("FK_IdModeloProducto");
					productoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdModeloProducto");
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

		public void cargarParametroInventarioDefectoBeanSwingJInternalFrame(List<ModeloProducto> modeloproductos,ModeloProducto modeloproducto,ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametroinventariodefectoBeanSwingJInternalFrame.getParametroInventarioDefectoLogic().setConnexion(this.modeloproductoLogic.getConnexion());

					parametroinventariodefectoBeanSwingJInternalFrame.setmodeloproductosForeignKey(modeloproductos);
					parametroinventariodefectoBeanSwingJInternalFrame.setmodeloproductoForeignKey(modeloproducto);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionModeloProducto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setlidModeloProductoActual(modeloproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametroinventariodefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroInventarioDefecto(parametroinventariodefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametroinventariodefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaModeloProducto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.setid_modelo_productoFK_IdModeloProducto(modeloproducto.getId());

					if(!this.conCargarFormDetalle) {
						parametroinventariodefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametroinventariodefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameModeloProductoForeignKey(modeloproducto,1,false,true,true);
					parametroinventariodefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametroinventariodefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdModeloProducto");
					parametroinventariodefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdModeloProducto");
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
