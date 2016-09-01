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


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


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
import com.bydan.erp.produccion.util.ProductoProduManoConstantesFunciones;

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
public class ProductoProduManoDetalleFormJInternalFrame extends ProductoProduManoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductoProduMano;
	
	protected JMenuBar jmenuBarDetalleProductoProduMano;
	
	protected JMenu jmenuDetalleProductoProduMano;
	protected JMenu jmenuDetalleArchivoProductoProduMano;
	protected JMenu jmenuDetalleAccionesProductoProduMano;
	protected JMenu jmenuDetalleDatosProductoProduMano;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductoProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoProduMano;	
	protected GridBagConstraints gridBagConstraintsProductoProduMano;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductoProduManoBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductoProduMano;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ProductoDefiProduBeanSwingJInternalFrame productodefiproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_productodefiprodu="";

	protected TipoManoProduEmpresaBeanSwingJInternalFrame tipomanoproduempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomanoproduempresa="";

	protected TipoProcesoEmpresaProduBeanSwingJInternalFrame tipoprocesoempresaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprocesoempresaprodu="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public ProductoProduManoSessionBean productoprodumanoSessionBean;
	
	
	
	
	public ProductoDefiProduSessionBean productodefiproduSessionBean;
	public TipoManoProduEmpresaSessionBean tipomanoproduempresaSessionBean;
	public TipoProcesoEmpresaProduSessionBean tipoprocesoempresaproduSessionBean;
	public UnidadSessionBean unidadSessionBean;	
	
	public ProductoProduManoLogic productoprodumanoLogic;
	
	public JScrollPane jScrollPanelDatosProductoProduMano;
	public JScrollPane jScrollPanelDatosEdicionProductoProduMano;
	public JScrollPane jScrollPanelDatosGeneralProductoProduMano;
	
	protected JPanel jPanelCamposProductoProduMano;    
	protected JPanel jPanelCamposOcultosProductoProduMano;    	
	protected JPanel jPanelAccionesProductoProduMano;
	protected JPanel jPanelAccionesFormularioProductoProduMano;
    
	
	
	protected Integer iXPanelCamposProductoProduMano=0;
	protected Integer iYPanelCamposProductoProduMano=0;
	
	protected Integer iXPanelCamposOcultosProductoProduMano=0;
	protected Integer iYPanelCamposOcultosProductoProduMano=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductoProduMano;
	public JButton jButtonModificarProductoProduMano;
	public JButton jButtonActualizarProductoProduMano;
    public JButton jButtonEliminarProductoProduMano;
	public JButton jButtonCancelarProductoProduMano;
    public JButton jButtonGuardarCambiosProductoProduMano;
	public JButton jButtonGuardarCambiosTablaProductoProduMano;
	protected JButton jButtonCerrarProductoProduMano;
	
	
	protected JButton jButtonProcesarInformacionProductoProduMano;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductoProduMano;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductoProduMano;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductoProduMano;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoProduMano;
	protected JButton jButtonModificarToolBarProductoProduMano;
	protected JButton jButtonActualizarToolBarProductoProduMano;
    protected JButton jButtonEliminarToolBarProductoProduMano;
	protected JButton jButtonCancelarToolBarProductoProduMano;
    protected JButton jButtonGuardarCambiosToolBarProductoProduMano;
	protected JButton jButtonGuardarCambiosTablaToolBarProductoProduMano;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoProduMano;
	protected JButton jButtonCerrarToolBarProductoProduMano;
	
	protected JButton jButtonProcesarInformacionToolBarProductoProduMano;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoProduMano;
	protected JMenuItem jMenuItemModificarProductoProduMano;
	protected JMenuItem jMenuItemActualizarProductoProduMano;
    protected JMenuItem jMenuItemEliminarProductoProduMano;
	protected JMenuItem jMenuItemCancelarProductoProduMano;
    protected JMenuItem jMenuItemGuardarCambiosProductoProduMano;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoProduMano;
	protected JMenuItem jMenuItemCerrarProductoProduMano;
	protected JMenuItem jMenuItemDetalleCerrarProductoProduMano;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoProduMano;
	
	protected JMenuItem jMenuItemProcesarInformacionProductoProduMano;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoProduMano;
	protected JMenuItem jMenuItemMostrarOcultarProductoProduMano;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoProduMano;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoProduMano;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoProduMano;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductoProduMano;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductoProduMano;
	public JLabel jLabelIdProductoProduMano;
	public JLabel jLabelidProductoProduMano;
	public JButton jButtonidProductoProduManoBusqueda= new JButtonMe();

	public JPanel jPanelcantidadProductoProduMano;
	public JLabel jLabelcantidadProductoProduMano;
	public JTextField jTextFieldcantidadProductoProduMano;
	public JButton jButtoncantidadProductoProduManoBusqueda= new JButtonMe();

	public JPanel jPanelcostoProductoProduMano;
	public JLabel jLabelcostoProductoProduMano;
	public JTextField jTextFieldcostoProductoProduMano;
	public JButton jButtoncostoProductoProduManoBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalProductoProduMano;
	public JLabel jLabelcosto_totalProductoProduMano;
	public JTextField jTextFieldcosto_totalProductoProduMano;
	public JButton jButtoncosto_totalProductoProduManoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionProductoProduMano;
	public JLabel jLabeldescripcionProductoProduMano;
	public JTextArea jTextAreadescripcionProductoProduMano;
	public JScrollPane jscrollPanedescripcionProductoProduMano;
	public JButton jButtondescripcionProductoProduManoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_producto_defi_produProductoProduMano;
	public JLabel jLabelid_producto_defi_produProductoProduMano;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_producto_defi_produProductoProduMano;
	public JButton jButtonid_producto_defi_produProductoProduMano= new JButtonMe();
	public JButton jButtonid_producto_defi_produProductoProduManoUpdate= new JButtonMe();
	public JButton jButtonid_producto_defi_produProductoProduManoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_mano_produ_empresaProductoProduMano;
	public JLabel jLabelid_tipo_mano_produ_empresaProductoProduMano;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_mano_produ_empresaProductoProduMano;
	public JButton jButtonid_tipo_mano_produ_empresaProductoProduMano= new JButtonMe();
	public JButton jButtonid_tipo_mano_produ_empresaProductoProduManoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_mano_produ_empresaProductoProduManoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_proceso_empresa_produProductoProduMano;
	public JLabel jLabelid_tipo_proceso_empresa_produProductoProduMano;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_proceso_empresa_produProductoProduMano;
	public JButton jButtonid_tipo_proceso_empresa_produProductoProduMano= new JButtonMe();
	public JButton jButtonid_tipo_proceso_empresa_produProductoProduManoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_proceso_empresa_produProductoProduManoBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadProductoProduMano;
	public JLabel jLabelid_unidadProductoProduMano;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadProductoProduMano;
	public JButton jButtonid_unidadProductoProduMano= new JButtonMe();
	public JButton jButtonid_unidadProductoProduManoUpdate= new JButtonMe();
	public JButton jButtonid_unidadProductoProduManoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductoProduMano;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProductoProduManoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductoProduMano=new JPanel();
				this.jPanelAccionesFormularioProductoProduMano=new JPanel();
				this.jmenuBarDetalleProductoProduMano=new JMenuBar();
				this.jTtoolBarDetalleProductoProduMano=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduManoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductoProduMano No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductoProduManoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductoProduMano No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduManoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProduMano No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduManoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProduMano No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduManoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoProduMano No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductoProduMano() {
		return this.jButtonActualizarToolBarProductoProduMano;
	}
	
	public JButton getjButtonEliminarToolBarProductoProduMano() {
		return this.jButtonEliminarToolBarProductoProduMano;
	}
	
	public JButton getjButtonCancelarToolBarProductoProduMano() {
		return this.jButtonCancelarToolBarProductoProduMano;
	}		
	
	public JButton getjButtonProcesarInformacionProductoProduMano() {
		return this.jButtonProcesarInformacionProductoProduMano;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoProduMano)	{
		this.jButtonProcesarInformacionProductoProduMano = jButtonProcesarInformacionProductoProduMano;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoProduMano() {
		return this.jComboBoxTiposAccionesProductoProduMano;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoProduMano(
			JComboBox jComboBoxTiposRelacionesProductoProduMano) {
		this.jComboBoxTiposRelacionesProductoProduMano = jComboBoxTiposRelacionesProductoProduMano;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoProduMano(
			JComboBox jComboBoxTiposAccionesProductoProduMano) {
		this.jComboBoxTiposAccionesProductoProduMano = jComboBoxTiposAccionesProductoProduMano;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductoProduMano() {
		return this.jComboBoxTiposAccionesFormularioProductoProduMano;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductoProduMano(
			JComboBox jComboBoxTiposAccionesFormularioProductoProduMano) {
		this.jComboBoxTiposAccionesFormularioProductoProduMano = jComboBoxTiposAccionesFormularioProductoProduMano;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productoprodumanoSessionBean=new ProductoProduManoSessionBean();
		
		this.productoprodumanoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoprodumanoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoprodumanoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoProduManoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoProduManoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoProduManoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto Mano De Obra Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductoProduManoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductoProduMano= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductoProduMano=new JButtonMe();
				this.jButtonModificarToolBarProductoProduMano=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductoProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductoProduMano,this.jTtoolBarDetalleProductoProduMano,
							"actualizar","actualizar","Actualizar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductoProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductoProduMano,this.jTtoolBarDetalleProductoProduMano,
							"eliminar","eliminar","Eliminar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductoProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductoProduMano,this.jTtoolBarDetalleProductoProduMano,
							"cancelar","cancelar","Cancelar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductoProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductoProduMano,this.jTtoolBarDetalleProductoProduMano,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductoProduMano,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductoProduMano,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductoProduMano,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductoProduMano=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductoProduMano=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductoProduMano=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductoProduMano=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductoProduMano=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoProduMano= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoProduMano.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoProduMano,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductoProduMano= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductoProduMano.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductoProduMano,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductoProduMano= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductoProduMano.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductoProduMano,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductoProduMano= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductoProduMano.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductoProduMano,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductoProduMano= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductoProduMano.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductoProduMano,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductoProduMano= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoProduMano.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoProduMano,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoProduMano= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoProduMano.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoProduMano,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductoProduMano= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductoProduMano.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductoProduMano,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoProduMano= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoProduMano.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoProduMano,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoProduMano= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoProduMano.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoProduMano,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductoProduMano.add(this.jMenuItemDetalleCerrarProductoProduMano);
		
		this.jmenuDetalleAccionesProductoProduMano.add(this.jMenuItemActualizarProductoProduMano);
		this.jmenuDetalleAccionesProductoProduMano.add(this.jMenuItemEliminarProductoProduMano);
		this.jmenuDetalleAccionesProductoProduMano.add(this.jMenuItemCancelarProductoProduMano);		
		
		//this.jmenuDetalleDatosProductoProduMano.add(this.jMenuItemDetalleAbrirOrderByProductoProduMano);				
		this.jmenuDetalleDatosProductoProduMano.add(this.jMenuItemDetalleMostarOcultarProductoProduMano);				
				
		//this.jmenuDetalleAccionesProductoProduMano.add(this.jMenuItemGuardarCambiosProductoProduMano);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductoProduMano.add(this.jmenuDetalleArchivoProductoProduMano);		
		this.jmenuBarDetalleProductoProduMano.add(this.jmenuDetalleAccionesProductoProduMano);		
		this.jmenuBarDetalleProductoProduMano.add(this.jmenuDetalleDatosProductoProduMano);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductoProduMano);				
	}
	
	
	public void inicializarElementosCamposProductoProduMano() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductoProduMano = new JLabelMe();
		jLabelIdProductoProduMano.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductoProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductoProduMano = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductoProduMano.setToolTipText(ProductoProduManoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductoProduMano= new GridBagLayout();

		this.jPanelidProductoProduMano.setLayout(this.gridaBagLayoutProductoProduMano);

		jLabelidProductoProduMano = new JLabel();
		jLabelidProductoProduMano.setText("Id");

		jLabelidProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidadProductoProduMano = new JLabelMe();
		this.jLabelcantidadProductoProduMano.setText(""+ProductoProduManoConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadProductoProduMano.setToolTipText("Cantidad");
		this.jLabelcantidadProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadProductoProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadProductoProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadProductoProduMano.setToolTipText(ProductoProduManoConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutProductoProduMano = new GridBagLayout();
		this.jPanelcantidadProductoProduMano.setLayout(this.gridaBagLayoutProductoProduMano);


		jTextFieldcantidadProductoProduMano= new JTextFieldMe();
		jTextFieldcantidadProductoProduMano.setEnabled(false);
		jTextFieldcantidadProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadProductoProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadProductoProduMano.setText("0");

		this.jButtoncantidadProductoProduManoBusqueda= new JButtonMe();
		this.jButtoncantidadProductoProduManoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductoProduManoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductoProduManoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadProductoProduManoBusqueda.setText("U");
		this.jButtoncantidadProductoProduManoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadProductoProduManoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadProductoProduManoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadProductoProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadProductoProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadProductoProduManoBusqueda"));

		if(this.productoprodumanoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadProductoProduManoBusqueda.setVisible(false);		}


					
		this.jLabelcostoProductoProduMano = new JLabelMe();
		this.jLabelcostoProductoProduMano.setText(""+ProductoProduManoConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoProductoProduMano.setToolTipText("Costo");
		this.jLabelcostoProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoProductoProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoProductoProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoProductoProduMano.setToolTipText(ProductoProduManoConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutProductoProduMano = new GridBagLayout();
		this.jPanelcostoProductoProduMano.setLayout(this.gridaBagLayoutProductoProduMano);


		jTextFieldcostoProductoProduMano= new JTextFieldMe();
		jTextFieldcostoProductoProduMano.setEnabled(false);
		jTextFieldcostoProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoProductoProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoProductoProduMano.setText("0.0");

		this.jButtoncostoProductoProduManoBusqueda= new JButtonMe();
		this.jButtoncostoProductoProduManoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoProductoProduManoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoProductoProduManoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoProductoProduManoBusqueda.setText("U");
		this.jButtoncostoProductoProduManoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoProductoProduManoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoProductoProduManoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoProductoProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoProductoProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoProductoProduManoBusqueda"));

		if(this.productoprodumanoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoProductoProduManoBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalProductoProduMano = new JLabelMe();
		this.jLabelcosto_totalProductoProduMano.setText(""+ProductoProduManoConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalProductoProduMano.setToolTipText("Costo Total");
		this.jLabelcosto_totalProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalProductoProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalProductoProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalProductoProduMano.setToolTipText(ProductoProduManoConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutProductoProduMano = new GridBagLayout();
		this.jPanelcosto_totalProductoProduMano.setLayout(this.gridaBagLayoutProductoProduMano);


		jTextFieldcosto_totalProductoProduMano= new JTextFieldMe();
		jTextFieldcosto_totalProductoProduMano.setEnabled(false);
		jTextFieldcosto_totalProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalProductoProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalProductoProduMano.setText("0.0");

		this.jButtoncosto_totalProductoProduManoBusqueda= new JButtonMe();
		this.jButtoncosto_totalProductoProduManoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProductoProduManoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProductoProduManoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalProductoProduManoBusqueda.setText("U");
		this.jButtoncosto_totalProductoProduManoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalProductoProduManoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalProductoProduManoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalProductoProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalProductoProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalProductoProduManoBusqueda"));

		if(this.productoprodumanoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalProductoProduManoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionProductoProduMano = new JLabelMe();
		this.jLabeldescripcionProductoProduMano.setText(""+ProductoProduManoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionProductoProduMano.setToolTipText("Descripcion");
		this.jLabeldescripcionProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionProductoProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionProductoProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionProductoProduMano.setToolTipText(ProductoProduManoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutProductoProduMano = new GridBagLayout();
		this.jPaneldescripcionProductoProduMano.setLayout(this.gridaBagLayoutProductoProduMano);


		jTextAreadescripcionProductoProduMano= new JTextAreaMe();
		jTextAreadescripcionProductoProduMano.setEnabled(false);
		jTextAreadescripcionProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoProduMano.setLineWrap(true);
		jTextAreadescripcionProductoProduMano.setWrapStyleWord(true);
		jTextAreadescripcionProductoProduMano.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionProductoProduMano.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionProductoProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionProductoProduMano = new JScrollPane(jTextAreadescripcionProductoProduMano);
		jscrollPanedescripcionProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionProductoProduManoBusqueda= new JButtonMe();
		this.jButtondescripcionProductoProduManoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoProduManoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoProduManoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionProductoProduManoBusqueda.setText("U");
		this.jButtondescripcionProductoProduManoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionProductoProduManoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionProductoProduManoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionProductoProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionProductoProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionProductoProduManoBusqueda"));

		if(this.productoprodumanoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionProductoProduManoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductoProduMano() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_producto_defi_produProductoProduMano = new JLabelMe();
		this.jLabelid_producto_defi_produProductoProduMano.setText(""+ProductoProduManoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU+" : *");
		this.jLabelid_producto_defi_produProductoProduMano.setToolTipText("Producto Defi Produ");
		this.jLabelid_producto_defi_produProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_producto_defi_produProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_producto_defi_produProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_producto_defi_produProductoProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_producto_defi_produProductoProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_producto_defi_produProductoProduMano.setToolTipText(ProductoProduManoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU);
		this.gridaBagLayoutProductoProduMano = new GridBagLayout();
		this.jPanelid_producto_defi_produProductoProduMano.setLayout(this.gridaBagLayoutProductoProduMano);


		jComboBoxid_producto_defi_produProductoProduMano= new JComboBoxMe();
		jComboBoxid_producto_defi_produProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_defi_produProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_defi_produProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_producto_defi_produProductoProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_producto_defi_produProductoProduMano= new JButtonMe();
		this.jButtonid_producto_defi_produProductoProduMano.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_defi_produProductoProduMano.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_defi_produProductoProduMano.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_defi_produProductoProduMano.setText("Buscar");
		this.jButtonid_producto_defi_produProductoProduMano.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_producto_defi_produProductoProduMano.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_defi_produProductoProduMano,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_producto_defi_produProductoProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_defi_produProductoProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_defi_produProductoProduMano"));

		this.jButtonid_producto_defi_produProductoProduManoBusqueda= new JButtonMe();
		this.jButtonid_producto_defi_produProductoProduManoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_defi_produProductoProduManoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_defi_produProductoProduManoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_producto_defi_produProductoProduManoBusqueda.setText("U");
		this.jButtonid_producto_defi_produProductoProduManoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_producto_defi_produProductoProduManoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_defi_produProductoProduManoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_producto_defi_produProductoProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_defi_produProductoProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_defi_produProductoProduManoBusqueda"));

		if(this.productoprodumanoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_producto_defi_produProductoProduManoBusqueda.setVisible(false);		}

		this.jButtonid_producto_defi_produProductoProduManoUpdate= new JButtonMe();
		this.jButtonid_producto_defi_produProductoProduManoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_defi_produProductoProduManoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_defi_produProductoProduManoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_producto_defi_produProductoProduManoUpdate.setText("U");
		this.jButtonid_producto_defi_produProductoProduManoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_producto_defi_produProductoProduManoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_defi_produProductoProduManoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_producto_defi_produProductoProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_defi_produProductoProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_defi_produProductoProduManoUpdate"));



					
		this.jLabelid_tipo_mano_produ_empresaProductoProduMano = new JLabelMe();
		this.jLabelid_tipo_mano_produ_empresaProductoProduMano.setText(""+ProductoProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA+" : *");
		this.jLabelid_tipo_mano_produ_empresaProductoProduMano.setToolTipText("Tipo Mano Obra Empresa");
		this.jLabelid_tipo_mano_produ_empresaProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_mano_produ_empresaProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_mano_produ_empresaProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_mano_produ_empresaProductoProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_mano_produ_empresaProductoProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_mano_produ_empresaProductoProduMano.setToolTipText(ProductoProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA);
		this.gridaBagLayoutProductoProduMano = new GridBagLayout();
		this.jPanelid_tipo_mano_produ_empresaProductoProduMano.setLayout(this.gridaBagLayoutProductoProduMano);


		jComboBoxid_tipo_mano_produ_empresaProductoProduMano= new JComboBoxMe();
		jComboBoxid_tipo_mano_produ_empresaProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_mano_produ_empresaProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_mano_produ_empresaProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_mano_produ_empresaProductoProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_mano_produ_empresaProductoProduMano= new JButtonMe();
		this.jButtonid_tipo_mano_produ_empresaProductoProduMano.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_mano_produ_empresaProductoProduMano.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_mano_produ_empresaProductoProduMano.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_mano_produ_empresaProductoProduMano.setText("Buscar");
		this.jButtonid_tipo_mano_produ_empresaProductoProduMano.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_mano_produ_empresaProductoProduMano.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_mano_produ_empresaProductoProduMano,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_mano_produ_empresaProductoProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_mano_produ_empresaProductoProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_mano_produ_empresaProductoProduMano"));

		this.jButtonid_tipo_mano_produ_empresaProductoProduManoBusqueda= new JButtonMe();
		this.jButtonid_tipo_mano_produ_empresaProductoProduManoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_mano_produ_empresaProductoProduManoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_mano_produ_empresaProductoProduManoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_mano_produ_empresaProductoProduManoBusqueda.setText("U");
		this.jButtonid_tipo_mano_produ_empresaProductoProduManoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_mano_produ_empresaProductoProduManoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_mano_produ_empresaProductoProduManoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_mano_produ_empresaProductoProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_mano_produ_empresaProductoProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_mano_produ_empresaProductoProduManoBusqueda"));

		if(this.productoprodumanoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_mano_produ_empresaProductoProduManoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_mano_produ_empresaProductoProduManoUpdate= new JButtonMe();
		this.jButtonid_tipo_mano_produ_empresaProductoProduManoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_mano_produ_empresaProductoProduManoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_mano_produ_empresaProductoProduManoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_mano_produ_empresaProductoProduManoUpdate.setText("U");
		this.jButtonid_tipo_mano_produ_empresaProductoProduManoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_mano_produ_empresaProductoProduManoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_mano_produ_empresaProductoProduManoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_mano_produ_empresaProductoProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_mano_produ_empresaProductoProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_mano_produ_empresaProductoProduManoUpdate"));



					
		this.jLabelid_tipo_proceso_empresa_produProductoProduMano = new JLabelMe();
		this.jLabelid_tipo_proceso_empresa_produProductoProduMano.setText(""+ProductoProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU+" : *");
		this.jLabelid_tipo_proceso_empresa_produProductoProduMano.setToolTipText("Tipo Proceso Empresa Produ");
		this.jLabelid_tipo_proceso_empresa_produProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_proceso_empresa_produProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_proceso_empresa_produProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_proceso_empresa_produProductoProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_proceso_empresa_produProductoProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_proceso_empresa_produProductoProduMano.setToolTipText(ProductoProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU);
		this.gridaBagLayoutProductoProduMano = new GridBagLayout();
		this.jPanelid_tipo_proceso_empresa_produProductoProduMano.setLayout(this.gridaBagLayoutProductoProduMano);


		jComboBoxid_tipo_proceso_empresa_produProductoProduMano= new JComboBoxMe();
		jComboBoxid_tipo_proceso_empresa_produProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_empresa_produProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_empresa_produProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_proceso_empresa_produProductoProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_proceso_empresa_produProductoProduMano= new JButtonMe();
		this.jButtonid_tipo_proceso_empresa_produProductoProduMano.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proceso_empresa_produProductoProduMano.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proceso_empresa_produProductoProduMano.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proceso_empresa_produProductoProduMano.setText("Buscar");
		this.jButtonid_tipo_proceso_empresa_produProductoProduMano.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_proceso_empresa_produProductoProduMano.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proceso_empresa_produProductoProduMano,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_proceso_empresa_produProductoProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proceso_empresa_produProductoProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proceso_empresa_produProductoProduMano"));

		this.jButtonid_tipo_proceso_empresa_produProductoProduManoBusqueda= new JButtonMe();
		this.jButtonid_tipo_proceso_empresa_produProductoProduManoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_empresa_produProductoProduManoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_empresa_produProductoProduManoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_proceso_empresa_produProductoProduManoBusqueda.setText("U");
		this.jButtonid_tipo_proceso_empresa_produProductoProduManoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_proceso_empresa_produProductoProduManoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proceso_empresa_produProductoProduManoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_proceso_empresa_produProductoProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proceso_empresa_produProductoProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proceso_empresa_produProductoProduManoBusqueda"));

		if(this.productoprodumanoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_proceso_empresa_produProductoProduManoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_proceso_empresa_produProductoProduManoUpdate= new JButtonMe();
		this.jButtonid_tipo_proceso_empresa_produProductoProduManoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_empresa_produProductoProduManoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_empresa_produProductoProduManoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_proceso_empresa_produProductoProduManoUpdate.setText("U");
		this.jButtonid_tipo_proceso_empresa_produProductoProduManoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_proceso_empresa_produProductoProduManoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proceso_empresa_produProductoProduManoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_proceso_empresa_produProductoProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proceso_empresa_produProductoProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proceso_empresa_produProductoProduManoUpdate"));



					
		this.jLabelid_unidadProductoProduMano = new JLabelMe();
		this.jLabelid_unidadProductoProduMano.setText(""+ProductoProduManoConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadProductoProduMano.setToolTipText("Unad");
		this.jLabelid_unidadProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadProductoProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadProductoProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadProductoProduMano.setToolTipText(ProductoProduManoConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutProductoProduMano = new GridBagLayout();
		this.jPanelid_unidadProductoProduMano.setLayout(this.gridaBagLayoutProductoProduMano);


		jComboBoxid_unidadProductoProduMano= new JComboBoxMe();
		jComboBoxid_unidadProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadProductoProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadProductoProduMano= new JButtonMe();
		this.jButtonid_unidadProductoProduMano.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoProduMano.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoProduMano.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoProduMano.setText("Buscar");
		this.jButtonid_unidadProductoProduMano.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadProductoProduMano.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoProduMano,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadProductoProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoProduMano"));

		this.jButtonid_unidadProductoProduManoBusqueda= new JButtonMe();
		this.jButtonid_unidadProductoProduManoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoProduManoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoProduManoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoProduManoBusqueda.setText("U");
		this.jButtonid_unidadProductoProduManoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadProductoProduManoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoProduManoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadProductoProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoProduManoBusqueda"));

		if(this.productoprodumanoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadProductoProduManoBusqueda.setVisible(false);		}

		this.jButtonid_unidadProductoProduManoUpdate= new JButtonMe();
		this.jButtonid_unidadProductoProduManoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoProduManoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoProduManoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoProduManoUpdate.setText("U");
		this.jButtonid_unidadProductoProduManoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadProductoProduManoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoProduManoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadProductoProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoProduManoUpdate"));



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
		//this.jInternalFrameDetalleProductoProduMano = new ProductoProduManoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Producto Mano De Obra Produccion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoProduMano= new GridBagLayout();
		

		
		String sToolTipProductoProduMano="";
		sToolTipProductoProduMano=ProductoProduManoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoProduMano+="(Produccion.ProductoProduMano)";
		}
		
		if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoProduMano+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductoProduMano = new JButtonMe();
		this.jButtonModificarProductoProduMano = new JButtonMe();
        this.jButtonActualizarProductoProduMano = new JButtonMe();
        this.jButtonEliminarProductoProduMano = new JButtonMe();
        this.jButtonCancelarProductoProduMano = new JButtonMe();
        this.jButtonGuardarCambiosProductoProduMano = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductoProduMano = new JButtonMe();
		this.jButtonCerrarProductoProduMano = new JButtonMe();
		
		this.jScrollPanelDatosProductoProduMano = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductoProduMano = new JScrollPane();
		this.jScrollPanelDatosGeneralProductoProduMano = new JScrollPane();
				
		
		
		this.jPanelCamposProductoProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductoProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductoProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductoProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Mano De Obra Produccion";
		
		if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Mano De Obra Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoProduMano.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductoProduMano.setName("jPanelCamposProductoProduMano"); 

		this.jPanelCamposOcultosProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductoProduMano.setName("jPanelCamposOcultosProductoProduMano"); 

        this.jPanelAccionesProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoProduMano.setToolTipText("Acciones");
        this.jPanelAccionesProductoProduMano.setName("Acciones"); 

		this.jPanelAccionesFormularioProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductoProduMano.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductoProduMano.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductoProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoProduMano, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductoProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductoProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductoProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductoProduMano.setText("Nuevo");
		this.jButtonModificarProductoProduMano.setText("Editar");
        this.jButtonActualizarProductoProduMano.setText("Actualizar");
        this.jButtonEliminarProductoProduMano.setText("Eliminar");
        this.jButtonCancelarProductoProduMano.setText("Cancelar");
        this.jButtonGuardarCambiosProductoProduMano.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductoProduMano.setText("Guardar");
		this.jButtonCerrarProductoProduMano.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoProduMano,"nuevo_button","Nuevo",this.productoprodumanoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductoProduMano,"modificar_button","Editar",this.productoprodumanoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductoProduMano,"actualizar_button","Actualizar",this.productoprodumanoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductoProduMano,"eliminar_button","Eliminar",this.productoprodumanoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductoProduMano,"cancelar_button","Cancelar",this.productoprodumanoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductoProduMano,"guardarcambios_button","Guardar",this.productoprodumanoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoProduMano,"guardarcambiostabla_button","Guardar",this.productoprodumanoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoProduMano,"cerrar_button","Salir",this.productoprodumanoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductoProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductoProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductoProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductoProduMano.setToolTipText("Nuevo"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductoProduMano.setToolTipText("Editar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductoProduMano.setToolTipText("Actualizar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductoProduMano.setToolTipText("Eliminar)"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductoProduMano.setToolTipText("Cancelar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductoProduMano.setToolTipText("Guardar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductoProduMano.setToolTipText("Guardar"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoProduMano.setToolTipText("Salir"+" "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoProduMano";
		inputMap = this.jButtonNuevoProductoProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoProduMano.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoProduMano"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductoProduMano";
		inputMap = this.jButtonActualizarProductoProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductoProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductoProduMano"));
		
		//ELIMINAR
		sMapKey = "EliminarProductoProduMano";
		inputMap = this.jButtonEliminarProductoProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductoProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductoProduMano"));
		
		//CANCELAR	
		sMapKey = "CancelarProductoProduMano";
		inputMap = this.jButtonCancelarProductoProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductoProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductoProduMano"));
		
		//CERRAR		
		sMapKey = "CerrarProductoProduMano";
		inputMap = this.jButtonCerrarProductoProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoProduMano"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoProduMano";
		inputMap = this.jButtonGuardarCambiosTablaProductoProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoProduMano"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductoProduMano = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductoProduMano.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductoProduMano.setToolTipText("Nuevo ProductoProduMano");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductoProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductoProduMano = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductoProduMano.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductoProduMano.setToolTipText("Sin Cerrar Ventana ProductoProduMano");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductoProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductoProduMano = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductoProduMano.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductoProduMano.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductoProduMano, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductoProduMano = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoProduMano.setText("Accion");
		this.jComboBoxTiposAccionesProductoProduMano.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductoProduMano = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductoProduMano.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductoProduMano.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductoProduMano = new JLabelMe();
		
		this.jLabelAccionesProductoProduMano.setText("Acciones");		
		this.jLabelAccionesProductoProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductoProduMano();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductoProduMano();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductoProduMano=new JTabbedPane();
		this.jTabbedPaneRelacionesProductoProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductoProduMano,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductoProduMano.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProduMano.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProduMano.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductoProduMano.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoProduMano.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoProduMano.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductoProduMano, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductoProduMano = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductoProduMano = new GridBagLayout();
		
		this.jPanelCamposProductoProduMano.setLayout(gridaBagLayoutCamposProductoProduMano);
		this.jPanelCamposOcultosProductoProduMano.setLayout(gridaBagLayoutCamposOcultosProductoProduMano);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMano.gridy = 0;
	this.gridBagConstraintsProductoProduMano.gridx = 0;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductoProduMano.add(jLabelIdProductoProduMano, this.gridBagConstraintsProductoProduMano);



	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMano.gridy = 0;
	this.gridBagConstraintsProductoProduMano.gridx = 1;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductoProduMano.add(jLabelidProductoProduMano, this.gridBagConstraintsProductoProduMano);


	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMano.gridy = 0;
	this.gridBagConstraintsProductoProduMano.gridx = 0;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_producto_defi_produProductoProduMano.add(jLabelid_producto_defi_produProductoProduMano, this.gridBagConstraintsProductoProduMano);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = 0;
		this.gridBagConstraintsProductoProduMano.gridx = 2;
		this.gridBagConstraintsProductoProduMano.ipadx = 0;
		this.gridBagConstraintsProductoProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_producto_defi_produProductoProduMano.add(jButtonid_producto_defi_produProductoProduManoBusqueda, this.gridBagConstraintsProductoProduMano);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = 0;
		this.gridBagConstraintsProductoProduMano.gridx = 3;
		this.gridBagConstraintsProductoProduMano.ipadx = 0;
		this.gridBagConstraintsProductoProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_producto_defi_produProductoProduMano.add(jButtonid_producto_defi_produProductoProduManoUpdate, this.gridBagConstraintsProductoProduMano);
	}

	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMano.gridy = 0;
	this.gridBagConstraintsProductoProduMano.gridx = 1;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_producto_defi_produProductoProduMano.add(jComboBoxid_producto_defi_produProductoProduMano, this.gridBagConstraintsProductoProduMano);


	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMano.gridy = 0;
	this.gridBagConstraintsProductoProduMano.gridx = 0;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_mano_produ_empresaProductoProduMano.add(jLabelid_tipo_mano_produ_empresaProductoProduMano, this.gridBagConstraintsProductoProduMano);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = 0;
		this.gridBagConstraintsProductoProduMano.gridx = 2;
		this.gridBagConstraintsProductoProduMano.ipadx = 0;
		this.gridBagConstraintsProductoProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_mano_produ_empresaProductoProduMano.add(jButtonid_tipo_mano_produ_empresaProductoProduManoBusqueda, this.gridBagConstraintsProductoProduMano);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = 0;
		this.gridBagConstraintsProductoProduMano.gridx = 3;
		this.gridBagConstraintsProductoProduMano.ipadx = 0;
		this.gridBagConstraintsProductoProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_mano_produ_empresaProductoProduMano.add(jButtonid_tipo_mano_produ_empresaProductoProduManoUpdate, this.gridBagConstraintsProductoProduMano);
	}

	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMano.gridy = 0;
	this.gridBagConstraintsProductoProduMano.gridx = 1;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_mano_produ_empresaProductoProduMano.add(jComboBoxid_tipo_mano_produ_empresaProductoProduMano, this.gridBagConstraintsProductoProduMano);


	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMano.gridy = 0;
	this.gridBagConstraintsProductoProduMano.gridx = 0;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_proceso_empresa_produProductoProduMano.add(jLabelid_tipo_proceso_empresa_produProductoProduMano, this.gridBagConstraintsProductoProduMano);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = 0;
		this.gridBagConstraintsProductoProduMano.gridx = 2;
		this.gridBagConstraintsProductoProduMano.ipadx = 0;
		this.gridBagConstraintsProductoProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_proceso_empresa_produProductoProduMano.add(jButtonid_tipo_proceso_empresa_produProductoProduManoBusqueda, this.gridBagConstraintsProductoProduMano);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = 0;
		this.gridBagConstraintsProductoProduMano.gridx = 3;
		this.gridBagConstraintsProductoProduMano.ipadx = 0;
		this.gridBagConstraintsProductoProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_proceso_empresa_produProductoProduMano.add(jButtonid_tipo_proceso_empresa_produProductoProduManoUpdate, this.gridBagConstraintsProductoProduMano);
	}

	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMano.gridy = 0;
	this.gridBagConstraintsProductoProduMano.gridx = 1;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_proceso_empresa_produProductoProduMano.add(jComboBoxid_tipo_proceso_empresa_produProductoProduMano, this.gridBagConstraintsProductoProduMano);


	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMano.gridy = 0;
	this.gridBagConstraintsProductoProduMano.gridx = 0;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadProductoProduMano.add(jLabelid_unidadProductoProduMano, this.gridBagConstraintsProductoProduMano);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = 0;
		this.gridBagConstraintsProductoProduMano.gridx = 2;
		this.gridBagConstraintsProductoProduMano.ipadx = 0;
		this.gridBagConstraintsProductoProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoProduMano.add(jButtonid_unidadProductoProduManoBusqueda, this.gridBagConstraintsProductoProduMano);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = 0;
		this.gridBagConstraintsProductoProduMano.gridx = 3;
		this.gridBagConstraintsProductoProduMano.ipadx = 0;
		this.gridBagConstraintsProductoProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoProduMano.add(jButtonid_unidadProductoProduManoUpdate, this.gridBagConstraintsProductoProduMano);
	}

	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMano.gridy = 0;
	this.gridBagConstraintsProductoProduMano.gridx = 1;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadProductoProduMano.add(jComboBoxid_unidadProductoProduMano, this.gridBagConstraintsProductoProduMano);


	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMano.gridy = 0;
	this.gridBagConstraintsProductoProduMano.gridx = 0;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadProductoProduMano.add(jLabelcantidadProductoProduMano, this.gridBagConstraintsProductoProduMano);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = 0;
		this.gridBagConstraintsProductoProduMano.gridx = 2;
		this.gridBagConstraintsProductoProduMano.ipadx = 0;
		this.gridBagConstraintsProductoProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadProductoProduMano.add(jButtoncantidadProductoProduManoBusqueda, this.gridBagConstraintsProductoProduMano);
	}

	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMano.gridy = 0;
	this.gridBagConstraintsProductoProduMano.gridx = 1;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadProductoProduMano.add(jTextFieldcantidadProductoProduMano, this.gridBagConstraintsProductoProduMano);


	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMano.gridy = 0;
	this.gridBagConstraintsProductoProduMano.gridx = 0;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoProductoProduMano.add(jLabelcostoProductoProduMano, this.gridBagConstraintsProductoProduMano);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = 0;
		this.gridBagConstraintsProductoProduMano.gridx = 2;
		this.gridBagConstraintsProductoProduMano.ipadx = 0;
		this.gridBagConstraintsProductoProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoProductoProduMano.add(jButtoncostoProductoProduManoBusqueda, this.gridBagConstraintsProductoProduMano);
	}

	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMano.gridy = 0;
	this.gridBagConstraintsProductoProduMano.gridx = 1;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoProductoProduMano.add(jTextFieldcostoProductoProduMano, this.gridBagConstraintsProductoProduMano);


	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMano.gridy = 0;
	this.gridBagConstraintsProductoProduMano.gridx = 0;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalProductoProduMano.add(jLabelcosto_totalProductoProduMano, this.gridBagConstraintsProductoProduMano);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = 0;
		this.gridBagConstraintsProductoProduMano.gridx = 2;
		this.gridBagConstraintsProductoProduMano.ipadx = 0;
		this.gridBagConstraintsProductoProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalProductoProduMano.add(jButtoncosto_totalProductoProduManoBusqueda, this.gridBagConstraintsProductoProduMano);
	}

	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMano.gridy = 0;
	this.gridBagConstraintsProductoProduMano.gridx = 1;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalProductoProduMano.add(jTextFieldcosto_totalProductoProduMano, this.gridBagConstraintsProductoProduMano);


	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMano.gridy = 0;
	this.gridBagConstraintsProductoProduMano.gridx = 0;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionProductoProduMano.add(jLabeldescripcionProductoProduMano, this.gridBagConstraintsProductoProduMano);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduMano.gridy = 0;
		this.gridBagConstraintsProductoProduMano.gridx = 2;
		this.gridBagConstraintsProductoProduMano.ipadx = 0;
		this.gridBagConstraintsProductoProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionProductoProduMano.add(jButtondescripcionProductoProduManoBusqueda, this.gridBagConstraintsProductoProduMano);
	}

	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduMano.gridy = 0;
	this.gridBagConstraintsProductoProduMano.gridx = 1;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionProductoProduMano.add(jscrollPanedescripcionProductoProduMano, this.gridBagConstraintsProductoProduMano);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMano.gridy = iYPanelCamposProductoProduMano;
	this.gridBagConstraintsProductoProduMano.gridx = iXPanelCamposProductoProduMano++;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMano.add(this.jPanelidProductoProduMano, this.gridBagConstraintsProductoProduMano);



	if(iXPanelCamposProductoProduMano % 1==0) {
		iXPanelCamposProductoProduMano=0;
		iYPanelCamposProductoProduMano++;
	}
	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMano.gridy = iYPanelCamposProductoProduMano;
	this.gridBagConstraintsProductoProduMano.gridx = iXPanelCamposProductoProduMano++;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMano.add(this.jPanelid_producto_defi_produProductoProduMano, this.gridBagConstraintsProductoProduMano);



	if(iXPanelCamposProductoProduMano % 1==0) {
		iXPanelCamposProductoProduMano=0;
		iYPanelCamposProductoProduMano++;
	}
	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMano.gridy = iYPanelCamposProductoProduMano;
	this.gridBagConstraintsProductoProduMano.gridx = iXPanelCamposProductoProduMano++;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMano.add(this.jPanelid_tipo_mano_produ_empresaProductoProduMano, this.gridBagConstraintsProductoProduMano);



	if(iXPanelCamposProductoProduMano % 1==0) {
		iXPanelCamposProductoProduMano=0;
		iYPanelCamposProductoProduMano++;
	}
	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMano.gridy = iYPanelCamposProductoProduMano;
	this.gridBagConstraintsProductoProduMano.gridx = iXPanelCamposProductoProduMano++;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMano.add(this.jPanelid_tipo_proceso_empresa_produProductoProduMano, this.gridBagConstraintsProductoProduMano);



	if(iXPanelCamposProductoProduMano % 1==0) {
		iXPanelCamposProductoProduMano=0;
		iYPanelCamposProductoProduMano++;
	}
	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMano.gridy = iYPanelCamposProductoProduMano;
	this.gridBagConstraintsProductoProduMano.gridx = iXPanelCamposProductoProduMano++;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMano.add(this.jPanelid_unidadProductoProduMano, this.gridBagConstraintsProductoProduMano);



	if(iXPanelCamposProductoProduMano % 1==0) {
		iXPanelCamposProductoProduMano=0;
		iYPanelCamposProductoProduMano++;
	}
	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMano.gridy = iYPanelCamposProductoProduMano;
	this.gridBagConstraintsProductoProduMano.gridx = iXPanelCamposProductoProduMano++;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMano.add(this.jPanelcantidadProductoProduMano, this.gridBagConstraintsProductoProduMano);



	if(iXPanelCamposProductoProduMano % 1==0) {
		iXPanelCamposProductoProduMano=0;
		iYPanelCamposProductoProduMano++;
	}
	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMano.gridy = iYPanelCamposProductoProduMano;
	this.gridBagConstraintsProductoProduMano.gridx = iXPanelCamposProductoProduMano++;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMano.add(this.jPanelcostoProductoProduMano, this.gridBagConstraintsProductoProduMano);



	if(iXPanelCamposProductoProduMano % 1==0) {
		iXPanelCamposProductoProduMano=0;
		iYPanelCamposProductoProduMano++;
	}
	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMano.gridy = iYPanelCamposProductoProduMano;
	this.gridBagConstraintsProductoProduMano.gridx = iXPanelCamposProductoProduMano++;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMano.add(this.jPanelcosto_totalProductoProduMano, this.gridBagConstraintsProductoProduMano);



	if(iXPanelCamposProductoProduMano % 1==0) {
		iXPanelCamposProductoProduMano=0;
		iYPanelCamposProductoProduMano++;
	}
	this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduMano.gridy = iYPanelCamposProductoProduMano;
	this.gridBagConstraintsProductoProduMano.gridx = iXPanelCamposProductoProduMano++;
	this.gridBagConstraintsProductoProduMano.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduMano.add(this.jPaneldescripcionProductoProduMano, this.gridBagConstraintsProductoProduMano);



	if(iXPanelCamposProductoProduMano % 1==0) {
		iXPanelCamposProductoProduMano=0;
		iYPanelCamposProductoProduMano++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesProductoProduMano= new GridBagLayout();
		this.jPanelAccionesProductoProduMano.setLayout(gridaBagLayoutAccionesProductoProduMano);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductoProduMano= new GridBagLayout();
		this.jPanelAccionesFormularioProductoProduMano.setLayout(gridaBagLayoutAccionesFormularioProductoProduMano);
		
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoProduMano.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoProduMano.add(this.jComboBoxTiposAccionesFormularioProductoProduMano, this.gridBagConstraintsProductoProduMano);

		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoProduMano.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoProduMano.add(this.jCheckBoxPostAccionNuevoProductoProduMano, this.gridBagConstraintsProductoProduMano);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.productoprodumanoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoProduMano.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoProduMano.add(this.jCheckBoxPostAccionSinCerrarProductoProduMano, this.gridBagConstraintsProductoProduMano);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.productoprodumanoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoProduMano.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoProduMano.add(this.jCheckBoxPostAccionSinMensajeProductoProduMano, this.gridBagConstraintsProductoProduMano);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMano.gridy = 0;
		this.gridBagConstraintsProductoProduMano.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductoProduMano.add(this.jButtonModificarProductoProduMano, this.gridBagConstraintsProductoProduMano);							

		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduMano.gridy = 0;
		this.gridBagConstraintsProductoProduMano.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductoProduMano.add(this.jButtonEliminarProductoProduMano, this.gridBagConstraintsProductoProduMano);
		
			
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.gridy = 0;		
		this.gridBagConstraintsProductoProduMano.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoProduMano.add(this.jButtonActualizarProductoProduMano, this.gridBagConstraintsProductoProduMano);


		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.gridy = 0;		
		this.gridBagConstraintsProductoProduMano.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoProduMano.add(this.jButtonGuardarCambiosProductoProduMano, this.gridBagConstraintsProductoProduMano);	
		
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.gridy = 0;		
		this.gridBagConstraintsProductoProduMano.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductoProduMano.add(this.jButtonCancelarProductoProduMano, this.gridBagConstraintsProductoProduMano);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoProduMano = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoProduMano);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();						
			this.gridBagConstraintsProductoProduMano.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoProduMano.gridx = 0;		
			//this.gridBagConstraintsProductoProduMano.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoProduMano.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoProduMano.gridx =0;
		this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoProduMano.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoProduMano, this.gridBagConstraintsProductoProduMano);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductoProduManoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductoProduMano = new ProductoProduManoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Producto Mano De Obra Produccion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Producto Mano De Obra Produccion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Producto Mano De Obra Produccion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductoProduManoModel productoprodumanoModel=new ProductoProduManoModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductoProduManoModel.ProductoProduManoFocusTraversalPolicy productoprodumanoFocusTraversalPolicy = productoprodumanoModel.new ProductoProduManoFocusTraversalPolicy(this);
			
			//productoprodumanoFocusTraversalPolicy.setproductoprodumanoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productoprodumanoModel);
			
			
			this.jContentPaneDetalleProductoProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductoProduMano = new GridBagLayout();	
			this.jContentPaneDetalleProductoProduMano.setLayout(gridaBagLayoutDetalleProductoProduMano);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoProduMano = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
				this.gridBagConstraintsProductoProduMano.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductoProduMano.gridx = 0;
					
				
				this.jContentPaneDetalleProductoProduMano.add(jTtoolBarDetalleProductoProduMano, gridBagConstraintsProductoProduMano);								
				
}
			
			this.jScrollPanelDatosEdicionProductoProduMano=   new JScrollPane(jContentPaneDetalleProductoProduMano,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoProduMano.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProduMano.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProduMano.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductoProduMano=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoProduMano.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProduMano.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProduMano.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductoProduMano.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductoProduMano.gridx = 0;
	        
			this.jContentPaneDetalleProductoProduMano.add(jPanelCamposProductoProduMano, gridBagConstraintsProductoProduMano);
			
			
			
			
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
						&& productoprodumanoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productoprodumanoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductoProduMano= new GridBagConstraints();
						this.gridBagConstraintsProductoProduMano.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductoProduMano.gridx = 0;
						this.jContentPaneDetalleProductoProduMano.add(this.jTabbedPaneRelacionesProductoProduMano, this.gridBagConstraintsProductoProduMano);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductoProduMano.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductoProduMano.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
					this.gridBagConstraintsProductoProduMano.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductoProduMano.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductoProduMano.gridx = 0;
					
				
					this.jContentPaneDetalleProductoProduMano.add(jPanelCamposOcultosProductoProduMano, gridBagConstraintsProductoProduMano);
				
					this.jPanelCamposOcultosProductoProduMano.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductoProduMano.gridx = 0;
	        this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductoProduMano.add(this.jPanelAccionesFormularioProductoProduMano, this.gridBagConstraintsProductoProduMano);							
			
			
			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
	        this.gridBagConstraintsProductoProduMano.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductoProduMano.gridx = 0;
	        
			
			this.jContentPaneDetalleProductoProduMano.add(this.jPanelAccionesProductoProduMano, this.gridBagConstraintsProductoProduMano);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductoProduMano);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductoProduMano=   new JScrollPane(this.jPanelCamposProductoProduMano,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoProduMano.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProduMano.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProduMano.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductoProduMano.gridx = 0;
			this.gridBagConstraintsProductoProduMano.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductoProduMano.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductoProduMano.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductoProduMano, this.gridBagConstraintsProductoProduMano);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoProduMano.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductoProduMano, this.gridBagConstraintsProductoProduMano);			
			
			this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoProduMano.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoProduMano.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductoProduMano, this.gridBagConstraintsProductoProduMano);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMano.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoProduMano, this.gridBagConstraintsProductoProduMano);
			
			
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMano.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoProduMano, this.gridBagConstraintsProductoProduMano);
		
			
		this.gridBagConstraintsProductoProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoProduMano.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduMano.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoProduMano, this.gridBagConstraintsProductoProduMano);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductoProduMano;//jContentPane;
		
		return jScrollPanelDatosEdicionProductoProduMano;
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
