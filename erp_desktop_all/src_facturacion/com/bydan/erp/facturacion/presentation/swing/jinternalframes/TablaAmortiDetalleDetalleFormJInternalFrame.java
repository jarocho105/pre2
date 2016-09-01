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
import com.bydan.erp.facturacion.util.TablaAmortiDetalleConstantesFunciones;

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
public class TablaAmortiDetalleDetalleFormJInternalFrame extends TablaAmortiDetalleBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTablaAmortiDetalle;
	
	protected JMenuBar jmenuBarDetalleTablaAmortiDetalle;
	
	protected JMenu jmenuDetalleTablaAmortiDetalle;
	protected JMenu jmenuDetalleArchivoTablaAmortiDetalle;
	protected JMenu jmenuDetalleAccionesTablaAmortiDetalle;
	protected JMenu jmenuDetalleDatosTablaAmortiDetalle;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTablaAmortiDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTablaAmortiDetalle;	
	protected GridBagConstraints gridBagConstraintsTablaAmortiDetalle;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TablaAmortiDetalleBeanSwingJInternalFrameAdditional jInternalFrameDetalleTablaAmortiDetalle;		
	
	
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

	protected TipoIntervaloBeanSwingJInternalFrame tipointervaloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipointervalo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public TablaAmortiDetalleSessionBean tablaamortidetalleSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public TasaSessionBean tasaSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public TipoIntervaloSessionBean tipointervaloSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public TablaAmortiDetalleLogic tablaamortidetalleLogic;
	
	public JScrollPane jScrollPanelDatosTablaAmortiDetalle;
	public JScrollPane jScrollPanelDatosEdicionTablaAmortiDetalle;
	public JScrollPane jScrollPanelDatosGeneralTablaAmortiDetalle;
	
	protected JPanel jPanelCamposTablaAmortiDetalle;    
	protected JPanel jPanelCamposOcultosTablaAmortiDetalle;    	
	protected JPanel jPanelAccionesTablaAmortiDetalle;
	protected JPanel jPanelAccionesFormularioTablaAmortiDetalle;
    
	
	
	protected Integer iXPanelCamposTablaAmortiDetalle=0;
	protected Integer iYPanelCamposTablaAmortiDetalle=0;
	
	protected Integer iXPanelCamposOcultosTablaAmortiDetalle=0;
	protected Integer iYPanelCamposOcultosTablaAmortiDetalle=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTablaAmortiDetalle;
	public JButton jButtonModificarTablaAmortiDetalle;
	public JButton jButtonActualizarTablaAmortiDetalle;
    public JButton jButtonEliminarTablaAmortiDetalle;
	public JButton jButtonCancelarTablaAmortiDetalle;
    public JButton jButtonGuardarCambiosTablaAmortiDetalle;
	public JButton jButtonGuardarCambiosTablaTablaAmortiDetalle;
	protected JButton jButtonCerrarTablaAmortiDetalle;
	
	
	protected JButton jButtonProcesarInformacionTablaAmortiDetalle;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTablaAmortiDetalle;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTablaAmortiDetalle;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTablaAmortiDetalle;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTablaAmortiDetalle;
	protected JButton jButtonModificarToolBarTablaAmortiDetalle;
	protected JButton jButtonActualizarToolBarTablaAmortiDetalle;
    protected JButton jButtonEliminarToolBarTablaAmortiDetalle;
	protected JButton jButtonCancelarToolBarTablaAmortiDetalle;
    protected JButton jButtonGuardarCambiosToolBarTablaAmortiDetalle;
	protected JButton jButtonGuardarCambiosTablaToolBarTablaAmortiDetalle;
	protected JButton jButtonMostrarOcultarTablaToolBarTablaAmortiDetalle;
	protected JButton jButtonCerrarToolBarTablaAmortiDetalle;
	
	protected JButton jButtonProcesarInformacionToolBarTablaAmortiDetalle;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTablaAmortiDetalle;
	protected JMenuItem jMenuItemModificarTablaAmortiDetalle;
	protected JMenuItem jMenuItemActualizarTablaAmortiDetalle;
    protected JMenuItem jMenuItemEliminarTablaAmortiDetalle;
	protected JMenuItem jMenuItemCancelarTablaAmortiDetalle;
    protected JMenuItem jMenuItemGuardarCambiosTablaAmortiDetalle;
	protected JMenuItem jMenuItemGuardarCambiosTablaTablaAmortiDetalle;
	protected JMenuItem jMenuItemCerrarTablaAmortiDetalle;
	protected JMenuItem jMenuItemDetalleCerrarTablaAmortiDetalle;
	protected JMenuItem jMenuItemDetalleMostarOcultarTablaAmortiDetalle;
	
	protected JMenuItem jMenuItemProcesarInformacionTablaAmortiDetalle;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTablaAmortiDetalle;
	protected JMenuItem jMenuItemMostrarOcultarTablaAmortiDetalle;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTablaAmortiDetalle;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTablaAmortiDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTablaAmortiDetalle;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTablaAmortiDetalle;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTablaAmortiDetalle;
	public JLabel jLabelIdTablaAmortiDetalle;
	public JLabel jLabelidTablaAmortiDetalle;
	public JButton jButtonidTablaAmortiDetalleBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionTablaAmortiDetalle;
	public JLabel jLabelfecha_emisionTablaAmortiDetalle;
	//public JFormattedTextField jDateChooserfecha_emisionTablaAmortiDetalle;

	public JDateChooser jDateChooserfecha_emisionTablaAmortiDetalle;
	public JButton jButtonfecha_emisionTablaAmortiDetalleBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoTablaAmortiDetalle;
	public JLabel jLabelfecha_vencimientoTablaAmortiDetalle;
	//public JFormattedTextField jDateChooserfecha_vencimientoTablaAmortiDetalle;

	public JDateChooser jDateChooserfecha_vencimientoTablaAmortiDetalle;
	public JButton jButtonfecha_vencimientoTablaAmortiDetalleBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicialTablaAmortiDetalle;
	public JLabel jLabelfecha_inicialTablaAmortiDetalle;
	//public JFormattedTextField jDateChooserfecha_inicialTablaAmortiDetalle;

	public JDateChooser jDateChooserfecha_inicialTablaAmortiDetalle;
	public JButton jButtonfecha_inicialTablaAmortiDetalleBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finalTablaAmortiDetalle;
	public JLabel jLabelfecha_finalTablaAmortiDetalle;
	//public JFormattedTextField jDateChooserfecha_finalTablaAmortiDetalle;

	public JDateChooser jDateChooserfecha_finalTablaAmortiDetalle;
	public JButton jButtonfecha_finalTablaAmortiDetalleBusqueda= new JButtonMe();

	public JPanel jPanelvalorTablaAmortiDetalle;
	public JLabel jLabelvalorTablaAmortiDetalle;
	public JTextField jTextFieldvalorTablaAmortiDetalle;
	public JButton jButtonvalorTablaAmortiDetalleBusqueda= new JButtonMe();

	public JPanel jPanelinteresTablaAmortiDetalle;
	public JLabel jLabelinteresTablaAmortiDetalle;
	public JTextField jTextFieldinteresTablaAmortiDetalle;
	public JButton jButtoninteresTablaAmortiDetalleBusqueda= new JButtonMe();

	public JPanel jPanelcapitalTablaAmortiDetalle;
	public JLabel jLabelcapitalTablaAmortiDetalle;
	public JTextField jTextFieldcapitalTablaAmortiDetalle;
	public JButton jButtoncapitalTablaAmortiDetalleBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cuotasTablaAmortiDetalle;
	public JLabel jLabelnumero_cuotasTablaAmortiDetalle;
	public JTextField jTextFieldnumero_cuotasTablaAmortiDetalle;
	public JButton jButtonnumero_cuotasTablaAmortiDetalleBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTablaAmortiDetalle;
	public JLabel jLabelid_empresaTablaAmortiDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTablaAmortiDetalle;
	public JButton jButtonid_empresaTablaAmortiDetalle= new JButtonMe();
	public JButton jButtonid_empresaTablaAmortiDetalleUpdate= new JButtonMe();
	public JButton jButtonid_empresaTablaAmortiDetalleBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalTablaAmortiDetalle;
	public JLabel jLabelid_sucursalTablaAmortiDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalTablaAmortiDetalle;
	public JButton jButtonid_sucursalTablaAmortiDetalle= new JButtonMe();
	public JButton jButtonid_sucursalTablaAmortiDetalleUpdate= new JButtonMe();
	public JButton jButtonid_sucursalTablaAmortiDetalleBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioTablaAmortiDetalle;
	public JLabel jLabelid_ejercicioTablaAmortiDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioTablaAmortiDetalle;
	public JButton jButtonid_ejercicioTablaAmortiDetalle= new JButtonMe();
	public JButton jButtonid_ejercicioTablaAmortiDetalleUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioTablaAmortiDetalleBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoTablaAmortiDetalle;
	public JLabel jLabelid_periodoTablaAmortiDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoTablaAmortiDetalle;
	public JButton jButtonid_periodoTablaAmortiDetalle= new JButtonMe();
	public JButton jButtonid_periodoTablaAmortiDetalleUpdate= new JButtonMe();
	public JButton jButtonid_periodoTablaAmortiDetalleBusqueda= new JButtonMe();

	public JPanel jPanelid_tasaTablaAmortiDetalle;
	public JLabel jLabelid_tasaTablaAmortiDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tasaTablaAmortiDetalle;
	public JButton jButtonid_tasaTablaAmortiDetalle= new JButtonMe();
	public JButton jButtonid_tasaTablaAmortiDetalleUpdate= new JButtonMe();
	public JButton jButtonid_tasaTablaAmortiDetalleBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaTablaAmortiDetalle;
	public JLabel jLabelid_facturaTablaAmortiDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaTablaAmortiDetalle;
	public JButton jButtonid_facturaTablaAmortiDetalle= new JButtonMe();
	public JButton jButtonid_facturaTablaAmortiDetalleUpdate= new JButtonMe();
	public JButton jButtonid_facturaTablaAmortiDetalleBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_intervaloTablaAmortiDetalle;
	public JLabel jLabelid_tipo_intervaloTablaAmortiDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_intervaloTablaAmortiDetalle;
	public JButton jButtonid_tipo_intervaloTablaAmortiDetalle= new JButtonMe();
	public JButton jButtonid_tipo_intervaloTablaAmortiDetalleUpdate= new JButtonMe();
	public JButton jButtonid_tipo_intervaloTablaAmortiDetalleBusqueda= new JButtonMe();

	public JPanel jPanelid_anioTablaAmortiDetalle;
	public JLabel jLabelid_anioTablaAmortiDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioTablaAmortiDetalle;
	public JButton jButtonid_anioTablaAmortiDetalle= new JButtonMe();
	public JButton jButtonid_anioTablaAmortiDetalleUpdate= new JButtonMe();
	public JButton jButtonid_anioTablaAmortiDetalleBusqueda= new JButtonMe();

	public JPanel jPanelid_mesTablaAmortiDetalle;
	public JLabel jLabelid_mesTablaAmortiDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesTablaAmortiDetalle;
	public JButton jButtonid_mesTablaAmortiDetalle= new JButtonMe();
	public JButton jButtonid_mesTablaAmortiDetalleUpdate= new JButtonMe();
	public JButton jButtonid_mesTablaAmortiDetalleBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTablaAmortiDetalle;
	
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
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TablaAmortiDetalleDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTablaAmortiDetalle=new JPanel();
				this.jPanelAccionesFormularioTablaAmortiDetalle=new JPanel();
				this.jmenuBarDetalleTablaAmortiDetalle=new JMenuBar();
				this.jTtoolBarDetalleTablaAmortiDetalle=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TablaAmortiDetalleDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TablaAmortiDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TablaAmortiDetalleDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TablaAmortiDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TablaAmortiDetalleDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TablaAmortiDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TablaAmortiDetalleDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TablaAmortiDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TablaAmortiDetalleDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TablaAmortiDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTablaAmortiDetalle() {
		return this.jButtonActualizarToolBarTablaAmortiDetalle;
	}
	
	public JButton getjButtonEliminarToolBarTablaAmortiDetalle() {
		return this.jButtonEliminarToolBarTablaAmortiDetalle;
	}
	
	public JButton getjButtonCancelarToolBarTablaAmortiDetalle() {
		return this.jButtonCancelarToolBarTablaAmortiDetalle;
	}		
	
	public JButton getjButtonProcesarInformacionTablaAmortiDetalle() {
		return this.jButtonProcesarInformacionTablaAmortiDetalle;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTablaAmortiDetalle)	{
		this.jButtonProcesarInformacionTablaAmortiDetalle = jButtonProcesarInformacionTablaAmortiDetalle;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTablaAmortiDetalle() {
		return this.jComboBoxTiposAccionesTablaAmortiDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTablaAmortiDetalle(
			JComboBox jComboBoxTiposRelacionesTablaAmortiDetalle) {
		this.jComboBoxTiposRelacionesTablaAmortiDetalle = jComboBoxTiposRelacionesTablaAmortiDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTablaAmortiDetalle(
			JComboBox jComboBoxTiposAccionesTablaAmortiDetalle) {
		this.jComboBoxTiposAccionesTablaAmortiDetalle = jComboBoxTiposAccionesTablaAmortiDetalle;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTablaAmortiDetalle() {
		return this.jComboBoxTiposAccionesFormularioTablaAmortiDetalle;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTablaAmortiDetalle(
			JComboBox jComboBoxTiposAccionesFormularioTablaAmortiDetalle) {
		this.jComboBoxTiposAccionesFormularioTablaAmortiDetalle = jComboBoxTiposAccionesFormularioTablaAmortiDetalle;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tablaamortidetalleSessionBean=new TablaAmortiDetalleSessionBean();
		
		this.tablaamortidetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tablaamortidetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tablaamortidetalleSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TablaAmortiDetalleJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TablaAmortiDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TablaAmortiDetalleJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tabla Amortizacion Detalle MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
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
	
		TablaAmortiDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTablaAmortiDetalle= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTablaAmortiDetalle=new JButtonMe();
				this.jButtonModificarToolBarTablaAmortiDetalle=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTablaAmortiDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTablaAmortiDetalle,this.jTtoolBarDetalleTablaAmortiDetalle,
							"actualizar","actualizar","Actualizar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTablaAmortiDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTablaAmortiDetalle,this.jTtoolBarDetalleTablaAmortiDetalle,
							"eliminar","eliminar","Eliminar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTablaAmortiDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTablaAmortiDetalle,this.jTtoolBarDetalleTablaAmortiDetalle,
							"cancelar","cancelar","Cancelar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTablaAmortiDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTablaAmortiDetalle,this.jTtoolBarDetalleTablaAmortiDetalle,
							"guardarcambios","guardarcambios","Guardar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTablaAmortiDetalle=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTablaAmortiDetalle=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTablaAmortiDetalle=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTablaAmortiDetalle=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTablaAmortiDetalle=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTablaAmortiDetalle= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTablaAmortiDetalle.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTablaAmortiDetalle,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTablaAmortiDetalle= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTablaAmortiDetalle.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTablaAmortiDetalle,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTablaAmortiDetalle= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTablaAmortiDetalle.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTablaAmortiDetalle,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTablaAmortiDetalle= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTablaAmortiDetalle.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTablaAmortiDetalle,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTablaAmortiDetalle= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTablaAmortiDetalle.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTablaAmortiDetalle,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAmortiDetalle= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAmortiDetalle.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAmortiDetalle,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTablaAmortiDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTablaAmortiDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTablaAmortiDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTablaAmortiDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTablaAmortiDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTablaAmortiDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTablaAmortiDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTablaAmortiDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTablaAmortiDetalle,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTablaAmortiDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTablaAmortiDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTablaAmortiDetalle,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTablaAmortiDetalle.add(this.jMenuItemDetalleCerrarTablaAmortiDetalle);
		
		this.jmenuDetalleAccionesTablaAmortiDetalle.add(this.jMenuItemActualizarTablaAmortiDetalle);
		this.jmenuDetalleAccionesTablaAmortiDetalle.add(this.jMenuItemEliminarTablaAmortiDetalle);
		this.jmenuDetalleAccionesTablaAmortiDetalle.add(this.jMenuItemCancelarTablaAmortiDetalle);		
		
		//this.jmenuDetalleDatosTablaAmortiDetalle.add(this.jMenuItemDetalleAbrirOrderByTablaAmortiDetalle);				
		this.jmenuDetalleDatosTablaAmortiDetalle.add(this.jMenuItemDetalleMostarOcultarTablaAmortiDetalle);				
				
		//this.jmenuDetalleAccionesTablaAmortiDetalle.add(this.jMenuItemGuardarCambiosTablaAmortiDetalle);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTablaAmortiDetalle.add(this.jmenuDetalleArchivoTablaAmortiDetalle);		
		this.jmenuBarDetalleTablaAmortiDetalle.add(this.jmenuDetalleAccionesTablaAmortiDetalle);		
		this.jmenuBarDetalleTablaAmortiDetalle.add(this.jmenuDetalleDatosTablaAmortiDetalle);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTablaAmortiDetalle);				
	}
	
	
	public void inicializarElementosCamposTablaAmortiDetalle() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTablaAmortiDetalle = new JLabelMe();
		jLabelIdTablaAmortiDetalle.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTablaAmortiDetalle = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTablaAmortiDetalle.setToolTipText(TablaAmortiDetalleConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTablaAmortiDetalle= new GridBagLayout();

		this.jPanelidTablaAmortiDetalle.setLayout(this.gridaBagLayoutTablaAmortiDetalle);

		jLabelidTablaAmortiDetalle = new JLabel();
		jLabelidTablaAmortiDetalle.setText("Id");

		jLabelidTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emisionTablaAmortiDetalle = new JLabelMe();
		this.jLabelfecha_emisionTablaAmortiDetalle.setText(""+TablaAmortiDetalleConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionTablaAmortiDetalle.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionTablaAmortiDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionTablaAmortiDetalle.setToolTipText(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutTablaAmortiDetalle = new GridBagLayout();
		this.jPanelfecha_emisionTablaAmortiDetalle.setLayout(this.gridaBagLayoutTablaAmortiDetalle);


		//jFormattedTextFieldfecha_emisionTablaAmortiDetalle= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionTablaAmortiDetalle= new JDateChooser();
		jDateChooserfecha_emisionTablaAmortiDetalle.setEnabled(false);
		jDateChooserfecha_emisionTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionTablaAmortiDetalle.setDate(new Date());
		jDateChooserfecha_emisionTablaAmortiDetalle.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionTablaAmortiDetalle.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionTablaAmortiDetalleBusqueda= new JButtonMe();
		this.jButtonfecha_emisionTablaAmortiDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionTablaAmortiDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionTablaAmortiDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionTablaAmortiDetalleBusqueda.setText("U");
		this.jButtonfecha_emisionTablaAmortiDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionTablaAmortiDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionTablaAmortiDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionTablaAmortiDetalleBusqueda"));

		if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionTablaAmortiDetalleBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoTablaAmortiDetalle = new JLabelMe();
		this.jLabelfecha_vencimientoTablaAmortiDetalle.setText(""+TablaAmortiDetalleConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoTablaAmortiDetalle.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoTablaAmortiDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoTablaAmortiDetalle.setToolTipText(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutTablaAmortiDetalle = new GridBagLayout();
		this.jPanelfecha_vencimientoTablaAmortiDetalle.setLayout(this.gridaBagLayoutTablaAmortiDetalle);


		//jFormattedTextFieldfecha_vencimientoTablaAmortiDetalle= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoTablaAmortiDetalle= new JDateChooser();
		jDateChooserfecha_vencimientoTablaAmortiDetalle.setEnabled(false);
		jDateChooserfecha_vencimientoTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoTablaAmortiDetalle.setDate(new Date());
		jDateChooserfecha_vencimientoTablaAmortiDetalle.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoTablaAmortiDetalle.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoTablaAmortiDetalleBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoTablaAmortiDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoTablaAmortiDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoTablaAmortiDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoTablaAmortiDetalleBusqueda.setText("U");
		this.jButtonfecha_vencimientoTablaAmortiDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoTablaAmortiDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoTablaAmortiDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoTablaAmortiDetalleBusqueda"));

		if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoTablaAmortiDetalleBusqueda.setVisible(false);		}


					
		this.jLabelfecha_inicialTablaAmortiDetalle = new JLabelMe();
		this.jLabelfecha_inicialTablaAmortiDetalle.setText(""+TablaAmortiDetalleConstantesFunciones.LABEL_FECHAINICIAL+" : *");
		this.jLabelfecha_inicialTablaAmortiDetalle.setToolTipText("Fecha Inicial");
		this.jLabelfecha_inicialTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicialTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicialTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicialTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicialTablaAmortiDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicialTablaAmortiDetalle.setToolTipText(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAINICIAL);
		this.gridaBagLayoutTablaAmortiDetalle = new GridBagLayout();
		this.jPanelfecha_inicialTablaAmortiDetalle.setLayout(this.gridaBagLayoutTablaAmortiDetalle);


		//jFormattedTextFieldfecha_inicialTablaAmortiDetalle= new JFormattedTextFieldMe();

		jDateChooserfecha_inicialTablaAmortiDetalle= new JDateChooser();
		jDateChooserfecha_inicialTablaAmortiDetalle.setEnabled(false);
		jDateChooserfecha_inicialTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicialTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicialTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicialTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicialTablaAmortiDetalle.setDate(new Date());
		jDateChooserfecha_inicialTablaAmortiDetalle.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicialTablaAmortiDetalle.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicialTablaAmortiDetalleBusqueda= new JButtonMe();
		this.jButtonfecha_inicialTablaAmortiDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicialTablaAmortiDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicialTablaAmortiDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicialTablaAmortiDetalleBusqueda.setText("U");
		this.jButtonfecha_inicialTablaAmortiDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicialTablaAmortiDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicialTablaAmortiDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicialTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicialTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicialTablaAmortiDetalleBusqueda"));

		if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicialTablaAmortiDetalleBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finalTablaAmortiDetalle = new JLabelMe();
		this.jLabelfecha_finalTablaAmortiDetalle.setText(""+TablaAmortiDetalleConstantesFunciones.LABEL_FECHAFINAL+" : *");
		this.jLabelfecha_finalTablaAmortiDetalle.setToolTipText("Fecha Final");
		this.jLabelfecha_finalTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finalTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finalTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finalTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finalTablaAmortiDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finalTablaAmortiDetalle.setToolTipText(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAFINAL);
		this.gridaBagLayoutTablaAmortiDetalle = new GridBagLayout();
		this.jPanelfecha_finalTablaAmortiDetalle.setLayout(this.gridaBagLayoutTablaAmortiDetalle);


		//jFormattedTextFieldfecha_finalTablaAmortiDetalle= new JFormattedTextFieldMe();

		jDateChooserfecha_finalTablaAmortiDetalle= new JDateChooser();
		jDateChooserfecha_finalTablaAmortiDetalle.setEnabled(false);
		jDateChooserfecha_finalTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finalTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finalTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finalTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finalTablaAmortiDetalle.setDate(new Date());
		jDateChooserfecha_finalTablaAmortiDetalle.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finalTablaAmortiDetalle.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finalTablaAmortiDetalleBusqueda= new JButtonMe();
		this.jButtonfecha_finalTablaAmortiDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finalTablaAmortiDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finalTablaAmortiDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finalTablaAmortiDetalleBusqueda.setText("U");
		this.jButtonfecha_finalTablaAmortiDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finalTablaAmortiDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finalTablaAmortiDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finalTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finalTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finalTablaAmortiDetalleBusqueda"));

		if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finalTablaAmortiDetalleBusqueda.setVisible(false);		}


					
		this.jLabelvalorTablaAmortiDetalle = new JLabelMe();
		this.jLabelvalorTablaAmortiDetalle.setText(""+TablaAmortiDetalleConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorTablaAmortiDetalle.setToolTipText("Valor");
		this.jLabelvalorTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorTablaAmortiDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorTablaAmortiDetalle.setToolTipText(TablaAmortiDetalleConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutTablaAmortiDetalle = new GridBagLayout();
		this.jPanelvalorTablaAmortiDetalle.setLayout(this.gridaBagLayoutTablaAmortiDetalle);


		jTextFieldvalorTablaAmortiDetalle= new JTextFieldMe();
		jTextFieldvalorTablaAmortiDetalle.setEnabled(false);
		jTextFieldvalorTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorTablaAmortiDetalle.setText("0.0");

		this.jButtonvalorTablaAmortiDetalleBusqueda= new JButtonMe();
		this.jButtonvalorTablaAmortiDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorTablaAmortiDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorTablaAmortiDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorTablaAmortiDetalleBusqueda.setText("U");
		this.jButtonvalorTablaAmortiDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorTablaAmortiDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorTablaAmortiDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorTablaAmortiDetalleBusqueda"));

		if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorTablaAmortiDetalleBusqueda.setVisible(false);		}


					
		this.jLabelinteresTablaAmortiDetalle = new JLabelMe();
		this.jLabelinteresTablaAmortiDetalle.setText(""+TablaAmortiDetalleConstantesFunciones.LABEL_INTERES+" : *");
		this.jLabelinteresTablaAmortiDetalle.setToolTipText("Interes");
		this.jLabelinteresTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelinteresTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelinteresTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelinteresTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelinteresTablaAmortiDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelinteresTablaAmortiDetalle.setToolTipText(TablaAmortiDetalleConstantesFunciones.LABEL_INTERES);
		this.gridaBagLayoutTablaAmortiDetalle = new GridBagLayout();
		this.jPanelinteresTablaAmortiDetalle.setLayout(this.gridaBagLayoutTablaAmortiDetalle);


		jTextFieldinteresTablaAmortiDetalle= new JTextFieldMe();
		jTextFieldinteresTablaAmortiDetalle.setEnabled(false);
		jTextFieldinteresTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldinteresTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldinteresTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldinteresTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldinteresTablaAmortiDetalle.setText("0.0");

		this.jButtoninteresTablaAmortiDetalleBusqueda= new JButtonMe();
		this.jButtoninteresTablaAmortiDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoninteresTablaAmortiDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoninteresTablaAmortiDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoninteresTablaAmortiDetalleBusqueda.setText("U");
		this.jButtoninteresTablaAmortiDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoninteresTablaAmortiDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoninteresTablaAmortiDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldinteresTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldinteresTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"interesTablaAmortiDetalleBusqueda"));

		if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoninteresTablaAmortiDetalleBusqueda.setVisible(false);		}


					
		this.jLabelcapitalTablaAmortiDetalle = new JLabelMe();
		this.jLabelcapitalTablaAmortiDetalle.setText(""+TablaAmortiDetalleConstantesFunciones.LABEL_CAPITAL+" : *");
		this.jLabelcapitalTablaAmortiDetalle.setToolTipText("Capital");
		this.jLabelcapitalTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcapitalTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcapitalTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcapitalTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcapitalTablaAmortiDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcapitalTablaAmortiDetalle.setToolTipText(TablaAmortiDetalleConstantesFunciones.LABEL_CAPITAL);
		this.gridaBagLayoutTablaAmortiDetalle = new GridBagLayout();
		this.jPanelcapitalTablaAmortiDetalle.setLayout(this.gridaBagLayoutTablaAmortiDetalle);


		jTextFieldcapitalTablaAmortiDetalle= new JTextFieldMe();
		jTextFieldcapitalTablaAmortiDetalle.setEnabled(false);
		jTextFieldcapitalTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcapitalTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcapitalTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcapitalTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcapitalTablaAmortiDetalle.setText("0.0");

		this.jButtoncapitalTablaAmortiDetalleBusqueda= new JButtonMe();
		this.jButtoncapitalTablaAmortiDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncapitalTablaAmortiDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncapitalTablaAmortiDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncapitalTablaAmortiDetalleBusqueda.setText("U");
		this.jButtoncapitalTablaAmortiDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncapitalTablaAmortiDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncapitalTablaAmortiDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcapitalTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcapitalTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"capitalTablaAmortiDetalleBusqueda"));

		if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncapitalTablaAmortiDetalleBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cuotasTablaAmortiDetalle = new JLabelMe();
		this.jLabelnumero_cuotasTablaAmortiDetalle.setText(""+TablaAmortiDetalleConstantesFunciones.LABEL_NUMEROCUOTA+" : *");
		this.jLabelnumero_cuotasTablaAmortiDetalle.setToolTipText("Numero Cuotas");
		this.jLabelnumero_cuotasTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuotasTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuotasTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuotasTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cuotasTablaAmortiDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cuotasTablaAmortiDetalle.setToolTipText(TablaAmortiDetalleConstantesFunciones.LABEL_NUMEROCUOTA);
		this.gridaBagLayoutTablaAmortiDetalle = new GridBagLayout();
		this.jPanelnumero_cuotasTablaAmortiDetalle.setLayout(this.gridaBagLayoutTablaAmortiDetalle);


		jTextFieldnumero_cuotasTablaAmortiDetalle= new JTextFieldMe();
		jTextFieldnumero_cuotasTablaAmortiDetalle.setEnabled(false);
		jTextFieldnumero_cuotasTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuotasTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuotasTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuotasTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_cuotasTablaAmortiDetalle.setText("0");

		this.jButtonnumero_cuotasTablaAmortiDetalleBusqueda= new JButtonMe();
		this.jButtonnumero_cuotasTablaAmortiDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuotasTablaAmortiDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuotasTablaAmortiDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cuotasTablaAmortiDetalleBusqueda.setText("U");
		this.jButtonnumero_cuotasTablaAmortiDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cuotasTablaAmortiDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cuotasTablaAmortiDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cuotasTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cuotasTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cuotasTablaAmortiDetalleBusqueda"));

		if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cuotasTablaAmortiDetalleBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTablaAmortiDetalle() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTablaAmortiDetalle = new JLabelMe();
		this.jLabelid_empresaTablaAmortiDetalle.setText(""+TablaAmortiDetalleConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTablaAmortiDetalle.setToolTipText("Empresa");
		this.jLabelid_empresaTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTablaAmortiDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTablaAmortiDetalle.setToolTipText(TablaAmortiDetalleConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTablaAmortiDetalle = new GridBagLayout();
		this.jPanelid_empresaTablaAmortiDetalle.setLayout(this.gridaBagLayoutTablaAmortiDetalle);


		jComboBoxid_empresaTablaAmortiDetalle= new JComboBoxMe();
		jComboBoxid_empresaTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTablaAmortiDetalle.setEnabled(false);

		this.jButtonid_empresaTablaAmortiDetalle= new JButtonMe();
		this.jButtonid_empresaTablaAmortiDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTablaAmortiDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTablaAmortiDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTablaAmortiDetalle.setText("Buscar");
		this.jButtonid_empresaTablaAmortiDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTablaAmortiDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTablaAmortiDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTablaAmortiDetalle"));

		this.jButtonid_empresaTablaAmortiDetalleBusqueda= new JButtonMe();
		this.jButtonid_empresaTablaAmortiDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTablaAmortiDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTablaAmortiDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTablaAmortiDetalleBusqueda.setText("U");
		this.jButtonid_empresaTablaAmortiDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTablaAmortiDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTablaAmortiDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTablaAmortiDetalleBusqueda"));

		if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTablaAmortiDetalleBusqueda.setVisible(false);		}

		this.jButtonid_empresaTablaAmortiDetalleUpdate= new JButtonMe();
		this.jButtonid_empresaTablaAmortiDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTablaAmortiDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTablaAmortiDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTablaAmortiDetalleUpdate.setText("U");
		this.jButtonid_empresaTablaAmortiDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTablaAmortiDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTablaAmortiDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTablaAmortiDetalleUpdate"));



					
		this.jLabelid_sucursalTablaAmortiDetalle = new JLabelMe();
		this.jLabelid_sucursalTablaAmortiDetalle.setText(""+TablaAmortiDetalleConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalTablaAmortiDetalle.setToolTipText("Sucursal");
		this.jLabelid_sucursalTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalTablaAmortiDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalTablaAmortiDetalle.setToolTipText(TablaAmortiDetalleConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutTablaAmortiDetalle = new GridBagLayout();
		this.jPanelid_sucursalTablaAmortiDetalle.setLayout(this.gridaBagLayoutTablaAmortiDetalle);


		jComboBoxid_sucursalTablaAmortiDetalle= new JComboBoxMe();
		jComboBoxid_sucursalTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalTablaAmortiDetalle.setEnabled(false);

		this.jButtonid_sucursalTablaAmortiDetalle= new JButtonMe();
		this.jButtonid_sucursalTablaAmortiDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTablaAmortiDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTablaAmortiDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTablaAmortiDetalle.setText("Buscar");
		this.jButtonid_sucursalTablaAmortiDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalTablaAmortiDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTablaAmortiDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTablaAmortiDetalle"));

		this.jButtonid_sucursalTablaAmortiDetalleBusqueda= new JButtonMe();
		this.jButtonid_sucursalTablaAmortiDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTablaAmortiDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTablaAmortiDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTablaAmortiDetalleBusqueda.setText("U");
		this.jButtonid_sucursalTablaAmortiDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalTablaAmortiDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTablaAmortiDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTablaAmortiDetalleBusqueda"));

		if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalTablaAmortiDetalleBusqueda.setVisible(false);		}

		this.jButtonid_sucursalTablaAmortiDetalleUpdate= new JButtonMe();
		this.jButtonid_sucursalTablaAmortiDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTablaAmortiDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTablaAmortiDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTablaAmortiDetalleUpdate.setText("U");
		this.jButtonid_sucursalTablaAmortiDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalTablaAmortiDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTablaAmortiDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTablaAmortiDetalleUpdate"));



					
		this.jLabelid_ejercicioTablaAmortiDetalle = new JLabelMe();
		this.jLabelid_ejercicioTablaAmortiDetalle.setText(""+TablaAmortiDetalleConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioTablaAmortiDetalle.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioTablaAmortiDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioTablaAmortiDetalle.setToolTipText(TablaAmortiDetalleConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutTablaAmortiDetalle = new GridBagLayout();
		this.jPanelid_ejercicioTablaAmortiDetalle.setLayout(this.gridaBagLayoutTablaAmortiDetalle);


		jComboBoxid_ejercicioTablaAmortiDetalle= new JComboBoxMe();
		jComboBoxid_ejercicioTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioTablaAmortiDetalle.setEnabled(false);

		this.jButtonid_ejercicioTablaAmortiDetalle= new JButtonMe();
		this.jButtonid_ejercicioTablaAmortiDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioTablaAmortiDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioTablaAmortiDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioTablaAmortiDetalle.setText("Buscar");
		this.jButtonid_ejercicioTablaAmortiDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioTablaAmortiDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioTablaAmortiDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioTablaAmortiDetalle"));

		this.jButtonid_ejercicioTablaAmortiDetalleBusqueda= new JButtonMe();
		this.jButtonid_ejercicioTablaAmortiDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioTablaAmortiDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioTablaAmortiDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioTablaAmortiDetalleBusqueda.setText("U");
		this.jButtonid_ejercicioTablaAmortiDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioTablaAmortiDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioTablaAmortiDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioTablaAmortiDetalleBusqueda"));

		if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioTablaAmortiDetalleBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioTablaAmortiDetalleUpdate= new JButtonMe();
		this.jButtonid_ejercicioTablaAmortiDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioTablaAmortiDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioTablaAmortiDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioTablaAmortiDetalleUpdate.setText("U");
		this.jButtonid_ejercicioTablaAmortiDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioTablaAmortiDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioTablaAmortiDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioTablaAmortiDetalleUpdate"));



					
		this.jLabelid_periodoTablaAmortiDetalle = new JLabelMe();
		this.jLabelid_periodoTablaAmortiDetalle.setText(""+TablaAmortiDetalleConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoTablaAmortiDetalle.setToolTipText("Periodo");
		this.jLabelid_periodoTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoTablaAmortiDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoTablaAmortiDetalle.setToolTipText(TablaAmortiDetalleConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutTablaAmortiDetalle = new GridBagLayout();
		this.jPanelid_periodoTablaAmortiDetalle.setLayout(this.gridaBagLayoutTablaAmortiDetalle);


		jComboBoxid_periodoTablaAmortiDetalle= new JComboBoxMe();
		jComboBoxid_periodoTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoTablaAmortiDetalle.setEnabled(false);

		this.jButtonid_periodoTablaAmortiDetalle= new JButtonMe();
		this.jButtonid_periodoTablaAmortiDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoTablaAmortiDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoTablaAmortiDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoTablaAmortiDetalle.setText("Buscar");
		this.jButtonid_periodoTablaAmortiDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoTablaAmortiDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoTablaAmortiDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoTablaAmortiDetalle"));

		this.jButtonid_periodoTablaAmortiDetalleBusqueda= new JButtonMe();
		this.jButtonid_periodoTablaAmortiDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoTablaAmortiDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoTablaAmortiDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoTablaAmortiDetalleBusqueda.setText("U");
		this.jButtonid_periodoTablaAmortiDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoTablaAmortiDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoTablaAmortiDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoTablaAmortiDetalleBusqueda"));

		if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoTablaAmortiDetalleBusqueda.setVisible(false);		}

		this.jButtonid_periodoTablaAmortiDetalleUpdate= new JButtonMe();
		this.jButtonid_periodoTablaAmortiDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoTablaAmortiDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoTablaAmortiDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoTablaAmortiDetalleUpdate.setText("U");
		this.jButtonid_periodoTablaAmortiDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoTablaAmortiDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoTablaAmortiDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoTablaAmortiDetalleUpdate"));



					
		this.jLabelid_tasaTablaAmortiDetalle = new JLabelMe();
		this.jLabelid_tasaTablaAmortiDetalle.setText(""+TablaAmortiDetalleConstantesFunciones.LABEL_IDTASA+" : *");
		this.jLabelid_tasaTablaAmortiDetalle.setToolTipText("Tasa");
		this.jLabelid_tasaTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tasaTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tasaTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tasaTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tasaTablaAmortiDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tasaTablaAmortiDetalle.setToolTipText(TablaAmortiDetalleConstantesFunciones.LABEL_IDTASA);
		this.gridaBagLayoutTablaAmortiDetalle = new GridBagLayout();
		this.jPanelid_tasaTablaAmortiDetalle.setLayout(this.gridaBagLayoutTablaAmortiDetalle);


		jComboBoxid_tasaTablaAmortiDetalle= new JComboBoxMe();
		jComboBoxid_tasaTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tasaTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tasaTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tasaTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tasaTablaAmortiDetalle= new JButtonMe();
		this.jButtonid_tasaTablaAmortiDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tasaTablaAmortiDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tasaTablaAmortiDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tasaTablaAmortiDetalle.setText("Buscar");
		this.jButtonid_tasaTablaAmortiDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tasaTablaAmortiDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tasaTablaAmortiDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tasaTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tasaTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tasaTablaAmortiDetalle"));

		this.jButtonid_tasaTablaAmortiDetalleBusqueda= new JButtonMe();
		this.jButtonid_tasaTablaAmortiDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tasaTablaAmortiDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tasaTablaAmortiDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tasaTablaAmortiDetalleBusqueda.setText("U");
		this.jButtonid_tasaTablaAmortiDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tasaTablaAmortiDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tasaTablaAmortiDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tasaTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tasaTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tasaTablaAmortiDetalleBusqueda"));

		if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tasaTablaAmortiDetalleBusqueda.setVisible(false);		}

		this.jButtonid_tasaTablaAmortiDetalleUpdate= new JButtonMe();
		this.jButtonid_tasaTablaAmortiDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tasaTablaAmortiDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tasaTablaAmortiDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tasaTablaAmortiDetalleUpdate.setText("U");
		this.jButtonid_tasaTablaAmortiDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tasaTablaAmortiDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tasaTablaAmortiDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tasaTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tasaTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tasaTablaAmortiDetalleUpdate"));



					
		this.jLabelid_facturaTablaAmortiDetalle = new JLabelMe();
		this.jLabelid_facturaTablaAmortiDetalle.setText(""+TablaAmortiDetalleConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaTablaAmortiDetalle.setToolTipText("Factura");
		this.jLabelid_facturaTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaTablaAmortiDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaTablaAmortiDetalle.setToolTipText(TablaAmortiDetalleConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutTablaAmortiDetalle = new GridBagLayout();
		this.jPanelid_facturaTablaAmortiDetalle.setLayout(this.gridaBagLayoutTablaAmortiDetalle);


		jComboBoxid_facturaTablaAmortiDetalle= new JComboBoxMe();
		jComboBoxid_facturaTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaTablaAmortiDetalle= new JButtonMe();
		this.jButtonid_facturaTablaAmortiDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaTablaAmortiDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaTablaAmortiDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaTablaAmortiDetalle.setText("Buscar");
		this.jButtonid_facturaTablaAmortiDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaTablaAmortiDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaTablaAmortiDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaTablaAmortiDetalle"));

		this.jButtonid_facturaTablaAmortiDetalleBusqueda= new JButtonMe();
		this.jButtonid_facturaTablaAmortiDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaTablaAmortiDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaTablaAmortiDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaTablaAmortiDetalleBusqueda.setText("U");
		this.jButtonid_facturaTablaAmortiDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaTablaAmortiDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaTablaAmortiDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaTablaAmortiDetalleBusqueda"));

		if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaTablaAmortiDetalleBusqueda.setVisible(false);		}

		this.jButtonid_facturaTablaAmortiDetalleUpdate= new JButtonMe();
		this.jButtonid_facturaTablaAmortiDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaTablaAmortiDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaTablaAmortiDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaTablaAmortiDetalleUpdate.setText("U");
		this.jButtonid_facturaTablaAmortiDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaTablaAmortiDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaTablaAmortiDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaTablaAmortiDetalleUpdate"));



					
		this.jLabelid_tipo_intervaloTablaAmortiDetalle = new JLabelMe();
		this.jLabelid_tipo_intervaloTablaAmortiDetalle.setText(""+TablaAmortiDetalleConstantesFunciones.LABEL_IDTIPOINTERVALO+" : *");
		this.jLabelid_tipo_intervaloTablaAmortiDetalle.setToolTipText("Tipo Intervalo");
		this.jLabelid_tipo_intervaloTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_intervaloTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_intervaloTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_intervaloTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_intervaloTablaAmortiDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_intervaloTablaAmortiDetalle.setToolTipText(TablaAmortiDetalleConstantesFunciones.LABEL_IDTIPOINTERVALO);
		this.gridaBagLayoutTablaAmortiDetalle = new GridBagLayout();
		this.jPanelid_tipo_intervaloTablaAmortiDetalle.setLayout(this.gridaBagLayoutTablaAmortiDetalle);


		jComboBoxid_tipo_intervaloTablaAmortiDetalle= new JComboBoxMe();
		jComboBoxid_tipo_intervaloTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_intervaloTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_intervaloTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_intervaloTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_intervaloTablaAmortiDetalle= new JButtonMe();
		this.jButtonid_tipo_intervaloTablaAmortiDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_intervaloTablaAmortiDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_intervaloTablaAmortiDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_intervaloTablaAmortiDetalle.setText("Buscar");
		this.jButtonid_tipo_intervaloTablaAmortiDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_intervaloTablaAmortiDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_intervaloTablaAmortiDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_intervaloTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_intervaloTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_intervaloTablaAmortiDetalle"));

		this.jButtonid_tipo_intervaloTablaAmortiDetalleBusqueda= new JButtonMe();
		this.jButtonid_tipo_intervaloTablaAmortiDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_intervaloTablaAmortiDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_intervaloTablaAmortiDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_intervaloTablaAmortiDetalleBusqueda.setText("U");
		this.jButtonid_tipo_intervaloTablaAmortiDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_intervaloTablaAmortiDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_intervaloTablaAmortiDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_intervaloTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_intervaloTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_intervaloTablaAmortiDetalleBusqueda"));

		if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_intervaloTablaAmortiDetalleBusqueda.setVisible(false);		}

		this.jButtonid_tipo_intervaloTablaAmortiDetalleUpdate= new JButtonMe();
		this.jButtonid_tipo_intervaloTablaAmortiDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_intervaloTablaAmortiDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_intervaloTablaAmortiDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_intervaloTablaAmortiDetalleUpdate.setText("U");
		this.jButtonid_tipo_intervaloTablaAmortiDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_intervaloTablaAmortiDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_intervaloTablaAmortiDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_intervaloTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_intervaloTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_intervaloTablaAmortiDetalleUpdate"));



					
		this.jLabelid_anioTablaAmortiDetalle = new JLabelMe();
		this.jLabelid_anioTablaAmortiDetalle.setText(""+TablaAmortiDetalleConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioTablaAmortiDetalle.setToolTipText("Anio");
		this.jLabelid_anioTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioTablaAmortiDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioTablaAmortiDetalle.setToolTipText(TablaAmortiDetalleConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutTablaAmortiDetalle = new GridBagLayout();
		this.jPanelid_anioTablaAmortiDetalle.setLayout(this.gridaBagLayoutTablaAmortiDetalle);


		jComboBoxid_anioTablaAmortiDetalle= new JComboBoxMe();
		jComboBoxid_anioTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioTablaAmortiDetalle.setEnabled(false);

		this.jButtonid_anioTablaAmortiDetalle= new JButtonMe();
		this.jButtonid_anioTablaAmortiDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioTablaAmortiDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioTablaAmortiDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioTablaAmortiDetalle.setText("Buscar");
		this.jButtonid_anioTablaAmortiDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioTablaAmortiDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioTablaAmortiDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioTablaAmortiDetalle"));

		this.jButtonid_anioTablaAmortiDetalleBusqueda= new JButtonMe();
		this.jButtonid_anioTablaAmortiDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioTablaAmortiDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioTablaAmortiDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioTablaAmortiDetalleBusqueda.setText("U");
		this.jButtonid_anioTablaAmortiDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioTablaAmortiDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioTablaAmortiDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioTablaAmortiDetalleBusqueda"));

		if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioTablaAmortiDetalleBusqueda.setVisible(false);		}

		this.jButtonid_anioTablaAmortiDetalleUpdate= new JButtonMe();
		this.jButtonid_anioTablaAmortiDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioTablaAmortiDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioTablaAmortiDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioTablaAmortiDetalleUpdate.setText("U");
		this.jButtonid_anioTablaAmortiDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioTablaAmortiDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioTablaAmortiDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioTablaAmortiDetalleUpdate"));



					
		this.jLabelid_mesTablaAmortiDetalle = new JLabelMe();
		this.jLabelid_mesTablaAmortiDetalle.setText(""+TablaAmortiDetalleConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesTablaAmortiDetalle.setToolTipText("Mes");
		this.jLabelid_mesTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesTablaAmortiDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesTablaAmortiDetalle.setToolTipText(TablaAmortiDetalleConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutTablaAmortiDetalle = new GridBagLayout();
		this.jPanelid_mesTablaAmortiDetalle.setLayout(this.gridaBagLayoutTablaAmortiDetalle);


		jComboBoxid_mesTablaAmortiDetalle= new JComboBoxMe();
		jComboBoxid_mesTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesTablaAmortiDetalle.setEnabled(false);

		this.jButtonid_mesTablaAmortiDetalle= new JButtonMe();
		this.jButtonid_mesTablaAmortiDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesTablaAmortiDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesTablaAmortiDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesTablaAmortiDetalle.setText("Buscar");
		this.jButtonid_mesTablaAmortiDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesTablaAmortiDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesTablaAmortiDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesTablaAmortiDetalle"));

		this.jButtonid_mesTablaAmortiDetalleBusqueda= new JButtonMe();
		this.jButtonid_mesTablaAmortiDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesTablaAmortiDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesTablaAmortiDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesTablaAmortiDetalleBusqueda.setText("U");
		this.jButtonid_mesTablaAmortiDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesTablaAmortiDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesTablaAmortiDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesTablaAmortiDetalleBusqueda"));

		if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesTablaAmortiDetalleBusqueda.setVisible(false);		}

		this.jButtonid_mesTablaAmortiDetalleUpdate= new JButtonMe();
		this.jButtonid_mesTablaAmortiDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesTablaAmortiDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesTablaAmortiDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesTablaAmortiDetalleUpdate.setText("U");
		this.jButtonid_mesTablaAmortiDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesTablaAmortiDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesTablaAmortiDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesTablaAmortiDetalleUpdate"));



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
		//this.jInternalFrameDetalleTablaAmortiDetalle = new TablaAmortiDetalleBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tabla Amortizacion Detalle DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTablaAmortiDetalle= new GridBagLayout();
		

		
		String sToolTipTablaAmortiDetalle="";
		sToolTipTablaAmortiDetalle=TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTablaAmortiDetalle+="(Facturacion.TablaAmortiDetalle)";
		}
		
		if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
			sToolTipTablaAmortiDetalle+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTablaAmortiDetalle = new JButtonMe();
		this.jButtonModificarTablaAmortiDetalle = new JButtonMe();
        this.jButtonActualizarTablaAmortiDetalle = new JButtonMe();
        this.jButtonEliminarTablaAmortiDetalle = new JButtonMe();
        this.jButtonCancelarTablaAmortiDetalle = new JButtonMe();
        this.jButtonGuardarCambiosTablaAmortiDetalle = new JButtonMe();
		this.jButtonGuardarCambiosTablaTablaAmortiDetalle = new JButtonMe();
		this.jButtonCerrarTablaAmortiDetalle = new JButtonMe();
		
		this.jScrollPanelDatosTablaAmortiDetalle = new JScrollPane();   
        this.jScrollPanelDatosEdicionTablaAmortiDetalle = new JScrollPane();
		this.jScrollPanelDatosGeneralTablaAmortiDetalle = new JScrollPane();
				
		
		
		this.jPanelCamposTablaAmortiDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTablaAmortiDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTablaAmortiDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTablaAmortiDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tabla Amortizacion Detalle";
		
		if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tabla Amortizacion Detalles" + this.sPath));
		} else {
			this.jScrollPanelDatosTablaAmortiDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTablaAmortiDetalle.setName("jPanelCamposTablaAmortiDetalle"); 

		this.jPanelCamposOcultosTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTablaAmortiDetalle.setName("jPanelCamposOcultosTablaAmortiDetalle"); 

        this.jPanelAccionesTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTablaAmortiDetalle.setToolTipText("Acciones");
        this.jPanelAccionesTablaAmortiDetalle.setName("Acciones"); 

		this.jPanelAccionesFormularioTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTablaAmortiDetalle.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTablaAmortiDetalle.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTablaAmortiDetalle.setText("Nuevo");
		this.jButtonModificarTablaAmortiDetalle.setText("Editar");
        this.jButtonActualizarTablaAmortiDetalle.setText("Actualizar");
        this.jButtonEliminarTablaAmortiDetalle.setText("Eliminar");
        this.jButtonCancelarTablaAmortiDetalle.setText("Cancelar");
        this.jButtonGuardarCambiosTablaAmortiDetalle.setText("Guardar");
		this.jButtonGuardarCambiosTablaTablaAmortiDetalle.setText("Guardar");
		this.jButtonCerrarTablaAmortiDetalle.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTablaAmortiDetalle,"nuevo_button","Nuevo",this.tablaamortidetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTablaAmortiDetalle,"modificar_button","Editar",this.tablaamortidetalleSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTablaAmortiDetalle,"actualizar_button","Actualizar",this.tablaamortidetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTablaAmortiDetalle,"eliminar_button","Eliminar",this.tablaamortidetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTablaAmortiDetalle,"cancelar_button","Cancelar",this.tablaamortidetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAmortiDetalle,"guardarcambios_button","Guardar",this.tablaamortidetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTablaAmortiDetalle,"guardarcambiostabla_button","Guardar",this.tablaamortidetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTablaAmortiDetalle,"cerrar_button","Salir",this.tablaamortidetalleSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTablaAmortiDetalle.setToolTipText("Nuevo"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTablaAmortiDetalle.setToolTipText("Editar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTablaAmortiDetalle.setToolTipText("Actualizar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTablaAmortiDetalle.setToolTipText("Eliminar)"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTablaAmortiDetalle.setToolTipText("Cancelar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTablaAmortiDetalle.setToolTipText("Guardar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTablaAmortiDetalle.setToolTipText("Guardar"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTablaAmortiDetalle.setToolTipText("Salir"+" "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTablaAmortiDetalle";
		inputMap = this.jButtonNuevoTablaAmortiDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTablaAmortiDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTablaAmortiDetalle"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTablaAmortiDetalle";
		inputMap = this.jButtonActualizarTablaAmortiDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTablaAmortiDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTablaAmortiDetalle"));
		
		//ELIMINAR
		sMapKey = "EliminarTablaAmortiDetalle";
		inputMap = this.jButtonEliminarTablaAmortiDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTablaAmortiDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTablaAmortiDetalle"));
		
		//CANCELAR	
		sMapKey = "CancelarTablaAmortiDetalle";
		inputMap = this.jButtonCancelarTablaAmortiDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTablaAmortiDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTablaAmortiDetalle"));
		
		//CERRAR		
		sMapKey = "CerrarTablaAmortiDetalle";
		inputMap = this.jButtonCerrarTablaAmortiDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTablaAmortiDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTablaAmortiDetalle"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTablaAmortiDetalle";
		inputMap = this.jButtonGuardarCambiosTablaTablaAmortiDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTablaAmortiDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTablaAmortiDetalle"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTablaAmortiDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTablaAmortiDetalle.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTablaAmortiDetalle.setToolTipText("Nuevo TablaAmortiDetalle");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTablaAmortiDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTablaAmortiDetalle.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTablaAmortiDetalle.setToolTipText("Sin Cerrar Ventana TablaAmortiDetalle");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTablaAmortiDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTablaAmortiDetalle.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTablaAmortiDetalle.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTablaAmortiDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTablaAmortiDetalle.setText("Accion");
		this.jComboBoxTiposAccionesTablaAmortiDetalle.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTablaAmortiDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTablaAmortiDetalle.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTablaAmortiDetalle.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTablaAmortiDetalle = new JLabelMe();
		
		this.jLabelAccionesTablaAmortiDetalle.setText("Acciones");		
		this.jLabelAccionesTablaAmortiDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTablaAmortiDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTablaAmortiDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTablaAmortiDetalle();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTablaAmortiDetalle();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTablaAmortiDetalle=new JTabbedPane();
		this.jTabbedPaneRelacionesTablaAmortiDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTablaAmortiDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTablaAmortiDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTablaAmortiDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTablaAmortiDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTablaAmortiDetalle.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTablaAmortiDetalle.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTablaAmortiDetalle.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTablaAmortiDetalle, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTablaAmortiDetalle = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTablaAmortiDetalle = new GridBagLayout();
		
		this.jPanelCamposTablaAmortiDetalle.setLayout(gridaBagLayoutCamposTablaAmortiDetalle);
		this.jPanelCamposOcultosTablaAmortiDetalle.setLayout(gridaBagLayoutCamposOcultosTablaAmortiDetalle);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTablaAmortiDetalle.add(jLabelIdTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 1;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTablaAmortiDetalle.add(jLabelidTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);


	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTablaAmortiDetalle.add(jLabelid_empresaTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 2;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTablaAmortiDetalle.add(jButtonid_empresaTablaAmortiDetalleBusqueda, this.gridBagConstraintsTablaAmortiDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 3;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTablaAmortiDetalle.add(jButtonid_empresaTablaAmortiDetalleUpdate, this.gridBagConstraintsTablaAmortiDetalle);
	}

	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 1;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTablaAmortiDetalle.add(jComboBoxid_empresaTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);


	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalTablaAmortiDetalle.add(jLabelid_sucursalTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 2;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTablaAmortiDetalle.add(jButtonid_sucursalTablaAmortiDetalleBusqueda, this.gridBagConstraintsTablaAmortiDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 3;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTablaAmortiDetalle.add(jButtonid_sucursalTablaAmortiDetalleUpdate, this.gridBagConstraintsTablaAmortiDetalle);
	}

	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 1;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalTablaAmortiDetalle.add(jComboBoxid_sucursalTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);


	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioTablaAmortiDetalle.add(jLabelid_ejercicioTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 2;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioTablaAmortiDetalle.add(jButtonid_ejercicioTablaAmortiDetalleBusqueda, this.gridBagConstraintsTablaAmortiDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 3;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioTablaAmortiDetalle.add(jButtonid_ejercicioTablaAmortiDetalleUpdate, this.gridBagConstraintsTablaAmortiDetalle);
	}

	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 1;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioTablaAmortiDetalle.add(jComboBoxid_ejercicioTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);


	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoTablaAmortiDetalle.add(jLabelid_periodoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 2;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoTablaAmortiDetalle.add(jButtonid_periodoTablaAmortiDetalleBusqueda, this.gridBagConstraintsTablaAmortiDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 3;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoTablaAmortiDetalle.add(jButtonid_periodoTablaAmortiDetalleUpdate, this.gridBagConstraintsTablaAmortiDetalle);
	}

	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 1;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoTablaAmortiDetalle.add(jComboBoxid_periodoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);


	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tasaTablaAmortiDetalle.add(jLabelid_tasaTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 2;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tasaTablaAmortiDetalle.add(jButtonid_tasaTablaAmortiDetalleBusqueda, this.gridBagConstraintsTablaAmortiDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 3;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tasaTablaAmortiDetalle.add(jButtonid_tasaTablaAmortiDetalleUpdate, this.gridBagConstraintsTablaAmortiDetalle);
	}

	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 1;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tasaTablaAmortiDetalle.add(jComboBoxid_tasaTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);


	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_facturaTablaAmortiDetalle.add(jLabelid_facturaTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 2;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaTablaAmortiDetalle.add(jButtonid_facturaTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 3;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaTablaAmortiDetalle.add(jButtonid_facturaTablaAmortiDetalleBusqueda, this.gridBagConstraintsTablaAmortiDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 4;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaTablaAmortiDetalle.add(jButtonid_facturaTablaAmortiDetalleUpdate, this.gridBagConstraintsTablaAmortiDetalle);
	}

	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 1;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_facturaTablaAmortiDetalle.add(jComboBoxid_facturaTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);


	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_intervaloTablaAmortiDetalle.add(jLabelid_tipo_intervaloTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 2;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_intervaloTablaAmortiDetalle.add(jButtonid_tipo_intervaloTablaAmortiDetalleBusqueda, this.gridBagConstraintsTablaAmortiDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 3;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_intervaloTablaAmortiDetalle.add(jButtonid_tipo_intervaloTablaAmortiDetalleUpdate, this.gridBagConstraintsTablaAmortiDetalle);
	}

	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 1;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_intervaloTablaAmortiDetalle.add(jComboBoxid_tipo_intervaloTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);


	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionTablaAmortiDetalle.add(jLabelfecha_emisionTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 2;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionTablaAmortiDetalle.add(jButtonfecha_emisionTablaAmortiDetalleBusqueda, this.gridBagConstraintsTablaAmortiDetalle);
	}

	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 1;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionTablaAmortiDetalle.add(jDateChooserfecha_emisionTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);


	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoTablaAmortiDetalle.add(jLabelfecha_vencimientoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 2;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoTablaAmortiDetalle.add(jButtonfecha_vencimientoTablaAmortiDetalleBusqueda, this.gridBagConstraintsTablaAmortiDetalle);
	}

	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 1;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoTablaAmortiDetalle.add(jDateChooserfecha_vencimientoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);


	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicialTablaAmortiDetalle.add(jLabelfecha_inicialTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 2;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicialTablaAmortiDetalle.add(jButtonfecha_inicialTablaAmortiDetalleBusqueda, this.gridBagConstraintsTablaAmortiDetalle);
	}

	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 1;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicialTablaAmortiDetalle.add(jDateChooserfecha_inicialTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);


	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finalTablaAmortiDetalle.add(jLabelfecha_finalTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 2;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finalTablaAmortiDetalle.add(jButtonfecha_finalTablaAmortiDetalleBusqueda, this.gridBagConstraintsTablaAmortiDetalle);
	}

	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 1;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finalTablaAmortiDetalle.add(jDateChooserfecha_finalTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);


	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorTablaAmortiDetalle.add(jLabelvalorTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 2;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorTablaAmortiDetalle.add(jButtonvalorTablaAmortiDetalleBusqueda, this.gridBagConstraintsTablaAmortiDetalle);
	}

	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 1;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorTablaAmortiDetalle.add(jTextFieldvalorTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);


	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelinteresTablaAmortiDetalle.add(jLabelinteresTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 2;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelinteresTablaAmortiDetalle.add(jButtoninteresTablaAmortiDetalleBusqueda, this.gridBagConstraintsTablaAmortiDetalle);
	}

	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 1;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelinteresTablaAmortiDetalle.add(jTextFieldinteresTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);


	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcapitalTablaAmortiDetalle.add(jLabelcapitalTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 2;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelcapitalTablaAmortiDetalle.add(jButtoncapitalTablaAmortiDetalleBusqueda, this.gridBagConstraintsTablaAmortiDetalle);
	}

	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 1;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcapitalTablaAmortiDetalle.add(jTextFieldcapitalTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);


	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cuotasTablaAmortiDetalle.add(jLabelnumero_cuotasTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 2;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cuotasTablaAmortiDetalle.add(jButtonnumero_cuotasTablaAmortiDetalleBusqueda, this.gridBagConstraintsTablaAmortiDetalle);
	}

	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 1;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cuotasTablaAmortiDetalle.add(jTextFieldnumero_cuotasTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);


	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioTablaAmortiDetalle.add(jLabelid_anioTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 2;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioTablaAmortiDetalle.add(jButtonid_anioTablaAmortiDetalleBusqueda, this.gridBagConstraintsTablaAmortiDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 3;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioTablaAmortiDetalle.add(jButtonid_anioTablaAmortiDetalleUpdate, this.gridBagConstraintsTablaAmortiDetalle);
	}

	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 1;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioTablaAmortiDetalle.add(jComboBoxid_anioTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);


	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesTablaAmortiDetalle.add(jLabelid_mesTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 2;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesTablaAmortiDetalle.add(jButtonid_mesTablaAmortiDetalleBusqueda, this.gridBagConstraintsTablaAmortiDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		//this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 3;
		this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
		this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesTablaAmortiDetalle.add(jButtonid_mesTablaAmortiDetalleUpdate, this.gridBagConstraintsTablaAmortiDetalle);
	}

	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = 1;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesTablaAmortiDetalle.add(jComboBoxid_mesTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = iYPanelCamposTablaAmortiDetalle;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = iXPanelCamposTablaAmortiDetalle++;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaAmortiDetalle.add(this.jPanelidTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(iXPanelCamposTablaAmortiDetalle % 2==0) {
		iXPanelCamposTablaAmortiDetalle=0;
		iYPanelCamposTablaAmortiDetalle++;
	}
	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = iYPanelCamposTablaAmortiDetalle;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = iXPanelCamposTablaAmortiDetalle++;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaAmortiDetalle.add(this.jPanelid_tasaTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(iXPanelCamposTablaAmortiDetalle % 2==0) {
		iXPanelCamposTablaAmortiDetalle=0;
		iYPanelCamposTablaAmortiDetalle++;
	}
	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = iYPanelCamposTablaAmortiDetalle;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = iXPanelCamposTablaAmortiDetalle++;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaAmortiDetalle.add(this.jPanelid_facturaTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(iXPanelCamposTablaAmortiDetalle % 2==0) {
		iXPanelCamposTablaAmortiDetalle=0;
		iYPanelCamposTablaAmortiDetalle++;
	}
	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = iYPanelCamposTablaAmortiDetalle;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = iXPanelCamposTablaAmortiDetalle++;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaAmortiDetalle.add(this.jPanelid_tipo_intervaloTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(iXPanelCamposTablaAmortiDetalle % 2==0) {
		iXPanelCamposTablaAmortiDetalle=0;
		iYPanelCamposTablaAmortiDetalle++;
	}
	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = iYPanelCamposTablaAmortiDetalle;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = iXPanelCamposTablaAmortiDetalle++;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaAmortiDetalle.add(this.jPanelfecha_emisionTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(iXPanelCamposTablaAmortiDetalle % 2==0) {
		iXPanelCamposTablaAmortiDetalle=0;
		iYPanelCamposTablaAmortiDetalle++;
	}
	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = iYPanelCamposTablaAmortiDetalle;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = iXPanelCamposTablaAmortiDetalle++;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaAmortiDetalle.add(this.jPanelfecha_vencimientoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(iXPanelCamposTablaAmortiDetalle % 2==0) {
		iXPanelCamposTablaAmortiDetalle=0;
		iYPanelCamposTablaAmortiDetalle++;
	}
	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = iYPanelCamposTablaAmortiDetalle;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = iXPanelCamposTablaAmortiDetalle++;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaAmortiDetalle.add(this.jPanelfecha_inicialTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(iXPanelCamposTablaAmortiDetalle % 2==0) {
		iXPanelCamposTablaAmortiDetalle=0;
		iYPanelCamposTablaAmortiDetalle++;
	}
	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = iYPanelCamposTablaAmortiDetalle;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = iXPanelCamposTablaAmortiDetalle++;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaAmortiDetalle.add(this.jPanelfecha_finalTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(iXPanelCamposTablaAmortiDetalle % 2==0) {
		iXPanelCamposTablaAmortiDetalle=0;
		iYPanelCamposTablaAmortiDetalle++;
	}
	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = iYPanelCamposTablaAmortiDetalle;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = iXPanelCamposTablaAmortiDetalle++;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaAmortiDetalle.add(this.jPanelvalorTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(iXPanelCamposTablaAmortiDetalle % 2==0) {
		iXPanelCamposTablaAmortiDetalle=0;
		iYPanelCamposTablaAmortiDetalle++;
	}
	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = iYPanelCamposTablaAmortiDetalle;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = iXPanelCamposTablaAmortiDetalle++;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaAmortiDetalle.add(this.jPanelinteresTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(iXPanelCamposTablaAmortiDetalle % 2==0) {
		iXPanelCamposTablaAmortiDetalle=0;
		iYPanelCamposTablaAmortiDetalle++;
	}
	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = iYPanelCamposTablaAmortiDetalle;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = iXPanelCamposTablaAmortiDetalle++;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaAmortiDetalle.add(this.jPanelcapitalTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(iXPanelCamposTablaAmortiDetalle % 2==0) {
		iXPanelCamposTablaAmortiDetalle=0;
		iYPanelCamposTablaAmortiDetalle++;
	}
	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = iYPanelCamposTablaAmortiDetalle;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = iXPanelCamposTablaAmortiDetalle++;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTablaAmortiDetalle.add(this.jPanelnumero_cuotasTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(iXPanelCamposTablaAmortiDetalle % 2==0) {
		iXPanelCamposTablaAmortiDetalle=0;
		iYPanelCamposTablaAmortiDetalle++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = iYPanelCamposOcultosTablaAmortiDetalle;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = iXPanelCamposOcultosTablaAmortiDetalle++;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTablaAmortiDetalle.add(this.jPanelid_empresaTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(iXPanelCamposOcultosTablaAmortiDetalle % 2==0) {
		iXPanelCamposOcultosTablaAmortiDetalle=0;
		iYPanelCamposOcultosTablaAmortiDetalle++;
	}
	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = iYPanelCamposOcultosTablaAmortiDetalle;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = iXPanelCamposOcultosTablaAmortiDetalle++;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTablaAmortiDetalle.add(this.jPanelid_sucursalTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(iXPanelCamposOcultosTablaAmortiDetalle % 2==0) {
		iXPanelCamposOcultosTablaAmortiDetalle=0;
		iYPanelCamposOcultosTablaAmortiDetalle++;
	}
	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = iYPanelCamposOcultosTablaAmortiDetalle;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = iXPanelCamposOcultosTablaAmortiDetalle++;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTablaAmortiDetalle.add(this.jPanelid_ejercicioTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(iXPanelCamposOcultosTablaAmortiDetalle % 2==0) {
		iXPanelCamposOcultosTablaAmortiDetalle=0;
		iYPanelCamposOcultosTablaAmortiDetalle++;
	}
	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = iYPanelCamposOcultosTablaAmortiDetalle;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = iXPanelCamposOcultosTablaAmortiDetalle++;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTablaAmortiDetalle.add(this.jPanelid_periodoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(iXPanelCamposOcultosTablaAmortiDetalle % 2==0) {
		iXPanelCamposOcultosTablaAmortiDetalle=0;
		iYPanelCamposOcultosTablaAmortiDetalle++;
	}
	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = iYPanelCamposOcultosTablaAmortiDetalle;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = iXPanelCamposOcultosTablaAmortiDetalle++;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTablaAmortiDetalle.add(this.jPanelid_anioTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(iXPanelCamposOcultosTablaAmortiDetalle % 2==0) {
		iXPanelCamposOcultosTablaAmortiDetalle=0;
		iYPanelCamposOcultosTablaAmortiDetalle++;
	}
	this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTablaAmortiDetalle.gridy = iYPanelCamposOcultosTablaAmortiDetalle;
	this.gridBagConstraintsTablaAmortiDetalle.gridx = iXPanelCamposOcultosTablaAmortiDetalle++;
	this.gridBagConstraintsTablaAmortiDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTablaAmortiDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTablaAmortiDetalle.add(this.jPanelid_mesTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);



	if(iXPanelCamposOcultosTablaAmortiDetalle % 2==0) {
		iXPanelCamposOcultosTablaAmortiDetalle=0;
		iYPanelCamposOcultosTablaAmortiDetalle++;
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
			
		GridBagLayout gridaBagLayoutAccionesTablaAmortiDetalle= new GridBagLayout();
		this.jPanelAccionesTablaAmortiDetalle.setLayout(gridaBagLayoutAccionesTablaAmortiDetalle);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTablaAmortiDetalle= new GridBagLayout();
		this.jPanelAccionesFormularioTablaAmortiDetalle.setLayout(gridaBagLayoutAccionesFormularioTablaAmortiDetalle);
		
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTablaAmortiDetalle.add(this.jComboBoxTiposAccionesFormularioTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTablaAmortiDetalle.add(this.jCheckBoxPostAccionNuevoTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tablaamortidetalleSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTablaAmortiDetalle.add(this.jCheckBoxPostAccionSinCerrarTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tablaamortidetalleSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTablaAmortiDetalle.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTablaAmortiDetalle.add(this.jCheckBoxPostAccionSinMensajeTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXAccion++;
			
		this.jPanelAccionesTablaAmortiDetalle.add(this.jButtonModificarTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);							

		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;
		this.gridBagConstraintsTablaAmortiDetalle.gridx =iPosXAccion++;
			
		this.jPanelAccionesTablaAmortiDetalle.add(this.jButtonEliminarTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		
			
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXAccion++;
		
		this.jPanelAccionesTablaAmortiDetalle.add(this.jButtonActualizarTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);


		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = iPosXAccion++;
		
		this.jPanelAccionesTablaAmortiDetalle.add(this.jButtonGuardarCambiosTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);	
		
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.gridy = 0;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx =iPosXAccion++;
		
		this.jPanelAccionesTablaAmortiDetalle.add(this.jButtonCancelarTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTablaAmortiDetalle = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTablaAmortiDetalle);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();						
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;		
			//this.gridBagConstraintsTablaAmortiDetalle.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTablaAmortiDetalle.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTablaAmortiDetalle.gridx =0;
		this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTablaAmortiDetalle.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TablaAmortiDetalleJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTablaAmortiDetalle = new TablaAmortiDetalleBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tabla Amortizacion Detalle DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tabla Amortizacion Detalle DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tabla Amortizacion Detalle Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TablaAmortiDetalleModel tablaamortidetalleModel=new TablaAmortiDetalleModel(this);
			
			//SI USARA CLASE INTERNA
			//TablaAmortiDetalleModel.TablaAmortiDetalleFocusTraversalPolicy tablaamortidetalleFocusTraversalPolicy = tablaamortidetalleModel.new TablaAmortiDetalleFocusTraversalPolicy(this);
			
			//tablaamortidetalleFocusTraversalPolicy.settablaamortidetalleJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tablaamortidetalleModel);
			
			
			this.jContentPaneDetalleTablaAmortiDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTablaAmortiDetalle = new GridBagLayout();	
			this.jContentPaneDetalleTablaAmortiDetalle.setLayout(gridaBagLayoutDetalleTablaAmortiDetalle);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTablaAmortiDetalle = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
				this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
					
				
				this.jContentPaneDetalleTablaAmortiDetalle.add(jTtoolBarDetalleTablaAmortiDetalle, gridBagConstraintsTablaAmortiDetalle);								
				
}
			
			this.jScrollPanelDatosEdicionTablaAmortiDetalle=   new JScrollPane(jContentPaneDetalleTablaAmortiDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTablaAmortiDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTablaAmortiDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTablaAmortiDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTablaAmortiDetalle=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTablaAmortiDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTablaAmortiDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTablaAmortiDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
	        
			this.jContentPaneDetalleTablaAmortiDetalle.add(jPanelCamposTablaAmortiDetalle, gridBagConstraintsTablaAmortiDetalle);
			
			
			
			
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
						&& tablaamortidetalleSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tablaamortidetalleSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTablaAmortiDetalle= new GridBagConstraints();
						this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
						this.jContentPaneDetalleTablaAmortiDetalle.add(this.jTabbedPaneRelacionesTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTablaAmortiDetalle.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTablaAmortiDetalle.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
					this.gridBagConstraintsTablaAmortiDetalle.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
					
				
					this.jContentPaneDetalleTablaAmortiDetalle.add(jPanelCamposOcultosTablaAmortiDetalle, gridBagConstraintsTablaAmortiDetalle);
				
					this.jPanelCamposOcultosTablaAmortiDetalle.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
	        this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTablaAmortiDetalle.add(this.jPanelAccionesFormularioTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);							
			
			
			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
	        this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
	        
			
			this.jContentPaneDetalleTablaAmortiDetalle.add(this.jPanelAccionesTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTablaAmortiDetalle);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTablaAmortiDetalle=   new JScrollPane(this.jPanelCamposTablaAmortiDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTablaAmortiDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTablaAmortiDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTablaAmortiDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
			this.gridBagConstraintsTablaAmortiDetalle.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTablaAmortiDetalle.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTablaAmortiDetalle.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);			
			
			this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
			this.gridBagConstraintsTablaAmortiDetalle.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
			
			
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		
			
		this.gridBagConstraintsTablaAmortiDetalle = new GridBagConstraints();
		this.gridBagConstraintsTablaAmortiDetalle.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTablaAmortiDetalle.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTablaAmortiDetalle, this.gridBagConstraintsTablaAmortiDetalle);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTablaAmortiDetalle;//jContentPane;
		
		return jScrollPanelDatosEdicionTablaAmortiDetalle;
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
