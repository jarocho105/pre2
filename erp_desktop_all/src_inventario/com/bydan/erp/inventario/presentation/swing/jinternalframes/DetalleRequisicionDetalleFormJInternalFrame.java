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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.DetalleRequisicionConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class DetalleRequisicionDetalleFormJInternalFrame extends DetalleRequisicionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleRequisicion;
	
	protected JMenuBar jmenuBarDetalleDetalleRequisicion;
	
	protected JMenu jmenuDetalleDetalleRequisicion;
	protected JMenu jmenuDetalleArchivoDetalleRequisicion;
	protected JMenu jmenuDetalleAccionesDetalleRequisicion;
	protected JMenu jmenuDetalleDatosDetalleRequisicion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleRequisicion;	
	protected GridBagConstraints gridBagConstraintsDetalleRequisicion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleRequisicionBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleRequisicion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected RequisicionBeanSwingJInternalFrame requisicionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_requisicion="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public DetalleRequisicionSessionBean detallerequisicionSessionBean;
	
	
	
	
	public RequisicionSessionBean requisicionSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;	
	
	public DetalleRequisicionLogic detallerequisicionLogic;
	
	public JScrollPane jScrollPanelDatosDetalleRequisicion;
	public JScrollPane jScrollPanelDatosEdicionDetalleRequisicion;
	public JScrollPane jScrollPanelDatosGeneralDetalleRequisicion;
	
	protected JPanel jPanelCamposDetalleRequisicion;    
	protected JPanel jPanelCamposOcultosDetalleRequisicion;    	
	protected JPanel jPanelAccionesDetalleRequisicion;
	protected JPanel jPanelAccionesFormularioDetalleRequisicion;
    
	
	
	protected Integer iXPanelCamposDetalleRequisicion=0;
	protected Integer iYPanelCamposDetalleRequisicion=0;
	
	protected Integer iXPanelCamposOcultosDetalleRequisicion=0;
	protected Integer iYPanelCamposOcultosDetalleRequisicion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleRequisicion;
	public JButton jButtonModificarDetalleRequisicion;
	public JButton jButtonActualizarDetalleRequisicion;
    public JButton jButtonEliminarDetalleRequisicion;
	public JButton jButtonCancelarDetalleRequisicion;
    public JButton jButtonGuardarCambiosDetalleRequisicion;
	public JButton jButtonGuardarCambiosTablaDetalleRequisicion;
	protected JButton jButtonCerrarDetalleRequisicion;
	
	
	protected JButton jButtonProcesarInformacionDetalleRequisicion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleRequisicion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleRequisicion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleRequisicion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleRequisicion;
	protected JButton jButtonModificarToolBarDetalleRequisicion;
	protected JButton jButtonActualizarToolBarDetalleRequisicion;
    protected JButton jButtonEliminarToolBarDetalleRequisicion;
	protected JButton jButtonCancelarToolBarDetalleRequisicion;
    protected JButton jButtonGuardarCambiosToolBarDetalleRequisicion;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleRequisicion;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleRequisicion;
	protected JButton jButtonCerrarToolBarDetalleRequisicion;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleRequisicion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleRequisicion;
	protected JMenuItem jMenuItemModificarDetalleRequisicion;
	protected JMenuItem jMenuItemActualizarDetalleRequisicion;
    protected JMenuItem jMenuItemEliminarDetalleRequisicion;
	protected JMenuItem jMenuItemCancelarDetalleRequisicion;
    protected JMenuItem jMenuItemGuardarCambiosDetalleRequisicion;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleRequisicion;
	protected JMenuItem jMenuItemCerrarDetalleRequisicion;
	protected JMenuItem jMenuItemDetalleCerrarDetalleRequisicion;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleRequisicion;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleRequisicion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleRequisicion;
	protected JMenuItem jMenuItemMostrarOcultarDetalleRequisicion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleRequisicion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleRequisicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleRequisicion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleRequisicion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleRequisicion;
	public JLabel jLabelIdDetalleRequisicion;
	public JLabel jLabelidDetalleRequisicion;
	public JButton jButtonidDetalleRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelcantidadDetalleRequisicion;
	public JLabel jLabelcantidadDetalleRequisicion;
	public JTextField jTextFieldcantidadDetalleRequisicion;
	public JButton jButtoncantidadDetalleRequisicionBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetalleRequisicion;
	public JLabel jLabeldescripcionDetalleRequisicion;
	public JTextArea jTextAreadescripcionDetalleRequisicion;
	public JScrollPane jscrollPanedescripcionDetalleRequisicion;
	public JButton jButtondescripcionDetalleRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelfecha_autorizaDetalleRequisicion;
	public JLabel jLabelfecha_autorizaDetalleRequisicion;
	//public JFormattedTextField jDateChooserfecha_autorizaDetalleRequisicion;

	public JDateChooser jDateChooserfecha_autorizaDetalleRequisicion;
	public JButton jButtonfecha_autorizaDetalleRequisicionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_requisicionDetalleRequisicion;
	public JLabel jLabelid_requisicionDetalleRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_requisicionDetalleRequisicion;
	public JButton jButtonid_requisicionDetalleRequisicion= new JButtonMe();
	public JButton jButtonid_requisicionDetalleRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_requisicionDetalleRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaDetalleRequisicion;
	public JLabel jLabelid_empresaDetalleRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleRequisicion;
	public JButton jButtonid_empresaDetalleRequisicion= new JButtonMe();
	public JButton jButtonid_empresaDetalleRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleRequisicion;
	public JLabel jLabelid_sucursalDetalleRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleRequisicion;
	public JButton jButtonid_sucursalDetalleRequisicion= new JButtonMe();
	public JButton jButtonid_sucursalDetalleRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetalleRequisicion;
	public JLabel jLabelid_ejercicioDetalleRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetalleRequisicion;
	public JButton jButtonid_ejercicioDetalleRequisicion= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetalleRequisicion;
	public JLabel jLabelid_periodoDetalleRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetalleRequisicion;
	public JButton jButtonid_periodoDetalleRequisicion= new JButtonMe();
	public JButton jButtonid_periodoDetalleRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetalleRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetalleRequisicion;
	public JLabel jLabelid_anioDetalleRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetalleRequisicion;
	public JButton jButtonid_anioDetalleRequisicion= new JButtonMe();
	public JButton jButtonid_anioDetalleRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_anioDetalleRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetalleRequisicion;
	public JLabel jLabelid_mesDetalleRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetalleRequisicion;
	public JButton jButtonid_mesDetalleRequisicion= new JButtonMe();
	public JButton jButtonid_mesDetalleRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_mesDetalleRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDetalleRequisicion;
	public JLabel jLabelid_bodegaDetalleRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDetalleRequisicion;
	public JButton jButtonid_bodegaDetalleRequisicion= new JButtonMe();
	public JButton jButtonid_bodegaDetalleRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDetalleRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetalleRequisicion;
	public JLabel jLabelid_productoDetalleRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetalleRequisicion;
	public JButton jButtonid_productoDetalleRequisicion= new JButtonMe();
	public JButton jButtonid_productoDetalleRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_productoDetalleRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetalleRequisicion;
	public JLabel jLabelid_unidadDetalleRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetalleRequisicion;
	public JButton jButtonid_unidadDetalleRequisicion= new JButtonMe();
	public JButton jButtonid_unidadDetalleRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetalleRequisicionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleRequisicion;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleRequisicionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleRequisicion=new JPanel();
				this.jPanelAccionesFormularioDetalleRequisicion=new JPanel();
				this.jmenuBarDetalleDetalleRequisicion=new JMenuBar();
				this.jTtoolBarDetalleDetalleRequisicion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRequisicionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleRequisicionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRequisicionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRequisicionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRequisicionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleRequisicion() {
		return this.jButtonActualizarToolBarDetalleRequisicion;
	}
	
	public JButton getjButtonEliminarToolBarDetalleRequisicion() {
		return this.jButtonEliminarToolBarDetalleRequisicion;
	}
	
	public JButton getjButtonCancelarToolBarDetalleRequisicion() {
		return this.jButtonCancelarToolBarDetalleRequisicion;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleRequisicion() {
		return this.jButtonProcesarInformacionDetalleRequisicion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleRequisicion)	{
		this.jButtonProcesarInformacionDetalleRequisicion = jButtonProcesarInformacionDetalleRequisicion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleRequisicion() {
		return this.jComboBoxTiposAccionesDetalleRequisicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleRequisicion(
			JComboBox jComboBoxTiposRelacionesDetalleRequisicion) {
		this.jComboBoxTiposRelacionesDetalleRequisicion = jComboBoxTiposRelacionesDetalleRequisicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleRequisicion(
			JComboBox jComboBoxTiposAccionesDetalleRequisicion) {
		this.jComboBoxTiposAccionesDetalleRequisicion = jComboBoxTiposAccionesDetalleRequisicion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleRequisicion() {
		return this.jComboBoxTiposAccionesFormularioDetalleRequisicion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleRequisicion(
			JComboBox jComboBoxTiposAccionesFormularioDetalleRequisicion) {
		this.jComboBoxTiposAccionesFormularioDetalleRequisicion = jComboBoxTiposAccionesFormularioDetalleRequisicion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallerequisicionSessionBean=new DetalleRequisicionSessionBean();
		
		this.detallerequisicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallerequisicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallerequisicionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleRequisicionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleRequisicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleRequisicionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Requisicion MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleRequisicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleRequisicion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleRequisicion=new JButtonMe();
				this.jButtonModificarToolBarDetalleRequisicion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleRequisicion,this.jTtoolBarDetalleDetalleRequisicion,
							"actualizar","actualizar","Actualizar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleRequisicion,this.jTtoolBarDetalleDetalleRequisicion,
							"eliminar","eliminar","Eliminar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleRequisicion,this.jTtoolBarDetalleDetalleRequisicion,
							"cancelar","cancelar","Cancelar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleRequisicion,this.jTtoolBarDetalleDetalleRequisicion,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleRequisicion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleRequisicion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleRequisicion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleRequisicion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleRequisicion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleRequisicion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleRequisicion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleRequisicion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleRequisicion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleRequisicion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleRequisicion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleRequisicion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleRequisicion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleRequisicion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleRequisicion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleRequisicion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleRequisicion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleRequisicion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleRequisicion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleRequisicion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleRequisicion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleRequisicion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleRequisicion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleRequisicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleRequisicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleRequisicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleRequisicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleRequisicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleRequisicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleRequisicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleRequisicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleRequisicion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleRequisicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleRequisicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleRequisicion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleRequisicion.add(this.jMenuItemDetalleCerrarDetalleRequisicion);
		
		this.jmenuDetalleAccionesDetalleRequisicion.add(this.jMenuItemActualizarDetalleRequisicion);
		this.jmenuDetalleAccionesDetalleRequisicion.add(this.jMenuItemEliminarDetalleRequisicion);
		this.jmenuDetalleAccionesDetalleRequisicion.add(this.jMenuItemCancelarDetalleRequisicion);		
		
		//this.jmenuDetalleDatosDetalleRequisicion.add(this.jMenuItemDetalleAbrirOrderByDetalleRequisicion);				
		this.jmenuDetalleDatosDetalleRequisicion.add(this.jMenuItemDetalleMostarOcultarDetalleRequisicion);				
				
		//this.jmenuDetalleAccionesDetalleRequisicion.add(this.jMenuItemGuardarCambiosDetalleRequisicion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleRequisicion.add(this.jmenuDetalleArchivoDetalleRequisicion);		
		this.jmenuBarDetalleDetalleRequisicion.add(this.jmenuDetalleAccionesDetalleRequisicion);		
		this.jmenuBarDetalleDetalleRequisicion.add(this.jmenuDetalleDatosDetalleRequisicion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleRequisicion);				
	}
	
	
	public void inicializarElementosCamposDetalleRequisicion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleRequisicion = new JLabelMe();
		jLabelIdDetalleRequisicion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleRequisicion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleRequisicion.setToolTipText(DetalleRequisicionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleRequisicion= new GridBagLayout();

		this.jPanelidDetalleRequisicion.setLayout(this.gridaBagLayoutDetalleRequisicion);

		jLabelidDetalleRequisicion = new JLabel();
		jLabelidDetalleRequisicion.setText("Id");

		jLabelidDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidadDetalleRequisicion = new JLabelMe();
		this.jLabelcantidadDetalleRequisicion.setText(""+DetalleRequisicionConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadDetalleRequisicion.setToolTipText("Cantidad");
		this.jLabelcantidadDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadDetalleRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadDetalleRequisicion.setToolTipText(DetalleRequisicionConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutDetalleRequisicion = new GridBagLayout();
		this.jPanelcantidadDetalleRequisicion.setLayout(this.gridaBagLayoutDetalleRequisicion);


		jTextFieldcantidadDetalleRequisicion= new JTextFieldMe();
		jTextFieldcantidadDetalleRequisicion.setEnabled(false);
		jTextFieldcantidadDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadDetalleRequisicion.setText("0");

		this.jButtoncantidadDetalleRequisicionBusqueda= new JButtonMe();
		this.jButtoncantidadDetalleRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadDetalleRequisicionBusqueda.setText("U");
		this.jButtoncantidadDetalleRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadDetalleRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadDetalleRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadDetalleRequisicionBusqueda"));

		if(this.detallerequisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadDetalleRequisicionBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDetalleRequisicion = new JLabelMe();
		this.jLabeldescripcionDetalleRequisicion.setText(""+DetalleRequisicionConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionDetalleRequisicion.setToolTipText("Descripcion");
		this.jLabeldescripcionDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetalleRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetalleRequisicion.setToolTipText(DetalleRequisicionConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetalleRequisicion = new GridBagLayout();
		this.jPaneldescripcionDetalleRequisicion.setLayout(this.gridaBagLayoutDetalleRequisicion);


		jTextAreadescripcionDetalleRequisicion= new JTextAreaMe();
		jTextAreadescripcionDetalleRequisicion.setEnabled(false);
		jTextAreadescripcionDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleRequisicion.setLineWrap(true);
		jTextAreadescripcionDetalleRequisicion.setWrapStyleWord(true);
		jTextAreadescripcionDetalleRequisicion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetalleRequisicion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetalleRequisicion = new JScrollPane(jTextAreadescripcionDetalleRequisicion);
		jscrollPanedescripcionDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDetalleRequisicionBusqueda= new JButtonMe();
		this.jButtondescripcionDetalleRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetalleRequisicionBusqueda.setText("U");
		this.jButtondescripcionDetalleRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetalleRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetalleRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetalleRequisicionBusqueda"));

		if(this.detallerequisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetalleRequisicionBusqueda.setVisible(false);		}


					
		this.jLabelfecha_autorizaDetalleRequisicion = new JLabelMe();
		this.jLabelfecha_autorizaDetalleRequisicion.setText(""+DetalleRequisicionConstantesFunciones.LABEL_FECHAAUTORIZA+" : *");
		this.jLabelfecha_autorizaDetalleRequisicion.setToolTipText("Fecha Autorizacion");
		this.jLabelfecha_autorizaDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_autorizaDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_autorizaDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_autorizaDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_autorizaDetalleRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_autorizaDetalleRequisicion.setToolTipText(DetalleRequisicionConstantesFunciones.LABEL_FECHAAUTORIZA);
		this.gridaBagLayoutDetalleRequisicion = new GridBagLayout();
		this.jPanelfecha_autorizaDetalleRequisicion.setLayout(this.gridaBagLayoutDetalleRequisicion);


		//jFormattedTextFieldfecha_autorizaDetalleRequisicion= new JFormattedTextFieldMe();

		jDateChooserfecha_autorizaDetalleRequisicion= new JDateChooser();
		jDateChooserfecha_autorizaDetalleRequisicion.setEnabled(false);
		jDateChooserfecha_autorizaDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_autorizaDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_autorizaDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_autorizaDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_autorizaDetalleRequisicion.setDate(new Date());
		jDateChooserfecha_autorizaDetalleRequisicion.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_autorizaDetalleRequisicion.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_autorizaDetalleRequisicionBusqueda= new JButtonMe();
		this.jButtonfecha_autorizaDetalleRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_autorizaDetalleRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_autorizaDetalleRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_autorizaDetalleRequisicionBusqueda.setText("U");
		this.jButtonfecha_autorizaDetalleRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_autorizaDetalleRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_autorizaDetalleRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_autorizaDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_autorizaDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_autorizaDetalleRequisicionBusqueda"));

		if(this.detallerequisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_autorizaDetalleRequisicionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleRequisicion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_requisicionDetalleRequisicion = new JLabelMe();
		this.jLabelid_requisicionDetalleRequisicion.setText(""+DetalleRequisicionConstantesFunciones.LABEL_IDREQUISICION+" : *");
		this.jLabelid_requisicionDetalleRequisicion.setToolTipText("Requisicion");
		this.jLabelid_requisicionDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_requisicionDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_requisicionDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_requisicionDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_requisicionDetalleRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_requisicionDetalleRequisicion.setToolTipText(DetalleRequisicionConstantesFunciones.LABEL_IDREQUISICION);
		this.gridaBagLayoutDetalleRequisicion = new GridBagLayout();
		this.jPanelid_requisicionDetalleRequisicion.setLayout(this.gridaBagLayoutDetalleRequisicion);


		jComboBoxid_requisicionDetalleRequisicion= new JComboBoxMe();
		jComboBoxid_requisicionDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_requisicionDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_requisicionDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_requisicionDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_requisicionDetalleRequisicion= new JButtonMe();
		this.jButtonid_requisicionDetalleRequisicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_requisicionDetalleRequisicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_requisicionDetalleRequisicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_requisicionDetalleRequisicion.setText("Buscar");
		this.jButtonid_requisicionDetalleRequisicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_requisicionDetalleRequisicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_requisicionDetalleRequisicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_requisicionDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_requisicionDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_requisicionDetalleRequisicion"));

		this.jButtonid_requisicionDetalleRequisicionBusqueda= new JButtonMe();
		this.jButtonid_requisicionDetalleRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_requisicionDetalleRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_requisicionDetalleRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_requisicionDetalleRequisicionBusqueda.setText("U");
		this.jButtonid_requisicionDetalleRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_requisicionDetalleRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_requisicionDetalleRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_requisicionDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_requisicionDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_requisicionDetalleRequisicionBusqueda"));

		if(this.detallerequisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_requisicionDetalleRequisicionBusqueda.setVisible(false);		}

		this.jButtonid_requisicionDetalleRequisicionUpdate= new JButtonMe();
		this.jButtonid_requisicionDetalleRequisicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_requisicionDetalleRequisicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_requisicionDetalleRequisicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_requisicionDetalleRequisicionUpdate.setText("U");
		this.jButtonid_requisicionDetalleRequisicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_requisicionDetalleRequisicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_requisicionDetalleRequisicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_requisicionDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_requisicionDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_requisicionDetalleRequisicionUpdate"));



					
		this.jLabelid_empresaDetalleRequisicion = new JLabelMe();
		this.jLabelid_empresaDetalleRequisicion.setText(""+DetalleRequisicionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleRequisicion.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleRequisicion.setToolTipText(DetalleRequisicionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleRequisicion = new GridBagLayout();
		this.jPanelid_empresaDetalleRequisicion.setLayout(this.gridaBagLayoutDetalleRequisicion);


		jComboBoxid_empresaDetalleRequisicion= new JComboBoxMe();
		jComboBoxid_empresaDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleRequisicion.setEnabled(false);

		this.jButtonid_empresaDetalleRequisicion= new JButtonMe();
		this.jButtonid_empresaDetalleRequisicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleRequisicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleRequisicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleRequisicion.setText("Buscar");
		this.jButtonid_empresaDetalleRequisicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleRequisicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleRequisicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleRequisicion"));

		this.jButtonid_empresaDetalleRequisicionBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleRequisicionBusqueda.setText("U");
		this.jButtonid_empresaDetalleRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleRequisicionBusqueda"));

		if(this.detallerequisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleRequisicionBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleRequisicionUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleRequisicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleRequisicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleRequisicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleRequisicionUpdate.setText("U");
		this.jButtonid_empresaDetalleRequisicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleRequisicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleRequisicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleRequisicionUpdate"));



					
		this.jLabelid_sucursalDetalleRequisicion = new JLabelMe();
		this.jLabelid_sucursalDetalleRequisicion.setText(""+DetalleRequisicionConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleRequisicion.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleRequisicion.setToolTipText(DetalleRequisicionConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleRequisicion = new GridBagLayout();
		this.jPanelid_sucursalDetalleRequisicion.setLayout(this.gridaBagLayoutDetalleRequisicion);


		jComboBoxid_sucursalDetalleRequisicion= new JComboBoxMe();
		jComboBoxid_sucursalDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleRequisicion.setEnabled(false);

		this.jButtonid_sucursalDetalleRequisicion= new JButtonMe();
		this.jButtonid_sucursalDetalleRequisicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleRequisicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleRequisicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleRequisicion.setText("Buscar");
		this.jButtonid_sucursalDetalleRequisicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleRequisicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleRequisicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleRequisicion"));

		this.jButtonid_sucursalDetalleRequisicionBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleRequisicionBusqueda.setText("U");
		this.jButtonid_sucursalDetalleRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleRequisicionBusqueda"));

		if(this.detallerequisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleRequisicionBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleRequisicionUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleRequisicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleRequisicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleRequisicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleRequisicionUpdate.setText("U");
		this.jButtonid_sucursalDetalleRequisicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleRequisicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleRequisicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleRequisicionUpdate"));



					
		this.jLabelid_ejercicioDetalleRequisicion = new JLabelMe();
		this.jLabelid_ejercicioDetalleRequisicion.setText(""+DetalleRequisicionConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetalleRequisicion.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetalleRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetalleRequisicion.setToolTipText(DetalleRequisicionConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetalleRequisicion = new GridBagLayout();
		this.jPanelid_ejercicioDetalleRequisicion.setLayout(this.gridaBagLayoutDetalleRequisicion);


		jComboBoxid_ejercicioDetalleRequisicion= new JComboBoxMe();
		jComboBoxid_ejercicioDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetalleRequisicion.setEnabled(false);

		this.jButtonid_ejercicioDetalleRequisicion= new JButtonMe();
		this.jButtonid_ejercicioDetalleRequisicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleRequisicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleRequisicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleRequisicion.setText("Buscar");
		this.jButtonid_ejercicioDetalleRequisicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetalleRequisicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleRequisicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleRequisicion"));

		this.jButtonid_ejercicioDetalleRequisicionBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetalleRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleRequisicionBusqueda.setText("U");
		this.jButtonid_ejercicioDetalleRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetalleRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleRequisicionBusqueda"));

		if(this.detallerequisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetalleRequisicionBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetalleRequisicionUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetalleRequisicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleRequisicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleRequisicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleRequisicionUpdate.setText("U");
		this.jButtonid_ejercicioDetalleRequisicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetalleRequisicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleRequisicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleRequisicionUpdate"));



					
		this.jLabelid_periodoDetalleRequisicion = new JLabelMe();
		this.jLabelid_periodoDetalleRequisicion.setText(""+DetalleRequisicionConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetalleRequisicion.setToolTipText("Periodo");
		this.jLabelid_periodoDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetalleRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetalleRequisicion.setToolTipText(DetalleRequisicionConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetalleRequisicion = new GridBagLayout();
		this.jPanelid_periodoDetalleRequisicion.setLayout(this.gridaBagLayoutDetalleRequisicion);


		jComboBoxid_periodoDetalleRequisicion= new JComboBoxMe();
		jComboBoxid_periodoDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetalleRequisicion.setEnabled(false);

		this.jButtonid_periodoDetalleRequisicion= new JButtonMe();
		this.jButtonid_periodoDetalleRequisicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleRequisicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleRequisicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleRequisicion.setText("Buscar");
		this.jButtonid_periodoDetalleRequisicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetalleRequisicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleRequisicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleRequisicion"));

		this.jButtonid_periodoDetalleRequisicionBusqueda= new JButtonMe();
		this.jButtonid_periodoDetalleRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleRequisicionBusqueda.setText("U");
		this.jButtonid_periodoDetalleRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetalleRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleRequisicionBusqueda"));

		if(this.detallerequisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetalleRequisicionBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetalleRequisicionUpdate= new JButtonMe();
		this.jButtonid_periodoDetalleRequisicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleRequisicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleRequisicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleRequisicionUpdate.setText("U");
		this.jButtonid_periodoDetalleRequisicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetalleRequisicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleRequisicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleRequisicionUpdate"));



					
		this.jLabelid_anioDetalleRequisicion = new JLabelMe();
		this.jLabelid_anioDetalleRequisicion.setText(""+DetalleRequisicionConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetalleRequisicion.setToolTipText("Anio");
		this.jLabelid_anioDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetalleRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetalleRequisicion.setToolTipText(DetalleRequisicionConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetalleRequisicion = new GridBagLayout();
		this.jPanelid_anioDetalleRequisicion.setLayout(this.gridaBagLayoutDetalleRequisicion);


		jComboBoxid_anioDetalleRequisicion= new JComboBoxMe();
		jComboBoxid_anioDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetalleRequisicion.setEnabled(false);

		this.jButtonid_anioDetalleRequisicion= new JButtonMe();
		this.jButtonid_anioDetalleRequisicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleRequisicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleRequisicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleRequisicion.setText("Buscar");
		this.jButtonid_anioDetalleRequisicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetalleRequisicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleRequisicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleRequisicion"));

		this.jButtonid_anioDetalleRequisicionBusqueda= new JButtonMe();
		this.jButtonid_anioDetalleRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleRequisicionBusqueda.setText("U");
		this.jButtonid_anioDetalleRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetalleRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleRequisicionBusqueda"));

		if(this.detallerequisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetalleRequisicionBusqueda.setVisible(false);		}

		this.jButtonid_anioDetalleRequisicionUpdate= new JButtonMe();
		this.jButtonid_anioDetalleRequisicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleRequisicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleRequisicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleRequisicionUpdate.setText("U");
		this.jButtonid_anioDetalleRequisicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetalleRequisicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleRequisicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleRequisicionUpdate"));



					
		this.jLabelid_mesDetalleRequisicion = new JLabelMe();
		this.jLabelid_mesDetalleRequisicion.setText(""+DetalleRequisicionConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetalleRequisicion.setToolTipText("Mes");
		this.jLabelid_mesDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetalleRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetalleRequisicion.setToolTipText(DetalleRequisicionConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetalleRequisicion = new GridBagLayout();
		this.jPanelid_mesDetalleRequisicion.setLayout(this.gridaBagLayoutDetalleRequisicion);


		jComboBoxid_mesDetalleRequisicion= new JComboBoxMe();
		jComboBoxid_mesDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetalleRequisicion.setEnabled(false);

		this.jButtonid_mesDetalleRequisicion= new JButtonMe();
		this.jButtonid_mesDetalleRequisicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleRequisicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleRequisicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleRequisicion.setText("Buscar");
		this.jButtonid_mesDetalleRequisicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetalleRequisicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleRequisicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleRequisicion"));

		this.jButtonid_mesDetalleRequisicionBusqueda= new JButtonMe();
		this.jButtonid_mesDetalleRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleRequisicionBusqueda.setText("U");
		this.jButtonid_mesDetalleRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetalleRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleRequisicionBusqueda"));

		if(this.detallerequisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetalleRequisicionBusqueda.setVisible(false);		}

		this.jButtonid_mesDetalleRequisicionUpdate= new JButtonMe();
		this.jButtonid_mesDetalleRequisicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleRequisicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleRequisicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleRequisicionUpdate.setText("U");
		this.jButtonid_mesDetalleRequisicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetalleRequisicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleRequisicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleRequisicionUpdate"));



					
		this.jLabelid_bodegaDetalleRequisicion = new JLabelMe();
		this.jLabelid_bodegaDetalleRequisicion.setText(""+DetalleRequisicionConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDetalleRequisicion.setToolTipText("Bodega");
		this.jLabelid_bodegaDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDetalleRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDetalleRequisicion.setToolTipText(DetalleRequisicionConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDetalleRequisicion = new GridBagLayout();
		this.jPanelid_bodegaDetalleRequisicion.setLayout(this.gridaBagLayoutDetalleRequisicion);


		jComboBoxid_bodegaDetalleRequisicion= new JComboBoxMe();
		jComboBoxid_bodegaDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDetalleRequisicion= new JButtonMe();
		this.jButtonid_bodegaDetalleRequisicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleRequisicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleRequisicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleRequisicion.setText("Buscar");
		this.jButtonid_bodegaDetalleRequisicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDetalleRequisicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleRequisicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleRequisicion"));

		this.jButtonid_bodegaDetalleRequisicionBusqueda= new JButtonMe();
		this.jButtonid_bodegaDetalleRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleRequisicionBusqueda.setText("U");
		this.jButtonid_bodegaDetalleRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDetalleRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleRequisicionBusqueda"));

		if(this.detallerequisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDetalleRequisicionBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDetalleRequisicionUpdate= new JButtonMe();
		this.jButtonid_bodegaDetalleRequisicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleRequisicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleRequisicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleRequisicionUpdate.setText("U");
		this.jButtonid_bodegaDetalleRequisicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDetalleRequisicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleRequisicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleRequisicionUpdate"));



					
		this.jLabelid_productoDetalleRequisicion = new JLabelMe();
		this.jLabelid_productoDetalleRequisicion.setText(""+DetalleRequisicionConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetalleRequisicion.setToolTipText("Producto");
		this.jLabelid_productoDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetalleRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetalleRequisicion.setToolTipText(DetalleRequisicionConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetalleRequisicion = new GridBagLayout();
		this.jPanelid_productoDetalleRequisicion.setLayout(this.gridaBagLayoutDetalleRequisicion);


		jComboBoxid_productoDetalleRequisicion= new JComboBoxMe();
		jComboBoxid_productoDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetalleRequisicion= new JButtonMe();
		this.jButtonid_productoDetalleRequisicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleRequisicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleRequisicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleRequisicion.setText("Buscar");
		this.jButtonid_productoDetalleRequisicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetalleRequisicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleRequisicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleRequisicion"));

		this.jButtonid_productoDetalleRequisicionBusqueda= new JButtonMe();
		this.jButtonid_productoDetalleRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleRequisicionBusqueda.setText("U");
		this.jButtonid_productoDetalleRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetalleRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleRequisicionBusqueda"));

		if(this.detallerequisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetalleRequisicionBusqueda.setVisible(false);		}

		this.jButtonid_productoDetalleRequisicionUpdate= new JButtonMe();
		this.jButtonid_productoDetalleRequisicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleRequisicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleRequisicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleRequisicionUpdate.setText("U");
		this.jButtonid_productoDetalleRequisicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetalleRequisicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleRequisicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleRequisicionUpdate"));



					
		this.jLabelid_unidadDetalleRequisicion = new JLabelMe();
		this.jLabelid_unidadDetalleRequisicion.setText(""+DetalleRequisicionConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetalleRequisicion.setToolTipText("Unidad");
		this.jLabelid_unidadDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetalleRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetalleRequisicion.setToolTipText(DetalleRequisicionConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetalleRequisicion = new GridBagLayout();
		this.jPanelid_unidadDetalleRequisicion.setLayout(this.gridaBagLayoutDetalleRequisicion);


		jComboBoxid_unidadDetalleRequisicion= new JComboBoxMe();
		jComboBoxid_unidadDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetalleRequisicion= new JButtonMe();
		this.jButtonid_unidadDetalleRequisicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleRequisicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleRequisicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleRequisicion.setText("Buscar");
		this.jButtonid_unidadDetalleRequisicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetalleRequisicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleRequisicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleRequisicion"));

		this.jButtonid_unidadDetalleRequisicionBusqueda= new JButtonMe();
		this.jButtonid_unidadDetalleRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleRequisicionBusqueda.setText("U");
		this.jButtonid_unidadDetalleRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetalleRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleRequisicionBusqueda"));

		if(this.detallerequisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetalleRequisicionBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetalleRequisicionUpdate= new JButtonMe();
		this.jButtonid_unidadDetalleRequisicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleRequisicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleRequisicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleRequisicionUpdate.setText("U");
		this.jButtonid_unidadDetalleRequisicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetalleRequisicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleRequisicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleRequisicionUpdate"));



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
		//this.jInternalFrameDetalleDetalleRequisicion = new DetalleRequisicionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Requisicion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleRequisicion= new GridBagLayout();
		

		
		String sToolTipDetalleRequisicion="";
		sToolTipDetalleRequisicion=DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleRequisicion+="(Inventario.DetalleRequisicion)";
		}
		
		if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleRequisicion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleRequisicion = new JButtonMe();
		this.jButtonModificarDetalleRequisicion = new JButtonMe();
        this.jButtonActualizarDetalleRequisicion = new JButtonMe();
        this.jButtonEliminarDetalleRequisicion = new JButtonMe();
        this.jButtonCancelarDetalleRequisicion = new JButtonMe();
        this.jButtonGuardarCambiosDetalleRequisicion = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleRequisicion = new JButtonMe();
		this.jButtonCerrarDetalleRequisicion = new JButtonMe();
		
		this.jScrollPanelDatosDetalleRequisicion = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleRequisicion = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleRequisicion = new JScrollPane();
		//this.jScrollPanelDatosDetalleRequisicionTotales = new JScrollPane();		
		
		
		this.jPanelCamposDetalleRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Requisicion";
		
		if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Requisicions" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleRequisicion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetalleRequisicionTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
			
        this.jPanelCamposDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleRequisicion.setName("jPanelCamposDetalleRequisicion"); 

		this.jPanelCamposOcultosDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleRequisicion.setName("jPanelCamposOcultosDetalleRequisicion"); 

        this.jPanelAccionesDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleRequisicion.setToolTipText("Acciones");
        this.jPanelAccionesDetalleRequisicion.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleRequisicion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleRequisicion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleRequisicion.setText("Nuevo");
		this.jButtonModificarDetalleRequisicion.setText("Editar");
        this.jButtonActualizarDetalleRequisicion.setText("Actualizar");
        this.jButtonEliminarDetalleRequisicion.setText("Eliminar");
        this.jButtonCancelarDetalleRequisicion.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleRequisicion.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleRequisicion.setText("Guardar");
		this.jButtonCerrarDetalleRequisicion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleRequisicion,"nuevo_button","Nuevo",this.detallerequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleRequisicion,"modificar_button","Editar",this.detallerequisicionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleRequisicion,"actualizar_button","Actualizar",this.detallerequisicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleRequisicion,"eliminar_button","Eliminar",this.detallerequisicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleRequisicion,"cancelar_button","Cancelar",this.detallerequisicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleRequisicion,"guardarcambios_button","Guardar",this.detallerequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleRequisicion,"guardarcambiostabla_button","Guardar",this.detallerequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleRequisicion,"cerrar_button","Salir",this.detallerequisicionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleRequisicion.setToolTipText("Nuevo"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleRequisicion.setToolTipText("Editar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleRequisicion.setToolTipText("Actualizar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleRequisicion.setToolTipText("Eliminar)"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleRequisicion.setToolTipText("Cancelar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleRequisicion.setToolTipText("Guardar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleRequisicion.setToolTipText("Guardar"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleRequisicion.setToolTipText("Salir"+" "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleRequisicion";
		inputMap = this.jButtonNuevoDetalleRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleRequisicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleRequisicion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleRequisicion";
		inputMap = this.jButtonActualizarDetalleRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleRequisicion"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleRequisicion";
		inputMap = this.jButtonEliminarDetalleRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleRequisicion"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleRequisicion";
		inputMap = this.jButtonCancelarDetalleRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleRequisicion"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleRequisicion";
		inputMap = this.jButtonCerrarDetalleRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleRequisicion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleRequisicion";
		inputMap = this.jButtonGuardarCambiosTablaDetalleRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleRequisicion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleRequisicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleRequisicion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleRequisicion.setToolTipText("Nuevo DetalleRequisicion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleRequisicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleRequisicion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleRequisicion.setToolTipText("Sin Cerrar Ventana DetalleRequisicion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleRequisicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleRequisicion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleRequisicion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleRequisicion.setText("Accion");
		this.jComboBoxTiposAccionesDetalleRequisicion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleRequisicion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleRequisicion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleRequisicion = new JLabelMe();
		
		this.jLabelAccionesDetalleRequisicion.setText("Acciones");		
		this.jLabelAccionesDetalleRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleRequisicion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleRequisicion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleRequisicion=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleRequisicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleRequisicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleRequisicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleRequisicion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleRequisicion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleRequisicion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleRequisicion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleRequisicion = new GridBagLayout();
		
		this.jPanelCamposDetalleRequisicion.setLayout(gridaBagLayoutCamposDetalleRequisicion);
		this.jPanelCamposOcultosDetalleRequisicion.setLayout(gridaBagLayoutCamposOcultosDetalleRequisicion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 0;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleRequisicion.add(jLabelIdDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 1;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleRequisicion.add(jLabelidDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);


	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 0;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_requisicionDetalleRequisicion.add(jLabelid_requisicionDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 2;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_requisicionDetalleRequisicion.add(jButtonid_requisicionDetalleRequisicionBusqueda, this.gridBagConstraintsDetalleRequisicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 3;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_requisicionDetalleRequisicion.add(jButtonid_requisicionDetalleRequisicionUpdate, this.gridBagConstraintsDetalleRequisicion);
	}

	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 1;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_requisicionDetalleRequisicion.add(jComboBoxid_requisicionDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);


	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 0;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleRequisicion.add(jLabelid_empresaDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 2;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleRequisicion.add(jButtonid_empresaDetalleRequisicionBusqueda, this.gridBagConstraintsDetalleRequisicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 3;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleRequisicion.add(jButtonid_empresaDetalleRequisicionUpdate, this.gridBagConstraintsDetalleRequisicion);
	}

	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 1;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleRequisicion.add(jComboBoxid_empresaDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);


	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 0;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleRequisicion.add(jLabelid_sucursalDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 2;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleRequisicion.add(jButtonid_sucursalDetalleRequisicionBusqueda, this.gridBagConstraintsDetalleRequisicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 3;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleRequisicion.add(jButtonid_sucursalDetalleRequisicionUpdate, this.gridBagConstraintsDetalleRequisicion);
	}

	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 1;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleRequisicion.add(jComboBoxid_sucursalDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);


	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 0;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetalleRequisicion.add(jLabelid_ejercicioDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 2;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleRequisicion.add(jButtonid_ejercicioDetalleRequisicionBusqueda, this.gridBagConstraintsDetalleRequisicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 3;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleRequisicion.add(jButtonid_ejercicioDetalleRequisicionUpdate, this.gridBagConstraintsDetalleRequisicion);
	}

	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 1;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetalleRequisicion.add(jComboBoxid_ejercicioDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);


	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 0;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetalleRequisicion.add(jLabelid_periodoDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 2;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleRequisicion.add(jButtonid_periodoDetalleRequisicionBusqueda, this.gridBagConstraintsDetalleRequisicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 3;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleRequisicion.add(jButtonid_periodoDetalleRequisicionUpdate, this.gridBagConstraintsDetalleRequisicion);
	}

	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 1;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetalleRequisicion.add(jComboBoxid_periodoDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);


	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 0;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDetalleRequisicion.add(jLabelid_anioDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 2;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleRequisicion.add(jButtonid_anioDetalleRequisicionBusqueda, this.gridBagConstraintsDetalleRequisicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 3;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleRequisicion.add(jButtonid_anioDetalleRequisicionUpdate, this.gridBagConstraintsDetalleRequisicion);
	}

	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 1;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDetalleRequisicion.add(jComboBoxid_anioDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);


	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 0;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDetalleRequisicion.add(jLabelid_mesDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 2;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleRequisicion.add(jButtonid_mesDetalleRequisicionBusqueda, this.gridBagConstraintsDetalleRequisicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 3;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleRequisicion.add(jButtonid_mesDetalleRequisicionUpdate, this.gridBagConstraintsDetalleRequisicion);
	}

	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 1;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDetalleRequisicion.add(jComboBoxid_mesDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);


	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 0;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDetalleRequisicion.add(jLabelid_bodegaDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 2;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleRequisicion.add(jButtonid_bodegaDetalleRequisicionBusqueda, this.gridBagConstraintsDetalleRequisicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 3;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleRequisicion.add(jButtonid_bodegaDetalleRequisicionUpdate, this.gridBagConstraintsDetalleRequisicion);
	}

	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 1;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDetalleRequisicion.add(jComboBoxid_bodegaDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);


	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 0;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDetalleRequisicion.add(jLabelid_productoDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 2;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetalleRequisicion.add(jButtonid_productoDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 3;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleRequisicion.add(jButtonid_productoDetalleRequisicionBusqueda, this.gridBagConstraintsDetalleRequisicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 4;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleRequisicion.add(jButtonid_productoDetalleRequisicionUpdate, this.gridBagConstraintsDetalleRequisicion);
	}

	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 1;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDetalleRequisicion.add(jComboBoxid_productoDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);


	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 0;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadDetalleRequisicion.add(jLabelid_unidadDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 2;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleRequisicion.add(jButtonid_unidadDetalleRequisicionBusqueda, this.gridBagConstraintsDetalleRequisicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 3;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleRequisicion.add(jButtonid_unidadDetalleRequisicionUpdate, this.gridBagConstraintsDetalleRequisicion);
	}

	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 1;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadDetalleRequisicion.add(jComboBoxid_unidadDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);


	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 0;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadDetalleRequisicion.add(jLabelcantidadDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 2;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadDetalleRequisicion.add(jButtoncantidadDetalleRequisicionBusqueda, this.gridBagConstraintsDetalleRequisicion);
	}

	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 1;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadDetalleRequisicion.add(jTextFieldcantidadDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);


	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 0;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetalleRequisicion.add(jLabeldescripcionDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 2;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetalleRequisicion.add(jButtondescripcionDetalleRequisicionBusqueda, this.gridBagConstraintsDetalleRequisicion);
	}

	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 1;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetalleRequisicion.add(jscrollPanedescripcionDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);


	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 0;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_autorizaDetalleRequisicion.add(jLabelfecha_autorizaDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = 2;
		this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_autorizaDetalleRequisicion.add(jButtonfecha_autorizaDetalleRequisicionBusqueda, this.gridBagConstraintsDetalleRequisicion);
	}

	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicion.gridy = 0;
	this.gridBagConstraintsDetalleRequisicion.gridx = 1;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_autorizaDetalleRequisicion.add(jDateChooserfecha_autorizaDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicion.gridy = iYPanelCamposDetalleRequisicion;
	this.gridBagConstraintsDetalleRequisicion.gridx = iXPanelCamposDetalleRequisicion++;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRequisicion.add(this.jPanelidDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(iXPanelCamposDetalleRequisicion % 1==0) {
		iXPanelCamposDetalleRequisicion=0;
		iYPanelCamposDetalleRequisicion++;
	}
	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicion.gridy = iYPanelCamposDetalleRequisicion;
	this.gridBagConstraintsDetalleRequisicion.gridx = iXPanelCamposDetalleRequisicion++;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRequisicion.add(this.jPanelid_requisicionDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(iXPanelCamposDetalleRequisicion % 1==0) {
		iXPanelCamposDetalleRequisicion=0;
		iYPanelCamposDetalleRequisicion++;
	}
	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicion.gridy = iYPanelCamposDetalleRequisicion;
	this.gridBagConstraintsDetalleRequisicion.gridx = iXPanelCamposDetalleRequisicion++;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRequisicion.add(this.jPanelid_bodegaDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(iXPanelCamposDetalleRequisicion % 1==0) {
		iXPanelCamposDetalleRequisicion=0;
		iYPanelCamposDetalleRequisicion++;
	}
	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicion.gridy = iYPanelCamposDetalleRequisicion;
	this.gridBagConstraintsDetalleRequisicion.gridx = iXPanelCamposDetalleRequisicion++;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRequisicion.add(this.jPanelid_productoDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(iXPanelCamposDetalleRequisicion % 1==0) {
		iXPanelCamposDetalleRequisicion=0;
		iYPanelCamposDetalleRequisicion++;
	}
	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicion.gridy = iYPanelCamposDetalleRequisicion;
	this.gridBagConstraintsDetalleRequisicion.gridx = iXPanelCamposDetalleRequisicion++;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRequisicion.add(this.jPanelid_unidadDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(iXPanelCamposDetalleRequisicion % 1==0) {
		iXPanelCamposDetalleRequisicion=0;
		iYPanelCamposDetalleRequisicion++;
	}
	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicion.gridy = iYPanelCamposDetalleRequisicion;
	this.gridBagConstraintsDetalleRequisicion.gridx = iXPanelCamposDetalleRequisicion++;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRequisicion.add(this.jPanelcantidadDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(iXPanelCamposDetalleRequisicion % 1==0) {
		iXPanelCamposDetalleRequisicion=0;
		iYPanelCamposDetalleRequisicion++;
	}
	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicion.gridy = iYPanelCamposDetalleRequisicion;
	this.gridBagConstraintsDetalleRequisicion.gridx = iXPanelCamposDetalleRequisicion++;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRequisicion.add(this.jPaneldescripcionDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(iXPanelCamposDetalleRequisicion % 1==0) {
		iXPanelCamposDetalleRequisicion=0;
		iYPanelCamposDetalleRequisicion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicion.gridy = iYPanelCamposOcultosDetalleRequisicion;
	this.gridBagConstraintsDetalleRequisicion.gridx = iXPanelCamposOcultosDetalleRequisicion++;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleRequisicion.add(this.jPanelid_empresaDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(iXPanelCamposOcultosDetalleRequisicion % 1==0) {
		iXPanelCamposOcultosDetalleRequisicion=0;
		iYPanelCamposOcultosDetalleRequisicion++;
	}
	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicion.gridy = iYPanelCamposOcultosDetalleRequisicion;
	this.gridBagConstraintsDetalleRequisicion.gridx = iXPanelCamposOcultosDetalleRequisicion++;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleRequisicion.add(this.jPanelid_sucursalDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(iXPanelCamposOcultosDetalleRequisicion % 1==0) {
		iXPanelCamposOcultosDetalleRequisicion=0;
		iYPanelCamposOcultosDetalleRequisicion++;
	}
	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicion.gridy = iYPanelCamposOcultosDetalleRequisicion;
	this.gridBagConstraintsDetalleRequisicion.gridx = iXPanelCamposOcultosDetalleRequisicion++;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleRequisicion.add(this.jPanelid_ejercicioDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(iXPanelCamposOcultosDetalleRequisicion % 1==0) {
		iXPanelCamposOcultosDetalleRequisicion=0;
		iYPanelCamposOcultosDetalleRequisicion++;
	}
	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicion.gridy = iYPanelCamposOcultosDetalleRequisicion;
	this.gridBagConstraintsDetalleRequisicion.gridx = iXPanelCamposOcultosDetalleRequisicion++;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleRequisicion.add(this.jPanelid_periodoDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(iXPanelCamposOcultosDetalleRequisicion % 1==0) {
		iXPanelCamposOcultosDetalleRequisicion=0;
		iYPanelCamposOcultosDetalleRequisicion++;
	}
	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicion.gridy = iYPanelCamposOcultosDetalleRequisicion;
	this.gridBagConstraintsDetalleRequisicion.gridx = iXPanelCamposOcultosDetalleRequisicion++;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleRequisicion.add(this.jPanelid_anioDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(iXPanelCamposOcultosDetalleRequisicion % 1==0) {
		iXPanelCamposOcultosDetalleRequisicion=0;
		iYPanelCamposOcultosDetalleRequisicion++;
	}
	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicion.gridy = iYPanelCamposOcultosDetalleRequisicion;
	this.gridBagConstraintsDetalleRequisicion.gridx = iXPanelCamposOcultosDetalleRequisicion++;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleRequisicion.add(this.jPanelid_mesDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(iXPanelCamposOcultosDetalleRequisicion % 1==0) {
		iXPanelCamposOcultosDetalleRequisicion=0;
		iYPanelCamposOcultosDetalleRequisicion++;
	}
	this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicion.gridy = iYPanelCamposOcultosDetalleRequisicion;
	this.gridBagConstraintsDetalleRequisicion.gridx = iXPanelCamposOcultosDetalleRequisicion++;
	this.gridBagConstraintsDetalleRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleRequisicion.add(this.jPanelfecha_autorizaDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);



	if(iXPanelCamposOcultosDetalleRequisicion % 1==0) {
		iXPanelCamposOcultosDetalleRequisicion=0;
		iYPanelCamposOcultosDetalleRequisicion++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleRequisicion= new GridBagLayout();
		this.jPanelAccionesDetalleRequisicion.setLayout(gridaBagLayoutAccionesDetalleRequisicion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleRequisicion= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleRequisicion.setLayout(gridaBagLayoutAccionesFormularioDetalleRequisicion);
		
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleRequisicion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleRequisicion.add(this.jComboBoxTiposAccionesFormularioDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleRequisicion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleRequisicion.add(this.jCheckBoxPostAccionNuevoDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detallerequisicionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleRequisicion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleRequisicion.add(this.jCheckBoxPostAccionSinCerrarDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detallerequisicionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleRequisicion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleRequisicion.add(this.jCheckBoxPostAccionSinMensajeDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleRequisicion.add(this.jButtonModificarDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);							

		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;
		this.gridBagConstraintsDetalleRequisicion.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleRequisicion.add(this.jButtonEliminarDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
		
			
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;		
		this.gridBagConstraintsDetalleRequisicion.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleRequisicion.add(this.jButtonActualizarDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);


		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;		
		this.gridBagConstraintsDetalleRequisicion.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleRequisicion.add(this.jButtonGuardarCambiosDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);	
		
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.gridy = 0;		
		this.gridBagConstraintsDetalleRequisicion.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleRequisicion.add(this.jButtonCancelarDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleRequisicion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleRequisicion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();						
			this.gridBagConstraintsDetalleRequisicion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleRequisicion.gridx = 0;		
			//this.gridBagConstraintsDetalleRequisicion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleRequisicion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleRequisicion.gridx =0;
		this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleRequisicion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleRequisicionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleRequisicion = new DetalleRequisicionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Requisicion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Requisicion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Requisicion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleRequisicionModel detallerequisicionModel=new DetalleRequisicionModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleRequisicionModel.DetalleRequisicionFocusTraversalPolicy detallerequisicionFocusTraversalPolicy = detallerequisicionModel.new DetalleRequisicionFocusTraversalPolicy(this);
			
			//detallerequisicionFocusTraversalPolicy.setdetallerequisicionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallerequisicionModel);
			
			
			this.jContentPaneDetalleDetalleRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleRequisicion = new GridBagLayout();	
			this.jContentPaneDetalleDetalleRequisicion.setLayout(gridaBagLayoutDetalleDetalleRequisicion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleRequisicion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
				this.gridBagConstraintsDetalleRequisicion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleRequisicion.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleRequisicion.add(jTtoolBarDetalleDetalleRequisicion, gridBagConstraintsDetalleRequisicion);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleRequisicion=   new JScrollPane(jContentPaneDetalleDetalleRequisicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleRequisicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleRequisicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleRequisicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleRequisicion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleRequisicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleRequisicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleRequisicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleRequisicion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleRequisicion.gridx = 0;
	        
			this.jContentPaneDetalleDetalleRequisicion.add(jPanelCamposDetalleRequisicion, gridBagConstraintsDetalleRequisicion);
			
			
			
			
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
						&& detallerequisicionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallerequisicionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleRequisicion= new GridBagConstraints();
						this.gridBagConstraintsDetalleRequisicion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleRequisicion.gridx = 0;
						this.jContentPaneDetalleDetalleRequisicion.add(this.jTabbedPaneRelacionesDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleRequisicion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleRequisicion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
					this.gridBagConstraintsDetalleRequisicion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleRequisicion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleRequisicion.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleRequisicion.add(jPanelCamposOcultosDetalleRequisicion, gridBagConstraintsDetalleRequisicion);
				
					this.jPanelCamposOcultosDetalleRequisicion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleRequisicion.gridx = 0;
	        this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleRequisicion.add(this.jPanelAccionesFormularioDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);							
			
			
			
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
	        this.gridBagConstraintsDetalleRequisicion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleRequisicion.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleRequisicion.add(this.jPanelAccionesDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleRequisicion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleRequisicion=   new JScrollPane(this.jPanelCamposDetalleRequisicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleRequisicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleRequisicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleRequisicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleRequisicion.gridx = 0;
			this.gridBagConstraintsDetalleRequisicion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleRequisicion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleRequisicion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleRequisicion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);			
			
			this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleRequisicion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRequisicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
			
			
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRequisicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
		
			
		this.gridBagConstraintsDetalleRequisicion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRequisicion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleRequisicion, this.gridBagConstraintsDetalleRequisicion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleRequisicion;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleRequisicion;
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
