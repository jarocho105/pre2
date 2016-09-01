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


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.produccion.util.ProductoOrdenDetaProduGastoConstantesFunciones;

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
public class ProductoOrdenDetaProduGastoDetalleFormJInternalFrame extends ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductoOrdenDetaProduGasto;
	
	protected JMenuBar jmenuBarDetalleProductoOrdenDetaProduGasto;
	
	protected JMenu jmenuDetalleProductoOrdenDetaProduGasto;
	protected JMenu jmenuDetalleArchivoProductoOrdenDetaProduGasto;
	protected JMenu jmenuDetalleAccionesProductoOrdenDetaProduGasto;
	protected JMenu jmenuDetalleDatosProductoOrdenDetaProduGasto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductoOrdenDetaProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoOrdenDetaProduGasto;	
	protected GridBagConstraints gridBagConstraintsProductoOrdenDetaProduGasto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductoOrdenDetaProduGasto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected OrdenDetaProduBeanSwingJInternalFrame ordendetaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ordendetaprodu="";

	protected TipoGastoProduEmpresaBeanSwingJInternalFrame tipogastoproduempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogastoproduempresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledebito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";

	protected ClienteBeanSwingJInternalFrame clienteproveedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_clienteproveedor="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public ProductoOrdenDetaProduGastoSessionBean productoordendetaprodugastoSessionBean;
	
	
	
	
	public OrdenDetaProduSessionBean ordendetaproduSessionBean;
	public TipoGastoProduEmpresaSessionBean tipogastoproduempresaSessionBean;
	public CuentaContableSessionBean cuentacontabledebitoSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;
	public ClienteSessionBean clienteproveedorSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public UnidadSessionBean unidadSessionBean;	
	
	public ProductoOrdenDetaProduGastoLogic productoordendetaprodugastoLogic;
	
	public JScrollPane jScrollPanelDatosProductoOrdenDetaProduGasto;
	public JScrollPane jScrollPanelDatosEdicionProductoOrdenDetaProduGasto;
	public JScrollPane jScrollPanelDatosGeneralProductoOrdenDetaProduGasto;
	
	protected JPanel jPanelCamposProductoOrdenDetaProduGasto;    
	protected JPanel jPanelCamposOcultosProductoOrdenDetaProduGasto;    	
	protected JPanel jPanelAccionesProductoOrdenDetaProduGasto;
	protected JPanel jPanelAccionesFormularioProductoOrdenDetaProduGasto;
    
	
	
	protected Integer iXPanelCamposProductoOrdenDetaProduGasto=0;
	protected Integer iYPanelCamposProductoOrdenDetaProduGasto=0;
	
	protected Integer iXPanelCamposOcultosProductoOrdenDetaProduGasto=0;
	protected Integer iYPanelCamposOcultosProductoOrdenDetaProduGasto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductoOrdenDetaProduGasto;
	public JButton jButtonModificarProductoOrdenDetaProduGasto;
	public JButton jButtonActualizarProductoOrdenDetaProduGasto;
    public JButton jButtonEliminarProductoOrdenDetaProduGasto;
	public JButton jButtonCancelarProductoOrdenDetaProduGasto;
    public JButton jButtonGuardarCambiosProductoOrdenDetaProduGasto;
	public JButton jButtonGuardarCambiosTablaProductoOrdenDetaProduGasto;
	protected JButton jButtonCerrarProductoOrdenDetaProduGasto;
	
	
	protected JButton jButtonProcesarInformacionProductoOrdenDetaProduGasto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductoOrdenDetaProduGasto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduGasto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduGasto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoOrdenDetaProduGasto;
	protected JButton jButtonModificarToolBarProductoOrdenDetaProduGasto;
	protected JButton jButtonActualizarToolBarProductoOrdenDetaProduGasto;
    protected JButton jButtonEliminarToolBarProductoOrdenDetaProduGasto;
	protected JButton jButtonCancelarToolBarProductoOrdenDetaProduGasto;
    protected JButton jButtonGuardarCambiosToolBarProductoOrdenDetaProduGasto;
	protected JButton jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduGasto;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProduGasto;
	protected JButton jButtonCerrarToolBarProductoOrdenDetaProduGasto;
	
	protected JButton jButtonProcesarInformacionToolBarProductoOrdenDetaProduGasto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemModificarProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemActualizarProductoOrdenDetaProduGasto;
    protected JMenuItem jMenuItemEliminarProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemCancelarProductoOrdenDetaProduGasto;
    protected JMenuItem jMenuItemGuardarCambiosProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemCerrarProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemDetalleCerrarProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoOrdenDetaProduGasto;
	
	protected JMenuItem jMenuItemProcesarInformacionProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemMostrarOcultarProductoOrdenDetaProduGasto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoOrdenDetaProduGasto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoOrdenDetaProduGasto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoOrdenDetaProduGasto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductoOrdenDetaProduGasto;
	public JLabel jLabelIdProductoOrdenDetaProduGasto;
	public JLabel jLabelidProductoOrdenDetaProduGasto;
	public JButton jButtonidProductoOrdenDetaProduGastoBusqueda= new JButtonMe();

	public JPanel jPanelcantidadProductoOrdenDetaProduGasto;
	public JLabel jLabelcantidadProductoOrdenDetaProduGasto;
	public JTextField jTextFieldcantidadProductoOrdenDetaProduGasto;
	public JButton jButtoncantidadProductoOrdenDetaProduGastoBusqueda= new JButtonMe();

	public JPanel jPanelcostoProductoOrdenDetaProduGasto;
	public JLabel jLabelcostoProductoOrdenDetaProduGasto;
	public JTextField jTextFieldcostoProductoOrdenDetaProduGasto;
	public JButton jButtoncostoProductoOrdenDetaProduGastoBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalProductoOrdenDetaProduGasto;
	public JLabel jLabelcosto_totalProductoOrdenDetaProduGasto;
	public JTextField jTextFieldcosto_totalProductoOrdenDetaProduGasto;
	public JButton jButtoncosto_totalProductoOrdenDetaProduGastoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionProductoOrdenDetaProduGasto;
	public JLabel jLabeldescripcionProductoOrdenDetaProduGasto;
	public JTextArea jTextAreadescripcionProductoOrdenDetaProduGasto;
	public JScrollPane jscrollPanedescripcionProductoOrdenDetaProduGasto;
	public JButton jButtondescripcionProductoOrdenDetaProduGastoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_orden_deta_produProductoOrdenDetaProduGasto;
	public JLabel jLabelid_orden_deta_produProductoOrdenDetaProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto;
	public JButton jButtonid_orden_deta_produProductoOrdenDetaProduGasto= new JButtonMe();
	public JButton jButtonid_orden_deta_produProductoOrdenDetaProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_orden_deta_produProductoOrdenDetaProduGastoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto;
	public JLabel jLabelid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto;
	public JButton jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto= new JButtonMe();
	public JButton jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_debitoProductoOrdenDetaProduGasto;
	public JLabel jLabelid_cuenta_contable_debitoProductoOrdenDetaProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto;
	public JButton jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGasto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_creditoProductoOrdenDetaProduGasto;
	public JLabel jLabelid_cuenta_contable_creditoProductoOrdenDetaProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto;
	public JButton jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGasto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoArbol= new JButtonMe();

	public JPanel jPanelid_cliente_proveedorProductoOrdenDetaProduGasto;
	public JLabel jLabelid_cliente_proveedorProductoOrdenDetaProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto;
	public JButton jButtonid_cliente_proveedorProductoOrdenDetaProduGasto= new JButtonMe();
	public JButton jButtonid_cliente_proveedorProductoOrdenDetaProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_cliente_proveedorProductoOrdenDetaProduGastoBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaProductoOrdenDetaProduGasto;
	public JLabel jLabelid_facturaProductoOrdenDetaProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaProductoOrdenDetaProduGasto;
	public JButton jButtonid_facturaProductoOrdenDetaProduGasto= new JButtonMe();
	public JButton jButtonid_facturaProductoOrdenDetaProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_facturaProductoOrdenDetaProduGastoBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadProductoOrdenDetaProduGasto;
	public JLabel jLabelid_unidadProductoOrdenDetaProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadProductoOrdenDetaProduGasto;
	public JButton jButtonid_unidadProductoOrdenDetaProduGasto= new JButtonMe();
	public JButton jButtonid_unidadProductoOrdenDetaProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_unidadProductoOrdenDetaProduGastoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductoOrdenDetaProduGasto;
	
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
	
	public ProductoOrdenDetaProduGastoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductoOrdenDetaProduGasto=new JPanel();
				this.jPanelAccionesFormularioProductoOrdenDetaProduGasto=new JPanel();
				this.jmenuBarDetalleProductoOrdenDetaProduGasto=new JMenuBar();
				this.jTtoolBarDetalleProductoOrdenDetaProduGasto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduGastoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductoOrdenDetaProduGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductoOrdenDetaProduGastoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductoOrdenDetaProduGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduGastoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoOrdenDetaProduGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduGastoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoOrdenDetaProduGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduGastoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoOrdenDetaProduGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductoOrdenDetaProduGasto() {
		return this.jButtonActualizarToolBarProductoOrdenDetaProduGasto;
	}
	
	public JButton getjButtonEliminarToolBarProductoOrdenDetaProduGasto() {
		return this.jButtonEliminarToolBarProductoOrdenDetaProduGasto;
	}
	
	public JButton getjButtonCancelarToolBarProductoOrdenDetaProduGasto() {
		return this.jButtonCancelarToolBarProductoOrdenDetaProduGasto;
	}		
	
	public JButton getjButtonProcesarInformacionProductoOrdenDetaProduGasto() {
		return this.jButtonProcesarInformacionProductoOrdenDetaProduGasto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoOrdenDetaProduGasto)	{
		this.jButtonProcesarInformacionProductoOrdenDetaProduGasto = jButtonProcesarInformacionProductoOrdenDetaProduGasto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoOrdenDetaProduGasto() {
		return this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoOrdenDetaProduGasto(
			JComboBox jComboBoxTiposRelacionesProductoOrdenDetaProduGasto) {
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduGasto = jComboBoxTiposRelacionesProductoOrdenDetaProduGasto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoOrdenDetaProduGasto(
			JComboBox jComboBoxTiposAccionesProductoOrdenDetaProduGasto) {
		this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto = jComboBoxTiposAccionesProductoOrdenDetaProduGasto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto() {
		return this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto(
			JComboBox jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto) {
		this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto = jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productoordendetaprodugastoSessionBean=new ProductoOrdenDetaProduGastoSessionBean();
		
		this.productoordendetaprodugastoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoordendetaprodugastoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoOrdenDetaProduGastoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoOrdenDetaProduGastoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoOrdenDetaProduGastoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Orden  Gasto MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductoOrdenDetaProduGastoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductoOrdenDetaProduGasto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductoOrdenDetaProduGasto=new JButtonMe();
				this.jButtonModificarToolBarProductoOrdenDetaProduGasto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductoOrdenDetaProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductoOrdenDetaProduGasto,this.jTtoolBarDetalleProductoOrdenDetaProduGasto,
							"actualizar","actualizar","Actualizar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductoOrdenDetaProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductoOrdenDetaProduGasto,this.jTtoolBarDetalleProductoOrdenDetaProduGasto,
							"eliminar","eliminar","Eliminar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductoOrdenDetaProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductoOrdenDetaProduGasto,this.jTtoolBarDetalleProductoOrdenDetaProduGasto,
							"cancelar","cancelar","Cancelar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductoOrdenDetaProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductoOrdenDetaProduGasto,this.jTtoolBarDetalleProductoOrdenDetaProduGasto,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductoOrdenDetaProduGasto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductoOrdenDetaProduGasto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductoOrdenDetaProduGasto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductoOrdenDetaProduGasto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductoOrdenDetaProduGasto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoOrdenDetaProduGasto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoOrdenDetaProduGasto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoOrdenDetaProduGasto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductoOrdenDetaProduGasto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductoOrdenDetaProduGasto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductoOrdenDetaProduGasto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductoOrdenDetaProduGasto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductoOrdenDetaProduGasto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductoOrdenDetaProduGasto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductoOrdenDetaProduGasto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductoOrdenDetaProduGasto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductoOrdenDetaProduGasto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductoOrdenDetaProduGasto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductoOrdenDetaProduGasto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductoOrdenDetaProduGasto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduGasto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduGasto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoOrdenDetaProduGasto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoOrdenDetaProduGasto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoOrdenDetaProduGasto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoOrdenDetaProduGasto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductoOrdenDetaProduGasto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductoOrdenDetaProduGasto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductoOrdenDetaProduGasto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoOrdenDetaProduGasto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoOrdenDetaProduGasto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoOrdenDetaProduGasto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduGasto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduGasto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduGasto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductoOrdenDetaProduGasto.add(this.jMenuItemDetalleCerrarProductoOrdenDetaProduGasto);
		
		this.jmenuDetalleAccionesProductoOrdenDetaProduGasto.add(this.jMenuItemActualizarProductoOrdenDetaProduGasto);
		this.jmenuDetalleAccionesProductoOrdenDetaProduGasto.add(this.jMenuItemEliminarProductoOrdenDetaProduGasto);
		this.jmenuDetalleAccionesProductoOrdenDetaProduGasto.add(this.jMenuItemCancelarProductoOrdenDetaProduGasto);		
		
		//this.jmenuDetalleDatosProductoOrdenDetaProduGasto.add(this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduGasto);				
		this.jmenuDetalleDatosProductoOrdenDetaProduGasto.add(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduGasto);				
				
		//this.jmenuDetalleAccionesProductoOrdenDetaProduGasto.add(this.jMenuItemGuardarCambiosProductoOrdenDetaProduGasto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductoOrdenDetaProduGasto.add(this.jmenuDetalleArchivoProductoOrdenDetaProduGasto);		
		this.jmenuBarDetalleProductoOrdenDetaProduGasto.add(this.jmenuDetalleAccionesProductoOrdenDetaProduGasto);		
		this.jmenuBarDetalleProductoOrdenDetaProduGasto.add(this.jmenuDetalleDatosProductoOrdenDetaProduGasto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductoOrdenDetaProduGasto);				
	}
	
	
	public void inicializarElementosCamposProductoOrdenDetaProduGasto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductoOrdenDetaProduGasto = new JLabelMe();
		jLabelIdProductoOrdenDetaProduGasto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductoOrdenDetaProduGasto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductoOrdenDetaProduGasto.setToolTipText(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductoOrdenDetaProduGasto= new GridBagLayout();

		this.jPanelidProductoOrdenDetaProduGasto.setLayout(this.gridaBagLayoutProductoOrdenDetaProduGasto);

		jLabelidProductoOrdenDetaProduGasto = new JLabel();
		jLabelidProductoOrdenDetaProduGasto.setText("Id");

		jLabelidProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidadProductoOrdenDetaProduGasto = new JLabelMe();
		this.jLabelcantidadProductoOrdenDetaProduGasto.setText(""+ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadProductoOrdenDetaProduGasto.setToolTipText("Cantidad");
		this.jLabelcantidadProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadProductoOrdenDetaProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadProductoOrdenDetaProduGasto.setToolTipText(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutProductoOrdenDetaProduGasto = new GridBagLayout();
		this.jPanelcantidadProductoOrdenDetaProduGasto.setLayout(this.gridaBagLayoutProductoOrdenDetaProduGasto);


		jTextFieldcantidadProductoOrdenDetaProduGasto= new JTextFieldMe();
		jTextFieldcantidadProductoOrdenDetaProduGasto.setEnabled(false);
		jTextFieldcantidadProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadProductoOrdenDetaProduGasto.setText("0");

		this.jButtoncantidadProductoOrdenDetaProduGastoBusqueda= new JButtonMe();
		this.jButtoncantidadProductoOrdenDetaProduGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductoOrdenDetaProduGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductoOrdenDetaProduGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadProductoOrdenDetaProduGastoBusqueda.setText("U");
		this.jButtoncantidadProductoOrdenDetaProduGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadProductoOrdenDetaProduGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadProductoOrdenDetaProduGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadProductoOrdenDetaProduGastoBusqueda"));

		if(this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadProductoOrdenDetaProduGastoBusqueda.setVisible(false);		}


					
		this.jLabelcostoProductoOrdenDetaProduGasto = new JLabelMe();
		this.jLabelcostoProductoOrdenDetaProduGasto.setText(""+ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoProductoOrdenDetaProduGasto.setToolTipText("Costo");
		this.jLabelcostoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoProductoOrdenDetaProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoProductoOrdenDetaProduGasto.setToolTipText(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutProductoOrdenDetaProduGasto = new GridBagLayout();
		this.jPanelcostoProductoOrdenDetaProduGasto.setLayout(this.gridaBagLayoutProductoOrdenDetaProduGasto);


		jTextFieldcostoProductoOrdenDetaProduGasto= new JTextFieldMe();
		jTextFieldcostoProductoOrdenDetaProduGasto.setEnabled(false);
		jTextFieldcostoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoProductoOrdenDetaProduGasto.setText("0.0");

		this.jButtoncostoProductoOrdenDetaProduGastoBusqueda= new JButtonMe();
		this.jButtoncostoProductoOrdenDetaProduGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoProductoOrdenDetaProduGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoProductoOrdenDetaProduGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoProductoOrdenDetaProduGastoBusqueda.setText("U");
		this.jButtoncostoProductoOrdenDetaProduGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoProductoOrdenDetaProduGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoProductoOrdenDetaProduGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoProductoOrdenDetaProduGastoBusqueda"));

		if(this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoProductoOrdenDetaProduGastoBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalProductoOrdenDetaProduGasto = new JLabelMe();
		this.jLabelcosto_totalProductoOrdenDetaProduGasto.setText(""+ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalProductoOrdenDetaProduGasto.setToolTipText("Costo Total");
		this.jLabelcosto_totalProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalProductoOrdenDetaProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalProductoOrdenDetaProduGasto.setToolTipText(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutProductoOrdenDetaProduGasto = new GridBagLayout();
		this.jPanelcosto_totalProductoOrdenDetaProduGasto.setLayout(this.gridaBagLayoutProductoOrdenDetaProduGasto);


		jTextFieldcosto_totalProductoOrdenDetaProduGasto= new JTextFieldMe();
		jTextFieldcosto_totalProductoOrdenDetaProduGasto.setEnabled(false);
		jTextFieldcosto_totalProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalProductoOrdenDetaProduGasto.setText("0.0");

		this.jButtoncosto_totalProductoOrdenDetaProduGastoBusqueda= new JButtonMe();
		this.jButtoncosto_totalProductoOrdenDetaProduGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProductoOrdenDetaProduGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProductoOrdenDetaProduGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalProductoOrdenDetaProduGastoBusqueda.setText("U");
		this.jButtoncosto_totalProductoOrdenDetaProduGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalProductoOrdenDetaProduGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalProductoOrdenDetaProduGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalProductoOrdenDetaProduGastoBusqueda"));

		if(this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalProductoOrdenDetaProduGastoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionProductoOrdenDetaProduGasto = new JLabelMe();
		this.jLabeldescripcionProductoOrdenDetaProduGasto.setText(""+ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionProductoOrdenDetaProduGasto.setToolTipText("Descripcion");
		this.jLabeldescripcionProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionProductoOrdenDetaProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionProductoOrdenDetaProduGasto.setToolTipText(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutProductoOrdenDetaProduGasto = new GridBagLayout();
		this.jPaneldescripcionProductoOrdenDetaProduGasto.setLayout(this.gridaBagLayoutProductoOrdenDetaProduGasto);


		jTextAreadescripcionProductoOrdenDetaProduGasto= new JTextAreaMe();
		jTextAreadescripcionProductoOrdenDetaProduGasto.setEnabled(false);
		jTextAreadescripcionProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoOrdenDetaProduGasto.setLineWrap(true);
		jTextAreadescripcionProductoOrdenDetaProduGasto.setWrapStyleWord(true);
		jTextAreadescripcionProductoOrdenDetaProduGasto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionProductoOrdenDetaProduGasto.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionProductoOrdenDetaProduGasto = new JScrollPane(jTextAreadescripcionProductoOrdenDetaProduGasto);
		jscrollPanedescripcionProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionProductoOrdenDetaProduGastoBusqueda= new JButtonMe();
		this.jButtondescripcionProductoOrdenDetaProduGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoOrdenDetaProduGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoOrdenDetaProduGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionProductoOrdenDetaProduGastoBusqueda.setText("U");
		this.jButtondescripcionProductoOrdenDetaProduGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionProductoOrdenDetaProduGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionProductoOrdenDetaProduGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionProductoOrdenDetaProduGastoBusqueda"));

		if(this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionProductoOrdenDetaProduGastoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductoOrdenDetaProduGasto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_orden_deta_produProductoOrdenDetaProduGasto = new JLabelMe();
		this.jLabelid_orden_deta_produProductoOrdenDetaProduGasto.setText(""+ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDORDENDETAPRODU+" : *");
		this.jLabelid_orden_deta_produProductoOrdenDetaProduGasto.setToolTipText("Orden Deta Produ");
		this.jLabelid_orden_deta_produProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_orden_deta_produProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_orden_deta_produProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_orden_deta_produProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_orden_deta_produProductoOrdenDetaProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_orden_deta_produProductoOrdenDetaProduGasto.setToolTipText(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDORDENDETAPRODU);
		this.gridaBagLayoutProductoOrdenDetaProduGasto = new GridBagLayout();
		this.jPanelid_orden_deta_produProductoOrdenDetaProduGasto.setLayout(this.gridaBagLayoutProductoOrdenDetaProduGasto);


		jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto= new JComboBoxMe();
		jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_orden_deta_produProductoOrdenDetaProduGasto= new JButtonMe();
		this.jButtonid_orden_deta_produProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduGasto.setText("Buscar");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduGasto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduGasto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_deta_produProductoOrdenDetaProduGasto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_deta_produProductoOrdenDetaProduGasto"));

		this.jButtonid_orden_deta_produProductoOrdenDetaProduGastoBusqueda= new JButtonMe();
		this.jButtonid_orden_deta_produProductoOrdenDetaProduGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_orden_deta_produProductoOrdenDetaProduGastoBusqueda.setText("U");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_deta_produProductoOrdenDetaProduGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_deta_produProductoOrdenDetaProduGastoBusqueda"));

		if(this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_orden_deta_produProductoOrdenDetaProduGastoBusqueda.setVisible(false);		}

		this.jButtonid_orden_deta_produProductoOrdenDetaProduGastoUpdate= new JButtonMe();
		this.jButtonid_orden_deta_produProductoOrdenDetaProduGastoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduGastoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduGastoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_orden_deta_produProductoOrdenDetaProduGastoUpdate.setText("U");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduGastoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduGastoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_deta_produProductoOrdenDetaProduGastoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_deta_produProductoOrdenDetaProduGastoUpdate"));



					
		this.jLabelid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto = new JLabelMe();
		this.jLabelid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setText(""+ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA+" : *");
		this.jLabelid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setToolTipText("Tipo Gasto Produ Empresa");
		this.jLabelid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setToolTipText(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA);
		this.gridaBagLayoutProductoOrdenDetaProduGasto = new GridBagLayout();
		this.jPanelid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setLayout(this.gridaBagLayoutProductoOrdenDetaProduGasto);


		jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto= new JComboBoxMe();
		jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto= new JButtonMe();
		this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setText("Buscar");
		this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto"));

		this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoBusqueda= new JButtonMe();
		this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoBusqueda.setText("U");
		this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoBusqueda"));

		if(this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoUpdate= new JButtonMe();
		this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoUpdate.setText("U");
		this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoUpdate"));



					
		this.jLabelid_cuenta_contable_debitoProductoOrdenDetaProduGasto = new JLabelMe();
		this.jLabelid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setText(""+ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO+" : *");
		this.jLabelid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setToolTipText("Cuenta Contable Debito");
		this.jLabelid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_debitoProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_debitoProductoOrdenDetaProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setToolTipText(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
		this.gridaBagLayoutProductoOrdenDetaProduGasto = new GridBagLayout();
		this.jPanelid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setLayout(this.gridaBagLayoutProductoOrdenDetaProduGasto);


		jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGasto= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setText("Buscar");
		this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGasto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGasto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoProductoOrdenDetaProduGasto"));

		this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoProductoOrdenDetaProduGastoBusqueda"));

		if(this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoUpdate.setText("U");
		this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoProductoOrdenDetaProduGastoUpdate"));


		jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoArbol= new JButtonMe();
		jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoArbol.setText("Arbol");
		jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoProductoOrdenDetaProduGastoArbol"));



					
		this.jLabelid_cuenta_contable_creditoProductoOrdenDetaProduGasto = new JLabelMe();
		this.jLabelid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setText(""+ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO+" : *");
		this.jLabelid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setToolTipText("Cuenta Contable Credito");
		this.jLabelid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_creditoProductoOrdenDetaProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setToolTipText(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		this.gridaBagLayoutProductoOrdenDetaProduGasto = new GridBagLayout();
		this.jPanelid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setLayout(this.gridaBagLayoutProductoOrdenDetaProduGasto);


		jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGasto= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setText("Buscar");
		this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGasto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGasto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoProductoOrdenDetaProduGasto"));

		this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoProductoOrdenDetaProduGastoBusqueda"));

		if(this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoUpdate.setText("U");
		this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoProductoOrdenDetaProduGastoUpdate"));


		jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoArbol= new JButtonMe();
		jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoArbol.setText("Arbol");
		jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoProductoOrdenDetaProduGastoArbol"));



					
		this.jLabelid_cliente_proveedorProductoOrdenDetaProduGasto = new JLabelMe();
		this.jLabelid_cliente_proveedorProductoOrdenDetaProduGasto.setText(""+ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR+" : *");
		this.jLabelid_cliente_proveedorProductoOrdenDetaProduGasto.setToolTipText("Cliente Proveedor");
		this.jLabelid_cliente_proveedorProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cliente_proveedorProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cliente_proveedorProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cliente_proveedorProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cliente_proveedorProductoOrdenDetaProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cliente_proveedorProductoOrdenDetaProduGasto.setToolTipText(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR);
		this.gridaBagLayoutProductoOrdenDetaProduGasto = new GridBagLayout();
		this.jPanelid_cliente_proveedorProductoOrdenDetaProduGasto.setLayout(this.gridaBagLayoutProductoOrdenDetaProduGasto);


		jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto= new JComboBoxMe();
		jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cliente_proveedorProductoOrdenDetaProduGasto= new JButtonMe();
		this.jButtonid_cliente_proveedorProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_proveedorProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_proveedorProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_proveedorProductoOrdenDetaProduGasto.setText("Buscar");
		this.jButtonid_cliente_proveedorProductoOrdenDetaProduGasto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cliente_proveedorProductoOrdenDetaProduGasto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_proveedorProductoOrdenDetaProduGasto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_proveedorProductoOrdenDetaProduGasto"));

		this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoBusqueda= new JButtonMe();
		this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoBusqueda.setText("U");
		this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_proveedorProductoOrdenDetaProduGastoBusqueda"));

		if(this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoBusqueda.setVisible(false);		}

		this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoUpdate= new JButtonMe();
		this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoUpdate.setText("U");
		this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_proveedorProductoOrdenDetaProduGastoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_proveedorProductoOrdenDetaProduGastoUpdate"));



					
		this.jLabelid_facturaProductoOrdenDetaProduGasto = new JLabelMe();
		this.jLabelid_facturaProductoOrdenDetaProduGasto.setText(""+ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaProductoOrdenDetaProduGasto.setToolTipText("Factura");
		this.jLabelid_facturaProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaProductoOrdenDetaProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaProductoOrdenDetaProduGasto.setToolTipText(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutProductoOrdenDetaProduGasto = new GridBagLayout();
		this.jPanelid_facturaProductoOrdenDetaProduGasto.setLayout(this.gridaBagLayoutProductoOrdenDetaProduGasto);


		jComboBoxid_facturaProductoOrdenDetaProduGasto= new JComboBoxMe();
		jComboBoxid_facturaProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaProductoOrdenDetaProduGasto= new JButtonMe();
		this.jButtonid_facturaProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaProductoOrdenDetaProduGasto.setText("Buscar");
		this.jButtonid_facturaProductoOrdenDetaProduGasto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaProductoOrdenDetaProduGasto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaProductoOrdenDetaProduGasto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaProductoOrdenDetaProduGasto"));

		this.jButtonid_facturaProductoOrdenDetaProduGastoBusqueda= new JButtonMe();
		this.jButtonid_facturaProductoOrdenDetaProduGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaProductoOrdenDetaProduGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaProductoOrdenDetaProduGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaProductoOrdenDetaProduGastoBusqueda.setText("U");
		this.jButtonid_facturaProductoOrdenDetaProduGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaProductoOrdenDetaProduGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaProductoOrdenDetaProduGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaProductoOrdenDetaProduGastoBusqueda"));

		if(this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaProductoOrdenDetaProduGastoBusqueda.setVisible(false);		}

		this.jButtonid_facturaProductoOrdenDetaProduGastoUpdate= new JButtonMe();
		this.jButtonid_facturaProductoOrdenDetaProduGastoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaProductoOrdenDetaProduGastoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaProductoOrdenDetaProduGastoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaProductoOrdenDetaProduGastoUpdate.setText("U");
		this.jButtonid_facturaProductoOrdenDetaProduGastoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaProductoOrdenDetaProduGastoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaProductoOrdenDetaProduGastoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaProductoOrdenDetaProduGastoUpdate"));



					
		this.jLabelid_unidadProductoOrdenDetaProduGasto = new JLabelMe();
		this.jLabelid_unidadProductoOrdenDetaProduGasto.setText(""+ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadProductoOrdenDetaProduGasto.setToolTipText("Unad");
		this.jLabelid_unidadProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadProductoOrdenDetaProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadProductoOrdenDetaProduGasto.setToolTipText(ProductoOrdenDetaProduGastoConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutProductoOrdenDetaProduGasto = new GridBagLayout();
		this.jPanelid_unidadProductoOrdenDetaProduGasto.setLayout(this.gridaBagLayoutProductoOrdenDetaProduGasto);


		jComboBoxid_unidadProductoOrdenDetaProduGasto= new JComboBoxMe();
		jComboBoxid_unidadProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadProductoOrdenDetaProduGasto= new JButtonMe();
		this.jButtonid_unidadProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoOrdenDetaProduGasto.setText("Buscar");
		this.jButtonid_unidadProductoOrdenDetaProduGasto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadProductoOrdenDetaProduGasto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoOrdenDetaProduGasto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoOrdenDetaProduGasto"));

		this.jButtonid_unidadProductoOrdenDetaProduGastoBusqueda= new JButtonMe();
		this.jButtonid_unidadProductoOrdenDetaProduGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoOrdenDetaProduGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoOrdenDetaProduGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoOrdenDetaProduGastoBusqueda.setText("U");
		this.jButtonid_unidadProductoOrdenDetaProduGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadProductoOrdenDetaProduGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoOrdenDetaProduGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoOrdenDetaProduGastoBusqueda"));

		if(this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadProductoOrdenDetaProduGastoBusqueda.setVisible(false);		}

		this.jButtonid_unidadProductoOrdenDetaProduGastoUpdate= new JButtonMe();
		this.jButtonid_unidadProductoOrdenDetaProduGastoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoOrdenDetaProduGastoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoOrdenDetaProduGastoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoOrdenDetaProduGastoUpdate.setText("U");
		this.jButtonid_unidadProductoOrdenDetaProduGastoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadProductoOrdenDetaProduGastoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoOrdenDetaProduGastoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadProductoOrdenDetaProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoOrdenDetaProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoOrdenDetaProduGastoUpdate"));



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
		//this.jInternalFrameDetalleProductoOrdenDetaProduGasto = new ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Orden  Gasto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoOrdenDetaProduGasto= new GridBagLayout();
		

		
		String sToolTipProductoOrdenDetaProduGasto="";
		sToolTipProductoOrdenDetaProduGasto=ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoOrdenDetaProduGasto+="(Produccion.ProductoOrdenDetaProduGasto)";
		}
		
		if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoOrdenDetaProduGasto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductoOrdenDetaProduGasto = new JButtonMe();
		this.jButtonModificarProductoOrdenDetaProduGasto = new JButtonMe();
        this.jButtonActualizarProductoOrdenDetaProduGasto = new JButtonMe();
        this.jButtonEliminarProductoOrdenDetaProduGasto = new JButtonMe();
        this.jButtonCancelarProductoOrdenDetaProduGasto = new JButtonMe();
        this.jButtonGuardarCambiosProductoOrdenDetaProduGasto = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduGasto = new JButtonMe();
		this.jButtonCerrarProductoOrdenDetaProduGasto = new JButtonMe();
		
		this.jScrollPanelDatosProductoOrdenDetaProduGasto = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto = new JScrollPane();
		this.jScrollPanelDatosGeneralProductoOrdenDetaProduGasto = new JScrollPane();
				
		
		
		this.jPanelCamposProductoOrdenDetaProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductoOrdenDetaProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductoOrdenDetaProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductoOrdenDetaProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Orden  Gasto";
		
		if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden  Gastoes" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoOrdenDetaProduGasto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductoOrdenDetaProduGasto.setName("jPanelCamposProductoOrdenDetaProduGasto"); 

		this.jPanelCamposOcultosProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductoOrdenDetaProduGasto.setName("jPanelCamposOcultosProductoOrdenDetaProduGasto"); 

        this.jPanelAccionesProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoOrdenDetaProduGasto.setToolTipText("Acciones");
        this.jPanelAccionesProductoOrdenDetaProduGasto.setName("Acciones"); 

		this.jPanelAccionesFormularioProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductoOrdenDetaProduGasto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductoOrdenDetaProduGasto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductoOrdenDetaProduGasto.setText("Nuevo");
		this.jButtonModificarProductoOrdenDetaProduGasto.setText("Editar");
        this.jButtonActualizarProductoOrdenDetaProduGasto.setText("Actualizar");
        this.jButtonEliminarProductoOrdenDetaProduGasto.setText("Eliminar");
        this.jButtonCancelarProductoOrdenDetaProduGasto.setText("Cancelar");
        this.jButtonGuardarCambiosProductoOrdenDetaProduGasto.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduGasto.setText("Guardar");
		this.jButtonCerrarProductoOrdenDetaProduGasto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoOrdenDetaProduGasto,"nuevo_button","Nuevo",this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductoOrdenDetaProduGasto,"modificar_button","Editar",this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductoOrdenDetaProduGasto,"actualizar_button","Actualizar",this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductoOrdenDetaProduGasto,"eliminar_button","Eliminar",this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductoOrdenDetaProduGasto,"cancelar_button","Cancelar",this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductoOrdenDetaProduGasto,"guardarcambios_button","Guardar",this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoOrdenDetaProduGasto,"guardarcambiostabla_button","Guardar",this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoOrdenDetaProduGasto,"cerrar_button","Salir",this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductoOrdenDetaProduGasto.setToolTipText("Nuevo"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductoOrdenDetaProduGasto.setToolTipText("Editar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductoOrdenDetaProduGasto.setToolTipText("Actualizar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductoOrdenDetaProduGasto.setToolTipText("Eliminar)"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductoOrdenDetaProduGasto.setToolTipText("Cancelar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductoOrdenDetaProduGasto.setToolTipText("Guardar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduGasto.setToolTipText("Guardar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoOrdenDetaProduGasto.setToolTipText("Salir"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoOrdenDetaProduGasto";
		inputMap = this.jButtonNuevoProductoOrdenDetaProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoOrdenDetaProduGasto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoOrdenDetaProduGasto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductoOrdenDetaProduGasto";
		inputMap = this.jButtonActualizarProductoOrdenDetaProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductoOrdenDetaProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductoOrdenDetaProduGasto"));
		
		//ELIMINAR
		sMapKey = "EliminarProductoOrdenDetaProduGasto";
		inputMap = this.jButtonEliminarProductoOrdenDetaProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductoOrdenDetaProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductoOrdenDetaProduGasto"));
		
		//CANCELAR	
		sMapKey = "CancelarProductoOrdenDetaProduGasto";
		inputMap = this.jButtonCancelarProductoOrdenDetaProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductoOrdenDetaProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductoOrdenDetaProduGasto"));
		
		//CERRAR		
		sMapKey = "CerrarProductoOrdenDetaProduGasto";
		inputMap = this.jButtonCerrarProductoOrdenDetaProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoOrdenDetaProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoOrdenDetaProduGasto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoOrdenDetaProduGasto";
		inputMap = this.jButtonGuardarCambiosTablaProductoOrdenDetaProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoOrdenDetaProduGasto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductoOrdenDetaProduGasto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductoOrdenDetaProduGasto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductoOrdenDetaProduGasto.setToolTipText("Nuevo ProductoOrdenDetaProduGasto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduGasto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduGasto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduGasto.setToolTipText("Sin Cerrar Ventana ProductoOrdenDetaProduGasto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduGasto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduGasto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduGasto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.setText("Accion");
		this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductoOrdenDetaProduGasto = new JLabelMe();
		
		this.jLabelAccionesProductoOrdenDetaProduGasto.setText("Acciones");		
		this.jLabelAccionesProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductoOrdenDetaProduGasto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductoOrdenDetaProduGasto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductoOrdenDetaProduGasto=new JTabbedPane();
		this.jTabbedPaneRelacionesProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductoOrdenDetaProduGasto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductoOrdenDetaProduGasto = new GridBagLayout();
		
		this.jPanelCamposProductoOrdenDetaProduGasto.setLayout(gridaBagLayoutCamposProductoOrdenDetaProduGasto);
		this.jPanelCamposOcultosProductoOrdenDetaProduGasto.setLayout(gridaBagLayoutCamposOcultosProductoOrdenDetaProduGasto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductoOrdenDetaProduGasto.add(jLabelIdProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductoOrdenDetaProduGasto.add(jLabelidProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);


	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_orden_deta_produProductoOrdenDetaProduGasto.add(jLabelid_orden_deta_produProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_orden_deta_produProductoOrdenDetaProduGasto.add(jButtonid_orden_deta_produProductoOrdenDetaProduGastoBusqueda, this.gridBagConstraintsProductoOrdenDetaProduGasto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 3;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_orden_deta_produProductoOrdenDetaProduGasto.add(jButtonid_orden_deta_produProductoOrdenDetaProduGastoUpdate, this.gridBagConstraintsProductoOrdenDetaProduGasto);
	}

	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_orden_deta_produProductoOrdenDetaProduGasto.add(jComboBoxid_orden_deta_produProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);


	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.add(jLabelid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.add(jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoBusqueda, this.gridBagConstraintsProductoOrdenDetaProduGasto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 3;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.add(jButtonid_tipo_gasto_produ_empresaProductoOrdenDetaProduGastoUpdate, this.gridBagConstraintsProductoOrdenDetaProduGasto);
	}

	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto.add(jComboBoxid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);


	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_debitoProductoOrdenDetaProduGasto.add(jLabelid_cuenta_contable_debitoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_debitoProductoOrdenDetaProduGasto.add(jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoBusqueda, this.gridBagConstraintsProductoOrdenDetaProduGasto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 3;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_debitoProductoOrdenDetaProduGasto.add(jButtonid_cuenta_contable_debitoProductoOrdenDetaProduGastoUpdate, this.gridBagConstraintsProductoOrdenDetaProduGasto);
	}

	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_debitoProductoOrdenDetaProduGasto.add(jComboBoxid_cuenta_contable_debitoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);


	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_creditoProductoOrdenDetaProduGasto.add(jLabelid_cuenta_contable_creditoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoProductoOrdenDetaProduGasto.add(jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoBusqueda, this.gridBagConstraintsProductoOrdenDetaProduGasto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 3;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoProductoOrdenDetaProduGasto.add(jButtonid_cuenta_contable_creditoProductoOrdenDetaProduGastoUpdate, this.gridBagConstraintsProductoOrdenDetaProduGasto);
	}

	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_creditoProductoOrdenDetaProduGasto.add(jComboBoxid_cuenta_contable_creditoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);


	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cliente_proveedorProductoOrdenDetaProduGasto.add(jLabelid_cliente_proveedorProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 2;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cliente_proveedorProductoOrdenDetaProduGasto.add(jButtonid_cliente_proveedorProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 3;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cliente_proveedorProductoOrdenDetaProduGasto.add(jButtonid_cliente_proveedorProductoOrdenDetaProduGastoBusqueda, this.gridBagConstraintsProductoOrdenDetaProduGasto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 4;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cliente_proveedorProductoOrdenDetaProduGasto.add(jButtonid_cliente_proveedorProductoOrdenDetaProduGastoUpdate, this.gridBagConstraintsProductoOrdenDetaProduGasto);
	}

	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cliente_proveedorProductoOrdenDetaProduGasto.add(jComboBoxid_cliente_proveedorProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);


	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_facturaProductoOrdenDetaProduGasto.add(jLabelid_facturaProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 2;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaProductoOrdenDetaProduGasto.add(jButtonid_facturaProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 3;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaProductoOrdenDetaProduGasto.add(jButtonid_facturaProductoOrdenDetaProduGastoBusqueda, this.gridBagConstraintsProductoOrdenDetaProduGasto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 4;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaProductoOrdenDetaProduGasto.add(jButtonid_facturaProductoOrdenDetaProduGastoUpdate, this.gridBagConstraintsProductoOrdenDetaProduGasto);
	}

	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_facturaProductoOrdenDetaProduGasto.add(jComboBoxid_facturaProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);


	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadProductoOrdenDetaProduGasto.add(jLabelid_unidadProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoOrdenDetaProduGasto.add(jButtonid_unidadProductoOrdenDetaProduGastoBusqueda, this.gridBagConstraintsProductoOrdenDetaProduGasto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 3;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoOrdenDetaProduGasto.add(jButtonid_unidadProductoOrdenDetaProduGastoUpdate, this.gridBagConstraintsProductoOrdenDetaProduGasto);
	}

	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadProductoOrdenDetaProduGasto.add(jComboBoxid_unidadProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);


	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadProductoOrdenDetaProduGasto.add(jLabelcantidadProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadProductoOrdenDetaProduGasto.add(jButtoncantidadProductoOrdenDetaProduGastoBusqueda, this.gridBagConstraintsProductoOrdenDetaProduGasto);
	}

	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadProductoOrdenDetaProduGasto.add(jTextFieldcantidadProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);


	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoProductoOrdenDetaProduGasto.add(jLabelcostoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoProductoOrdenDetaProduGasto.add(jButtoncostoProductoOrdenDetaProduGastoBusqueda, this.gridBagConstraintsProductoOrdenDetaProduGasto);
	}

	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoProductoOrdenDetaProduGasto.add(jTextFieldcostoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);


	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalProductoOrdenDetaProduGasto.add(jLabelcosto_totalProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalProductoOrdenDetaProduGasto.add(jButtoncosto_totalProductoOrdenDetaProduGastoBusqueda, this.gridBagConstraintsProductoOrdenDetaProduGasto);
	}

	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalProductoOrdenDetaProduGasto.add(jTextFieldcosto_totalProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);


	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionProductoOrdenDetaProduGasto.add(jLabeldescripcionProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionProductoOrdenDetaProduGasto.add(jButtondescripcionProductoOrdenDetaProduGastoBusqueda, this.gridBagConstraintsProductoOrdenDetaProduGasto);
	}

	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionProductoOrdenDetaProduGasto.add(jscrollPanedescripcionProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iYPanelCamposProductoOrdenDetaProduGasto;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iXPanelCamposProductoOrdenDetaProduGasto++;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduGasto.add(this.jPanelidProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	if(iXPanelCamposProductoOrdenDetaProduGasto % 1==0) {
		iXPanelCamposProductoOrdenDetaProduGasto=0;
		iYPanelCamposProductoOrdenDetaProduGasto++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iYPanelCamposProductoOrdenDetaProduGasto;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iXPanelCamposProductoOrdenDetaProduGasto++;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduGasto.add(this.jPanelid_orden_deta_produProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	if(iXPanelCamposProductoOrdenDetaProduGasto % 1==0) {
		iXPanelCamposProductoOrdenDetaProduGasto=0;
		iYPanelCamposProductoOrdenDetaProduGasto++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iYPanelCamposProductoOrdenDetaProduGasto;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iXPanelCamposProductoOrdenDetaProduGasto++;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduGasto.add(this.jPanelid_tipo_gasto_produ_empresaProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	if(iXPanelCamposProductoOrdenDetaProduGasto % 1==0) {
		iXPanelCamposProductoOrdenDetaProduGasto=0;
		iYPanelCamposProductoOrdenDetaProduGasto++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iYPanelCamposProductoOrdenDetaProduGasto;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iXPanelCamposProductoOrdenDetaProduGasto++;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduGasto.add(this.jPanelid_cuenta_contable_debitoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	if(iXPanelCamposProductoOrdenDetaProduGasto % 1==0) {
		iXPanelCamposProductoOrdenDetaProduGasto=0;
		iYPanelCamposProductoOrdenDetaProduGasto++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iYPanelCamposProductoOrdenDetaProduGasto;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iXPanelCamposProductoOrdenDetaProduGasto++;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduGasto.add(this.jPanelid_cuenta_contable_creditoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	if(iXPanelCamposProductoOrdenDetaProduGasto % 1==0) {
		iXPanelCamposProductoOrdenDetaProduGasto=0;
		iYPanelCamposProductoOrdenDetaProduGasto++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iYPanelCamposProductoOrdenDetaProduGasto;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iXPanelCamposProductoOrdenDetaProduGasto++;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduGasto.add(this.jPanelid_cliente_proveedorProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	if(iXPanelCamposProductoOrdenDetaProduGasto % 1==0) {
		iXPanelCamposProductoOrdenDetaProduGasto=0;
		iYPanelCamposProductoOrdenDetaProduGasto++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iYPanelCamposProductoOrdenDetaProduGasto;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iXPanelCamposProductoOrdenDetaProduGasto++;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduGasto.add(this.jPanelid_facturaProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	if(iXPanelCamposProductoOrdenDetaProduGasto % 1==0) {
		iXPanelCamposProductoOrdenDetaProduGasto=0;
		iYPanelCamposProductoOrdenDetaProduGasto++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iYPanelCamposProductoOrdenDetaProduGasto;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iXPanelCamposProductoOrdenDetaProduGasto++;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduGasto.add(this.jPanelid_unidadProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	if(iXPanelCamposProductoOrdenDetaProduGasto % 1==0) {
		iXPanelCamposProductoOrdenDetaProduGasto=0;
		iYPanelCamposProductoOrdenDetaProduGasto++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iYPanelCamposProductoOrdenDetaProduGasto;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iXPanelCamposProductoOrdenDetaProduGasto++;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduGasto.add(this.jPanelcantidadProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	if(iXPanelCamposProductoOrdenDetaProduGasto % 1==0) {
		iXPanelCamposProductoOrdenDetaProduGasto=0;
		iYPanelCamposProductoOrdenDetaProduGasto++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iYPanelCamposProductoOrdenDetaProduGasto;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iXPanelCamposProductoOrdenDetaProduGasto++;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduGasto.add(this.jPanelcostoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	if(iXPanelCamposProductoOrdenDetaProduGasto % 1==0) {
		iXPanelCamposProductoOrdenDetaProduGasto=0;
		iYPanelCamposProductoOrdenDetaProduGasto++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iYPanelCamposProductoOrdenDetaProduGasto;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iXPanelCamposProductoOrdenDetaProduGasto++;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduGasto.add(this.jPanelcosto_totalProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	if(iXPanelCamposProductoOrdenDetaProduGasto % 1==0) {
		iXPanelCamposProductoOrdenDetaProduGasto=0;
		iYPanelCamposProductoOrdenDetaProduGasto++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iYPanelCamposProductoOrdenDetaProduGasto;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iXPanelCamposProductoOrdenDetaProduGasto++;
	this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduGasto.add(this.jPaneldescripcionProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);



	if(iXPanelCamposProductoOrdenDetaProduGasto % 1==0) {
		iXPanelCamposProductoOrdenDetaProduGasto=0;
		iYPanelCamposProductoOrdenDetaProduGasto++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductoOrdenDetaProduGasto= new GridBagLayout();
		this.jPanelAccionesProductoOrdenDetaProduGasto.setLayout(gridaBagLayoutAccionesProductoOrdenDetaProduGasto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductoOrdenDetaProduGasto= new GridBagLayout();
		this.jPanelAccionesFormularioProductoOrdenDetaProduGasto.setLayout(gridaBagLayoutAccionesFormularioProductoOrdenDetaProduGasto);
		
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoOrdenDetaProduGasto.add(this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoOrdenDetaProduGasto.add(this.jCheckBoxPostAccionNuevoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.productoordendetaprodugastoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoOrdenDetaProduGasto.add(this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.productoordendetaprodugastoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoOrdenDetaProduGasto.add(this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductoOrdenDetaProduGasto.add(this.jButtonModificarProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);							

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductoOrdenDetaProduGasto.add(this.jButtonEliminarProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		
			
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoOrdenDetaProduGasto.add(this.jButtonActualizarProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);


		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoOrdenDetaProduGasto.add(this.jButtonGuardarCambiosProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);	
		
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductoOrdenDetaProduGasto.add(this.jButtonCancelarProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoOrdenDetaProduGasto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoOrdenDetaProduGasto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();						
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;		
			//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx =0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductoOrdenDetaProduGastoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductoOrdenDetaProduGasto = new ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Orden  Gasto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Orden  Gasto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Orden  Gasto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductoOrdenDetaProduGastoModel productoordendetaprodugastoModel=new ProductoOrdenDetaProduGastoModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductoOrdenDetaProduGastoModel.ProductoOrdenDetaProduGastoFocusTraversalPolicy productoordendetaprodugastoFocusTraversalPolicy = productoordendetaprodugastoModel.new ProductoOrdenDetaProduGastoFocusTraversalPolicy(this);
			
			//productoordendetaprodugastoFocusTraversalPolicy.setproductoordendetaprodugastoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productoordendetaprodugastoModel);
			
			
			this.jContentPaneDetalleProductoOrdenDetaProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductoOrdenDetaProduGasto = new GridBagLayout();	
			this.jContentPaneDetalleProductoOrdenDetaProduGasto.setLayout(gridaBagLayoutDetalleProductoOrdenDetaProduGasto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoOrdenDetaProduGasto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
				this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
					
				
				this.jContentPaneDetalleProductoOrdenDetaProduGasto.add(jTtoolBarDetalleProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);								
				
}
			
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto=   new JScrollPane(jContentPaneDetalleProductoOrdenDetaProduGasto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduGasto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
	        
			this.jContentPaneDetalleProductoOrdenDetaProduGasto.add(jPanelCamposProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);
			
			
			
			
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
						&& productoordendetaprodugastoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productoordendetaprodugastoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductoOrdenDetaProduGasto= new GridBagConstraints();
						this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
						this.jContentPaneDetalleProductoOrdenDetaProduGasto.add(this.jTabbedPaneRelacionesProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductoOrdenDetaProduGasto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductoOrdenDetaProduGasto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
					this.gridBagConstraintsProductoOrdenDetaProduGasto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
					
				
					this.jContentPaneDetalleProductoOrdenDetaProduGasto.add(jPanelCamposOcultosProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);
				
					this.jPanelCamposOcultosProductoOrdenDetaProduGasto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
	        this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductoOrdenDetaProduGasto.add(this.jPanelAccionesFormularioProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);							
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
	        this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
	        
			
			this.jContentPaneDetalleProductoOrdenDetaProduGasto.add(this.jPanelAccionesProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductoOrdenDetaProduGasto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto=   new JScrollPane(this.jPanelCamposProductoOrdenDetaProduGasto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);			
			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
			
			
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		
			
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductoOrdenDetaProduGasto;//jContentPane;
		
		return jScrollPanelDatosEdicionProductoOrdenDetaProduGasto;
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
