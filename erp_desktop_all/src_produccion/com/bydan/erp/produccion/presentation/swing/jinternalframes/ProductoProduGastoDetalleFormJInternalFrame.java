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
import com.bydan.erp.produccion.util.ProductoProduGastoConstantesFunciones;

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
public class ProductoProduGastoDetalleFormJInternalFrame extends ProductoProduGastoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductoProduGasto;
	
	protected JMenuBar jmenuBarDetalleProductoProduGasto;
	
	protected JMenu jmenuDetalleProductoProduGasto;
	protected JMenu jmenuDetalleArchivoProductoProduGasto;
	protected JMenu jmenuDetalleAccionesProductoProduGasto;
	protected JMenu jmenuDetalleDatosProductoProduGasto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductoProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoProduGasto;	
	protected GridBagConstraints gridBagConstraintsProductoProduGasto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductoProduGastoBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductoProduGasto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ProductoDefiProduBeanSwingJInternalFrame productodefiproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_productodefiprodu="";

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
	
	public ProductoProduGastoSessionBean productoprodugastoSessionBean;
	
	
	
	
	public ProductoDefiProduSessionBean productodefiproduSessionBean;
	public TipoGastoProduEmpresaSessionBean tipogastoproduempresaSessionBean;
	public CuentaContableSessionBean cuentacontabledebitoSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;
	public ClienteSessionBean clienteproveedorSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public UnidadSessionBean unidadSessionBean;	
	
	public ProductoProduGastoLogic productoprodugastoLogic;
	
	public JScrollPane jScrollPanelDatosProductoProduGasto;
	public JScrollPane jScrollPanelDatosEdicionProductoProduGasto;
	public JScrollPane jScrollPanelDatosGeneralProductoProduGasto;
	
	protected JPanel jPanelCamposProductoProduGasto;    
	protected JPanel jPanelCamposOcultosProductoProduGasto;    	
	protected JPanel jPanelAccionesProductoProduGasto;
	protected JPanel jPanelAccionesFormularioProductoProduGasto;
    
	
	
	protected Integer iXPanelCamposProductoProduGasto=0;
	protected Integer iYPanelCamposProductoProduGasto=0;
	
	protected Integer iXPanelCamposOcultosProductoProduGasto=0;
	protected Integer iYPanelCamposOcultosProductoProduGasto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductoProduGasto;
	public JButton jButtonModificarProductoProduGasto;
	public JButton jButtonActualizarProductoProduGasto;
    public JButton jButtonEliminarProductoProduGasto;
	public JButton jButtonCancelarProductoProduGasto;
    public JButton jButtonGuardarCambiosProductoProduGasto;
	public JButton jButtonGuardarCambiosTablaProductoProduGasto;
	protected JButton jButtonCerrarProductoProduGasto;
	
	
	protected JButton jButtonProcesarInformacionProductoProduGasto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductoProduGasto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductoProduGasto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductoProduGasto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoProduGasto;
	protected JButton jButtonModificarToolBarProductoProduGasto;
	protected JButton jButtonActualizarToolBarProductoProduGasto;
    protected JButton jButtonEliminarToolBarProductoProduGasto;
	protected JButton jButtonCancelarToolBarProductoProduGasto;
    protected JButton jButtonGuardarCambiosToolBarProductoProduGasto;
	protected JButton jButtonGuardarCambiosTablaToolBarProductoProduGasto;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoProduGasto;
	protected JButton jButtonCerrarToolBarProductoProduGasto;
	
	protected JButton jButtonProcesarInformacionToolBarProductoProduGasto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoProduGasto;
	protected JMenuItem jMenuItemModificarProductoProduGasto;
	protected JMenuItem jMenuItemActualizarProductoProduGasto;
    protected JMenuItem jMenuItemEliminarProductoProduGasto;
	protected JMenuItem jMenuItemCancelarProductoProduGasto;
    protected JMenuItem jMenuItemGuardarCambiosProductoProduGasto;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoProduGasto;
	protected JMenuItem jMenuItemCerrarProductoProduGasto;
	protected JMenuItem jMenuItemDetalleCerrarProductoProduGasto;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoProduGasto;
	
	protected JMenuItem jMenuItemProcesarInformacionProductoProduGasto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoProduGasto;
	protected JMenuItem jMenuItemMostrarOcultarProductoProduGasto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoProduGasto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoProduGasto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoProduGasto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductoProduGasto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductoProduGasto;
	public JLabel jLabelIdProductoProduGasto;
	public JLabel jLabelidProductoProduGasto;
	public JButton jButtonidProductoProduGastoBusqueda= new JButtonMe();

	public JPanel jPanelcanitdadProductoProduGasto;
	public JLabel jLabelcanitdadProductoProduGasto;
	public JTextField jTextFieldcanitdadProductoProduGasto;
	public JButton jButtoncanitdadProductoProduGastoBusqueda= new JButtonMe();

	public JPanel jPanelcostoProductoProduGasto;
	public JLabel jLabelcostoProductoProduGasto;
	public JTextField jTextFieldcostoProductoProduGasto;
	public JButton jButtoncostoProductoProduGastoBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalProductoProduGasto;
	public JLabel jLabelcosto_totalProductoProduGasto;
	public JTextField jTextFieldcosto_totalProductoProduGasto;
	public JButton jButtoncosto_totalProductoProduGastoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionProductoProduGasto;
	public JLabel jLabeldescripcionProductoProduGasto;
	public JTextArea jTextAreadescripcionProductoProduGasto;
	public JScrollPane jscrollPanedescripcionProductoProduGasto;
	public JButton jButtondescripcionProductoProduGastoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_producto_defi_produProductoProduGasto;
	public JLabel jLabelid_producto_defi_produProductoProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_producto_defi_produProductoProduGasto;
	public JButton jButtonid_producto_defi_produProductoProduGasto= new JButtonMe();
	public JButton jButtonid_producto_defi_produProductoProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_producto_defi_produProductoProduGastoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_gasto_produ_empresaProductoProduGasto;
	public JLabel jLabelid_tipo_gasto_produ_empresaProductoProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto;
	public JButton jButtonid_tipo_gasto_produ_empresaProductoProduGasto= new JButtonMe();
	public JButton jButtonid_tipo_gasto_produ_empresaProductoProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_gasto_produ_empresaProductoProduGastoBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_debitoProductoProduGasto;
	public JLabel jLabelid_cuenta_contable_debitoProductoProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_debitoProductoProduGasto;
	public JButton jButtonid_cuenta_contable_debitoProductoProduGasto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoProductoProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoProductoProduGastoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoProductoProduGastoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_creditoProductoProduGasto;
	public JLabel jLabelid_cuenta_contable_creditoProductoProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoProductoProduGasto;
	public JButton jButtonid_cuenta_contable_creditoProductoProduGasto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoProductoProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoProductoProduGastoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoProductoProduGastoArbol= new JButtonMe();

	public JPanel jPanelid_cliente_proveedorProductoProduGasto;
	public JLabel jLabelid_cliente_proveedorProductoProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cliente_proveedorProductoProduGasto;
	public JButton jButtonid_cliente_proveedorProductoProduGasto= new JButtonMe();
	public JButton jButtonid_cliente_proveedorProductoProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_cliente_proveedorProductoProduGastoBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaProductoProduGasto;
	public JLabel jLabelid_facturaProductoProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaProductoProduGasto;
	public JButton jButtonid_facturaProductoProduGasto= new JButtonMe();
	public JButton jButtonid_facturaProductoProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_facturaProductoProduGastoBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadProductoProduGasto;
	public JLabel jLabelid_unidadProductoProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadProductoProduGasto;
	public JButton jButtonid_unidadProductoProduGasto= new JButtonMe();
	public JButton jButtonid_unidadProductoProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_unidadProductoProduGastoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductoProduGasto;
	
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
	
	public ProductoProduGastoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductoProduGasto=new JPanel();
				this.jPanelAccionesFormularioProductoProduGasto=new JPanel();
				this.jmenuBarDetalleProductoProduGasto=new JMenuBar();
				this.jTtoolBarDetalleProductoProduGasto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduGastoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductoProduGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductoProduGastoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductoProduGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduGastoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProduGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduGastoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProduGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduGastoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoProduGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductoProduGasto() {
		return this.jButtonActualizarToolBarProductoProduGasto;
	}
	
	public JButton getjButtonEliminarToolBarProductoProduGasto() {
		return this.jButtonEliminarToolBarProductoProduGasto;
	}
	
	public JButton getjButtonCancelarToolBarProductoProduGasto() {
		return this.jButtonCancelarToolBarProductoProduGasto;
	}		
	
	public JButton getjButtonProcesarInformacionProductoProduGasto() {
		return this.jButtonProcesarInformacionProductoProduGasto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoProduGasto)	{
		this.jButtonProcesarInformacionProductoProduGasto = jButtonProcesarInformacionProductoProduGasto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoProduGasto() {
		return this.jComboBoxTiposAccionesProductoProduGasto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoProduGasto(
			JComboBox jComboBoxTiposRelacionesProductoProduGasto) {
		this.jComboBoxTiposRelacionesProductoProduGasto = jComboBoxTiposRelacionesProductoProduGasto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoProduGasto(
			JComboBox jComboBoxTiposAccionesProductoProduGasto) {
		this.jComboBoxTiposAccionesProductoProduGasto = jComboBoxTiposAccionesProductoProduGasto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductoProduGasto() {
		return this.jComboBoxTiposAccionesFormularioProductoProduGasto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductoProduGasto(
			JComboBox jComboBoxTiposAccionesFormularioProductoProduGasto) {
		this.jComboBoxTiposAccionesFormularioProductoProduGasto = jComboBoxTiposAccionesFormularioProductoProduGasto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productoprodugastoSessionBean=new ProductoProduGastoSessionBean();
		
		this.productoprodugastoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoprodugastoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoprodugastoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoProduGastoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoProduGastoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoProduGastoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto Gasto Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductoProduGastoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductoProduGasto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductoProduGasto=new JButtonMe();
				this.jButtonModificarToolBarProductoProduGasto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductoProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductoProduGasto,this.jTtoolBarDetalleProductoProduGasto,
							"actualizar","actualizar","Actualizar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductoProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductoProduGasto,this.jTtoolBarDetalleProductoProduGasto,
							"eliminar","eliminar","Eliminar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductoProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductoProduGasto,this.jTtoolBarDetalleProductoProduGasto,
							"cancelar","cancelar","Cancelar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductoProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductoProduGasto,this.jTtoolBarDetalleProductoProduGasto,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductoProduGasto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductoProduGasto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductoProduGasto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductoProduGasto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductoProduGasto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoProduGasto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoProduGasto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoProduGasto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductoProduGasto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductoProduGasto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductoProduGasto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductoProduGasto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductoProduGasto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductoProduGasto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductoProduGasto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductoProduGasto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductoProduGasto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductoProduGasto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductoProduGasto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductoProduGasto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductoProduGasto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoProduGasto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoProduGasto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoProduGasto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoProduGasto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoProduGasto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductoProduGasto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductoProduGasto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductoProduGasto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoProduGasto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoProduGasto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoProduGasto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoProduGasto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoProduGasto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoProduGasto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductoProduGasto.add(this.jMenuItemDetalleCerrarProductoProduGasto);
		
		this.jmenuDetalleAccionesProductoProduGasto.add(this.jMenuItemActualizarProductoProduGasto);
		this.jmenuDetalleAccionesProductoProduGasto.add(this.jMenuItemEliminarProductoProduGasto);
		this.jmenuDetalleAccionesProductoProduGasto.add(this.jMenuItemCancelarProductoProduGasto);		
		
		//this.jmenuDetalleDatosProductoProduGasto.add(this.jMenuItemDetalleAbrirOrderByProductoProduGasto);				
		this.jmenuDetalleDatosProductoProduGasto.add(this.jMenuItemDetalleMostarOcultarProductoProduGasto);				
				
		//this.jmenuDetalleAccionesProductoProduGasto.add(this.jMenuItemGuardarCambiosProductoProduGasto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductoProduGasto.add(this.jmenuDetalleArchivoProductoProduGasto);		
		this.jmenuBarDetalleProductoProduGasto.add(this.jmenuDetalleAccionesProductoProduGasto);		
		this.jmenuBarDetalleProductoProduGasto.add(this.jmenuDetalleDatosProductoProduGasto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductoProduGasto);				
	}
	
	
	public void inicializarElementosCamposProductoProduGasto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductoProduGasto = new JLabelMe();
		jLabelIdProductoProduGasto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductoProduGasto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductoProduGasto.setToolTipText(ProductoProduGastoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductoProduGasto= new GridBagLayout();

		this.jPanelidProductoProduGasto.setLayout(this.gridaBagLayoutProductoProduGasto);

		jLabelidProductoProduGasto = new JLabel();
		jLabelidProductoProduGasto.setText("Id");

		jLabelidProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcanitdadProductoProduGasto = new JLabelMe();
		this.jLabelcanitdadProductoProduGasto.setText(""+ProductoProduGastoConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcanitdadProductoProduGasto.setToolTipText("Cantidad");
		this.jLabelcanitdadProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcanitdadProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcanitdadProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcanitdadProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcanitdadProductoProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcanitdadProductoProduGasto.setToolTipText(ProductoProduGastoConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutProductoProduGasto = new GridBagLayout();
		this.jPanelcanitdadProductoProduGasto.setLayout(this.gridaBagLayoutProductoProduGasto);


		jTextFieldcanitdadProductoProduGasto= new JTextFieldMe();
		jTextFieldcanitdadProductoProduGasto.setEnabled(false);
		jTextFieldcanitdadProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcanitdadProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcanitdadProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcanitdadProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcanitdadProductoProduGasto.setText("0");

		this.jButtoncanitdadProductoProduGastoBusqueda= new JButtonMe();
		this.jButtoncanitdadProductoProduGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncanitdadProductoProduGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncanitdadProductoProduGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncanitdadProductoProduGastoBusqueda.setText("U");
		this.jButtoncanitdadProductoProduGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncanitdadProductoProduGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncanitdadProductoProduGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcanitdadProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcanitdadProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"canitdadProductoProduGastoBusqueda"));

		if(this.productoprodugastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncanitdadProductoProduGastoBusqueda.setVisible(false);		}


					
		this.jLabelcostoProductoProduGasto = new JLabelMe();
		this.jLabelcostoProductoProduGasto.setText(""+ProductoProduGastoConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoProductoProduGasto.setToolTipText("Costo");
		this.jLabelcostoProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoProductoProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoProductoProduGasto.setToolTipText(ProductoProduGastoConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutProductoProduGasto = new GridBagLayout();
		this.jPanelcostoProductoProduGasto.setLayout(this.gridaBagLayoutProductoProduGasto);


		jTextFieldcostoProductoProduGasto= new JTextFieldMe();
		jTextFieldcostoProductoProduGasto.setEnabled(false);
		jTextFieldcostoProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoProductoProduGasto.setText("0.0");

		this.jButtoncostoProductoProduGastoBusqueda= new JButtonMe();
		this.jButtoncostoProductoProduGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoProductoProduGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoProductoProduGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoProductoProduGastoBusqueda.setText("U");
		this.jButtoncostoProductoProduGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoProductoProduGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoProductoProduGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoProductoProduGastoBusqueda"));

		if(this.productoprodugastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoProductoProduGastoBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalProductoProduGasto = new JLabelMe();
		this.jLabelcosto_totalProductoProduGasto.setText(""+ProductoProduGastoConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalProductoProduGasto.setToolTipText("Costo Total");
		this.jLabelcosto_totalProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalProductoProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalProductoProduGasto.setToolTipText(ProductoProduGastoConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutProductoProduGasto = new GridBagLayout();
		this.jPanelcosto_totalProductoProduGasto.setLayout(this.gridaBagLayoutProductoProduGasto);


		jTextFieldcosto_totalProductoProduGasto= new JTextFieldMe();
		jTextFieldcosto_totalProductoProduGasto.setEnabled(false);
		jTextFieldcosto_totalProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalProductoProduGasto.setText("0.0");

		this.jButtoncosto_totalProductoProduGastoBusqueda= new JButtonMe();
		this.jButtoncosto_totalProductoProduGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProductoProduGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProductoProduGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalProductoProduGastoBusqueda.setText("U");
		this.jButtoncosto_totalProductoProduGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalProductoProduGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalProductoProduGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalProductoProduGastoBusqueda"));

		if(this.productoprodugastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalProductoProduGastoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionProductoProduGasto = new JLabelMe();
		this.jLabeldescripcionProductoProduGasto.setText(""+ProductoProduGastoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionProductoProduGasto.setToolTipText("Descripcion");
		this.jLabeldescripcionProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionProductoProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionProductoProduGasto.setToolTipText(ProductoProduGastoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutProductoProduGasto = new GridBagLayout();
		this.jPaneldescripcionProductoProduGasto.setLayout(this.gridaBagLayoutProductoProduGasto);


		jTextAreadescripcionProductoProduGasto= new JTextAreaMe();
		jTextAreadescripcionProductoProduGasto.setEnabled(false);
		jTextAreadescripcionProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoProduGasto.setLineWrap(true);
		jTextAreadescripcionProductoProduGasto.setWrapStyleWord(true);
		jTextAreadescripcionProductoProduGasto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionProductoProduGasto.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionProductoProduGasto = new JScrollPane(jTextAreadescripcionProductoProduGasto);
		jscrollPanedescripcionProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionProductoProduGastoBusqueda= new JButtonMe();
		this.jButtondescripcionProductoProduGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoProduGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoProduGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionProductoProduGastoBusqueda.setText("U");
		this.jButtondescripcionProductoProduGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionProductoProduGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionProductoProduGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionProductoProduGastoBusqueda"));

		if(this.productoprodugastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionProductoProduGastoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductoProduGasto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_producto_defi_produProductoProduGasto = new JLabelMe();
		this.jLabelid_producto_defi_produProductoProduGasto.setText(""+ProductoProduGastoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU+" : *");
		this.jLabelid_producto_defi_produProductoProduGasto.setToolTipText("Producto Defi Produ");
		this.jLabelid_producto_defi_produProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_producto_defi_produProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_producto_defi_produProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_producto_defi_produProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_producto_defi_produProductoProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_producto_defi_produProductoProduGasto.setToolTipText(ProductoProduGastoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU);
		this.gridaBagLayoutProductoProduGasto = new GridBagLayout();
		this.jPanelid_producto_defi_produProductoProduGasto.setLayout(this.gridaBagLayoutProductoProduGasto);


		jComboBoxid_producto_defi_produProductoProduGasto= new JComboBoxMe();
		jComboBoxid_producto_defi_produProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_defi_produProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_defi_produProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_producto_defi_produProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_producto_defi_produProductoProduGasto= new JButtonMe();
		this.jButtonid_producto_defi_produProductoProduGasto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_defi_produProductoProduGasto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_defi_produProductoProduGasto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_defi_produProductoProduGasto.setText("Buscar");
		this.jButtonid_producto_defi_produProductoProduGasto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_producto_defi_produProductoProduGasto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_defi_produProductoProduGasto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_producto_defi_produProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_defi_produProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_defi_produProductoProduGasto"));

		this.jButtonid_producto_defi_produProductoProduGastoBusqueda= new JButtonMe();
		this.jButtonid_producto_defi_produProductoProduGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_defi_produProductoProduGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_defi_produProductoProduGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_producto_defi_produProductoProduGastoBusqueda.setText("U");
		this.jButtonid_producto_defi_produProductoProduGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_producto_defi_produProductoProduGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_defi_produProductoProduGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_producto_defi_produProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_defi_produProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_defi_produProductoProduGastoBusqueda"));

		if(this.productoprodugastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_producto_defi_produProductoProduGastoBusqueda.setVisible(false);		}

		this.jButtonid_producto_defi_produProductoProduGastoUpdate= new JButtonMe();
		this.jButtonid_producto_defi_produProductoProduGastoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_defi_produProductoProduGastoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_defi_produProductoProduGastoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_producto_defi_produProductoProduGastoUpdate.setText("U");
		this.jButtonid_producto_defi_produProductoProduGastoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_producto_defi_produProductoProduGastoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_defi_produProductoProduGastoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_producto_defi_produProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_defi_produProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_defi_produProductoProduGastoUpdate"));



					
		this.jLabelid_tipo_gasto_produ_empresaProductoProduGasto = new JLabelMe();
		this.jLabelid_tipo_gasto_produ_empresaProductoProduGasto.setText(""+ProductoProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA+" : *");
		this.jLabelid_tipo_gasto_produ_empresaProductoProduGasto.setToolTipText("Tipo Gasto Produ Empresa");
		this.jLabelid_tipo_gasto_produ_empresaProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_gasto_produ_empresaProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_gasto_produ_empresaProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_gasto_produ_empresaProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_gasto_produ_empresaProductoProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_gasto_produ_empresaProductoProduGasto.setToolTipText(ProductoProduGastoConstantesFunciones.LABEL_IDTIPOGASTOPRODUEMPRESA);
		this.gridaBagLayoutProductoProduGasto = new GridBagLayout();
		this.jPanelid_tipo_gasto_produ_empresaProductoProduGasto.setLayout(this.gridaBagLayoutProductoProduGasto);


		jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto= new JComboBoxMe();
		jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_gasto_produ_empresaProductoProduGasto= new JButtonMe();
		this.jButtonid_tipo_gasto_produ_empresaProductoProduGasto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_gasto_produ_empresaProductoProduGasto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_gasto_produ_empresaProductoProduGasto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_gasto_produ_empresaProductoProduGasto.setText("Buscar");
		this.jButtonid_tipo_gasto_produ_empresaProductoProduGasto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_gasto_produ_empresaProductoProduGasto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_gasto_produ_empresaProductoProduGasto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_gasto_produ_empresaProductoProduGasto"));

		this.jButtonid_tipo_gasto_produ_empresaProductoProduGastoBusqueda= new JButtonMe();
		this.jButtonid_tipo_gasto_produ_empresaProductoProduGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_gasto_produ_empresaProductoProduGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_gasto_produ_empresaProductoProduGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_gasto_produ_empresaProductoProduGastoBusqueda.setText("U");
		this.jButtonid_tipo_gasto_produ_empresaProductoProduGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_gasto_produ_empresaProductoProduGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_gasto_produ_empresaProductoProduGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_gasto_produ_empresaProductoProduGastoBusqueda"));

		if(this.productoprodugastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_gasto_produ_empresaProductoProduGastoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_gasto_produ_empresaProductoProduGastoUpdate= new JButtonMe();
		this.jButtonid_tipo_gasto_produ_empresaProductoProduGastoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_gasto_produ_empresaProductoProduGastoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_gasto_produ_empresaProductoProduGastoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_gasto_produ_empresaProductoProduGastoUpdate.setText("U");
		this.jButtonid_tipo_gasto_produ_empresaProductoProduGastoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_gasto_produ_empresaProductoProduGastoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_gasto_produ_empresaProductoProduGastoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_gasto_produ_empresaProductoProduGastoUpdate"));



					
		this.jLabelid_cuenta_contable_debitoProductoProduGasto = new JLabelMe();
		this.jLabelid_cuenta_contable_debitoProductoProduGasto.setText(""+ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO+" : *");
		this.jLabelid_cuenta_contable_debitoProductoProduGasto.setToolTipText("Cuenta Contable Debito");
		this.jLabelid_cuenta_contable_debitoProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_debitoProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_debitoProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_debitoProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_debitoProductoProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_debitoProductoProduGasto.setToolTipText(ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
		this.gridaBagLayoutProductoProduGasto = new GridBagLayout();
		this.jPanelid_cuenta_contable_debitoProductoProduGasto.setLayout(this.gridaBagLayoutProductoProduGasto);


		jComboBoxid_cuenta_contable_debitoProductoProduGasto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_debitoProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_debitoProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_debitoProductoProduGasto= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoProductoProduGasto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoProductoProduGasto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoProductoProduGasto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoProductoProduGasto.setText("Buscar");
		this.jButtonid_cuenta_contable_debitoProductoProduGasto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_debitoProductoProduGasto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoProductoProduGasto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_debitoProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoProductoProduGasto"));

		this.jButtonid_cuenta_contable_debitoProductoProduGastoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoProductoProduGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoProductoProduGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoProductoProduGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_debitoProductoProduGastoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_debitoProductoProduGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_debitoProductoProduGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoProductoProduGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_debitoProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoProductoProduGastoBusqueda"));

		if(this.productoprodugastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_debitoProductoProduGastoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_debitoProductoProduGastoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoProductoProduGastoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoProductoProduGastoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoProductoProduGastoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_debitoProductoProduGastoUpdate.setText("U");
		this.jButtonid_cuenta_contable_debitoProductoProduGastoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_debitoProductoProduGastoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoProductoProduGastoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_debitoProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoProductoProduGastoUpdate"));


		jButtonid_cuenta_contable_debitoProductoProduGastoArbol= new JButtonMe();
		jButtonid_cuenta_contable_debitoProductoProduGastoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoProductoProduGastoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoProductoProduGastoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoProductoProduGastoArbol.setText("Arbol");
		jButtonid_cuenta_contable_debitoProductoProduGastoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_debitoProductoProduGastoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoProductoProduGastoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_debitoProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoProductoProduGastoArbol"));



					
		this.jLabelid_cuenta_contable_creditoProductoProduGasto = new JLabelMe();
		this.jLabelid_cuenta_contable_creditoProductoProduGasto.setText(""+ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO+" : *");
		this.jLabelid_cuenta_contable_creditoProductoProduGasto.setToolTipText("Cuenta Contable Credito");
		this.jLabelid_cuenta_contable_creditoProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_creditoProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_creditoProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_creditoProductoProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_creditoProductoProduGasto.setToolTipText(ProductoProduGastoConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		this.gridaBagLayoutProductoProduGasto = new GridBagLayout();
		this.jPanelid_cuenta_contable_creditoProductoProduGasto.setLayout(this.gridaBagLayoutProductoProduGasto);


		jComboBoxid_cuenta_contable_creditoProductoProduGasto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_creditoProductoProduGasto= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoProductoProduGasto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoProductoProduGasto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoProductoProduGasto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoProductoProduGasto.setText("Buscar");
		this.jButtonid_cuenta_contable_creditoProductoProduGasto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_creditoProductoProduGasto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoProductoProduGasto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_creditoProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoProductoProduGasto"));

		this.jButtonid_cuenta_contable_creditoProductoProduGastoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoProductoProduGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoProductoProduGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoProductoProduGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoProductoProduGastoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_creditoProductoProduGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_creditoProductoProduGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoProductoProduGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_creditoProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoProductoProduGastoBusqueda"));

		if(this.productoprodugastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_creditoProductoProduGastoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_creditoProductoProduGastoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoProductoProduGastoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoProductoProduGastoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoProductoProduGastoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoProductoProduGastoUpdate.setText("U");
		this.jButtonid_cuenta_contable_creditoProductoProduGastoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_creditoProductoProduGastoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoProductoProduGastoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_creditoProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoProductoProduGastoUpdate"));


		jButtonid_cuenta_contable_creditoProductoProduGastoArbol= new JButtonMe();
		jButtonid_cuenta_contable_creditoProductoProduGastoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoProductoProduGastoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoProductoProduGastoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoProductoProduGastoArbol.setText("Arbol");
		jButtonid_cuenta_contable_creditoProductoProduGastoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_creditoProductoProduGastoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoProductoProduGastoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_creditoProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoProductoProduGastoArbol"));



					
		this.jLabelid_cliente_proveedorProductoProduGasto = new JLabelMe();
		this.jLabelid_cliente_proveedorProductoProduGasto.setText(""+ProductoProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR+" : *");
		this.jLabelid_cliente_proveedorProductoProduGasto.setToolTipText("Cliente Proveedor");
		this.jLabelid_cliente_proveedorProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cliente_proveedorProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cliente_proveedorProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cliente_proveedorProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cliente_proveedorProductoProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cliente_proveedorProductoProduGasto.setToolTipText(ProductoProduGastoConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR);
		this.gridaBagLayoutProductoProduGasto = new GridBagLayout();
		this.jPanelid_cliente_proveedorProductoProduGasto.setLayout(this.gridaBagLayoutProductoProduGasto);


		jComboBoxid_cliente_proveedorProductoProduGasto= new JComboBoxMe();
		jComboBoxid_cliente_proveedorProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_proveedorProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_proveedorProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cliente_proveedorProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cliente_proveedorProductoProduGasto= new JButtonMe();
		this.jButtonid_cliente_proveedorProductoProduGasto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_proveedorProductoProduGasto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_proveedorProductoProduGasto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_proveedorProductoProduGasto.setText("Buscar");
		this.jButtonid_cliente_proveedorProductoProduGasto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cliente_proveedorProductoProduGasto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_proveedorProductoProduGasto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cliente_proveedorProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_proveedorProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_proveedorProductoProduGasto"));

		this.jButtonid_cliente_proveedorProductoProduGastoBusqueda= new JButtonMe();
		this.jButtonid_cliente_proveedorProductoProduGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_proveedorProductoProduGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_proveedorProductoProduGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cliente_proveedorProductoProduGastoBusqueda.setText("U");
		this.jButtonid_cliente_proveedorProductoProduGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cliente_proveedorProductoProduGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_proveedorProductoProduGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cliente_proveedorProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_proveedorProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_proveedorProductoProduGastoBusqueda"));

		if(this.productoprodugastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cliente_proveedorProductoProduGastoBusqueda.setVisible(false);		}

		this.jButtonid_cliente_proveedorProductoProduGastoUpdate= new JButtonMe();
		this.jButtonid_cliente_proveedorProductoProduGastoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_proveedorProductoProduGastoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_proveedorProductoProduGastoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cliente_proveedorProductoProduGastoUpdate.setText("U");
		this.jButtonid_cliente_proveedorProductoProduGastoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cliente_proveedorProductoProduGastoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_proveedorProductoProduGastoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cliente_proveedorProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_proveedorProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_proveedorProductoProduGastoUpdate"));



					
		this.jLabelid_facturaProductoProduGasto = new JLabelMe();
		this.jLabelid_facturaProductoProduGasto.setText(""+ProductoProduGastoConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaProductoProduGasto.setToolTipText("Factura");
		this.jLabelid_facturaProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaProductoProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaProductoProduGasto.setToolTipText(ProductoProduGastoConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutProductoProduGasto = new GridBagLayout();
		this.jPanelid_facturaProductoProduGasto.setLayout(this.gridaBagLayoutProductoProduGasto);


		jComboBoxid_facturaProductoProduGasto= new JComboBoxMe();
		jComboBoxid_facturaProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaProductoProduGasto= new JButtonMe();
		this.jButtonid_facturaProductoProduGasto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaProductoProduGasto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaProductoProduGasto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaProductoProduGasto.setText("Buscar");
		this.jButtonid_facturaProductoProduGasto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaProductoProduGasto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaProductoProduGasto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaProductoProduGasto"));

		this.jButtonid_facturaProductoProduGastoBusqueda= new JButtonMe();
		this.jButtonid_facturaProductoProduGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaProductoProduGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaProductoProduGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaProductoProduGastoBusqueda.setText("U");
		this.jButtonid_facturaProductoProduGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaProductoProduGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaProductoProduGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaProductoProduGastoBusqueda"));

		if(this.productoprodugastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaProductoProduGastoBusqueda.setVisible(false);		}

		this.jButtonid_facturaProductoProduGastoUpdate= new JButtonMe();
		this.jButtonid_facturaProductoProduGastoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaProductoProduGastoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaProductoProduGastoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaProductoProduGastoUpdate.setText("U");
		this.jButtonid_facturaProductoProduGastoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaProductoProduGastoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaProductoProduGastoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaProductoProduGastoUpdate"));



					
		this.jLabelid_unidadProductoProduGasto = new JLabelMe();
		this.jLabelid_unidadProductoProduGasto.setText(""+ProductoProduGastoConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadProductoProduGasto.setToolTipText("Unad");
		this.jLabelid_unidadProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadProductoProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadProductoProduGasto.setToolTipText(ProductoProduGastoConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutProductoProduGasto = new GridBagLayout();
		this.jPanelid_unidadProductoProduGasto.setLayout(this.gridaBagLayoutProductoProduGasto);


		jComboBoxid_unidadProductoProduGasto= new JComboBoxMe();
		jComboBoxid_unidadProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadProductoProduGasto= new JButtonMe();
		this.jButtonid_unidadProductoProduGasto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoProduGasto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoProduGasto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoProduGasto.setText("Buscar");
		this.jButtonid_unidadProductoProduGasto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadProductoProduGasto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoProduGasto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoProduGasto"));

		this.jButtonid_unidadProductoProduGastoBusqueda= new JButtonMe();
		this.jButtonid_unidadProductoProduGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoProduGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoProduGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoProduGastoBusqueda.setText("U");
		this.jButtonid_unidadProductoProduGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadProductoProduGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoProduGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoProduGastoBusqueda"));

		if(this.productoprodugastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadProductoProduGastoBusqueda.setVisible(false);		}

		this.jButtonid_unidadProductoProduGastoUpdate= new JButtonMe();
		this.jButtonid_unidadProductoProduGastoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoProduGastoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoProduGastoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoProduGastoUpdate.setText("U");
		this.jButtonid_unidadProductoProduGastoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadProductoProduGastoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoProduGastoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadProductoProduGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoProduGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoProduGastoUpdate"));



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
		//this.jInternalFrameDetalleProductoProduGasto = new ProductoProduGastoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Producto Gasto Produccion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoProduGasto= new GridBagLayout();
		

		
		String sToolTipProductoProduGasto="";
		sToolTipProductoProduGasto=ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoProduGasto+="(Produccion.ProductoProduGasto)";
		}
		
		if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoProduGasto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductoProduGasto = new JButtonMe();
		this.jButtonModificarProductoProduGasto = new JButtonMe();
        this.jButtonActualizarProductoProduGasto = new JButtonMe();
        this.jButtonEliminarProductoProduGasto = new JButtonMe();
        this.jButtonCancelarProductoProduGasto = new JButtonMe();
        this.jButtonGuardarCambiosProductoProduGasto = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductoProduGasto = new JButtonMe();
		this.jButtonCerrarProductoProduGasto = new JButtonMe();
		
		this.jScrollPanelDatosProductoProduGasto = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductoProduGasto = new JScrollPane();
		this.jScrollPanelDatosGeneralProductoProduGasto = new JScrollPane();
				
		
		
		this.jPanelCamposProductoProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductoProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductoProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductoProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Gasto Produccion";
		
		if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Gasto Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoProduGasto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductoProduGasto.setName("jPanelCamposProductoProduGasto"); 

		this.jPanelCamposOcultosProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductoProduGasto.setName("jPanelCamposOcultosProductoProduGasto"); 

        this.jPanelAccionesProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoProduGasto.setToolTipText("Acciones");
        this.jPanelAccionesProductoProduGasto.setName("Acciones"); 

		this.jPanelAccionesFormularioProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductoProduGasto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductoProduGasto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductoProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductoProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductoProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductoProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductoProduGasto.setText("Nuevo");
		this.jButtonModificarProductoProduGasto.setText("Editar");
        this.jButtonActualizarProductoProduGasto.setText("Actualizar");
        this.jButtonEliminarProductoProduGasto.setText("Eliminar");
        this.jButtonCancelarProductoProduGasto.setText("Cancelar");
        this.jButtonGuardarCambiosProductoProduGasto.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductoProduGasto.setText("Guardar");
		this.jButtonCerrarProductoProduGasto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoProduGasto,"nuevo_button","Nuevo",this.productoprodugastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductoProduGasto,"modificar_button","Editar",this.productoprodugastoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductoProduGasto,"actualizar_button","Actualizar",this.productoprodugastoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductoProduGasto,"eliminar_button","Eliminar",this.productoprodugastoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductoProduGasto,"cancelar_button","Cancelar",this.productoprodugastoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductoProduGasto,"guardarcambios_button","Guardar",this.productoprodugastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoProduGasto,"guardarcambiostabla_button","Guardar",this.productoprodugastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoProduGasto,"cerrar_button","Salir",this.productoprodugastoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductoProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductoProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductoProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductoProduGasto.setToolTipText("Nuevo"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductoProduGasto.setToolTipText("Editar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductoProduGasto.setToolTipText("Actualizar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductoProduGasto.setToolTipText("Eliminar)"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductoProduGasto.setToolTipText("Cancelar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductoProduGasto.setToolTipText("Guardar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductoProduGasto.setToolTipText("Guardar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoProduGasto.setToolTipText("Salir"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoProduGasto";
		inputMap = this.jButtonNuevoProductoProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoProduGasto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoProduGasto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductoProduGasto";
		inputMap = this.jButtonActualizarProductoProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductoProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductoProduGasto"));
		
		//ELIMINAR
		sMapKey = "EliminarProductoProduGasto";
		inputMap = this.jButtonEliminarProductoProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductoProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductoProduGasto"));
		
		//CANCELAR	
		sMapKey = "CancelarProductoProduGasto";
		inputMap = this.jButtonCancelarProductoProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductoProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductoProduGasto"));
		
		//CERRAR		
		sMapKey = "CerrarProductoProduGasto";
		inputMap = this.jButtonCerrarProductoProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoProduGasto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoProduGasto";
		inputMap = this.jButtonGuardarCambiosTablaProductoProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoProduGasto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductoProduGasto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductoProduGasto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductoProduGasto.setToolTipText("Nuevo ProductoProduGasto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductoProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductoProduGasto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductoProduGasto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductoProduGasto.setToolTipText("Sin Cerrar Ventana ProductoProduGasto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductoProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductoProduGasto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductoProduGasto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductoProduGasto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductoProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductoProduGasto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoProduGasto.setText("Accion");
		this.jComboBoxTiposAccionesProductoProduGasto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductoProduGasto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductoProduGasto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductoProduGasto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductoProduGasto = new JLabelMe();
		
		this.jLabelAccionesProductoProduGasto.setText("Acciones");		
		this.jLabelAccionesProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductoProduGasto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductoProduGasto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductoProduGasto=new JTabbedPane();
		this.jTabbedPaneRelacionesProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductoProduGasto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductoProduGasto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProduGasto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProduGasto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductoProduGasto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoProduGasto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoProduGasto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductoProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductoProduGasto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductoProduGasto = new GridBagLayout();
		
		this.jPanelCamposProductoProduGasto.setLayout(gridaBagLayoutCamposProductoProduGasto);
		this.jPanelCamposOcultosProductoProduGasto.setLayout(gridaBagLayoutCamposOcultosProductoProduGasto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 0;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductoProduGasto.add(jLabelIdProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 1;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductoProduGasto.add(jLabelidProductoProduGasto, this.gridBagConstraintsProductoProduGasto);


	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 0;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_producto_defi_produProductoProduGasto.add(jLabelid_producto_defi_produProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = 0;
		this.gridBagConstraintsProductoProduGasto.gridx = 2;
		this.gridBagConstraintsProductoProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_producto_defi_produProductoProduGasto.add(jButtonid_producto_defi_produProductoProduGastoBusqueda, this.gridBagConstraintsProductoProduGasto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = 0;
		this.gridBagConstraintsProductoProduGasto.gridx = 3;
		this.gridBagConstraintsProductoProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_producto_defi_produProductoProduGasto.add(jButtonid_producto_defi_produProductoProduGastoUpdate, this.gridBagConstraintsProductoProduGasto);
	}

	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 1;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_producto_defi_produProductoProduGasto.add(jComboBoxid_producto_defi_produProductoProduGasto, this.gridBagConstraintsProductoProduGasto);


	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 0;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_gasto_produ_empresaProductoProduGasto.add(jLabelid_tipo_gasto_produ_empresaProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = 0;
		this.gridBagConstraintsProductoProduGasto.gridx = 2;
		this.gridBagConstraintsProductoProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_gasto_produ_empresaProductoProduGasto.add(jButtonid_tipo_gasto_produ_empresaProductoProduGastoBusqueda, this.gridBagConstraintsProductoProduGasto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = 0;
		this.gridBagConstraintsProductoProduGasto.gridx = 3;
		this.gridBagConstraintsProductoProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_gasto_produ_empresaProductoProduGasto.add(jButtonid_tipo_gasto_produ_empresaProductoProduGastoUpdate, this.gridBagConstraintsProductoProduGasto);
	}

	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 1;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_gasto_produ_empresaProductoProduGasto.add(jComboBoxid_tipo_gasto_produ_empresaProductoProduGasto, this.gridBagConstraintsProductoProduGasto);


	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 0;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_debitoProductoProduGasto.add(jLabelid_cuenta_contable_debitoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = 0;
		this.gridBagConstraintsProductoProduGasto.gridx = 2;
		this.gridBagConstraintsProductoProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_debitoProductoProduGasto.add(jButtonid_cuenta_contable_debitoProductoProduGastoBusqueda, this.gridBagConstraintsProductoProduGasto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = 0;
		this.gridBagConstraintsProductoProduGasto.gridx = 3;
		this.gridBagConstraintsProductoProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_debitoProductoProduGasto.add(jButtonid_cuenta_contable_debitoProductoProduGastoUpdate, this.gridBagConstraintsProductoProduGasto);
	}

	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 1;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_debitoProductoProduGasto.add(jComboBoxid_cuenta_contable_debitoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);


	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 0;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_creditoProductoProduGasto.add(jLabelid_cuenta_contable_creditoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = 0;
		this.gridBagConstraintsProductoProduGasto.gridx = 2;
		this.gridBagConstraintsProductoProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoProductoProduGasto.add(jButtonid_cuenta_contable_creditoProductoProduGastoBusqueda, this.gridBagConstraintsProductoProduGasto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = 0;
		this.gridBagConstraintsProductoProduGasto.gridx = 3;
		this.gridBagConstraintsProductoProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoProductoProduGasto.add(jButtonid_cuenta_contable_creditoProductoProduGastoUpdate, this.gridBagConstraintsProductoProduGasto);
	}

	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 1;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_creditoProductoProduGasto.add(jComboBoxid_cuenta_contable_creditoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);


	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 0;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cliente_proveedorProductoProduGasto.add(jLabelid_cliente_proveedorProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	//this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 2;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cliente_proveedorProductoProduGasto.add(jButtonid_cliente_proveedorProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = 0;
		this.gridBagConstraintsProductoProduGasto.gridx = 3;
		this.gridBagConstraintsProductoProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cliente_proveedorProductoProduGasto.add(jButtonid_cliente_proveedorProductoProduGastoBusqueda, this.gridBagConstraintsProductoProduGasto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = 0;
		this.gridBagConstraintsProductoProduGasto.gridx = 4;
		this.gridBagConstraintsProductoProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cliente_proveedorProductoProduGasto.add(jButtonid_cliente_proveedorProductoProduGastoUpdate, this.gridBagConstraintsProductoProduGasto);
	}

	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 1;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cliente_proveedorProductoProduGasto.add(jComboBoxid_cliente_proveedorProductoProduGasto, this.gridBagConstraintsProductoProduGasto);


	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 0;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_facturaProductoProduGasto.add(jLabelid_facturaProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	//this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 2;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaProductoProduGasto.add(jButtonid_facturaProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = 0;
		this.gridBagConstraintsProductoProduGasto.gridx = 3;
		this.gridBagConstraintsProductoProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaProductoProduGasto.add(jButtonid_facturaProductoProduGastoBusqueda, this.gridBagConstraintsProductoProduGasto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = 0;
		this.gridBagConstraintsProductoProduGasto.gridx = 4;
		this.gridBagConstraintsProductoProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaProductoProduGasto.add(jButtonid_facturaProductoProduGastoUpdate, this.gridBagConstraintsProductoProduGasto);
	}

	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 1;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_facturaProductoProduGasto.add(jComboBoxid_facturaProductoProduGasto, this.gridBagConstraintsProductoProduGasto);


	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 0;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadProductoProduGasto.add(jLabelid_unidadProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = 0;
		this.gridBagConstraintsProductoProduGasto.gridx = 2;
		this.gridBagConstraintsProductoProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoProduGasto.add(jButtonid_unidadProductoProduGastoBusqueda, this.gridBagConstraintsProductoProduGasto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = 0;
		this.gridBagConstraintsProductoProduGasto.gridx = 3;
		this.gridBagConstraintsProductoProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoProduGasto.add(jButtonid_unidadProductoProduGastoUpdate, this.gridBagConstraintsProductoProduGasto);
	}

	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 1;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadProductoProduGasto.add(jComboBoxid_unidadProductoProduGasto, this.gridBagConstraintsProductoProduGasto);


	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 0;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcanitdadProductoProduGasto.add(jLabelcanitdadProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = 0;
		this.gridBagConstraintsProductoProduGasto.gridx = 2;
		this.gridBagConstraintsProductoProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcanitdadProductoProduGasto.add(jButtoncanitdadProductoProduGastoBusqueda, this.gridBagConstraintsProductoProduGasto);
	}

	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 1;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcanitdadProductoProduGasto.add(jTextFieldcanitdadProductoProduGasto, this.gridBagConstraintsProductoProduGasto);


	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 0;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoProductoProduGasto.add(jLabelcostoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = 0;
		this.gridBagConstraintsProductoProduGasto.gridx = 2;
		this.gridBagConstraintsProductoProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoProductoProduGasto.add(jButtoncostoProductoProduGastoBusqueda, this.gridBagConstraintsProductoProduGasto);
	}

	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 1;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoProductoProduGasto.add(jTextFieldcostoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);


	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 0;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalProductoProduGasto.add(jLabelcosto_totalProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = 0;
		this.gridBagConstraintsProductoProduGasto.gridx = 2;
		this.gridBagConstraintsProductoProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalProductoProduGasto.add(jButtoncosto_totalProductoProduGastoBusqueda, this.gridBagConstraintsProductoProduGasto);
	}

	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 1;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalProductoProduGasto.add(jTextFieldcosto_totalProductoProduGasto, this.gridBagConstraintsProductoProduGasto);


	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 0;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionProductoProduGasto.add(jLabeldescripcionProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = 0;
		this.gridBagConstraintsProductoProduGasto.gridx = 2;
		this.gridBagConstraintsProductoProduGasto.ipadx = 0;
		this.gridBagConstraintsProductoProduGasto.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionProductoProduGasto.add(jButtondescripcionProductoProduGastoBusqueda, this.gridBagConstraintsProductoProduGasto);
	}

	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoProduGasto.gridy = 0;
	this.gridBagConstraintsProductoProduGasto.gridx = 1;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionProductoProduGasto.add(jscrollPanedescripcionProductoProduGasto, this.gridBagConstraintsProductoProduGasto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduGasto.gridy = iYPanelCamposProductoProduGasto;
	this.gridBagConstraintsProductoProduGasto.gridx = iXPanelCamposProductoProduGasto++;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduGasto.add(this.jPanelidProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	if(iXPanelCamposProductoProduGasto % 1==0) {
		iXPanelCamposProductoProduGasto=0;
		iYPanelCamposProductoProduGasto++;
	}
	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduGasto.gridy = iYPanelCamposProductoProduGasto;
	this.gridBagConstraintsProductoProduGasto.gridx = iXPanelCamposProductoProduGasto++;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduGasto.add(this.jPanelid_producto_defi_produProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	if(iXPanelCamposProductoProduGasto % 1==0) {
		iXPanelCamposProductoProduGasto=0;
		iYPanelCamposProductoProduGasto++;
	}
	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduGasto.gridy = iYPanelCamposProductoProduGasto;
	this.gridBagConstraintsProductoProduGasto.gridx = iXPanelCamposProductoProduGasto++;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduGasto.add(this.jPanelid_tipo_gasto_produ_empresaProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	if(iXPanelCamposProductoProduGasto % 1==0) {
		iXPanelCamposProductoProduGasto=0;
		iYPanelCamposProductoProduGasto++;
	}
	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduGasto.gridy = iYPanelCamposProductoProduGasto;
	this.gridBagConstraintsProductoProduGasto.gridx = iXPanelCamposProductoProduGasto++;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduGasto.add(this.jPanelid_cuenta_contable_debitoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	if(iXPanelCamposProductoProduGasto % 1==0) {
		iXPanelCamposProductoProduGasto=0;
		iYPanelCamposProductoProduGasto++;
	}
	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduGasto.gridy = iYPanelCamposProductoProduGasto;
	this.gridBagConstraintsProductoProduGasto.gridx = iXPanelCamposProductoProduGasto++;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduGasto.add(this.jPanelid_cuenta_contable_creditoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	if(iXPanelCamposProductoProduGasto % 1==0) {
		iXPanelCamposProductoProduGasto=0;
		iYPanelCamposProductoProduGasto++;
	}
	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduGasto.gridy = iYPanelCamposProductoProduGasto;
	this.gridBagConstraintsProductoProduGasto.gridx = iXPanelCamposProductoProduGasto++;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduGasto.add(this.jPanelid_cliente_proveedorProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	if(iXPanelCamposProductoProduGasto % 1==0) {
		iXPanelCamposProductoProduGasto=0;
		iYPanelCamposProductoProduGasto++;
	}
	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduGasto.gridy = iYPanelCamposProductoProduGasto;
	this.gridBagConstraintsProductoProduGasto.gridx = iXPanelCamposProductoProduGasto++;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduGasto.add(this.jPanelid_facturaProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	if(iXPanelCamposProductoProduGasto % 1==0) {
		iXPanelCamposProductoProduGasto=0;
		iYPanelCamposProductoProduGasto++;
	}
	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduGasto.gridy = iYPanelCamposProductoProduGasto;
	this.gridBagConstraintsProductoProduGasto.gridx = iXPanelCamposProductoProduGasto++;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduGasto.add(this.jPanelid_unidadProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	if(iXPanelCamposProductoProduGasto % 1==0) {
		iXPanelCamposProductoProduGasto=0;
		iYPanelCamposProductoProduGasto++;
	}
	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduGasto.gridy = iYPanelCamposProductoProduGasto;
	this.gridBagConstraintsProductoProduGasto.gridx = iXPanelCamposProductoProduGasto++;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduGasto.add(this.jPanelcanitdadProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	if(iXPanelCamposProductoProduGasto % 1==0) {
		iXPanelCamposProductoProduGasto=0;
		iYPanelCamposProductoProduGasto++;
	}
	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduGasto.gridy = iYPanelCamposProductoProduGasto;
	this.gridBagConstraintsProductoProduGasto.gridx = iXPanelCamposProductoProduGasto++;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduGasto.add(this.jPanelcostoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	if(iXPanelCamposProductoProduGasto % 1==0) {
		iXPanelCamposProductoProduGasto=0;
		iYPanelCamposProductoProduGasto++;
	}
	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduGasto.gridy = iYPanelCamposProductoProduGasto;
	this.gridBagConstraintsProductoProduGasto.gridx = iXPanelCamposProductoProduGasto++;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduGasto.add(this.jPanelcosto_totalProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	if(iXPanelCamposProductoProduGasto % 1==0) {
		iXPanelCamposProductoProduGasto=0;
		iYPanelCamposProductoProduGasto++;
	}
	this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoProduGasto.gridy = iYPanelCamposProductoProduGasto;
	this.gridBagConstraintsProductoProduGasto.gridx = iXPanelCamposProductoProduGasto++;
	this.gridBagConstraintsProductoProduGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoProduGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoProduGasto.add(this.jPaneldescripcionProductoProduGasto, this.gridBagConstraintsProductoProduGasto);



	if(iXPanelCamposProductoProduGasto % 1==0) {
		iXPanelCamposProductoProduGasto=0;
		iYPanelCamposProductoProduGasto++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductoProduGasto= new GridBagLayout();
		this.jPanelAccionesProductoProduGasto.setLayout(gridaBagLayoutAccionesProductoProduGasto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductoProduGasto= new GridBagLayout();
		this.jPanelAccionesFormularioProductoProduGasto.setLayout(gridaBagLayoutAccionesFormularioProductoProduGasto);
		
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoProduGasto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoProduGasto.add(this.jComboBoxTiposAccionesFormularioProductoProduGasto, this.gridBagConstraintsProductoProduGasto);

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoProduGasto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoProduGasto.add(this.jCheckBoxPostAccionNuevoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.productoprodugastoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoProduGasto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoProduGasto.add(this.jCheckBoxPostAccionSinCerrarProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.productoprodugastoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoProduGasto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoProduGasto.add(this.jCheckBoxPostAccionSinMensajeProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduGasto.gridy = 0;
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductoProduGasto.add(this.jButtonModificarProductoProduGasto, this.gridBagConstraintsProductoProduGasto);							

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduGasto.gridy = 0;
		this.gridBagConstraintsProductoProduGasto.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductoProduGasto.add(this.jButtonEliminarProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		
			
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.gridy = 0;		
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoProduGasto.add(this.jButtonActualizarProductoProduGasto, this.gridBagConstraintsProductoProduGasto);


		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.gridy = 0;		
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoProduGasto.add(this.jButtonGuardarCambiosProductoProduGasto, this.gridBagConstraintsProductoProduGasto);	
		
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.gridy = 0;		
		this.gridBagConstraintsProductoProduGasto.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductoProduGasto.add(this.jButtonCancelarProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoProduGasto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoProduGasto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();						
			this.gridBagConstraintsProductoProduGasto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoProduGasto.gridx = 0;		
			//this.gridBagConstraintsProductoProduGasto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoProduGasto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoProduGasto.gridx =0;
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoProduGasto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductoProduGastoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductoProduGasto = new ProductoProduGastoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Producto Gasto Produccion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Producto Gasto Produccion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Producto Gasto Produccion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductoProduGastoModel productoprodugastoModel=new ProductoProduGastoModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductoProduGastoModel.ProductoProduGastoFocusTraversalPolicy productoprodugastoFocusTraversalPolicy = productoprodugastoModel.new ProductoProduGastoFocusTraversalPolicy(this);
			
			//productoprodugastoFocusTraversalPolicy.setproductoprodugastoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productoprodugastoModel);
			
			
			this.jContentPaneDetalleProductoProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductoProduGasto = new GridBagLayout();	
			this.jContentPaneDetalleProductoProduGasto.setLayout(gridaBagLayoutDetalleProductoProduGasto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoProduGasto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
				this.gridBagConstraintsProductoProduGasto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductoProduGasto.gridx = 0;
					
				
				this.jContentPaneDetalleProductoProduGasto.add(jTtoolBarDetalleProductoProduGasto, gridBagConstraintsProductoProduGasto);								
				
}
			
			this.jScrollPanelDatosEdicionProductoProduGasto=   new JScrollPane(jContentPaneDetalleProductoProduGasto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoProduGasto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProduGasto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProduGasto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductoProduGasto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoProduGasto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProduGasto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProduGasto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductoProduGasto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductoProduGasto.gridx = 0;
	        
			this.jContentPaneDetalleProductoProduGasto.add(jPanelCamposProductoProduGasto, gridBagConstraintsProductoProduGasto);
			
			
			
			
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
						&& productoprodugastoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productoprodugastoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductoProduGasto= new GridBagConstraints();
						this.gridBagConstraintsProductoProduGasto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductoProduGasto.gridx = 0;
						this.jContentPaneDetalleProductoProduGasto.add(this.jTabbedPaneRelacionesProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductoProduGasto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductoProduGasto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
					this.gridBagConstraintsProductoProduGasto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductoProduGasto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductoProduGasto.gridx = 0;
					
				
					this.jContentPaneDetalleProductoProduGasto.add(jPanelCamposOcultosProductoProduGasto, gridBagConstraintsProductoProduGasto);
				
					this.jPanelCamposOcultosProductoProduGasto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductoProduGasto.gridx = 0;
	        this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductoProduGasto.add(this.jPanelAccionesFormularioProductoProduGasto, this.gridBagConstraintsProductoProduGasto);							
			
			
			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
	        this.gridBagConstraintsProductoProduGasto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductoProduGasto.gridx = 0;
	        
			
			this.jContentPaneDetalleProductoProduGasto.add(this.jPanelAccionesProductoProduGasto, this.gridBagConstraintsProductoProduGasto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductoProduGasto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductoProduGasto=   new JScrollPane(this.jPanelCamposProductoProduGasto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoProduGasto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProduGasto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoProduGasto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductoProduGasto.gridx = 0;
			this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductoProduGasto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoProduGasto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductoProduGasto, this.gridBagConstraintsProductoProduGasto);			
			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoProduGasto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductoProduGasto, this.gridBagConstraintsProductoProduGasto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduGasto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
			
			
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduGasto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		
			
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduGasto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductoProduGasto;//jContentPane;
		
		return jScrollPanelDatosEdicionProductoProduGasto;
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
