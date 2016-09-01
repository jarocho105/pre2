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
import com.bydan.erp.produccion.util.ProductoOrdenDetaProduManoConstantesFunciones;

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
public class ProductoOrdenDetaProduManoDetalleFormJInternalFrame extends ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductoOrdenDetaProduMano;
	
	protected JMenuBar jmenuBarDetalleProductoOrdenDetaProduMano;
	
	protected JMenu jmenuDetalleProductoOrdenDetaProduMano;
	protected JMenu jmenuDetalleArchivoProductoOrdenDetaProduMano;
	protected JMenu jmenuDetalleAccionesProductoOrdenDetaProduMano;
	protected JMenu jmenuDetalleDatosProductoOrdenDetaProduMano;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductoOrdenDetaProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoOrdenDetaProduMano;	
	protected GridBagConstraints gridBagConstraintsProductoOrdenDetaProduMano;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductoOrdenDetaProduMano;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected OrdenDetaProduBeanSwingJInternalFrame ordendetaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ordendetaprodu="";

	protected TipoManoProduEmpresaBeanSwingJInternalFrame tipomanoproduempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomanoproduempresa="";

	protected TipoProcesoEmpresaProduBeanSwingJInternalFrame tipoprocesoempresaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprocesoempresaprodu="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public ProductoOrdenDetaProduManoSessionBean productoordendetaprodumanoSessionBean;
	
	
	
	
	public OrdenDetaProduSessionBean ordendetaproduSessionBean;
	public TipoManoProduEmpresaSessionBean tipomanoproduempresaSessionBean;
	public TipoProcesoEmpresaProduSessionBean tipoprocesoempresaproduSessionBean;
	public UnidadSessionBean unidadSessionBean;	
	
	public ProductoOrdenDetaProduManoLogic productoordendetaprodumanoLogic;
	
	public JScrollPane jScrollPanelDatosProductoOrdenDetaProduMano;
	public JScrollPane jScrollPanelDatosEdicionProductoOrdenDetaProduMano;
	public JScrollPane jScrollPanelDatosGeneralProductoOrdenDetaProduMano;
	
	protected JPanel jPanelCamposProductoOrdenDetaProduMano;    
	protected JPanel jPanelCamposOcultosProductoOrdenDetaProduMano;    	
	protected JPanel jPanelAccionesProductoOrdenDetaProduMano;
	protected JPanel jPanelAccionesFormularioProductoOrdenDetaProduMano;
    
	
	
	protected Integer iXPanelCamposProductoOrdenDetaProduMano=0;
	protected Integer iYPanelCamposProductoOrdenDetaProduMano=0;
	
	protected Integer iXPanelCamposOcultosProductoOrdenDetaProduMano=0;
	protected Integer iYPanelCamposOcultosProductoOrdenDetaProduMano=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductoOrdenDetaProduMano;
	public JButton jButtonModificarProductoOrdenDetaProduMano;
	public JButton jButtonActualizarProductoOrdenDetaProduMano;
    public JButton jButtonEliminarProductoOrdenDetaProduMano;
	public JButton jButtonCancelarProductoOrdenDetaProduMano;
    public JButton jButtonGuardarCambiosProductoOrdenDetaProduMano;
	public JButton jButtonGuardarCambiosTablaProductoOrdenDetaProduMano;
	protected JButton jButtonCerrarProductoOrdenDetaProduMano;
	
	
	protected JButton jButtonProcesarInformacionProductoOrdenDetaProduMano;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductoOrdenDetaProduMano;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMano;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMano;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoOrdenDetaProduMano;
	protected JButton jButtonModificarToolBarProductoOrdenDetaProduMano;
	protected JButton jButtonActualizarToolBarProductoOrdenDetaProduMano;
    protected JButton jButtonEliminarToolBarProductoOrdenDetaProduMano;
	protected JButton jButtonCancelarToolBarProductoOrdenDetaProduMano;
    protected JButton jButtonGuardarCambiosToolBarProductoOrdenDetaProduMano;
	protected JButton jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMano;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProduMano;
	protected JButton jButtonCerrarToolBarProductoOrdenDetaProduMano;
	
	protected JButton jButtonProcesarInformacionToolBarProductoOrdenDetaProduMano;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemModificarProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemActualizarProductoOrdenDetaProduMano;
    protected JMenuItem jMenuItemEliminarProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemCancelarProductoOrdenDetaProduMano;
    protected JMenuItem jMenuItemGuardarCambiosProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemCerrarProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemDetalleCerrarProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMano;
	
	protected JMenuItem jMenuItemProcesarInformacionProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMano;
	protected JMenuItem jMenuItemMostrarOcultarProductoOrdenDetaProduMano;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoOrdenDetaProduMano;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoOrdenDetaProduMano;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoOrdenDetaProduMano;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductoOrdenDetaProduMano;
	public JLabel jLabelIdProductoOrdenDetaProduMano;
	public JLabel jLabelidProductoOrdenDetaProduMano;
	public JButton jButtonidProductoOrdenDetaProduManoBusqueda= new JButtonMe();

	public JPanel jPanelcantidadProductoOrdenDetaProduMano;
	public JLabel jLabelcantidadProductoOrdenDetaProduMano;
	public JTextField jTextFieldcantidadProductoOrdenDetaProduMano;
	public JButton jButtoncantidadProductoOrdenDetaProduManoBusqueda= new JButtonMe();

	public JPanel jPanelcostoProductoOrdenDetaProduMano;
	public JLabel jLabelcostoProductoOrdenDetaProduMano;
	public JTextField jTextFieldcostoProductoOrdenDetaProduMano;
	public JButton jButtoncostoProductoOrdenDetaProduManoBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalProductoOrdenDetaProduMano;
	public JLabel jLabelcosto_totalProductoOrdenDetaProduMano;
	public JTextField jTextFieldcosto_totalProductoOrdenDetaProduMano;
	public JButton jButtoncosto_totalProductoOrdenDetaProduManoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionProductoOrdenDetaProduMano;
	public JLabel jLabeldescripcionProductoOrdenDetaProduMano;
	public JTextArea jTextAreadescripcionProductoOrdenDetaProduMano;
	public JScrollPane jscrollPanedescripcionProductoOrdenDetaProduMano;
	public JButton jButtondescripcionProductoOrdenDetaProduManoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_orden_deta_produProductoOrdenDetaProduMano;
	public JLabel jLabelid_orden_deta_produProductoOrdenDetaProduMano;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_orden_deta_produProductoOrdenDetaProduMano;
	public JButton jButtonid_orden_deta_produProductoOrdenDetaProduMano= new JButtonMe();
	public JButton jButtonid_orden_deta_produProductoOrdenDetaProduManoUpdate= new JButtonMe();
	public JButton jButtonid_orden_deta_produProductoOrdenDetaProduManoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_mano_produ_empresaProductoOrdenDetaProduMano;
	public JLabel jLabelid_tipo_mano_produ_empresaProductoOrdenDetaProduMano;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano;
	public JButton jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduMano= new JButtonMe();
	public JButton jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_proceso_empresa_produProductoOrdenDetaProduMano;
	public JLabel jLabelid_tipo_proceso_empresa_produProductoOrdenDetaProduMano;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano;
	public JButton jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMano= new JButtonMe();
	public JButton jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadProductoOrdenDetaProduMano;
	public JLabel jLabelid_unidadProductoOrdenDetaProduMano;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadProductoOrdenDetaProduMano;
	public JButton jButtonid_unidadProductoOrdenDetaProduMano= new JButtonMe();
	public JButton jButtonid_unidadProductoOrdenDetaProduManoUpdate= new JButtonMe();
	public JButton jButtonid_unidadProductoOrdenDetaProduManoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductoOrdenDetaProduMano;
	
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
	
	public ProductoOrdenDetaProduManoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductoOrdenDetaProduMano=new JPanel();
				this.jPanelAccionesFormularioProductoOrdenDetaProduMano=new JPanel();
				this.jmenuBarDetalleProductoOrdenDetaProduMano=new JMenuBar();
				this.jTtoolBarDetalleProductoOrdenDetaProduMano=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduManoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductoOrdenDetaProduMano No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductoOrdenDetaProduManoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductoOrdenDetaProduMano No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduManoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoOrdenDetaProduMano No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduManoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoOrdenDetaProduMano No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduManoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoOrdenDetaProduMano No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductoOrdenDetaProduMano() {
		return this.jButtonActualizarToolBarProductoOrdenDetaProduMano;
	}
	
	public JButton getjButtonEliminarToolBarProductoOrdenDetaProduMano() {
		return this.jButtonEliminarToolBarProductoOrdenDetaProduMano;
	}
	
	public JButton getjButtonCancelarToolBarProductoOrdenDetaProduMano() {
		return this.jButtonCancelarToolBarProductoOrdenDetaProduMano;
	}		
	
	public JButton getjButtonProcesarInformacionProductoOrdenDetaProduMano() {
		return this.jButtonProcesarInformacionProductoOrdenDetaProduMano;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoOrdenDetaProduMano)	{
		this.jButtonProcesarInformacionProductoOrdenDetaProduMano = jButtonProcesarInformacionProductoOrdenDetaProduMano;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoOrdenDetaProduMano() {
		return this.jComboBoxTiposAccionesProductoOrdenDetaProduMano;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoOrdenDetaProduMano(
			JComboBox jComboBoxTiposRelacionesProductoOrdenDetaProduMano) {
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMano = jComboBoxTiposRelacionesProductoOrdenDetaProduMano;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoOrdenDetaProduMano(
			JComboBox jComboBoxTiposAccionesProductoOrdenDetaProduMano) {
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMano = jComboBoxTiposAccionesProductoOrdenDetaProduMano;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano() {
		return this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano(
			JComboBox jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano) {
		this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano = jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productoordendetaprodumanoSessionBean=new ProductoOrdenDetaProduManoSessionBean();
		
		this.productoordendetaprodumanoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoordendetaprodumanoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoOrdenDetaProduManoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoOrdenDetaProduManoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoOrdenDetaProduManoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Orden  Mano De Obra MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductoOrdenDetaProduManoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductoOrdenDetaProduMano= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductoOrdenDetaProduMano=new JButtonMe();
				this.jButtonModificarToolBarProductoOrdenDetaProduMano=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductoOrdenDetaProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductoOrdenDetaProduMano,this.jTtoolBarDetalleProductoOrdenDetaProduMano,
							"actualizar","actualizar","Actualizar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductoOrdenDetaProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductoOrdenDetaProduMano,this.jTtoolBarDetalleProductoOrdenDetaProduMano,
							"eliminar","eliminar","Eliminar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductoOrdenDetaProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductoOrdenDetaProduMano,this.jTtoolBarDetalleProductoOrdenDetaProduMano,
							"cancelar","cancelar","Cancelar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMano=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMano,this.jTtoolBarDetalleProductoOrdenDetaProduMano,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductoOrdenDetaProduMano=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductoOrdenDetaProduMano=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductoOrdenDetaProduMano=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductoOrdenDetaProduMano=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductoOrdenDetaProduMano=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoOrdenDetaProduMano= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoOrdenDetaProduMano.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoOrdenDetaProduMano,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductoOrdenDetaProduMano= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductoOrdenDetaProduMano.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductoOrdenDetaProduMano,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductoOrdenDetaProduMano= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductoOrdenDetaProduMano.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductoOrdenDetaProduMano,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductoOrdenDetaProduMano= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductoOrdenDetaProduMano.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductoOrdenDetaProduMano,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductoOrdenDetaProduMano= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductoOrdenDetaProduMano.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductoOrdenDetaProduMano,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduMano= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduMano.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoOrdenDetaProduMano,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoOrdenDetaProduMano= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoOrdenDetaProduMano.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoOrdenDetaProduMano,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductoOrdenDetaProduMano= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductoOrdenDetaProduMano.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductoOrdenDetaProduMano,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoOrdenDetaProduMano= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoOrdenDetaProduMano.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoOrdenDetaProduMano,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMano= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMano.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMano,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductoOrdenDetaProduMano.add(this.jMenuItemDetalleCerrarProductoOrdenDetaProduMano);
		
		this.jmenuDetalleAccionesProductoOrdenDetaProduMano.add(this.jMenuItemActualizarProductoOrdenDetaProduMano);
		this.jmenuDetalleAccionesProductoOrdenDetaProduMano.add(this.jMenuItemEliminarProductoOrdenDetaProduMano);
		this.jmenuDetalleAccionesProductoOrdenDetaProduMano.add(this.jMenuItemCancelarProductoOrdenDetaProduMano);		
		
		//this.jmenuDetalleDatosProductoOrdenDetaProduMano.add(this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMano);				
		this.jmenuDetalleDatosProductoOrdenDetaProduMano.add(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMano);				
				
		//this.jmenuDetalleAccionesProductoOrdenDetaProduMano.add(this.jMenuItemGuardarCambiosProductoOrdenDetaProduMano);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductoOrdenDetaProduMano.add(this.jmenuDetalleArchivoProductoOrdenDetaProduMano);		
		this.jmenuBarDetalleProductoOrdenDetaProduMano.add(this.jmenuDetalleAccionesProductoOrdenDetaProduMano);		
		this.jmenuBarDetalleProductoOrdenDetaProduMano.add(this.jmenuDetalleDatosProductoOrdenDetaProduMano);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductoOrdenDetaProduMano);				
	}
	
	
	public void inicializarElementosCamposProductoOrdenDetaProduMano() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductoOrdenDetaProduMano = new JLabelMe();
		jLabelIdProductoOrdenDetaProduMano.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductoOrdenDetaProduMano = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductoOrdenDetaProduMano.setToolTipText(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductoOrdenDetaProduMano= new GridBagLayout();

		this.jPanelidProductoOrdenDetaProduMano.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMano);

		jLabelidProductoOrdenDetaProduMano = new JLabel();
		jLabelidProductoOrdenDetaProduMano.setText("Id");

		jLabelidProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidadProductoOrdenDetaProduMano = new JLabelMe();
		this.jLabelcantidadProductoOrdenDetaProduMano.setText(""+ProductoOrdenDetaProduManoConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadProductoOrdenDetaProduMano.setToolTipText("Cantidad");
		this.jLabelcantidadProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadProductoOrdenDetaProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadProductoOrdenDetaProduMano.setToolTipText(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutProductoOrdenDetaProduMano = new GridBagLayout();
		this.jPanelcantidadProductoOrdenDetaProduMano.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMano);


		jTextFieldcantidadProductoOrdenDetaProduMano= new JTextFieldMe();
		jTextFieldcantidadProductoOrdenDetaProduMano.setEnabled(false);
		jTextFieldcantidadProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadProductoOrdenDetaProduMano.setText("0");

		this.jButtoncantidadProductoOrdenDetaProduManoBusqueda= new JButtonMe();
		this.jButtoncantidadProductoOrdenDetaProduManoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductoOrdenDetaProduManoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductoOrdenDetaProduManoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadProductoOrdenDetaProduManoBusqueda.setText("U");
		this.jButtoncantidadProductoOrdenDetaProduManoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadProductoOrdenDetaProduManoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadProductoOrdenDetaProduManoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadProductoOrdenDetaProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadProductoOrdenDetaProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadProductoOrdenDetaProduManoBusqueda"));

		if(this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadProductoOrdenDetaProduManoBusqueda.setVisible(false);		}


					
		this.jLabelcostoProductoOrdenDetaProduMano = new JLabelMe();
		this.jLabelcostoProductoOrdenDetaProduMano.setText(""+ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoProductoOrdenDetaProduMano.setToolTipText("Costo");
		this.jLabelcostoProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoProductoOrdenDetaProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoProductoOrdenDetaProduMano.setToolTipText(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutProductoOrdenDetaProduMano = new GridBagLayout();
		this.jPanelcostoProductoOrdenDetaProduMano.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMano);


		jTextFieldcostoProductoOrdenDetaProduMano= new JTextFieldMe();
		jTextFieldcostoProductoOrdenDetaProduMano.setEnabled(false);
		jTextFieldcostoProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoProductoOrdenDetaProduMano.setText("0.0");

		this.jButtoncostoProductoOrdenDetaProduManoBusqueda= new JButtonMe();
		this.jButtoncostoProductoOrdenDetaProduManoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoProductoOrdenDetaProduManoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoProductoOrdenDetaProduManoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoProductoOrdenDetaProduManoBusqueda.setText("U");
		this.jButtoncostoProductoOrdenDetaProduManoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoProductoOrdenDetaProduManoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoProductoOrdenDetaProduManoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoProductoOrdenDetaProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoProductoOrdenDetaProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoProductoOrdenDetaProduManoBusqueda"));

		if(this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoProductoOrdenDetaProduManoBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalProductoOrdenDetaProduMano = new JLabelMe();
		this.jLabelcosto_totalProductoOrdenDetaProduMano.setText(""+ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalProductoOrdenDetaProduMano.setToolTipText("Costo Total");
		this.jLabelcosto_totalProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalProductoOrdenDetaProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalProductoOrdenDetaProduMano.setToolTipText(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutProductoOrdenDetaProduMano = new GridBagLayout();
		this.jPanelcosto_totalProductoOrdenDetaProduMano.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMano);


		jTextFieldcosto_totalProductoOrdenDetaProduMano= new JTextFieldMe();
		jTextFieldcosto_totalProductoOrdenDetaProduMano.setEnabled(false);
		jTextFieldcosto_totalProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalProductoOrdenDetaProduMano.setText("0.0");

		this.jButtoncosto_totalProductoOrdenDetaProduManoBusqueda= new JButtonMe();
		this.jButtoncosto_totalProductoOrdenDetaProduManoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProductoOrdenDetaProduManoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProductoOrdenDetaProduManoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalProductoOrdenDetaProduManoBusqueda.setText("U");
		this.jButtoncosto_totalProductoOrdenDetaProduManoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalProductoOrdenDetaProduManoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalProductoOrdenDetaProduManoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalProductoOrdenDetaProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalProductoOrdenDetaProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalProductoOrdenDetaProduManoBusqueda"));

		if(this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalProductoOrdenDetaProduManoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionProductoOrdenDetaProduMano = new JLabelMe();
		this.jLabeldescripcionProductoOrdenDetaProduMano.setText(""+ProductoOrdenDetaProduManoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionProductoOrdenDetaProduMano.setToolTipText("Descripcion");
		this.jLabeldescripcionProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionProductoOrdenDetaProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionProductoOrdenDetaProduMano.setToolTipText(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutProductoOrdenDetaProduMano = new GridBagLayout();
		this.jPaneldescripcionProductoOrdenDetaProduMano.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMano);


		jTextAreadescripcionProductoOrdenDetaProduMano= new JTextAreaMe();
		jTextAreadescripcionProductoOrdenDetaProduMano.setEnabled(false);
		jTextAreadescripcionProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoOrdenDetaProduMano.setLineWrap(true);
		jTextAreadescripcionProductoOrdenDetaProduMano.setWrapStyleWord(true);
		jTextAreadescripcionProductoOrdenDetaProduMano.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionProductoOrdenDetaProduMano.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionProductoOrdenDetaProduMano = new JScrollPane(jTextAreadescripcionProductoOrdenDetaProduMano);
		jscrollPanedescripcionProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionProductoOrdenDetaProduManoBusqueda= new JButtonMe();
		this.jButtondescripcionProductoOrdenDetaProduManoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoOrdenDetaProduManoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoOrdenDetaProduManoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionProductoOrdenDetaProduManoBusqueda.setText("U");
		this.jButtondescripcionProductoOrdenDetaProduManoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionProductoOrdenDetaProduManoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionProductoOrdenDetaProduManoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionProductoOrdenDetaProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionProductoOrdenDetaProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionProductoOrdenDetaProduManoBusqueda"));

		if(this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionProductoOrdenDetaProduManoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductoOrdenDetaProduMano() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_orden_deta_produProductoOrdenDetaProduMano = new JLabelMe();
		this.jLabelid_orden_deta_produProductoOrdenDetaProduMano.setText(""+ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDORDENDETAPRODU+" : *");
		this.jLabelid_orden_deta_produProductoOrdenDetaProduMano.setToolTipText("Orden Deta Produ");
		this.jLabelid_orden_deta_produProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_orden_deta_produProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_orden_deta_produProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_orden_deta_produProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_orden_deta_produProductoOrdenDetaProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_orden_deta_produProductoOrdenDetaProduMano.setToolTipText(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDORDENDETAPRODU);
		this.gridaBagLayoutProductoOrdenDetaProduMano = new GridBagLayout();
		this.jPanelid_orden_deta_produProductoOrdenDetaProduMano.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMano);


		jComboBoxid_orden_deta_produProductoOrdenDetaProduMano= new JComboBoxMe();
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_orden_deta_produProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_orden_deta_produProductoOrdenDetaProduMano= new JButtonMe();
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMano.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMano.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMano.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMano.setText("Buscar");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMano.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMano.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_deta_produProductoOrdenDetaProduMano,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_deta_produProductoOrdenDetaProduMano"));

		this.jButtonid_orden_deta_produProductoOrdenDetaProduManoBusqueda= new JButtonMe();
		this.jButtonid_orden_deta_produProductoOrdenDetaProduManoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduManoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduManoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_orden_deta_produProductoOrdenDetaProduManoBusqueda.setText("U");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduManoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduManoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_deta_produProductoOrdenDetaProduManoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_deta_produProductoOrdenDetaProduManoBusqueda"));

		if(this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_orden_deta_produProductoOrdenDetaProduManoBusqueda.setVisible(false);		}

		this.jButtonid_orden_deta_produProductoOrdenDetaProduManoUpdate= new JButtonMe();
		this.jButtonid_orden_deta_produProductoOrdenDetaProduManoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduManoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduManoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_orden_deta_produProductoOrdenDetaProduManoUpdate.setText("U");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduManoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduManoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_deta_produProductoOrdenDetaProduManoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_deta_produProductoOrdenDetaProduManoUpdate"));



					
		this.jLabelid_tipo_mano_produ_empresaProductoOrdenDetaProduMano = new JLabelMe();
		this.jLabelid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setText(""+ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA+" : *");
		this.jLabelid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setToolTipText("Tipo Mano Obra Empresa");
		this.jLabelid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_mano_produ_empresaProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_mano_produ_empresaProductoOrdenDetaProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setToolTipText(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA);
		this.gridaBagLayoutProductoOrdenDetaProduMano = new GridBagLayout();
		this.jPanelid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMano);


		jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano= new JComboBoxMe();
		jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduMano= new JButtonMe();
		this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setText("Buscar");
		this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduMano,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_mano_produ_empresaProductoOrdenDetaProduMano"));

		this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoBusqueda= new JButtonMe();
		this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoBusqueda.setText("U");
		this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_mano_produ_empresaProductoOrdenDetaProduManoBusqueda"));

		if(this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoUpdate= new JButtonMe();
		this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoUpdate.setText("U");
		this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_mano_produ_empresaProductoOrdenDetaProduManoUpdate"));



					
		this.jLabelid_tipo_proceso_empresa_produProductoOrdenDetaProduMano = new JLabelMe();
		this.jLabelid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setText(""+ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU+" : *");
		this.jLabelid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setToolTipText("Tipo Proceso Empresa Produ");
		this.jLabelid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_proceso_empresa_produProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_proceso_empresa_produProductoOrdenDetaProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setToolTipText(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU);
		this.gridaBagLayoutProductoOrdenDetaProduMano = new GridBagLayout();
		this.jPanelid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMano);


		jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano= new JComboBoxMe();
		jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMano= new JButtonMe();
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setText("Buscar");
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMano,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proceso_empresa_produProductoOrdenDetaProduMano"));

		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoBusqueda= new JButtonMe();
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoBusqueda.setText("U");
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proceso_empresa_produProductoOrdenDetaProduManoBusqueda"));

		if(this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoUpdate= new JButtonMe();
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoUpdate.setText("U");
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proceso_empresa_produProductoOrdenDetaProduManoUpdate"));



					
		this.jLabelid_unidadProductoOrdenDetaProduMano = new JLabelMe();
		this.jLabelid_unidadProductoOrdenDetaProduMano.setText(""+ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadProductoOrdenDetaProduMano.setToolTipText("Unad");
		this.jLabelid_unidadProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadProductoOrdenDetaProduMano=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadProductoOrdenDetaProduMano.setToolTipText(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutProductoOrdenDetaProduMano = new GridBagLayout();
		this.jPanelid_unidadProductoOrdenDetaProduMano.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMano);


		jComboBoxid_unidadProductoOrdenDetaProduMano= new JComboBoxMe();
		jComboBoxid_unidadProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadProductoOrdenDetaProduMano= new JButtonMe();
		this.jButtonid_unidadProductoOrdenDetaProduMano.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoOrdenDetaProduMano.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoOrdenDetaProduMano.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoOrdenDetaProduMano.setText("Buscar");
		this.jButtonid_unidadProductoOrdenDetaProduMano.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadProductoOrdenDetaProduMano.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoOrdenDetaProduMano,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadProductoOrdenDetaProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoOrdenDetaProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoOrdenDetaProduMano"));

		this.jButtonid_unidadProductoOrdenDetaProduManoBusqueda= new JButtonMe();
		this.jButtonid_unidadProductoOrdenDetaProduManoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoOrdenDetaProduManoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoOrdenDetaProduManoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoOrdenDetaProduManoBusqueda.setText("U");
		this.jButtonid_unidadProductoOrdenDetaProduManoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadProductoOrdenDetaProduManoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoOrdenDetaProduManoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadProductoOrdenDetaProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoOrdenDetaProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoOrdenDetaProduManoBusqueda"));

		if(this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadProductoOrdenDetaProduManoBusqueda.setVisible(false);		}

		this.jButtonid_unidadProductoOrdenDetaProduManoUpdate= new JButtonMe();
		this.jButtonid_unidadProductoOrdenDetaProduManoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoOrdenDetaProduManoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoOrdenDetaProduManoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoOrdenDetaProduManoUpdate.setText("U");
		this.jButtonid_unidadProductoOrdenDetaProduManoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadProductoOrdenDetaProduManoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoOrdenDetaProduManoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadProductoOrdenDetaProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoOrdenDetaProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoOrdenDetaProduManoUpdate"));



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
		//this.jInternalFrameDetalleProductoOrdenDetaProduMano = new ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Orden  Mano De Obra DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoOrdenDetaProduMano= new GridBagLayout();
		

		
		String sToolTipProductoOrdenDetaProduMano="";
		sToolTipProductoOrdenDetaProduMano=ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoOrdenDetaProduMano+="(Produccion.ProductoOrdenDetaProduMano)";
		}
		
		if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoOrdenDetaProduMano+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductoOrdenDetaProduMano = new JButtonMe();
		this.jButtonModificarProductoOrdenDetaProduMano = new JButtonMe();
        this.jButtonActualizarProductoOrdenDetaProduMano = new JButtonMe();
        this.jButtonEliminarProductoOrdenDetaProduMano = new JButtonMe();
        this.jButtonCancelarProductoOrdenDetaProduMano = new JButtonMe();
        this.jButtonGuardarCambiosProductoOrdenDetaProduMano = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMano = new JButtonMe();
		this.jButtonCerrarProductoOrdenDetaProduMano = new JButtonMe();
		
		this.jScrollPanelDatosProductoOrdenDetaProduMano = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano = new JScrollPane();
		this.jScrollPanelDatosGeneralProductoOrdenDetaProduMano = new JScrollPane();
				
		
		
		this.jPanelCamposProductoOrdenDetaProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductoOrdenDetaProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductoOrdenDetaProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductoOrdenDetaProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Orden  Mano De Obra";
		
		if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden  Mano De Obraes" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoOrdenDetaProduMano.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductoOrdenDetaProduMano.setName("jPanelCamposProductoOrdenDetaProduMano"); 

		this.jPanelCamposOcultosProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductoOrdenDetaProduMano.setName("jPanelCamposOcultosProductoOrdenDetaProduMano"); 

        this.jPanelAccionesProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoOrdenDetaProduMano.setToolTipText("Acciones");
        this.jPanelAccionesProductoOrdenDetaProduMano.setName("Acciones"); 

		this.jPanelAccionesFormularioProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductoOrdenDetaProduMano.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductoOrdenDetaProduMano.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductoOrdenDetaProduMano.setText("Nuevo");
		this.jButtonModificarProductoOrdenDetaProduMano.setText("Editar");
        this.jButtonActualizarProductoOrdenDetaProduMano.setText("Actualizar");
        this.jButtonEliminarProductoOrdenDetaProduMano.setText("Eliminar");
        this.jButtonCancelarProductoOrdenDetaProduMano.setText("Cancelar");
        this.jButtonGuardarCambiosProductoOrdenDetaProduMano.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMano.setText("Guardar");
		this.jButtonCerrarProductoOrdenDetaProduMano.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoOrdenDetaProduMano,"nuevo_button","Nuevo",this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductoOrdenDetaProduMano,"modificar_button","Editar",this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductoOrdenDetaProduMano,"actualizar_button","Actualizar",this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductoOrdenDetaProduMano,"eliminar_button","Eliminar",this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductoOrdenDetaProduMano,"cancelar_button","Cancelar",this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductoOrdenDetaProduMano,"guardarcambios_button","Guardar",this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMano,"guardarcambiostabla_button","Guardar",this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoOrdenDetaProduMano,"cerrar_button","Salir",this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductoOrdenDetaProduMano.setToolTipText("Nuevo"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductoOrdenDetaProduMano.setToolTipText("Editar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductoOrdenDetaProduMano.setToolTipText("Actualizar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductoOrdenDetaProduMano.setToolTipText("Eliminar)"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductoOrdenDetaProduMano.setToolTipText("Cancelar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductoOrdenDetaProduMano.setToolTipText("Guardar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMano.setToolTipText("Guardar"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoOrdenDetaProduMano.setToolTipText("Salir"+" "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoOrdenDetaProduMano";
		inputMap = this.jButtonNuevoProductoOrdenDetaProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoOrdenDetaProduMano.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoOrdenDetaProduMano"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductoOrdenDetaProduMano";
		inputMap = this.jButtonActualizarProductoOrdenDetaProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductoOrdenDetaProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductoOrdenDetaProduMano"));
		
		//ELIMINAR
		sMapKey = "EliminarProductoOrdenDetaProduMano";
		inputMap = this.jButtonEliminarProductoOrdenDetaProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductoOrdenDetaProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductoOrdenDetaProduMano"));
		
		//CANCELAR	
		sMapKey = "CancelarProductoOrdenDetaProduMano";
		inputMap = this.jButtonCancelarProductoOrdenDetaProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductoOrdenDetaProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductoOrdenDetaProduMano"));
		
		//CERRAR		
		sMapKey = "CerrarProductoOrdenDetaProduMano";
		inputMap = this.jButtonCerrarProductoOrdenDetaProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoOrdenDetaProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoOrdenDetaProduMano"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoOrdenDetaProduMano";
		inputMap = this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMano.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMano.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoOrdenDetaProduMano"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductoOrdenDetaProduMano = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductoOrdenDetaProduMano.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductoOrdenDetaProduMano.setToolTipText("Nuevo ProductoOrdenDetaProduMano");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMano = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMano.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMano.setToolTipText("Sin Cerrar Ventana ProductoOrdenDetaProduMano");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMano = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMano.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMano.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMano = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.setText("Accion");
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductoOrdenDetaProduMano = new JLabelMe();
		
		this.jLabelAccionesProductoOrdenDetaProduMano.setText("Acciones");		
		this.jLabelAccionesProductoOrdenDetaProduMano.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoOrdenDetaProduMano.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoOrdenDetaProduMano.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductoOrdenDetaProduMano();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductoOrdenDetaProduMano();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductoOrdenDetaProduMano=new JTabbedPane();
		this.jTabbedPaneRelacionesProductoOrdenDetaProduMano.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductoOrdenDetaProduMano,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductoOrdenDetaProduMano = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductoOrdenDetaProduMano = new GridBagLayout();
		
		this.jPanelCamposProductoOrdenDetaProduMano.setLayout(gridaBagLayoutCamposProductoOrdenDetaProduMano);
		this.jPanelCamposOcultosProductoOrdenDetaProduMano.setLayout(gridaBagLayoutCamposOcultosProductoOrdenDetaProduMano);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductoOrdenDetaProduMano.add(jLabelIdProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);



	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductoOrdenDetaProduMano.add(jLabelidProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);


	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_orden_deta_produProductoOrdenDetaProduMano.add(jLabelid_orden_deta_produProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_orden_deta_produProductoOrdenDetaProduMano.add(jButtonid_orden_deta_produProductoOrdenDetaProduManoBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMano);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 3;
		this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_orden_deta_produProductoOrdenDetaProduMano.add(jButtonid_orden_deta_produProductoOrdenDetaProduManoUpdate, this.gridBagConstraintsProductoOrdenDetaProduMano);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_orden_deta_produProductoOrdenDetaProduMano.add(jComboBoxid_orden_deta_produProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);


	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.add(jLabelid_tipo_mano_produ_empresaProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.add(jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMano);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 3;
		this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.add(jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoUpdate, this.gridBagConstraintsProductoOrdenDetaProduMano);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.add(jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);


	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.add(jLabelid_tipo_proceso_empresa_produProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.add(jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMano);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 3;
		this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.add(jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoUpdate, this.gridBagConstraintsProductoOrdenDetaProduMano);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.add(jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);


	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadProductoOrdenDetaProduMano.add(jLabelid_unidadProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoOrdenDetaProduMano.add(jButtonid_unidadProductoOrdenDetaProduManoBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMano);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 3;
		this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoOrdenDetaProduMano.add(jButtonid_unidadProductoOrdenDetaProduManoUpdate, this.gridBagConstraintsProductoOrdenDetaProduMano);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadProductoOrdenDetaProduMano.add(jComboBoxid_unidadProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);


	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadProductoOrdenDetaProduMano.add(jLabelcantidadProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadProductoOrdenDetaProduMano.add(jButtoncantidadProductoOrdenDetaProduManoBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMano);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadProductoOrdenDetaProduMano.add(jTextFieldcantidadProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);


	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoProductoOrdenDetaProduMano.add(jLabelcostoProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoProductoOrdenDetaProduMano.add(jButtoncostoProductoOrdenDetaProduManoBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMano);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoProductoOrdenDetaProduMano.add(jTextFieldcostoProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);


	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalProductoOrdenDetaProduMano.add(jLabelcosto_totalProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalProductoOrdenDetaProduMano.add(jButtoncosto_totalProductoOrdenDetaProduManoBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMano);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalProductoOrdenDetaProduMano.add(jTextFieldcosto_totalProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);


	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionProductoOrdenDetaProduMano.add(jLabeldescripcionProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionProductoOrdenDetaProduMano.add(jButtondescripcionProductoOrdenDetaProduManoBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMano);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionProductoOrdenDetaProduMano.add(jscrollPanedescripcionProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iYPanelCamposProductoOrdenDetaProduMano;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iXPanelCamposProductoOrdenDetaProduMano++;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMano.add(this.jPanelidProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);



	if(iXPanelCamposProductoOrdenDetaProduMano % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMano=0;
		iYPanelCamposProductoOrdenDetaProduMano++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iYPanelCamposProductoOrdenDetaProduMano;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iXPanelCamposProductoOrdenDetaProduMano++;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMano.add(this.jPanelid_orden_deta_produProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);



	if(iXPanelCamposProductoOrdenDetaProduMano % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMano=0;
		iYPanelCamposProductoOrdenDetaProduMano++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iYPanelCamposProductoOrdenDetaProduMano;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iXPanelCamposProductoOrdenDetaProduMano++;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMano.add(this.jPanelid_tipo_mano_produ_empresaProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);



	if(iXPanelCamposProductoOrdenDetaProduMano % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMano=0;
		iYPanelCamposProductoOrdenDetaProduMano++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iYPanelCamposProductoOrdenDetaProduMano;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iXPanelCamposProductoOrdenDetaProduMano++;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMano.add(this.jPanelid_tipo_proceso_empresa_produProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);



	if(iXPanelCamposProductoOrdenDetaProduMano % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMano=0;
		iYPanelCamposProductoOrdenDetaProduMano++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iYPanelCamposProductoOrdenDetaProduMano;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iXPanelCamposProductoOrdenDetaProduMano++;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMano.add(this.jPanelid_unidadProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);



	if(iXPanelCamposProductoOrdenDetaProduMano % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMano=0;
		iYPanelCamposProductoOrdenDetaProduMano++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iYPanelCamposProductoOrdenDetaProduMano;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iXPanelCamposProductoOrdenDetaProduMano++;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMano.add(this.jPanelcantidadProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);



	if(iXPanelCamposProductoOrdenDetaProduMano % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMano=0;
		iYPanelCamposProductoOrdenDetaProduMano++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iYPanelCamposProductoOrdenDetaProduMano;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iXPanelCamposProductoOrdenDetaProduMano++;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMano.add(this.jPanelcostoProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);



	if(iXPanelCamposProductoOrdenDetaProduMano % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMano=0;
		iYPanelCamposProductoOrdenDetaProduMano++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iYPanelCamposProductoOrdenDetaProduMano;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iXPanelCamposProductoOrdenDetaProduMano++;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMano.add(this.jPanelcosto_totalProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);



	if(iXPanelCamposProductoOrdenDetaProduMano % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMano=0;
		iYPanelCamposProductoOrdenDetaProduMano++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iYPanelCamposProductoOrdenDetaProduMano;
	this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iXPanelCamposProductoOrdenDetaProduMano++;
	this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMano.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMano.add(this.jPaneldescripcionProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);



	if(iXPanelCamposProductoOrdenDetaProduMano % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMano=0;
		iYPanelCamposProductoOrdenDetaProduMano++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductoOrdenDetaProduMano= new GridBagLayout();
		this.jPanelAccionesProductoOrdenDetaProduMano.setLayout(gridaBagLayoutAccionesProductoOrdenDetaProduMano);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductoOrdenDetaProduMano= new GridBagLayout();
		this.jPanelAccionesFormularioProductoOrdenDetaProduMano.setLayout(gridaBagLayoutAccionesFormularioProductoOrdenDetaProduMano);
		
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoOrdenDetaProduMano.add(this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);

		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoOrdenDetaProduMano.add(this.jCheckBoxPostAccionNuevoProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.productoordendetaprodumanoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoOrdenDetaProduMano.add(this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.productoordendetaprodumanoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoOrdenDetaProduMano.add(this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductoOrdenDetaProduMano.add(this.jButtonModificarProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);							

		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductoOrdenDetaProduMano.add(this.jButtonEliminarProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		
			
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoOrdenDetaProduMano.add(this.jButtonActualizarProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);


		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoOrdenDetaProduMano.add(this.jButtonGuardarCambiosProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);	
		
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = 0;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductoOrdenDetaProduMano.add(this.jButtonCancelarProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoOrdenDetaProduMano = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoOrdenDetaProduMano);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();						
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;		
			//this.gridBagConstraintsProductoOrdenDetaProduMano.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoOrdenDetaProduMano.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx =0;
		this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoOrdenDetaProduMano.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductoOrdenDetaProduManoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductoOrdenDetaProduMano = new ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Orden  Mano De Obra DATOS");
			
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
			
	        //this.setTitle("[FOR] - Orden  Mano De Obra DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Orden  Mano De Obra Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductoOrdenDetaProduManoModel productoordendetaprodumanoModel=new ProductoOrdenDetaProduManoModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductoOrdenDetaProduManoModel.ProductoOrdenDetaProduManoFocusTraversalPolicy productoordendetaprodumanoFocusTraversalPolicy = productoordendetaprodumanoModel.new ProductoOrdenDetaProduManoFocusTraversalPolicy(this);
			
			//productoordendetaprodumanoFocusTraversalPolicy.setproductoordendetaprodumanoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productoordendetaprodumanoModel);
			
			
			this.jContentPaneDetalleProductoOrdenDetaProduMano = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductoOrdenDetaProduMano = new GridBagLayout();	
			this.jContentPaneDetalleProductoOrdenDetaProduMano.setLayout(gridaBagLayoutDetalleProductoOrdenDetaProduMano);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoOrdenDetaProduMano = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
				this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
					
				
				this.jContentPaneDetalleProductoOrdenDetaProduMano.add(jTtoolBarDetalleProductoOrdenDetaProduMano, gridBagConstraintsProductoOrdenDetaProduMano);								
				
}
			
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano=   new JScrollPane(jContentPaneDetalleProductoOrdenDetaProduMano,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMano=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMano.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMano.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMano.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
	        
			this.jContentPaneDetalleProductoOrdenDetaProduMano.add(jPanelCamposProductoOrdenDetaProduMano, gridBagConstraintsProductoOrdenDetaProduMano);
			
			
			
			
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
						&& productoordendetaprodumanoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productoordendetaprodumanoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductoOrdenDetaProduMano= new GridBagConstraints();
						this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
						this.jContentPaneDetalleProductoOrdenDetaProduMano.add(this.jTabbedPaneRelacionesProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductoOrdenDetaProduMano.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductoOrdenDetaProduMano.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
					this.gridBagConstraintsProductoOrdenDetaProduMano.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
					
				
					this.jContentPaneDetalleProductoOrdenDetaProduMano.add(jPanelCamposOcultosProductoOrdenDetaProduMano, gridBagConstraintsProductoOrdenDetaProduMano);
				
					this.jPanelCamposOcultosProductoOrdenDetaProduMano.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
	        this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductoOrdenDetaProduMano.add(this.jPanelAccionesFormularioProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);							
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
	        this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
	        
			
			this.jContentPaneDetalleProductoOrdenDetaProduMano.add(this.jPanelAccionesProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductoOrdenDetaProduMano);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano=   new JScrollPane(this.jPanelCamposProductoOrdenDetaProduMano,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
			this.gridBagConstraintsProductoOrdenDetaProduMano.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductoOrdenDetaProduMano.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductoOrdenDetaProduMano.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);			
			
			this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
			
			
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		
			
		this.gridBagConstraintsProductoOrdenDetaProduMano = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMano.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoOrdenDetaProduMano, this.gridBagConstraintsProductoOrdenDetaProduMano);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductoOrdenDetaProduMano;//jContentPane;
		
		return jScrollPanelDatosEdicionProductoOrdenDetaProduMano;
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
