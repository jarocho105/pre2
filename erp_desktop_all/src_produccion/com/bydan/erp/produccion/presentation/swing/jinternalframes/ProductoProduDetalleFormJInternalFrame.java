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
import com.bydan.erp.produccion.util.ProductoProduConstantesFunciones;

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
public class ProductoProduDetalleFormJInternalFrame extends ProductoProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductoProdu;
	
	protected JMenuBar jmenuBarDetalleProductoProdu;
	
	protected JMenu jmenuDetalleProductoProdu;
	protected JMenu jmenuDetalleArchivoProductoProdu;
	protected JMenu jmenuDetalleAccionesProductoProdu;
	protected JMenu jmenuDetalleDatosProductoProdu;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoProdu;	
	protected GridBagConstraints gridBagConstraintsProductoProdu;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductoProduBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductoProdu;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ProductoDefiProduBeanSwingJInternalFrame productodefiproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_productodefiprodu="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public ProductoProduSessionBean productoproduSessionBean;
	
	
	
	
	public ProductoDefiProduSessionBean productodefiproduSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;	
	
	public ProductoProduLogic productoproduLogic;
	
	public JScrollPane jScrollPanelDatosProductoProdu;
	public JScrollPane jScrollPanelDatosEdicionProductoProdu;
	public JScrollPane jScrollPanelDatosGeneralProductoProdu;
	
	protected JPanel jPanelCamposProductoProdu;    
	protected JPanel jPanelCamposOcultosProductoProdu;    	
	protected JPanel jPanelAccionesProductoProdu;
	protected JPanel jPanelAccionesFormularioProductoProdu;
    
	
	
	protected Integer iXPanelCamposProductoProdu=0;
	protected Integer iYPanelCamposProductoProdu=0;
	
	protected Integer iXPanelCamposOcultosProductoProdu=0;
	protected Integer iYPanelCamposOcultosProductoProdu=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductoProdu;
	public JButton jButtonModificarProductoProdu;
	public JButton jButtonActualizarProductoProdu;
    public JButton jButtonEliminarProductoProdu;
	public JButton jButtonCancelarProductoProdu;
    public JButton jButtonGuardarCambiosProductoProdu;
	public JButton jButtonGuardarCambiosTablaProductoProdu;
	protected JButton jButtonCerrarProductoProdu;
	
	
	protected JButton jButtonProcesarInformacionProductoProdu;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductoProdu;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductoProdu;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductoProdu;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoProdu;
	protected JButton jButtonModificarToolBarProductoProdu;
	protected JButton jButtonActualizarToolBarProductoProdu;
    protected JButton jButtonEliminarToolBarProductoProdu;
	protected JButton jButtonCancelarToolBarProductoProdu;
    protected JButton jButtonGuardarCambiosToolBarProductoProdu;
	protected JButton jButtonGuardarCambiosTablaToolBarProductoProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoProdu;
	protected JButton jButtonCerrarToolBarProductoProdu;
	
	protected JButton jButtonProcesarInformacionToolBarProductoProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoProdu;
	protected JMenuItem jMenuItemModificarProductoProdu;
	protected JMenuItem jMenuItemActualizarProductoProdu;
    protected JMenuItem jMenuItemEliminarProductoProdu;
	protected JMenuItem jMenuItemCancelarProductoProdu;
    protected JMenuItem jMenuItemGuardarCambiosProductoProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoProdu;
	protected JMenuItem jMenuItemCerrarProductoProdu;
	protected JMenuItem jMenuItemDetalleCerrarProductoProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoProdu;
	
	protected JMenuItem jMenuItemProcesarInformacionProductoProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoProdu;
	protected JMenuItem jMenuItemMostrarOcultarProductoProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoProdu;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoProdu;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductoProdu;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductoProdu;
	public JLabel jLabelIdProductoProdu;
	public JLabel jLabelidProductoProdu;
	public JButton jButtonidProductoProduBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeProductoProdu;
	public JLabel jLabelporcentajeProductoProdu;
	public JTextField jTextFieldporcentajeProductoProdu;
	public JButton jButtonporcentajeProductoProduBusqueda= new JButtonMe();

	public JPanel jPanelcantidadProductoProdu;
	public JLabel jLabelcantidadProductoProdu;
	public JTextField jTextFieldcantidadProductoProdu;
	public JButton jButtoncantidadProductoProduBusqueda= new JButtonMe();

	public JPanel jPanelcostoProductoProdu;
	public JLabel jLabelcostoProductoProdu;
	public JTextField jTextFieldcostoProductoProdu;
	public JButton jButtoncostoProductoProduBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalProductoProdu;
	public JLabel jLabelcosto_totalProductoProdu;
	public JTextField jTextFieldcosto_totalProductoProdu;
	public JButton jButtoncosto_totalProductoProduBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionProductoProdu;
	public JLabel jLabeldescripcionProductoProdu;
	public JTextArea jTextAreadescripcionProductoProdu;
	public JScrollPane jscrollPanedescripcionProductoProdu;
	public JButton jButtondescripcionProductoProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_producto_defi_produProductoProdu;
	public JLabel jLabelid_producto_defi_produProductoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_producto_defi_produProductoProdu;
	public JButton jButtonid_producto_defi_produProductoProdu= new JButtonMe();
	public JButton jButtonid_producto_defi_produProductoProduUpdate= new JButtonMe();
	public JButton jButtonid_producto_defi_produProductoProduBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaProductoProdu;
	public JLabel jLabelid_bodegaProductoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaProductoProdu;
	public JButton jButtonid_bodegaProductoProdu= new JButtonMe();
	public JButton jButtonid_bodegaProductoProduUpdate= new JButtonMe();
	public JButton jButtonid_bodegaProductoProduBusqueda= new JButtonMe();

	public JPanel jPanelid_productoProductoProdu;
	public JLabel jLabelid_productoProductoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoProductoProdu;
	public JButton jButtonid_productoProductoProdu= new JButtonMe();
	public JButton jButtonid_productoProductoProduUpdate= new JButtonMe();
	public JButton jButtonid_productoProductoProduBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadProductoProdu;
	public JLabel jLabelid_unidadProductoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadProductoProdu;
	public JButton jButtonid_unidadProductoProdu= new JButtonMe();
	public JButton jButtonid_unidadProductoProduUpdate= new JButtonMe();
	public JButton jButtonid_unidadProductoProduBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductoProdu;
	
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
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProductoProduDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductoProdu=new JPanel();
				this.jPanelAccionesFormularioProductoProdu=new JPanel();
				this.jmenuBarDetalleProductoProdu=new JMenuBar();
				this.jTtoolBarDetalleProductoProdu=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductoProduDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductoProdu() {
		return this.jButtonActualizarToolBarProductoProdu;
	}
	
	public JButton getjButtonEliminarToolBarProductoProdu() {
		return this.jButtonEliminarToolBarProductoProdu;
	}
	
	public JButton getjButtonCancelarToolBarProductoProdu() {
		return this.jButtonCancelarToolBarProductoProdu;
	}		
	
	public JButton getjButtonProcesarInformacionProductoProdu() {
		return this.jButtonProcesarInformacionProductoProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoProdu)	{
		this.jButtonProcesarInformacionProductoProdu = jButtonProcesarInformacionProductoProdu;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoProdu() {
		return this.jComboBoxTiposAccionesProductoProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoProdu(
			JComboBox jComboBoxTiposRelacionesProductoProdu) {
		this.jComboBoxTiposRelacionesProductoProdu = jComboBoxTiposRelacionesProductoProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoProdu(
			JComboBox jComboBoxTiposAccionesProductoProdu) {
		this.jComboBoxTiposAccionesProductoProdu = jComboBoxTiposAccionesProductoProdu;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductoProdu() {
		return this.jComboBoxTiposAccionesFormularioProductoProdu;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductoProdu(
			JComboBox jComboBoxTiposAccionesFormularioProductoProdu) {
		this.jComboBoxTiposAccionesFormularioProductoProdu = jComboBoxTiposAccionesFormularioProductoProdu;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productoproduSessionBean=new ProductoProduSessionBean();
		
		this.productoproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoproduSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto Parte Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productoproduSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductoProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductoProdu= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductoProdu=new JButtonMe();
				this.jButtonModificarToolBarProductoProdu=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductoProdu,this.jTtoolBarDetalleProductoProdu,
							"actualizar","actualizar","Actualizar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductoProdu,this.jTtoolBarDetalleProductoProdu,
							"eliminar","eliminar","Eliminar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductoProdu,this.jTtoolBarDetalleProductoProdu,
							"cancelar","cancelar","Cancelar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductoProdu,this.jTtoolBarDetalleProductoProdu,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductoProdu=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductoProdu=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductoProdu=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductoProdu=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductoProdu=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductoProdu= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductoProdu.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductoProdu,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductoProdu= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductoProdu.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductoProdu,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductoProdu= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductoProdu.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductoProdu,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductoProdu= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductoProdu.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductoProdu,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductoProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductoProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductoProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductoProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductoProdu.add(this.jMenuItemDetalleCerrarProductoProdu);
		
		this.jmenuDetalleAccionesProductoProdu.add(this.jMenuItemActualizarProductoProdu);
		this.jmenuDetalleAccionesProductoProdu.add(this.jMenuItemEliminarProductoProdu);
		this.jmenuDetalleAccionesProductoProdu.add(this.jMenuItemCancelarProductoProdu);		
		
		//this.jmenuDetalleDatosProductoProdu.add(this.jMenuItemDetalleAbrirOrderByProductoProdu);				
		this.jmenuDetalleDatosProductoProdu.add(this.jMenuItemDetalleMostarOcultarProductoProdu);				
				
		//this.jmenuDetalleAccionesProductoProdu.add(this.jMenuItemGuardarCambiosProductoProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductoProdu.add(this.jmenuDetalleArchivoProductoProdu);		
		this.jmenuBarDetalleProductoProdu.add(this.jmenuDetalleAccionesProductoProdu);		
		this.jmenuBarDetalleProductoProdu.add(this.jmenuDetalleDatosProductoProdu);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductoProdu);				
	}
	
	
	public void inicializarElementosCamposProductoProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductoProdu = new JLabelMe();
		jLabelIdProductoProdu.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductoProdu = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductoProdu.setToolTipText(ProductoProduConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductoProdu= new GridBagLayout();

		this.jPanelidProductoProdu.setLayout(this.gridaBagLayoutProductoProdu);

		jLabelidProductoProdu = new JLabel();
		jLabelidProductoProdu.setText("Id");

		jLabelidProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelporcentajeProductoProdu = new JLabelMe();
		this.jLabelporcentajeProductoProdu.setText(""+ProductoProduConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeProductoProdu.setToolTipText("Porcentaje");
		this.jLabelporcentajeProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeProductoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeProductoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeProductoProdu.setToolTipText(ProductoProduConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutProductoProdu = new GridBagLayout();
		this.jPanelporcentajeProductoProdu.setLayout(this.gridaBagLayoutProductoProdu);


		jTextFieldporcentajeProductoProdu= new JTextFieldMe();
		jTextFieldporcentajeProductoProdu.setEnabled(false);
		jTextFieldporcentajeProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeProductoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeProductoProdu.setText("0.0");

		this.jButtonporcentajeProductoProduBusqueda= new JButtonMe();
		this.jButtonporcentajeProductoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeProductoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeProductoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeProductoProduBusqueda.setText("U");
		this.jButtonporcentajeProductoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeProductoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeProductoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeProductoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeProductoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeProductoProduBusqueda"));

		if(this.productoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeProductoProduBusqueda.setVisible(false);		}


					
		this.jLabelcantidadProductoProdu = new JLabelMe();
		this.jLabelcantidadProductoProdu.setText(""+ProductoProduConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadProductoProdu.setToolTipText("Cantad");
		this.jLabelcantidadProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadProductoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadProductoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadProductoProdu.setToolTipText(ProductoProduConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutProductoProdu = new GridBagLayout();
		this.jPanelcantidadProductoProdu.setLayout(this.gridaBagLayoutProductoProdu);


		jTextFieldcantidadProductoProdu= new JTextFieldMe();
		jTextFieldcantidadProductoProdu.setEnabled(false);
		jTextFieldcantidadProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadProductoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadProductoProdu.setText("0");

		this.jButtoncantidadProductoProduBusqueda= new JButtonMe();
		this.jButtoncantidadProductoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadProductoProduBusqueda.setText("U");
		this.jButtoncantidadProductoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadProductoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadProductoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadProductoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadProductoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadProductoProduBusqueda"));

		if(this.productoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadProductoProduBusqueda.setVisible(false);		}


					
		this.jLabelcostoProductoProdu = new JLabelMe();
		this.jLabelcostoProductoProdu.setText(""+ProductoProduConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoProductoProdu.setToolTipText("Costo");
		this.jLabelcostoProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoProductoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoProductoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoProductoProdu.setToolTipText(ProductoProduConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutProductoProdu = new GridBagLayout();
		this.jPanelcostoProductoProdu.setLayout(this.gridaBagLayoutProductoProdu);


		jTextFieldcostoProductoProdu= new JTextFieldMe();
		jTextFieldcostoProductoProdu.setEnabled(false);
		jTextFieldcostoProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoProductoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoProductoProdu.setText("0.0");

		this.jButtoncostoProductoProduBusqueda= new JButtonMe();
		this.jButtoncostoProductoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoProductoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoProductoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoProductoProduBusqueda.setText("U");
		this.jButtoncostoProductoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoProductoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoProductoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoProductoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoProductoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoProductoProduBusqueda"));

		if(this.productoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoProductoProduBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalProductoProdu = new JLabelMe();
		this.jLabelcosto_totalProductoProdu.setText(""+ProductoProduConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalProductoProdu.setToolTipText("Costo Total");
		this.jLabelcosto_totalProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalProductoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalProductoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalProductoProdu.setToolTipText(ProductoProduConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutProductoProdu = new GridBagLayout();
		this.jPanelcosto_totalProductoProdu.setLayout(this.gridaBagLayoutProductoProdu);


		jTextFieldcosto_totalProductoProdu= new JTextFieldMe();
		jTextFieldcosto_totalProductoProdu.setEnabled(false);
		jTextFieldcosto_totalProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalProductoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalProductoProdu.setText("0.0");

		this.jButtoncosto_totalProductoProduBusqueda= new JButtonMe();
		this.jButtoncosto_totalProductoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProductoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProductoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalProductoProduBusqueda.setText("U");
		this.jButtoncosto_totalProductoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalProductoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalProductoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalProductoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalProductoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalProductoProduBusqueda"));

		if(this.productoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalProductoProduBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionProductoProdu = new JLabelMe();
		this.jLabeldescripcionProductoProdu.setText(""+ProductoProduConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionProductoProdu.setToolTipText("Descripcion");
		this.jLabeldescripcionProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionProductoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionProductoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionProductoProdu.setToolTipText(ProductoProduConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutProductoProdu = new GridBagLayout();
		this.jPaneldescripcionProductoProdu.setLayout(this.gridaBagLayoutProductoProdu);


		jTextAreadescripcionProductoProdu= new JTextAreaMe();
		jTextAreadescripcionProductoProdu.setEnabled(false);
		jTextAreadescripcionProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoProdu.setLineWrap(true);
		jTextAreadescripcionProductoProdu.setWrapStyleWord(true);
		jTextAreadescripcionProductoProdu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionProductoProdu.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionProductoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionProductoProdu = new JScrollPane(jTextAreadescripcionProductoProdu);
		jscrollPanedescripcionProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionProductoProduBusqueda= new JButtonMe();
		this.jButtondescripcionProductoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionProductoProduBusqueda.setText("U");
		this.jButtondescripcionProductoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionProductoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionProductoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionProductoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionProductoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionProductoProduBusqueda"));

		if(this.productoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionProductoProduBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductoProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_producto_defi_produProductoProdu = new JLabelMe();
		this.jLabelid_producto_defi_produProductoProdu.setText(""+ProductoProduConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU+" : *");
		this.jLabelid_producto_defi_produProductoProdu.setToolTipText("Producto Defi Produ");
		this.jLabelid_producto_defi_produProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_producto_defi_produProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_producto_defi_produProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_producto_defi_produProductoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_producto_defi_produProductoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_producto_defi_produProductoProdu.setToolTipText(ProductoProduConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU);
		this.gridaBagLayoutProductoProdu = new GridBagLayout();
		this.jPanelid_producto_defi_produProductoProdu.setLayout(this.gridaBagLayoutProductoProdu);


		jComboBoxid_producto_defi_produProductoProdu= new JComboBoxMe();
		jComboBoxid_producto_defi_produProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_defi_produProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_defi_produProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_producto_defi_produProductoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_producto_defi_produProductoProdu= new JButtonMe();
		this.jButtonid_producto_defi_produProductoProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_defi_produProductoProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_defi_produProductoProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_defi_produProductoProdu.setText("Buscar");
		this.jButtonid_producto_defi_produProductoProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_producto_defi_produProductoProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_defi_produProductoProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_producto_defi_produProductoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_defi_produProductoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_defi_produProductoProdu"));

		this.jButtonid_producto_defi_produProductoProduBusqueda= new JButtonMe();
		this.jButtonid_producto_defi_produProductoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_defi_produProductoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_defi_produProductoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_producto_defi_produProductoProduBusqueda.setText("U");
		this.jButtonid_producto_defi_produProductoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_producto_defi_produProductoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_defi_produProductoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_producto_defi_produProductoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_defi_produProductoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_defi_produProductoProduBusqueda"));

		if(this.productoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_producto_defi_produProductoProduBusqueda.setVisible(false);		}

		this.jButtonid_producto_defi_produProductoProduUpdate= new JButtonMe();
		this.jButtonid_producto_defi_produProductoProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_defi_produProductoProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_defi_produProductoProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_producto_defi_produProductoProduUpdate.setText("U");
		this.jButtonid_producto_defi_produProductoProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_producto_defi_produProductoProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_defi_produProductoProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_producto_defi_produProductoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_defi_produProductoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_defi_produProductoProduUpdate"));



					
		this.jLabelid_bodegaProductoProdu = new JLabelMe();
		this.jLabelid_bodegaProductoProdu.setText(""+ProductoProduConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaProductoProdu.setToolTipText("Bodega");
		this.jLabelid_bodegaProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaProductoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaProductoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaProductoProdu.setToolTipText(ProductoProduConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutProductoProdu = new GridBagLayout();
		this.jPanelid_bodegaProductoProdu.setLayout(this.gridaBagLayoutProductoProdu);


		jComboBoxid_bodegaProductoProdu= new JComboBoxMe();
		jComboBoxid_bodegaProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaProductoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaProductoProdu= new JButtonMe();
		this.jButtonid_bodegaProductoProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoProdu.setText("Buscar");
		this.jButtonid_bodegaProductoProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaProductoProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaProductoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoProdu"));

		this.jButtonid_bodegaProductoProduBusqueda= new JButtonMe();
		this.jButtonid_bodegaProductoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductoProduBusqueda.setText("U");
		this.jButtonid_bodegaProductoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaProductoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaProductoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoProduBusqueda"));

		if(this.productoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaProductoProduBusqueda.setVisible(false);		}

		this.jButtonid_bodegaProductoProduUpdate= new JButtonMe();
		this.jButtonid_bodegaProductoProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductoProduUpdate.setText("U");
		this.jButtonid_bodegaProductoProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaProductoProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaProductoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoProduUpdate"));



					
		this.jLabelid_productoProductoProdu = new JLabelMe();
		this.jLabelid_productoProductoProdu.setText(""+ProductoProduConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoProductoProdu.setToolTipText("Producto");
		this.jLabelid_productoProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoProductoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoProductoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoProductoProdu.setToolTipText(ProductoProduConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutProductoProdu = new GridBagLayout();
		this.jPanelid_productoProductoProdu.setLayout(this.gridaBagLayoutProductoProdu);


		jComboBoxid_productoProductoProdu= new JComboBoxMe();
		jComboBoxid_productoProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoProductoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoProductoProdu= new JButtonMe();
		this.jButtonid_productoProductoProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoProdu.setText("Buscar");
		this.jButtonid_productoProductoProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoProductoProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoProductoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoProdu"));

		this.jButtonid_productoProductoProduBusqueda= new JButtonMe();
		this.jButtonid_productoProductoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoProduBusqueda.setText("U");
		this.jButtonid_productoProductoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoProductoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoProductoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoProduBusqueda"));

		if(this.productoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoProductoProduBusqueda.setVisible(false);		}

		this.jButtonid_productoProductoProduUpdate= new JButtonMe();
		this.jButtonid_productoProductoProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoProduUpdate.setText("U");
		this.jButtonid_productoProductoProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoProductoProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoProductoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoProduUpdate"));



					
		this.jLabelid_unidadProductoProdu = new JLabelMe();
		this.jLabelid_unidadProductoProdu.setText(""+ProductoProduConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadProductoProdu.setToolTipText("Unad");
		this.jLabelid_unidadProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadProductoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadProductoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadProductoProdu.setToolTipText(ProductoProduConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutProductoProdu = new GridBagLayout();
		this.jPanelid_unidadProductoProdu.setLayout(this.gridaBagLayoutProductoProdu);


		jComboBoxid_unidadProductoProdu= new JComboBoxMe();
		jComboBoxid_unidadProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadProductoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadProductoProdu= new JButtonMe();
		this.jButtonid_unidadProductoProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoProdu.setText("Buscar");
		this.jButtonid_unidadProductoProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadProductoProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadProductoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoProdu"));

		this.jButtonid_unidadProductoProduBusqueda= new JButtonMe();
		this.jButtonid_unidadProductoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoProduBusqueda.setText("U");
		this.jButtonid_unidadProductoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadProductoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadProductoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoProduBusqueda"));

		if(this.productoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadProductoProduBusqueda.setVisible(false);		}

		this.jButtonid_unidadProductoProduUpdate= new JButtonMe();
		this.jButtonid_unidadProductoProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoProduUpdate.setText("U");
		this.jButtonid_unidadProductoProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadProductoProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadProductoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoProduUpdate"));



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
		//this.jInternalFrameDetalleProductoProdu = new ProductoProduBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Producto Parte Produccion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoProdu= new GridBagLayout();
		

		
		String sToolTipProductoProdu="";
		sToolTipProductoProdu=ProductoProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoProdu+="(Produccion.ProductoProdu)";
		}
		
		if(!this.productoproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoProdu+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductoProdu = new JButtonMe();
		this.jButtonModificarProductoProdu = new JButtonMe();
        this.jButtonActualizarProductoProdu = new JButtonMe();
        this.jButtonEliminarProductoProdu = new JButtonMe();
        this.jButtonCancelarProductoProdu = new JButtonMe();
        this.jButtonGuardarCambiosProductoProdu = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductoProdu = new JButtonMe();
		this.jButtonCerrarProductoProdu = new JButtonMe();
		
		this.jScrollPanelDatosProductoProdu = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductoProdu = new JScrollPane();
		this.jScrollPanelDatosGeneralProductoProdu = new JScrollPane();
				
		
		
		this.jPanelCamposProductoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Parte Produccion";
		
		if(!this.productoproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Parte Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductoProdu.setName("jPanelCamposProductoProdu"); 

		this.jPanelCamposOcultosProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductoProdu.setName("jPanelCamposOcultosProductoProdu"); 

        this.jPanelAccionesProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoProdu.setToolTipText("Acciones");
        this.jPanelAccionesProductoProdu.setName("Acciones"); 

		this.jPanelAccionesFormularioProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductoProdu.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductoProdu.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductoProdu.setText("Nuevo");
		this.jButtonModificarProductoProdu.setText("Editar");
        this.jButtonActualizarProductoProdu.setText("Actualizar");
        this.jButtonEliminarProductoProdu.setText("Eliminar");
        this.jButtonCancelarProductoProdu.setText("Cancelar");
        this.jButtonGuardarCambiosProductoProdu.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductoProdu.setText("Guardar");
		this.jButtonCerrarProductoProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoProdu,"nuevo_button","Nuevo",this.productoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductoProdu,"modificar_button","Editar",this.productoproduSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductoProdu,"actualizar_button","Actualizar",this.productoproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductoProdu,"eliminar_button","Eliminar",this.productoproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductoProdu,"cancelar_button","Cancelar",this.productoproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductoProdu,"guardarcambios_button","Guardar",this.productoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoProdu,"guardarcambiostabla_button","Guardar",this.productoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoProdu,"cerrar_button","Salir",this.productoproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductoProdu.setToolTipText("Nuevo"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductoProdu.setToolTipText("Editar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductoProdu.setToolTipText("Actualizar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductoProdu.setToolTipText("Eliminar)"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductoProdu.setToolTipText("Cancelar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductoProdu.setToolTipText("Guardar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductoProdu.setToolTipText("Guardar"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoProdu.setToolTipText("Salir"+" "+ProductoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoProdu";
		inputMap = this.jButtonNuevoProductoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoProdu"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductoProdu";
		inputMap = this.jButtonActualizarProductoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductoProdu"));
		
		//ELIMINAR
		sMapKey = "EliminarProductoProdu";
		inputMap = this.jButtonEliminarProductoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductoProdu"));
		
		//CANCELAR	
		sMapKey = "CancelarProductoProdu";
		inputMap = this.jButtonCancelarProductoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductoProdu"));
		
		//CERRAR		
		sMapKey = "CerrarProductoProdu";
		inputMap = this.jButtonCerrarProductoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoProdu";
		inputMap = this.jButtonGuardarCambiosTablaProductoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoProdu"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductoProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductoProdu.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductoProdu.setToolTipText("Nuevo ProductoProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductoProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductoProdu.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductoProdu.setToolTipText("Sin Cerrar Ventana ProductoProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductoProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductoProdu.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductoProdu.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductoProdu, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductoProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoProdu.setText("Accion");
		this.jComboBoxTiposAccionesProductoProdu.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductoProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductoProdu.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductoProdu.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductoProdu = new JLabelMe();
		
		this.jLabelAccionesProductoProdu.setText("Acciones");		
		this.jLabelAccionesProductoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductoProdu();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductoProdu();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductoProdu=new JTabbedPane();
		this.jTabbedPaneRelacionesProductoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductoProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductoProdu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoProdu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoProdu.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductoProdu, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductoProdu = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductoProdu = new GridBagLayout();
		
		this.jPanelCamposProductoProdu.setLayout(gridaBagLayoutCamposProductoProdu);
		this.jPanelCamposOcultosProductoProdu.setLayout(gridaBagLayoutCamposOcultosProductoProdu);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProdu.gridy = 0;
	this.gridBagConstraintsProductoProdu.gridx = 0;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductoProdu.add(jLabelIdProductoProdu, this.gridBagConstraintsProductoProdu);



	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProdu.gridy = 0;
	this.gridBagConstraintsProductoProdu.gridx = 1;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductoProdu.add(jLabelidProductoProdu, this.gridBagConstraintsProductoProdu);


	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProdu.gridy = 0;
	this.gridBagConstraintsProductoProdu.gridx = 0;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_producto_defi_produProductoProdu.add(jLabelid_producto_defi_produProductoProdu, this.gridBagConstraintsProductoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = 0;
		this.gridBagConstraintsProductoProdu.gridx = 2;
		this.gridBagConstraintsProductoProdu.ipadx = 0;
		this.gridBagConstraintsProductoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_producto_defi_produProductoProdu.add(jButtonid_producto_defi_produProductoProduBusqueda, this.gridBagConstraintsProductoProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = 0;
		this.gridBagConstraintsProductoProdu.gridx = 3;
		this.gridBagConstraintsProductoProdu.ipadx = 0;
		this.gridBagConstraintsProductoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_producto_defi_produProductoProdu.add(jButtonid_producto_defi_produProductoProduUpdate, this.gridBagConstraintsProductoProdu);
	}

	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProdu.gridy = 0;
	this.gridBagConstraintsProductoProdu.gridx = 1;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_producto_defi_produProductoProdu.add(jComboBoxid_producto_defi_produProductoProdu, this.gridBagConstraintsProductoProdu);


	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProdu.gridy = 0;
	this.gridBagConstraintsProductoProdu.gridx = 0;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaProductoProdu.add(jLabelid_bodegaProductoProdu, this.gridBagConstraintsProductoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = 0;
		this.gridBagConstraintsProductoProdu.gridx = 2;
		this.gridBagConstraintsProductoProdu.ipadx = 0;
		this.gridBagConstraintsProductoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductoProdu.add(jButtonid_bodegaProductoProduBusqueda, this.gridBagConstraintsProductoProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = 0;
		this.gridBagConstraintsProductoProdu.gridx = 3;
		this.gridBagConstraintsProductoProdu.ipadx = 0;
		this.gridBagConstraintsProductoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductoProdu.add(jButtonid_bodegaProductoProduUpdate, this.gridBagConstraintsProductoProdu);
	}

	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProdu.gridy = 0;
	this.gridBagConstraintsProductoProdu.gridx = 1;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaProductoProdu.add(jComboBoxid_bodegaProductoProdu, this.gridBagConstraintsProductoProdu);


	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProdu.gridy = 0;
	this.gridBagConstraintsProductoProdu.gridx = 0;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoProductoProdu.add(jLabelid_productoProductoProdu, this.gridBagConstraintsProductoProdu);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	//this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProdu.gridy = 0;
	this.gridBagConstraintsProductoProdu.gridx = 2;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	this.gridBagConstraintsProductoProdu.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoProductoProdu.add(jButtonid_productoProductoProdu, this.gridBagConstraintsProductoProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = 0;
		this.gridBagConstraintsProductoProdu.gridx = 3;
		this.gridBagConstraintsProductoProdu.ipadx = 0;
		this.gridBagConstraintsProductoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoProdu.add(jButtonid_productoProductoProduBusqueda, this.gridBagConstraintsProductoProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = 0;
		this.gridBagConstraintsProductoProdu.gridx = 4;
		this.gridBagConstraintsProductoProdu.ipadx = 0;
		this.gridBagConstraintsProductoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoProdu.add(jButtonid_productoProductoProduUpdate, this.gridBagConstraintsProductoProdu);
	}

	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProdu.gridy = 0;
	this.gridBagConstraintsProductoProdu.gridx = 1;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoProductoProdu.add(jComboBoxid_productoProductoProdu, this.gridBagConstraintsProductoProdu);


	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProdu.gridy = 0;
	this.gridBagConstraintsProductoProdu.gridx = 0;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadProductoProdu.add(jLabelid_unidadProductoProdu, this.gridBagConstraintsProductoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = 0;
		this.gridBagConstraintsProductoProdu.gridx = 2;
		this.gridBagConstraintsProductoProdu.ipadx = 0;
		this.gridBagConstraintsProductoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoProdu.add(jButtonid_unidadProductoProduBusqueda, this.gridBagConstraintsProductoProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = 0;
		this.gridBagConstraintsProductoProdu.gridx = 3;
		this.gridBagConstraintsProductoProdu.ipadx = 0;
		this.gridBagConstraintsProductoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoProdu.add(jButtonid_unidadProductoProduUpdate, this.gridBagConstraintsProductoProdu);
	}

	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProdu.gridy = 0;
	this.gridBagConstraintsProductoProdu.gridx = 1;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadProductoProdu.add(jComboBoxid_unidadProductoProdu, this.gridBagConstraintsProductoProdu);


	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProdu.gridy = 0;
	this.gridBagConstraintsProductoProdu.gridx = 0;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeProductoProdu.add(jLabelporcentajeProductoProdu, this.gridBagConstraintsProductoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = 0;
		this.gridBagConstraintsProductoProdu.gridx = 2;
		this.gridBagConstraintsProductoProdu.ipadx = 0;
		this.gridBagConstraintsProductoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeProductoProdu.add(jButtonporcentajeProductoProduBusqueda, this.gridBagConstraintsProductoProdu);
	}

	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProdu.gridy = 0;
	this.gridBagConstraintsProductoProdu.gridx = 1;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeProductoProdu.add(jTextFieldporcentajeProductoProdu, this.gridBagConstraintsProductoProdu);


	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProdu.gridy = 0;
	this.gridBagConstraintsProductoProdu.gridx = 0;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadProductoProdu.add(jLabelcantidadProductoProdu, this.gridBagConstraintsProductoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = 0;
		this.gridBagConstraintsProductoProdu.gridx = 2;
		this.gridBagConstraintsProductoProdu.ipadx = 0;
		this.gridBagConstraintsProductoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadProductoProdu.add(jButtoncantidadProductoProduBusqueda, this.gridBagConstraintsProductoProdu);
	}

	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProdu.gridy = 0;
	this.gridBagConstraintsProductoProdu.gridx = 1;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadProductoProdu.add(jTextFieldcantidadProductoProdu, this.gridBagConstraintsProductoProdu);


	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProdu.gridy = 0;
	this.gridBagConstraintsProductoProdu.gridx = 0;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoProductoProdu.add(jLabelcostoProductoProdu, this.gridBagConstraintsProductoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = 0;
		this.gridBagConstraintsProductoProdu.gridx = 2;
		this.gridBagConstraintsProductoProdu.ipadx = 0;
		this.gridBagConstraintsProductoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoProductoProdu.add(jButtoncostoProductoProduBusqueda, this.gridBagConstraintsProductoProdu);
	}

	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProdu.gridy = 0;
	this.gridBagConstraintsProductoProdu.gridx = 1;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoProductoProdu.add(jTextFieldcostoProductoProdu, this.gridBagConstraintsProductoProdu);


	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProdu.gridy = 0;
	this.gridBagConstraintsProductoProdu.gridx = 0;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalProductoProdu.add(jLabelcosto_totalProductoProdu, this.gridBagConstraintsProductoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = 0;
		this.gridBagConstraintsProductoProdu.gridx = 2;
		this.gridBagConstraintsProductoProdu.ipadx = 0;
		this.gridBagConstraintsProductoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalProductoProdu.add(jButtoncosto_totalProductoProduBusqueda, this.gridBagConstraintsProductoProdu);
	}

	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProdu.gridy = 0;
	this.gridBagConstraintsProductoProdu.gridx = 1;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalProductoProdu.add(jTextFieldcosto_totalProductoProdu, this.gridBagConstraintsProductoProdu);


	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProdu.gridy = 0;
	this.gridBagConstraintsProductoProdu.gridx = 0;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionProductoProdu.add(jLabeldescripcionProductoProdu, this.gridBagConstraintsProductoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProdu.gridy = 0;
		this.gridBagConstraintsProductoProdu.gridx = 2;
		this.gridBagConstraintsProductoProdu.ipadx = 0;
		this.gridBagConstraintsProductoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionProductoProdu.add(jButtondescripcionProductoProduBusqueda, this.gridBagConstraintsProductoProdu);
	}

	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProdu.gridy = 0;
	this.gridBagConstraintsProductoProdu.gridx = 1;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionProductoProdu.add(jscrollPanedescripcionProductoProdu, this.gridBagConstraintsProductoProdu);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProdu.gridy = iYPanelCamposProductoProdu;
	this.gridBagConstraintsProductoProdu.gridx = iXPanelCamposProductoProdu++;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProdu.add(this.jPanelidProductoProdu, this.gridBagConstraintsProductoProdu);



	if(iXPanelCamposProductoProdu % 1==0) {
		iXPanelCamposProductoProdu=0;
		iYPanelCamposProductoProdu++;
	}
	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProdu.gridy = iYPanelCamposProductoProdu;
	this.gridBagConstraintsProductoProdu.gridx = iXPanelCamposProductoProdu++;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProdu.add(this.jPanelid_producto_defi_produProductoProdu, this.gridBagConstraintsProductoProdu);



	if(iXPanelCamposProductoProdu % 1==0) {
		iXPanelCamposProductoProdu=0;
		iYPanelCamposProductoProdu++;
	}
	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProdu.gridy = iYPanelCamposProductoProdu;
	this.gridBagConstraintsProductoProdu.gridx = iXPanelCamposProductoProdu++;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProdu.add(this.jPanelid_bodegaProductoProdu, this.gridBagConstraintsProductoProdu);



	if(iXPanelCamposProductoProdu % 1==0) {
		iXPanelCamposProductoProdu=0;
		iYPanelCamposProductoProdu++;
	}
	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProdu.gridy = iYPanelCamposProductoProdu;
	this.gridBagConstraintsProductoProdu.gridx = iXPanelCamposProductoProdu++;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProdu.add(this.jPanelid_productoProductoProdu, this.gridBagConstraintsProductoProdu);



	if(iXPanelCamposProductoProdu % 1==0) {
		iXPanelCamposProductoProdu=0;
		iYPanelCamposProductoProdu++;
	}
	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProdu.gridy = iYPanelCamposProductoProdu;
	this.gridBagConstraintsProductoProdu.gridx = iXPanelCamposProductoProdu++;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProdu.add(this.jPanelid_unidadProductoProdu, this.gridBagConstraintsProductoProdu);



	if(iXPanelCamposProductoProdu % 1==0) {
		iXPanelCamposProductoProdu=0;
		iYPanelCamposProductoProdu++;
	}
	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProdu.gridy = iYPanelCamposProductoProdu;
	this.gridBagConstraintsProductoProdu.gridx = iXPanelCamposProductoProdu++;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProdu.add(this.jPanelporcentajeProductoProdu, this.gridBagConstraintsProductoProdu);



	if(iXPanelCamposProductoProdu % 1==0) {
		iXPanelCamposProductoProdu=0;
		iYPanelCamposProductoProdu++;
	}
	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProdu.gridy = iYPanelCamposProductoProdu;
	this.gridBagConstraintsProductoProdu.gridx = iXPanelCamposProductoProdu++;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProdu.add(this.jPanelcantidadProductoProdu, this.gridBagConstraintsProductoProdu);



	if(iXPanelCamposProductoProdu % 1==0) {
		iXPanelCamposProductoProdu=0;
		iYPanelCamposProductoProdu++;
	}
	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProdu.gridy = iYPanelCamposProductoProdu;
	this.gridBagConstraintsProductoProdu.gridx = iXPanelCamposProductoProdu++;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProdu.add(this.jPanelcostoProductoProdu, this.gridBagConstraintsProductoProdu);



	if(iXPanelCamposProductoProdu % 1==0) {
		iXPanelCamposProductoProdu=0;
		iYPanelCamposProductoProdu++;
	}
	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProdu.gridy = iYPanelCamposProductoProdu;
	this.gridBagConstraintsProductoProdu.gridx = iXPanelCamposProductoProdu++;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProdu.add(this.jPanelcosto_totalProductoProdu, this.gridBagConstraintsProductoProdu);



	if(iXPanelCamposProductoProdu % 1==0) {
		iXPanelCamposProductoProdu=0;
		iYPanelCamposProductoProdu++;
	}
	this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProdu.gridy = iYPanelCamposProductoProdu;
	this.gridBagConstraintsProductoProdu.gridx = iXPanelCamposProductoProdu++;
	this.gridBagConstraintsProductoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProdu.add(this.jPaneldescripcionProductoProdu, this.gridBagConstraintsProductoProdu);



	if(iXPanelCamposProductoProdu % 1==0) {
		iXPanelCamposProductoProdu=0;
		iYPanelCamposProductoProdu++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductoProdu= new GridBagLayout();
		this.jPanelAccionesProductoProdu.setLayout(gridaBagLayoutAccionesProductoProdu);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductoProdu= new GridBagLayout();
		this.jPanelAccionesFormularioProductoProdu.setLayout(gridaBagLayoutAccionesFormularioProductoProdu);
		
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoProdu.add(this.jComboBoxTiposAccionesFormularioProductoProdu, this.gridBagConstraintsProductoProdu);

		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoProdu.add(this.jCheckBoxPostAccionNuevoProductoProdu, this.gridBagConstraintsProductoProdu);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.productoproduSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoProdu.add(this.jCheckBoxPostAccionSinCerrarProductoProdu, this.gridBagConstraintsProductoProdu);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.productoproduSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.productoproduSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoProdu.add(this.jCheckBoxPostAccionSinMensajeProductoProdu, this.gridBagConstraintsProductoProdu);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProdu.gridy = 0;
		this.gridBagConstraintsProductoProdu.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductoProdu.add(this.jButtonModificarProductoProdu, this.gridBagConstraintsProductoProdu);							

		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProdu.gridy = 0;
		this.gridBagConstraintsProductoProdu.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductoProdu.add(this.jButtonEliminarProductoProdu, this.gridBagConstraintsProductoProdu);
		
			
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.gridy = 0;		
		this.gridBagConstraintsProductoProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoProdu.add(this.jButtonActualizarProductoProdu, this.gridBagConstraintsProductoProdu);


		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.gridy = 0;		
		this.gridBagConstraintsProductoProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoProdu.add(this.jButtonGuardarCambiosProductoProdu, this.gridBagConstraintsProductoProdu);	
		
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.gridy = 0;		
		this.gridBagConstraintsProductoProdu.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductoProdu.add(this.jButtonCancelarProductoProdu, this.gridBagConstraintsProductoProdu);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoProdu);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();						
			this.gridBagConstraintsProductoProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoProdu.gridx = 0;		
			//this.gridBagConstraintsProductoProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoProdu.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoProdu.gridx =0;
		this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoProdu, this.gridBagConstraintsProductoProdu);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductoProduJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductoProdu = new ProductoProduBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Producto Parte Produccion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Producto Parte Produccion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Producto Parte Produccion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductoProduModel productoproduModel=new ProductoProduModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductoProduModel.ProductoProduFocusTraversalPolicy productoproduFocusTraversalPolicy = productoproduModel.new ProductoProduFocusTraversalPolicy(this);
			
			//productoproduFocusTraversalPolicy.setproductoproduJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productoproduModel);
			
			
			this.jContentPaneDetalleProductoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductoProdu = new GridBagLayout();	
			this.jContentPaneDetalleProductoProdu.setLayout(gridaBagLayoutDetalleProductoProdu);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoProdu = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductoProdu = new GridBagConstraints();
				this.gridBagConstraintsProductoProdu.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductoProdu.gridx = 0;
					
				
				this.jContentPaneDetalleProductoProdu.add(jTtoolBarDetalleProductoProdu, gridBagConstraintsProductoProdu);								
				
}
			
			this.jScrollPanelDatosEdicionProductoProdu=   new JScrollPane(jContentPaneDetalleProductoProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductoProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductoProdu.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductoProdu.gridx = 0;
	        
			this.jContentPaneDetalleProductoProdu.add(jPanelCamposProductoProdu, gridBagConstraintsProductoProdu);
			
			
			
			
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
						&& productoproduSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productoproduSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductoProdu= new GridBagConstraints();
						this.gridBagConstraintsProductoProdu.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductoProdu.gridx = 0;
						this.jContentPaneDetalleProductoProdu.add(this.jTabbedPaneRelacionesProductoProdu, this.gridBagConstraintsProductoProdu);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductoProdu.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductoProdu.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductoProdu = new GridBagConstraints();
					this.gridBagConstraintsProductoProdu.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductoProdu.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductoProdu.gridx = 0;
					
				
					this.jContentPaneDetalleProductoProdu.add(jPanelCamposOcultosProductoProdu, gridBagConstraintsProductoProdu);
				
					this.jPanelCamposOcultosProductoProdu.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductoProdu.gridx = 0;
	        this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductoProdu.add(this.jPanelAccionesFormularioProductoProdu, this.gridBagConstraintsProductoProdu);							
			
			
			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
	        this.gridBagConstraintsProductoProdu.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductoProdu.gridx = 0;
	        
			
			this.jContentPaneDetalleProductoProdu.add(this.jPanelAccionesProductoProdu, this.gridBagConstraintsProductoProdu);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductoProdu);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductoProdu=   new JScrollPane(this.jPanelCamposProductoProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductoProdu.gridx = 0;
			this.gridBagConstraintsProductoProdu.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductoProdu.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductoProdu.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductoProdu, this.gridBagConstraintsProductoProdu);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductoProdu, this.gridBagConstraintsProductoProdu);			
			
			this.gridBagConstraintsProductoProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductoProdu, this.gridBagConstraintsProductoProdu);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoProdu, this.gridBagConstraintsProductoProdu);
			
			
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoProdu, this.gridBagConstraintsProductoProdu);
		
			
		this.gridBagConstraintsProductoProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoProdu, this.gridBagConstraintsProductoProdu);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductoProdu;//jContentPane;
		
		return jScrollPanelDatosEdicionProductoProdu;
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
