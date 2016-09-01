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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.TablaAmortiConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class TablaAmortiDetalleFormJInternalFrame extends TablaAmortiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTablaAmorti;
	
	protected JMenuBar jmenuBarDetalleTablaAmorti;
	
	protected JMenu jmenuDetalleTablaAmorti;
	protected JMenu jmenuDetalleArchivoTablaAmorti;
	protected JMenu jmenuDetalleAccionesTablaAmorti;
	protected JMenu jmenuDetalleDatosTablaAmorti;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTablaAmorti;	
	protected GridBagConstraints gridBagConstraintsTablaAmorti;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TablaAmortiBeanSwingJInternalFrameAdditional jInternalFrameDetalleTablaAmorti;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected TasaBeanSwingJInternalFrame tasaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tasa="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public TablaAmortiSessionBean tablaamortiSessionBean;
	
	

	public DetalleTablaAmortiBeanSwingJInternalFrame detalletablaamortiBeanSwingJInternalFrame=null;
	public DetalleTablaAmortiBeanSwingJInternalFrame detalletablaamortiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleTablaAmorti=false;
	public DetalleTablaAmortiSessionBean detalletablaamortiSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public TasaSessionBean tasaSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public TablaAmortiLogic tablaamortiLogic;
	
	public JScrollPane jScrollPanelDatosTablaAmorti;
	public JScrollPane jScrollPanelDatosEdicionTablaAmorti;
	public JScrollPane jScrollPanelDatosGeneralTablaAmorti;
	
	protected JPanel jPanelCamposTablaAmorti;    
	protected JPanel jPanelCamposOcultosTablaAmorti;    	
	protected JPanel jPanelAccionesTablaAmorti;
	protected JPanel jPanelAccionesFormularioTablaAmorti;
    
	
	
	protected Integer iXPanelCamposTablaAmorti=0;
	protected Integer iYPanelCamposTablaAmorti=0;
	
	protected Integer iXPanelCamposOcultosTablaAmorti=0;
	protected Integer iYPanelCamposOcultosTablaAmorti=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTablaAmorti;
	public JButton jButtonModificarTablaAmorti;
	public JButton jButtonActualizarTablaAmorti;
    public JButton jButtonEliminarTablaAmorti;
	public JButton jButtonCancelarTablaAmorti;
    public JButton jButtonGuardarCambiosTablaAmorti;
	public JButton jButtonGuardarCambiosTablaTablaAmorti;
	protected JButton jButtonCerrarTablaAmorti;
	
	
	protected JButton jButtonProcesarInformacionTablaAmorti;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTablaAmorti;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTablaAmorti;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTablaAmorti;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTablaAmorti;
	protected JButton jButtonModificarToolBarTablaAmorti;
	protected JButton jButtonActualizarToolBarTablaAmorti;
    protected JButton jButtonEliminarToolBarTablaAmorti;
	protected JButton jButtonCancelarToolBarTablaAmorti;
    protected JButton jButtonGuardarCambiosToolBarTablaAmorti;
	protected JButton jButtonGuardarCambiosTablaToolBarTablaAmorti;
	protected JButton jButtonMostrarOcultarTablaToolBarTablaAmorti;
	protected JButton jButtonCerrarToolBarTablaAmorti;
	
	protected JButton jButtonProcesarInformacionToolBarTablaAmorti;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTablaAmorti;
	protected JMenuItem jMenuItemModificarTablaAmorti;
	protected JMenuItem jMenuItemActualizarTablaAmorti;
    protected JMenuItem jMenuItemEliminarTablaAmorti;
	protected JMenuItem jMenuItemCancelarTablaAmorti;
    protected JMenuItem jMenuItemGuardarCambiosTablaAmorti;
	protected JMenuItem jMenuItemGuardarCambiosTablaTablaAmorti;
	protected JMenuItem jMenuItemCerrarTablaAmorti;
	protected JMenuItem jMenuItemDetalleCerrarTablaAmorti;
	protected JMenuItem jMenuItemDetalleMostarOcultarTablaAmorti;
	
	protected JMenuItem jMenuItemProcesarInformacionTablaAmorti;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTablaAmorti;
	protected JMenuItem jMenuItemMostrarOcultarTablaAmorti;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTablaAmorti;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTablaAmorti;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTablaAmorti;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTablaAmorti;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTablaAmorti;
	public JLabel jLabelIdTablaAmorti;
	public JLabel jLabelidTablaAmorti;
	public JButton jButtonidTablaAmortiBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionTablaAmorti;
	public JLabel jLabelfecha_emisionTablaAmorti;
	//public JFormattedTextField jDateChooserfecha_emisionTablaAmorti;

	public JDateChooser jDateChooserfecha_emisionTablaAmorti;
	public JButton jButtonfecha_emisionTablaAmortiBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoTablaAmorti;
	public JLabel jLabelfecha_vencimientoTablaAmorti;
	//public JFormattedTextField jDateChooserfecha_vencimientoTablaAmorti;

	public JDateChooser jDateChooserfecha_vencimientoTablaAmorti;
	public JButton jButtonfecha_vencimientoTablaAmortiBusqueda= new JButtonMe();

	public JPanel jPanelvalor_prestamoTablaAmorti;
	public JLabel jLabelvalor_prestamoTablaAmorti;
	public JTextField jTextFieldvalor_prestamoTablaAmorti;
	public JButton jButtonvalor_prestamoTablaAmortiBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cuotasTablaAmorti;
	public JLabel jLabelnumero_cuotasTablaAmorti;
	public JTextField jTextFieldnumero_cuotasTablaAmorti;
	public JButton jButtonnumero_cuotasTablaAmortiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTablaAmorti;
	public JLabel jLabelid_empresaTablaAmorti;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTablaAmorti;
	public JButton jButtonid_empresaTablaAmorti= new JButtonMe();
	public JButton jButtonid_empresaTablaAmortiUpdate= new JButtonMe();
	public JButton jButtonid_empresaTablaAmortiBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalTablaAmorti;
	public JLabel jLabelid_sucursalTablaAmorti;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalTablaAmorti;
	public JButton jButtonid_sucursalTablaAmorti= new JButtonMe();
	public JButton jButtonid_sucursalTablaAmortiUpdate= new JButtonMe();
	public JButton jButtonid_sucursalTablaAmortiBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioTablaAmorti;
	public JLabel jLabelid_ejercicioTablaAmorti;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioTablaAmorti;
	public JButton jButtonid_ejercicioTablaAmorti= new JButtonMe();
	public JButton jButtonid_ejercicioTablaAmortiUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioTablaAmortiBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoTablaAmorti;
	public JLabel jLabelid_periodoTablaAmorti;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoTablaAmorti;
	public JButton jButtonid_periodoTablaAmorti= new JButtonMe();
	public JButton jButtonid_periodoTablaAmortiUpdate= new JButtonMe();
	public JButton jButtonid_periodoTablaAmortiBusqueda= new JButtonMe();

	public JPanel jPanelid_tasaTablaAmorti;
	public JLabel jLabelid_tasaTablaAmorti;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tasaTablaAmorti;
	public JButton jButtonid_tasaTablaAmorti= new JButtonMe();
	public JButton jButtonid_tasaTablaAmortiUpdate= new JButtonMe();
	public JButton jButtonid_tasaTablaAmortiBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaTablaAmorti;
	public JLabel jLabelid_facturaTablaAmorti;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaTablaAmorti;
	public JButton jButtonid_facturaTablaAmorti= new JButtonMe();
	public JButton jButtonid_facturaTablaAmortiUpdate= new JButtonMe();
	public JButton jButtonid_facturaTablaAmortiBusqueda= new JButtonMe();

	public JPanel jPanelid_anioTablaAmorti;
	public JLabel jLabelid_anioTablaAmorti;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioTablaAmorti;
	public JButton jButtonid_anioTablaAmorti= new JButtonMe();
	public JButton jButtonid_anioTablaAmortiUpdate= new JButtonMe();
	public JButton jButtonid_anioTablaAmortiBusqueda= new JButtonMe();

	public JPanel jPanelid_mesTablaAmorti;
	public JLabel jLabelid_mesTablaAmorti;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesTablaAmorti;
	public JButton jButtonid_mesTablaAmorti= new JButtonMe();
	public JButton jButtonid_mesTablaAmortiUpdate= new JButtonMe();
	public JButton jButtonid_mesTablaAmortiBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTablaAmorti;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=264;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TablaAmortiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTablaAmorti=new JPanel();
				this.jPanelAccionesFormularioTablaAmorti=new JPanel();
				this.jmenuBarDetalleTablaAmorti=new JMenuBar();
				this.jTtoolBarDetalleTablaAmorti=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TablaAmortiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TablaAmorti No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TablaAmortiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TablaAmorti No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TablaAmortiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TablaAmorti No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TablaAmortiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TablaAmorti No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TablaAmortiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TablaAmorti No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTablaAmorti() {
		return this.jButtonActualizarToolBarTablaAmorti;
	}
	
	public JButton getjButtonEliminarToolBarTablaAmorti() {
		return this.jButtonEliminarToolBarTablaAmorti;
	}
	
	public JButton getjButtonCancelarToolBarTablaAmorti() {
		return this.jButtonCancelarToolBarTablaAmorti;
	}		
	
	public JButton getjButtonProcesarInformacionTablaAmorti() {
		return this.jButtonProcesarInformacionTablaAmorti;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTablaAmorti)	{
		this.jButtonProcesarInformacionTablaAmorti = jButtonProcesarInformacionTablaAmorti;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTablaAmorti() {
		return this.jComboBoxTiposAccionesTablaAmorti;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTablaAmorti(
			JComboBox jComboBoxTiposRelacionesTablaAmorti) {
		this.jComboBoxTiposRelacionesTablaAmorti = jComboBoxTiposRelacionesTablaAmorti;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTablaAmorti(
			JComboBox jComboBoxTiposAccionesTablaAmorti) {
		this.jComboBoxTiposAccionesTablaAmorti = jComboBoxTiposAccionesTablaAmorti;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTablaAmorti() {
		return this.jComboBoxTiposAccionesFormularioTablaAmorti;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTablaAmorti(
			JComboBox jComboBoxTiposAccionesFormularioTablaAmorti) {
		this.jComboBoxTiposAccionesFormularioTablaAmorti = jComboBoxTiposAccionesFormularioTablaAmorti;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tablaamortiSessionBean=new TablaAmortiSessionBean();
		
		this.tablaamortiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tablaamortiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tablaamortiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalletablaamortiSessionBean=new DetalleTablaAmortiSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TablaAmortiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TablaAmortiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TablaAmortiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tabla Amorti MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
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
	
		TablaAmortiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTablaAmorti= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTablaAmorti=new JButtonMe();
				this.jButtonModificarToolBarTablaAmorti=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTablaAmorti,this.jTtoolBarDetalleTablaAmorti,
							"actualizar","actualizar","Actualizar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTablaAmorti,this.jTtoolBarDetalleTablaAmorti,
							"eliminar","eliminar","Eliminar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTablaAmorti,this.jTtoolBarDetalleTablaAmorti,
							"cancelar","cancelar","Cancelar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTablaAmorti,this.jTtoolBarDetalleTablaAmorti,
							"guardarcambios","guardarcambios","Guardar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTablaAmorti=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTablaAmorti=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTablaAmorti=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTablaAmorti=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTablaAmorti=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTablaAmorti= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTablaAmorti.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTablaAmorti,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTablaAmorti= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTablaAmorti.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTablaAmorti,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTablaAmorti= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTablaAmorti.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTablaAmorti,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTablaAmorti= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTablaAmorti.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTablaAmorti,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTablaAmorti= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTablaAmorti.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTablaAmorti,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAmorti= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAmorti.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAmorti,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTablaAmorti= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTablaAmorti.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTablaAmorti,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTablaAmorti= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTablaAmorti.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTablaAmorti,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTablaAmorti= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTablaAmorti.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTablaAmorti,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTablaAmorti= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTablaAmorti.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTablaAmorti,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTablaAmorti.add(this.jMenuItemDetalleCerrarTablaAmorti);
		
		this.jmenuDetalleAccionesTablaAmorti.add(this.jMenuItemActualizarTablaAmorti);
		this.jmenuDetalleAccionesTablaAmorti.add(this.jMenuItemEliminarTablaAmorti);
		this.jmenuDetalleAccionesTablaAmorti.add(this.jMenuItemCancelarTablaAmorti);		
		
		//this.jmenuDetalleDatosTablaAmorti.add(this.jMenuItemDetalleAbrirOrderByTablaAmorti);				
		this.jmenuDetalleDatosTablaAmorti.add(this.jMenuItemDetalleMostarOcultarTablaAmorti);				
				
		//this.jmenuDetalleAccionesTablaAmorti.add(this.jMenuItemGuardarCambiosTablaAmorti);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTablaAmorti.add(this.jmenuDetalleArchivoTablaAmorti);		
		this.jmenuBarDetalleTablaAmorti.add(this.jmenuDetalleAccionesTablaAmorti);		
		this.jmenuBarDetalleTablaAmorti.add(this.jmenuDetalleDatosTablaAmorti);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTablaAmorti.add(this.jmenuDetalleTablaAmorti);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTablaAmorti);				
	}
	
	
	public void inicializarElementosCamposTablaAmorti() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTablaAmorti = new JLabelMe();
		jLabelIdTablaAmorti.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTablaAmorti = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTablaAmorti.setToolTipText(TablaAmortiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTablaAmorti= new GridBagLayout();

		this.jPanelidTablaAmorti.setLayout(this.gridaBagLayoutTablaAmorti);

		jLabelidTablaAmorti = new JLabel();
		jLabelidTablaAmorti.setText("Id");

		jLabelidTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emisionTablaAmorti = new JLabelMe();
		this.jLabelfecha_emisionTablaAmorti.setText(""+TablaAmortiConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionTablaAmorti.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionTablaAmorti.setToolTipText(TablaAmortiConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutTablaAmorti = new GridBagLayout();
		this.jPanelfecha_emisionTablaAmorti.setLayout(this.gridaBagLayoutTablaAmorti);


		//jFormattedTextFieldfecha_emisionTablaAmorti= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionTablaAmorti= new JDateChooser();
		jDateChooserfecha_emisionTablaAmorti.setEnabled(false);
		jDateChooserfecha_emisionTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionTablaAmorti.setDate(new Date());
		jDateChooserfecha_emisionTablaAmorti.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionTablaAmorti.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionTablaAmortiBusqueda= new JButtonMe();
		this.jButtonfecha_emisionTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionTablaAmortiBusqueda.setText("U");
		this.jButtonfecha_emisionTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionTablaAmortiBusqueda"));

		if(this.tablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionTablaAmortiBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoTablaAmorti = new JLabelMe();
		this.jLabelfecha_vencimientoTablaAmorti.setText(""+TablaAmortiConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoTablaAmorti.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoTablaAmorti.setToolTipText(TablaAmortiConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutTablaAmorti = new GridBagLayout();
		this.jPanelfecha_vencimientoTablaAmorti.setLayout(this.gridaBagLayoutTablaAmorti);


		//jFormattedTextFieldfecha_vencimientoTablaAmorti= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoTablaAmorti= new JDateChooser();
		jDateChooserfecha_vencimientoTablaAmorti.setEnabled(false);
		jDateChooserfecha_vencimientoTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoTablaAmorti.setDate(new Date());
		jDateChooserfecha_vencimientoTablaAmorti.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoTablaAmorti.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoTablaAmortiBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoTablaAmortiBusqueda.setText("U");
		this.jButtonfecha_vencimientoTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoTablaAmortiBusqueda"));

		if(this.tablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoTablaAmortiBusqueda.setVisible(false);		}


					
		this.jLabelvalor_prestamoTablaAmorti = new JLabelMe();
		this.jLabelvalor_prestamoTablaAmorti.setText(""+TablaAmortiConstantesFunciones.LABEL_VALORPRESTAMO+" : *");
		this.jLabelvalor_prestamoTablaAmorti.setToolTipText("Valor Prestamo");
		this.jLabelvalor_prestamoTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_prestamoTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_prestamoTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_prestamoTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_prestamoTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_prestamoTablaAmorti.setToolTipText(TablaAmortiConstantesFunciones.LABEL_VALORPRESTAMO);
		this.gridaBagLayoutTablaAmorti = new GridBagLayout();
		this.jPanelvalor_prestamoTablaAmorti.setLayout(this.gridaBagLayoutTablaAmorti);


		jTextFieldvalor_prestamoTablaAmorti= new JTextFieldMe();
		jTextFieldvalor_prestamoTablaAmorti.setEnabled(false);
		jTextFieldvalor_prestamoTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_prestamoTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_prestamoTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_prestamoTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_prestamoTablaAmorti.setText("0.0");

		this.jButtonvalor_prestamoTablaAmortiBusqueda= new JButtonMe();
		this.jButtonvalor_prestamoTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_prestamoTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_prestamoTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_prestamoTablaAmortiBusqueda.setText("U");
		this.jButtonvalor_prestamoTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_prestamoTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_prestamoTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_prestamoTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_prestamoTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_prestamoTablaAmortiBusqueda"));

		if(this.tablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_prestamoTablaAmortiBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cuotasTablaAmorti = new JLabelMe();
		this.jLabelnumero_cuotasTablaAmorti.setText(""+TablaAmortiConstantesFunciones.LABEL_NUMEROCUOTAS+" : *");
		this.jLabelnumero_cuotasTablaAmorti.setToolTipText("Numero Cuotas");
		this.jLabelnumero_cuotasTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuotasTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuotasTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuotasTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cuotasTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cuotasTablaAmorti.setToolTipText(TablaAmortiConstantesFunciones.LABEL_NUMEROCUOTAS);
		this.gridaBagLayoutTablaAmorti = new GridBagLayout();
		this.jPanelnumero_cuotasTablaAmorti.setLayout(this.gridaBagLayoutTablaAmorti);


		jTextFieldnumero_cuotasTablaAmorti= new JTextFieldMe();
		jTextFieldnumero_cuotasTablaAmorti.setEnabled(false);
		jTextFieldnumero_cuotasTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuotasTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuotasTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuotasTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_cuotasTablaAmorti.setText("0");

		this.jButtonnumero_cuotasTablaAmortiBusqueda= new JButtonMe();
		this.jButtonnumero_cuotasTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuotasTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuotasTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cuotasTablaAmortiBusqueda.setText("U");
		this.jButtonnumero_cuotasTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cuotasTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cuotasTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cuotasTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cuotasTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cuotasTablaAmortiBusqueda"));

		if(this.tablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cuotasTablaAmortiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTablaAmorti() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTablaAmorti = new JLabelMe();
		this.jLabelid_empresaTablaAmorti.setText(""+TablaAmortiConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTablaAmorti.setToolTipText("Empresa");
		this.jLabelid_empresaTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTablaAmorti.setToolTipText(TablaAmortiConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTablaAmorti = new GridBagLayout();
		this.jPanelid_empresaTablaAmorti.setLayout(this.gridaBagLayoutTablaAmorti);


		jComboBoxid_empresaTablaAmorti= new JComboBoxMe();
		jComboBoxid_empresaTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTablaAmorti.setEnabled(false);

		this.jButtonid_empresaTablaAmorti= new JButtonMe();
		this.jButtonid_empresaTablaAmorti.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTablaAmorti.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTablaAmorti.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTablaAmorti.setText("Buscar");
		this.jButtonid_empresaTablaAmorti.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTablaAmorti.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTablaAmorti,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTablaAmorti"));

		this.jButtonid_empresaTablaAmortiBusqueda= new JButtonMe();
		this.jButtonid_empresaTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTablaAmortiBusqueda.setText("U");
		this.jButtonid_empresaTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTablaAmortiBusqueda"));

		if(this.tablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTablaAmortiBusqueda.setVisible(false);		}

		this.jButtonid_empresaTablaAmortiUpdate= new JButtonMe();
		this.jButtonid_empresaTablaAmortiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTablaAmortiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTablaAmortiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTablaAmortiUpdate.setText("U");
		this.jButtonid_empresaTablaAmortiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTablaAmortiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTablaAmortiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTablaAmortiUpdate"));



					
		this.jLabelid_sucursalTablaAmorti = new JLabelMe();
		this.jLabelid_sucursalTablaAmorti.setText(""+TablaAmortiConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalTablaAmorti.setToolTipText("Sucursal");
		this.jLabelid_sucursalTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalTablaAmorti.setToolTipText(TablaAmortiConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutTablaAmorti = new GridBagLayout();
		this.jPanelid_sucursalTablaAmorti.setLayout(this.gridaBagLayoutTablaAmorti);


		jComboBoxid_sucursalTablaAmorti= new JComboBoxMe();
		jComboBoxid_sucursalTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalTablaAmorti.setEnabled(false);

		this.jButtonid_sucursalTablaAmorti= new JButtonMe();
		this.jButtonid_sucursalTablaAmorti.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTablaAmorti.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTablaAmorti.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTablaAmorti.setText("Buscar");
		this.jButtonid_sucursalTablaAmorti.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalTablaAmorti.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTablaAmorti,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTablaAmorti"));

		this.jButtonid_sucursalTablaAmortiBusqueda= new JButtonMe();
		this.jButtonid_sucursalTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTablaAmortiBusqueda.setText("U");
		this.jButtonid_sucursalTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTablaAmortiBusqueda"));

		if(this.tablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalTablaAmortiBusqueda.setVisible(false);		}

		this.jButtonid_sucursalTablaAmortiUpdate= new JButtonMe();
		this.jButtonid_sucursalTablaAmortiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTablaAmortiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTablaAmortiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTablaAmortiUpdate.setText("U");
		this.jButtonid_sucursalTablaAmortiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalTablaAmortiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTablaAmortiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTablaAmortiUpdate"));



					
		this.jLabelid_ejercicioTablaAmorti = new JLabelMe();
		this.jLabelid_ejercicioTablaAmorti.setText(""+TablaAmortiConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioTablaAmorti.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioTablaAmorti.setToolTipText(TablaAmortiConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutTablaAmorti = new GridBagLayout();
		this.jPanelid_ejercicioTablaAmorti.setLayout(this.gridaBagLayoutTablaAmorti);


		jComboBoxid_ejercicioTablaAmorti= new JComboBoxMe();
		jComboBoxid_ejercicioTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioTablaAmorti.setEnabled(false);

		this.jButtonid_ejercicioTablaAmorti= new JButtonMe();
		this.jButtonid_ejercicioTablaAmorti.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioTablaAmorti.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioTablaAmorti.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioTablaAmorti.setText("Buscar");
		this.jButtonid_ejercicioTablaAmorti.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioTablaAmorti.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioTablaAmorti,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioTablaAmorti"));

		this.jButtonid_ejercicioTablaAmortiBusqueda= new JButtonMe();
		this.jButtonid_ejercicioTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioTablaAmortiBusqueda.setText("U");
		this.jButtonid_ejercicioTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioTablaAmortiBusqueda"));

		if(this.tablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioTablaAmortiBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioTablaAmortiUpdate= new JButtonMe();
		this.jButtonid_ejercicioTablaAmortiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioTablaAmortiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioTablaAmortiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioTablaAmortiUpdate.setText("U");
		this.jButtonid_ejercicioTablaAmortiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioTablaAmortiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioTablaAmortiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioTablaAmortiUpdate"));



					
		this.jLabelid_periodoTablaAmorti = new JLabelMe();
		this.jLabelid_periodoTablaAmorti.setText(""+TablaAmortiConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoTablaAmorti.setToolTipText("Periodo");
		this.jLabelid_periodoTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoTablaAmorti.setToolTipText(TablaAmortiConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutTablaAmorti = new GridBagLayout();
		this.jPanelid_periodoTablaAmorti.setLayout(this.gridaBagLayoutTablaAmorti);


		jComboBoxid_periodoTablaAmorti= new JComboBoxMe();
		jComboBoxid_periodoTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoTablaAmorti.setEnabled(false);

		this.jButtonid_periodoTablaAmorti= new JButtonMe();
		this.jButtonid_periodoTablaAmorti.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoTablaAmorti.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoTablaAmorti.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoTablaAmorti.setText("Buscar");
		this.jButtonid_periodoTablaAmorti.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoTablaAmorti.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoTablaAmorti,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoTablaAmorti"));

		this.jButtonid_periodoTablaAmortiBusqueda= new JButtonMe();
		this.jButtonid_periodoTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoTablaAmortiBusqueda.setText("U");
		this.jButtonid_periodoTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoTablaAmortiBusqueda"));

		if(this.tablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoTablaAmortiBusqueda.setVisible(false);		}

		this.jButtonid_periodoTablaAmortiUpdate= new JButtonMe();
		this.jButtonid_periodoTablaAmortiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoTablaAmortiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoTablaAmortiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoTablaAmortiUpdate.setText("U");
		this.jButtonid_periodoTablaAmortiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoTablaAmortiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoTablaAmortiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoTablaAmortiUpdate"));



					
		this.jLabelid_tasaTablaAmorti = new JLabelMe();
		this.jLabelid_tasaTablaAmorti.setText(""+TablaAmortiConstantesFunciones.LABEL_IDTASA+" : *");
		this.jLabelid_tasaTablaAmorti.setToolTipText("Tasa");
		this.jLabelid_tasaTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tasaTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tasaTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tasaTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tasaTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tasaTablaAmorti.setToolTipText(TablaAmortiConstantesFunciones.LABEL_IDTASA);
		this.gridaBagLayoutTablaAmorti = new GridBagLayout();
		this.jPanelid_tasaTablaAmorti.setLayout(this.gridaBagLayoutTablaAmorti);


		jComboBoxid_tasaTablaAmorti= new JComboBoxMe();
		jComboBoxid_tasaTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tasaTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tasaTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tasaTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tasaTablaAmorti= new JButtonMe();
		this.jButtonid_tasaTablaAmorti.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tasaTablaAmorti.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tasaTablaAmorti.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tasaTablaAmorti.setText("Buscar");
		this.jButtonid_tasaTablaAmorti.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tasaTablaAmorti.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tasaTablaAmorti,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tasaTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tasaTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tasaTablaAmorti"));

		this.jButtonid_tasaTablaAmortiBusqueda= new JButtonMe();
		this.jButtonid_tasaTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tasaTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tasaTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tasaTablaAmortiBusqueda.setText("U");
		this.jButtonid_tasaTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tasaTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tasaTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tasaTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tasaTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tasaTablaAmortiBusqueda"));

		if(this.tablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tasaTablaAmortiBusqueda.setVisible(false);		}

		this.jButtonid_tasaTablaAmortiUpdate= new JButtonMe();
		this.jButtonid_tasaTablaAmortiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tasaTablaAmortiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tasaTablaAmortiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tasaTablaAmortiUpdate.setText("U");
		this.jButtonid_tasaTablaAmortiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tasaTablaAmortiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tasaTablaAmortiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tasaTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tasaTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tasaTablaAmortiUpdate"));



					
		this.jLabelid_facturaTablaAmorti = new JLabelMe();
		this.jLabelid_facturaTablaAmorti.setText(""+TablaAmortiConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaTablaAmorti.setToolTipText("Factura");
		this.jLabelid_facturaTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaTablaAmorti.setToolTipText(TablaAmortiConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutTablaAmorti = new GridBagLayout();
		this.jPanelid_facturaTablaAmorti.setLayout(this.gridaBagLayoutTablaAmorti);


		jComboBoxid_facturaTablaAmorti= new JComboBoxMe();
		jComboBoxid_facturaTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaTablaAmorti= new JButtonMe();
		this.jButtonid_facturaTablaAmorti.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaTablaAmorti.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaTablaAmorti.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaTablaAmorti.setText("Buscar");
		this.jButtonid_facturaTablaAmorti.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaTablaAmorti.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaTablaAmorti,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaTablaAmorti"));

		this.jButtonid_facturaTablaAmortiBusqueda= new JButtonMe();
		this.jButtonid_facturaTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaTablaAmortiBusqueda.setText("U");
		this.jButtonid_facturaTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaTablaAmortiBusqueda"));

		if(this.tablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaTablaAmortiBusqueda.setVisible(false);		}

		this.jButtonid_facturaTablaAmortiUpdate= new JButtonMe();
		this.jButtonid_facturaTablaAmortiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaTablaAmortiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaTablaAmortiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaTablaAmortiUpdate.setText("U");
		this.jButtonid_facturaTablaAmortiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaTablaAmortiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaTablaAmortiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaTablaAmortiUpdate"));



					
		this.jLabelid_anioTablaAmorti = new JLabelMe();
		this.jLabelid_anioTablaAmorti.setText(""+TablaAmortiConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioTablaAmorti.setToolTipText("Anio");
		this.jLabelid_anioTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioTablaAmorti.setToolTipText(TablaAmortiConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutTablaAmorti = new GridBagLayout();
		this.jPanelid_anioTablaAmorti.setLayout(this.gridaBagLayoutTablaAmorti);


		jComboBoxid_anioTablaAmorti= new JComboBoxMe();
		jComboBoxid_anioTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioTablaAmorti.setEnabled(false);

		this.jButtonid_anioTablaAmorti= new JButtonMe();
		this.jButtonid_anioTablaAmorti.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioTablaAmorti.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioTablaAmorti.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioTablaAmorti.setText("Buscar");
		this.jButtonid_anioTablaAmorti.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioTablaAmorti.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioTablaAmorti,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioTablaAmorti"));

		this.jButtonid_anioTablaAmortiBusqueda= new JButtonMe();
		this.jButtonid_anioTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioTablaAmortiBusqueda.setText("U");
		this.jButtonid_anioTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioTablaAmortiBusqueda"));

		if(this.tablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioTablaAmortiBusqueda.setVisible(false);		}

		this.jButtonid_anioTablaAmortiUpdate= new JButtonMe();
		this.jButtonid_anioTablaAmortiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioTablaAmortiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioTablaAmortiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioTablaAmortiUpdate.setText("U");
		this.jButtonid_anioTablaAmortiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioTablaAmortiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioTablaAmortiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioTablaAmortiUpdate"));



					
		this.jLabelid_mesTablaAmorti = new JLabelMe();
		this.jLabelid_mesTablaAmorti.setText(""+TablaAmortiConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesTablaAmorti.setToolTipText("Mes");
		this.jLabelid_mesTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesTablaAmorti.setToolTipText(TablaAmortiConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutTablaAmorti = new GridBagLayout();
		this.jPanelid_mesTablaAmorti.setLayout(this.gridaBagLayoutTablaAmorti);


		jComboBoxid_mesTablaAmorti= new JComboBoxMe();
		jComboBoxid_mesTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesTablaAmorti.setEnabled(false);

		this.jButtonid_mesTablaAmorti= new JButtonMe();
		this.jButtonid_mesTablaAmorti.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesTablaAmorti.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesTablaAmorti.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesTablaAmorti.setText("Buscar");
		this.jButtonid_mesTablaAmorti.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesTablaAmorti.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesTablaAmorti,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesTablaAmorti"));

		this.jButtonid_mesTablaAmortiBusqueda= new JButtonMe();
		this.jButtonid_mesTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesTablaAmortiBusqueda.setText("U");
		this.jButtonid_mesTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesTablaAmortiBusqueda"));

		if(this.tablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesTablaAmortiBusqueda.setVisible(false);		}

		this.jButtonid_mesTablaAmortiUpdate= new JButtonMe();
		this.jButtonid_mesTablaAmortiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesTablaAmortiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesTablaAmortiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesTablaAmortiUpdate.setText("U");
		this.jButtonid_mesTablaAmortiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesTablaAmortiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesTablaAmortiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesTablaAmortiUpdate"));



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
		//this.jInternalFrameDetalleTablaAmorti = new TablaAmortiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tabla Amorti DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTablaAmorti= new GridBagLayout();
		

		
		String sToolTipTablaAmorti="";
		sToolTipTablaAmorti=TablaAmortiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTablaAmorti+="(Facturacion.TablaAmorti)";
		}
		
		if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
			sToolTipTablaAmorti+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTablaAmorti = new JButtonMe();
		this.jButtonModificarTablaAmorti = new JButtonMe();
        this.jButtonActualizarTablaAmorti = new JButtonMe();
        this.jButtonEliminarTablaAmorti = new JButtonMe();
        this.jButtonCancelarTablaAmorti = new JButtonMe();
        this.jButtonGuardarCambiosTablaAmorti = new JButtonMe();
		this.jButtonGuardarCambiosTablaTablaAmorti = new JButtonMe();
		this.jButtonCerrarTablaAmorti = new JButtonMe();
		
		this.jScrollPanelDatosTablaAmorti = new JScrollPane();   
        this.jScrollPanelDatosEdicionTablaAmorti = new JScrollPane();
		this.jScrollPanelDatosGeneralTablaAmorti = new JScrollPane();
				
		
		
		this.jPanelCamposTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tabla Amorti";
		
		if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tabla Amortis" + this.sPath));
		} else {
			this.jScrollPanelDatosTablaAmorti.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTablaAmorti.setName("jPanelCamposTablaAmorti"); 

		this.jPanelCamposOcultosTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTablaAmorti.setName("jPanelCamposOcultosTablaAmorti"); 

        this.jPanelAccionesTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTablaAmorti.setToolTipText("Acciones");
        this.jPanelAccionesTablaAmorti.setName("Acciones"); 

		this.jPanelAccionesFormularioTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTablaAmorti.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTablaAmorti.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTablaAmorti.setText("Nuevo");
		this.jButtonModificarTablaAmorti.setText("Editar");
        this.jButtonActualizarTablaAmorti.setText("Actualizar");
        this.jButtonEliminarTablaAmorti.setText("Eliminar");
        this.jButtonCancelarTablaAmorti.setText("Cancelar");
        this.jButtonGuardarCambiosTablaAmorti.setText("Guardar");
		this.jButtonGuardarCambiosTablaTablaAmorti.setText("Guardar");
		this.jButtonCerrarTablaAmorti.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTablaAmorti,"nuevo_button","Nuevo",this.tablaamortiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTablaAmorti,"modificar_button","Editar",this.tablaamortiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTablaAmorti,"actualizar_button","Actualizar",this.tablaamortiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTablaAmorti,"eliminar_button","Eliminar",this.tablaamortiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTablaAmorti,"cancelar_button","Cancelar",this.tablaamortiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAmorti,"guardarcambios_button","Guardar",this.tablaamortiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTablaAmorti,"guardarcambiostabla_button","Guardar",this.tablaamortiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTablaAmorti,"cerrar_button","Salir",this.tablaamortiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTablaAmorti.setToolTipText("Nuevo"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTablaAmorti.setToolTipText("Editar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTablaAmorti.setToolTipText("Actualizar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTablaAmorti.setToolTipText("Eliminar)"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTablaAmorti.setToolTipText("Cancelar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTablaAmorti.setToolTipText("Guardar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTablaAmorti.setToolTipText("Guardar"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTablaAmorti.setToolTipText("Salir"+" "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTablaAmorti";
		inputMap = this.jButtonNuevoTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTablaAmorti.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTablaAmorti"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTablaAmorti";
		inputMap = this.jButtonActualizarTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTablaAmorti"));
		
		//ELIMINAR
		sMapKey = "EliminarTablaAmorti";
		inputMap = this.jButtonEliminarTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTablaAmorti"));
		
		//CANCELAR	
		sMapKey = "CancelarTablaAmorti";
		inputMap = this.jButtonCancelarTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTablaAmorti"));
		
		//CERRAR		
		sMapKey = "CerrarTablaAmorti";
		inputMap = this.jButtonCerrarTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTablaAmorti"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTablaAmorti";
		inputMap = this.jButtonGuardarCambiosTablaTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTablaAmorti"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTablaAmorti = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTablaAmorti.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTablaAmorti.setToolTipText("Nuevo TablaAmorti");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTablaAmorti = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTablaAmorti.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTablaAmorti.setToolTipText("Sin Cerrar Ventana TablaAmorti");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTablaAmorti = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTablaAmorti.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTablaAmorti.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTablaAmorti = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTablaAmorti.setText("Accion");
		this.jComboBoxTiposAccionesTablaAmorti.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTablaAmorti = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTablaAmorti.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTablaAmorti.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTablaAmorti = new JLabelMe();
		
		this.jLabelAccionesTablaAmorti.setText("Acciones");		
		this.jLabelAccionesTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTablaAmorti();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTablaAmorti();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTablaAmorti=new JTabbedPane();
		this.jTabbedPaneRelacionesTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTablaAmorti.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTablaAmorti.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTablaAmorti.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTablaAmorti.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTablaAmorti.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTablaAmorti.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTablaAmorti = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTablaAmorti = new GridBagLayout();
		
		this.jPanelCamposTablaAmorti.setLayout(gridaBagLayoutCamposTablaAmorti);
		this.jPanelCamposOcultosTablaAmorti.setLayout(gridaBagLayoutCamposOcultosTablaAmorti);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 0;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTablaAmorti.add(jLabelIdTablaAmorti, this.gridBagConstraintsTablaAmorti);



	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 1;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTablaAmorti.add(jLabelidTablaAmorti, this.gridBagConstraintsTablaAmorti);


	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 0;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTablaAmorti.add(jLabelid_empresaTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = 0;
		this.gridBagConstraintsTablaAmorti.gridx = 2;
		this.gridBagConstraintsTablaAmorti.ipadx = 0;
		this.gridBagConstraintsTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTablaAmorti.add(jButtonid_empresaTablaAmortiBusqueda, this.gridBagConstraintsTablaAmorti);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = 0;
		this.gridBagConstraintsTablaAmorti.gridx = 3;
		this.gridBagConstraintsTablaAmorti.ipadx = 0;
		this.gridBagConstraintsTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTablaAmorti.add(jButtonid_empresaTablaAmortiUpdate, this.gridBagConstraintsTablaAmorti);
	}

	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 1;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTablaAmorti.add(jComboBoxid_empresaTablaAmorti, this.gridBagConstraintsTablaAmorti);


	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 0;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalTablaAmorti.add(jLabelid_sucursalTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = 0;
		this.gridBagConstraintsTablaAmorti.gridx = 2;
		this.gridBagConstraintsTablaAmorti.ipadx = 0;
		this.gridBagConstraintsTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTablaAmorti.add(jButtonid_sucursalTablaAmortiBusqueda, this.gridBagConstraintsTablaAmorti);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = 0;
		this.gridBagConstraintsTablaAmorti.gridx = 3;
		this.gridBagConstraintsTablaAmorti.ipadx = 0;
		this.gridBagConstraintsTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTablaAmorti.add(jButtonid_sucursalTablaAmortiUpdate, this.gridBagConstraintsTablaAmorti);
	}

	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 1;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalTablaAmorti.add(jComboBoxid_sucursalTablaAmorti, this.gridBagConstraintsTablaAmorti);


	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 0;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioTablaAmorti.add(jLabelid_ejercicioTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = 0;
		this.gridBagConstraintsTablaAmorti.gridx = 2;
		this.gridBagConstraintsTablaAmorti.ipadx = 0;
		this.gridBagConstraintsTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioTablaAmorti.add(jButtonid_ejercicioTablaAmortiBusqueda, this.gridBagConstraintsTablaAmorti);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = 0;
		this.gridBagConstraintsTablaAmorti.gridx = 3;
		this.gridBagConstraintsTablaAmorti.ipadx = 0;
		this.gridBagConstraintsTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioTablaAmorti.add(jButtonid_ejercicioTablaAmortiUpdate, this.gridBagConstraintsTablaAmorti);
	}

	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 1;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioTablaAmorti.add(jComboBoxid_ejercicioTablaAmorti, this.gridBagConstraintsTablaAmorti);


	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 0;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoTablaAmorti.add(jLabelid_periodoTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = 0;
		this.gridBagConstraintsTablaAmorti.gridx = 2;
		this.gridBagConstraintsTablaAmorti.ipadx = 0;
		this.gridBagConstraintsTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoTablaAmorti.add(jButtonid_periodoTablaAmortiBusqueda, this.gridBagConstraintsTablaAmorti);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = 0;
		this.gridBagConstraintsTablaAmorti.gridx = 3;
		this.gridBagConstraintsTablaAmorti.ipadx = 0;
		this.gridBagConstraintsTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoTablaAmorti.add(jButtonid_periodoTablaAmortiUpdate, this.gridBagConstraintsTablaAmorti);
	}

	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 1;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoTablaAmorti.add(jComboBoxid_periodoTablaAmorti, this.gridBagConstraintsTablaAmorti);


	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 0;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tasaTablaAmorti.add(jLabelid_tasaTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = 0;
		this.gridBagConstraintsTablaAmorti.gridx = 2;
		this.gridBagConstraintsTablaAmorti.ipadx = 0;
		this.gridBagConstraintsTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tasaTablaAmorti.add(jButtonid_tasaTablaAmortiBusqueda, this.gridBagConstraintsTablaAmorti);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = 0;
		this.gridBagConstraintsTablaAmorti.gridx = 3;
		this.gridBagConstraintsTablaAmorti.ipadx = 0;
		this.gridBagConstraintsTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tasaTablaAmorti.add(jButtonid_tasaTablaAmortiUpdate, this.gridBagConstraintsTablaAmorti);
	}

	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 1;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tasaTablaAmorti.add(jComboBoxid_tasaTablaAmorti, this.gridBagConstraintsTablaAmorti);


	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 0;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_facturaTablaAmorti.add(jLabelid_facturaTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	//this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 2;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaTablaAmorti.add(jButtonid_facturaTablaAmorti, this.gridBagConstraintsTablaAmorti);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = 0;
		this.gridBagConstraintsTablaAmorti.gridx = 3;
		this.gridBagConstraintsTablaAmorti.ipadx = 0;
		this.gridBagConstraintsTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaTablaAmorti.add(jButtonid_facturaTablaAmortiBusqueda, this.gridBagConstraintsTablaAmorti);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = 0;
		this.gridBagConstraintsTablaAmorti.gridx = 4;
		this.gridBagConstraintsTablaAmorti.ipadx = 0;
		this.gridBagConstraintsTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaTablaAmorti.add(jButtonid_facturaTablaAmortiUpdate, this.gridBagConstraintsTablaAmorti);
	}

	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 1;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_facturaTablaAmorti.add(jComboBoxid_facturaTablaAmorti, this.gridBagConstraintsTablaAmorti);


	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 0;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionTablaAmorti.add(jLabelfecha_emisionTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = 0;
		this.gridBagConstraintsTablaAmorti.gridx = 2;
		this.gridBagConstraintsTablaAmorti.ipadx = 0;
		this.gridBagConstraintsTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionTablaAmorti.add(jButtonfecha_emisionTablaAmortiBusqueda, this.gridBagConstraintsTablaAmorti);
	}

	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 1;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionTablaAmorti.add(jDateChooserfecha_emisionTablaAmorti, this.gridBagConstraintsTablaAmorti);


	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 0;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoTablaAmorti.add(jLabelfecha_vencimientoTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = 0;
		this.gridBagConstraintsTablaAmorti.gridx = 2;
		this.gridBagConstraintsTablaAmorti.ipadx = 0;
		this.gridBagConstraintsTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoTablaAmorti.add(jButtonfecha_vencimientoTablaAmortiBusqueda, this.gridBagConstraintsTablaAmorti);
	}

	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 1;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoTablaAmorti.add(jDateChooserfecha_vencimientoTablaAmorti, this.gridBagConstraintsTablaAmorti);


	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 0;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_prestamoTablaAmorti.add(jLabelvalor_prestamoTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = 0;
		this.gridBagConstraintsTablaAmorti.gridx = 2;
		this.gridBagConstraintsTablaAmorti.ipadx = 0;
		this.gridBagConstraintsTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_prestamoTablaAmorti.add(jButtonvalor_prestamoTablaAmortiBusqueda, this.gridBagConstraintsTablaAmorti);
	}

	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 1;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_prestamoTablaAmorti.add(jTextFieldvalor_prestamoTablaAmorti, this.gridBagConstraintsTablaAmorti);


	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 0;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cuotasTablaAmorti.add(jLabelnumero_cuotasTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = 0;
		this.gridBagConstraintsTablaAmorti.gridx = 2;
		this.gridBagConstraintsTablaAmorti.ipadx = 0;
		this.gridBagConstraintsTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cuotasTablaAmorti.add(jButtonnumero_cuotasTablaAmortiBusqueda, this.gridBagConstraintsTablaAmorti);
	}

	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 1;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cuotasTablaAmorti.add(jTextFieldnumero_cuotasTablaAmorti, this.gridBagConstraintsTablaAmorti);


	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 0;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioTablaAmorti.add(jLabelid_anioTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = 0;
		this.gridBagConstraintsTablaAmorti.gridx = 2;
		this.gridBagConstraintsTablaAmorti.ipadx = 0;
		this.gridBagConstraintsTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioTablaAmorti.add(jButtonid_anioTablaAmortiBusqueda, this.gridBagConstraintsTablaAmorti);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = 0;
		this.gridBagConstraintsTablaAmorti.gridx = 3;
		this.gridBagConstraintsTablaAmorti.ipadx = 0;
		this.gridBagConstraintsTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioTablaAmorti.add(jButtonid_anioTablaAmortiUpdate, this.gridBagConstraintsTablaAmorti);
	}

	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 1;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioTablaAmorti.add(jComboBoxid_anioTablaAmorti, this.gridBagConstraintsTablaAmorti);


	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 0;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesTablaAmorti.add(jLabelid_mesTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = 0;
		this.gridBagConstraintsTablaAmorti.gridx = 2;
		this.gridBagConstraintsTablaAmorti.ipadx = 0;
		this.gridBagConstraintsTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesTablaAmorti.add(jButtonid_mesTablaAmortiBusqueda, this.gridBagConstraintsTablaAmorti);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmorti.gridy = 0;
		this.gridBagConstraintsTablaAmorti.gridx = 3;
		this.gridBagConstraintsTablaAmorti.ipadx = 0;
		this.gridBagConstraintsTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesTablaAmorti.add(jButtonid_mesTablaAmortiUpdate, this.gridBagConstraintsTablaAmorti);
	}

	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmorti.gridy = 0;
	this.gridBagConstraintsTablaAmorti.gridx = 1;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesTablaAmorti.add(jComboBoxid_mesTablaAmorti, this.gridBagConstraintsTablaAmorti);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmorti.gridy = iYPanelCamposTablaAmorti;
	this.gridBagConstraintsTablaAmorti.gridx = iXPanelCamposTablaAmorti++;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaAmorti.add(this.jPanelidTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(iXPanelCamposTablaAmorti % 2==0) {
		iXPanelCamposTablaAmorti=0;
		iYPanelCamposTablaAmorti++;
	}
	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmorti.gridy = iYPanelCamposTablaAmorti;
	this.gridBagConstraintsTablaAmorti.gridx = iXPanelCamposTablaAmorti++;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaAmorti.add(this.jPanelid_tasaTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(iXPanelCamposTablaAmorti % 2==0) {
		iXPanelCamposTablaAmorti=0;
		iYPanelCamposTablaAmorti++;
	}
	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmorti.gridy = iYPanelCamposTablaAmorti;
	this.gridBagConstraintsTablaAmorti.gridx = iXPanelCamposTablaAmorti++;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaAmorti.add(this.jPanelid_facturaTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(iXPanelCamposTablaAmorti % 2==0) {
		iXPanelCamposTablaAmorti=0;
		iYPanelCamposTablaAmorti++;
	}
	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmorti.gridy = iYPanelCamposTablaAmorti;
	this.gridBagConstraintsTablaAmorti.gridx = iXPanelCamposTablaAmorti++;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaAmorti.add(this.jPanelfecha_emisionTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(iXPanelCamposTablaAmorti % 2==0) {
		iXPanelCamposTablaAmorti=0;
		iYPanelCamposTablaAmorti++;
	}
	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmorti.gridy = iYPanelCamposTablaAmorti;
	this.gridBagConstraintsTablaAmorti.gridx = iXPanelCamposTablaAmorti++;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaAmorti.add(this.jPanelfecha_vencimientoTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(iXPanelCamposTablaAmorti % 2==0) {
		iXPanelCamposTablaAmorti=0;
		iYPanelCamposTablaAmorti++;
	}
	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmorti.gridy = iYPanelCamposTablaAmorti;
	this.gridBagConstraintsTablaAmorti.gridx = iXPanelCamposTablaAmorti++;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaAmorti.add(this.jPanelvalor_prestamoTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(iXPanelCamposTablaAmorti % 2==0) {
		iXPanelCamposTablaAmorti=0;
		iYPanelCamposTablaAmorti++;
	}
	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmorti.gridy = iYPanelCamposTablaAmorti;
	this.gridBagConstraintsTablaAmorti.gridx = iXPanelCamposTablaAmorti++;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaAmorti.add(this.jPanelnumero_cuotasTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(iXPanelCamposTablaAmorti % 2==0) {
		iXPanelCamposTablaAmorti=0;
		iYPanelCamposTablaAmorti++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmorti.gridy = iYPanelCamposOcultosTablaAmorti;
	this.gridBagConstraintsTablaAmorti.gridx = iXPanelCamposOcultosTablaAmorti++;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTablaAmorti.add(this.jPanelid_empresaTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(iXPanelCamposOcultosTablaAmorti % 2==0) {
		iXPanelCamposOcultosTablaAmorti=0;
		iYPanelCamposOcultosTablaAmorti++;
	}
	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmorti.gridy = iYPanelCamposOcultosTablaAmorti;
	this.gridBagConstraintsTablaAmorti.gridx = iXPanelCamposOcultosTablaAmorti++;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTablaAmorti.add(this.jPanelid_sucursalTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(iXPanelCamposOcultosTablaAmorti % 2==0) {
		iXPanelCamposOcultosTablaAmorti=0;
		iYPanelCamposOcultosTablaAmorti++;
	}
	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmorti.gridy = iYPanelCamposOcultosTablaAmorti;
	this.gridBagConstraintsTablaAmorti.gridx = iXPanelCamposOcultosTablaAmorti++;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTablaAmorti.add(this.jPanelid_ejercicioTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(iXPanelCamposOcultosTablaAmorti % 2==0) {
		iXPanelCamposOcultosTablaAmorti=0;
		iYPanelCamposOcultosTablaAmorti++;
	}
	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmorti.gridy = iYPanelCamposOcultosTablaAmorti;
	this.gridBagConstraintsTablaAmorti.gridx = iXPanelCamposOcultosTablaAmorti++;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTablaAmorti.add(this.jPanelid_periodoTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(iXPanelCamposOcultosTablaAmorti % 2==0) {
		iXPanelCamposOcultosTablaAmorti=0;
		iYPanelCamposOcultosTablaAmorti++;
	}
	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmorti.gridy = iYPanelCamposOcultosTablaAmorti;
	this.gridBagConstraintsTablaAmorti.gridx = iXPanelCamposOcultosTablaAmorti++;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTablaAmorti.add(this.jPanelid_anioTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(iXPanelCamposOcultosTablaAmorti % 2==0) {
		iXPanelCamposOcultosTablaAmorti=0;
		iYPanelCamposOcultosTablaAmorti++;
	}
	this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmorti.gridy = iYPanelCamposOcultosTablaAmorti;
	this.gridBagConstraintsTablaAmorti.gridx = iXPanelCamposOcultosTablaAmorti++;
	this.gridBagConstraintsTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTablaAmorti.add(this.jPanelid_mesTablaAmorti, this.gridBagConstraintsTablaAmorti);



	if(iXPanelCamposOcultosTablaAmorti % 2==0) {
		iXPanelCamposOcultosTablaAmorti=0;
		iYPanelCamposOcultosTablaAmorti++;
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
			
		GridBagLayout gridaBagLayoutAccionesTablaAmorti= new GridBagLayout();
		this.jPanelAccionesTablaAmorti.setLayout(gridaBagLayoutAccionesTablaAmorti);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTablaAmorti= new GridBagLayout();
		this.jPanelAccionesFormularioTablaAmorti.setLayout(gridaBagLayoutAccionesFormularioTablaAmorti);
		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTablaAmorti.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTablaAmorti.add(this.jComboBoxTiposAccionesFormularioTablaAmorti, this.gridBagConstraintsTablaAmorti);

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTablaAmorti.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTablaAmorti.add(this.jCheckBoxPostAccionNuevoTablaAmorti, this.gridBagConstraintsTablaAmorti);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tablaamortiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTablaAmorti.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTablaAmorti.add(this.jCheckBoxPostAccionSinCerrarTablaAmorti, this.gridBagConstraintsTablaAmorti);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tablaamortiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTablaAmorti.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTablaAmorti.add(this.jCheckBoxPostAccionSinMensajeTablaAmorti, this.gridBagConstraintsTablaAmorti);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmorti.gridy = 0;
		this.gridBagConstraintsTablaAmorti.gridx = iPosXAccion++;
			
		this.jPanelAccionesTablaAmorti.add(this.jButtonModificarTablaAmorti, this.gridBagConstraintsTablaAmorti);							

		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmorti.gridy = 0;
		this.gridBagConstraintsTablaAmorti.gridx =iPosXAccion++;
			
		this.jPanelAccionesTablaAmorti.add(this.jButtonEliminarTablaAmorti, this.gridBagConstraintsTablaAmorti);
		
			
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.gridy = 0;		
		this.gridBagConstraintsTablaAmorti.gridx = iPosXAccion++;
		
		this.jPanelAccionesTablaAmorti.add(this.jButtonActualizarTablaAmorti, this.gridBagConstraintsTablaAmorti);


		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.gridy = 0;		
		this.gridBagConstraintsTablaAmorti.gridx = iPosXAccion++;
		
		this.jPanelAccionesTablaAmorti.add(this.jButtonGuardarCambiosTablaAmorti, this.gridBagConstraintsTablaAmorti);	
		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.gridy = 0;		
		this.gridBagConstraintsTablaAmorti.gridx =iPosXAccion++;
		
		this.jPanelAccionesTablaAmorti.add(this.jButtonCancelarTablaAmorti, this.gridBagConstraintsTablaAmorti);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTablaAmorti = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTablaAmorti);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tablaamortiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();						
			this.gridBagConstraintsTablaAmorti.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTablaAmorti.gridx = 0;		
			//this.gridBagConstraintsTablaAmorti.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTablaAmorti.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTablaAmorti.gridx =0;
		this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTablaAmorti.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTablaAmorti, this.gridBagConstraintsTablaAmorti);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TablaAmortiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTablaAmorti = new TablaAmortiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tabla Amorti DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tabla Amorti DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tabla Amorti Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TablaAmortiModel tablaamortiModel=new TablaAmortiModel(this);
			
			//SI USARA CLASE INTERNA
			//TablaAmortiModel.TablaAmortiFocusTraversalPolicy tablaamortiFocusTraversalPolicy = tablaamortiModel.new TablaAmortiFocusTraversalPolicy(this);
			
			//tablaamortiFocusTraversalPolicy.settablaamortiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tablaamortiModel);
			
			
			this.jContentPaneDetalleTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTablaAmorti = new GridBagLayout();	
			this.jContentPaneDetalleTablaAmorti.setLayout(gridaBagLayoutDetalleTablaAmorti);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTablaAmorti = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
				this.gridBagConstraintsTablaAmorti.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTablaAmorti.gridx = 0;
					
				
				this.jContentPaneDetalleTablaAmorti.add(jTtoolBarDetalleTablaAmorti, gridBagConstraintsTablaAmorti);								
				
}
			
			this.jScrollPanelDatosEdicionTablaAmorti=   new JScrollPane(jContentPaneDetalleTablaAmorti,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTablaAmorti.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTablaAmorti.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTablaAmorti.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTablaAmorti=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTablaAmorti.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTablaAmorti.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTablaAmorti.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTablaAmorti.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTablaAmorti.gridx = 0;
	        
			this.jContentPaneDetalleTablaAmorti.add(jPanelCamposTablaAmorti, gridBagConstraintsTablaAmorti);
			
			
			
			
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
						&& tablaamortiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleTablaAmorti(this.puedeCargarPorParteDetalleTablaAmorti,false,-1);
					
					if(this.tablaamortiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTablaAmorti= new GridBagConstraints();
						this.gridBagConstraintsTablaAmorti.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTablaAmorti.gridx = 0;
						this.jContentPaneDetalleTablaAmorti.add(this.jTabbedPaneRelacionesTablaAmorti, this.gridBagConstraintsTablaAmorti);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTablaAmorti.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleTablaAmorti(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTablaAmorti.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
					this.gridBagConstraintsTablaAmorti.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTablaAmorti.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTablaAmorti.gridx = 0;
					
				
					this.jContentPaneDetalleTablaAmorti.add(jPanelCamposOcultosTablaAmorti, gridBagConstraintsTablaAmorti);
				
					this.jPanelCamposOcultosTablaAmorti.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTablaAmorti.gridx = 0;
	        this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTablaAmorti.add(this.jPanelAccionesFormularioTablaAmorti, this.gridBagConstraintsTablaAmorti);							
			
			
			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
	        this.gridBagConstraintsTablaAmorti.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTablaAmorti.gridx = 0;
	        
			
			this.jContentPaneDetalleTablaAmorti.add(this.jPanelAccionesTablaAmorti, this.gridBagConstraintsTablaAmorti);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTablaAmorti);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTablaAmorti=   new JScrollPane(this.jPanelCamposTablaAmorti,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTablaAmorti.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTablaAmorti.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTablaAmorti.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTablaAmorti.gridx = 0;
			this.gridBagConstraintsTablaAmorti.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTablaAmorti.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTablaAmorti.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTablaAmorti, this.gridBagConstraintsTablaAmorti);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTablaAmorti.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTablaAmorti, this.gridBagConstraintsTablaAmorti);			
			
			this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsTablaAmorti.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTablaAmorti.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTablaAmorti, this.gridBagConstraintsTablaAmorti);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTablaAmorti.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTablaAmorti, this.gridBagConstraintsTablaAmorti);
			
			
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTablaAmorti.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTablaAmorti, this.gridBagConstraintsTablaAmorti);
		
			
		this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsTablaAmorti.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTablaAmorti.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTablaAmorti, this.gridBagConstraintsTablaAmorti);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTablaAmorti;//jContentPane;
		
		return jScrollPanelDatosEdicionTablaAmorti;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleTablaAmorti(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalletablaamortiSessionBean=new DetalleTablaAmortiSessionBean();
		this.detalletablaamortiSessionBean.setConGuardarRelaciones(false);
		this.detalletablaamortiSessionBean.setEsGuardarRelacionado(true);

		this.detalletablaamortiBeanSwingJInternalFrame=null;//new DetalleTablaAmortiBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalletablaamortiBeanSwingJInternalFramePopup=new DetalleTablaAmortiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalletablaamortiBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {

				DetalleTablaAmortiJInternalFrame.STIPO_TAMANIO_GENERAL=TablaAmortiJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleTablaAmortiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TablaAmortiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalletablaamortiSessionBean.setEsGuardarRelacionado(true);

				this.detalletablaamortiBeanSwingJInternalFrame=new DetalleTablaAmortiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalletablaamortiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalletablaamortiBeanSwingJInternalFrame.setdetalletablaamortiSessionBean(this.detalletablaamortiSessionBean);

				//this.gridBagConstraintsTablaAmorti = new GridBagConstraints();
				//this.gridBagConstraintsTablaAmorti.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTablaAmorti.gridx = 0;
				//this.jContentPaneDetalleTablaAmorti.add(this.detalletablaamortiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTablaAmorti);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTablaAmorti.add("Detalle Tabla Amortis",this.detalletablaamortiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTablaAmorti.setComponentAt(iIndexTab,this.detalletablaamortiBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleTablaAmortiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalletablaamortiSessionBean.setEsGuardarRelacionado(false);
				this.detalletablaamortiBeanSwingJInternalFrame=null;//new DetalleTablaAmortiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleTablaAmorti) {
					this.jTabbedPaneRelacionesTablaAmorti.add("Detalle Tabla Amortis",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleTablaAmortiBeanSwingJInternalFrame(List<TablaAmorti> tablaamortis,TablaAmorti tablaamorti,DetalleTablaAmortiBeanSwingJInternalFrame detalletablaamortiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalletablaamortiBeanSwingJInternalFrame=new DetalleTablaAmortiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalletablaamortiBeanSwingJInternalFrame.getDetalleTablaAmortiLogic().setConnexion(this.tablaamortiLogic.getConnexion());

					detalletablaamortiBeanSwingJInternalFrame.settablaamortisForeignKey(tablaamortis);
					detalletablaamortiBeanSwingJInternalFrame.settablaamortiForeignKey(tablaamorti);
					detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiSessionBean.setisBusquedaDesdeForeignKeySesionTablaAmorti(true);
					detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiSessionBean.setlidTablaAmortiActual(tablaamorti.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalletablaamortiBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleTablaAmorti(detalletablaamortiBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalletablaamortiBeanSwingJInternalFrame.setVisibilidadBusquedasParaTablaAmorti(true);
					detalletablaamortiBeanSwingJInternalFrame.setid_tabla_amortiFK_IdTablaAmorti(tablaamorti.getId());

					if(!this.conCargarFormDetalle) {
						detalletablaamortiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalletablaamortiBeanSwingJInternalFrame.setSelectedItemCombosFrameTablaAmortiForeignKey(tablaamorti,1,false,true,true);
					detalletablaamortiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalletablaamortiBeanSwingJInternalFrame.procesarBusqueda("FK_IdTablaAmorti");
					detalletablaamortiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTablaAmorti");
					detalletablaamortiBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleTablaAmorti(true);
					detalletablaamortiBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleTablaAmorti("n",detalletablaamortiBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalletablaamortiBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalletablaamortiBeanSwingJInternalFrame.setAutoscrolls(true);
					detalletablaamortiBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalletablaamortiBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleTablaAmorti("relacionado");
					} else {
						detalletablaamortiBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleTablaAmorti("no_relacionado");
					}

					detalletablaamortiBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleTablaAmorti().setVisible(false);

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
