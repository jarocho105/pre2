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
import com.bydan.erp.produccion.util.ProductoOrdenDetaProduConstantesFunciones;

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
public class ProductoOrdenDetaProduDetalleFormJInternalFrame extends ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductoOrdenDetaProdu;
	
	protected JMenuBar jmenuBarDetalleProductoOrdenDetaProdu;
	
	protected JMenu jmenuDetalleProductoOrdenDetaProdu;
	protected JMenu jmenuDetalleArchivoProductoOrdenDetaProdu;
	protected JMenu jmenuDetalleAccionesProductoOrdenDetaProdu;
	protected JMenu jmenuDetalleDatosProductoOrdenDetaProdu;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductoOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoOrdenDetaProdu;	
	protected GridBagConstraints gridBagConstraintsProductoOrdenDetaProdu;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductoOrdenDetaProdu;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected OrdenDetaProduBeanSwingJInternalFrame ordendetaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ordendetaprodu="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public ProductoOrdenDetaProduSessionBean productoordendetaproduSessionBean;
	
	
	
	
	public OrdenDetaProduSessionBean ordendetaproduSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;	
	
	public ProductoOrdenDetaProduLogic productoordendetaproduLogic;
	
	public JScrollPane jScrollPanelDatosProductoOrdenDetaProdu;
	public JScrollPane jScrollPanelDatosEdicionProductoOrdenDetaProdu;
	public JScrollPane jScrollPanelDatosGeneralProductoOrdenDetaProdu;
	
	protected JPanel jPanelCamposProductoOrdenDetaProdu;    
	protected JPanel jPanelCamposOcultosProductoOrdenDetaProdu;    	
	protected JPanel jPanelAccionesProductoOrdenDetaProdu;
	protected JPanel jPanelAccionesFormularioProductoOrdenDetaProdu;
    
	
	
	protected Integer iXPanelCamposProductoOrdenDetaProdu=0;
	protected Integer iYPanelCamposProductoOrdenDetaProdu=0;
	
	protected Integer iXPanelCamposOcultosProductoOrdenDetaProdu=0;
	protected Integer iYPanelCamposOcultosProductoOrdenDetaProdu=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductoOrdenDetaProdu;
	public JButton jButtonModificarProductoOrdenDetaProdu;
	public JButton jButtonActualizarProductoOrdenDetaProdu;
    public JButton jButtonEliminarProductoOrdenDetaProdu;
	public JButton jButtonCancelarProductoOrdenDetaProdu;
    public JButton jButtonGuardarCambiosProductoOrdenDetaProdu;
	public JButton jButtonGuardarCambiosTablaProductoOrdenDetaProdu;
	protected JButton jButtonCerrarProductoOrdenDetaProdu;
	
	
	protected JButton jButtonProcesarInformacionProductoOrdenDetaProdu;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductoOrdenDetaProdu;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductoOrdenDetaProdu;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductoOrdenDetaProdu;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoOrdenDetaProdu;
	protected JButton jButtonModificarToolBarProductoOrdenDetaProdu;
	protected JButton jButtonActualizarToolBarProductoOrdenDetaProdu;
    protected JButton jButtonEliminarToolBarProductoOrdenDetaProdu;
	protected JButton jButtonCancelarToolBarProductoOrdenDetaProdu;
    protected JButton jButtonGuardarCambiosToolBarProductoOrdenDetaProdu;
	protected JButton jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProdu;
	protected JButton jButtonCerrarToolBarProductoOrdenDetaProdu;
	
	protected JButton jButtonProcesarInformacionToolBarProductoOrdenDetaProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemModificarProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemActualizarProductoOrdenDetaProdu;
    protected JMenuItem jMenuItemEliminarProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemCancelarProductoOrdenDetaProdu;
    protected JMenuItem jMenuItemGuardarCambiosProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemCerrarProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemDetalleCerrarProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoOrdenDetaProdu;
	
	protected JMenuItem jMenuItemProcesarInformacionProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoOrdenDetaProdu;
	protected JMenuItem jMenuItemMostrarOcultarProductoOrdenDetaProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoOrdenDetaProdu;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoOrdenDetaProdu;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductoOrdenDetaProdu;
	public JLabel jLabelIdProductoOrdenDetaProdu;
	public JLabel jLabelidProductoOrdenDetaProdu;
	public JButton jButtonidProductoOrdenDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeProductoOrdenDetaProdu;
	public JLabel jLabelporcentajeProductoOrdenDetaProdu;
	public JTextField jTextFieldporcentajeProductoOrdenDetaProdu;
	public JButton jButtonporcentajeProductoOrdenDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelcantidadProductoOrdenDetaProdu;
	public JLabel jLabelcantidadProductoOrdenDetaProdu;
	public JTextField jTextFieldcantidadProductoOrdenDetaProdu;
	public JButton jButtoncantidadProductoOrdenDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelcostoProductoOrdenDetaProdu;
	public JLabel jLabelcostoProductoOrdenDetaProdu;
	public JTextField jTextFieldcostoProductoOrdenDetaProdu;
	public JButton jButtoncostoProductoOrdenDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalProductoOrdenDetaProdu;
	public JLabel jLabelcosto_totalProductoOrdenDetaProdu;
	public JTextField jTextFieldcosto_totalProductoOrdenDetaProdu;
	public JButton jButtoncosto_totalProductoOrdenDetaProduBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionProductoOrdenDetaProdu;
	public JLabel jLabeldescripcionProductoOrdenDetaProdu;
	public JTextArea jTextAreadescripcionProductoOrdenDetaProdu;
	public JScrollPane jscrollPanedescripcionProductoOrdenDetaProdu;
	public JButton jButtondescripcionProductoOrdenDetaProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_orden_deta_produProductoOrdenDetaProdu;
	public JLabel jLabelid_orden_deta_produProductoOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_orden_deta_produProductoOrdenDetaProdu;
	public JButton jButtonid_orden_deta_produProductoOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_orden_deta_produProductoOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_orden_deta_produProductoOrdenDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaProductoOrdenDetaProdu;
	public JLabel jLabelid_bodegaProductoOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaProductoOrdenDetaProdu;
	public JButton jButtonid_bodegaProductoOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_bodegaProductoOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_bodegaProductoOrdenDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelid_productoProductoOrdenDetaProdu;
	public JLabel jLabelid_productoProductoOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoProductoOrdenDetaProdu;
	public JButton jButtonid_productoProductoOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_productoProductoOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_productoProductoOrdenDetaProduBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadProductoOrdenDetaProdu;
	public JLabel jLabelid_unidadProductoOrdenDetaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadProductoOrdenDetaProdu;
	public JButton jButtonid_unidadProductoOrdenDetaProdu= new JButtonMe();
	public JButton jButtonid_unidadProductoOrdenDetaProduUpdate= new JButtonMe();
	public JButton jButtonid_unidadProductoOrdenDetaProduBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductoOrdenDetaProdu;
	
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
	
	public ProductoOrdenDetaProduDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductoOrdenDetaProdu=new JPanel();
				this.jPanelAccionesFormularioProductoOrdenDetaProdu=new JPanel();
				this.jmenuBarDetalleProductoOrdenDetaProdu=new JMenuBar();
				this.jTtoolBarDetalleProductoOrdenDetaProdu=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductoOrdenDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductoOrdenDetaProduDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductoOrdenDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoOrdenDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoOrdenDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoOrdenDetaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductoOrdenDetaProdu() {
		return this.jButtonActualizarToolBarProductoOrdenDetaProdu;
	}
	
	public JButton getjButtonEliminarToolBarProductoOrdenDetaProdu() {
		return this.jButtonEliminarToolBarProductoOrdenDetaProdu;
	}
	
	public JButton getjButtonCancelarToolBarProductoOrdenDetaProdu() {
		return this.jButtonCancelarToolBarProductoOrdenDetaProdu;
	}		
	
	public JButton getjButtonProcesarInformacionProductoOrdenDetaProdu() {
		return this.jButtonProcesarInformacionProductoOrdenDetaProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoOrdenDetaProdu)	{
		this.jButtonProcesarInformacionProductoOrdenDetaProdu = jButtonProcesarInformacionProductoOrdenDetaProdu;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoOrdenDetaProdu() {
		return this.jComboBoxTiposAccionesProductoOrdenDetaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoOrdenDetaProdu(
			JComboBox jComboBoxTiposRelacionesProductoOrdenDetaProdu) {
		this.jComboBoxTiposRelacionesProductoOrdenDetaProdu = jComboBoxTiposRelacionesProductoOrdenDetaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoOrdenDetaProdu(
			JComboBox jComboBoxTiposAccionesProductoOrdenDetaProdu) {
		this.jComboBoxTiposAccionesProductoOrdenDetaProdu = jComboBoxTiposAccionesProductoOrdenDetaProdu;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductoOrdenDetaProdu() {
		return this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductoOrdenDetaProdu(
			JComboBox jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu) {
		this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu = jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productoordendetaproduSessionBean=new ProductoOrdenDetaProduSessionBean();
		
		this.productoordendetaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoordendetaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoordendetaproduSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoOrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoOrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoOrdenDetaProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Orden Producto Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductoOrdenDetaProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductoOrdenDetaProdu= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductoOrdenDetaProdu=new JButtonMe();
				this.jButtonModificarToolBarProductoOrdenDetaProdu=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductoOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductoOrdenDetaProdu,this.jTtoolBarDetalleProductoOrdenDetaProdu,
							"actualizar","actualizar","Actualizar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductoOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductoOrdenDetaProdu,this.jTtoolBarDetalleProductoOrdenDetaProdu,
							"eliminar","eliminar","Eliminar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductoOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductoOrdenDetaProdu,this.jTtoolBarDetalleProductoOrdenDetaProdu,
							"cancelar","cancelar","Cancelar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductoOrdenDetaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductoOrdenDetaProdu,this.jTtoolBarDetalleProductoOrdenDetaProdu,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductoOrdenDetaProdu=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductoOrdenDetaProdu=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductoOrdenDetaProdu=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductoOrdenDetaProdu=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductoOrdenDetaProdu=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoOrdenDetaProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoOrdenDetaProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoOrdenDetaProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductoOrdenDetaProdu= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductoOrdenDetaProdu.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductoOrdenDetaProdu,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductoOrdenDetaProdu= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductoOrdenDetaProdu.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductoOrdenDetaProdu,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductoOrdenDetaProdu= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductoOrdenDetaProdu.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductoOrdenDetaProdu,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductoOrdenDetaProdu= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductoOrdenDetaProdu.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductoOrdenDetaProdu,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductoOrdenDetaProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoOrdenDetaProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoOrdenDetaProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoOrdenDetaProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoOrdenDetaProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoOrdenDetaProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductoOrdenDetaProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductoOrdenDetaProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductoOrdenDetaProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoOrdenDetaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoOrdenDetaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoOrdenDetaProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductoOrdenDetaProdu.add(this.jMenuItemDetalleCerrarProductoOrdenDetaProdu);
		
		this.jmenuDetalleAccionesProductoOrdenDetaProdu.add(this.jMenuItemActualizarProductoOrdenDetaProdu);
		this.jmenuDetalleAccionesProductoOrdenDetaProdu.add(this.jMenuItemEliminarProductoOrdenDetaProdu);
		this.jmenuDetalleAccionesProductoOrdenDetaProdu.add(this.jMenuItemCancelarProductoOrdenDetaProdu);		
		
		//this.jmenuDetalleDatosProductoOrdenDetaProdu.add(this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProdu);				
		this.jmenuDetalleDatosProductoOrdenDetaProdu.add(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProdu);				
				
		//this.jmenuDetalleAccionesProductoOrdenDetaProdu.add(this.jMenuItemGuardarCambiosProductoOrdenDetaProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductoOrdenDetaProdu.add(this.jmenuDetalleArchivoProductoOrdenDetaProdu);		
		this.jmenuBarDetalleProductoOrdenDetaProdu.add(this.jmenuDetalleAccionesProductoOrdenDetaProdu);		
		this.jmenuBarDetalleProductoOrdenDetaProdu.add(this.jmenuDetalleDatosProductoOrdenDetaProdu);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductoOrdenDetaProdu);				
	}
	
	
	public void inicializarElementosCamposProductoOrdenDetaProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductoOrdenDetaProdu = new JLabelMe();
		jLabelIdProductoOrdenDetaProdu.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductoOrdenDetaProdu = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductoOrdenDetaProdu.setToolTipText(ProductoOrdenDetaProduConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductoOrdenDetaProdu= new GridBagLayout();

		this.jPanelidProductoOrdenDetaProdu.setLayout(this.gridaBagLayoutProductoOrdenDetaProdu);

		jLabelidProductoOrdenDetaProdu = new JLabel();
		jLabelidProductoOrdenDetaProdu.setText("Id");

		jLabelidProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelporcentajeProductoOrdenDetaProdu = new JLabelMe();
		this.jLabelporcentajeProductoOrdenDetaProdu.setText(""+ProductoOrdenDetaProduConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeProductoOrdenDetaProdu.setToolTipText("Porcentaje");
		this.jLabelporcentajeProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeProductoOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeProductoOrdenDetaProdu.setToolTipText(ProductoOrdenDetaProduConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutProductoOrdenDetaProdu = new GridBagLayout();
		this.jPanelporcentajeProductoOrdenDetaProdu.setLayout(this.gridaBagLayoutProductoOrdenDetaProdu);


		jTextFieldporcentajeProductoOrdenDetaProdu= new JTextFieldMe();
		jTextFieldporcentajeProductoOrdenDetaProdu.setEnabled(false);
		jTextFieldporcentajeProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeProductoOrdenDetaProdu.setText("0.0");

		this.jButtonporcentajeProductoOrdenDetaProduBusqueda= new JButtonMe();
		this.jButtonporcentajeProductoOrdenDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeProductoOrdenDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeProductoOrdenDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeProductoOrdenDetaProduBusqueda.setText("U");
		this.jButtonporcentajeProductoOrdenDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeProductoOrdenDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeProductoOrdenDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeProductoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeProductoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeProductoOrdenDetaProduBusqueda"));

		if(this.productoordendetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeProductoOrdenDetaProduBusqueda.setVisible(false);		}


					
		this.jLabelcantidadProductoOrdenDetaProdu = new JLabelMe();
		this.jLabelcantidadProductoOrdenDetaProdu.setText(""+ProductoOrdenDetaProduConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadProductoOrdenDetaProdu.setToolTipText("Cantad");
		this.jLabelcantidadProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadProductoOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadProductoOrdenDetaProdu.setToolTipText(ProductoOrdenDetaProduConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutProductoOrdenDetaProdu = new GridBagLayout();
		this.jPanelcantidadProductoOrdenDetaProdu.setLayout(this.gridaBagLayoutProductoOrdenDetaProdu);


		jTextFieldcantidadProductoOrdenDetaProdu= new JTextFieldMe();
		jTextFieldcantidadProductoOrdenDetaProdu.setEnabled(false);
		jTextFieldcantidadProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadProductoOrdenDetaProdu.setText("0");

		this.jButtoncantidadProductoOrdenDetaProduBusqueda= new JButtonMe();
		this.jButtoncantidadProductoOrdenDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductoOrdenDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductoOrdenDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadProductoOrdenDetaProduBusqueda.setText("U");
		this.jButtoncantidadProductoOrdenDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadProductoOrdenDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadProductoOrdenDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadProductoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadProductoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadProductoOrdenDetaProduBusqueda"));

		if(this.productoordendetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadProductoOrdenDetaProduBusqueda.setVisible(false);		}


					
		this.jLabelcostoProductoOrdenDetaProdu = new JLabelMe();
		this.jLabelcostoProductoOrdenDetaProdu.setText(""+ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoProductoOrdenDetaProdu.setToolTipText("Costo");
		this.jLabelcostoProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoProductoOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoProductoOrdenDetaProdu.setToolTipText(ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutProductoOrdenDetaProdu = new GridBagLayout();
		this.jPanelcostoProductoOrdenDetaProdu.setLayout(this.gridaBagLayoutProductoOrdenDetaProdu);


		jTextFieldcostoProductoOrdenDetaProdu= new JTextFieldMe();
		jTextFieldcostoProductoOrdenDetaProdu.setEnabled(false);
		jTextFieldcostoProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoProductoOrdenDetaProdu.setText("0.0");

		this.jButtoncostoProductoOrdenDetaProduBusqueda= new JButtonMe();
		this.jButtoncostoProductoOrdenDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoProductoOrdenDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoProductoOrdenDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoProductoOrdenDetaProduBusqueda.setText("U");
		this.jButtoncostoProductoOrdenDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoProductoOrdenDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoProductoOrdenDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoProductoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoProductoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoProductoOrdenDetaProduBusqueda"));

		if(this.productoordendetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoProductoOrdenDetaProduBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalProductoOrdenDetaProdu = new JLabelMe();
		this.jLabelcosto_totalProductoOrdenDetaProdu.setText(""+ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalProductoOrdenDetaProdu.setToolTipText("Costo Total");
		this.jLabelcosto_totalProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalProductoOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalProductoOrdenDetaProdu.setToolTipText(ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutProductoOrdenDetaProdu = new GridBagLayout();
		this.jPanelcosto_totalProductoOrdenDetaProdu.setLayout(this.gridaBagLayoutProductoOrdenDetaProdu);


		jTextFieldcosto_totalProductoOrdenDetaProdu= new JTextFieldMe();
		jTextFieldcosto_totalProductoOrdenDetaProdu.setEnabled(false);
		jTextFieldcosto_totalProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalProductoOrdenDetaProdu.setText("0.0");

		this.jButtoncosto_totalProductoOrdenDetaProduBusqueda= new JButtonMe();
		this.jButtoncosto_totalProductoOrdenDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProductoOrdenDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProductoOrdenDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalProductoOrdenDetaProduBusqueda.setText("U");
		this.jButtoncosto_totalProductoOrdenDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalProductoOrdenDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalProductoOrdenDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalProductoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalProductoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalProductoOrdenDetaProduBusqueda"));

		if(this.productoordendetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalProductoOrdenDetaProduBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionProductoOrdenDetaProdu = new JLabelMe();
		this.jLabeldescripcionProductoOrdenDetaProdu.setText(""+ProductoOrdenDetaProduConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionProductoOrdenDetaProdu.setToolTipText("Descripcion");
		this.jLabeldescripcionProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionProductoOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionProductoOrdenDetaProdu.setToolTipText(ProductoOrdenDetaProduConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutProductoOrdenDetaProdu = new GridBagLayout();
		this.jPaneldescripcionProductoOrdenDetaProdu.setLayout(this.gridaBagLayoutProductoOrdenDetaProdu);


		jTextAreadescripcionProductoOrdenDetaProdu= new JTextAreaMe();
		jTextAreadescripcionProductoOrdenDetaProdu.setEnabled(false);
		jTextAreadescripcionProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoOrdenDetaProdu.setLineWrap(true);
		jTextAreadescripcionProductoOrdenDetaProdu.setWrapStyleWord(true);
		jTextAreadescripcionProductoOrdenDetaProdu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionProductoOrdenDetaProdu.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionProductoOrdenDetaProdu = new JScrollPane(jTextAreadescripcionProductoOrdenDetaProdu);
		jscrollPanedescripcionProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionProductoOrdenDetaProduBusqueda= new JButtonMe();
		this.jButtondescripcionProductoOrdenDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoOrdenDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoOrdenDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionProductoOrdenDetaProduBusqueda.setText("U");
		this.jButtondescripcionProductoOrdenDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionProductoOrdenDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionProductoOrdenDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionProductoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionProductoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionProductoOrdenDetaProduBusqueda"));

		if(this.productoordendetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionProductoOrdenDetaProduBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductoOrdenDetaProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_orden_deta_produProductoOrdenDetaProdu = new JLabelMe();
		this.jLabelid_orden_deta_produProductoOrdenDetaProdu.setText(""+ProductoOrdenDetaProduConstantesFunciones.LABEL_IDORDENDETAPRODU+" : *");
		this.jLabelid_orden_deta_produProductoOrdenDetaProdu.setToolTipText("Orden Deta Produ");
		this.jLabelid_orden_deta_produProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_orden_deta_produProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_orden_deta_produProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_orden_deta_produProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_orden_deta_produProductoOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_orden_deta_produProductoOrdenDetaProdu.setToolTipText(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDORDENDETAPRODU);
		this.gridaBagLayoutProductoOrdenDetaProdu = new GridBagLayout();
		this.jPanelid_orden_deta_produProductoOrdenDetaProdu.setLayout(this.gridaBagLayoutProductoOrdenDetaProdu);


		jComboBoxid_orden_deta_produProductoOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_orden_deta_produProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_deta_produProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_deta_produProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_orden_deta_produProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_orden_deta_produProductoOrdenDetaProdu= new JButtonMe();
		this.jButtonid_orden_deta_produProductoOrdenDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_deta_produProductoOrdenDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_deta_produProductoOrdenDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_deta_produProductoOrdenDetaProdu.setText("Buscar");
		this.jButtonid_orden_deta_produProductoOrdenDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_orden_deta_produProductoOrdenDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_deta_produProductoOrdenDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_orden_deta_produProductoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_deta_produProductoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_deta_produProductoOrdenDetaProdu"));

		this.jButtonid_orden_deta_produProductoOrdenDetaProduBusqueda= new JButtonMe();
		this.jButtonid_orden_deta_produProductoOrdenDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_orden_deta_produProductoOrdenDetaProduBusqueda.setText("U");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_deta_produProductoOrdenDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_orden_deta_produProductoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_deta_produProductoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_deta_produProductoOrdenDetaProduBusqueda"));

		if(this.productoordendetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_orden_deta_produProductoOrdenDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_orden_deta_produProductoOrdenDetaProduUpdate= new JButtonMe();
		this.jButtonid_orden_deta_produProductoOrdenDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_orden_deta_produProductoOrdenDetaProduUpdate.setText("U");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_deta_produProductoOrdenDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_orden_deta_produProductoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_deta_produProductoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_deta_produProductoOrdenDetaProduUpdate"));



					
		this.jLabelid_bodegaProductoOrdenDetaProdu = new JLabelMe();
		this.jLabelid_bodegaProductoOrdenDetaProdu.setText(""+ProductoOrdenDetaProduConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaProductoOrdenDetaProdu.setToolTipText("Bodega");
		this.jLabelid_bodegaProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaProductoOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaProductoOrdenDetaProdu.setToolTipText(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutProductoOrdenDetaProdu = new GridBagLayout();
		this.jPanelid_bodegaProductoOrdenDetaProdu.setLayout(this.gridaBagLayoutProductoOrdenDetaProdu);


		jComboBoxid_bodegaProductoOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_bodegaProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaProductoOrdenDetaProdu= new JButtonMe();
		this.jButtonid_bodegaProductoOrdenDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoOrdenDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoOrdenDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoOrdenDetaProdu.setText("Buscar");
		this.jButtonid_bodegaProductoOrdenDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaProductoOrdenDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoOrdenDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaProductoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoOrdenDetaProdu"));

		this.jButtonid_bodegaProductoOrdenDetaProduBusqueda= new JButtonMe();
		this.jButtonid_bodegaProductoOrdenDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoOrdenDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoOrdenDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductoOrdenDetaProduBusqueda.setText("U");
		this.jButtonid_bodegaProductoOrdenDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaProductoOrdenDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoOrdenDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaProductoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoOrdenDetaProduBusqueda"));

		if(this.productoordendetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaProductoOrdenDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_bodegaProductoOrdenDetaProduUpdate= new JButtonMe();
		this.jButtonid_bodegaProductoOrdenDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoOrdenDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoOrdenDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductoOrdenDetaProduUpdate.setText("U");
		this.jButtonid_bodegaProductoOrdenDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaProductoOrdenDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoOrdenDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaProductoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoOrdenDetaProduUpdate"));



					
		this.jLabelid_productoProductoOrdenDetaProdu = new JLabelMe();
		this.jLabelid_productoProductoOrdenDetaProdu.setText(""+ProductoOrdenDetaProduConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoProductoOrdenDetaProdu.setToolTipText("Producto");
		this.jLabelid_productoProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoProductoOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoProductoOrdenDetaProdu.setToolTipText(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutProductoOrdenDetaProdu = new GridBagLayout();
		this.jPanelid_productoProductoOrdenDetaProdu.setLayout(this.gridaBagLayoutProductoOrdenDetaProdu);


		jComboBoxid_productoProductoOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_productoProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoProductoOrdenDetaProdu= new JButtonMe();
		this.jButtonid_productoProductoOrdenDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoOrdenDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoOrdenDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoOrdenDetaProdu.setText("Buscar");
		this.jButtonid_productoProductoOrdenDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoProductoOrdenDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoOrdenDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoProductoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoOrdenDetaProdu"));

		this.jButtonid_productoProductoOrdenDetaProduBusqueda= new JButtonMe();
		this.jButtonid_productoProductoOrdenDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoOrdenDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoOrdenDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoOrdenDetaProduBusqueda.setText("U");
		this.jButtonid_productoProductoOrdenDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoProductoOrdenDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoOrdenDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoProductoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoOrdenDetaProduBusqueda"));

		if(this.productoordendetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoProductoOrdenDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_productoProductoOrdenDetaProduUpdate= new JButtonMe();
		this.jButtonid_productoProductoOrdenDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoOrdenDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoOrdenDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoOrdenDetaProduUpdate.setText("U");
		this.jButtonid_productoProductoOrdenDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoProductoOrdenDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoOrdenDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoProductoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoOrdenDetaProduUpdate"));



					
		this.jLabelid_unidadProductoOrdenDetaProdu = new JLabelMe();
		this.jLabelid_unidadProductoOrdenDetaProdu.setText(""+ProductoOrdenDetaProduConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadProductoOrdenDetaProdu.setToolTipText("Unad");
		this.jLabelid_unidadProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadProductoOrdenDetaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadProductoOrdenDetaProdu.setToolTipText(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutProductoOrdenDetaProdu = new GridBagLayout();
		this.jPanelid_unidadProductoOrdenDetaProdu.setLayout(this.gridaBagLayoutProductoOrdenDetaProdu);


		jComboBoxid_unidadProductoOrdenDetaProdu= new JComboBoxMe();
		jComboBoxid_unidadProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadProductoOrdenDetaProdu= new JButtonMe();
		this.jButtonid_unidadProductoOrdenDetaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoOrdenDetaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoOrdenDetaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoOrdenDetaProdu.setText("Buscar");
		this.jButtonid_unidadProductoOrdenDetaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadProductoOrdenDetaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoOrdenDetaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadProductoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoOrdenDetaProdu"));

		this.jButtonid_unidadProductoOrdenDetaProduBusqueda= new JButtonMe();
		this.jButtonid_unidadProductoOrdenDetaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoOrdenDetaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoOrdenDetaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoOrdenDetaProduBusqueda.setText("U");
		this.jButtonid_unidadProductoOrdenDetaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadProductoOrdenDetaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoOrdenDetaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadProductoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoOrdenDetaProduBusqueda"));

		if(this.productoordendetaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadProductoOrdenDetaProduBusqueda.setVisible(false);		}

		this.jButtonid_unidadProductoOrdenDetaProduUpdate= new JButtonMe();
		this.jButtonid_unidadProductoOrdenDetaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoOrdenDetaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoOrdenDetaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoOrdenDetaProduUpdate.setText("U");
		this.jButtonid_unidadProductoOrdenDetaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadProductoOrdenDetaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoOrdenDetaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadProductoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoOrdenDetaProduUpdate"));



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
		//this.jInternalFrameDetalleProductoOrdenDetaProdu = new ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Orden Producto Produccion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoOrdenDetaProdu= new GridBagLayout();
		

		
		String sToolTipProductoOrdenDetaProdu="";
		sToolTipProductoOrdenDetaProdu=ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoOrdenDetaProdu+="(Produccion.ProductoOrdenDetaProdu)";
		}
		
		if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoOrdenDetaProdu+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductoOrdenDetaProdu = new JButtonMe();
		this.jButtonModificarProductoOrdenDetaProdu = new JButtonMe();
        this.jButtonActualizarProductoOrdenDetaProdu = new JButtonMe();
        this.jButtonEliminarProductoOrdenDetaProdu = new JButtonMe();
        this.jButtonCancelarProductoOrdenDetaProdu = new JButtonMe();
        this.jButtonGuardarCambiosProductoOrdenDetaProdu = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProdu = new JButtonMe();
		this.jButtonCerrarProductoOrdenDetaProdu = new JButtonMe();
		
		this.jScrollPanelDatosProductoOrdenDetaProdu = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductoOrdenDetaProdu = new JScrollPane();
		this.jScrollPanelDatosGeneralProductoOrdenDetaProdu = new JScrollPane();
				
		
		
		this.jPanelCamposProductoOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductoOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductoOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductoOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Orden Producto Produccion";
		
		if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Producto Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoOrdenDetaProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductoOrdenDetaProdu.setName("jPanelCamposProductoOrdenDetaProdu"); 

		this.jPanelCamposOcultosProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductoOrdenDetaProdu.setName("jPanelCamposOcultosProductoOrdenDetaProdu"); 

        this.jPanelAccionesProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoOrdenDetaProdu.setToolTipText("Acciones");
        this.jPanelAccionesProductoOrdenDetaProdu.setName("Acciones"); 

		this.jPanelAccionesFormularioProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductoOrdenDetaProdu.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductoOrdenDetaProdu.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductoOrdenDetaProdu.setText("Nuevo");
		this.jButtonModificarProductoOrdenDetaProdu.setText("Editar");
        this.jButtonActualizarProductoOrdenDetaProdu.setText("Actualizar");
        this.jButtonEliminarProductoOrdenDetaProdu.setText("Eliminar");
        this.jButtonCancelarProductoOrdenDetaProdu.setText("Cancelar");
        this.jButtonGuardarCambiosProductoOrdenDetaProdu.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProdu.setText("Guardar");
		this.jButtonCerrarProductoOrdenDetaProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoOrdenDetaProdu,"nuevo_button","Nuevo",this.productoordendetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductoOrdenDetaProdu,"modificar_button","Editar",this.productoordendetaproduSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductoOrdenDetaProdu,"actualizar_button","Actualizar",this.productoordendetaproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductoOrdenDetaProdu,"eliminar_button","Eliminar",this.productoordendetaproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductoOrdenDetaProdu,"cancelar_button","Cancelar",this.productoordendetaproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductoOrdenDetaProdu,"guardarcambios_button","Guardar",this.productoordendetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoOrdenDetaProdu,"guardarcambiostabla_button","Guardar",this.productoordendetaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoOrdenDetaProdu,"cerrar_button","Salir",this.productoordendetaproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductoOrdenDetaProdu.setToolTipText("Nuevo"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductoOrdenDetaProdu.setToolTipText("Editar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductoOrdenDetaProdu.setToolTipText("Actualizar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductoOrdenDetaProdu.setToolTipText("Eliminar)"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductoOrdenDetaProdu.setToolTipText("Cancelar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductoOrdenDetaProdu.setToolTipText("Guardar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProdu.setToolTipText("Guardar"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoOrdenDetaProdu.setToolTipText("Salir"+" "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoOrdenDetaProdu";
		inputMap = this.jButtonNuevoProductoOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoOrdenDetaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoOrdenDetaProdu"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductoOrdenDetaProdu";
		inputMap = this.jButtonActualizarProductoOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductoOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductoOrdenDetaProdu"));
		
		//ELIMINAR
		sMapKey = "EliminarProductoOrdenDetaProdu";
		inputMap = this.jButtonEliminarProductoOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductoOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductoOrdenDetaProdu"));
		
		//CANCELAR	
		sMapKey = "CancelarProductoOrdenDetaProdu";
		inputMap = this.jButtonCancelarProductoOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductoOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductoOrdenDetaProdu"));
		
		//CERRAR		
		sMapKey = "CerrarProductoOrdenDetaProdu";
		inputMap = this.jButtonCerrarProductoOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoOrdenDetaProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoOrdenDetaProdu";
		inputMap = this.jButtonGuardarCambiosTablaProductoOrdenDetaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoOrdenDetaProdu"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductoOrdenDetaProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductoOrdenDetaProdu.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductoOrdenDetaProdu.setToolTipText("Nuevo ProductoOrdenDetaProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProdu.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProdu.setToolTipText("Sin Cerrar Ventana ProductoOrdenDetaProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProdu.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProdu.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductoOrdenDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoOrdenDetaProdu.setText("Accion");
		this.jComboBoxTiposAccionesProductoOrdenDetaProdu.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductoOrdenDetaProdu = new JLabelMe();
		
		this.jLabelAccionesProductoOrdenDetaProdu.setText("Acciones");		
		this.jLabelAccionesProductoOrdenDetaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoOrdenDetaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoOrdenDetaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductoOrdenDetaProdu();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductoOrdenDetaProdu();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductoOrdenDetaProdu=new JTabbedPane();
		this.jTabbedPaneRelacionesProductoOrdenDetaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductoOrdenDetaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductoOrdenDetaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoOrdenDetaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoOrdenDetaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductoOrdenDetaProdu = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductoOrdenDetaProdu = new GridBagLayout();
		
		this.jPanelCamposProductoOrdenDetaProdu.setLayout(gridaBagLayoutCamposProductoOrdenDetaProdu);
		this.jPanelCamposOcultosProductoOrdenDetaProdu.setLayout(gridaBagLayoutCamposOcultosProductoOrdenDetaProdu);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductoOrdenDetaProdu.add(jLabelIdProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);



	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductoOrdenDetaProdu.add(jLabelidProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);


	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_orden_deta_produProductoOrdenDetaProdu.add(jLabelid_orden_deta_produProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_orden_deta_produProductoOrdenDetaProdu.add(jButtonid_orden_deta_produProductoOrdenDetaProduBusqueda, this.gridBagConstraintsProductoOrdenDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 3;
		this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_orden_deta_produProductoOrdenDetaProdu.add(jButtonid_orden_deta_produProductoOrdenDetaProduUpdate, this.gridBagConstraintsProductoOrdenDetaProdu);
	}

	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_orden_deta_produProductoOrdenDetaProdu.add(jComboBoxid_orden_deta_produProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);


	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaProductoOrdenDetaProdu.add(jLabelid_bodegaProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductoOrdenDetaProdu.add(jButtonid_bodegaProductoOrdenDetaProduBusqueda, this.gridBagConstraintsProductoOrdenDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 3;
		this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductoOrdenDetaProdu.add(jButtonid_bodegaProductoOrdenDetaProduUpdate, this.gridBagConstraintsProductoOrdenDetaProdu);
	}

	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaProductoOrdenDetaProdu.add(jComboBoxid_bodegaProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);


	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoProductoOrdenDetaProdu.add(jLabelid_productoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	//this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 2;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoProductoOrdenDetaProdu.add(jButtonid_productoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 3;
		this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoOrdenDetaProdu.add(jButtonid_productoProductoOrdenDetaProduBusqueda, this.gridBagConstraintsProductoOrdenDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 4;
		this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoOrdenDetaProdu.add(jButtonid_productoProductoOrdenDetaProduUpdate, this.gridBagConstraintsProductoOrdenDetaProdu);
	}

	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoProductoOrdenDetaProdu.add(jComboBoxid_productoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);


	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadProductoOrdenDetaProdu.add(jLabelid_unidadProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoOrdenDetaProdu.add(jButtonid_unidadProductoOrdenDetaProduBusqueda, this.gridBagConstraintsProductoOrdenDetaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 3;
		this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoOrdenDetaProdu.add(jButtonid_unidadProductoOrdenDetaProduUpdate, this.gridBagConstraintsProductoOrdenDetaProdu);
	}

	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadProductoOrdenDetaProdu.add(jComboBoxid_unidadProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);


	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeProductoOrdenDetaProdu.add(jLabelporcentajeProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeProductoOrdenDetaProdu.add(jButtonporcentajeProductoOrdenDetaProduBusqueda, this.gridBagConstraintsProductoOrdenDetaProdu);
	}

	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeProductoOrdenDetaProdu.add(jTextFieldporcentajeProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);


	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadProductoOrdenDetaProdu.add(jLabelcantidadProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadProductoOrdenDetaProdu.add(jButtoncantidadProductoOrdenDetaProduBusqueda, this.gridBagConstraintsProductoOrdenDetaProdu);
	}

	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadProductoOrdenDetaProdu.add(jTextFieldcantidadProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);


	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoProductoOrdenDetaProdu.add(jLabelcostoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoProductoOrdenDetaProdu.add(jButtoncostoProductoOrdenDetaProduBusqueda, this.gridBagConstraintsProductoOrdenDetaProdu);
	}

	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoProductoOrdenDetaProdu.add(jTextFieldcostoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);


	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalProductoOrdenDetaProdu.add(jLabelcosto_totalProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalProductoOrdenDetaProdu.add(jButtoncosto_totalProductoOrdenDetaProduBusqueda, this.gridBagConstraintsProductoOrdenDetaProdu);
	}

	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalProductoOrdenDetaProdu.add(jTextFieldcosto_totalProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);


	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionProductoOrdenDetaProdu.add(jLabeldescripcionProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionProductoOrdenDetaProdu.add(jButtondescripcionProductoOrdenDetaProduBusqueda, this.gridBagConstraintsProductoOrdenDetaProdu);
	}

	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionProductoOrdenDetaProdu.add(jscrollPanedescripcionProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iYPanelCamposProductoOrdenDetaProdu;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iXPanelCamposProductoOrdenDetaProdu++;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProdu.add(this.jPanelidProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);



	if(iXPanelCamposProductoOrdenDetaProdu % 1==0) {
		iXPanelCamposProductoOrdenDetaProdu=0;
		iYPanelCamposProductoOrdenDetaProdu++;
	}
	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iYPanelCamposProductoOrdenDetaProdu;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iXPanelCamposProductoOrdenDetaProdu++;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProdu.add(this.jPanelid_orden_deta_produProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);



	if(iXPanelCamposProductoOrdenDetaProdu % 1==0) {
		iXPanelCamposProductoOrdenDetaProdu=0;
		iYPanelCamposProductoOrdenDetaProdu++;
	}
	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iYPanelCamposProductoOrdenDetaProdu;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iXPanelCamposProductoOrdenDetaProdu++;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProdu.add(this.jPanelid_bodegaProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);



	if(iXPanelCamposProductoOrdenDetaProdu % 1==0) {
		iXPanelCamposProductoOrdenDetaProdu=0;
		iYPanelCamposProductoOrdenDetaProdu++;
	}
	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iYPanelCamposProductoOrdenDetaProdu;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iXPanelCamposProductoOrdenDetaProdu++;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProdu.add(this.jPanelid_productoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);



	if(iXPanelCamposProductoOrdenDetaProdu % 1==0) {
		iXPanelCamposProductoOrdenDetaProdu=0;
		iYPanelCamposProductoOrdenDetaProdu++;
	}
	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iYPanelCamposProductoOrdenDetaProdu;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iXPanelCamposProductoOrdenDetaProdu++;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProdu.add(this.jPanelid_unidadProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);



	if(iXPanelCamposProductoOrdenDetaProdu % 1==0) {
		iXPanelCamposProductoOrdenDetaProdu=0;
		iYPanelCamposProductoOrdenDetaProdu++;
	}
	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iYPanelCamposProductoOrdenDetaProdu;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iXPanelCamposProductoOrdenDetaProdu++;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProdu.add(this.jPanelporcentajeProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);



	if(iXPanelCamposProductoOrdenDetaProdu % 1==0) {
		iXPanelCamposProductoOrdenDetaProdu=0;
		iYPanelCamposProductoOrdenDetaProdu++;
	}
	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iYPanelCamposProductoOrdenDetaProdu;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iXPanelCamposProductoOrdenDetaProdu++;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProdu.add(this.jPanelcantidadProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);



	if(iXPanelCamposProductoOrdenDetaProdu % 1==0) {
		iXPanelCamposProductoOrdenDetaProdu=0;
		iYPanelCamposProductoOrdenDetaProdu++;
	}
	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iYPanelCamposProductoOrdenDetaProdu;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iXPanelCamposProductoOrdenDetaProdu++;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProdu.add(this.jPanelcostoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);



	if(iXPanelCamposProductoOrdenDetaProdu % 1==0) {
		iXPanelCamposProductoOrdenDetaProdu=0;
		iYPanelCamposProductoOrdenDetaProdu++;
	}
	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iYPanelCamposProductoOrdenDetaProdu;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iXPanelCamposProductoOrdenDetaProdu++;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProdu.add(this.jPanelcosto_totalProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);



	if(iXPanelCamposProductoOrdenDetaProdu % 1==0) {
		iXPanelCamposProductoOrdenDetaProdu=0;
		iYPanelCamposProductoOrdenDetaProdu++;
	}
	this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iYPanelCamposProductoOrdenDetaProdu;
	this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iXPanelCamposProductoOrdenDetaProdu++;
	this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProdu.add(this.jPaneldescripcionProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);



	if(iXPanelCamposProductoOrdenDetaProdu % 1==0) {
		iXPanelCamposProductoOrdenDetaProdu=0;
		iYPanelCamposProductoOrdenDetaProdu++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductoOrdenDetaProdu= new GridBagLayout();
		this.jPanelAccionesProductoOrdenDetaProdu.setLayout(gridaBagLayoutAccionesProductoOrdenDetaProdu);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductoOrdenDetaProdu= new GridBagLayout();
		this.jPanelAccionesFormularioProductoOrdenDetaProdu.setLayout(gridaBagLayoutAccionesFormularioProductoOrdenDetaProdu);
		
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoOrdenDetaProdu.add(this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);

		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoOrdenDetaProdu.add(this.jCheckBoxPostAccionNuevoProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.productoordendetaproduSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoOrdenDetaProdu.add(this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.productoordendetaproduSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoOrdenDetaProdu.add(this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductoOrdenDetaProdu.add(this.jButtonModificarProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);							

		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductoOrdenDetaProdu.add(this.jButtonEliminarProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		
			
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoOrdenDetaProdu.add(this.jButtonActualizarProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);


		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoOrdenDetaProdu.add(this.jButtonGuardarCambiosProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);	
		
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = 0;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductoOrdenDetaProdu.add(this.jButtonCancelarProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoOrdenDetaProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoOrdenDetaProdu);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();						
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;		
			//this.gridBagConstraintsProductoOrdenDetaProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoOrdenDetaProdu.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx =0;
		this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoOrdenDetaProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductoOrdenDetaProduJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductoOrdenDetaProdu = new ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Orden Producto Produccion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Orden Producto Produccion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Orden Producto Produccion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductoOrdenDetaProduModel productoordendetaproduModel=new ProductoOrdenDetaProduModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductoOrdenDetaProduModel.ProductoOrdenDetaProduFocusTraversalPolicy productoordendetaproduFocusTraversalPolicy = productoordendetaproduModel.new ProductoOrdenDetaProduFocusTraversalPolicy(this);
			
			//productoordendetaproduFocusTraversalPolicy.setproductoordendetaproduJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productoordendetaproduModel);
			
			
			this.jContentPaneDetalleProductoOrdenDetaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductoOrdenDetaProdu = new GridBagLayout();	
			this.jContentPaneDetalleProductoOrdenDetaProdu.setLayout(gridaBagLayoutDetalleProductoOrdenDetaProdu);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoOrdenDetaProdu = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
				this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
					
				
				this.jContentPaneDetalleProductoOrdenDetaProdu.add(jTtoolBarDetalleProductoOrdenDetaProdu, gridBagConstraintsProductoOrdenDetaProdu);								
				
}
			
			this.jScrollPanelDatosEdicionProductoOrdenDetaProdu=   new JScrollPane(jContentPaneDetalleProductoOrdenDetaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoOrdenDetaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoOrdenDetaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoOrdenDetaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductoOrdenDetaProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoOrdenDetaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoOrdenDetaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoOrdenDetaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
	        
			this.jContentPaneDetalleProductoOrdenDetaProdu.add(jPanelCamposProductoOrdenDetaProdu, gridBagConstraintsProductoOrdenDetaProdu);
			
			
			
			
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
						&& productoordendetaproduSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productoordendetaproduSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductoOrdenDetaProdu= new GridBagConstraints();
						this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
						this.jContentPaneDetalleProductoOrdenDetaProdu.add(this.jTabbedPaneRelacionesProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductoOrdenDetaProdu.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductoOrdenDetaProdu.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
					this.gridBagConstraintsProductoOrdenDetaProdu.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
					
				
					this.jContentPaneDetalleProductoOrdenDetaProdu.add(jPanelCamposOcultosProductoOrdenDetaProdu, gridBagConstraintsProductoOrdenDetaProdu);
				
					this.jPanelCamposOcultosProductoOrdenDetaProdu.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
	        this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductoOrdenDetaProdu.add(this.jPanelAccionesFormularioProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);							
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
	        this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
	        
			
			this.jContentPaneDetalleProductoOrdenDetaProdu.add(this.jPanelAccionesProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductoOrdenDetaProdu);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductoOrdenDetaProdu=   new JScrollPane(this.jPanelCamposProductoOrdenDetaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoOrdenDetaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoOrdenDetaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoOrdenDetaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
			this.gridBagConstraintsProductoOrdenDetaProdu.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductoOrdenDetaProdu.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductoOrdenDetaProdu.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);			
			
			this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
			
			
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		
			
		this.gridBagConstraintsProductoOrdenDetaProdu = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoOrdenDetaProdu, this.gridBagConstraintsProductoOrdenDetaProdu);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductoOrdenDetaProdu;//jContentPane;
		
		return jScrollPanelDatosEdicionProductoOrdenDetaProdu;
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
