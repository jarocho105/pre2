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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.report.InformesDevolucionesConstantesFunciones;

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
public class InformesDevolucionesDetalleFormJInternalFrame extends InformesDevolucionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleInformesDevoluciones;
	
	protected JMenuBar jmenuBarDetalleInformesDevoluciones;
	
	protected JMenu jmenuDetalleInformesDevoluciones;
	protected JMenu jmenuDetalleArchivoInformesDevoluciones;
	protected JMenu jmenuDetalleAccionesInformesDevoluciones;
	protected JMenu jmenuDetalleDatosInformesDevoluciones;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleInformesDevoluciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutInformesDevoluciones;	
	protected GridBagConstraints gridBagConstraintsInformesDevoluciones;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected InformesDevolucionesBeanSwingJInternalFrameAdditional jInternalFrameDetalleInformesDevoluciones;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected TipoDevolucionEmpresaBeanSwingJInternalFrame tipodevolucionempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodevolucionempresa="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public InformesDevolucionesSessionBean informesdevolucionesSessionBean;
	
	
	
	
	public ProductoSessionBean productoSessionBean;
	public TipoDevolucionEmpresaSessionBean tipodevolucionempresaSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;	
	
	public InformesDevolucionesLogic informesdevolucionesLogic;
	
	public JScrollPane jScrollPanelDatosInformesDevoluciones;
	public JScrollPane jScrollPanelDatosEdicionInformesDevoluciones;
	public JScrollPane jScrollPanelDatosGeneralInformesDevoluciones;
	
	protected JPanel jPanelCamposInformesDevoluciones;    
	protected JPanel jPanelCamposOcultosInformesDevoluciones;    	
	protected JPanel jPanelAccionesInformesDevoluciones;
	protected JPanel jPanelAccionesFormularioInformesDevoluciones;
    
	
	
	protected Integer iXPanelCamposInformesDevoluciones=0;
	protected Integer iYPanelCamposInformesDevoluciones=0;
	
	protected Integer iXPanelCamposOcultosInformesDevoluciones=0;
	protected Integer iYPanelCamposOcultosInformesDevoluciones=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoInformesDevoluciones;
	public JButton jButtonModificarInformesDevoluciones;
	public JButton jButtonActualizarInformesDevoluciones;
    public JButton jButtonEliminarInformesDevoluciones;
	public JButton jButtonCancelarInformesDevoluciones;
    public JButton jButtonGuardarCambiosInformesDevoluciones;
	public JButton jButtonGuardarCambiosTablaInformesDevoluciones;
	protected JButton jButtonCerrarInformesDevoluciones;
	
	
	protected JButton jButtonProcesarInformacionInformesDevoluciones;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoInformesDevoluciones;
	protected JCheckBox jCheckBoxPostAccionSinCerrarInformesDevoluciones;
	protected JCheckBox jCheckBoxPostAccionSinMensajeInformesDevoluciones;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarInformesDevoluciones;
	protected JButton jButtonModificarToolBarInformesDevoluciones;
	protected JButton jButtonActualizarToolBarInformesDevoluciones;
    protected JButton jButtonEliminarToolBarInformesDevoluciones;
	protected JButton jButtonCancelarToolBarInformesDevoluciones;
    protected JButton jButtonGuardarCambiosToolBarInformesDevoluciones;
	protected JButton jButtonGuardarCambiosTablaToolBarInformesDevoluciones;
	protected JButton jButtonMostrarOcultarTablaToolBarInformesDevoluciones;
	protected JButton jButtonCerrarToolBarInformesDevoluciones;
	
	protected JButton jButtonProcesarInformacionToolBarInformesDevoluciones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoInformesDevoluciones;
	protected JMenuItem jMenuItemModificarInformesDevoluciones;
	protected JMenuItem jMenuItemActualizarInformesDevoluciones;
    protected JMenuItem jMenuItemEliminarInformesDevoluciones;
	protected JMenuItem jMenuItemCancelarInformesDevoluciones;
    protected JMenuItem jMenuItemGuardarCambiosInformesDevoluciones;
	protected JMenuItem jMenuItemGuardarCambiosTablaInformesDevoluciones;
	protected JMenuItem jMenuItemCerrarInformesDevoluciones;
	protected JMenuItem jMenuItemDetalleCerrarInformesDevoluciones;
	protected JMenuItem jMenuItemDetalleMostarOcultarInformesDevoluciones;
	
	protected JMenuItem jMenuItemProcesarInformacionInformesDevoluciones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosInformesDevoluciones;
	protected JMenuItem jMenuItemMostrarOcultarInformesDevoluciones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesInformesDevoluciones;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesInformesDevoluciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesInformesDevoluciones;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioInformesDevoluciones;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidInformesDevoluciones;
	public JLabel jLabelIdInformesDevoluciones;
	public JLabel jLabelidInformesDevoluciones;
	public JButton jButtonidInformesDevolucionesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeInformesDevoluciones;
	public JLabel jLabelfecha_emision_desdeInformesDevoluciones;
	//public JFormattedTextField jDateChooserfecha_emision_desdeInformesDevoluciones;

	public JDateChooser jDateChooserfecha_emision_desdeInformesDevoluciones;
	public JButton jButtonfecha_emision_desdeInformesDevolucionesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaInformesDevoluciones;
	public JLabel jLabelfecha_emision_hastaInformesDevoluciones;
	//public JFormattedTextField jDateChooserfecha_emision_hastaInformesDevoluciones;

	public JDateChooser jDateChooserfecha_emision_hastaInformesDevoluciones;
	public JButton jButtonfecha_emision_hastaInformesDevolucionesBusqueda= new JButtonMe();

	public JPanel jPaneluser_name_usuarioInformesDevoluciones;
	public JLabel jLabeluser_name_usuarioInformesDevoluciones;
	public JTextField jTextFielduser_name_usuarioInformesDevoluciones;
	public JButton jButtonuser_name_usuarioInformesDevolucionesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_clienteInformesDevoluciones;
	public JLabel jLabelnombre_completo_clienteInformesDevoluciones;
	public JTextArea jTextAreanombre_completo_clienteInformesDevoluciones;
	public JScrollPane jscrollPanenombre_completo_clienteInformesDevoluciones;
	public JButton jButtonnombre_completo_clienteInformesDevolucionesBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impresoInformesDevoluciones;
	public JLabel jLabelnumero_pre_impresoInformesDevoluciones;
	public JTextField jTextFieldnumero_pre_impresoInformesDevoluciones;
	public JButton jButtonnumero_pre_impresoInformesDevolucionesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionInformesDevoluciones;
	public JLabel jLabelfecha_emisionInformesDevoluciones;
	//public JFormattedTextField jDateChooserfecha_emisionInformesDevoluciones;

	public JDateChooser jDateChooserfecha_emisionInformesDevoluciones;
	public JButton jButtonfecha_emisionInformesDevolucionesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_bodegaInformesDevoluciones;
	public JLabel jLabelnombre_bodegaInformesDevoluciones;
	public JTextArea jTextAreanombre_bodegaInformesDevoluciones;
	public JScrollPane jscrollPanenombre_bodegaInformesDevoluciones;
	public JButton jButtonnombre_bodegaInformesDevolucionesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoInformesDevoluciones;
	public JLabel jLabelnombre_productoInformesDevoluciones;
	public JTextArea jTextAreanombre_productoInformesDevoluciones;
	public JScrollPane jscrollPanenombre_productoInformesDevoluciones;
	public JButton jButtonnombre_productoInformesDevolucionesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_devolucion_empresaInformesDevoluciones;
	public JLabel jLabelnombre_tipo_devolucion_empresaInformesDevoluciones;
	public JTextArea jTextAreanombre_tipo_devolucion_empresaInformesDevoluciones;
	public JScrollPane jscrollPanenombre_tipo_devolucion_empresaInformesDevoluciones;
	public JButton jButtonnombre_tipo_devolucion_empresaInformesDevolucionesBusqueda= new JButtonMe();

	public JPanel jPanelcantidadInformesDevoluciones;
	public JLabel jLabelcantidadInformesDevoluciones;
	public JTextField jTextFieldcantidadInformesDevoluciones;
	public JButton jButtoncantidadInformesDevolucionesBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_productoInformesDevoluciones;
	public JLabel jLabelcodigo_productoInformesDevoluciones;
	public JTextField jTextFieldcodigo_productoInformesDevoluciones;
	public JButton jButtoncodigo_productoInformesDevolucionesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoInformesDevoluciones;
	public JLabel jLabelid_productoInformesDevoluciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoInformesDevoluciones;
	public JButton jButtonid_productoInformesDevoluciones= new JButtonMe();
	public JButton jButtonid_productoInformesDevolucionesUpdate= new JButtonMe();
	public JButton jButtonid_productoInformesDevolucionesBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_devolucion_empresaInformesDevoluciones;
	public JLabel jLabelid_tipo_devolucion_empresaInformesDevoluciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_devolucion_empresaInformesDevoluciones;
	public JButton jButtonid_tipo_devolucion_empresaInformesDevoluciones= new JButtonMe();
	public JButton jButtonid_tipo_devolucion_empresaInformesDevolucionesUpdate= new JButtonMe();
	public JButton jButtonid_tipo_devolucion_empresaInformesDevolucionesBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaInformesDevoluciones;
	public JLabel jLabelid_empresaInformesDevoluciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaInformesDevoluciones;
	public JButton jButtonid_empresaInformesDevoluciones= new JButtonMe();
	public JButton jButtonid_empresaInformesDevolucionesUpdate= new JButtonMe();
	public JButton jButtonid_empresaInformesDevolucionesBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalInformesDevoluciones;
	public JLabel jLabelid_sucursalInformesDevoluciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalInformesDevoluciones;
	public JButton jButtonid_sucursalInformesDevoluciones= new JButtonMe();
	public JButton jButtonid_sucursalInformesDevolucionesUpdate= new JButtonMe();
	public JButton jButtonid_sucursalInformesDevolucionesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesInformesDevoluciones;
	
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
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public InformesDevolucionesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposInformesDevoluciones=new JPanel();
				this.jPanelAccionesFormularioInformesDevoluciones=new JPanel();
				this.jmenuBarDetalleInformesDevoluciones=new JMenuBar();
				this.jTtoolBarDetalleInformesDevoluciones=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformesDevolucionesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("InformesDevoluciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public InformesDevolucionesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("InformesDevoluciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformesDevolucionesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("InformesDevoluciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformesDevolucionesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("InformesDevoluciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformesDevolucionesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("InformesDevoluciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarInformesDevoluciones() {
		return this.jButtonActualizarToolBarInformesDevoluciones;
	}
	
	public JButton getjButtonEliminarToolBarInformesDevoluciones() {
		return this.jButtonEliminarToolBarInformesDevoluciones;
	}
	
	public JButton getjButtonCancelarToolBarInformesDevoluciones() {
		return this.jButtonCancelarToolBarInformesDevoluciones;
	}		
	
	public JButton getjButtonProcesarInformacionInformesDevoluciones() {
		return this.jButtonProcesarInformacionInformesDevoluciones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionInformesDevoluciones)	{
		this.jButtonProcesarInformacionInformesDevoluciones = jButtonProcesarInformacionInformesDevoluciones;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesInformesDevoluciones() {
		return this.jComboBoxTiposAccionesInformesDevoluciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesInformesDevoluciones(
			JComboBox jComboBoxTiposRelacionesInformesDevoluciones) {
		this.jComboBoxTiposRelacionesInformesDevoluciones = jComboBoxTiposRelacionesInformesDevoluciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesInformesDevoluciones(
			JComboBox jComboBoxTiposAccionesInformesDevoluciones) {
		this.jComboBoxTiposAccionesInformesDevoluciones = jComboBoxTiposAccionesInformesDevoluciones;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioInformesDevoluciones() {
		return this.jComboBoxTiposAccionesFormularioInformesDevoluciones;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioInformesDevoluciones(
			JComboBox jComboBoxTiposAccionesFormularioInformesDevoluciones) {
		this.jComboBoxTiposAccionesFormularioInformesDevoluciones = jComboBoxTiposAccionesFormularioInformesDevoluciones;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.informesdevolucionesSessionBean=new InformesDevolucionesSessionBean();
		
		this.informesdevolucionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.informesdevolucionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.informesdevolucionesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		InformesDevolucionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		InformesDevolucionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		InformesDevolucionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Informes Devoluciones MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
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
	
		InformesDevolucionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleInformesDevoluciones= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarInformesDevoluciones=new JButtonMe();
				this.jButtonModificarToolBarInformesDevoluciones=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarInformesDevoluciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarInformesDevoluciones,this.jTtoolBarDetalleInformesDevoluciones,
							"actualizar","actualizar","Actualizar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarInformesDevoluciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarInformesDevoluciones,this.jTtoolBarDetalleInformesDevoluciones,
							"eliminar","eliminar","Eliminar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarInformesDevoluciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarInformesDevoluciones,this.jTtoolBarDetalleInformesDevoluciones,
							"cancelar","cancelar","Cancelar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarInformesDevoluciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarInformesDevoluciones,this.jTtoolBarDetalleInformesDevoluciones,
							"guardarcambios","guardarcambios","Guardar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleInformesDevoluciones=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleInformesDevoluciones=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoInformesDevoluciones=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesInformesDevoluciones=new JMenuMe("Acciones");
		this.jmenuDetalleDatosInformesDevoluciones=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoInformesDevoluciones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoInformesDevoluciones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoInformesDevoluciones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarInformesDevoluciones= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarInformesDevoluciones.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarInformesDevoluciones,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarInformesDevoluciones= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarInformesDevoluciones.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarInformesDevoluciones,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarInformesDevoluciones= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarInformesDevoluciones.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarInformesDevoluciones,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarInformesDevoluciones= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarInformesDevoluciones.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarInformesDevoluciones,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosInformesDevoluciones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosInformesDevoluciones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosInformesDevoluciones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarInformesDevoluciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarInformesDevoluciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarInformesDevoluciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarInformesDevoluciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarInformesDevoluciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarInformesDevoluciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarInformesDevoluciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarInformesDevoluciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarInformesDevoluciones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarInformesDevoluciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarInformesDevoluciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarInformesDevoluciones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoInformesDevoluciones.add(this.jMenuItemDetalleCerrarInformesDevoluciones);
		
		this.jmenuDetalleAccionesInformesDevoluciones.add(this.jMenuItemActualizarInformesDevoluciones);
		this.jmenuDetalleAccionesInformesDevoluciones.add(this.jMenuItemEliminarInformesDevoluciones);
		this.jmenuDetalleAccionesInformesDevoluciones.add(this.jMenuItemCancelarInformesDevoluciones);		
		
		//this.jmenuDetalleDatosInformesDevoluciones.add(this.jMenuItemDetalleAbrirOrderByInformesDevoluciones);				
		this.jmenuDetalleDatosInformesDevoluciones.add(this.jMenuItemDetalleMostarOcultarInformesDevoluciones);				
				
		//this.jmenuDetalleAccionesInformesDevoluciones.add(this.jMenuItemGuardarCambiosInformesDevoluciones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleInformesDevoluciones.add(this.jmenuDetalleArchivoInformesDevoluciones);		
		this.jmenuBarDetalleInformesDevoluciones.add(this.jmenuDetalleAccionesInformesDevoluciones);		
		this.jmenuBarDetalleInformesDevoluciones.add(this.jmenuDetalleDatosInformesDevoluciones);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleInformesDevoluciones);				
	}
	
	
	public void inicializarElementosCamposInformesDevoluciones() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdInformesDevoluciones = new JLabelMe();
		jLabelIdInformesDevoluciones.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidInformesDevoluciones = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidInformesDevoluciones.setToolTipText(InformesDevolucionesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutInformesDevoluciones= new GridBagLayout();

		this.jPanelidInformesDevoluciones.setLayout(this.gridaBagLayoutInformesDevoluciones);

		jLabelidInformesDevoluciones = new JLabel();
		jLabelidInformesDevoluciones.setText("Id");

		jLabelidInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeInformesDevoluciones = new JLabelMe();
		this.jLabelfecha_emision_desdeInformesDevoluciones.setText(""+InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeInformesDevoluciones.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeInformesDevoluciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeInformesDevoluciones.setToolTipText(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutInformesDevoluciones = new GridBagLayout();
		this.jPanelfecha_emision_desdeInformesDevoluciones.setLayout(this.gridaBagLayoutInformesDevoluciones);


		//jFormattedTextFieldfecha_emision_desdeInformesDevoluciones= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeInformesDevoluciones= new JDateChooser();
		jDateChooserfecha_emision_desdeInformesDevoluciones.setEnabled(false);
		jDateChooserfecha_emision_desdeInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeInformesDevoluciones.setDate(new Date());
		jDateChooserfecha_emision_desdeInformesDevoluciones.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeInformesDevoluciones.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeInformesDevolucionesBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeInformesDevolucionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeInformesDevolucionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeInformesDevolucionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeInformesDevolucionesBusqueda.setText("U");
		this.jButtonfecha_emision_desdeInformesDevolucionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeInformesDevolucionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeInformesDevolucionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeInformesDevolucionesBusqueda"));

		if(this.informesdevolucionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeInformesDevolucionesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaInformesDevoluciones = new JLabelMe();
		this.jLabelfecha_emision_hastaInformesDevoluciones.setText(""+InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaInformesDevoluciones.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaInformesDevoluciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaInformesDevoluciones.setToolTipText(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutInformesDevoluciones = new GridBagLayout();
		this.jPanelfecha_emision_hastaInformesDevoluciones.setLayout(this.gridaBagLayoutInformesDevoluciones);


		//jFormattedTextFieldfecha_emision_hastaInformesDevoluciones= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaInformesDevoluciones= new JDateChooser();
		jDateChooserfecha_emision_hastaInformesDevoluciones.setEnabled(false);
		jDateChooserfecha_emision_hastaInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaInformesDevoluciones.setDate(new Date());
		jDateChooserfecha_emision_hastaInformesDevoluciones.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaInformesDevoluciones.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaInformesDevolucionesBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaInformesDevolucionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaInformesDevolucionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaInformesDevolucionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaInformesDevolucionesBusqueda.setText("U");
		this.jButtonfecha_emision_hastaInformesDevolucionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaInformesDevolucionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaInformesDevolucionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaInformesDevolucionesBusqueda"));

		if(this.informesdevolucionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaInformesDevolucionesBusqueda.setVisible(false);		}


					
		this.jLabeluser_name_usuarioInformesDevoluciones = new JLabelMe();
		this.jLabeluser_name_usuarioInformesDevoluciones.setText(""+InformesDevolucionesConstantesFunciones.LABEL_USERNAMEUSUARIO+" : *");
		this.jLabeluser_name_usuarioInformesDevoluciones.setToolTipText("User Name Usuario");
		this.jLabeluser_name_usuarioInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeluser_name_usuarioInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeluser_name_usuarioInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeluser_name_usuarioInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneluser_name_usuarioInformesDevoluciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneluser_name_usuarioInformesDevoluciones.setToolTipText(InformesDevolucionesConstantesFunciones.LABEL_USERNAMEUSUARIO);
		this.gridaBagLayoutInformesDevoluciones = new GridBagLayout();
		this.jPaneluser_name_usuarioInformesDevoluciones.setLayout(this.gridaBagLayoutInformesDevoluciones);


		jTextFielduser_name_usuarioInformesDevoluciones= new JTextFieldMe();

		jTextFielduser_name_usuarioInformesDevoluciones.setEnabled(false);
		jTextFielduser_name_usuarioInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielduser_name_usuarioInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielduser_name_usuarioInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielduser_name_usuarioInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonuser_name_usuarioInformesDevolucionesBusqueda= new JButtonMe();
		this.jButtonuser_name_usuarioInformesDevolucionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonuser_name_usuarioInformesDevolucionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonuser_name_usuarioInformesDevolucionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonuser_name_usuarioInformesDevolucionesBusqueda.setText("U");
		this.jButtonuser_name_usuarioInformesDevolucionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonuser_name_usuarioInformesDevolucionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonuser_name_usuarioInformesDevolucionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielduser_name_usuarioInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielduser_name_usuarioInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"user_name_usuarioInformesDevolucionesBusqueda"));

		if(this.informesdevolucionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonuser_name_usuarioInformesDevolucionesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_clienteInformesDevoluciones = new JLabelMe();
		this.jLabelnombre_completo_clienteInformesDevoluciones.setText(""+InformesDevolucionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+" : *");
		this.jLabelnombre_completo_clienteInformesDevoluciones.setToolTipText("Nombre Completo Cliente");
		this.jLabelnombre_completo_clienteInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_clienteInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_clienteInformesDevoluciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_clienteInformesDevoluciones.setToolTipText(InformesDevolucionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		this.gridaBagLayoutInformesDevoluciones = new GridBagLayout();
		this.jPanelnombre_completo_clienteInformesDevoluciones.setLayout(this.gridaBagLayoutInformesDevoluciones);


		jTextAreanombre_completo_clienteInformesDevoluciones= new JTextAreaMe();
		jTextAreanombre_completo_clienteInformesDevoluciones.setEnabled(false);
		jTextAreanombre_completo_clienteInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteInformesDevoluciones.setLineWrap(true);
		jTextAreanombre_completo_clienteInformesDevoluciones.setWrapStyleWord(true);
		jTextAreanombre_completo_clienteInformesDevoluciones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_clienteInformesDevoluciones.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_clienteInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_clienteInformesDevoluciones = new JScrollPane(jTextAreanombre_completo_clienteInformesDevoluciones);
		jscrollPanenombre_completo_clienteInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completo_clienteInformesDevolucionesBusqueda= new JButtonMe();
		this.jButtonnombre_completo_clienteInformesDevolucionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteInformesDevolucionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteInformesDevolucionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_clienteInformesDevolucionesBusqueda.setText("U");
		this.jButtonnombre_completo_clienteInformesDevolucionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_clienteInformesDevolucionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_clienteInformesDevolucionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_clienteInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_clienteInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_clienteInformesDevolucionesBusqueda"));

		if(this.informesdevolucionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_clienteInformesDevolucionesBusqueda.setVisible(false);		}


					
		this.jLabelnumero_pre_impresoInformesDevoluciones = new JLabelMe();
		this.jLabelnumero_pre_impresoInformesDevoluciones.setText(""+InformesDevolucionesConstantesFunciones.LABEL_NUMEROPREIMPRESO+" : *");
		this.jLabelnumero_pre_impresoInformesDevoluciones.setToolTipText("Numero Pre Impreso");
		this.jLabelnumero_pre_impresoInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impresoInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impresoInformesDevoluciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impresoInformesDevoluciones.setToolTipText(InformesDevolucionesConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		this.gridaBagLayoutInformesDevoluciones = new GridBagLayout();
		this.jPanelnumero_pre_impresoInformesDevoluciones.setLayout(this.gridaBagLayoutInformesDevoluciones);


		jTextFieldnumero_pre_impresoInformesDevoluciones= new JTextFieldMe();

		jTextFieldnumero_pre_impresoInformesDevoluciones.setEnabled(false);
		jTextFieldnumero_pre_impresoInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impresoInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impresoInformesDevolucionesBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impresoInformesDevolucionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoInformesDevolucionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoInformesDevolucionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impresoInformesDevolucionesBusqueda.setText("U");
		this.jButtonnumero_pre_impresoInformesDevolucionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impresoInformesDevolucionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impresoInformesDevolucionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impresoInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impresoInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impresoInformesDevolucionesBusqueda"));

		if(this.informesdevolucionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impresoInformesDevolucionesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionInformesDevoluciones = new JLabelMe();
		this.jLabelfecha_emisionInformesDevoluciones.setText(""+InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionInformesDevoluciones.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionInformesDevoluciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionInformesDevoluciones.setToolTipText(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutInformesDevoluciones = new GridBagLayout();
		this.jPanelfecha_emisionInformesDevoluciones.setLayout(this.gridaBagLayoutInformesDevoluciones);


		//jFormattedTextFieldfecha_emisionInformesDevoluciones= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionInformesDevoluciones= new JDateChooser();
		jDateChooserfecha_emisionInformesDevoluciones.setEnabled(false);
		jDateChooserfecha_emisionInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionInformesDevoluciones.setDate(new Date());
		jDateChooserfecha_emisionInformesDevoluciones.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionInformesDevoluciones.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionInformesDevolucionesBusqueda= new JButtonMe();
		this.jButtonfecha_emisionInformesDevolucionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionInformesDevolucionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionInformesDevolucionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionInformesDevolucionesBusqueda.setText("U");
		this.jButtonfecha_emisionInformesDevolucionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionInformesDevolucionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionInformesDevolucionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionInformesDevolucionesBusqueda"));

		if(this.informesdevolucionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionInformesDevolucionesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_bodegaInformesDevoluciones = new JLabelMe();
		this.jLabelnombre_bodegaInformesDevoluciones.setText(""+InformesDevolucionesConstantesFunciones.LABEL_NOMBREBODEGA+" : *");
		this.jLabelnombre_bodegaInformesDevoluciones.setToolTipText("Nombre Bodega");
		this.jLabelnombre_bodegaInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bodegaInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_bodegaInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_bodegaInformesDevoluciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_bodegaInformesDevoluciones.setToolTipText(InformesDevolucionesConstantesFunciones.LABEL_NOMBREBODEGA);
		this.gridaBagLayoutInformesDevoluciones = new GridBagLayout();
		this.jPanelnombre_bodegaInformesDevoluciones.setLayout(this.gridaBagLayoutInformesDevoluciones);


		jTextAreanombre_bodegaInformesDevoluciones= new JTextAreaMe();
		jTextAreanombre_bodegaInformesDevoluciones.setEnabled(false);
		jTextAreanombre_bodegaInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bodegaInformesDevoluciones.setLineWrap(true);
		jTextAreanombre_bodegaInformesDevoluciones.setWrapStyleWord(true);
		jTextAreanombre_bodegaInformesDevoluciones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_bodegaInformesDevoluciones.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_bodegaInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_bodegaInformesDevoluciones = new JScrollPane(jTextAreanombre_bodegaInformesDevoluciones);
		jscrollPanenombre_bodegaInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodegaInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bodegaInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_bodegaInformesDevolucionesBusqueda= new JButtonMe();
		this.jButtonnombre_bodegaInformesDevolucionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaInformesDevolucionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bodegaInformesDevolucionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_bodegaInformesDevolucionesBusqueda.setText("U");
		this.jButtonnombre_bodegaInformesDevolucionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_bodegaInformesDevolucionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_bodegaInformesDevolucionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_bodegaInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_bodegaInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_bodegaInformesDevolucionesBusqueda"));

		if(this.informesdevolucionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_bodegaInformesDevolucionesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoInformesDevoluciones = new JLabelMe();
		this.jLabelnombre_productoInformesDevoluciones.setText(""+InformesDevolucionesConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoInformesDevoluciones.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoInformesDevoluciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoInformesDevoluciones.setToolTipText(InformesDevolucionesConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutInformesDevoluciones = new GridBagLayout();
		this.jPanelnombre_productoInformesDevoluciones.setLayout(this.gridaBagLayoutInformesDevoluciones);


		jTextAreanombre_productoInformesDevoluciones= new JTextAreaMe();
		jTextAreanombre_productoInformesDevoluciones.setEnabled(false);
		jTextAreanombre_productoInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoInformesDevoluciones.setLineWrap(true);
		jTextAreanombre_productoInformesDevoluciones.setWrapStyleWord(true);
		jTextAreanombre_productoInformesDevoluciones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoInformesDevoluciones.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoInformesDevoluciones = new JScrollPane(jTextAreanombre_productoInformesDevoluciones);
		jscrollPanenombre_productoInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_productoInformesDevolucionesBusqueda= new JButtonMe();
		this.jButtonnombre_productoInformesDevolucionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoInformesDevolucionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoInformesDevolucionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoInformesDevolucionesBusqueda.setText("U");
		this.jButtonnombre_productoInformesDevolucionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoInformesDevolucionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoInformesDevolucionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoInformesDevolucionesBusqueda"));

		if(this.informesdevolucionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoInformesDevolucionesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_tipo_devolucion_empresaInformesDevoluciones = new JLabelMe();
		this.jLabelnombre_tipo_devolucion_empresaInformesDevoluciones.setText(""+InformesDevolucionesConstantesFunciones.LABEL_NOMBRETIPODEVOLUCIONEMPRESA+" : *");
		this.jLabelnombre_tipo_devolucion_empresaInformesDevoluciones.setToolTipText("Nombre Tipo Devolucion Empresa");
		this.jLabelnombre_tipo_devolucion_empresaInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_devolucion_empresaInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_devolucion_empresaInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_devolucion_empresaInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_devolucion_empresaInformesDevoluciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_devolucion_empresaInformesDevoluciones.setToolTipText(InformesDevolucionesConstantesFunciones.LABEL_NOMBRETIPODEVOLUCIONEMPRESA);
		this.gridaBagLayoutInformesDevoluciones = new GridBagLayout();
		this.jPanelnombre_tipo_devolucion_empresaInformesDevoluciones.setLayout(this.gridaBagLayoutInformesDevoluciones);


		jTextAreanombre_tipo_devolucion_empresaInformesDevoluciones= new JTextAreaMe();
		jTextAreanombre_tipo_devolucion_empresaInformesDevoluciones.setEnabled(false);
		jTextAreanombre_tipo_devolucion_empresaInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_devolucion_empresaInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_devolucion_empresaInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_devolucion_empresaInformesDevoluciones.setLineWrap(true);
		jTextAreanombre_tipo_devolucion_empresaInformesDevoluciones.setWrapStyleWord(true);
		jTextAreanombre_tipo_devolucion_empresaInformesDevoluciones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_devolucion_empresaInformesDevoluciones.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_devolucion_empresaInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_devolucion_empresaInformesDevoluciones = new JScrollPane(jTextAreanombre_tipo_devolucion_empresaInformesDevoluciones);
		jscrollPanenombre_tipo_devolucion_empresaInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_devolucion_empresaInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_devolucion_empresaInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_tipo_devolucion_empresaInformesDevolucionesBusqueda= new JButtonMe();
		this.jButtonnombre_tipo_devolucion_empresaInformesDevolucionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_devolucion_empresaInformesDevolucionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_devolucion_empresaInformesDevolucionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_devolucion_empresaInformesDevolucionesBusqueda.setText("U");
		this.jButtonnombre_tipo_devolucion_empresaInformesDevolucionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_devolucion_empresaInformesDevolucionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_devolucion_empresaInformesDevolucionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_devolucion_empresaInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_devolucion_empresaInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_devolucion_empresaInformesDevolucionesBusqueda"));

		if(this.informesdevolucionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_devolucion_empresaInformesDevolucionesBusqueda.setVisible(false);		}


					
		this.jLabelcantidadInformesDevoluciones = new JLabelMe();
		this.jLabelcantidadInformesDevoluciones.setText(""+InformesDevolucionesConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadInformesDevoluciones.setToolTipText("Cantad");
		this.jLabelcantidadInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadInformesDevoluciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadInformesDevoluciones.setToolTipText(InformesDevolucionesConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutInformesDevoluciones = new GridBagLayout();
		this.jPanelcantidadInformesDevoluciones.setLayout(this.gridaBagLayoutInformesDevoluciones);


		jTextFieldcantidadInformesDevoluciones= new JTextFieldMe();
		jTextFieldcantidadInformesDevoluciones.setEnabled(false);
		jTextFieldcantidadInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadInformesDevoluciones.setText("0");

		this.jButtoncantidadInformesDevolucionesBusqueda= new JButtonMe();
		this.jButtoncantidadInformesDevolucionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadInformesDevolucionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadInformesDevolucionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadInformesDevolucionesBusqueda.setText("U");
		this.jButtoncantidadInformesDevolucionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadInformesDevolucionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadInformesDevolucionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadInformesDevolucionesBusqueda"));

		if(this.informesdevolucionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadInformesDevolucionesBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_productoInformesDevoluciones = new JLabelMe();
		this.jLabelcodigo_productoInformesDevoluciones.setText(""+InformesDevolucionesConstantesFunciones.LABEL_CODIGOPRODUCTO+" : *");
		this.jLabelcodigo_productoInformesDevoluciones.setToolTipText("Codigo Producto");
		this.jLabelcodigo_productoInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_productoInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_productoInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_productoInformesDevoluciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_productoInformesDevoluciones.setToolTipText(InformesDevolucionesConstantesFunciones.LABEL_CODIGOPRODUCTO);
		this.gridaBagLayoutInformesDevoluciones = new GridBagLayout();
		this.jPanelcodigo_productoInformesDevoluciones.setLayout(this.gridaBagLayoutInformesDevoluciones);


		jTextFieldcodigo_productoInformesDevoluciones= new JTextFieldMe();

		jTextFieldcodigo_productoInformesDevoluciones.setEnabled(false);
		jTextFieldcodigo_productoInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_productoInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_productoInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_productoInformesDevolucionesBusqueda= new JButtonMe();
		this.jButtoncodigo_productoInformesDevolucionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoInformesDevolucionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_productoInformesDevolucionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_productoInformesDevolucionesBusqueda.setText("U");
		this.jButtoncodigo_productoInformesDevolucionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_productoInformesDevolucionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_productoInformesDevolucionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_productoInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_productoInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_productoInformesDevolucionesBusqueda"));

		if(this.informesdevolucionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_productoInformesDevolucionesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysInformesDevoluciones() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_productoInformesDevoluciones = new JLabelMe();
		this.jLabelid_productoInformesDevoluciones.setText(""+InformesDevolucionesConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoInformesDevoluciones.setToolTipText("Producto");
		this.jLabelid_productoInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoInformesDevoluciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoInformesDevoluciones.setToolTipText(InformesDevolucionesConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutInformesDevoluciones = new GridBagLayout();
		this.jPanelid_productoInformesDevoluciones.setLayout(this.gridaBagLayoutInformesDevoluciones);


		jComboBoxid_productoInformesDevoluciones= new JComboBoxMe();
		jComboBoxid_productoInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoInformesDevoluciones= new JButtonMe();
		this.jButtonid_productoInformesDevoluciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoInformesDevoluciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoInformesDevoluciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoInformesDevoluciones.setText("Buscar");
		this.jButtonid_productoInformesDevoluciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoInformesDevoluciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoInformesDevoluciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoInformesDevoluciones"));

		this.jButtonid_productoInformesDevolucionesBusqueda= new JButtonMe();
		this.jButtonid_productoInformesDevolucionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoInformesDevolucionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoInformesDevolucionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoInformesDevolucionesBusqueda.setText("U");
		this.jButtonid_productoInformesDevolucionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoInformesDevolucionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoInformesDevolucionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoInformesDevolucionesBusqueda"));

		if(this.informesdevolucionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoInformesDevolucionesBusqueda.setVisible(false);		}

		this.jButtonid_productoInformesDevolucionesUpdate= new JButtonMe();
		this.jButtonid_productoInformesDevolucionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoInformesDevolucionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoInformesDevolucionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoInformesDevolucionesUpdate.setText("U");
		this.jButtonid_productoInformesDevolucionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoInformesDevolucionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoInformesDevolucionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoInformesDevolucionesUpdate"));



					
		this.jLabelid_tipo_devolucion_empresaInformesDevoluciones = new JLabelMe();
		this.jLabelid_tipo_devolucion_empresaInformesDevoluciones.setText(""+InformesDevolucionesConstantesFunciones.LABEL_IDTIPODEVOLUCIONEMPRESA+" : *");
		this.jLabelid_tipo_devolucion_empresaInformesDevoluciones.setToolTipText("Tipo Devolucion Empresa");
		this.jLabelid_tipo_devolucion_empresaInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_devolucion_empresaInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_devolucion_empresaInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_devolucion_empresaInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_devolucion_empresaInformesDevoluciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_devolucion_empresaInformesDevoluciones.setToolTipText(InformesDevolucionesConstantesFunciones.LABEL_IDTIPODEVOLUCIONEMPRESA);
		this.gridaBagLayoutInformesDevoluciones = new GridBagLayout();
		this.jPanelid_tipo_devolucion_empresaInformesDevoluciones.setLayout(this.gridaBagLayoutInformesDevoluciones);


		jComboBoxid_tipo_devolucion_empresaInformesDevoluciones= new JComboBoxMe();
		jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_devolucion_empresaInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_devolucion_empresaInformesDevoluciones= new JButtonMe();
		this.jButtonid_tipo_devolucion_empresaInformesDevoluciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_devolucion_empresaInformesDevoluciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_devolucion_empresaInformesDevoluciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_devolucion_empresaInformesDevoluciones.setText("Buscar");
		this.jButtonid_tipo_devolucion_empresaInformesDevoluciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_devolucion_empresaInformesDevoluciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_devolucion_empresaInformesDevoluciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_devolucion_empresaInformesDevoluciones"));

		this.jButtonid_tipo_devolucion_empresaInformesDevolucionesBusqueda= new JButtonMe();
		this.jButtonid_tipo_devolucion_empresaInformesDevolucionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_devolucion_empresaInformesDevolucionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_devolucion_empresaInformesDevolucionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_devolucion_empresaInformesDevolucionesBusqueda.setText("U");
		this.jButtonid_tipo_devolucion_empresaInformesDevolucionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_devolucion_empresaInformesDevolucionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_devolucion_empresaInformesDevolucionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_devolucion_empresaInformesDevolucionesBusqueda"));

		if(this.informesdevolucionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_devolucion_empresaInformesDevolucionesBusqueda.setVisible(false);		}

		this.jButtonid_tipo_devolucion_empresaInformesDevolucionesUpdate= new JButtonMe();
		this.jButtonid_tipo_devolucion_empresaInformesDevolucionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_devolucion_empresaInformesDevolucionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_devolucion_empresaInformesDevolucionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_devolucion_empresaInformesDevolucionesUpdate.setText("U");
		this.jButtonid_tipo_devolucion_empresaInformesDevolucionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_devolucion_empresaInformesDevolucionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_devolucion_empresaInformesDevolucionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_devolucion_empresaInformesDevolucionesUpdate"));



					
		this.jLabelid_empresaInformesDevoluciones = new JLabelMe();
		this.jLabelid_empresaInformesDevoluciones.setText(""+InformesDevolucionesConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaInformesDevoluciones.setToolTipText("Empresa");
		this.jLabelid_empresaInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaInformesDevoluciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaInformesDevoluciones.setToolTipText(InformesDevolucionesConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutInformesDevoluciones = new GridBagLayout();
		this.jPanelid_empresaInformesDevoluciones.setLayout(this.gridaBagLayoutInformesDevoluciones);


		jComboBoxid_empresaInformesDevoluciones= new JComboBoxMe();
		jComboBoxid_empresaInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaInformesDevoluciones.setEnabled(false);

		this.jButtonid_empresaInformesDevoluciones= new JButtonMe();
		this.jButtonid_empresaInformesDevoluciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaInformesDevoluciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaInformesDevoluciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaInformesDevoluciones.setText("Buscar");
		this.jButtonid_empresaInformesDevoluciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaInformesDevoluciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaInformesDevoluciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaInformesDevoluciones"));

		this.jButtonid_empresaInformesDevolucionesBusqueda= new JButtonMe();
		this.jButtonid_empresaInformesDevolucionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaInformesDevolucionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaInformesDevolucionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaInformesDevolucionesBusqueda.setText("U");
		this.jButtonid_empresaInformesDevolucionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaInformesDevolucionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaInformesDevolucionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaInformesDevolucionesBusqueda"));

		if(this.informesdevolucionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaInformesDevolucionesBusqueda.setVisible(false);		}

		this.jButtonid_empresaInformesDevolucionesUpdate= new JButtonMe();
		this.jButtonid_empresaInformesDevolucionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaInformesDevolucionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaInformesDevolucionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaInformesDevolucionesUpdate.setText("U");
		this.jButtonid_empresaInformesDevolucionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaInformesDevolucionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaInformesDevolucionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaInformesDevolucionesUpdate"));



					
		this.jLabelid_sucursalInformesDevoluciones = new JLabelMe();
		this.jLabelid_sucursalInformesDevoluciones.setText(""+InformesDevolucionesConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalInformesDevoluciones.setToolTipText("Sucursal");
		this.jLabelid_sucursalInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalInformesDevoluciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalInformesDevoluciones.setToolTipText(InformesDevolucionesConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutInformesDevoluciones = new GridBagLayout();
		this.jPanelid_sucursalInformesDevoluciones.setLayout(this.gridaBagLayoutInformesDevoluciones);


		jComboBoxid_sucursalInformesDevoluciones= new JComboBoxMe();
		jComboBoxid_sucursalInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalInformesDevoluciones.setEnabled(false);

		this.jButtonid_sucursalInformesDevoluciones= new JButtonMe();
		this.jButtonid_sucursalInformesDevoluciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalInformesDevoluciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalInformesDevoluciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalInformesDevoluciones.setText("Buscar");
		this.jButtonid_sucursalInformesDevoluciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalInformesDevoluciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalInformesDevoluciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalInformesDevoluciones"));

		this.jButtonid_sucursalInformesDevolucionesBusqueda= new JButtonMe();
		this.jButtonid_sucursalInformesDevolucionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalInformesDevolucionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalInformesDevolucionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalInformesDevolucionesBusqueda.setText("U");
		this.jButtonid_sucursalInformesDevolucionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalInformesDevolucionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalInformesDevolucionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalInformesDevolucionesBusqueda"));

		if(this.informesdevolucionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalInformesDevolucionesBusqueda.setVisible(false);		}

		this.jButtonid_sucursalInformesDevolucionesUpdate= new JButtonMe();
		this.jButtonid_sucursalInformesDevolucionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalInformesDevolucionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalInformesDevolucionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalInformesDevolucionesUpdate.setText("U");
		this.jButtonid_sucursalInformesDevolucionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalInformesDevolucionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalInformesDevolucionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalInformesDevolucionesUpdate"));



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
		//this.jInternalFrameDetalleInformesDevoluciones = new InformesDevolucionesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Informes Devoluciones DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutInformesDevoluciones= new GridBagLayout();
		

		
		String sToolTipInformesDevoluciones="";
		sToolTipInformesDevoluciones=InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipInformesDevoluciones+="(Facturacion.InformesDevoluciones)";
		}
		
		if(!this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipInformesDevoluciones+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoInformesDevoluciones = new JButtonMe();
		this.jButtonModificarInformesDevoluciones = new JButtonMe();
        this.jButtonActualizarInformesDevoluciones = new JButtonMe();
        this.jButtonEliminarInformesDevoluciones = new JButtonMe();
        this.jButtonCancelarInformesDevoluciones = new JButtonMe();
        this.jButtonGuardarCambiosInformesDevoluciones = new JButtonMe();
		this.jButtonGuardarCambiosTablaInformesDevoluciones = new JButtonMe();
		this.jButtonCerrarInformesDevoluciones = new JButtonMe();
		
		this.jScrollPanelDatosInformesDevoluciones = new JScrollPane();   
        this.jScrollPanelDatosEdicionInformesDevoluciones = new JScrollPane();
		this.jScrollPanelDatosGeneralInformesDevoluciones = new JScrollPane();
				
		
		
		this.jPanelCamposInformesDevoluciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosInformesDevoluciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesInformesDevoluciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioInformesDevoluciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Informes Devoluciones";
		
		if(!this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosInformesDevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informes Devolucioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosInformesDevoluciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionInformesDevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralInformesDevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposInformesDevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposInformesDevoluciones.setName("jPanelCamposInformesDevoluciones"); 

		this.jPanelCamposOcultosInformesDevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosInformesDevoluciones.setName("jPanelCamposOcultosInformesDevoluciones"); 

        this.jPanelAccionesInformesDevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesInformesDevoluciones.setToolTipText("Acciones");
        this.jPanelAccionesInformesDevoluciones.setName("Acciones"); 

		this.jPanelAccionesFormularioInformesDevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioInformesDevoluciones.setToolTipText("Acciones");
        this.jPanelAccionesFormularioInformesDevoluciones.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoInformesDevoluciones.setText("Nuevo");
		this.jButtonModificarInformesDevoluciones.setText("Editar");
        this.jButtonActualizarInformesDevoluciones.setText("Actualizar");
        this.jButtonEliminarInformesDevoluciones.setText("Eliminar");
        this.jButtonCancelarInformesDevoluciones.setText("Cancelar");
        this.jButtonGuardarCambiosInformesDevoluciones.setText("Guardar");
		this.jButtonGuardarCambiosTablaInformesDevoluciones.setText("Guardar");
		this.jButtonCerrarInformesDevoluciones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoInformesDevoluciones,"nuevo_button","Nuevo",this.informesdevolucionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarInformesDevoluciones,"modificar_button","Editar",this.informesdevolucionesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarInformesDevoluciones,"actualizar_button","Actualizar",this.informesdevolucionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarInformesDevoluciones,"eliminar_button","Eliminar",this.informesdevolucionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarInformesDevoluciones,"cancelar_button","Cancelar",this.informesdevolucionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosInformesDevoluciones,"guardarcambios_button","Guardar",this.informesdevolucionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaInformesDevoluciones,"guardarcambiostabla_button","Guardar",this.informesdevolucionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarInformesDevoluciones,"cerrar_button","Salir",this.informesdevolucionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoInformesDevoluciones.setToolTipText("Nuevo"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarInformesDevoluciones.setToolTipText("Editar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarInformesDevoluciones.setToolTipText("Actualizar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarInformesDevoluciones.setToolTipText("Eliminar)"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarInformesDevoluciones.setToolTipText("Cancelar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosInformesDevoluciones.setToolTipText("Guardar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaInformesDevoluciones.setToolTipText("Guardar"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarInformesDevoluciones.setToolTipText("Salir"+" "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoInformesDevoluciones";
		inputMap = this.jButtonNuevoInformesDevoluciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoInformesDevoluciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoInformesDevoluciones"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarInformesDevoluciones";
		inputMap = this.jButtonActualizarInformesDevoluciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarInformesDevoluciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarInformesDevoluciones"));
		
		//ELIMINAR
		sMapKey = "EliminarInformesDevoluciones";
		inputMap = this.jButtonEliminarInformesDevoluciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarInformesDevoluciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarInformesDevoluciones"));
		
		//CANCELAR	
		sMapKey = "CancelarInformesDevoluciones";
		inputMap = this.jButtonCancelarInformesDevoluciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarInformesDevoluciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarInformesDevoluciones"));
		
		//CERRAR		
		sMapKey = "CerrarInformesDevoluciones";
		inputMap = this.jButtonCerrarInformesDevoluciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarInformesDevoluciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarInformesDevoluciones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaInformesDevoluciones";
		inputMap = this.jButtonGuardarCambiosTablaInformesDevoluciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaInformesDevoluciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaInformesDevoluciones"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoInformesDevoluciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoInformesDevoluciones.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoInformesDevoluciones.setToolTipText("Nuevo InformesDevoluciones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarInformesDevoluciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarInformesDevoluciones.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarInformesDevoluciones.setToolTipText("Sin Cerrar Ventana InformesDevoluciones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeInformesDevoluciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeInformesDevoluciones.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeInformesDevoluciones.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesInformesDevoluciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesInformesDevoluciones.setText("Accion");
		this.jComboBoxTiposAccionesInformesDevoluciones.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioInformesDevoluciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioInformesDevoluciones.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioInformesDevoluciones.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesInformesDevoluciones = new JLabelMe();
		
		this.jLabelAccionesInformesDevoluciones.setText("Acciones");		
		this.jLabelAccionesInformesDevoluciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesInformesDevoluciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesInformesDevoluciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposInformesDevoluciones();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysInformesDevoluciones();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesInformesDevoluciones=new JTabbedPane();
		this.jTabbedPaneRelacionesInformesDevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesInformesDevoluciones,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesInformesDevoluciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesInformesDevoluciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesInformesDevoluciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioInformesDevoluciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioInformesDevoluciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioInformesDevoluciones.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioInformesDevoluciones, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposInformesDevoluciones = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosInformesDevoluciones = new GridBagLayout();
		
		this.jPanelCamposInformesDevoluciones.setLayout(gridaBagLayoutCamposInformesDevoluciones);
		this.jPanelCamposOcultosInformesDevoluciones.setLayout(gridaBagLayoutCamposOcultosInformesDevoluciones);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 0;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidInformesDevoluciones.add(jLabelIdInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 1;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidInformesDevoluciones.add(jLabelidInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);


	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 0;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoInformesDevoluciones.add(jLabelid_productoInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		//this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;
		this.gridBagConstraintsInformesDevoluciones.gridx = 2;
		this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
		this.gridBagConstraintsInformesDevoluciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoInformesDevoluciones.add(jButtonid_productoInformesDevolucionesBusqueda, this.gridBagConstraintsInformesDevoluciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		//this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;
		this.gridBagConstraintsInformesDevoluciones.gridx = 3;
		this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
		this.gridBagConstraintsInformesDevoluciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoInformesDevoluciones.add(jButtonid_productoInformesDevolucionesUpdate, this.gridBagConstraintsInformesDevoluciones);
	}

	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 1;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoInformesDevoluciones.add(jComboBoxid_productoInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);


	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 0;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_devolucion_empresaInformesDevoluciones.add(jLabelid_tipo_devolucion_empresaInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		//this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;
		this.gridBagConstraintsInformesDevoluciones.gridx = 2;
		this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
		this.gridBagConstraintsInformesDevoluciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_devolucion_empresaInformesDevoluciones.add(jButtonid_tipo_devolucion_empresaInformesDevolucionesBusqueda, this.gridBagConstraintsInformesDevoluciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		//this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;
		this.gridBagConstraintsInformesDevoluciones.gridx = 3;
		this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
		this.gridBagConstraintsInformesDevoluciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_devolucion_empresaInformesDevoluciones.add(jButtonid_tipo_devolucion_empresaInformesDevolucionesUpdate, this.gridBagConstraintsInformesDevoluciones);
	}

	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 1;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_devolucion_empresaInformesDevoluciones.add(jComboBoxid_tipo_devolucion_empresaInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);


	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 0;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaInformesDevoluciones.add(jLabelid_empresaInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		//this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;
		this.gridBagConstraintsInformesDevoluciones.gridx = 2;
		this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
		this.gridBagConstraintsInformesDevoluciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaInformesDevoluciones.add(jButtonid_empresaInformesDevolucionesBusqueda, this.gridBagConstraintsInformesDevoluciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		//this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;
		this.gridBagConstraintsInformesDevoluciones.gridx = 3;
		this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
		this.gridBagConstraintsInformesDevoluciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaInformesDevoluciones.add(jButtonid_empresaInformesDevolucionesUpdate, this.gridBagConstraintsInformesDevoluciones);
	}

	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 1;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaInformesDevoluciones.add(jComboBoxid_empresaInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);


	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 0;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalInformesDevoluciones.add(jLabelid_sucursalInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		//this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;
		this.gridBagConstraintsInformesDevoluciones.gridx = 2;
		this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
		this.gridBagConstraintsInformesDevoluciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalInformesDevoluciones.add(jButtonid_sucursalInformesDevolucionesBusqueda, this.gridBagConstraintsInformesDevoluciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		//this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;
		this.gridBagConstraintsInformesDevoluciones.gridx = 3;
		this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
		this.gridBagConstraintsInformesDevoluciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalInformesDevoluciones.add(jButtonid_sucursalInformesDevolucionesUpdate, this.gridBagConstraintsInformesDevoluciones);
	}

	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 1;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalInformesDevoluciones.add(jComboBoxid_sucursalInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);


	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 0;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeInformesDevoluciones.add(jLabelfecha_emision_desdeInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		//this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;
		this.gridBagConstraintsInformesDevoluciones.gridx = 2;
		this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
		this.gridBagConstraintsInformesDevoluciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeInformesDevoluciones.add(jButtonfecha_emision_desdeInformesDevolucionesBusqueda, this.gridBagConstraintsInformesDevoluciones);
	}

	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 1;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeInformesDevoluciones.add(jDateChooserfecha_emision_desdeInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);


	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 0;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaInformesDevoluciones.add(jLabelfecha_emision_hastaInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		//this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;
		this.gridBagConstraintsInformesDevoluciones.gridx = 2;
		this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
		this.gridBagConstraintsInformesDevoluciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaInformesDevoluciones.add(jButtonfecha_emision_hastaInformesDevolucionesBusqueda, this.gridBagConstraintsInformesDevoluciones);
	}

	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 1;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaInformesDevoluciones.add(jDateChooserfecha_emision_hastaInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);


	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 0;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneluser_name_usuarioInformesDevoluciones.add(jLabeluser_name_usuarioInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		//this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;
		this.gridBagConstraintsInformesDevoluciones.gridx = 2;
		this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
		this.gridBagConstraintsInformesDevoluciones.insets = new Insets(0, 0, 0, 0);
		this.jPaneluser_name_usuarioInformesDevoluciones.add(jButtonuser_name_usuarioInformesDevolucionesBusqueda, this.gridBagConstraintsInformesDevoluciones);
	}

	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 1;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneluser_name_usuarioInformesDevoluciones.add(jTextFielduser_name_usuarioInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);


	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 0;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_clienteInformesDevoluciones.add(jLabelnombre_completo_clienteInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		//this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;
		this.gridBagConstraintsInformesDevoluciones.gridx = 2;
		this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
		this.gridBagConstraintsInformesDevoluciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_clienteInformesDevoluciones.add(jButtonnombre_completo_clienteInformesDevolucionesBusqueda, this.gridBagConstraintsInformesDevoluciones);
	}

	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 1;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_clienteInformesDevoluciones.add(jscrollPanenombre_completo_clienteInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);


	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 0;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impresoInformesDevoluciones.add(jLabelnumero_pre_impresoInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		//this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;
		this.gridBagConstraintsInformesDevoluciones.gridx = 2;
		this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
		this.gridBagConstraintsInformesDevoluciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impresoInformesDevoluciones.add(jButtonnumero_pre_impresoInformesDevolucionesBusqueda, this.gridBagConstraintsInformesDevoluciones);
	}

	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 1;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impresoInformesDevoluciones.add(jTextFieldnumero_pre_impresoInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);


	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 0;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionInformesDevoluciones.add(jLabelfecha_emisionInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		//this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;
		this.gridBagConstraintsInformesDevoluciones.gridx = 2;
		this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
		this.gridBagConstraintsInformesDevoluciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionInformesDevoluciones.add(jButtonfecha_emisionInformesDevolucionesBusqueda, this.gridBagConstraintsInformesDevoluciones);
	}

	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 1;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionInformesDevoluciones.add(jDateChooserfecha_emisionInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);


	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 0;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_bodegaInformesDevoluciones.add(jLabelnombre_bodegaInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		//this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;
		this.gridBagConstraintsInformesDevoluciones.gridx = 2;
		this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
		this.gridBagConstraintsInformesDevoluciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_bodegaInformesDevoluciones.add(jButtonnombre_bodegaInformesDevolucionesBusqueda, this.gridBagConstraintsInformesDevoluciones);
	}

	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 1;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_bodegaInformesDevoluciones.add(jscrollPanenombre_bodegaInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);


	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 0;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoInformesDevoluciones.add(jLabelnombre_productoInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		//this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;
		this.gridBagConstraintsInformesDevoluciones.gridx = 2;
		this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
		this.gridBagConstraintsInformesDevoluciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoInformesDevoluciones.add(jButtonnombre_productoInformesDevolucionesBusqueda, this.gridBagConstraintsInformesDevoluciones);
	}

	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 1;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoInformesDevoluciones.add(jscrollPanenombre_productoInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);


	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 0;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_devolucion_empresaInformesDevoluciones.add(jLabelnombre_tipo_devolucion_empresaInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		//this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;
		this.gridBagConstraintsInformesDevoluciones.gridx = 2;
		this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
		this.gridBagConstraintsInformesDevoluciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_devolucion_empresaInformesDevoluciones.add(jButtonnombre_tipo_devolucion_empresaInformesDevolucionesBusqueda, this.gridBagConstraintsInformesDevoluciones);
	}

	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 1;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_devolucion_empresaInformesDevoluciones.add(jscrollPanenombre_tipo_devolucion_empresaInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);


	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 0;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadInformesDevoluciones.add(jLabelcantidadInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		//this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;
		this.gridBagConstraintsInformesDevoluciones.gridx = 2;
		this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
		this.gridBagConstraintsInformesDevoluciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadInformesDevoluciones.add(jButtoncantidadInformesDevolucionesBusqueda, this.gridBagConstraintsInformesDevoluciones);
	}

	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 1;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadInformesDevoluciones.add(jTextFieldcantidadInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);


	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 0;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_productoInformesDevoluciones.add(jLabelcodigo_productoInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		//this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;
		this.gridBagConstraintsInformesDevoluciones.gridx = 2;
		this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
		this.gridBagConstraintsInformesDevoluciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_productoInformesDevoluciones.add(jButtoncodigo_productoInformesDevolucionesBusqueda, this.gridBagConstraintsInformesDevoluciones);
	}

	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformesDevoluciones.gridy = 0;
	this.gridBagConstraintsInformesDevoluciones.gridx = 1;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_productoInformesDevoluciones.add(jTextFieldcodigo_productoInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformesDevoluciones.gridy = iYPanelCamposInformesDevoluciones;
	this.gridBagConstraintsInformesDevoluciones.gridx = iXPanelCamposInformesDevoluciones++;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformesDevoluciones.add(this.jPanelidInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(iXPanelCamposInformesDevoluciones % 2==0) {
		iXPanelCamposInformesDevoluciones=0;
		iYPanelCamposInformesDevoluciones++;
	}
	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformesDevoluciones.gridy = iYPanelCamposInformesDevoluciones;
	this.gridBagConstraintsInformesDevoluciones.gridx = iXPanelCamposInformesDevoluciones++;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformesDevoluciones.add(this.jPanelid_productoInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(iXPanelCamposInformesDevoluciones % 2==0) {
		iXPanelCamposInformesDevoluciones=0;
		iYPanelCamposInformesDevoluciones++;
	}
	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformesDevoluciones.gridy = iYPanelCamposInformesDevoluciones;
	this.gridBagConstraintsInformesDevoluciones.gridx = iXPanelCamposInformesDevoluciones++;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformesDevoluciones.add(this.jPanelid_tipo_devolucion_empresaInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(iXPanelCamposInformesDevoluciones % 2==0) {
		iXPanelCamposInformesDevoluciones=0;
		iYPanelCamposInformesDevoluciones++;
	}
	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformesDevoluciones.gridy = iYPanelCamposInformesDevoluciones;
	this.gridBagConstraintsInformesDevoluciones.gridx = iXPanelCamposInformesDevoluciones++;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformesDevoluciones.add(this.jPanelfecha_emision_desdeInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(iXPanelCamposInformesDevoluciones % 2==0) {
		iXPanelCamposInformesDevoluciones=0;
		iYPanelCamposInformesDevoluciones++;
	}
	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformesDevoluciones.gridy = iYPanelCamposInformesDevoluciones;
	this.gridBagConstraintsInformesDevoluciones.gridx = iXPanelCamposInformesDevoluciones++;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformesDevoluciones.add(this.jPanelfecha_emision_hastaInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(iXPanelCamposInformesDevoluciones % 2==0) {
		iXPanelCamposInformesDevoluciones=0;
		iYPanelCamposInformesDevoluciones++;
	}
	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformesDevoluciones.gridy = iYPanelCamposInformesDevoluciones;
	this.gridBagConstraintsInformesDevoluciones.gridx = iXPanelCamposInformesDevoluciones++;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformesDevoluciones.add(this.jPaneluser_name_usuarioInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(iXPanelCamposInformesDevoluciones % 2==0) {
		iXPanelCamposInformesDevoluciones=0;
		iYPanelCamposInformesDevoluciones++;
	}
	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformesDevoluciones.gridy = iYPanelCamposInformesDevoluciones;
	this.gridBagConstraintsInformesDevoluciones.gridx = iXPanelCamposInformesDevoluciones++;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformesDevoluciones.add(this.jPanelnombre_completo_clienteInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(iXPanelCamposInformesDevoluciones % 2==0) {
		iXPanelCamposInformesDevoluciones=0;
		iYPanelCamposInformesDevoluciones++;
	}
	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformesDevoluciones.gridy = iYPanelCamposInformesDevoluciones;
	this.gridBagConstraintsInformesDevoluciones.gridx = iXPanelCamposInformesDevoluciones++;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformesDevoluciones.add(this.jPanelnumero_pre_impresoInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(iXPanelCamposInformesDevoluciones % 2==0) {
		iXPanelCamposInformesDevoluciones=0;
		iYPanelCamposInformesDevoluciones++;
	}
	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformesDevoluciones.gridy = iYPanelCamposInformesDevoluciones;
	this.gridBagConstraintsInformesDevoluciones.gridx = iXPanelCamposInformesDevoluciones++;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformesDevoluciones.add(this.jPanelfecha_emisionInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(iXPanelCamposInformesDevoluciones % 2==0) {
		iXPanelCamposInformesDevoluciones=0;
		iYPanelCamposInformesDevoluciones++;
	}
	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformesDevoluciones.gridy = iYPanelCamposInformesDevoluciones;
	this.gridBagConstraintsInformesDevoluciones.gridx = iXPanelCamposInformesDevoluciones++;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformesDevoluciones.add(this.jPanelnombre_bodegaInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(iXPanelCamposInformesDevoluciones % 2==0) {
		iXPanelCamposInformesDevoluciones=0;
		iYPanelCamposInformesDevoluciones++;
	}
	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformesDevoluciones.gridy = iYPanelCamposInformesDevoluciones;
	this.gridBagConstraintsInformesDevoluciones.gridx = iXPanelCamposInformesDevoluciones++;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformesDevoluciones.add(this.jPanelnombre_productoInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(iXPanelCamposInformesDevoluciones % 2==0) {
		iXPanelCamposInformesDevoluciones=0;
		iYPanelCamposInformesDevoluciones++;
	}
	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformesDevoluciones.gridy = iYPanelCamposInformesDevoluciones;
	this.gridBagConstraintsInformesDevoluciones.gridx = iXPanelCamposInformesDevoluciones++;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformesDevoluciones.add(this.jPanelnombre_tipo_devolucion_empresaInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(iXPanelCamposInformesDevoluciones % 2==0) {
		iXPanelCamposInformesDevoluciones=0;
		iYPanelCamposInformesDevoluciones++;
	}
	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformesDevoluciones.gridy = iYPanelCamposInformesDevoluciones;
	this.gridBagConstraintsInformesDevoluciones.gridx = iXPanelCamposInformesDevoluciones++;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformesDevoluciones.add(this.jPanelcantidadInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(iXPanelCamposInformesDevoluciones % 2==0) {
		iXPanelCamposInformesDevoluciones=0;
		iYPanelCamposInformesDevoluciones++;
	}
	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformesDevoluciones.gridy = iYPanelCamposInformesDevoluciones;
	this.gridBagConstraintsInformesDevoluciones.gridx = iXPanelCamposInformesDevoluciones++;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformesDevoluciones.add(this.jPanelcodigo_productoInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(iXPanelCamposInformesDevoluciones % 2==0) {
		iXPanelCamposInformesDevoluciones=0;
		iYPanelCamposInformesDevoluciones++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformesDevoluciones.gridy = iYPanelCamposOcultosInformesDevoluciones;
	this.gridBagConstraintsInformesDevoluciones.gridx = iXPanelCamposOcultosInformesDevoluciones++;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosInformesDevoluciones.add(this.jPanelid_empresaInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(iXPanelCamposOcultosInformesDevoluciones % 2==0) {
		iXPanelCamposOcultosInformesDevoluciones=0;
		iYPanelCamposOcultosInformesDevoluciones++;
	}
	this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformesDevoluciones.gridy = iYPanelCamposOcultosInformesDevoluciones;
	this.gridBagConstraintsInformesDevoluciones.gridx = iXPanelCamposOcultosInformesDevoluciones++;
	this.gridBagConstraintsInformesDevoluciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformesDevoluciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosInformesDevoluciones.add(this.jPanelid_sucursalInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);



	if(iXPanelCamposOcultosInformesDevoluciones % 2==0) {
		iXPanelCamposOcultosInformesDevoluciones=0;
		iYPanelCamposOcultosInformesDevoluciones++;
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
			
		GridBagLayout gridaBagLayoutAccionesInformesDevoluciones= new GridBagLayout();
		this.jPanelAccionesInformesDevoluciones.setLayout(gridaBagLayoutAccionesInformesDevoluciones);
		
		GridBagLayout gridaBagLayoutAccionesFormularioInformesDevoluciones= new GridBagLayout();
		this.jPanelAccionesFormularioInformesDevoluciones.setLayout(gridaBagLayoutAccionesFormularioInformesDevoluciones);
		
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsInformesDevoluciones.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioInformesDevoluciones.add(this.jComboBoxTiposAccionesFormularioInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;
		this.gridBagConstraintsInformesDevoluciones.gridx = iPosXAccion++;
			
		this.jPanelAccionesInformesDevoluciones.add(this.jButtonModificarInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);							

		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;
		this.gridBagConstraintsInformesDevoluciones.gridx =iPosXAccion++;
			
		this.jPanelAccionesInformesDevoluciones.add(this.jButtonEliminarInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
		
			
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;		
		this.gridBagConstraintsInformesDevoluciones.gridx = iPosXAccion++;
		
		this.jPanelAccionesInformesDevoluciones.add(this.jButtonActualizarInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);


		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;		
		this.gridBagConstraintsInformesDevoluciones.gridx = iPosXAccion++;
		
		this.jPanelAccionesInformesDevoluciones.add(this.jButtonGuardarCambiosInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);	
		
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.gridy = 0;		
		this.gridBagConstraintsInformesDevoluciones.gridx =iPosXAccion++;
		
		this.jPanelAccionesInformesDevoluciones.add(this.jButtonCancelarInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutInformesDevoluciones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutInformesDevoluciones);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();						
			this.gridBagConstraintsInformesDevoluciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsInformesDevoluciones.gridx = 0;		
			//this.gridBagConstraintsInformesDevoluciones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsInformesDevoluciones.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsInformesDevoluciones.gridx =0;
		this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsInformesDevoluciones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(InformesDevolucionesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleInformesDevoluciones = new InformesDevolucionesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Informes Devoluciones DATOS");
			
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
			
	        //this.setTitle("[FOR] - Informes Devoluciones DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Informes Devoluciones Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			InformesDevolucionesModel informesdevolucionesModel=new InformesDevolucionesModel(this);
			
			//SI USARA CLASE INTERNA
			//InformesDevolucionesModel.InformesDevolucionesFocusTraversalPolicy informesdevolucionesFocusTraversalPolicy = informesdevolucionesModel.new InformesDevolucionesFocusTraversalPolicy(this);
			
			//informesdevolucionesFocusTraversalPolicy.setinformesdevolucionesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(informesdevolucionesModel);
			
			
			this.jContentPaneDetalleInformesDevoluciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleInformesDevoluciones = new GridBagLayout();	
			this.jContentPaneDetalleInformesDevoluciones.setLayout(gridaBagLayoutDetalleInformesDevoluciones);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosInformesDevoluciones = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
				this.gridBagConstraintsInformesDevoluciones.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsInformesDevoluciones.gridx = 0;
					
				
				this.jContentPaneDetalleInformesDevoluciones.add(jTtoolBarDetalleInformesDevoluciones, gridBagConstraintsInformesDevoluciones);								
				
}
			
			this.jScrollPanelDatosEdicionInformesDevoluciones=   new JScrollPane(jContentPaneDetalleInformesDevoluciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionInformesDevoluciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionInformesDevoluciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionInformesDevoluciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralInformesDevoluciones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralInformesDevoluciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralInformesDevoluciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralInformesDevoluciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			
			
	        this.gridBagConstraintsInformesDevoluciones.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsInformesDevoluciones.gridx = 0;
	        
			this.jContentPaneDetalleInformesDevoluciones.add(jPanelCamposInformesDevoluciones, gridBagConstraintsInformesDevoluciones);
			
			
			
			
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
						//&& informesdevolucionesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.informesdevolucionesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsInformesDevoluciones= new GridBagConstraints();
						this.gridBagConstraintsInformesDevoluciones.gridy = iGridyRelaciones++;
						this.gridBagConstraintsInformesDevoluciones.gridx = 0;
						this.jContentPaneDetalleInformesDevoluciones.add(this.jTabbedPaneRelacionesInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesInformesDevoluciones.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosInformesDevoluciones.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
					this.gridBagConstraintsInformesDevoluciones.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsInformesDevoluciones.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsInformesDevoluciones.gridx = 0;
					
				
					this.jContentPaneDetalleInformesDevoluciones.add(jPanelCamposOcultosInformesDevoluciones, gridBagConstraintsInformesDevoluciones);
				
					this.jPanelCamposOcultosInformesDevoluciones.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsInformesDevoluciones.gridx = 0;
	        this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleInformesDevoluciones.add(this.jPanelAccionesFormularioInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);							
			
			
			
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
	        this.gridBagConstraintsInformesDevoluciones.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsInformesDevoluciones.gridx = 0;
	        
			
			this.jContentPaneDetalleInformesDevoluciones.add(this.jPanelAccionesInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionInformesDevoluciones);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionInformesDevoluciones=   new JScrollPane(this.jPanelCamposInformesDevoluciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionInformesDevoluciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionInformesDevoluciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionInformesDevoluciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsInformesDevoluciones.gridx = 0;
			this.gridBagConstraintsInformesDevoluciones.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsInformesDevoluciones.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsInformesDevoluciones.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsInformesDevoluciones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);			
			
			this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
			this.gridBagConstraintsInformesDevoluciones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsInformesDevoluciones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformesDevoluciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
			
			
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformesDevoluciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
		
			
		this.gridBagConstraintsInformesDevoluciones = new GridBagConstraints();
		this.gridBagConstraintsInformesDevoluciones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsInformesDevoluciones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesInformesDevoluciones, this.gridBagConstraintsInformesDevoluciones);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralInformesDevoluciones;//jContentPane;
		
		return jScrollPanelDatosEdicionInformesDevoluciones;
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
