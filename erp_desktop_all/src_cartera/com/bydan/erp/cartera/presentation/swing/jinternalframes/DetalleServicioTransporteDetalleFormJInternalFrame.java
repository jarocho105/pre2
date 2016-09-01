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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.DetalleServicioTransporteConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class DetalleServicioTransporteDetalleFormJInternalFrame extends DetalleServicioTransporteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleServicioTransporte;
	
	protected JMenuBar jmenuBarDetalleDetalleServicioTransporte;
	
	protected JMenu jmenuDetalleDetalleServicioTransporte;
	protected JMenu jmenuDetalleArchivoDetalleServicioTransporte;
	protected JMenu jmenuDetalleAccionesDetalleServicioTransporte;
	protected JMenu jmenuDetalleDatosDetalleServicioTransporte;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleServicioTransporte;	
	protected GridBagConstraints gridBagConstraintsDetalleServicioTransporte;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleServicioTransporteBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleServicioTransporte;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ServicioTransporteBeanSwingJInternalFrame serviciotransporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_serviciotransporte="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";
	
	public DetalleServicioTransporteSessionBean detalleserviciotransporteSessionBean;
	
	
	
	
	public ServicioTransporteSessionBean serviciotransporteSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;	
	
	public DetalleServicioTransporteLogic detalleserviciotransporteLogic;
	
	public JScrollPane jScrollPanelDatosDetalleServicioTransporte;
	public JScrollPane jScrollPanelDatosEdicionDetalleServicioTransporte;
	public JScrollPane jScrollPanelDatosGeneralDetalleServicioTransporte;
	
	protected JPanel jPanelCamposDetalleServicioTransporte;    
	protected JPanel jPanelCamposOcultosDetalleServicioTransporte;    	
	protected JPanel jPanelAccionesDetalleServicioTransporte;
	protected JPanel jPanelAccionesFormularioDetalleServicioTransporte;
    
	
	
	protected Integer iXPanelCamposDetalleServicioTransporte=0;
	protected Integer iYPanelCamposDetalleServicioTransporte=0;
	
	protected Integer iXPanelCamposOcultosDetalleServicioTransporte=0;
	protected Integer iYPanelCamposOcultosDetalleServicioTransporte=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleServicioTransporte;
	public JButton jButtonModificarDetalleServicioTransporte;
	public JButton jButtonActualizarDetalleServicioTransporte;
    public JButton jButtonEliminarDetalleServicioTransporte;
	public JButton jButtonCancelarDetalleServicioTransporte;
    public JButton jButtonGuardarCambiosDetalleServicioTransporte;
	public JButton jButtonGuardarCambiosTablaDetalleServicioTransporte;
	protected JButton jButtonCerrarDetalleServicioTransporte;
	
	
	protected JButton jButtonProcesarInformacionDetalleServicioTransporte;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleServicioTransporte;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleServicioTransporte;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleServicioTransporte;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleServicioTransporte;
	protected JButton jButtonModificarToolBarDetalleServicioTransporte;
	protected JButton jButtonActualizarToolBarDetalleServicioTransporte;
    protected JButton jButtonEliminarToolBarDetalleServicioTransporte;
	protected JButton jButtonCancelarToolBarDetalleServicioTransporte;
    protected JButton jButtonGuardarCambiosToolBarDetalleServicioTransporte;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleServicioTransporte;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleServicioTransporte;
	protected JButton jButtonCerrarToolBarDetalleServicioTransporte;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleServicioTransporte;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleServicioTransporte;
	protected JMenuItem jMenuItemModificarDetalleServicioTransporte;
	protected JMenuItem jMenuItemActualizarDetalleServicioTransporte;
    protected JMenuItem jMenuItemEliminarDetalleServicioTransporte;
	protected JMenuItem jMenuItemCancelarDetalleServicioTransporte;
    protected JMenuItem jMenuItemGuardarCambiosDetalleServicioTransporte;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleServicioTransporte;
	protected JMenuItem jMenuItemCerrarDetalleServicioTransporte;
	protected JMenuItem jMenuItemDetalleCerrarDetalleServicioTransporte;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleServicioTransporte;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleServicioTransporte;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleServicioTransporte;
	protected JMenuItem jMenuItemMostrarOcultarDetalleServicioTransporte;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleServicioTransporte;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleServicioTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleServicioTransporte;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleServicioTransporte;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleServicioTransporte;
	public JLabel jLabelIdDetalleServicioTransporte;
	public JLabel jLabelidDetalleServicioTransporte;
	public JButton jButtonidDetalleServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelcantidadDetalleServicioTransporte;
	public JLabel jLabelcantidadDetalleServicioTransporte;
	public JTextField jTextFieldcantidadDetalleServicioTransporte;
	public JButton jButtoncantidadDetalleServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelprecioDetalleServicioTransporte;
	public JLabel jLabelprecioDetalleServicioTransporte;
	public JTextField jTextFieldprecioDetalleServicioTransporte;
	public JButton jButtonprecioDetalleServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPaneltotalDetalleServicioTransporte;
	public JLabel jLabeltotalDetalleServicioTransporte;
	public JTextField jTextFieldtotalDetalleServicioTransporte;
	public JButton jButtontotalDetalleServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetalleServicioTransporte;
	public JLabel jLabeldescripcionDetalleServicioTransporte;
	public JTextArea jTextAreadescripcionDetalleServicioTransporte;
	public JScrollPane jscrollPanedescripcionDetalleServicioTransporte;
	public JButton jButtondescripcionDetalleServicioTransporteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_servicio_transporteDetalleServicioTransporte;
	public JLabel jLabelid_servicio_transporteDetalleServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_servicio_transporteDetalleServicioTransporte;
	public JButton jButtonid_servicio_transporteDetalleServicioTransporte= new JButtonMe();
	public JButton jButtonid_servicio_transporteDetalleServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_servicio_transporteDetalleServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaDetalleServicioTransporte;
	public JLabel jLabelid_empresaDetalleServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleServicioTransporte;
	public JButton jButtonid_empresaDetalleServicioTransporte= new JButtonMe();
	public JButton jButtonid_empresaDetalleServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleServicioTransporte;
	public JLabel jLabelid_sucursalDetalleServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleServicioTransporte;
	public JButton jButtonid_sucursalDetalleServicioTransporte= new JButtonMe();
	public JButton jButtonid_sucursalDetalleServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetalleServicioTransporte;
	public JLabel jLabelid_ejercicioDetalleServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetalleServicioTransporte;
	public JButton jButtonid_ejercicioDetalleServicioTransporte= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetalleServicioTransporte;
	public JLabel jLabelid_periodoDetalleServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetalleServicioTransporte;
	public JButton jButtonid_periodoDetalleServicioTransporte= new JButtonMe();
	public JButton jButtonid_periodoDetalleServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetalleServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDetalleServicioTransporte;
	public JLabel jLabelid_bodegaDetalleServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDetalleServicioTransporte;
	public JButton jButtonid_bodegaDetalleServicioTransporte= new JButtonMe();
	public JButton jButtonid_bodegaDetalleServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDetalleServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetalleServicioTransporte;
	public JLabel jLabelid_productoDetalleServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetalleServicioTransporte;
	public JButton jButtonid_productoDetalleServicioTransporte= new JButtonMe();
	public JButton jButtonid_productoDetalleServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_productoDetalleServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetalleServicioTransporte;
	public JLabel jLabelid_unidadDetalleServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetalleServicioTransporte;
	public JButton jButtonid_unidadDetalleServicioTransporte= new JButtonMe();
	public JButton jButtonid_unidadDetalleServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetalleServicioTransporteBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoDetalleServicioTransporte;
	public JLabel jLabelid_centro_costoDetalleServicioTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoDetalleServicioTransporte;
	public JButton jButtonid_centro_costoDetalleServicioTransporte= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleServicioTransporteUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleServicioTransporteBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleServicioTransporteArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleServicioTransporte;
	
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
		
	public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleServicioTransporteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleServicioTransporte=new JPanel();
				this.jPanelAccionesFormularioDetalleServicioTransporte=new JPanel();
				this.jmenuBarDetalleDetalleServicioTransporte=new JMenuBar();
				this.jTtoolBarDetalleDetalleServicioTransporte=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleServicioTransporteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleServicioTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleServicioTransporteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleServicioTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleServicioTransporteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleServicioTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleServicioTransporteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleServicioTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleServicioTransporteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleServicioTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleServicioTransporte() {
		return this.jButtonActualizarToolBarDetalleServicioTransporte;
	}
	
	public JButton getjButtonEliminarToolBarDetalleServicioTransporte() {
		return this.jButtonEliminarToolBarDetalleServicioTransporte;
	}
	
	public JButton getjButtonCancelarToolBarDetalleServicioTransporte() {
		return this.jButtonCancelarToolBarDetalleServicioTransporte;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleServicioTransporte() {
		return this.jButtonProcesarInformacionDetalleServicioTransporte;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleServicioTransporte)	{
		this.jButtonProcesarInformacionDetalleServicioTransporte = jButtonProcesarInformacionDetalleServicioTransporte;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleServicioTransporte() {
		return this.jComboBoxTiposAccionesDetalleServicioTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleServicioTransporte(
			JComboBox jComboBoxTiposRelacionesDetalleServicioTransporte) {
		this.jComboBoxTiposRelacionesDetalleServicioTransporte = jComboBoxTiposRelacionesDetalleServicioTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleServicioTransporte(
			JComboBox jComboBoxTiposAccionesDetalleServicioTransporte) {
		this.jComboBoxTiposAccionesDetalleServicioTransporte = jComboBoxTiposAccionesDetalleServicioTransporte;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleServicioTransporte() {
		return this.jComboBoxTiposAccionesFormularioDetalleServicioTransporte;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleServicioTransporte(
			JComboBox jComboBoxTiposAccionesFormularioDetalleServicioTransporte) {
		this.jComboBoxTiposAccionesFormularioDetalleServicioTransporte = jComboBoxTiposAccionesFormularioDetalleServicioTransporte;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalleserviciotransporteSessionBean=new DetalleServicioTransporteSessionBean();
		
		this.detalleserviciotransporteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleserviciotransporteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleServicioTransporteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleServicioTransporteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleServicioTransporteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Servicio Transporte MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleServicioTransporteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleServicioTransporte= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleServicioTransporte=new JButtonMe();
				this.jButtonModificarToolBarDetalleServicioTransporte=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleServicioTransporte,this.jTtoolBarDetalleDetalleServicioTransporte,
							"actualizar","actualizar","Actualizar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleServicioTransporte,this.jTtoolBarDetalleDetalleServicioTransporte,
							"eliminar","eliminar","Eliminar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleServicioTransporte,this.jTtoolBarDetalleDetalleServicioTransporte,
							"cancelar","cancelar","Cancelar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleServicioTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleServicioTransporte,this.jTtoolBarDetalleDetalleServicioTransporte,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleServicioTransporte=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleServicioTransporte=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleServicioTransporte=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleServicioTransporte=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleServicioTransporte=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleServicioTransporte= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleServicioTransporte.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleServicioTransporte,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleServicioTransporte= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleServicioTransporte.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleServicioTransporte,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleServicioTransporte= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleServicioTransporte.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleServicioTransporte,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleServicioTransporte= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleServicioTransporte.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleServicioTransporte,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleServicioTransporte= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleServicioTransporte.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleServicioTransporte,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleServicioTransporte= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleServicioTransporte.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleServicioTransporte,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleServicioTransporte= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleServicioTransporte.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleServicioTransporte,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleServicioTransporte= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleServicioTransporte.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleServicioTransporte,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleServicioTransporte= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleServicioTransporte.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleServicioTransporte,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleServicioTransporte= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleServicioTransporte.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleServicioTransporte,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleServicioTransporte.add(this.jMenuItemDetalleCerrarDetalleServicioTransporte);
		
		this.jmenuDetalleAccionesDetalleServicioTransporte.add(this.jMenuItemActualizarDetalleServicioTransporte);
		this.jmenuDetalleAccionesDetalleServicioTransporte.add(this.jMenuItemEliminarDetalleServicioTransporte);
		this.jmenuDetalleAccionesDetalleServicioTransporte.add(this.jMenuItemCancelarDetalleServicioTransporte);		
		
		//this.jmenuDetalleDatosDetalleServicioTransporte.add(this.jMenuItemDetalleAbrirOrderByDetalleServicioTransporte);				
		this.jmenuDetalleDatosDetalleServicioTransporte.add(this.jMenuItemDetalleMostarOcultarDetalleServicioTransporte);				
				
		//this.jmenuDetalleAccionesDetalleServicioTransporte.add(this.jMenuItemGuardarCambiosDetalleServicioTransporte);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleServicioTransporte.add(this.jmenuDetalleArchivoDetalleServicioTransporte);		
		this.jmenuBarDetalleDetalleServicioTransporte.add(this.jmenuDetalleAccionesDetalleServicioTransporte);		
		this.jmenuBarDetalleDetalleServicioTransporte.add(this.jmenuDetalleDatosDetalleServicioTransporte);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleServicioTransporte);				
	}
	
	
	public void inicializarElementosCamposDetalleServicioTransporte() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleServicioTransporte = new JLabelMe();
		jLabelIdDetalleServicioTransporte.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleServicioTransporte = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleServicioTransporte.setToolTipText(DetalleServicioTransporteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleServicioTransporte= new GridBagLayout();

		this.jPanelidDetalleServicioTransporte.setLayout(this.gridaBagLayoutDetalleServicioTransporte);

		jLabelidDetalleServicioTransporte = new JLabel();
		jLabelidDetalleServicioTransporte.setText("Id");

		jLabelidDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidadDetalleServicioTransporte = new JLabelMe();
		this.jLabelcantidadDetalleServicioTransporte.setText(""+DetalleServicioTransporteConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadDetalleServicioTransporte.setToolTipText("Cantad");
		this.jLabelcantidadDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadDetalleServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadDetalleServicioTransporte.setToolTipText(DetalleServicioTransporteConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutDetalleServicioTransporte = new GridBagLayout();
		this.jPanelcantidadDetalleServicioTransporte.setLayout(this.gridaBagLayoutDetalleServicioTransporte);


		jTextFieldcantidadDetalleServicioTransporte= new JTextFieldMe();
		jTextFieldcantidadDetalleServicioTransporte.setEnabled(false);
		jTextFieldcantidadDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadDetalleServicioTransporte.setText("0");

		this.jButtoncantidadDetalleServicioTransporteBusqueda= new JButtonMe();
		this.jButtoncantidadDetalleServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadDetalleServicioTransporteBusqueda.setText("U");
		this.jButtoncantidadDetalleServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadDetalleServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadDetalleServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadDetalleServicioTransporteBusqueda"));

		if(this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadDetalleServicioTransporteBusqueda.setVisible(false);		}


					
		this.jLabelprecioDetalleServicioTransporte = new JLabelMe();
		this.jLabelprecioDetalleServicioTransporte.setText(""+DetalleServicioTransporteConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioDetalleServicioTransporte.setToolTipText("Precio");
		this.jLabelprecioDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioDetalleServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioDetalleServicioTransporte.setToolTipText(DetalleServicioTransporteConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutDetalleServicioTransporte = new GridBagLayout();
		this.jPanelprecioDetalleServicioTransporte.setLayout(this.gridaBagLayoutDetalleServicioTransporte);


		jTextFieldprecioDetalleServicioTransporte= new JTextFieldMe();
		jTextFieldprecioDetalleServicioTransporte.setEnabled(false);
		jTextFieldprecioDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioDetalleServicioTransporte.setText("0.0");

		this.jButtonprecioDetalleServicioTransporteBusqueda= new JButtonMe();
		this.jButtonprecioDetalleServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetalleServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetalleServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioDetalleServicioTransporteBusqueda.setText("U");
		this.jButtonprecioDetalleServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioDetalleServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioDetalleServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioDetalleServicioTransporteBusqueda"));

		if(this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioDetalleServicioTransporteBusqueda.setVisible(false);		}


					
		this.jLabeltotalDetalleServicioTransporte = new JLabelMe();
		this.jLabeltotalDetalleServicioTransporte.setText(""+DetalleServicioTransporteConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalDetalleServicioTransporte.setToolTipText("Total");
		this.jLabeltotalDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalDetalleServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalDetalleServicioTransporte.setToolTipText(DetalleServicioTransporteConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutDetalleServicioTransporte = new GridBagLayout();
		this.jPaneltotalDetalleServicioTransporte.setLayout(this.gridaBagLayoutDetalleServicioTransporte);


		jTextFieldtotalDetalleServicioTransporte= new JTextFieldMe();
		jTextFieldtotalDetalleServicioTransporte.setEnabled(false);
		jTextFieldtotalDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalDetalleServicioTransporte.setText("0.0");

		this.jButtontotalDetalleServicioTransporteBusqueda= new JButtonMe();
		this.jButtontotalDetalleServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetalleServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetalleServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalDetalleServicioTransporteBusqueda.setText("U");
		this.jButtontotalDetalleServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalDetalleServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalDetalleServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalDetalleServicioTransporteBusqueda"));

		if(this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalDetalleServicioTransporteBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDetalleServicioTransporte = new JLabelMe();
		this.jLabeldescripcionDetalleServicioTransporte.setText(""+DetalleServicioTransporteConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionDetalleServicioTransporte.setToolTipText("Descripcion");
		this.jLabeldescripcionDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetalleServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetalleServicioTransporte.setToolTipText(DetalleServicioTransporteConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetalleServicioTransporte = new GridBagLayout();
		this.jPaneldescripcionDetalleServicioTransporte.setLayout(this.gridaBagLayoutDetalleServicioTransporte);


		jTextAreadescripcionDetalleServicioTransporte= new JTextAreaMe();
		jTextAreadescripcionDetalleServicioTransporte.setEnabled(false);
		jTextAreadescripcionDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleServicioTransporte.setLineWrap(true);
		jTextAreadescripcionDetalleServicioTransporte.setWrapStyleWord(true);
		jTextAreadescripcionDetalleServicioTransporte.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetalleServicioTransporte.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetalleServicioTransporte = new JScrollPane(jTextAreadescripcionDetalleServicioTransporte);
		jscrollPanedescripcionDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionDetalleServicioTransporteBusqueda= new JButtonMe();
		this.jButtondescripcionDetalleServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetalleServicioTransporteBusqueda.setText("U");
		this.jButtondescripcionDetalleServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetalleServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetalleServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetalleServicioTransporteBusqueda"));

		if(this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetalleServicioTransporteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleServicioTransporte() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_servicio_transporteDetalleServicioTransporte = new JLabelMe();
		this.jLabelid_servicio_transporteDetalleServicioTransporte.setText(""+DetalleServicioTransporteConstantesFunciones.LABEL_IDSERVICIOTRANSPORTE+" : *");
		this.jLabelid_servicio_transporteDetalleServicioTransporte.setToolTipText("Servicio Transporte");
		this.jLabelid_servicio_transporteDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_servicio_transporteDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_servicio_transporteDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_servicio_transporteDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_servicio_transporteDetalleServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_servicio_transporteDetalleServicioTransporte.setToolTipText(DetalleServicioTransporteConstantesFunciones.LABEL_IDSERVICIOTRANSPORTE);
		this.gridaBagLayoutDetalleServicioTransporte = new GridBagLayout();
		this.jPanelid_servicio_transporteDetalleServicioTransporte.setLayout(this.gridaBagLayoutDetalleServicioTransporte);


		jComboBoxid_servicio_transporteDetalleServicioTransporte= new JComboBoxMe();
		jComboBoxid_servicio_transporteDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_servicio_transporteDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_servicio_transporteDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_servicio_transporteDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_servicio_transporteDetalleServicioTransporte= new JButtonMe();
		this.jButtonid_servicio_transporteDetalleServicioTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_servicio_transporteDetalleServicioTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_servicio_transporteDetalleServicioTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_servicio_transporteDetalleServicioTransporte.setText("Buscar");
		this.jButtonid_servicio_transporteDetalleServicioTransporte.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_servicio_transporteDetalleServicioTransporte.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_servicio_transporteDetalleServicioTransporte,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_servicio_transporteDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_servicio_transporteDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_servicio_transporteDetalleServicioTransporte"));

		this.jButtonid_servicio_transporteDetalleServicioTransporteBusqueda= new JButtonMe();
		this.jButtonid_servicio_transporteDetalleServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_servicio_transporteDetalleServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_servicio_transporteDetalleServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_servicio_transporteDetalleServicioTransporteBusqueda.setText("U");
		this.jButtonid_servicio_transporteDetalleServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_servicio_transporteDetalleServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_servicio_transporteDetalleServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_servicio_transporteDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_servicio_transporteDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_servicio_transporteDetalleServicioTransporteBusqueda"));

		if(this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_servicio_transporteDetalleServicioTransporteBusqueda.setVisible(false);		}

		this.jButtonid_servicio_transporteDetalleServicioTransporteUpdate= new JButtonMe();
		this.jButtonid_servicio_transporteDetalleServicioTransporteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_servicio_transporteDetalleServicioTransporteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_servicio_transporteDetalleServicioTransporteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_servicio_transporteDetalleServicioTransporteUpdate.setText("U");
		this.jButtonid_servicio_transporteDetalleServicioTransporteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_servicio_transporteDetalleServicioTransporteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_servicio_transporteDetalleServicioTransporteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_servicio_transporteDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_servicio_transporteDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_servicio_transporteDetalleServicioTransporteUpdate"));



					
		this.jLabelid_empresaDetalleServicioTransporte = new JLabelMe();
		this.jLabelid_empresaDetalleServicioTransporte.setText(""+DetalleServicioTransporteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleServicioTransporte.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleServicioTransporte.setToolTipText(DetalleServicioTransporteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleServicioTransporte = new GridBagLayout();
		this.jPanelid_empresaDetalleServicioTransporte.setLayout(this.gridaBagLayoutDetalleServicioTransporte);


		jComboBoxid_empresaDetalleServicioTransporte= new JComboBoxMe();
		jComboBoxid_empresaDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleServicioTransporte.setEnabled(false);

		this.jButtonid_empresaDetalleServicioTransporte= new JButtonMe();
		this.jButtonid_empresaDetalleServicioTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleServicioTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleServicioTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleServicioTransporte.setText("Buscar");
		this.jButtonid_empresaDetalleServicioTransporte.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleServicioTransporte.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleServicioTransporte,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleServicioTransporte"));

		this.jButtonid_empresaDetalleServicioTransporteBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleServicioTransporteBusqueda.setText("U");
		this.jButtonid_empresaDetalleServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleServicioTransporteBusqueda"));

		if(this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleServicioTransporteBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleServicioTransporteUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleServicioTransporteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleServicioTransporteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleServicioTransporteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleServicioTransporteUpdate.setText("U");
		this.jButtonid_empresaDetalleServicioTransporteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleServicioTransporteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleServicioTransporteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleServicioTransporteUpdate"));



					
		this.jLabelid_sucursalDetalleServicioTransporte = new JLabelMe();
		this.jLabelid_sucursalDetalleServicioTransporte.setText(""+DetalleServicioTransporteConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleServicioTransporte.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleServicioTransporte.setToolTipText(DetalleServicioTransporteConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleServicioTransporte = new GridBagLayout();
		this.jPanelid_sucursalDetalleServicioTransporte.setLayout(this.gridaBagLayoutDetalleServicioTransporte);


		jComboBoxid_sucursalDetalleServicioTransporte= new JComboBoxMe();
		jComboBoxid_sucursalDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleServicioTransporte.setEnabled(false);

		this.jButtonid_sucursalDetalleServicioTransporte= new JButtonMe();
		this.jButtonid_sucursalDetalleServicioTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleServicioTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleServicioTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleServicioTransporte.setText("Buscar");
		this.jButtonid_sucursalDetalleServicioTransporte.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleServicioTransporte.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleServicioTransporte,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleServicioTransporte"));

		this.jButtonid_sucursalDetalleServicioTransporteBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleServicioTransporteBusqueda.setText("U");
		this.jButtonid_sucursalDetalleServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleServicioTransporteBusqueda"));

		if(this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleServicioTransporteBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleServicioTransporteUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleServicioTransporteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleServicioTransporteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleServicioTransporteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleServicioTransporteUpdate.setText("U");
		this.jButtonid_sucursalDetalleServicioTransporteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleServicioTransporteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleServicioTransporteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleServicioTransporteUpdate"));



					
		this.jLabelid_ejercicioDetalleServicioTransporte = new JLabelMe();
		this.jLabelid_ejercicioDetalleServicioTransporte.setText(""+DetalleServicioTransporteConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetalleServicioTransporte.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetalleServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetalleServicioTransporte.setToolTipText(DetalleServicioTransporteConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetalleServicioTransporte = new GridBagLayout();
		this.jPanelid_ejercicioDetalleServicioTransporte.setLayout(this.gridaBagLayoutDetalleServicioTransporte);


		jComboBoxid_ejercicioDetalleServicioTransporte= new JComboBoxMe();
		jComboBoxid_ejercicioDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetalleServicioTransporte.setEnabled(false);

		this.jButtonid_ejercicioDetalleServicioTransporte= new JButtonMe();
		this.jButtonid_ejercicioDetalleServicioTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleServicioTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleServicioTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleServicioTransporte.setText("Buscar");
		this.jButtonid_ejercicioDetalleServicioTransporte.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetalleServicioTransporte.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleServicioTransporte,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleServicioTransporte"));

		this.jButtonid_ejercicioDetalleServicioTransporteBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetalleServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleServicioTransporteBusqueda.setText("U");
		this.jButtonid_ejercicioDetalleServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetalleServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleServicioTransporteBusqueda"));

		if(this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetalleServicioTransporteBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetalleServicioTransporteUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetalleServicioTransporteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleServicioTransporteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleServicioTransporteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleServicioTransporteUpdate.setText("U");
		this.jButtonid_ejercicioDetalleServicioTransporteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetalleServicioTransporteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleServicioTransporteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleServicioTransporteUpdate"));



					
		this.jLabelid_periodoDetalleServicioTransporte = new JLabelMe();
		this.jLabelid_periodoDetalleServicioTransporte.setText(""+DetalleServicioTransporteConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetalleServicioTransporte.setToolTipText("Periodo");
		this.jLabelid_periodoDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetalleServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetalleServicioTransporte.setToolTipText(DetalleServicioTransporteConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetalleServicioTransporte = new GridBagLayout();
		this.jPanelid_periodoDetalleServicioTransporte.setLayout(this.gridaBagLayoutDetalleServicioTransporte);


		jComboBoxid_periodoDetalleServicioTransporte= new JComboBoxMe();
		jComboBoxid_periodoDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetalleServicioTransporte.setEnabled(false);

		this.jButtonid_periodoDetalleServicioTransporte= new JButtonMe();
		this.jButtonid_periodoDetalleServicioTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleServicioTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleServicioTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleServicioTransporte.setText("Buscar");
		this.jButtonid_periodoDetalleServicioTransporte.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetalleServicioTransporte.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleServicioTransporte,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleServicioTransporte"));

		this.jButtonid_periodoDetalleServicioTransporteBusqueda= new JButtonMe();
		this.jButtonid_periodoDetalleServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleServicioTransporteBusqueda.setText("U");
		this.jButtonid_periodoDetalleServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetalleServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleServicioTransporteBusqueda"));

		if(this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetalleServicioTransporteBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetalleServicioTransporteUpdate= new JButtonMe();
		this.jButtonid_periodoDetalleServicioTransporteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleServicioTransporteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleServicioTransporteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleServicioTransporteUpdate.setText("U");
		this.jButtonid_periodoDetalleServicioTransporteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetalleServicioTransporteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleServicioTransporteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleServicioTransporteUpdate"));



					
		this.jLabelid_bodegaDetalleServicioTransporte = new JLabelMe();
		this.jLabelid_bodegaDetalleServicioTransporte.setText(""+DetalleServicioTransporteConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDetalleServicioTransporte.setToolTipText("Bodega");
		this.jLabelid_bodegaDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDetalleServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDetalleServicioTransporte.setToolTipText(DetalleServicioTransporteConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDetalleServicioTransporte = new GridBagLayout();
		this.jPanelid_bodegaDetalleServicioTransporte.setLayout(this.gridaBagLayoutDetalleServicioTransporte);


		jComboBoxid_bodegaDetalleServicioTransporte= new JComboBoxMe();
		jComboBoxid_bodegaDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDetalleServicioTransporte= new JButtonMe();
		this.jButtonid_bodegaDetalleServicioTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleServicioTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleServicioTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleServicioTransporte.setText("Buscar");
		this.jButtonid_bodegaDetalleServicioTransporte.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDetalleServicioTransporte.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleServicioTransporte,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleServicioTransporte"));

		this.jButtonid_bodegaDetalleServicioTransporteBusqueda= new JButtonMe();
		this.jButtonid_bodegaDetalleServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleServicioTransporteBusqueda.setText("U");
		this.jButtonid_bodegaDetalleServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDetalleServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleServicioTransporteBusqueda"));

		if(this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDetalleServicioTransporteBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDetalleServicioTransporteUpdate= new JButtonMe();
		this.jButtonid_bodegaDetalleServicioTransporteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleServicioTransporteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleServicioTransporteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleServicioTransporteUpdate.setText("U");
		this.jButtonid_bodegaDetalleServicioTransporteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDetalleServicioTransporteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleServicioTransporteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleServicioTransporteUpdate"));



					
		this.jLabelid_productoDetalleServicioTransporte = new JLabelMe();
		this.jLabelid_productoDetalleServicioTransporte.setText(""+DetalleServicioTransporteConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetalleServicioTransporte.setToolTipText("Producto");
		this.jLabelid_productoDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetalleServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetalleServicioTransporte.setToolTipText(DetalleServicioTransporteConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetalleServicioTransporte = new GridBagLayout();
		this.jPanelid_productoDetalleServicioTransporte.setLayout(this.gridaBagLayoutDetalleServicioTransporte);


		jComboBoxid_productoDetalleServicioTransporte= new JComboBoxMe();
		jComboBoxid_productoDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetalleServicioTransporte= new JButtonMe();
		this.jButtonid_productoDetalleServicioTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleServicioTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleServicioTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleServicioTransporte.setText("Buscar");
		this.jButtonid_productoDetalleServicioTransporte.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetalleServicioTransporte.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleServicioTransporte,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleServicioTransporte"));

		this.jButtonid_productoDetalleServicioTransporteBusqueda= new JButtonMe();
		this.jButtonid_productoDetalleServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleServicioTransporteBusqueda.setText("U");
		this.jButtonid_productoDetalleServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetalleServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleServicioTransporteBusqueda"));

		if(this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetalleServicioTransporteBusqueda.setVisible(false);		}

		this.jButtonid_productoDetalleServicioTransporteUpdate= new JButtonMe();
		this.jButtonid_productoDetalleServicioTransporteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleServicioTransporteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleServicioTransporteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleServicioTransporteUpdate.setText("U");
		this.jButtonid_productoDetalleServicioTransporteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetalleServicioTransporteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleServicioTransporteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleServicioTransporteUpdate"));



					
		this.jLabelid_unidadDetalleServicioTransporte = new JLabelMe();
		this.jLabelid_unidadDetalleServicioTransporte.setText(""+DetalleServicioTransporteConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetalleServicioTransporte.setToolTipText("Unad");
		this.jLabelid_unidadDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetalleServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetalleServicioTransporte.setToolTipText(DetalleServicioTransporteConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetalleServicioTransporte = new GridBagLayout();
		this.jPanelid_unidadDetalleServicioTransporte.setLayout(this.gridaBagLayoutDetalleServicioTransporte);


		jComboBoxid_unidadDetalleServicioTransporte= new JComboBoxMe();
		jComboBoxid_unidadDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetalleServicioTransporte= new JButtonMe();
		this.jButtonid_unidadDetalleServicioTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleServicioTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleServicioTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleServicioTransporte.setText("Buscar");
		this.jButtonid_unidadDetalleServicioTransporte.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetalleServicioTransporte.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleServicioTransporte,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleServicioTransporte"));

		this.jButtonid_unidadDetalleServicioTransporteBusqueda= new JButtonMe();
		this.jButtonid_unidadDetalleServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleServicioTransporteBusqueda.setText("U");
		this.jButtonid_unidadDetalleServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetalleServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleServicioTransporteBusqueda"));

		if(this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetalleServicioTransporteBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetalleServicioTransporteUpdate= new JButtonMe();
		this.jButtonid_unidadDetalleServicioTransporteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleServicioTransporteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleServicioTransporteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleServicioTransporteUpdate.setText("U");
		this.jButtonid_unidadDetalleServicioTransporteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetalleServicioTransporteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleServicioTransporteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleServicioTransporteUpdate"));



					
		this.jLabelid_centro_costoDetalleServicioTransporte = new JLabelMe();
		this.jLabelid_centro_costoDetalleServicioTransporte.setText(""+DetalleServicioTransporteConstantesFunciones.LABEL_IDCENTROCOSTO+" : *");
		this.jLabelid_centro_costoDetalleServicioTransporte.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoDetalleServicioTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoDetalleServicioTransporte.setToolTipText(DetalleServicioTransporteConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutDetalleServicioTransporte = new GridBagLayout();
		this.jPanelid_centro_costoDetalleServicioTransporte.setLayout(this.gridaBagLayoutDetalleServicioTransporte);


		jComboBoxid_centro_costoDetalleServicioTransporte= new JComboBoxMe();
		jComboBoxid_centro_costoDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoDetalleServicioTransporte= new JButtonMe();
		this.jButtonid_centro_costoDetalleServicioTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleServicioTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleServicioTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleServicioTransporte.setText("Buscar");
		this.jButtonid_centro_costoDetalleServicioTransporte.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoDetalleServicioTransporte.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleServicioTransporte,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleServicioTransporte"));

		this.jButtonid_centro_costoDetalleServicioTransporteBusqueda= new JButtonMe();
		this.jButtonid_centro_costoDetalleServicioTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleServicioTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleServicioTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetalleServicioTransporteBusqueda.setText("U");
		this.jButtonid_centro_costoDetalleServicioTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoDetalleServicioTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleServicioTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleServicioTransporteBusqueda"));

		if(this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoDetalleServicioTransporteBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoDetalleServicioTransporteUpdate= new JButtonMe();
		this.jButtonid_centro_costoDetalleServicioTransporteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleServicioTransporteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleServicioTransporteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetalleServicioTransporteUpdate.setText("U");
		this.jButtonid_centro_costoDetalleServicioTransporteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoDetalleServicioTransporteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleServicioTransporteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleServicioTransporteUpdate"));


		jButtonid_centro_costoDetalleServicioTransporteArbol= new JButtonMe();
		jButtonid_centro_costoDetalleServicioTransporteArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleServicioTransporteArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleServicioTransporteArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleServicioTransporteArbol.setText("Arbol");
		jButtonid_centro_costoDetalleServicioTransporteArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoDetalleServicioTransporteArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleServicioTransporteArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleServicioTransporteArbol"));



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
		//this.jInternalFrameDetalleDetalleServicioTransporte = new DetalleServicioTransporteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Servicio Transporte DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleServicioTransporte= new GridBagLayout();
		

		
		String sToolTipDetalleServicioTransporte="";
		sToolTipDetalleServicioTransporte=DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleServicioTransporte+="(Cartera.DetalleServicioTransporte)";
		}
		
		if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleServicioTransporte+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleServicioTransporte = new JButtonMe();
		this.jButtonModificarDetalleServicioTransporte = new JButtonMe();
        this.jButtonActualizarDetalleServicioTransporte = new JButtonMe();
        this.jButtonEliminarDetalleServicioTransporte = new JButtonMe();
        this.jButtonCancelarDetalleServicioTransporte = new JButtonMe();
        this.jButtonGuardarCambiosDetalleServicioTransporte = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleServicioTransporte = new JButtonMe();
		this.jButtonCerrarDetalleServicioTransporte = new JButtonMe();
		
		this.jScrollPanelDatosDetalleServicioTransporte = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleServicioTransporte = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleServicioTransporte = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Servicio Transporte";
		
		if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Servicio Transportes" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleServicioTransporte.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleServicioTransporte.setName("jPanelCamposDetalleServicioTransporte"); 

		this.jPanelCamposOcultosDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleServicioTransporte.setName("jPanelCamposOcultosDetalleServicioTransporte"); 

        this.jPanelAccionesDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleServicioTransporte.setToolTipText("Acciones");
        this.jPanelAccionesDetalleServicioTransporte.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleServicioTransporte.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleServicioTransporte.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleServicioTransporte.setText("Nuevo");
		this.jButtonModificarDetalleServicioTransporte.setText("Editar");
        this.jButtonActualizarDetalleServicioTransporte.setText("Actualizar");
        this.jButtonEliminarDetalleServicioTransporte.setText("Eliminar");
        this.jButtonCancelarDetalleServicioTransporte.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleServicioTransporte.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleServicioTransporte.setText("Guardar");
		this.jButtonCerrarDetalleServicioTransporte.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleServicioTransporte,"nuevo_button","Nuevo",this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleServicioTransporte,"modificar_button","Editar",this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleServicioTransporte,"actualizar_button","Actualizar",this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleServicioTransporte,"eliminar_button","Eliminar",this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleServicioTransporte,"cancelar_button","Cancelar",this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleServicioTransporte,"guardarcambios_button","Guardar",this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleServicioTransporte,"guardarcambiostabla_button","Guardar",this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleServicioTransporte,"cerrar_button","Salir",this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleServicioTransporte.setToolTipText("Nuevo"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleServicioTransporte.setToolTipText("Editar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleServicioTransporte.setToolTipText("Actualizar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleServicioTransporte.setToolTipText("Eliminar)"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleServicioTransporte.setToolTipText("Cancelar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleServicioTransporte.setToolTipText("Guardar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleServicioTransporte.setToolTipText("Guardar"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleServicioTransporte.setToolTipText("Salir"+" "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleServicioTransporte";
		inputMap = this.jButtonNuevoDetalleServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleServicioTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleServicioTransporte"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleServicioTransporte";
		inputMap = this.jButtonActualizarDetalleServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleServicioTransporte"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleServicioTransporte";
		inputMap = this.jButtonEliminarDetalleServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleServicioTransporte"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleServicioTransporte";
		inputMap = this.jButtonCancelarDetalleServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleServicioTransporte"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleServicioTransporte";
		inputMap = this.jButtonCerrarDetalleServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleServicioTransporte"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleServicioTransporte";
		inputMap = this.jButtonGuardarCambiosTablaDetalleServicioTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleServicioTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleServicioTransporte"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleServicioTransporte = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleServicioTransporte.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleServicioTransporte.setToolTipText("Nuevo DetalleServicioTransporte");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleServicioTransporte = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleServicioTransporte.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleServicioTransporte.setToolTipText("Sin Cerrar Ventana DetalleServicioTransporte");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleServicioTransporte = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleServicioTransporte.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleServicioTransporte.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleServicioTransporte = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleServicioTransporte.setText("Accion");
		this.jComboBoxTiposAccionesDetalleServicioTransporte.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleServicioTransporte = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleServicioTransporte.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleServicioTransporte.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleServicioTransporte = new JLabelMe();
		
		this.jLabelAccionesDetalleServicioTransporte.setText("Acciones");		
		this.jLabelAccionesDetalleServicioTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleServicioTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleServicioTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleServicioTransporte();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleServicioTransporte();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleServicioTransporte=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleServicioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleServicioTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleServicioTransporte.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleServicioTransporte.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleServicioTransporte.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleServicioTransporte.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleServicioTransporte.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleServicioTransporte.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleServicioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleServicioTransporte = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleServicioTransporte = new GridBagLayout();
		
		this.jPanelCamposDetalleServicioTransporte.setLayout(gridaBagLayoutCamposDetalleServicioTransporte);
		this.jPanelCamposOcultosDetalleServicioTransporte.setLayout(gridaBagLayoutCamposOcultosDetalleServicioTransporte);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleServicioTransporte.add(jLabelIdDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 1;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleServicioTransporte.add(jLabelidDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);


	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_servicio_transporteDetalleServicioTransporte.add(jLabelid_servicio_transporteDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 2;
		this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
		this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_servicio_transporteDetalleServicioTransporte.add(jButtonid_servicio_transporteDetalleServicioTransporteBusqueda, this.gridBagConstraintsDetalleServicioTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 3;
		this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
		this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_servicio_transporteDetalleServicioTransporte.add(jButtonid_servicio_transporteDetalleServicioTransporteUpdate, this.gridBagConstraintsDetalleServicioTransporte);
	}

	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 1;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_servicio_transporteDetalleServicioTransporte.add(jComboBoxid_servicio_transporteDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);


	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleServicioTransporte.add(jLabelid_empresaDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 2;
		this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
		this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleServicioTransporte.add(jButtonid_empresaDetalleServicioTransporteBusqueda, this.gridBagConstraintsDetalleServicioTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 3;
		this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
		this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleServicioTransporte.add(jButtonid_empresaDetalleServicioTransporteUpdate, this.gridBagConstraintsDetalleServicioTransporte);
	}

	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 1;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleServicioTransporte.add(jComboBoxid_empresaDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);


	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleServicioTransporte.add(jLabelid_sucursalDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 2;
		this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
		this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleServicioTransporte.add(jButtonid_sucursalDetalleServicioTransporteBusqueda, this.gridBagConstraintsDetalleServicioTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 3;
		this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
		this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleServicioTransporte.add(jButtonid_sucursalDetalleServicioTransporteUpdate, this.gridBagConstraintsDetalleServicioTransporte);
	}

	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 1;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleServicioTransporte.add(jComboBoxid_sucursalDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);


	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetalleServicioTransporte.add(jLabelid_ejercicioDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 2;
		this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
		this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleServicioTransporte.add(jButtonid_ejercicioDetalleServicioTransporteBusqueda, this.gridBagConstraintsDetalleServicioTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 3;
		this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
		this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleServicioTransporte.add(jButtonid_ejercicioDetalleServicioTransporteUpdate, this.gridBagConstraintsDetalleServicioTransporte);
	}

	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 1;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetalleServicioTransporte.add(jComboBoxid_ejercicioDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);


	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetalleServicioTransporte.add(jLabelid_periodoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 2;
		this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
		this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleServicioTransporte.add(jButtonid_periodoDetalleServicioTransporteBusqueda, this.gridBagConstraintsDetalleServicioTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 3;
		this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
		this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleServicioTransporte.add(jButtonid_periodoDetalleServicioTransporteUpdate, this.gridBagConstraintsDetalleServicioTransporte);
	}

	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 1;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetalleServicioTransporte.add(jComboBoxid_periodoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);


	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDetalleServicioTransporte.add(jLabelid_bodegaDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 2;
		this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
		this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleServicioTransporte.add(jButtonid_bodegaDetalleServicioTransporteBusqueda, this.gridBagConstraintsDetalleServicioTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 3;
		this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
		this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleServicioTransporte.add(jButtonid_bodegaDetalleServicioTransporteUpdate, this.gridBagConstraintsDetalleServicioTransporte);
	}

	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 1;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDetalleServicioTransporte.add(jComboBoxid_bodegaDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);


	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDetalleServicioTransporte.add(jLabelid_productoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 2;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetalleServicioTransporte.add(jButtonid_productoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 3;
		this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
		this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleServicioTransporte.add(jButtonid_productoDetalleServicioTransporteBusqueda, this.gridBagConstraintsDetalleServicioTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 4;
		this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
		this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleServicioTransporte.add(jButtonid_productoDetalleServicioTransporteUpdate, this.gridBagConstraintsDetalleServicioTransporte);
	}

	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 1;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDetalleServicioTransporte.add(jComboBoxid_productoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);


	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadDetalleServicioTransporte.add(jLabelid_unidadDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 2;
		this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
		this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleServicioTransporte.add(jButtonid_unidadDetalleServicioTransporteBusqueda, this.gridBagConstraintsDetalleServicioTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 3;
		this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
		this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleServicioTransporte.add(jButtonid_unidadDetalleServicioTransporteUpdate, this.gridBagConstraintsDetalleServicioTransporte);
	}

	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 1;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadDetalleServicioTransporte.add(jComboBoxid_unidadDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);


	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoDetalleServicioTransporte.add(jLabelid_centro_costoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 2;
		this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
		this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetalleServicioTransporte.add(jButtonid_centro_costoDetalleServicioTransporteBusqueda, this.gridBagConstraintsDetalleServicioTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 3;
		this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
		this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetalleServicioTransporte.add(jButtonid_centro_costoDetalleServicioTransporteUpdate, this.gridBagConstraintsDetalleServicioTransporte);
	}

	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 1;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoDetalleServicioTransporte.add(jComboBoxid_centro_costoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);


	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadDetalleServicioTransporte.add(jLabelcantidadDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 2;
		this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
		this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadDetalleServicioTransporte.add(jButtoncantidadDetalleServicioTransporteBusqueda, this.gridBagConstraintsDetalleServicioTransporte);
	}

	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 1;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadDetalleServicioTransporte.add(jTextFieldcantidadDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);


	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioDetalleServicioTransporte.add(jLabelprecioDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 2;
		this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
		this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioDetalleServicioTransporte.add(jButtonprecioDetalleServicioTransporteBusqueda, this.gridBagConstraintsDetalleServicioTransporte);
	}

	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 1;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioDetalleServicioTransporte.add(jTextFieldprecioDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);


	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalDetalleServicioTransporte.add(jLabeltotalDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 2;
		this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
		this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalDetalleServicioTransporte.add(jButtontotalDetalleServicioTransporteBusqueda, this.gridBagConstraintsDetalleServicioTransporte);
	}

	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 1;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalDetalleServicioTransporte.add(jTextFieldtotalDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);


	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetalleServicioTransporte.add(jLabeldescripcionDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		//this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 2;
		this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
		this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetalleServicioTransporte.add(jButtondescripcionDetalleServicioTransporteBusqueda, this.gridBagConstraintsDetalleServicioTransporte);
	}

	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = 1;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetalleServicioTransporte.add(jscrollPanedescripcionDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = iYPanelCamposDetalleServicioTransporte;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = iXPanelCamposDetalleServicioTransporte++;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleServicioTransporte.add(this.jPanelidDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(iXPanelCamposDetalleServicioTransporte % 2==0) {
		iXPanelCamposDetalleServicioTransporte=0;
		iYPanelCamposDetalleServicioTransporte++;
	}
	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = iYPanelCamposDetalleServicioTransporte;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = iXPanelCamposDetalleServicioTransporte++;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleServicioTransporte.add(this.jPanelid_servicio_transporteDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(iXPanelCamposDetalleServicioTransporte % 2==0) {
		iXPanelCamposDetalleServicioTransporte=0;
		iYPanelCamposDetalleServicioTransporte++;
	}
	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = iYPanelCamposDetalleServicioTransporte;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = iXPanelCamposDetalleServicioTransporte++;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleServicioTransporte.add(this.jPanelid_bodegaDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(iXPanelCamposDetalleServicioTransporte % 2==0) {
		iXPanelCamposDetalleServicioTransporte=0;
		iYPanelCamposDetalleServicioTransporte++;
	}
	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = iYPanelCamposDetalleServicioTransporte;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = iXPanelCamposDetalleServicioTransporte++;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleServicioTransporte.add(this.jPanelid_productoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(iXPanelCamposDetalleServicioTransporte % 2==0) {
		iXPanelCamposDetalleServicioTransporte=0;
		iYPanelCamposDetalleServicioTransporte++;
	}
	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = iYPanelCamposDetalleServicioTransporte;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = iXPanelCamposDetalleServicioTransporte++;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleServicioTransporte.add(this.jPanelid_unidadDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(iXPanelCamposDetalleServicioTransporte % 2==0) {
		iXPanelCamposDetalleServicioTransporte=0;
		iYPanelCamposDetalleServicioTransporte++;
	}
	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = iYPanelCamposDetalleServicioTransporte;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = iXPanelCamposDetalleServicioTransporte++;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleServicioTransporte.add(this.jPanelid_centro_costoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(iXPanelCamposDetalleServicioTransporte % 2==0) {
		iXPanelCamposDetalleServicioTransporte=0;
		iYPanelCamposDetalleServicioTransporte++;
	}
	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = iYPanelCamposDetalleServicioTransporte;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = iXPanelCamposDetalleServicioTransporte++;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleServicioTransporte.add(this.jPanelcantidadDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(iXPanelCamposDetalleServicioTransporte % 2==0) {
		iXPanelCamposDetalleServicioTransporte=0;
		iYPanelCamposDetalleServicioTransporte++;
	}
	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = iYPanelCamposDetalleServicioTransporte;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = iXPanelCamposDetalleServicioTransporte++;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleServicioTransporte.add(this.jPanelprecioDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(iXPanelCamposDetalleServicioTransporte % 2==0) {
		iXPanelCamposDetalleServicioTransporte=0;
		iYPanelCamposDetalleServicioTransporte++;
	}
	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = iYPanelCamposDetalleServicioTransporte;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = iXPanelCamposDetalleServicioTransporte++;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleServicioTransporte.add(this.jPaneltotalDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(iXPanelCamposDetalleServicioTransporte % 2==0) {
		iXPanelCamposDetalleServicioTransporte=0;
		iYPanelCamposDetalleServicioTransporte++;
	}
	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = iYPanelCamposDetalleServicioTransporte;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = iXPanelCamposDetalleServicioTransporte++;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleServicioTransporte.add(this.jPaneldescripcionDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(iXPanelCamposDetalleServicioTransporte % 2==0) {
		iXPanelCamposDetalleServicioTransporte=0;
		iYPanelCamposDetalleServicioTransporte++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = iYPanelCamposOcultosDetalleServicioTransporte;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = iXPanelCamposOcultosDetalleServicioTransporte++;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleServicioTransporte.add(this.jPanelid_empresaDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(iXPanelCamposOcultosDetalleServicioTransporte % 2==0) {
		iXPanelCamposOcultosDetalleServicioTransporte=0;
		iYPanelCamposOcultosDetalleServicioTransporte++;
	}
	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = iYPanelCamposOcultosDetalleServicioTransporte;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = iXPanelCamposOcultosDetalleServicioTransporte++;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleServicioTransporte.add(this.jPanelid_sucursalDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(iXPanelCamposOcultosDetalleServicioTransporte % 2==0) {
		iXPanelCamposOcultosDetalleServicioTransporte=0;
		iYPanelCamposOcultosDetalleServicioTransporte++;
	}
	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = iYPanelCamposOcultosDetalleServicioTransporte;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = iXPanelCamposOcultosDetalleServicioTransporte++;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleServicioTransporte.add(this.jPanelid_ejercicioDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(iXPanelCamposOcultosDetalleServicioTransporte % 2==0) {
		iXPanelCamposOcultosDetalleServicioTransporte=0;
		iYPanelCamposOcultosDetalleServicioTransporte++;
	}
	this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleServicioTransporte.gridy = iYPanelCamposOcultosDetalleServicioTransporte;
	this.gridBagConstraintsDetalleServicioTransporte.gridx = iXPanelCamposOcultosDetalleServicioTransporte++;
	this.gridBagConstraintsDetalleServicioTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleServicioTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleServicioTransporte.add(this.jPanelid_periodoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);



	if(iXPanelCamposOcultosDetalleServicioTransporte % 2==0) {
		iXPanelCamposOcultosDetalleServicioTransporte=0;
		iYPanelCamposOcultosDetalleServicioTransporte++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleServicioTransporte= new GridBagLayout();
		this.jPanelAccionesDetalleServicioTransporte.setLayout(gridaBagLayoutAccionesDetalleServicioTransporte);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleServicioTransporte= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleServicioTransporte.setLayout(gridaBagLayoutAccionesFormularioDetalleServicioTransporte);
		
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleServicioTransporte.add(this.jComboBoxTiposAccionesFormularioDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleServicioTransporte.add(this.jCheckBoxPostAccionNuevoDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalleserviciotransporteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleServicioTransporte.add(this.jCheckBoxPostAccionSinCerrarDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalleserviciotransporteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleServicioTransporte.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleServicioTransporte.add(this.jCheckBoxPostAccionSinMensajeDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleServicioTransporte.add(this.jButtonModificarDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);							

		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;
		this.gridBagConstraintsDetalleServicioTransporte.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleServicioTransporte.add(this.jButtonEliminarDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		
			
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleServicioTransporte.add(this.jButtonActualizarDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);


		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleServicioTransporte.add(this.jButtonGuardarCambiosDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);	
		
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.gridy = 0;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleServicioTransporte.add(this.jButtonCancelarDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleServicioTransporte = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleServicioTransporte);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();						
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;		
			//this.gridBagConstraintsDetalleServicioTransporte.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleServicioTransporte.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleServicioTransporte.gridx =0;
		this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleServicioTransporte.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleServicioTransporteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleServicioTransporte = new DetalleServicioTransporteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Servicio Transporte DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Servicio Transporte DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Servicio Transporte Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleServicioTransporteModel detalleserviciotransporteModel=new DetalleServicioTransporteModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleServicioTransporteModel.DetalleServicioTransporteFocusTraversalPolicy detalleserviciotransporteFocusTraversalPolicy = detalleserviciotransporteModel.new DetalleServicioTransporteFocusTraversalPolicy(this);
			
			//detalleserviciotransporteFocusTraversalPolicy.setdetalleserviciotransporteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalleserviciotransporteModel);
			
			
			this.jContentPaneDetalleDetalleServicioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleServicioTransporte = new GridBagLayout();	
			this.jContentPaneDetalleDetalleServicioTransporte.setLayout(gridaBagLayoutDetalleDetalleServicioTransporte);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleServicioTransporte = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
				this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleServicioTransporte.add(jTtoolBarDetalleDetalleServicioTransporte, gridBagConstraintsDetalleServicioTransporte);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleServicioTransporte=   new JScrollPane(jContentPaneDetalleDetalleServicioTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleServicioTransporte.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleServicioTransporte.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleServicioTransporte.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleServicioTransporte=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleServicioTransporte.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleServicioTransporte.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleServicioTransporte.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
	        
			this.jContentPaneDetalleDetalleServicioTransporte.add(jPanelCamposDetalleServicioTransporte, gridBagConstraintsDetalleServicioTransporte);
			
			
			
			
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
						&& detalleserviciotransporteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detalleserviciotransporteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleServicioTransporte= new GridBagConstraints();
						this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
						this.jContentPaneDetalleDetalleServicioTransporte.add(this.jTabbedPaneRelacionesDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleServicioTransporte.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleServicioTransporte.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
					this.gridBagConstraintsDetalleServicioTransporte.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleServicioTransporte.add(jPanelCamposOcultosDetalleServicioTransporte, gridBagConstraintsDetalleServicioTransporte);
				
					this.jPanelCamposOcultosDetalleServicioTransporte.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
	        this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleServicioTransporte.add(this.jPanelAccionesFormularioDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);							
			
			
			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
	        this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleServicioTransporte.add(this.jPanelAccionesDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleServicioTransporte);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleServicioTransporte=   new JScrollPane(this.jPanelCamposDetalleServicioTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleServicioTransporte.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleServicioTransporte.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleServicioTransporte.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
			this.gridBagConstraintsDetalleServicioTransporte.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleServicioTransporte.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleServicioTransporte.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);			
			
			this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
			this.gridBagConstraintsDetalleServicioTransporte.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
			
			
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		
			
		this.gridBagConstraintsDetalleServicioTransporte = new GridBagConstraints();
		this.gridBagConstraintsDetalleServicioTransporte.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleServicioTransporte.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleServicioTransporte, this.gridBagConstraintsDetalleServicioTransporte);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleServicioTransporte;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleServicioTransporte;
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
