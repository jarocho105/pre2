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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.BuscarProductoFacturasConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class BuscarProductoFacturasDetalleFormJInternalFrame extends BuscarProductoFacturasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleBuscarProductoFacturas;
	
	protected JMenuBar jmenuBarDetalleBuscarProductoFacturas;
	
	protected JMenu jmenuDetalleBuscarProductoFacturas;
	protected JMenu jmenuDetalleArchivoBuscarProductoFacturas;
	protected JMenu jmenuDetalleAccionesBuscarProductoFacturas;
	protected JMenu jmenuDetalleDatosBuscarProductoFacturas;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleBuscarProductoFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBuscarProductoFacturas;	
	protected GridBagConstraints gridBagConstraintsBuscarProductoFacturas;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected BuscarProductoFacturasBeanSwingJInternalFrameAdditional jInternalFrameDetalleBuscarProductoFacturas;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public BuscarProductoFacturasSessionBean buscarproductofacturasSessionBean;
	
	
	
	
	public ProductoSessionBean productoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;	
	
	public BuscarProductoFacturasLogic buscarproductofacturasLogic;
	
	public JScrollPane jScrollPanelDatosBuscarProductoFacturas;
	public JScrollPane jScrollPanelDatosEdicionBuscarProductoFacturas;
	public JScrollPane jScrollPanelDatosGeneralBuscarProductoFacturas;
	
	protected JPanel jPanelCamposBuscarProductoFacturas;    
	protected JPanel jPanelCamposOcultosBuscarProductoFacturas;    	
	protected JPanel jPanelAccionesBuscarProductoFacturas;
	protected JPanel jPanelAccionesFormularioBuscarProductoFacturas;
    
	
	
	protected Integer iXPanelCamposBuscarProductoFacturas=0;
	protected Integer iYPanelCamposBuscarProductoFacturas=0;
	
	protected Integer iXPanelCamposOcultosBuscarProductoFacturas=0;
	protected Integer iYPanelCamposOcultosBuscarProductoFacturas=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoBuscarProductoFacturas;
	public JButton jButtonModificarBuscarProductoFacturas;
	public JButton jButtonActualizarBuscarProductoFacturas;
    public JButton jButtonEliminarBuscarProductoFacturas;
	public JButton jButtonCancelarBuscarProductoFacturas;
    public JButton jButtonGuardarCambiosBuscarProductoFacturas;
	public JButton jButtonGuardarCambiosTablaBuscarProductoFacturas;
	protected JButton jButtonCerrarBuscarProductoFacturas;
	
	
	protected JButton jButtonProcesarInformacionBuscarProductoFacturas;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoBuscarProductoFacturas;
	protected JCheckBox jCheckBoxPostAccionSinCerrarBuscarProductoFacturas;
	protected JCheckBox jCheckBoxPostAccionSinMensajeBuscarProductoFacturas;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBuscarProductoFacturas;
	protected JButton jButtonModificarToolBarBuscarProductoFacturas;
	protected JButton jButtonActualizarToolBarBuscarProductoFacturas;
    protected JButton jButtonEliminarToolBarBuscarProductoFacturas;
	protected JButton jButtonCancelarToolBarBuscarProductoFacturas;
    protected JButton jButtonGuardarCambiosToolBarBuscarProductoFacturas;
	protected JButton jButtonGuardarCambiosTablaToolBarBuscarProductoFacturas;
	protected JButton jButtonMostrarOcultarTablaToolBarBuscarProductoFacturas;
	protected JButton jButtonCerrarToolBarBuscarProductoFacturas;
	
	protected JButton jButtonProcesarInformacionToolBarBuscarProductoFacturas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBuscarProductoFacturas;
	protected JMenuItem jMenuItemModificarBuscarProductoFacturas;
	protected JMenuItem jMenuItemActualizarBuscarProductoFacturas;
    protected JMenuItem jMenuItemEliminarBuscarProductoFacturas;
	protected JMenuItem jMenuItemCancelarBuscarProductoFacturas;
    protected JMenuItem jMenuItemGuardarCambiosBuscarProductoFacturas;
	protected JMenuItem jMenuItemGuardarCambiosTablaBuscarProductoFacturas;
	protected JMenuItem jMenuItemCerrarBuscarProductoFacturas;
	protected JMenuItem jMenuItemDetalleCerrarBuscarProductoFacturas;
	protected JMenuItem jMenuItemDetalleMostarOcultarBuscarProductoFacturas;
	
	protected JMenuItem jMenuItemProcesarInformacionBuscarProductoFacturas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBuscarProductoFacturas;
	protected JMenuItem jMenuItemMostrarOcultarBuscarProductoFacturas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBuscarProductoFacturas;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBuscarProductoFacturas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBuscarProductoFacturas;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioBuscarProductoFacturas;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidBuscarProductoFacturas;
	public JLabel jLabelIdBuscarProductoFacturas;
	public JLabel jLabelidBuscarProductoFacturas;
	public JButton jButtonidBuscarProductoFacturasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impresoBuscarProductoFacturas;
	public JLabel jLabelnumero_pre_impresoBuscarProductoFacturas;
	public JTextField jTextFieldnumero_pre_impresoBuscarProductoFacturas;
	public JButton jButtonnumero_pre_impresoBuscarProductoFacturasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeBuscarProductoFacturas;
	public JLabel jLabelfecha_emision_desdeBuscarProductoFacturas;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBuscarProductoFacturas;

	public JDateChooser jDateChooserfecha_emision_desdeBuscarProductoFacturas;
	public JButton jButtonfecha_emision_desdeBuscarProductoFacturasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaBuscarProductoFacturas;
	public JLabel jLabelfecha_emision_hastaBuscarProductoFacturas;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBuscarProductoFacturas;

	public JDateChooser jDateChooserfecha_emision_hastaBuscarProductoFacturas;
	public JButton jButtonfecha_emision_hastaBuscarProductoFacturasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_vendedorBuscarProductoFacturas;
	public JLabel jLabelnombre_vendedorBuscarProductoFacturas;
	public JTextArea jTextAreanombre_vendedorBuscarProductoFacturas;
	public JScrollPane jscrollPanenombre_vendedorBuscarProductoFacturas;
	public JButton jButtonnombre_vendedorBuscarProductoFacturasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_clienteBuscarProductoFacturas;
	public JLabel jLabelnombre_completo_clienteBuscarProductoFacturas;
	public JTextArea jTextAreanombre_completo_clienteBuscarProductoFacturas;
	public JScrollPane jscrollPanenombre_completo_clienteBuscarProductoFacturas;
	public JButton jButtonnombre_completo_clienteBuscarProductoFacturasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionBuscarProductoFacturas;
	public JLabel jLabelfecha_emisionBuscarProductoFacturas;
	//public JFormattedTextField jDateChooserfecha_emisionBuscarProductoFacturas;

	public JDateChooser jDateChooserfecha_emisionBuscarProductoFacturas;
	public JButton jButtonfecha_emisionBuscarProductoFacturasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impreso_datoBuscarProductoFacturas;
	public JLabel jLabelnumero_pre_impreso_datoBuscarProductoFacturas;
	public JTextField jTextFieldnumero_pre_impreso_datoBuscarProductoFacturas;
	public JButton jButtonnumero_pre_impreso_datoBuscarProductoFacturasBusqueda= new JButtonMe();

	public JPanel jPaneltotalBuscarProductoFacturas;
	public JLabel jLabeltotalBuscarProductoFacturas;
	public JTextField jTextFieldtotalBuscarProductoFacturas;
	public JButton jButtontotalBuscarProductoFacturasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_unidadBuscarProductoFacturas;
	public JLabel jLabelnombre_unidadBuscarProductoFacturas;
	public JTextField jTextFieldnombre_unidadBuscarProductoFacturas;
	public JButton jButtonnombre_unidadBuscarProductoFacturasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_bodegaBuscarProductoFacturas;
	public JLabel jLabelnombre_bodegaBuscarProductoFacturas;
	public JTextArea jTextAreanombre_bodegaBuscarProductoFacturas;
	public JScrollPane jscrollPanenombre_bodegaBuscarProductoFacturas;
	public JButton jButtonnombre_bodegaBuscarProductoFacturasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoBuscarProductoFacturas;
	public JLabel jLabelnombre_productoBuscarProductoFacturas;
	public JTextArea jTextAreanombre_productoBuscarProductoFacturas;
	public JScrollPane jscrollPanenombre_productoBuscarProductoFacturas;
	public JButton jButtonnombre_productoBuscarProductoFacturasBusqueda= new JButtonMe();

	public JPanel jPanelcantidadBuscarProductoFacturas;
	public JLabel jLabelcantidadBuscarProductoFacturas;
	public JTextField jTextFieldcantidadBuscarProductoFacturas;
	public JButton jButtoncantidadBuscarProductoFacturasBusqueda= new JButtonMe();

	public JPanel jPanelprecioBuscarProductoFacturas;
	public JLabel jLabelprecioBuscarProductoFacturas;
	public JTextField jTextFieldprecioBuscarProductoFacturas;
	public JButton jButtonprecioBuscarProductoFacturasBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoBuscarProductoFacturas;
	public JLabel jLabeldescuentoBuscarProductoFacturas;
	public JTextField jTextFielddescuentoBuscarProductoFacturas;
	public JButton jButtondescuentoBuscarProductoFacturasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoBuscarProductoFacturas;
	public JLabel jLabelid_productoBuscarProductoFacturas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBuscarProductoFacturas;
	public JButton jButtonid_productoBuscarProductoFacturas= new JButtonMe();
	public JButton jButtonid_productoBuscarProductoFacturasUpdate= new JButtonMe();
	public JButton jButtonid_productoBuscarProductoFacturasBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaBuscarProductoFacturas;
	public JLabel jLabelid_empresaBuscarProductoFacturas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaBuscarProductoFacturas;
	public JButton jButtonid_empresaBuscarProductoFacturas= new JButtonMe();
	public JButton jButtonid_empresaBuscarProductoFacturasUpdate= new JButtonMe();
	public JButton jButtonid_empresaBuscarProductoFacturasBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalBuscarProductoFacturas;
	public JLabel jLabelid_sucursalBuscarProductoFacturas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalBuscarProductoFacturas;
	public JButton jButtonid_sucursalBuscarProductoFacturas= new JButtonMe();
	public JButton jButtonid_sucursalBuscarProductoFacturasUpdate= new JButtonMe();
	public JButton jButtonid_sucursalBuscarProductoFacturasBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteBuscarProductoFacturas;
	public JLabel jLabelid_clienteBuscarProductoFacturas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteBuscarProductoFacturas;
	public JButton jButtonid_clienteBuscarProductoFacturas= new JButtonMe();
	public JButton jButtonid_clienteBuscarProductoFacturasUpdate= new JButtonMe();
	public JButton jButtonid_clienteBuscarProductoFacturasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesBuscarProductoFacturas;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=792;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public BuscarProductoFacturasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposBuscarProductoFacturas=new JPanel();
				this.jPanelAccionesFormularioBuscarProductoFacturas=new JPanel();
				this.jmenuBarDetalleBuscarProductoFacturas=new JMenuBar();
				this.jTtoolBarDetalleBuscarProductoFacturas=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BuscarProductoFacturasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("BuscarProductoFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public BuscarProductoFacturasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("BuscarProductoFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BuscarProductoFacturasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BuscarProductoFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BuscarProductoFacturasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BuscarProductoFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BuscarProductoFacturasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("BuscarProductoFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarBuscarProductoFacturas() {
		return this.jButtonActualizarToolBarBuscarProductoFacturas;
	}
	
	public JButton getjButtonEliminarToolBarBuscarProductoFacturas() {
		return this.jButtonEliminarToolBarBuscarProductoFacturas;
	}
	
	public JButton getjButtonCancelarToolBarBuscarProductoFacturas() {
		return this.jButtonCancelarToolBarBuscarProductoFacturas;
	}		
	
	public JButton getjButtonProcesarInformacionBuscarProductoFacturas() {
		return this.jButtonProcesarInformacionBuscarProductoFacturas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBuscarProductoFacturas)	{
		this.jButtonProcesarInformacionBuscarProductoFacturas = jButtonProcesarInformacionBuscarProductoFacturas;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBuscarProductoFacturas() {
		return this.jComboBoxTiposAccionesBuscarProductoFacturas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBuscarProductoFacturas(
			JComboBox jComboBoxTiposRelacionesBuscarProductoFacturas) {
		this.jComboBoxTiposRelacionesBuscarProductoFacturas = jComboBoxTiposRelacionesBuscarProductoFacturas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBuscarProductoFacturas(
			JComboBox jComboBoxTiposAccionesBuscarProductoFacturas) {
		this.jComboBoxTiposAccionesBuscarProductoFacturas = jComboBoxTiposAccionesBuscarProductoFacturas;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioBuscarProductoFacturas() {
		return this.jComboBoxTiposAccionesFormularioBuscarProductoFacturas;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioBuscarProductoFacturas(
			JComboBox jComboBoxTiposAccionesFormularioBuscarProductoFacturas) {
		this.jComboBoxTiposAccionesFormularioBuscarProductoFacturas = jComboBoxTiposAccionesFormularioBuscarProductoFacturas;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.buscarproductofacturasSessionBean=new BuscarProductoFacturasSessionBean();
		
		this.buscarproductofacturasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.buscarproductofacturasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.buscarproductofacturasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BuscarProductoFacturasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BuscarProductoFacturasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BuscarProductoFacturasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Buscar Producto Facturas MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
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
	
		BuscarProductoFacturasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleBuscarProductoFacturas= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarBuscarProductoFacturas=new JButtonMe();
				this.jButtonModificarToolBarBuscarProductoFacturas=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarBuscarProductoFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarBuscarProductoFacturas,this.jTtoolBarDetalleBuscarProductoFacturas,
							"actualizar","actualizar","Actualizar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarBuscarProductoFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarBuscarProductoFacturas,this.jTtoolBarDetalleBuscarProductoFacturas,
							"eliminar","eliminar","Eliminar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarBuscarProductoFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarBuscarProductoFacturas,this.jTtoolBarDetalleBuscarProductoFacturas,
							"cancelar","cancelar","Cancelar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarBuscarProductoFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarBuscarProductoFacturas,this.jTtoolBarDetalleBuscarProductoFacturas,
							"guardarcambios","guardarcambios","Guardar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleBuscarProductoFacturas=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleBuscarProductoFacturas=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoBuscarProductoFacturas=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesBuscarProductoFacturas=new JMenuMe("Acciones");
		this.jmenuDetalleDatosBuscarProductoFacturas=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBuscarProductoFacturas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBuscarProductoFacturas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBuscarProductoFacturas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarBuscarProductoFacturas= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarBuscarProductoFacturas.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarBuscarProductoFacturas,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarBuscarProductoFacturas= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarBuscarProductoFacturas.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarBuscarProductoFacturas,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarBuscarProductoFacturas= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarBuscarProductoFacturas.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarBuscarProductoFacturas,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarBuscarProductoFacturas= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarBuscarProductoFacturas.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarBuscarProductoFacturas,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosBuscarProductoFacturas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBuscarProductoFacturas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBuscarProductoFacturas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBuscarProductoFacturas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBuscarProductoFacturas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBuscarProductoFacturas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarBuscarProductoFacturas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarBuscarProductoFacturas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarBuscarProductoFacturas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBuscarProductoFacturas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBuscarProductoFacturas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBuscarProductoFacturas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBuscarProductoFacturas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBuscarProductoFacturas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBuscarProductoFacturas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoBuscarProductoFacturas.add(this.jMenuItemDetalleCerrarBuscarProductoFacturas);
		
		this.jmenuDetalleAccionesBuscarProductoFacturas.add(this.jMenuItemActualizarBuscarProductoFacturas);
		this.jmenuDetalleAccionesBuscarProductoFacturas.add(this.jMenuItemEliminarBuscarProductoFacturas);
		this.jmenuDetalleAccionesBuscarProductoFacturas.add(this.jMenuItemCancelarBuscarProductoFacturas);		
		
		//this.jmenuDetalleDatosBuscarProductoFacturas.add(this.jMenuItemDetalleAbrirOrderByBuscarProductoFacturas);				
		this.jmenuDetalleDatosBuscarProductoFacturas.add(this.jMenuItemDetalleMostarOcultarBuscarProductoFacturas);				
				
		//this.jmenuDetalleAccionesBuscarProductoFacturas.add(this.jMenuItemGuardarCambiosBuscarProductoFacturas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleBuscarProductoFacturas.add(this.jmenuDetalleArchivoBuscarProductoFacturas);		
		this.jmenuBarDetalleBuscarProductoFacturas.add(this.jmenuDetalleAccionesBuscarProductoFacturas);		
		this.jmenuBarDetalleBuscarProductoFacturas.add(this.jmenuDetalleDatosBuscarProductoFacturas);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleBuscarProductoFacturas);				
	}
	
	
	public void inicializarElementosCamposBuscarProductoFacturas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdBuscarProductoFacturas = new JLabelMe();
		jLabelIdBuscarProductoFacturas.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidBuscarProductoFacturas = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidBuscarProductoFacturas.setToolTipText(BuscarProductoFacturasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutBuscarProductoFacturas= new GridBagLayout();

		this.jPanelidBuscarProductoFacturas.setLayout(this.gridaBagLayoutBuscarProductoFacturas);

		jLabelidBuscarProductoFacturas = new JLabel();
		jLabelidBuscarProductoFacturas.setText("Id");

		jLabelidBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_pre_impresoBuscarProductoFacturas = new JLabelMe();
		this.jLabelnumero_pre_impresoBuscarProductoFacturas.setText(""+BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESO+" : *");
		this.jLabelnumero_pre_impresoBuscarProductoFacturas.setToolTipText("Numero Pre Impreso");
		this.jLabelnumero_pre_impresoBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impresoBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impresoBuscarProductoFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impresoBuscarProductoFacturas.setToolTipText(BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		this.gridaBagLayoutBuscarProductoFacturas = new GridBagLayout();
		this.jPanelnumero_pre_impresoBuscarProductoFacturas.setLayout(this.gridaBagLayoutBuscarProductoFacturas);


		jTextFieldnumero_pre_impresoBuscarProductoFacturas= new JTextFieldMe();

		jTextFieldnumero_pre_impresoBuscarProductoFacturas.setEnabled(false);
		jTextFieldnumero_pre_impresoBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impresoBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impresoBuscarProductoFacturasBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impresoBuscarProductoFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoBuscarProductoFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoBuscarProductoFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impresoBuscarProductoFacturasBusqueda.setText("U");
		this.jButtonnumero_pre_impresoBuscarProductoFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impresoBuscarProductoFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impresoBuscarProductoFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impresoBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impresoBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impresoBuscarProductoFacturasBusqueda"));

		if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impresoBuscarProductoFacturasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_desdeBuscarProductoFacturas = new JLabelMe();
		this.jLabelfecha_emision_desdeBuscarProductoFacturas.setText(""+BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeBuscarProductoFacturas.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeBuscarProductoFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeBuscarProductoFacturas.setToolTipText(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutBuscarProductoFacturas = new GridBagLayout();
		this.jPanelfecha_emision_desdeBuscarProductoFacturas.setLayout(this.gridaBagLayoutBuscarProductoFacturas);


		//jFormattedTextFieldfecha_emision_desdeBuscarProductoFacturas= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeBuscarProductoFacturas= new JDateChooser();
		jDateChooserfecha_emision_desdeBuscarProductoFacturas.setEnabled(false);
		jDateChooserfecha_emision_desdeBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeBuscarProductoFacturas.setDate(new Date());
		jDateChooserfecha_emision_desdeBuscarProductoFacturas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeBuscarProductoFacturas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeBuscarProductoFacturasBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeBuscarProductoFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeBuscarProductoFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeBuscarProductoFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeBuscarProductoFacturasBusqueda.setText("U");
		this.jButtonfecha_emision_desdeBuscarProductoFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeBuscarProductoFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeBuscarProductoFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeBuscarProductoFacturasBusqueda"));

		if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeBuscarProductoFacturasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaBuscarProductoFacturas = new JLabelMe();
		this.jLabelfecha_emision_hastaBuscarProductoFacturas.setText(""+BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaBuscarProductoFacturas.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaBuscarProductoFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaBuscarProductoFacturas.setToolTipText(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutBuscarProductoFacturas = new GridBagLayout();
		this.jPanelfecha_emision_hastaBuscarProductoFacturas.setLayout(this.gridaBagLayoutBuscarProductoFacturas);


		//jFormattedTextFieldfecha_emision_hastaBuscarProductoFacturas= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaBuscarProductoFacturas= new JDateChooser();
		jDateChooserfecha_emision_hastaBuscarProductoFacturas.setEnabled(false);
		jDateChooserfecha_emision_hastaBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaBuscarProductoFacturas.setDate(new Date());
		jDateChooserfecha_emision_hastaBuscarProductoFacturas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaBuscarProductoFacturas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaBuscarProductoFacturasBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaBuscarProductoFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaBuscarProductoFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaBuscarProductoFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaBuscarProductoFacturasBusqueda.setText("U");
		this.jButtonfecha_emision_hastaBuscarProductoFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaBuscarProductoFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaBuscarProductoFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaBuscarProductoFacturasBusqueda"));

		if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaBuscarProductoFacturasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_vendedorBuscarProductoFacturas = new JLabelMe();
		this.jLabelnombre_vendedorBuscarProductoFacturas.setText(""+BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREVENDEDOR+" : *");
		this.jLabelnombre_vendedorBuscarProductoFacturas.setToolTipText("Nombre Vendedor");
		this.jLabelnombre_vendedorBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_vendedorBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_vendedorBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_vendedorBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_vendedorBuscarProductoFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_vendedorBuscarProductoFacturas.setToolTipText(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREVENDEDOR);
		this.gridaBagLayoutBuscarProductoFacturas = new GridBagLayout();
		this.jPanelnombre_vendedorBuscarProductoFacturas.setLayout(this.gridaBagLayoutBuscarProductoFacturas);


		jTextAreanombre_vendedorBuscarProductoFacturas= new JTextAreaMe();
		jTextAreanombre_vendedorBuscarProductoFacturas.setEnabled(false);
		jTextAreanombre_vendedorBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorBuscarProductoFacturas.setLineWrap(true);
		jTextAreanombre_vendedorBuscarProductoFacturas.setWrapStyleWord(true);
		jTextAreanombre_vendedorBuscarProductoFacturas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_vendedorBuscarProductoFacturas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_vendedorBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_vendedorBuscarProductoFacturas = new JScrollPane(jTextAreanombre_vendedorBuscarProductoFacturas);
		jscrollPanenombre_vendedorBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_vendedorBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_vendedorBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_vendedorBuscarProductoFacturasBusqueda= new JButtonMe();
		this.jButtonnombre_vendedorBuscarProductoFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_vendedorBuscarProductoFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_vendedorBuscarProductoFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_vendedorBuscarProductoFacturasBusqueda.setText("U");
		this.jButtonnombre_vendedorBuscarProductoFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_vendedorBuscarProductoFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_vendedorBuscarProductoFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_vendedorBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_vendedorBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_vendedorBuscarProductoFacturasBusqueda"));

		if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_vendedorBuscarProductoFacturasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_clienteBuscarProductoFacturas = new JLabelMe();
		this.jLabelnombre_completo_clienteBuscarProductoFacturas.setText(""+BuscarProductoFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+" : *");
		this.jLabelnombre_completo_clienteBuscarProductoFacturas.setToolTipText("Nombre Completo Cliente");
		this.jLabelnombre_completo_clienteBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_clienteBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_clienteBuscarProductoFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_clienteBuscarProductoFacturas.setToolTipText(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		this.gridaBagLayoutBuscarProductoFacturas = new GridBagLayout();
		this.jPanelnombre_completo_clienteBuscarProductoFacturas.setLayout(this.gridaBagLayoutBuscarProductoFacturas);


		jTextAreanombre_completo_clienteBuscarProductoFacturas= new JTextAreaMe();
		jTextAreanombre_completo_clienteBuscarProductoFacturas.setEnabled(false);
		jTextAreanombre_completo_clienteBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteBuscarProductoFacturas.setLineWrap(true);
		jTextAreanombre_completo_clienteBuscarProductoFacturas.setWrapStyleWord(true);
		jTextAreanombre_completo_clienteBuscarProductoFacturas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_clienteBuscarProductoFacturas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_clienteBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_clienteBuscarProductoFacturas = new JScrollPane(jTextAreanombre_completo_clienteBuscarProductoFacturas);
		jscrollPanenombre_completo_clienteBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completo_clienteBuscarProductoFacturasBusqueda= new JButtonMe();
		this.jButtonnombre_completo_clienteBuscarProductoFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteBuscarProductoFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteBuscarProductoFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_clienteBuscarProductoFacturasBusqueda.setText("U");
		this.jButtonnombre_completo_clienteBuscarProductoFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_clienteBuscarProductoFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_clienteBuscarProductoFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_clienteBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_clienteBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_clienteBuscarProductoFacturasBusqueda"));

		if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_clienteBuscarProductoFacturasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionBuscarProductoFacturas = new JLabelMe();
		this.jLabelfecha_emisionBuscarProductoFacturas.setText(""+BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionBuscarProductoFacturas.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionBuscarProductoFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionBuscarProductoFacturas.setToolTipText(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutBuscarProductoFacturas = new GridBagLayout();
		this.jPanelfecha_emisionBuscarProductoFacturas.setLayout(this.gridaBagLayoutBuscarProductoFacturas);


		//jFormattedTextFieldfecha_emisionBuscarProductoFacturas= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionBuscarProductoFacturas= new JDateChooser();
		jDateChooserfecha_emisionBuscarProductoFacturas.setEnabled(false);
		jDateChooserfecha_emisionBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionBuscarProductoFacturas.setDate(new Date());
		jDateChooserfecha_emisionBuscarProductoFacturas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionBuscarProductoFacturas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionBuscarProductoFacturasBusqueda= new JButtonMe();
		this.jButtonfecha_emisionBuscarProductoFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionBuscarProductoFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionBuscarProductoFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionBuscarProductoFacturasBusqueda.setText("U");
		this.jButtonfecha_emisionBuscarProductoFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionBuscarProductoFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionBuscarProductoFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionBuscarProductoFacturasBusqueda"));

		if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionBuscarProductoFacturasBusqueda.setVisible(false);		}


					
		this.jLabelnumero_pre_impreso_datoBuscarProductoFacturas = new JLabelMe();
		this.jLabelnumero_pre_impreso_datoBuscarProductoFacturas.setText(""+BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESODATO+" : *");
		this.jLabelnumero_pre_impreso_datoBuscarProductoFacturas.setToolTipText("Numero Pre Impreso Dato");
		this.jLabelnumero_pre_impreso_datoBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_pre_impreso_datoBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_pre_impreso_datoBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impreso_datoBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impreso_datoBuscarProductoFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impreso_datoBuscarProductoFacturas.setToolTipText(BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESODATO);
		this.gridaBagLayoutBuscarProductoFacturas = new GridBagLayout();
		this.jPanelnumero_pre_impreso_datoBuscarProductoFacturas.setLayout(this.gridaBagLayoutBuscarProductoFacturas);


		jTextFieldnumero_pre_impreso_datoBuscarProductoFacturas= new JTextFieldMe();

		jTextFieldnumero_pre_impreso_datoBuscarProductoFacturas.setEnabled(false);
		jTextFieldnumero_pre_impreso_datoBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impreso_datoBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impreso_datoBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impreso_datoBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impreso_datoBuscarProductoFacturasBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impreso_datoBuscarProductoFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impreso_datoBuscarProductoFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impreso_datoBuscarProductoFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impreso_datoBuscarProductoFacturasBusqueda.setText("U");
		this.jButtonnumero_pre_impreso_datoBuscarProductoFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impreso_datoBuscarProductoFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impreso_datoBuscarProductoFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impreso_datoBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impreso_datoBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impreso_datoBuscarProductoFacturasBusqueda"));

		if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impreso_datoBuscarProductoFacturasBusqueda.setVisible(false);		}


					
		this.jLabeltotalBuscarProductoFacturas = new JLabelMe();
		this.jLabeltotalBuscarProductoFacturas.setText(""+BuscarProductoFacturasConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalBuscarProductoFacturas.setToolTipText("Total");
		this.jLabeltotalBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalBuscarProductoFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalBuscarProductoFacturas.setToolTipText(BuscarProductoFacturasConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutBuscarProductoFacturas = new GridBagLayout();
		this.jPaneltotalBuscarProductoFacturas.setLayout(this.gridaBagLayoutBuscarProductoFacturas);


		jTextFieldtotalBuscarProductoFacturas= new JTextFieldMe();
		jTextFieldtotalBuscarProductoFacturas.setEnabled(false);
		jTextFieldtotalBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalBuscarProductoFacturas.setText("0.0");

		this.jButtontotalBuscarProductoFacturasBusqueda= new JButtonMe();
		this.jButtontotalBuscarProductoFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalBuscarProductoFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalBuscarProductoFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalBuscarProductoFacturasBusqueda.setText("U");
		this.jButtontotalBuscarProductoFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalBuscarProductoFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalBuscarProductoFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalBuscarProductoFacturasBusqueda"));

		if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalBuscarProductoFacturasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_unidadBuscarProductoFacturas = new JLabelMe();
		this.jLabelnombre_unidadBuscarProductoFacturas.setText(""+BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREUNIDAD+" : *");
		this.jLabelnombre_unidadBuscarProductoFacturas.setToolTipText("Nombre Unidad");
		this.jLabelnombre_unidadBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_unidadBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_unidadBuscarProductoFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_unidadBuscarProductoFacturas.setToolTipText(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREUNIDAD);
		this.gridaBagLayoutBuscarProductoFacturas = new GridBagLayout();
		this.jPanelnombre_unidadBuscarProductoFacturas.setLayout(this.gridaBagLayoutBuscarProductoFacturas);


		jTextFieldnombre_unidadBuscarProductoFacturas= new JTextFieldMe();

		jTextFieldnombre_unidadBuscarProductoFacturas.setEnabled(false);
		jTextFieldnombre_unidadBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_unidadBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_unidadBuscarProductoFacturasBusqueda= new JButtonMe();
		this.jButtonnombre_unidadBuscarProductoFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadBuscarProductoFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadBuscarProductoFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_unidadBuscarProductoFacturasBusqueda.setText("U");
		this.jButtonnombre_unidadBuscarProductoFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_unidadBuscarProductoFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_unidadBuscarProductoFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_unidadBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_unidadBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_unidadBuscarProductoFacturasBusqueda"));

		if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_unidadBuscarProductoFacturasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_bodegaBuscarProductoFacturas = new JLabelMe();
		this.jLabelnombre_bodegaBuscarProductoFacturas.setText(""+BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREBODEGA+" : *");
		this.jLabelnombre_bodegaBuscarProductoFacturas.setToolTipText("Nombre Bodega");
		this.jLabelnombre_bodegaBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_bodegaBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_bodegaBuscarProductoFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_bodegaBuscarProductoFacturas.setToolTipText(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREBODEGA);
		this.gridaBagLayoutBuscarProductoFacturas = new GridBagLayout();
		this.jPanelnombre_bodegaBuscarProductoFacturas.setLayout(this.gridaBagLayoutBuscarProductoFacturas);


		jTextAreanombre_bodegaBuscarProductoFacturas= new JTextAreaMe();
		jTextAreanombre_bodegaBuscarProductoFacturas.setEnabled(false);
		jTextAreanombre_bodegaBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaBuscarProductoFacturas.setLineWrap(true);
		jTextAreanombre_bodegaBuscarProductoFacturas.setWrapStyleWord(true);
		jTextAreanombre_bodegaBuscarProductoFacturas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_bodegaBuscarProductoFacturas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_bodegaBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_bodegaBuscarProductoFacturas = new JScrollPane(jTextAreanombre_bodegaBuscarProductoFacturas);
		jscrollPanenombre_bodegaBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodegaBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodegaBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_bodegaBuscarProductoFacturasBusqueda= new JButtonMe();
		this.jButtonnombre_bodegaBuscarProductoFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaBuscarProductoFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaBuscarProductoFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_bodegaBuscarProductoFacturasBusqueda.setText("U");
		this.jButtonnombre_bodegaBuscarProductoFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_bodegaBuscarProductoFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_bodegaBuscarProductoFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_bodegaBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_bodegaBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_bodegaBuscarProductoFacturasBusqueda"));

		if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_bodegaBuscarProductoFacturasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoBuscarProductoFacturas = new JLabelMe();
		this.jLabelnombre_productoBuscarProductoFacturas.setText(""+BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoBuscarProductoFacturas.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoBuscarProductoFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoBuscarProductoFacturas.setToolTipText(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutBuscarProductoFacturas = new GridBagLayout();
		this.jPanelnombre_productoBuscarProductoFacturas.setLayout(this.gridaBagLayoutBuscarProductoFacturas);


		jTextAreanombre_productoBuscarProductoFacturas= new JTextAreaMe();
		jTextAreanombre_productoBuscarProductoFacturas.setEnabled(false);
		jTextAreanombre_productoBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoBuscarProductoFacturas.setLineWrap(true);
		jTextAreanombre_productoBuscarProductoFacturas.setWrapStyleWord(true);
		jTextAreanombre_productoBuscarProductoFacturas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoBuscarProductoFacturas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoBuscarProductoFacturas = new JScrollPane(jTextAreanombre_productoBuscarProductoFacturas);
		jscrollPanenombre_productoBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_productoBuscarProductoFacturasBusqueda= new JButtonMe();
		this.jButtonnombre_productoBuscarProductoFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoBuscarProductoFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoBuscarProductoFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoBuscarProductoFacturasBusqueda.setText("U");
		this.jButtonnombre_productoBuscarProductoFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoBuscarProductoFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoBuscarProductoFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoBuscarProductoFacturasBusqueda"));

		if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoBuscarProductoFacturasBusqueda.setVisible(false);		}


					
		this.jLabelcantidadBuscarProductoFacturas = new JLabelMe();
		this.jLabelcantidadBuscarProductoFacturas.setText(""+BuscarProductoFacturasConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadBuscarProductoFacturas.setToolTipText("Cantidad");
		this.jLabelcantidadBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadBuscarProductoFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadBuscarProductoFacturas.setToolTipText(BuscarProductoFacturasConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutBuscarProductoFacturas = new GridBagLayout();
		this.jPanelcantidadBuscarProductoFacturas.setLayout(this.gridaBagLayoutBuscarProductoFacturas);


		jTextFieldcantidadBuscarProductoFacturas= new JTextFieldMe();
		jTextFieldcantidadBuscarProductoFacturas.setEnabled(false);
		jTextFieldcantidadBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadBuscarProductoFacturas.setText("0");

		this.jButtoncantidadBuscarProductoFacturasBusqueda= new JButtonMe();
		this.jButtoncantidadBuscarProductoFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadBuscarProductoFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadBuscarProductoFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadBuscarProductoFacturasBusqueda.setText("U");
		this.jButtoncantidadBuscarProductoFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadBuscarProductoFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadBuscarProductoFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadBuscarProductoFacturasBusqueda"));

		if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadBuscarProductoFacturasBusqueda.setVisible(false);		}


					
		this.jLabelprecioBuscarProductoFacturas = new JLabelMe();
		this.jLabelprecioBuscarProductoFacturas.setText(""+BuscarProductoFacturasConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioBuscarProductoFacturas.setToolTipText("Precio");
		this.jLabelprecioBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioBuscarProductoFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioBuscarProductoFacturas.setToolTipText(BuscarProductoFacturasConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutBuscarProductoFacturas = new GridBagLayout();
		this.jPanelprecioBuscarProductoFacturas.setLayout(this.gridaBagLayoutBuscarProductoFacturas);


		jTextFieldprecioBuscarProductoFacturas= new JTextFieldMe();
		jTextFieldprecioBuscarProductoFacturas.setEnabled(false);
		jTextFieldprecioBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioBuscarProductoFacturas.setText("0.0");

		this.jButtonprecioBuscarProductoFacturasBusqueda= new JButtonMe();
		this.jButtonprecioBuscarProductoFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioBuscarProductoFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioBuscarProductoFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioBuscarProductoFacturasBusqueda.setText("U");
		this.jButtonprecioBuscarProductoFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioBuscarProductoFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioBuscarProductoFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioBuscarProductoFacturasBusqueda"));

		if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioBuscarProductoFacturasBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoBuscarProductoFacturas = new JLabelMe();
		this.jLabeldescuentoBuscarProductoFacturas.setText(""+BuscarProductoFacturasConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoBuscarProductoFacturas.setToolTipText("Descuento");
		this.jLabeldescuentoBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoBuscarProductoFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoBuscarProductoFacturas.setToolTipText(BuscarProductoFacturasConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutBuscarProductoFacturas = new GridBagLayout();
		this.jPaneldescuentoBuscarProductoFacturas.setLayout(this.gridaBagLayoutBuscarProductoFacturas);


		jTextFielddescuentoBuscarProductoFacturas= new JTextFieldMe();
		jTextFielddescuentoBuscarProductoFacturas.setEnabled(false);
		jTextFielddescuentoBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoBuscarProductoFacturas.setText("0.0");

		this.jButtondescuentoBuscarProductoFacturasBusqueda= new JButtonMe();
		this.jButtondescuentoBuscarProductoFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoBuscarProductoFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoBuscarProductoFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoBuscarProductoFacturasBusqueda.setText("U");
		this.jButtondescuentoBuscarProductoFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoBuscarProductoFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoBuscarProductoFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoBuscarProductoFacturasBusqueda"));

		if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoBuscarProductoFacturasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysBuscarProductoFacturas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_productoBuscarProductoFacturas = new JLabelMe();
		this.jLabelid_productoBuscarProductoFacturas.setText(""+BuscarProductoFacturasConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoBuscarProductoFacturas.setToolTipText("Producto");
		this.jLabelid_productoBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoBuscarProductoFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoBuscarProductoFacturas.setToolTipText(BuscarProductoFacturasConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutBuscarProductoFacturas = new GridBagLayout();
		this.jPanelid_productoBuscarProductoFacturas.setLayout(this.gridaBagLayoutBuscarProductoFacturas);


		jComboBoxid_productoBuscarProductoFacturas= new JComboBoxMe();
		jComboBoxid_productoBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoBuscarProductoFacturas= new JButtonMe();
		this.jButtonid_productoBuscarProductoFacturas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoBuscarProductoFacturas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoBuscarProductoFacturas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoBuscarProductoFacturas.setText("Buscar");
		this.jButtonid_productoBuscarProductoFacturas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoBuscarProductoFacturas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoBuscarProductoFacturas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoBuscarProductoFacturas"));

		this.jButtonid_productoBuscarProductoFacturasBusqueda= new JButtonMe();
		this.jButtonid_productoBuscarProductoFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoBuscarProductoFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoBuscarProductoFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoBuscarProductoFacturasBusqueda.setText("U");
		this.jButtonid_productoBuscarProductoFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoBuscarProductoFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoBuscarProductoFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoBuscarProductoFacturasBusqueda"));

		if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoBuscarProductoFacturasBusqueda.setVisible(false);		}

		this.jButtonid_productoBuscarProductoFacturasUpdate= new JButtonMe();
		this.jButtonid_productoBuscarProductoFacturasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoBuscarProductoFacturasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoBuscarProductoFacturasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoBuscarProductoFacturasUpdate.setText("U");
		this.jButtonid_productoBuscarProductoFacturasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoBuscarProductoFacturasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoBuscarProductoFacturasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoBuscarProductoFacturasUpdate"));



					
		this.jLabelid_empresaBuscarProductoFacturas = new JLabelMe();
		this.jLabelid_empresaBuscarProductoFacturas.setText(""+BuscarProductoFacturasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaBuscarProductoFacturas.setToolTipText("Empresa");
		this.jLabelid_empresaBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaBuscarProductoFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaBuscarProductoFacturas.setToolTipText(BuscarProductoFacturasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutBuscarProductoFacturas = new GridBagLayout();
		this.jPanelid_empresaBuscarProductoFacturas.setLayout(this.gridaBagLayoutBuscarProductoFacturas);


		jComboBoxid_empresaBuscarProductoFacturas= new JComboBoxMe();
		jComboBoxid_empresaBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaBuscarProductoFacturas.setEnabled(false);

		this.jButtonid_empresaBuscarProductoFacturas= new JButtonMe();
		this.jButtonid_empresaBuscarProductoFacturas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBuscarProductoFacturas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBuscarProductoFacturas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBuscarProductoFacturas.setText("Buscar");
		this.jButtonid_empresaBuscarProductoFacturas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaBuscarProductoFacturas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBuscarProductoFacturas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBuscarProductoFacturas"));

		this.jButtonid_empresaBuscarProductoFacturasBusqueda= new JButtonMe();
		this.jButtonid_empresaBuscarProductoFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBuscarProductoFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBuscarProductoFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBuscarProductoFacturasBusqueda.setText("U");
		this.jButtonid_empresaBuscarProductoFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaBuscarProductoFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBuscarProductoFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBuscarProductoFacturasBusqueda"));

		if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaBuscarProductoFacturasBusqueda.setVisible(false);		}

		this.jButtonid_empresaBuscarProductoFacturasUpdate= new JButtonMe();
		this.jButtonid_empresaBuscarProductoFacturasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBuscarProductoFacturasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBuscarProductoFacturasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBuscarProductoFacturasUpdate.setText("U");
		this.jButtonid_empresaBuscarProductoFacturasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaBuscarProductoFacturasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBuscarProductoFacturasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBuscarProductoFacturasUpdate"));



					
		this.jLabelid_sucursalBuscarProductoFacturas = new JLabelMe();
		this.jLabelid_sucursalBuscarProductoFacturas.setText(""+BuscarProductoFacturasConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalBuscarProductoFacturas.setToolTipText("Sucursal");
		this.jLabelid_sucursalBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalBuscarProductoFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalBuscarProductoFacturas.setToolTipText(BuscarProductoFacturasConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutBuscarProductoFacturas = new GridBagLayout();
		this.jPanelid_sucursalBuscarProductoFacturas.setLayout(this.gridaBagLayoutBuscarProductoFacturas);


		jComboBoxid_sucursalBuscarProductoFacturas= new JComboBoxMe();
		jComboBoxid_sucursalBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalBuscarProductoFacturas.setEnabled(false);

		this.jButtonid_sucursalBuscarProductoFacturas= new JButtonMe();
		this.jButtonid_sucursalBuscarProductoFacturas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalBuscarProductoFacturas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalBuscarProductoFacturas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalBuscarProductoFacturas.setText("Buscar");
		this.jButtonid_sucursalBuscarProductoFacturas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalBuscarProductoFacturas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalBuscarProductoFacturas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalBuscarProductoFacturas"));

		this.jButtonid_sucursalBuscarProductoFacturasBusqueda= new JButtonMe();
		this.jButtonid_sucursalBuscarProductoFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBuscarProductoFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBuscarProductoFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalBuscarProductoFacturasBusqueda.setText("U");
		this.jButtonid_sucursalBuscarProductoFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalBuscarProductoFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalBuscarProductoFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalBuscarProductoFacturasBusqueda"));

		if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalBuscarProductoFacturasBusqueda.setVisible(false);		}

		this.jButtonid_sucursalBuscarProductoFacturasUpdate= new JButtonMe();
		this.jButtonid_sucursalBuscarProductoFacturasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBuscarProductoFacturasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBuscarProductoFacturasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalBuscarProductoFacturasUpdate.setText("U");
		this.jButtonid_sucursalBuscarProductoFacturasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalBuscarProductoFacturasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalBuscarProductoFacturasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalBuscarProductoFacturasUpdate"));



					
		this.jLabelid_clienteBuscarProductoFacturas = new JLabelMe();
		this.jLabelid_clienteBuscarProductoFacturas.setText(""+BuscarProductoFacturasConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteBuscarProductoFacturas.setToolTipText("Cliente");
		this.jLabelid_clienteBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteBuscarProductoFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteBuscarProductoFacturas.setToolTipText(BuscarProductoFacturasConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutBuscarProductoFacturas = new GridBagLayout();
		this.jPanelid_clienteBuscarProductoFacturas.setLayout(this.gridaBagLayoutBuscarProductoFacturas);


		jComboBoxid_clienteBuscarProductoFacturas= new JComboBoxMe();
		jComboBoxid_clienteBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteBuscarProductoFacturas= new JButtonMe();
		this.jButtonid_clienteBuscarProductoFacturas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteBuscarProductoFacturas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteBuscarProductoFacturas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteBuscarProductoFacturas.setText("Buscar");
		this.jButtonid_clienteBuscarProductoFacturas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteBuscarProductoFacturas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteBuscarProductoFacturas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteBuscarProductoFacturas"));

		this.jButtonid_clienteBuscarProductoFacturasBusqueda= new JButtonMe();
		this.jButtonid_clienteBuscarProductoFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteBuscarProductoFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteBuscarProductoFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteBuscarProductoFacturasBusqueda.setText("U");
		this.jButtonid_clienteBuscarProductoFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteBuscarProductoFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteBuscarProductoFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteBuscarProductoFacturasBusqueda"));

		if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteBuscarProductoFacturasBusqueda.setVisible(false);		}

		this.jButtonid_clienteBuscarProductoFacturasUpdate= new JButtonMe();
		this.jButtonid_clienteBuscarProductoFacturasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteBuscarProductoFacturasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteBuscarProductoFacturasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteBuscarProductoFacturasUpdate.setText("U");
		this.jButtonid_clienteBuscarProductoFacturasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteBuscarProductoFacturasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteBuscarProductoFacturasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteBuscarProductoFacturasUpdate"));



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
		//this.jInternalFrameDetalleBuscarProductoFacturas = new BuscarProductoFacturasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Buscar Producto Facturas DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBuscarProductoFacturas= new GridBagLayout();
		

		
		String sToolTipBuscarProductoFacturas="";
		sToolTipBuscarProductoFacturas=BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBuscarProductoFacturas+="(Facturacion.BuscarProductoFacturas)";
		}
		
		if(!this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
			sToolTipBuscarProductoFacturas+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoBuscarProductoFacturas = new JButtonMe();
		this.jButtonModificarBuscarProductoFacturas = new JButtonMe();
        this.jButtonActualizarBuscarProductoFacturas = new JButtonMe();
        this.jButtonEliminarBuscarProductoFacturas = new JButtonMe();
        this.jButtonCancelarBuscarProductoFacturas = new JButtonMe();
        this.jButtonGuardarCambiosBuscarProductoFacturas = new JButtonMe();
		this.jButtonGuardarCambiosTablaBuscarProductoFacturas = new JButtonMe();
		this.jButtonCerrarBuscarProductoFacturas = new JButtonMe();
		
		this.jScrollPanelDatosBuscarProductoFacturas = new JScrollPane();   
        this.jScrollPanelDatosEdicionBuscarProductoFacturas = new JScrollPane();
		this.jScrollPanelDatosGeneralBuscarProductoFacturas = new JScrollPane();
				
		
		
		this.jPanelCamposBuscarProductoFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosBuscarProductoFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesBuscarProductoFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioBuscarProductoFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Buscar Producto Facturas";
		
		if(!this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Buscar Producto Facturases" + this.sPath));
		} else {
			this.jScrollPanelDatosBuscarProductoFacturas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposBuscarProductoFacturas.setName("jPanelCamposBuscarProductoFacturas"); 

		this.jPanelCamposOcultosBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosBuscarProductoFacturas.setName("jPanelCamposOcultosBuscarProductoFacturas"); 

        this.jPanelAccionesBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBuscarProductoFacturas.setToolTipText("Acciones");
        this.jPanelAccionesBuscarProductoFacturas.setName("Acciones"); 

		this.jPanelAccionesFormularioBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioBuscarProductoFacturas.setToolTipText("Acciones");
        this.jPanelAccionesFormularioBuscarProductoFacturas.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoBuscarProductoFacturas.setText("Nuevo");
		this.jButtonModificarBuscarProductoFacturas.setText("Editar");
        this.jButtonActualizarBuscarProductoFacturas.setText("Actualizar");
        this.jButtonEliminarBuscarProductoFacturas.setText("Eliminar");
        this.jButtonCancelarBuscarProductoFacturas.setText("Cancelar");
        this.jButtonGuardarCambiosBuscarProductoFacturas.setText("Guardar");
		this.jButtonGuardarCambiosTablaBuscarProductoFacturas.setText("Guardar");
		this.jButtonCerrarBuscarProductoFacturas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBuscarProductoFacturas,"nuevo_button","Nuevo",this.buscarproductofacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarBuscarProductoFacturas,"modificar_button","Editar",this.buscarproductofacturasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarBuscarProductoFacturas,"actualizar_button","Actualizar",this.buscarproductofacturasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarBuscarProductoFacturas,"eliminar_button","Eliminar",this.buscarproductofacturasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarBuscarProductoFacturas,"cancelar_button","Cancelar",this.buscarproductofacturasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosBuscarProductoFacturas,"guardarcambios_button","Guardar",this.buscarproductofacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBuscarProductoFacturas,"guardarcambiostabla_button","Guardar",this.buscarproductofacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBuscarProductoFacturas,"cerrar_button","Salir",this.buscarproductofacturasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoBuscarProductoFacturas.setToolTipText("Nuevo"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarBuscarProductoFacturas.setToolTipText("Editar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarBuscarProductoFacturas.setToolTipText("Actualizar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarBuscarProductoFacturas.setToolTipText("Eliminar)"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarBuscarProductoFacturas.setToolTipText("Cancelar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosBuscarProductoFacturas.setToolTipText("Guardar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaBuscarProductoFacturas.setToolTipText("Guardar"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBuscarProductoFacturas.setToolTipText("Salir"+" "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBuscarProductoFacturas";
		inputMap = this.jButtonNuevoBuscarProductoFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBuscarProductoFacturas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBuscarProductoFacturas"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarBuscarProductoFacturas";
		inputMap = this.jButtonActualizarBuscarProductoFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarBuscarProductoFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarBuscarProductoFacturas"));
		
		//ELIMINAR
		sMapKey = "EliminarBuscarProductoFacturas";
		inputMap = this.jButtonEliminarBuscarProductoFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarBuscarProductoFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarBuscarProductoFacturas"));
		
		//CANCELAR	
		sMapKey = "CancelarBuscarProductoFacturas";
		inputMap = this.jButtonCancelarBuscarProductoFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarBuscarProductoFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarBuscarProductoFacturas"));
		
		//CERRAR		
		sMapKey = "CerrarBuscarProductoFacturas";
		inputMap = this.jButtonCerrarBuscarProductoFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBuscarProductoFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBuscarProductoFacturas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBuscarProductoFacturas";
		inputMap = this.jButtonGuardarCambiosTablaBuscarProductoFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBuscarProductoFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBuscarProductoFacturas"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoBuscarProductoFacturas = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoBuscarProductoFacturas.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoBuscarProductoFacturas.setToolTipText("Nuevo BuscarProductoFacturas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarBuscarProductoFacturas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarBuscarProductoFacturas.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarBuscarProductoFacturas.setToolTipText("Sin Cerrar Ventana BuscarProductoFacturas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeBuscarProductoFacturas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeBuscarProductoFacturas.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeBuscarProductoFacturas.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesBuscarProductoFacturas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBuscarProductoFacturas.setText("Accion");
		this.jComboBoxTiposAccionesBuscarProductoFacturas.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioBuscarProductoFacturas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioBuscarProductoFacturas.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioBuscarProductoFacturas.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesBuscarProductoFacturas = new JLabelMe();
		
		this.jLabelAccionesBuscarProductoFacturas.setText("Acciones");		
		this.jLabelAccionesBuscarProductoFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBuscarProductoFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBuscarProductoFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposBuscarProductoFacturas();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysBuscarProductoFacturas();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesBuscarProductoFacturas=new JTabbedPane();
		this.jTabbedPaneRelacionesBuscarProductoFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesBuscarProductoFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesBuscarProductoFacturas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBuscarProductoFacturas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBuscarProductoFacturas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioBuscarProductoFacturas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBuscarProductoFacturas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBuscarProductoFacturas.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioBuscarProductoFacturas, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposBuscarProductoFacturas = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosBuscarProductoFacturas = new GridBagLayout();
		
		this.jPanelCamposBuscarProductoFacturas.setLayout(gridaBagLayoutCamposBuscarProductoFacturas);
		this.jPanelCamposOcultosBuscarProductoFacturas.setLayout(gridaBagLayoutCamposOcultosBuscarProductoFacturas);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidBuscarProductoFacturas.add(jLabelIdBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 1;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidBuscarProductoFacturas.add(jLabelidBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);


	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoBuscarProductoFacturas.add(jLabelid_productoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		//this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 2;
		this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
		this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoBuscarProductoFacturas.add(jButtonid_productoBuscarProductoFacturasBusqueda, this.gridBagConstraintsBuscarProductoFacturas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		//this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 3;
		this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
		this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoBuscarProductoFacturas.add(jButtonid_productoBuscarProductoFacturasUpdate, this.gridBagConstraintsBuscarProductoFacturas);
	}

	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 1;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoBuscarProductoFacturas.add(jComboBoxid_productoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);


	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaBuscarProductoFacturas.add(jLabelid_empresaBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		//this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 2;
		this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
		this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBuscarProductoFacturas.add(jButtonid_empresaBuscarProductoFacturasBusqueda, this.gridBagConstraintsBuscarProductoFacturas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		//this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 3;
		this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
		this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBuscarProductoFacturas.add(jButtonid_empresaBuscarProductoFacturasUpdate, this.gridBagConstraintsBuscarProductoFacturas);
	}

	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 1;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaBuscarProductoFacturas.add(jComboBoxid_empresaBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);


	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalBuscarProductoFacturas.add(jLabelid_sucursalBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		//this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 2;
		this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
		this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalBuscarProductoFacturas.add(jButtonid_sucursalBuscarProductoFacturasBusqueda, this.gridBagConstraintsBuscarProductoFacturas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		//this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 3;
		this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
		this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalBuscarProductoFacturas.add(jButtonid_sucursalBuscarProductoFacturasUpdate, this.gridBagConstraintsBuscarProductoFacturas);
	}

	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 1;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalBuscarProductoFacturas.add(jComboBoxid_sucursalBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);


	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteBuscarProductoFacturas.add(jLabelid_clienteBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		//this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 2;
		this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
		this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteBuscarProductoFacturas.add(jButtonid_clienteBuscarProductoFacturasBusqueda, this.gridBagConstraintsBuscarProductoFacturas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		//this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 3;
		this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
		this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteBuscarProductoFacturas.add(jButtonid_clienteBuscarProductoFacturasUpdate, this.gridBagConstraintsBuscarProductoFacturas);
	}

	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 1;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteBuscarProductoFacturas.add(jComboBoxid_clienteBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);


	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impresoBuscarProductoFacturas.add(jLabelnumero_pre_impresoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		//this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 2;
		this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
		this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impresoBuscarProductoFacturas.add(jButtonnumero_pre_impresoBuscarProductoFacturasBusqueda, this.gridBagConstraintsBuscarProductoFacturas);
	}

	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 1;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impresoBuscarProductoFacturas.add(jTextFieldnumero_pre_impresoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);


	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeBuscarProductoFacturas.add(jLabelfecha_emision_desdeBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		//this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 2;
		this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
		this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeBuscarProductoFacturas.add(jButtonfecha_emision_desdeBuscarProductoFacturasBusqueda, this.gridBagConstraintsBuscarProductoFacturas);
	}

	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 1;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeBuscarProductoFacturas.add(jDateChooserfecha_emision_desdeBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);


	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaBuscarProductoFacturas.add(jLabelfecha_emision_hastaBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		//this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 2;
		this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
		this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaBuscarProductoFacturas.add(jButtonfecha_emision_hastaBuscarProductoFacturasBusqueda, this.gridBagConstraintsBuscarProductoFacturas);
	}

	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 1;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaBuscarProductoFacturas.add(jDateChooserfecha_emision_hastaBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);


	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_vendedorBuscarProductoFacturas.add(jLabelnombre_vendedorBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		//this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 2;
		this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
		this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_vendedorBuscarProductoFacturas.add(jButtonnombre_vendedorBuscarProductoFacturasBusqueda, this.gridBagConstraintsBuscarProductoFacturas);
	}

	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 1;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_vendedorBuscarProductoFacturas.add(jscrollPanenombre_vendedorBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);


	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_clienteBuscarProductoFacturas.add(jLabelnombre_completo_clienteBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		//this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 2;
		this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
		this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_clienteBuscarProductoFacturas.add(jButtonnombre_completo_clienteBuscarProductoFacturasBusqueda, this.gridBagConstraintsBuscarProductoFacturas);
	}

	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 1;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_clienteBuscarProductoFacturas.add(jscrollPanenombre_completo_clienteBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);


	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionBuscarProductoFacturas.add(jLabelfecha_emisionBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		//this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 2;
		this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
		this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionBuscarProductoFacturas.add(jButtonfecha_emisionBuscarProductoFacturasBusqueda, this.gridBagConstraintsBuscarProductoFacturas);
	}

	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 1;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionBuscarProductoFacturas.add(jDateChooserfecha_emisionBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);


	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impreso_datoBuscarProductoFacturas.add(jLabelnumero_pre_impreso_datoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		//this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 2;
		this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
		this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impreso_datoBuscarProductoFacturas.add(jButtonnumero_pre_impreso_datoBuscarProductoFacturasBusqueda, this.gridBagConstraintsBuscarProductoFacturas);
	}

	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 1;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impreso_datoBuscarProductoFacturas.add(jTextFieldnumero_pre_impreso_datoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);


	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalBuscarProductoFacturas.add(jLabeltotalBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		//this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 2;
		this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
		this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalBuscarProductoFacturas.add(jButtontotalBuscarProductoFacturasBusqueda, this.gridBagConstraintsBuscarProductoFacturas);
	}

	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 1;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalBuscarProductoFacturas.add(jTextFieldtotalBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);


	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_unidadBuscarProductoFacturas.add(jLabelnombre_unidadBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		//this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 2;
		this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
		this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_unidadBuscarProductoFacturas.add(jButtonnombre_unidadBuscarProductoFacturasBusqueda, this.gridBagConstraintsBuscarProductoFacturas);
	}

	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 1;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_unidadBuscarProductoFacturas.add(jTextFieldnombre_unidadBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);


	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_bodegaBuscarProductoFacturas.add(jLabelnombre_bodegaBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		//this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 2;
		this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
		this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_bodegaBuscarProductoFacturas.add(jButtonnombre_bodegaBuscarProductoFacturasBusqueda, this.gridBagConstraintsBuscarProductoFacturas);
	}

	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 1;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_bodegaBuscarProductoFacturas.add(jscrollPanenombre_bodegaBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);


	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoBuscarProductoFacturas.add(jLabelnombre_productoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		//this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 2;
		this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
		this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoBuscarProductoFacturas.add(jButtonnombre_productoBuscarProductoFacturasBusqueda, this.gridBagConstraintsBuscarProductoFacturas);
	}

	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 1;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoBuscarProductoFacturas.add(jscrollPanenombre_productoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);


	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadBuscarProductoFacturas.add(jLabelcantidadBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		//this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 2;
		this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
		this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadBuscarProductoFacturas.add(jButtoncantidadBuscarProductoFacturasBusqueda, this.gridBagConstraintsBuscarProductoFacturas);
	}

	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 1;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadBuscarProductoFacturas.add(jTextFieldcantidadBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);


	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioBuscarProductoFacturas.add(jLabelprecioBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		//this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 2;
		this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
		this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioBuscarProductoFacturas.add(jButtonprecioBuscarProductoFacturasBusqueda, this.gridBagConstraintsBuscarProductoFacturas);
	}

	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 1;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioBuscarProductoFacturas.add(jTextFieldprecioBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);


	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoBuscarProductoFacturas.add(jLabeldescuentoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		//this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 2;
		this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
		this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoBuscarProductoFacturas.add(jButtondescuentoBuscarProductoFacturasBusqueda, this.gridBagConstraintsBuscarProductoFacturas);
	}

	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = 1;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoBuscarProductoFacturas.add(jTextFielddescuentoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = iYPanelCamposBuscarProductoFacturas;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = iXPanelCamposBuscarProductoFacturas++;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBuscarProductoFacturas.add(this.jPanelidBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(iXPanelCamposBuscarProductoFacturas % 2==0) {
		iXPanelCamposBuscarProductoFacturas=0;
		iYPanelCamposBuscarProductoFacturas++;
	}
	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = iYPanelCamposBuscarProductoFacturas;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = iXPanelCamposBuscarProductoFacturas++;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBuscarProductoFacturas.add(this.jPanelid_productoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(iXPanelCamposBuscarProductoFacturas % 2==0) {
		iXPanelCamposBuscarProductoFacturas=0;
		iYPanelCamposBuscarProductoFacturas++;
	}
	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = iYPanelCamposBuscarProductoFacturas;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = iXPanelCamposBuscarProductoFacturas++;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBuscarProductoFacturas.add(this.jPanelid_clienteBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(iXPanelCamposBuscarProductoFacturas % 2==0) {
		iXPanelCamposBuscarProductoFacturas=0;
		iYPanelCamposBuscarProductoFacturas++;
	}
	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = iYPanelCamposBuscarProductoFacturas;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = iXPanelCamposBuscarProductoFacturas++;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBuscarProductoFacturas.add(this.jPanelnumero_pre_impresoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(iXPanelCamposBuscarProductoFacturas % 2==0) {
		iXPanelCamposBuscarProductoFacturas=0;
		iYPanelCamposBuscarProductoFacturas++;
	}
	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = iYPanelCamposBuscarProductoFacturas;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = iXPanelCamposBuscarProductoFacturas++;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBuscarProductoFacturas.add(this.jPanelfecha_emision_desdeBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(iXPanelCamposBuscarProductoFacturas % 2==0) {
		iXPanelCamposBuscarProductoFacturas=0;
		iYPanelCamposBuscarProductoFacturas++;
	}
	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = iYPanelCamposBuscarProductoFacturas;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = iXPanelCamposBuscarProductoFacturas++;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBuscarProductoFacturas.add(this.jPanelfecha_emision_hastaBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(iXPanelCamposBuscarProductoFacturas % 2==0) {
		iXPanelCamposBuscarProductoFacturas=0;
		iYPanelCamposBuscarProductoFacturas++;
	}
	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = iYPanelCamposBuscarProductoFacturas;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = iXPanelCamposBuscarProductoFacturas++;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBuscarProductoFacturas.add(this.jPanelnombre_vendedorBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(iXPanelCamposBuscarProductoFacturas % 2==0) {
		iXPanelCamposBuscarProductoFacturas=0;
		iYPanelCamposBuscarProductoFacturas++;
	}
	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = iYPanelCamposBuscarProductoFacturas;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = iXPanelCamposBuscarProductoFacturas++;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBuscarProductoFacturas.add(this.jPanelnombre_completo_clienteBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(iXPanelCamposBuscarProductoFacturas % 2==0) {
		iXPanelCamposBuscarProductoFacturas=0;
		iYPanelCamposBuscarProductoFacturas++;
	}
	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = iYPanelCamposBuscarProductoFacturas;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = iXPanelCamposBuscarProductoFacturas++;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBuscarProductoFacturas.add(this.jPanelfecha_emisionBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(iXPanelCamposBuscarProductoFacturas % 2==0) {
		iXPanelCamposBuscarProductoFacturas=0;
		iYPanelCamposBuscarProductoFacturas++;
	}
	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = iYPanelCamposBuscarProductoFacturas;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = iXPanelCamposBuscarProductoFacturas++;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBuscarProductoFacturas.add(this.jPanelnumero_pre_impreso_datoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(iXPanelCamposBuscarProductoFacturas % 2==0) {
		iXPanelCamposBuscarProductoFacturas=0;
		iYPanelCamposBuscarProductoFacturas++;
	}
	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = iYPanelCamposBuscarProductoFacturas;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = iXPanelCamposBuscarProductoFacturas++;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBuscarProductoFacturas.add(this.jPaneltotalBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(iXPanelCamposBuscarProductoFacturas % 2==0) {
		iXPanelCamposBuscarProductoFacturas=0;
		iYPanelCamposBuscarProductoFacturas++;
	}
	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = iYPanelCamposBuscarProductoFacturas;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = iXPanelCamposBuscarProductoFacturas++;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBuscarProductoFacturas.add(this.jPanelnombre_unidadBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(iXPanelCamposBuscarProductoFacturas % 2==0) {
		iXPanelCamposBuscarProductoFacturas=0;
		iYPanelCamposBuscarProductoFacturas++;
	}
	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = iYPanelCamposBuscarProductoFacturas;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = iXPanelCamposBuscarProductoFacturas++;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBuscarProductoFacturas.add(this.jPanelnombre_bodegaBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(iXPanelCamposBuscarProductoFacturas % 2==0) {
		iXPanelCamposBuscarProductoFacturas=0;
		iYPanelCamposBuscarProductoFacturas++;
	}
	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = iYPanelCamposBuscarProductoFacturas;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = iXPanelCamposBuscarProductoFacturas++;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBuscarProductoFacturas.add(this.jPanelnombre_productoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(iXPanelCamposBuscarProductoFacturas % 2==0) {
		iXPanelCamposBuscarProductoFacturas=0;
		iYPanelCamposBuscarProductoFacturas++;
	}
	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = iYPanelCamposBuscarProductoFacturas;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = iXPanelCamposBuscarProductoFacturas++;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBuscarProductoFacturas.add(this.jPanelcantidadBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(iXPanelCamposBuscarProductoFacturas % 2==0) {
		iXPanelCamposBuscarProductoFacturas=0;
		iYPanelCamposBuscarProductoFacturas++;
	}
	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = iYPanelCamposBuscarProductoFacturas;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = iXPanelCamposBuscarProductoFacturas++;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBuscarProductoFacturas.add(this.jPanelprecioBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(iXPanelCamposBuscarProductoFacturas % 2==0) {
		iXPanelCamposBuscarProductoFacturas=0;
		iYPanelCamposBuscarProductoFacturas++;
	}
	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = iYPanelCamposBuscarProductoFacturas;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = iXPanelCamposBuscarProductoFacturas++;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBuscarProductoFacturas.add(this.jPaneldescuentoBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(iXPanelCamposBuscarProductoFacturas % 2==0) {
		iXPanelCamposBuscarProductoFacturas=0;
		iYPanelCamposBuscarProductoFacturas++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = iYPanelCamposOcultosBuscarProductoFacturas;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = iXPanelCamposOcultosBuscarProductoFacturas++;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosBuscarProductoFacturas.add(this.jPanelid_empresaBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(iXPanelCamposOcultosBuscarProductoFacturas % 2==0) {
		iXPanelCamposOcultosBuscarProductoFacturas=0;
		iYPanelCamposOcultosBuscarProductoFacturas++;
	}
	this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBuscarProductoFacturas.gridy = iYPanelCamposOcultosBuscarProductoFacturas;
	this.gridBagConstraintsBuscarProductoFacturas.gridx = iXPanelCamposOcultosBuscarProductoFacturas++;
	this.gridBagConstraintsBuscarProductoFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBuscarProductoFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosBuscarProductoFacturas.add(this.jPanelid_sucursalBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);



	if(iXPanelCamposOcultosBuscarProductoFacturas % 2==0) {
		iXPanelCamposOcultosBuscarProductoFacturas=0;
		iYPanelCamposOcultosBuscarProductoFacturas++;
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
			
		GridBagLayout gridaBagLayoutAccionesBuscarProductoFacturas= new GridBagLayout();
		this.jPanelAccionesBuscarProductoFacturas.setLayout(gridaBagLayoutAccionesBuscarProductoFacturas);
		
		GridBagLayout gridaBagLayoutAccionesFormularioBuscarProductoFacturas= new GridBagLayout();
		this.jPanelAccionesFormularioBuscarProductoFacturas.setLayout(gridaBagLayoutAccionesFormularioBuscarProductoFacturas);
		
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBuscarProductoFacturas.add(this.jComboBoxTiposAccionesFormularioBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXAccion++;
			
		this.jPanelAccionesBuscarProductoFacturas.add(this.jButtonModificarBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);							

		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;
		this.gridBagConstraintsBuscarProductoFacturas.gridx =iPosXAccion++;
			
		this.jPanelAccionesBuscarProductoFacturas.add(this.jButtonEliminarBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		
			
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXAccion++;
		
		this.jPanelAccionesBuscarProductoFacturas.add(this.jButtonActualizarBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);


		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = iPosXAccion++;
		
		this.jPanelAccionesBuscarProductoFacturas.add(this.jButtonGuardarCambiosBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);	
		
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.gridy = 0;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx =iPosXAccion++;
		
		this.jPanelAccionesBuscarProductoFacturas.add(this.jButtonCancelarBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBuscarProductoFacturas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBuscarProductoFacturas);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();						
			this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;		
			//this.gridBagConstraintsBuscarProductoFacturas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBuscarProductoFacturas.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBuscarProductoFacturas.gridx =0;
		this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBuscarProductoFacturas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(BuscarProductoFacturasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleBuscarProductoFacturas = new BuscarProductoFacturasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Buscar Producto Facturas DATOS");
			
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
			
	        //this.setTitle("[FOR] - Buscar Producto Facturas DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Buscar Producto Facturas Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			BuscarProductoFacturasModel buscarproductofacturasModel=new BuscarProductoFacturasModel(this);
			
			//SI USARA CLASE INTERNA
			//BuscarProductoFacturasModel.BuscarProductoFacturasFocusTraversalPolicy buscarproductofacturasFocusTraversalPolicy = buscarproductofacturasModel.new BuscarProductoFacturasFocusTraversalPolicy(this);
			
			//buscarproductofacturasFocusTraversalPolicy.setbuscarproductofacturasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(buscarproductofacturasModel);
			
			
			this.jContentPaneDetalleBuscarProductoFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleBuscarProductoFacturas = new GridBagLayout();	
			this.jContentPaneDetalleBuscarProductoFacturas.setLayout(gridaBagLayoutDetalleBuscarProductoFacturas);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBuscarProductoFacturas = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
				this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
					
				
				this.jContentPaneDetalleBuscarProductoFacturas.add(jTtoolBarDetalleBuscarProductoFacturas, gridBagConstraintsBuscarProductoFacturas);								
				
}
			
			this.jScrollPanelDatosEdicionBuscarProductoFacturas=   new JScrollPane(jContentPaneDetalleBuscarProductoFacturas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBuscarProductoFacturas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBuscarProductoFacturas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBuscarProductoFacturas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralBuscarProductoFacturas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBuscarProductoFacturas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBuscarProductoFacturas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBuscarProductoFacturas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			
			
	        this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
	        
			this.jContentPaneDetalleBuscarProductoFacturas.add(jPanelCamposBuscarProductoFacturas, gridBagConstraintsBuscarProductoFacturas);
			
			
			
			
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
						//&& buscarproductofacturasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.buscarproductofacturasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsBuscarProductoFacturas= new GridBagConstraints();
						this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyRelaciones++;
						this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
						this.jContentPaneDetalleBuscarProductoFacturas.add(this.jTabbedPaneRelacionesBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesBuscarProductoFacturas.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosBuscarProductoFacturas.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
					this.gridBagConstraintsBuscarProductoFacturas.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
					
				
					this.jContentPaneDetalleBuscarProductoFacturas.add(jPanelCamposOcultosBuscarProductoFacturas, gridBagConstraintsBuscarProductoFacturas);
				
					this.jPanelCamposOcultosBuscarProductoFacturas.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
	        this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleBuscarProductoFacturas.add(this.jPanelAccionesFormularioBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);							
			
			
			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
	        this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
	        
			
			this.jContentPaneDetalleBuscarProductoFacturas.add(this.jPanelAccionesBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionBuscarProductoFacturas);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionBuscarProductoFacturas=   new JScrollPane(this.jPanelCamposBuscarProductoFacturas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBuscarProductoFacturas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBuscarProductoFacturas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBuscarProductoFacturas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
			this.gridBagConstraintsBuscarProductoFacturas.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsBuscarProductoFacturas.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsBuscarProductoFacturas.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);			
			
			this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
			this.gridBagConstraintsBuscarProductoFacturas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
			
			
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		
			
		this.gridBagConstraintsBuscarProductoFacturas = new GridBagConstraints();
		this.gridBagConstraintsBuscarProductoFacturas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBuscarProductoFacturas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBuscarProductoFacturas, this.gridBagConstraintsBuscarProductoFacturas);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralBuscarProductoFacturas;//jContentPane;
		
		return jScrollPanelDatosEdicionBuscarProductoFacturas;
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
