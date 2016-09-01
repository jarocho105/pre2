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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.report.*;
import com.bydan.erp.inventario.util.report.PreciosComprasConstantesFunciones;

import com.bydan.erp.inventario.business.logic.report.*;
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
public class PreciosComprasDetalleFormJInternalFrame extends PreciosComprasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePreciosCompras;
	
	protected JMenuBar jmenuBarDetallePreciosCompras;
	
	protected JMenu jmenuDetallePreciosCompras;
	protected JMenu jmenuDetalleArchivoPreciosCompras;
	protected JMenu jmenuDetalleAccionesPreciosCompras;
	protected JMenu jmenuDetalleDatosPreciosCompras;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePreciosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPreciosCompras;	
	protected GridBagConstraints gridBagConstraintsPreciosCompras;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PreciosComprasBeanSwingJInternalFrameAdditional jInternalFrameDetallePreciosCompras;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public PreciosComprasSessionBean precioscomprasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public PreciosComprasLogic precioscomprasLogic;
	
	public JScrollPane jScrollPanelDatosPreciosCompras;
	public JScrollPane jScrollPanelDatosEdicionPreciosCompras;
	public JScrollPane jScrollPanelDatosGeneralPreciosCompras;
	
	protected JPanel jPanelCamposPreciosCompras;    
	protected JPanel jPanelCamposOcultosPreciosCompras;    	
	protected JPanel jPanelAccionesPreciosCompras;
	protected JPanel jPanelAccionesFormularioPreciosCompras;
    
	
	
	protected Integer iXPanelCamposPreciosCompras=0;
	protected Integer iYPanelCamposPreciosCompras=0;
	
	protected Integer iXPanelCamposOcultosPreciosCompras=0;
	protected Integer iYPanelCamposOcultosPreciosCompras=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPreciosCompras;
	public JButton jButtonModificarPreciosCompras;
	public JButton jButtonActualizarPreciosCompras;
    public JButton jButtonEliminarPreciosCompras;
	public JButton jButtonCancelarPreciosCompras;
    public JButton jButtonGuardarCambiosPreciosCompras;
	public JButton jButtonGuardarCambiosTablaPreciosCompras;
	protected JButton jButtonCerrarPreciosCompras;
	
	
	protected JButton jButtonProcesarInformacionPreciosCompras;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPreciosCompras;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPreciosCompras;
	protected JCheckBox jCheckBoxPostAccionSinMensajePreciosCompras;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPreciosCompras;
	protected JButton jButtonModificarToolBarPreciosCompras;
	protected JButton jButtonActualizarToolBarPreciosCompras;
    protected JButton jButtonEliminarToolBarPreciosCompras;
	protected JButton jButtonCancelarToolBarPreciosCompras;
    protected JButton jButtonGuardarCambiosToolBarPreciosCompras;
	protected JButton jButtonGuardarCambiosTablaToolBarPreciosCompras;
	protected JButton jButtonMostrarOcultarTablaToolBarPreciosCompras;
	protected JButton jButtonCerrarToolBarPreciosCompras;
	
	protected JButton jButtonProcesarInformacionToolBarPreciosCompras;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPreciosCompras;
	protected JMenuItem jMenuItemModificarPreciosCompras;
	protected JMenuItem jMenuItemActualizarPreciosCompras;
    protected JMenuItem jMenuItemEliminarPreciosCompras;
	protected JMenuItem jMenuItemCancelarPreciosCompras;
    protected JMenuItem jMenuItemGuardarCambiosPreciosCompras;
	protected JMenuItem jMenuItemGuardarCambiosTablaPreciosCompras;
	protected JMenuItem jMenuItemCerrarPreciosCompras;
	protected JMenuItem jMenuItemDetalleCerrarPreciosCompras;
	protected JMenuItem jMenuItemDetalleMostarOcultarPreciosCompras;
	
	protected JMenuItem jMenuItemProcesarInformacionPreciosCompras;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPreciosCompras;
	protected JMenuItem jMenuItemMostrarOcultarPreciosCompras;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPreciosCompras;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPreciosCompras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPreciosCompras;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPreciosCompras;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPreciosCompras;
	public JLabel jLabelIdPreciosCompras;
	public JLabel jLabelidPreciosCompras;
	public JButton jButtonidPreciosComprasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdePreciosCompras;
	public JLabel jLabelfecha_emision_desdePreciosCompras;
	//public JFormattedTextField jDateChooserfecha_emision_desdePreciosCompras;

	public JDateChooser jDateChooserfecha_emision_desdePreciosCompras;
	public JButton jButtonfecha_emision_desdePreciosComprasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaPreciosCompras;
	public JLabel jLabelfecha_emision_hastaPreciosCompras;
	//public JFormattedTextField jDateChooserfecha_emision_hastaPreciosCompras;

	public JDateChooser jDateChooserfecha_emision_hastaPreciosCompras;
	public JButton jButtonfecha_emision_hastaPreciosComprasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_clientePreciosCompras;
	public JLabel jLabelnombre_completo_clientePreciosCompras;
	public JTextArea jTextAreanombre_completo_clientePreciosCompras;
	public JScrollPane jscrollPanenombre_completo_clientePreciosCompras;
	public JButton jButtonnombre_completo_clientePreciosComprasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobantePreciosCompras;
	public JLabel jLabelnumero_comprobantePreciosCompras;
	public JTextField jTextFieldnumero_comprobantePreciosCompras;
	public JButton jButtonnumero_comprobantePreciosComprasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionPreciosCompras;
	public JLabel jLabelfecha_emisionPreciosCompras;
	//public JFormattedTextField jDateChooserfecha_emisionPreciosCompras;

	public JDateChooser jDateChooserfecha_emisionPreciosCompras;
	public JButton jButtonfecha_emisionPreciosComprasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoPreciosCompras;
	public JLabel jLabelnombre_productoPreciosCompras;
	public JTextArea jTextAreanombre_productoPreciosCompras;
	public JScrollPane jscrollPanenombre_productoPreciosCompras;
	public JButton jButtonnombre_productoPreciosComprasBusqueda= new JButtonMe();

	public JPanel jPanelcosto_unitarioPreciosCompras;
	public JLabel jLabelcosto_unitarioPreciosCompras;
	public JTextField jTextFieldcosto_unitarioPreciosCompras;
	public JButton jButtoncosto_unitarioPreciosComprasBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_productoPreciosCompras;
	public JLabel jLabelcodigo_productoPreciosCompras;
	public JTextField jTextFieldcodigo_productoPreciosCompras;
	public JButton jButtoncodigo_productoPreciosComprasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPreciosCompras;
	public JLabel jLabelid_empresaPreciosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPreciosCompras;
	public JButton jButtonid_empresaPreciosCompras= new JButtonMe();
	public JButton jButtonid_empresaPreciosComprasUpdate= new JButtonMe();
	public JButton jButtonid_empresaPreciosComprasBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPreciosCompras;
	public JLabel jLabelid_sucursalPreciosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPreciosCompras;
	public JButton jButtonid_sucursalPreciosCompras= new JButtonMe();
	public JButton jButtonid_sucursalPreciosComprasUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPreciosComprasBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaPreciosCompras;
	public JLabel jLabelid_bodegaPreciosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaPreciosCompras;
	public JButton jButtonid_bodegaPreciosCompras= new JButtonMe();
	public JButton jButtonid_bodegaPreciosComprasUpdate= new JButtonMe();
	public JButton jButtonid_bodegaPreciosComprasBusqueda= new JButtonMe();

	public JPanel jPanelid_productoPreciosCompras;
	public JLabel jLabelid_productoPreciosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoPreciosCompras;
	public JButton jButtonid_productoPreciosCompras= new JButtonMe();
	public JButton jButtonid_productoPreciosComprasUpdate= new JButtonMe();
	public JButton jButtonid_productoPreciosComprasBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionPreciosCompras;
	public JLabel jLabelid_transaccionPreciosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionPreciosCompras;
	public JButton jButtonid_transaccionPreciosCompras= new JButtonMe();
	public JButton jButtonid_transaccionPreciosComprasUpdate= new JButtonMe();
	public JButton jButtonid_transaccionPreciosComprasBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaPreciosCompras;
	public JLabel jLabelid_lineaPreciosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaPreciosCompras;
	public JButton jButtonid_lineaPreciosCompras= new JButtonMe();
	public JButton jButtonid_lineaPreciosComprasUpdate= new JButtonMe();
	public JButton jButtonid_lineaPreciosComprasBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoPreciosCompras;
	public JLabel jLabelid_linea_grupoPreciosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoPreciosCompras;
	public JButton jButtonid_linea_grupoPreciosCompras= new JButtonMe();
	public JButton jButtonid_linea_grupoPreciosComprasUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoPreciosComprasBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaPreciosCompras;
	public JLabel jLabelid_linea_categoriaPreciosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaPreciosCompras;
	public JButton jButtonid_linea_categoriaPreciosCompras= new JButtonMe();
	public JButton jButtonid_linea_categoriaPreciosComprasUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaPreciosComprasBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaPreciosCompras;
	public JLabel jLabelid_linea_marcaPreciosCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaPreciosCompras;
	public JButton jButtonid_linea_marcaPreciosCompras= new JButtonMe();
	public JButton jButtonid_linea_marcaPreciosComprasUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaPreciosComprasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPreciosCompras;
	
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
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PreciosComprasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPreciosCompras=new JPanel();
				this.jPanelAccionesFormularioPreciosCompras=new JPanel();
				this.jmenuBarDetallePreciosCompras=new JMenuBar();
				this.jTtoolBarDetallePreciosCompras=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreciosComprasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PreciosCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PreciosComprasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PreciosCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreciosComprasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PreciosCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreciosComprasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PreciosCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreciosComprasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PreciosCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPreciosCompras() {
		return this.jButtonActualizarToolBarPreciosCompras;
	}
	
	public JButton getjButtonEliminarToolBarPreciosCompras() {
		return this.jButtonEliminarToolBarPreciosCompras;
	}
	
	public JButton getjButtonCancelarToolBarPreciosCompras() {
		return this.jButtonCancelarToolBarPreciosCompras;
	}		
	
	public JButton getjButtonProcesarInformacionPreciosCompras() {
		return this.jButtonProcesarInformacionPreciosCompras;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPreciosCompras)	{
		this.jButtonProcesarInformacionPreciosCompras = jButtonProcesarInformacionPreciosCompras;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPreciosCompras() {
		return this.jComboBoxTiposAccionesPreciosCompras;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPreciosCompras(
			JComboBox jComboBoxTiposRelacionesPreciosCompras) {
		this.jComboBoxTiposRelacionesPreciosCompras = jComboBoxTiposRelacionesPreciosCompras;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPreciosCompras(
			JComboBox jComboBoxTiposAccionesPreciosCompras) {
		this.jComboBoxTiposAccionesPreciosCompras = jComboBoxTiposAccionesPreciosCompras;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPreciosCompras() {
		return this.jComboBoxTiposAccionesFormularioPreciosCompras;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPreciosCompras(
			JComboBox jComboBoxTiposAccionesFormularioPreciosCompras) {
		this.jComboBoxTiposAccionesFormularioPreciosCompras = jComboBoxTiposAccionesFormularioPreciosCompras;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.precioscomprasSessionBean=new PreciosComprasSessionBean();
		
		this.precioscomprasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.precioscomprasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.precioscomprasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PreciosComprasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PreciosComprasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PreciosComprasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Precios Compras MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.precioscomprasSessionBean.getEsGuardarRelacionado()) {
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
	
		PreciosComprasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePreciosCompras= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPreciosCompras=new JButtonMe();
				this.jButtonModificarToolBarPreciosCompras=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPreciosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPreciosCompras,this.jTtoolBarDetallePreciosCompras,
							"actualizar","actualizar","Actualizar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPreciosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPreciosCompras,this.jTtoolBarDetallePreciosCompras,
							"eliminar","eliminar","Eliminar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPreciosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPreciosCompras,this.jTtoolBarDetallePreciosCompras,
							"cancelar","cancelar","Cancelar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPreciosCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPreciosCompras,this.jTtoolBarDetallePreciosCompras,
							"guardarcambios","guardarcambios","Guardar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePreciosCompras=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePreciosCompras=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPreciosCompras=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPreciosCompras=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPreciosCompras=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPreciosCompras= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPreciosCompras.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPreciosCompras,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPreciosCompras= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPreciosCompras.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPreciosCompras,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPreciosCompras= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPreciosCompras.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPreciosCompras,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPreciosCompras= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPreciosCompras.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPreciosCompras,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPreciosCompras= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPreciosCompras.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPreciosCompras,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPreciosCompras= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPreciosCompras.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPreciosCompras,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPreciosCompras= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPreciosCompras.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPreciosCompras,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPreciosCompras= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPreciosCompras.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPreciosCompras,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPreciosCompras= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPreciosCompras.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPreciosCompras,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPreciosCompras= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPreciosCompras.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPreciosCompras,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPreciosCompras.add(this.jMenuItemDetalleCerrarPreciosCompras);
		
		this.jmenuDetalleAccionesPreciosCompras.add(this.jMenuItemActualizarPreciosCompras);
		this.jmenuDetalleAccionesPreciosCompras.add(this.jMenuItemEliminarPreciosCompras);
		this.jmenuDetalleAccionesPreciosCompras.add(this.jMenuItemCancelarPreciosCompras);		
		
		//this.jmenuDetalleDatosPreciosCompras.add(this.jMenuItemDetalleAbrirOrderByPreciosCompras);				
		this.jmenuDetalleDatosPreciosCompras.add(this.jMenuItemDetalleMostarOcultarPreciosCompras);				
				
		//this.jmenuDetalleAccionesPreciosCompras.add(this.jMenuItemGuardarCambiosPreciosCompras);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePreciosCompras.add(this.jmenuDetalleArchivoPreciosCompras);		
		this.jmenuBarDetallePreciosCompras.add(this.jmenuDetalleAccionesPreciosCompras);		
		this.jmenuBarDetallePreciosCompras.add(this.jmenuDetalleDatosPreciosCompras);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePreciosCompras);				
	}
	
	
	public void inicializarElementosCamposPreciosCompras() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPreciosCompras = new JLabelMe();
		jLabelIdPreciosCompras.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPreciosCompras = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPreciosCompras.setToolTipText(PreciosComprasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPreciosCompras= new GridBagLayout();

		this.jPanelidPreciosCompras.setLayout(this.gridaBagLayoutPreciosCompras);

		jLabelidPreciosCompras = new JLabel();
		jLabelidPreciosCompras.setText("Id");

		jLabelidPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdePreciosCompras = new JLabelMe();
		this.jLabelfecha_emision_desdePreciosCompras.setText(""+PreciosComprasConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdePreciosCompras.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdePreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdePreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdePreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdePreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdePreciosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdePreciosCompras.setToolTipText(PreciosComprasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutPreciosCompras = new GridBagLayout();
		this.jPanelfecha_emision_desdePreciosCompras.setLayout(this.gridaBagLayoutPreciosCompras);


		//jFormattedTextFieldfecha_emision_desdePreciosCompras= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdePreciosCompras= new JDateChooser();
		jDateChooserfecha_emision_desdePreciosCompras.setEnabled(false);
		jDateChooserfecha_emision_desdePreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdePreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdePreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdePreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdePreciosCompras.setDate(new Date());
		jDateChooserfecha_emision_desdePreciosCompras.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdePreciosCompras.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdePreciosComprasBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdePreciosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdePreciosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdePreciosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdePreciosComprasBusqueda.setText("U");
		this.jButtonfecha_emision_desdePreciosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdePreciosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdePreciosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdePreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdePreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdePreciosComprasBusqueda"));

		if(this.precioscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdePreciosComprasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaPreciosCompras = new JLabelMe();
		this.jLabelfecha_emision_hastaPreciosCompras.setText(""+PreciosComprasConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaPreciosCompras.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaPreciosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaPreciosCompras.setToolTipText(PreciosComprasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutPreciosCompras = new GridBagLayout();
		this.jPanelfecha_emision_hastaPreciosCompras.setLayout(this.gridaBagLayoutPreciosCompras);


		//jFormattedTextFieldfecha_emision_hastaPreciosCompras= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaPreciosCompras= new JDateChooser();
		jDateChooserfecha_emision_hastaPreciosCompras.setEnabled(false);
		jDateChooserfecha_emision_hastaPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaPreciosCompras.setDate(new Date());
		jDateChooserfecha_emision_hastaPreciosCompras.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaPreciosCompras.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaPreciosComprasBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaPreciosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaPreciosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaPreciosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaPreciosComprasBusqueda.setText("U");
		this.jButtonfecha_emision_hastaPreciosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaPreciosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaPreciosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaPreciosComprasBusqueda"));

		if(this.precioscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaPreciosComprasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_clientePreciosCompras = new JLabelMe();
		this.jLabelnombre_completo_clientePreciosCompras.setText(""+PreciosComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+" : *");
		this.jLabelnombre_completo_clientePreciosCompras.setToolTipText("Nombre Completo Cliente");
		this.jLabelnombre_completo_clientePreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clientePreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clientePreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_clientePreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_clientePreciosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_clientePreciosCompras.setToolTipText(PreciosComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		this.gridaBagLayoutPreciosCompras = new GridBagLayout();
		this.jPanelnombre_completo_clientePreciosCompras.setLayout(this.gridaBagLayoutPreciosCompras);


		jTextAreanombre_completo_clientePreciosCompras= new JTextAreaMe();
		jTextAreanombre_completo_clientePreciosCompras.setEnabled(false);
		jTextAreanombre_completo_clientePreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clientePreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clientePreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clientePreciosCompras.setLineWrap(true);
		jTextAreanombre_completo_clientePreciosCompras.setWrapStyleWord(true);
		jTextAreanombre_completo_clientePreciosCompras.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_clientePreciosCompras.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_clientePreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_clientePreciosCompras = new JScrollPane(jTextAreanombre_completo_clientePreciosCompras);
		jscrollPanenombre_completo_clientePreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clientePreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clientePreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completo_clientePreciosComprasBusqueda= new JButtonMe();
		this.jButtonnombre_completo_clientePreciosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clientePreciosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clientePreciosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_clientePreciosComprasBusqueda.setText("U");
		this.jButtonnombre_completo_clientePreciosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_clientePreciosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_clientePreciosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_clientePreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_clientePreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_clientePreciosComprasBusqueda"));

		if(this.precioscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_clientePreciosComprasBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobantePreciosCompras = new JLabelMe();
		this.jLabelnumero_comprobantePreciosCompras.setText(""+PreciosComprasConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" : *");
		this.jLabelnumero_comprobantePreciosCompras.setToolTipText("Numero Comprobante");
		this.jLabelnumero_comprobantePreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobantePreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobantePreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobantePreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobantePreciosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobantePreciosCompras.setToolTipText(PreciosComprasConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutPreciosCompras = new GridBagLayout();
		this.jPanelnumero_comprobantePreciosCompras.setLayout(this.gridaBagLayoutPreciosCompras);


		jTextFieldnumero_comprobantePreciosCompras= new JTextFieldMe();

		jTextFieldnumero_comprobantePreciosCompras.setEnabled(false);
		jTextFieldnumero_comprobantePreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobantePreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobantePreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobantePreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobantePreciosComprasBusqueda= new JButtonMe();
		this.jButtonnumero_comprobantePreciosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobantePreciosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobantePreciosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobantePreciosComprasBusqueda.setText("U");
		this.jButtonnumero_comprobantePreciosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobantePreciosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobantePreciosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobantePreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobantePreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobantePreciosComprasBusqueda"));

		if(this.precioscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobantePreciosComprasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionPreciosCompras = new JLabelMe();
		this.jLabelfecha_emisionPreciosCompras.setText(""+PreciosComprasConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionPreciosCompras.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionPreciosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionPreciosCompras.setToolTipText(PreciosComprasConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutPreciosCompras = new GridBagLayout();
		this.jPanelfecha_emisionPreciosCompras.setLayout(this.gridaBagLayoutPreciosCompras);


		//jFormattedTextFieldfecha_emisionPreciosCompras= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionPreciosCompras= new JDateChooser();
		jDateChooserfecha_emisionPreciosCompras.setEnabled(false);
		jDateChooserfecha_emisionPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionPreciosCompras.setDate(new Date());
		jDateChooserfecha_emisionPreciosCompras.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionPreciosCompras.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionPreciosComprasBusqueda= new JButtonMe();
		this.jButtonfecha_emisionPreciosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPreciosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPreciosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionPreciosComprasBusqueda.setText("U");
		this.jButtonfecha_emisionPreciosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionPreciosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionPreciosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionPreciosComprasBusqueda"));

		if(this.precioscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionPreciosComprasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoPreciosCompras = new JLabelMe();
		this.jLabelnombre_productoPreciosCompras.setText(""+PreciosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoPreciosCompras.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoPreciosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoPreciosCompras.setToolTipText(PreciosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutPreciosCompras = new GridBagLayout();
		this.jPanelnombre_productoPreciosCompras.setLayout(this.gridaBagLayoutPreciosCompras);


		jTextAreanombre_productoPreciosCompras= new JTextAreaMe();
		jTextAreanombre_productoPreciosCompras.setEnabled(false);
		jTextAreanombre_productoPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoPreciosCompras.setLineWrap(true);
		jTextAreanombre_productoPreciosCompras.setWrapStyleWord(true);
		jTextAreanombre_productoPreciosCompras.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoPreciosCompras.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoPreciosCompras = new JScrollPane(jTextAreanombre_productoPreciosCompras);
		jscrollPanenombre_productoPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_productoPreciosComprasBusqueda= new JButtonMe();
		this.jButtonnombre_productoPreciosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoPreciosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoPreciosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoPreciosComprasBusqueda.setText("U");
		this.jButtonnombre_productoPreciosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoPreciosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoPreciosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoPreciosComprasBusqueda"));

		if(this.precioscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoPreciosComprasBusqueda.setVisible(false);		}


					
		this.jLabelcosto_unitarioPreciosCompras = new JLabelMe();
		this.jLabelcosto_unitarioPreciosCompras.setText(""+PreciosComprasConstantesFunciones.LABEL_COSTOUNITARIO+" : *");
		this.jLabelcosto_unitarioPreciosCompras.setToolTipText("Costo Unitario");
		this.jLabelcosto_unitarioPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_unitarioPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_unitarioPreciosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_unitarioPreciosCompras.setToolTipText(PreciosComprasConstantesFunciones.LABEL_COSTOUNITARIO);
		this.gridaBagLayoutPreciosCompras = new GridBagLayout();
		this.jPanelcosto_unitarioPreciosCompras.setLayout(this.gridaBagLayoutPreciosCompras);


		jTextFieldcosto_unitarioPreciosCompras= new JTextFieldMe();
		jTextFieldcosto_unitarioPreciosCompras.setEnabled(false);
		jTextFieldcosto_unitarioPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_unitarioPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_unitarioPreciosCompras.setText("0.0");

		this.jButtoncosto_unitarioPreciosComprasBusqueda= new JButtonMe();
		this.jButtoncosto_unitarioPreciosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioPreciosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioPreciosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_unitarioPreciosComprasBusqueda.setText("U");
		this.jButtoncosto_unitarioPreciosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_unitarioPreciosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_unitarioPreciosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_unitarioPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_unitarioPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_unitarioPreciosComprasBusqueda"));

		if(this.precioscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_unitarioPreciosComprasBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_productoPreciosCompras = new JLabelMe();
		this.jLabelcodigo_productoPreciosCompras.setText(""+PreciosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO+" : *");
		this.jLabelcodigo_productoPreciosCompras.setToolTipText("Codigo Producto");
		this.jLabelcodigo_productoPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_productoPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_productoPreciosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_productoPreciosCompras.setToolTipText(PreciosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO);
		this.gridaBagLayoutPreciosCompras = new GridBagLayout();
		this.jPanelcodigo_productoPreciosCompras.setLayout(this.gridaBagLayoutPreciosCompras);


		jTextFieldcodigo_productoPreciosCompras= new JTextFieldMe();

		jTextFieldcodigo_productoPreciosCompras.setEnabled(false);
		jTextFieldcodigo_productoPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_productoPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_productoPreciosComprasBusqueda= new JButtonMe();
		this.jButtoncodigo_productoPreciosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoPreciosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoPreciosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_productoPreciosComprasBusqueda.setText("U");
		this.jButtoncodigo_productoPreciosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_productoPreciosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_productoPreciosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_productoPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_productoPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_productoPreciosComprasBusqueda"));

		if(this.precioscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_productoPreciosComprasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPreciosCompras() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPreciosCompras = new JLabelMe();
		this.jLabelid_empresaPreciosCompras.setText(""+PreciosComprasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPreciosCompras.setToolTipText("Empresa");
		this.jLabelid_empresaPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPreciosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPreciosCompras.setToolTipText(PreciosComprasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPreciosCompras = new GridBagLayout();
		this.jPanelid_empresaPreciosCompras.setLayout(this.gridaBagLayoutPreciosCompras);


		jComboBoxid_empresaPreciosCompras= new JComboBoxMe();
		jComboBoxid_empresaPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPreciosCompras.setEnabled(false);

		this.jButtonid_empresaPreciosCompras= new JButtonMe();
		this.jButtonid_empresaPreciosCompras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPreciosCompras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPreciosCompras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPreciosCompras.setText("Buscar");
		this.jButtonid_empresaPreciosCompras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPreciosCompras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPreciosCompras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPreciosCompras"));

		this.jButtonid_empresaPreciosComprasBusqueda= new JButtonMe();
		this.jButtonid_empresaPreciosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPreciosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPreciosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPreciosComprasBusqueda.setText("U");
		this.jButtonid_empresaPreciosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPreciosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPreciosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPreciosComprasBusqueda"));

		if(this.precioscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPreciosComprasBusqueda.setVisible(false);		}

		this.jButtonid_empresaPreciosComprasUpdate= new JButtonMe();
		this.jButtonid_empresaPreciosComprasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPreciosComprasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPreciosComprasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPreciosComprasUpdate.setText("U");
		this.jButtonid_empresaPreciosComprasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPreciosComprasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPreciosComprasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPreciosComprasUpdate"));



					
		this.jLabelid_sucursalPreciosCompras = new JLabelMe();
		this.jLabelid_sucursalPreciosCompras.setText(""+PreciosComprasConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPreciosCompras.setToolTipText("Sucursal");
		this.jLabelid_sucursalPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPreciosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPreciosCompras.setToolTipText(PreciosComprasConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPreciosCompras = new GridBagLayout();
		this.jPanelid_sucursalPreciosCompras.setLayout(this.gridaBagLayoutPreciosCompras);


		jComboBoxid_sucursalPreciosCompras= new JComboBoxMe();
		jComboBoxid_sucursalPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPreciosCompras.setEnabled(false);

		this.jButtonid_sucursalPreciosCompras= new JButtonMe();
		this.jButtonid_sucursalPreciosCompras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPreciosCompras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPreciosCompras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPreciosCompras.setText("Buscar");
		this.jButtonid_sucursalPreciosCompras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPreciosCompras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPreciosCompras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPreciosCompras"));

		this.jButtonid_sucursalPreciosComprasBusqueda= new JButtonMe();
		this.jButtonid_sucursalPreciosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPreciosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPreciosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPreciosComprasBusqueda.setText("U");
		this.jButtonid_sucursalPreciosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPreciosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPreciosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPreciosComprasBusqueda"));

		if(this.precioscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPreciosComprasBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPreciosComprasUpdate= new JButtonMe();
		this.jButtonid_sucursalPreciosComprasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPreciosComprasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPreciosComprasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPreciosComprasUpdate.setText("U");
		this.jButtonid_sucursalPreciosComprasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPreciosComprasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPreciosComprasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPreciosComprasUpdate"));



					
		this.jLabelid_bodegaPreciosCompras = new JLabelMe();
		this.jLabelid_bodegaPreciosCompras.setText(""+PreciosComprasConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaPreciosCompras.setToolTipText("Bodega");
		this.jLabelid_bodegaPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaPreciosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaPreciosCompras.setToolTipText(PreciosComprasConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutPreciosCompras = new GridBagLayout();
		this.jPanelid_bodegaPreciosCompras.setLayout(this.gridaBagLayoutPreciosCompras);


		jComboBoxid_bodegaPreciosCompras= new JComboBoxMe();
		jComboBoxid_bodegaPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaPreciosCompras= new JButtonMe();
		this.jButtonid_bodegaPreciosCompras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaPreciosCompras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaPreciosCompras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaPreciosCompras.setText("Buscar");
		this.jButtonid_bodegaPreciosCompras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaPreciosCompras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaPreciosCompras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaPreciosCompras"));

		this.jButtonid_bodegaPreciosComprasBusqueda= new JButtonMe();
		this.jButtonid_bodegaPreciosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaPreciosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaPreciosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaPreciosComprasBusqueda.setText("U");
		this.jButtonid_bodegaPreciosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaPreciosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaPreciosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaPreciosComprasBusqueda"));

		if(this.precioscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaPreciosComprasBusqueda.setVisible(false);		}

		this.jButtonid_bodegaPreciosComprasUpdate= new JButtonMe();
		this.jButtonid_bodegaPreciosComprasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaPreciosComprasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaPreciosComprasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaPreciosComprasUpdate.setText("U");
		this.jButtonid_bodegaPreciosComprasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaPreciosComprasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaPreciosComprasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaPreciosComprasUpdate"));



					
		this.jLabelid_productoPreciosCompras = new JLabelMe();
		this.jLabelid_productoPreciosCompras.setText(""+PreciosComprasConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoPreciosCompras.setToolTipText("Producto");
		this.jLabelid_productoPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoPreciosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoPreciosCompras.setToolTipText(PreciosComprasConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutPreciosCompras = new GridBagLayout();
		this.jPanelid_productoPreciosCompras.setLayout(this.gridaBagLayoutPreciosCompras);


		jComboBoxid_productoPreciosCompras= new JComboBoxMe();
		jComboBoxid_productoPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoPreciosCompras= new JButtonMe();
		this.jButtonid_productoPreciosCompras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPreciosCompras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPreciosCompras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPreciosCompras.setText("Buscar");
		this.jButtonid_productoPreciosCompras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoPreciosCompras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPreciosCompras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPreciosCompras"));

		this.jButtonid_productoPreciosComprasBusqueda= new JButtonMe();
		this.jButtonid_productoPreciosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPreciosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPreciosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoPreciosComprasBusqueda.setText("U");
		this.jButtonid_productoPreciosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoPreciosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPreciosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPreciosComprasBusqueda"));

		if(this.precioscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoPreciosComprasBusqueda.setVisible(false);		}

		this.jButtonid_productoPreciosComprasUpdate= new JButtonMe();
		this.jButtonid_productoPreciosComprasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPreciosComprasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPreciosComprasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoPreciosComprasUpdate.setText("U");
		this.jButtonid_productoPreciosComprasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoPreciosComprasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPreciosComprasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPreciosComprasUpdate"));



					
		this.jLabelid_transaccionPreciosCompras = new JLabelMe();
		this.jLabelid_transaccionPreciosCompras.setText(""+PreciosComprasConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionPreciosCompras.setToolTipText("Transaccion");
		this.jLabelid_transaccionPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionPreciosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionPreciosCompras.setToolTipText(PreciosComprasConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutPreciosCompras = new GridBagLayout();
		this.jPanelid_transaccionPreciosCompras.setLayout(this.gridaBagLayoutPreciosCompras);


		jComboBoxid_transaccionPreciosCompras= new JComboBoxMe();
		jComboBoxid_transaccionPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionPreciosCompras= new JButtonMe();
		this.jButtonid_transaccionPreciosCompras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionPreciosCompras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionPreciosCompras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionPreciosCompras.setText("Buscar");
		this.jButtonid_transaccionPreciosCompras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionPreciosCompras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionPreciosCompras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionPreciosCompras"));

		this.jButtonid_transaccionPreciosComprasBusqueda= new JButtonMe();
		this.jButtonid_transaccionPreciosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionPreciosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionPreciosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionPreciosComprasBusqueda.setText("U");
		this.jButtonid_transaccionPreciosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionPreciosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionPreciosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionPreciosComprasBusqueda"));

		if(this.precioscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionPreciosComprasBusqueda.setVisible(false);		}

		this.jButtonid_transaccionPreciosComprasUpdate= new JButtonMe();
		this.jButtonid_transaccionPreciosComprasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionPreciosComprasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionPreciosComprasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionPreciosComprasUpdate.setText("U");
		this.jButtonid_transaccionPreciosComprasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionPreciosComprasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionPreciosComprasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionPreciosComprasUpdate"));



					
		this.jLabelid_lineaPreciosCompras = new JLabelMe();
		this.jLabelid_lineaPreciosCompras.setText(""+PreciosComprasConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaPreciosCompras.setToolTipText("Linea");
		this.jLabelid_lineaPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaPreciosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaPreciosCompras.setToolTipText(PreciosComprasConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutPreciosCompras = new GridBagLayout();
		this.jPanelid_lineaPreciosCompras.setLayout(this.gridaBagLayoutPreciosCompras);


		jComboBoxid_lineaPreciosCompras= new JComboBoxMe();
		jComboBoxid_lineaPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaPreciosCompras= new JButtonMe();
		this.jButtonid_lineaPreciosCompras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaPreciosCompras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaPreciosCompras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaPreciosCompras.setText("Buscar");
		this.jButtonid_lineaPreciosCompras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaPreciosCompras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaPreciosCompras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaPreciosCompras"));

		this.jButtonid_lineaPreciosComprasBusqueda= new JButtonMe();
		this.jButtonid_lineaPreciosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaPreciosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaPreciosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaPreciosComprasBusqueda.setText("U");
		this.jButtonid_lineaPreciosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaPreciosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaPreciosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaPreciosComprasBusqueda"));

		if(this.precioscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaPreciosComprasBusqueda.setVisible(false);		}

		this.jButtonid_lineaPreciosComprasUpdate= new JButtonMe();
		this.jButtonid_lineaPreciosComprasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaPreciosComprasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaPreciosComprasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaPreciosComprasUpdate.setText("U");
		this.jButtonid_lineaPreciosComprasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaPreciosComprasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaPreciosComprasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaPreciosComprasUpdate"));



					
		this.jLabelid_linea_grupoPreciosCompras = new JLabelMe();
		this.jLabelid_linea_grupoPreciosCompras.setText(""+PreciosComprasConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoPreciosCompras.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoPreciosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoPreciosCompras.setToolTipText(PreciosComprasConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutPreciosCompras = new GridBagLayout();
		this.jPanelid_linea_grupoPreciosCompras.setLayout(this.gridaBagLayoutPreciosCompras);


		jComboBoxid_linea_grupoPreciosCompras= new JComboBoxMe();
		jComboBoxid_linea_grupoPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoPreciosCompras= new JButtonMe();
		this.jButtonid_linea_grupoPreciosCompras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoPreciosCompras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoPreciosCompras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoPreciosCompras.setText("Buscar");
		this.jButtonid_linea_grupoPreciosCompras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoPreciosCompras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoPreciosCompras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoPreciosCompras"));

		this.jButtonid_linea_grupoPreciosComprasBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoPreciosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoPreciosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoPreciosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoPreciosComprasBusqueda.setText("U");
		this.jButtonid_linea_grupoPreciosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoPreciosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoPreciosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoPreciosComprasBusqueda"));

		if(this.precioscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoPreciosComprasBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoPreciosComprasUpdate= new JButtonMe();
		this.jButtonid_linea_grupoPreciosComprasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoPreciosComprasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoPreciosComprasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoPreciosComprasUpdate.setText("U");
		this.jButtonid_linea_grupoPreciosComprasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoPreciosComprasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoPreciosComprasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoPreciosComprasUpdate"));



					
		this.jLabelid_linea_categoriaPreciosCompras = new JLabelMe();
		this.jLabelid_linea_categoriaPreciosCompras.setText(""+PreciosComprasConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaPreciosCompras.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaPreciosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaPreciosCompras.setToolTipText(PreciosComprasConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutPreciosCompras = new GridBagLayout();
		this.jPanelid_linea_categoriaPreciosCompras.setLayout(this.gridaBagLayoutPreciosCompras);


		jComboBoxid_linea_categoriaPreciosCompras= new JComboBoxMe();
		jComboBoxid_linea_categoriaPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaPreciosCompras= new JButtonMe();
		this.jButtonid_linea_categoriaPreciosCompras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaPreciosCompras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaPreciosCompras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaPreciosCompras.setText("Buscar");
		this.jButtonid_linea_categoriaPreciosCompras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaPreciosCompras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaPreciosCompras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaPreciosCompras"));

		this.jButtonid_linea_categoriaPreciosComprasBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaPreciosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaPreciosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaPreciosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaPreciosComprasBusqueda.setText("U");
		this.jButtonid_linea_categoriaPreciosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaPreciosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaPreciosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaPreciosComprasBusqueda"));

		if(this.precioscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaPreciosComprasBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaPreciosComprasUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaPreciosComprasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaPreciosComprasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaPreciosComprasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaPreciosComprasUpdate.setText("U");
		this.jButtonid_linea_categoriaPreciosComprasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaPreciosComprasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaPreciosComprasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaPreciosComprasUpdate"));



					
		this.jLabelid_linea_marcaPreciosCompras = new JLabelMe();
		this.jLabelid_linea_marcaPreciosCompras.setText(""+PreciosComprasConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaPreciosCompras.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaPreciosCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaPreciosCompras.setToolTipText(PreciosComprasConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutPreciosCompras = new GridBagLayout();
		this.jPanelid_linea_marcaPreciosCompras.setLayout(this.gridaBagLayoutPreciosCompras);


		jComboBoxid_linea_marcaPreciosCompras= new JComboBoxMe();
		jComboBoxid_linea_marcaPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaPreciosCompras= new JButtonMe();
		this.jButtonid_linea_marcaPreciosCompras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaPreciosCompras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaPreciosCompras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaPreciosCompras.setText("Buscar");
		this.jButtonid_linea_marcaPreciosCompras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaPreciosCompras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaPreciosCompras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaPreciosCompras"));

		this.jButtonid_linea_marcaPreciosComprasBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaPreciosComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaPreciosComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaPreciosComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaPreciosComprasBusqueda.setText("U");
		this.jButtonid_linea_marcaPreciosComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaPreciosComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaPreciosComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaPreciosComprasBusqueda"));

		if(this.precioscomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaPreciosComprasBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaPreciosComprasUpdate= new JButtonMe();
		this.jButtonid_linea_marcaPreciosComprasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaPreciosComprasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaPreciosComprasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaPreciosComprasUpdate.setText("U");
		this.jButtonid_linea_marcaPreciosComprasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaPreciosComprasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaPreciosComprasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaPreciosComprasUpdate"));



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
		//this.jInternalFrameDetallePreciosCompras = new PreciosComprasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Precios Compras DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPreciosCompras= new GridBagLayout();
		

		
		String sToolTipPreciosCompras="";
		sToolTipPreciosCompras=PreciosComprasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPreciosCompras+="(Inventario.PreciosCompras)";
		}
		
		if(!this.precioscomprasSessionBean.getEsGuardarRelacionado()) {
			sToolTipPreciosCompras+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPreciosCompras = new JButtonMe();
		this.jButtonModificarPreciosCompras = new JButtonMe();
        this.jButtonActualizarPreciosCompras = new JButtonMe();
        this.jButtonEliminarPreciosCompras = new JButtonMe();
        this.jButtonCancelarPreciosCompras = new JButtonMe();
        this.jButtonGuardarCambiosPreciosCompras = new JButtonMe();
		this.jButtonGuardarCambiosTablaPreciosCompras = new JButtonMe();
		this.jButtonCerrarPreciosCompras = new JButtonMe();
		
		this.jScrollPanelDatosPreciosCompras = new JScrollPane();   
        this.jScrollPanelDatosEdicionPreciosCompras = new JScrollPane();
		this.jScrollPanelDatosGeneralPreciosCompras = new JScrollPane();
				
		
		
		this.jPanelCamposPreciosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPreciosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPreciosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPreciosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Precios Compras";
		
		if(!this.precioscomprasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Precios Comprases" + this.sPath));
		} else {
			this.jScrollPanelDatosPreciosCompras.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPreciosCompras.setName("jPanelCamposPreciosCompras"); 

		this.jPanelCamposOcultosPreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPreciosCompras.setName("jPanelCamposOcultosPreciosCompras"); 

        this.jPanelAccionesPreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPreciosCompras.setToolTipText("Acciones");
        this.jPanelAccionesPreciosCompras.setName("Acciones"); 

		this.jPanelAccionesFormularioPreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPreciosCompras.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPreciosCompras.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPreciosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPreciosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPreciosCompras, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPreciosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPreciosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPreciosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPreciosCompras.setText("Nuevo");
		this.jButtonModificarPreciosCompras.setText("Editar");
        this.jButtonActualizarPreciosCompras.setText("Actualizar");
        this.jButtonEliminarPreciosCompras.setText("Eliminar");
        this.jButtonCancelarPreciosCompras.setText("Cancelar");
        this.jButtonGuardarCambiosPreciosCompras.setText("Guardar");
		this.jButtonGuardarCambiosTablaPreciosCompras.setText("Guardar");
		this.jButtonCerrarPreciosCompras.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPreciosCompras,"nuevo_button","Nuevo",this.precioscomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPreciosCompras,"modificar_button","Editar",this.precioscomprasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPreciosCompras,"actualizar_button","Actualizar",this.precioscomprasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPreciosCompras,"eliminar_button","Eliminar",this.precioscomprasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPreciosCompras,"cancelar_button","Cancelar",this.precioscomprasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPreciosCompras,"guardarcambios_button","Guardar",this.precioscomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPreciosCompras,"guardarcambiostabla_button","Guardar",this.precioscomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPreciosCompras,"cerrar_button","Salir",this.precioscomprasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPreciosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPreciosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPreciosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPreciosCompras.setToolTipText("Nuevo"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPreciosCompras.setToolTipText("Editar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPreciosCompras.setToolTipText("Actualizar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPreciosCompras.setToolTipText("Eliminar)"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPreciosCompras.setToolTipText("Cancelar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPreciosCompras.setToolTipText("Guardar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPreciosCompras.setToolTipText("Guardar"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPreciosCompras.setToolTipText("Salir"+" "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPreciosCompras";
		inputMap = this.jButtonNuevoPreciosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPreciosCompras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPreciosCompras"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPreciosCompras";
		inputMap = this.jButtonActualizarPreciosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPreciosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPreciosCompras"));
		
		//ELIMINAR
		sMapKey = "EliminarPreciosCompras";
		inputMap = this.jButtonEliminarPreciosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPreciosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPreciosCompras"));
		
		//CANCELAR	
		sMapKey = "CancelarPreciosCompras";
		inputMap = this.jButtonCancelarPreciosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPreciosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPreciosCompras"));
		
		//CERRAR		
		sMapKey = "CerrarPreciosCompras";
		inputMap = this.jButtonCerrarPreciosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPreciosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPreciosCompras"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPreciosCompras";
		inputMap = this.jButtonGuardarCambiosTablaPreciosCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPreciosCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPreciosCompras"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPreciosCompras = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPreciosCompras.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPreciosCompras.setToolTipText("Nuevo PreciosCompras");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPreciosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPreciosCompras = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPreciosCompras.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPreciosCompras.setToolTipText("Sin Cerrar Ventana PreciosCompras");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPreciosCompras, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePreciosCompras = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePreciosCompras.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePreciosCompras.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePreciosCompras, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPreciosCompras = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPreciosCompras.setText("Accion");
		this.jComboBoxTiposAccionesPreciosCompras.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPreciosCompras = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPreciosCompras.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPreciosCompras.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPreciosCompras = new JLabelMe();
		
		this.jLabelAccionesPreciosCompras.setText("Acciones");		
		this.jLabelAccionesPreciosCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPreciosCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPreciosCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPreciosCompras();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPreciosCompras();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPreciosCompras=new JTabbedPane();
		this.jTabbedPaneRelacionesPreciosCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPreciosCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPreciosCompras.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPreciosCompras.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPreciosCompras.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPreciosCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPreciosCompras.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPreciosCompras.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPreciosCompras.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPreciosCompras, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPreciosCompras = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPreciosCompras = new GridBagLayout();
		
		this.jPanelCamposPreciosCompras.setLayout(gridaBagLayoutCamposPreciosCompras);
		this.jPanelCamposOcultosPreciosCompras.setLayout(gridaBagLayoutCamposOcultosPreciosCompras);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 0;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPreciosCompras.add(jLabelIdPreciosCompras, this.gridBagConstraintsPreciosCompras);



	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 1;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPreciosCompras.add(jLabelidPreciosCompras, this.gridBagConstraintsPreciosCompras);


	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 0;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPreciosCompras.add(jLabelid_empresaPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 2;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPreciosCompras.add(jButtonid_empresaPreciosComprasBusqueda, this.gridBagConstraintsPreciosCompras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 3;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPreciosCompras.add(jButtonid_empresaPreciosComprasUpdate, this.gridBagConstraintsPreciosCompras);
	}

	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 1;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPreciosCompras.add(jComboBoxid_empresaPreciosCompras, this.gridBagConstraintsPreciosCompras);


	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 0;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPreciosCompras.add(jLabelid_sucursalPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 2;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPreciosCompras.add(jButtonid_sucursalPreciosComprasBusqueda, this.gridBagConstraintsPreciosCompras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 3;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPreciosCompras.add(jButtonid_sucursalPreciosComprasUpdate, this.gridBagConstraintsPreciosCompras);
	}

	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 1;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPreciosCompras.add(jComboBoxid_sucursalPreciosCompras, this.gridBagConstraintsPreciosCompras);


	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 0;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaPreciosCompras.add(jLabelid_bodegaPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 2;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaPreciosCompras.add(jButtonid_bodegaPreciosComprasBusqueda, this.gridBagConstraintsPreciosCompras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 3;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaPreciosCompras.add(jButtonid_bodegaPreciosComprasUpdate, this.gridBagConstraintsPreciosCompras);
	}

	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 1;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaPreciosCompras.add(jComboBoxid_bodegaPreciosCompras, this.gridBagConstraintsPreciosCompras);


	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 0;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoPreciosCompras.add(jLabelid_productoPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 2;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoPreciosCompras.add(jButtonid_productoPreciosComprasBusqueda, this.gridBagConstraintsPreciosCompras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 3;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoPreciosCompras.add(jButtonid_productoPreciosComprasUpdate, this.gridBagConstraintsPreciosCompras);
	}

	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 1;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoPreciosCompras.add(jComboBoxid_productoPreciosCompras, this.gridBagConstraintsPreciosCompras);


	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 0;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccionPreciosCompras.add(jLabelid_transaccionPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 2;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionPreciosCompras.add(jButtonid_transaccionPreciosComprasBusqueda, this.gridBagConstraintsPreciosCompras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 3;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionPreciosCompras.add(jButtonid_transaccionPreciosComprasUpdate, this.gridBagConstraintsPreciosCompras);
	}

	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 1;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccionPreciosCompras.add(jComboBoxid_transaccionPreciosCompras, this.gridBagConstraintsPreciosCompras);


	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 0;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaPreciosCompras.add(jLabelid_lineaPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 2;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaPreciosCompras.add(jButtonid_lineaPreciosComprasBusqueda, this.gridBagConstraintsPreciosCompras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 3;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaPreciosCompras.add(jButtonid_lineaPreciosComprasUpdate, this.gridBagConstraintsPreciosCompras);
	}

	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 1;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaPreciosCompras.add(jComboBoxid_lineaPreciosCompras, this.gridBagConstraintsPreciosCompras);


	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 0;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoPreciosCompras.add(jLabelid_linea_grupoPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 2;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoPreciosCompras.add(jButtonid_linea_grupoPreciosComprasBusqueda, this.gridBagConstraintsPreciosCompras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 3;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoPreciosCompras.add(jButtonid_linea_grupoPreciosComprasUpdate, this.gridBagConstraintsPreciosCompras);
	}

	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 1;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoPreciosCompras.add(jComboBoxid_linea_grupoPreciosCompras, this.gridBagConstraintsPreciosCompras);


	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 0;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaPreciosCompras.add(jLabelid_linea_categoriaPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 2;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaPreciosCompras.add(jButtonid_linea_categoriaPreciosComprasBusqueda, this.gridBagConstraintsPreciosCompras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 3;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaPreciosCompras.add(jButtonid_linea_categoriaPreciosComprasUpdate, this.gridBagConstraintsPreciosCompras);
	}

	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 1;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaPreciosCompras.add(jComboBoxid_linea_categoriaPreciosCompras, this.gridBagConstraintsPreciosCompras);


	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 0;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaPreciosCompras.add(jLabelid_linea_marcaPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 2;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaPreciosCompras.add(jButtonid_linea_marcaPreciosComprasBusqueda, this.gridBagConstraintsPreciosCompras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 3;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaPreciosCompras.add(jButtonid_linea_marcaPreciosComprasUpdate, this.gridBagConstraintsPreciosCompras);
	}

	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 1;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaPreciosCompras.add(jComboBoxid_linea_marcaPreciosCompras, this.gridBagConstraintsPreciosCompras);


	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 0;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdePreciosCompras.add(jLabelfecha_emision_desdePreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 2;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdePreciosCompras.add(jButtonfecha_emision_desdePreciosComprasBusqueda, this.gridBagConstraintsPreciosCompras);
	}

	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 1;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdePreciosCompras.add(jDateChooserfecha_emision_desdePreciosCompras, this.gridBagConstraintsPreciosCompras);


	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 0;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaPreciosCompras.add(jLabelfecha_emision_hastaPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 2;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaPreciosCompras.add(jButtonfecha_emision_hastaPreciosComprasBusqueda, this.gridBagConstraintsPreciosCompras);
	}

	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 1;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaPreciosCompras.add(jDateChooserfecha_emision_hastaPreciosCompras, this.gridBagConstraintsPreciosCompras);


	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 0;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_clientePreciosCompras.add(jLabelnombre_completo_clientePreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 2;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_clientePreciosCompras.add(jButtonnombre_completo_clientePreciosComprasBusqueda, this.gridBagConstraintsPreciosCompras);
	}

	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 1;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_clientePreciosCompras.add(jscrollPanenombre_completo_clientePreciosCompras, this.gridBagConstraintsPreciosCompras);


	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 0;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobantePreciosCompras.add(jLabelnumero_comprobantePreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 2;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobantePreciosCompras.add(jButtonnumero_comprobantePreciosComprasBusqueda, this.gridBagConstraintsPreciosCompras);
	}

	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 1;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobantePreciosCompras.add(jTextFieldnumero_comprobantePreciosCompras, this.gridBagConstraintsPreciosCompras);


	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 0;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionPreciosCompras.add(jLabelfecha_emisionPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 2;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionPreciosCompras.add(jButtonfecha_emisionPreciosComprasBusqueda, this.gridBagConstraintsPreciosCompras);
	}

	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 1;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionPreciosCompras.add(jDateChooserfecha_emisionPreciosCompras, this.gridBagConstraintsPreciosCompras);


	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 0;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoPreciosCompras.add(jLabelnombre_productoPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 2;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoPreciosCompras.add(jButtonnombre_productoPreciosComprasBusqueda, this.gridBagConstraintsPreciosCompras);
	}

	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 1;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoPreciosCompras.add(jscrollPanenombre_productoPreciosCompras, this.gridBagConstraintsPreciosCompras);


	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 0;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_unitarioPreciosCompras.add(jLabelcosto_unitarioPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 2;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_unitarioPreciosCompras.add(jButtoncosto_unitarioPreciosComprasBusqueda, this.gridBagConstraintsPreciosCompras);
	}

	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 1;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_unitarioPreciosCompras.add(jTextFieldcosto_unitarioPreciosCompras, this.gridBagConstraintsPreciosCompras);


	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 0;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_productoPreciosCompras.add(jLabelcodigo_productoPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		//this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = 2;
		this.gridBagConstraintsPreciosCompras.ipadx = 0;
		this.gridBagConstraintsPreciosCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_productoPreciosCompras.add(jButtoncodigo_productoPreciosComprasBusqueda, this.gridBagConstraintsPreciosCompras);
	}

	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreciosCompras.gridy = 0;
	this.gridBagConstraintsPreciosCompras.gridx = 1;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_productoPreciosCompras.add(jTextFieldcodigo_productoPreciosCompras, this.gridBagConstraintsPreciosCompras);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreciosCompras.gridy = iYPanelCamposPreciosCompras;
	this.gridBagConstraintsPreciosCompras.gridx = iXPanelCamposPreciosCompras++;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreciosCompras.add(this.jPanelidPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(iXPanelCamposPreciosCompras % 2==0) {
		iXPanelCamposPreciosCompras=0;
		iYPanelCamposPreciosCompras++;
	}
	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreciosCompras.gridy = iYPanelCamposPreciosCompras;
	this.gridBagConstraintsPreciosCompras.gridx = iXPanelCamposPreciosCompras++;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreciosCompras.add(this.jPanelid_bodegaPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(iXPanelCamposPreciosCompras % 2==0) {
		iXPanelCamposPreciosCompras=0;
		iYPanelCamposPreciosCompras++;
	}
	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreciosCompras.gridy = iYPanelCamposPreciosCompras;
	this.gridBagConstraintsPreciosCompras.gridx = iXPanelCamposPreciosCompras++;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreciosCompras.add(this.jPanelid_productoPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(iXPanelCamposPreciosCompras % 2==0) {
		iXPanelCamposPreciosCompras=0;
		iYPanelCamposPreciosCompras++;
	}
	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreciosCompras.gridy = iYPanelCamposPreciosCompras;
	this.gridBagConstraintsPreciosCompras.gridx = iXPanelCamposPreciosCompras++;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreciosCompras.add(this.jPanelid_transaccionPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(iXPanelCamposPreciosCompras % 2==0) {
		iXPanelCamposPreciosCompras=0;
		iYPanelCamposPreciosCompras++;
	}
	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreciosCompras.gridy = iYPanelCamposPreciosCompras;
	this.gridBagConstraintsPreciosCompras.gridx = iXPanelCamposPreciosCompras++;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreciosCompras.add(this.jPanelid_lineaPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(iXPanelCamposPreciosCompras % 2==0) {
		iXPanelCamposPreciosCompras=0;
		iYPanelCamposPreciosCompras++;
	}
	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreciosCompras.gridy = iYPanelCamposPreciosCompras;
	this.gridBagConstraintsPreciosCompras.gridx = iXPanelCamposPreciosCompras++;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreciosCompras.add(this.jPanelid_linea_grupoPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(iXPanelCamposPreciosCompras % 2==0) {
		iXPanelCamposPreciosCompras=0;
		iYPanelCamposPreciosCompras++;
	}
	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreciosCompras.gridy = iYPanelCamposPreciosCompras;
	this.gridBagConstraintsPreciosCompras.gridx = iXPanelCamposPreciosCompras++;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreciosCompras.add(this.jPanelid_linea_categoriaPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(iXPanelCamposPreciosCompras % 2==0) {
		iXPanelCamposPreciosCompras=0;
		iYPanelCamposPreciosCompras++;
	}
	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreciosCompras.gridy = iYPanelCamposPreciosCompras;
	this.gridBagConstraintsPreciosCompras.gridx = iXPanelCamposPreciosCompras++;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreciosCompras.add(this.jPanelid_linea_marcaPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(iXPanelCamposPreciosCompras % 2==0) {
		iXPanelCamposPreciosCompras=0;
		iYPanelCamposPreciosCompras++;
	}
	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreciosCompras.gridy = iYPanelCamposPreciosCompras;
	this.gridBagConstraintsPreciosCompras.gridx = iXPanelCamposPreciosCompras++;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreciosCompras.add(this.jPanelfecha_emision_desdePreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(iXPanelCamposPreciosCompras % 2==0) {
		iXPanelCamposPreciosCompras=0;
		iYPanelCamposPreciosCompras++;
	}
	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreciosCompras.gridy = iYPanelCamposPreciosCompras;
	this.gridBagConstraintsPreciosCompras.gridx = iXPanelCamposPreciosCompras++;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreciosCompras.add(this.jPanelfecha_emision_hastaPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(iXPanelCamposPreciosCompras % 2==0) {
		iXPanelCamposPreciosCompras=0;
		iYPanelCamposPreciosCompras++;
	}
	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreciosCompras.gridy = iYPanelCamposPreciosCompras;
	this.gridBagConstraintsPreciosCompras.gridx = iXPanelCamposPreciosCompras++;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreciosCompras.add(this.jPanelnombre_completo_clientePreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(iXPanelCamposPreciosCompras % 2==0) {
		iXPanelCamposPreciosCompras=0;
		iYPanelCamposPreciosCompras++;
	}
	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreciosCompras.gridy = iYPanelCamposPreciosCompras;
	this.gridBagConstraintsPreciosCompras.gridx = iXPanelCamposPreciosCompras++;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreciosCompras.add(this.jPanelnumero_comprobantePreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(iXPanelCamposPreciosCompras % 2==0) {
		iXPanelCamposPreciosCompras=0;
		iYPanelCamposPreciosCompras++;
	}
	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreciosCompras.gridy = iYPanelCamposPreciosCompras;
	this.gridBagConstraintsPreciosCompras.gridx = iXPanelCamposPreciosCompras++;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreciosCompras.add(this.jPanelfecha_emisionPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(iXPanelCamposPreciosCompras % 2==0) {
		iXPanelCamposPreciosCompras=0;
		iYPanelCamposPreciosCompras++;
	}
	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreciosCompras.gridy = iYPanelCamposPreciosCompras;
	this.gridBagConstraintsPreciosCompras.gridx = iXPanelCamposPreciosCompras++;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreciosCompras.add(this.jPanelnombre_productoPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(iXPanelCamposPreciosCompras % 2==0) {
		iXPanelCamposPreciosCompras=0;
		iYPanelCamposPreciosCompras++;
	}
	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreciosCompras.gridy = iYPanelCamposPreciosCompras;
	this.gridBagConstraintsPreciosCompras.gridx = iXPanelCamposPreciosCompras++;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreciosCompras.add(this.jPanelcosto_unitarioPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(iXPanelCamposPreciosCompras % 2==0) {
		iXPanelCamposPreciosCompras=0;
		iYPanelCamposPreciosCompras++;
	}
	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreciosCompras.gridy = iYPanelCamposPreciosCompras;
	this.gridBagConstraintsPreciosCompras.gridx = iXPanelCamposPreciosCompras++;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreciosCompras.add(this.jPanelcodigo_productoPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(iXPanelCamposPreciosCompras % 2==0) {
		iXPanelCamposPreciosCompras=0;
		iYPanelCamposPreciosCompras++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreciosCompras.gridy = iYPanelCamposOcultosPreciosCompras;
	this.gridBagConstraintsPreciosCompras.gridx = iXPanelCamposOcultosPreciosCompras++;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPreciosCompras.add(this.jPanelid_empresaPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(iXPanelCamposOcultosPreciosCompras % 2==0) {
		iXPanelCamposOcultosPreciosCompras=0;
		iYPanelCamposOcultosPreciosCompras++;
	}
	this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreciosCompras.gridy = iYPanelCamposOcultosPreciosCompras;
	this.gridBagConstraintsPreciosCompras.gridx = iXPanelCamposOcultosPreciosCompras++;
	this.gridBagConstraintsPreciosCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreciosCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPreciosCompras.add(this.jPanelid_sucursalPreciosCompras, this.gridBagConstraintsPreciosCompras);



	if(iXPanelCamposOcultosPreciosCompras % 2==0) {
		iXPanelCamposOcultosPreciosCompras=0;
		iYPanelCamposOcultosPreciosCompras++;
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
			
		GridBagLayout gridaBagLayoutAccionesPreciosCompras= new GridBagLayout();
		this.jPanelAccionesPreciosCompras.setLayout(gridaBagLayoutAccionesPreciosCompras);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPreciosCompras= new GridBagLayout();
		this.jPanelAccionesFormularioPreciosCompras.setLayout(gridaBagLayoutAccionesFormularioPreciosCompras);
		
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPreciosCompras.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPreciosCompras.add(this.jComboBoxTiposAccionesFormularioPreciosCompras, this.gridBagConstraintsPreciosCompras);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx = iPosXAccion++;
			
		this.jPanelAccionesPreciosCompras.add(this.jButtonModificarPreciosCompras, this.gridBagConstraintsPreciosCompras);							

		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreciosCompras.gridy = 0;
		this.gridBagConstraintsPreciosCompras.gridx =iPosXAccion++;
			
		this.jPanelAccionesPreciosCompras.add(this.jButtonEliminarPreciosCompras, this.gridBagConstraintsPreciosCompras);
		
			
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.gridy = 0;		
		this.gridBagConstraintsPreciosCompras.gridx = iPosXAccion++;
		
		this.jPanelAccionesPreciosCompras.add(this.jButtonActualizarPreciosCompras, this.gridBagConstraintsPreciosCompras);


		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.gridy = 0;		
		this.gridBagConstraintsPreciosCompras.gridx = iPosXAccion++;
		
		this.jPanelAccionesPreciosCompras.add(this.jButtonGuardarCambiosPreciosCompras, this.gridBagConstraintsPreciosCompras);	
		
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.gridy = 0;		
		this.gridBagConstraintsPreciosCompras.gridx =iPosXAccion++;
		
		this.jPanelAccionesPreciosCompras.add(this.jButtonCancelarPreciosCompras, this.gridBagConstraintsPreciosCompras);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPreciosCompras = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPreciosCompras);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.precioscomprasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();						
			this.gridBagConstraintsPreciosCompras.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPreciosCompras.gridx = 0;		
			//this.gridBagConstraintsPreciosCompras.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPreciosCompras.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPreciosCompras.gridx =0;
		this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPreciosCompras.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPreciosCompras, this.gridBagConstraintsPreciosCompras);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PreciosComprasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePreciosCompras = new PreciosComprasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Precios Compras DATOS");
			
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
			
	        //this.setTitle("[FOR] - Precios Compras DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Precios Compras Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PreciosComprasModel precioscomprasModel=new PreciosComprasModel(this);
			
			//SI USARA CLASE INTERNA
			//PreciosComprasModel.PreciosComprasFocusTraversalPolicy precioscomprasFocusTraversalPolicy = precioscomprasModel.new PreciosComprasFocusTraversalPolicy(this);
			
			//precioscomprasFocusTraversalPolicy.setprecioscomprasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(precioscomprasModel);
			
			
			this.jContentPaneDetallePreciosCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePreciosCompras = new GridBagLayout();	
			this.jContentPaneDetallePreciosCompras.setLayout(gridaBagLayoutDetallePreciosCompras);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPreciosCompras = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
				this.gridBagConstraintsPreciosCompras.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPreciosCompras.gridx = 0;
					
				
				this.jContentPaneDetallePreciosCompras.add(jTtoolBarDetallePreciosCompras, gridBagConstraintsPreciosCompras);								
				
}
			
			this.jScrollPanelDatosEdicionPreciosCompras=   new JScrollPane(jContentPaneDetallePreciosCompras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPreciosCompras.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPreciosCompras.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPreciosCompras.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPreciosCompras=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPreciosCompras.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPreciosCompras.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPreciosCompras.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPreciosCompras.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPreciosCompras.gridx = 0;
	        
			this.jContentPaneDetallePreciosCompras.add(jPanelCamposPreciosCompras, gridBagConstraintsPreciosCompras);
			
			
			
			
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
						//&& precioscomprasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.precioscomprasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPreciosCompras= new GridBagConstraints();
						this.gridBagConstraintsPreciosCompras.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPreciosCompras.gridx = 0;
						this.jContentPaneDetallePreciosCompras.add(this.jTabbedPaneRelacionesPreciosCompras, this.gridBagConstraintsPreciosCompras);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPreciosCompras.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPreciosCompras.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
					this.gridBagConstraintsPreciosCompras.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPreciosCompras.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPreciosCompras.gridx = 0;
					
				
					this.jContentPaneDetallePreciosCompras.add(jPanelCamposOcultosPreciosCompras, gridBagConstraintsPreciosCompras);
				
					this.jPanelCamposOcultosPreciosCompras.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPreciosCompras.gridx = 0;
	        this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePreciosCompras.add(this.jPanelAccionesFormularioPreciosCompras, this.gridBagConstraintsPreciosCompras);							
			
			
			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
	        this.gridBagConstraintsPreciosCompras.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPreciosCompras.gridx = 0;
	        
			
			this.jContentPaneDetallePreciosCompras.add(this.jPanelAccionesPreciosCompras, this.gridBagConstraintsPreciosCompras);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPreciosCompras);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPreciosCompras=   new JScrollPane(this.jPanelCamposPreciosCompras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPreciosCompras.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPreciosCompras.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPreciosCompras.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPreciosCompras.gridx = 0;
			this.gridBagConstraintsPreciosCompras.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPreciosCompras.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPreciosCompras.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPreciosCompras, this.gridBagConstraintsPreciosCompras);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPreciosCompras.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPreciosCompras, this.gridBagConstraintsPreciosCompras);			
			
			this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
			this.gridBagConstraintsPreciosCompras.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPreciosCompras.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPreciosCompras, this.gridBagConstraintsPreciosCompras);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreciosCompras.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPreciosCompras, this.gridBagConstraintsPreciosCompras);
			
			
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreciosCompras.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPreciosCompras, this.gridBagConstraintsPreciosCompras);
		
			
		this.gridBagConstraintsPreciosCompras = new GridBagConstraints();
		this.gridBagConstraintsPreciosCompras.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPreciosCompras.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPreciosCompras, this.gridBagConstraintsPreciosCompras);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPreciosCompras;//jContentPane;
		
		return jScrollPanelDatosEdicionPreciosCompras;
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
