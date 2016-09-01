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
import com.bydan.erp.facturacion.util.DetalleTablaAmortiConstantesFunciones;

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
public class DetalleTablaAmortiDetalleFormJInternalFrame extends DetalleTablaAmortiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleTablaAmorti;
	
	protected JMenuBar jmenuBarDetalleDetalleTablaAmorti;
	
	protected JMenu jmenuDetalleDetalleTablaAmorti;
	protected JMenu jmenuDetalleArchivoDetalleTablaAmorti;
	protected JMenu jmenuDetalleAccionesDetalleTablaAmorti;
	protected JMenu jmenuDetalleDatosDetalleTablaAmorti;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleTablaAmorti;	
	protected GridBagConstraints gridBagConstraintsDetalleTablaAmorti;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleTablaAmortiBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleTablaAmorti;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected TablaAmortiBeanSwingJInternalFrame tablaamortiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tablaamorti="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public DetalleTablaAmortiSessionBean detalletablaamortiSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public TablaAmortiSessionBean tablaamortiSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public DetalleTablaAmortiLogic detalletablaamortiLogic;
	
	public JScrollPane jScrollPanelDatosDetalleTablaAmorti;
	public JScrollPane jScrollPanelDatosEdicionDetalleTablaAmorti;
	public JScrollPane jScrollPanelDatosGeneralDetalleTablaAmorti;
	
	protected JPanel jPanelCamposDetalleTablaAmorti;    
	protected JPanel jPanelCamposOcultosDetalleTablaAmorti;    	
	protected JPanel jPanelAccionesDetalleTablaAmorti;
	protected JPanel jPanelAccionesFormularioDetalleTablaAmorti;
    
	
	
	protected Integer iXPanelCamposDetalleTablaAmorti=0;
	protected Integer iYPanelCamposDetalleTablaAmorti=0;
	
	protected Integer iXPanelCamposOcultosDetalleTablaAmorti=0;
	protected Integer iYPanelCamposOcultosDetalleTablaAmorti=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleTablaAmorti;
	public JButton jButtonModificarDetalleTablaAmorti;
	public JButton jButtonActualizarDetalleTablaAmorti;
    public JButton jButtonEliminarDetalleTablaAmorti;
	public JButton jButtonCancelarDetalleTablaAmorti;
    public JButton jButtonGuardarCambiosDetalleTablaAmorti;
	public JButton jButtonGuardarCambiosTablaDetalleTablaAmorti;
	protected JButton jButtonCerrarDetalleTablaAmorti;
	
	
	protected JButton jButtonProcesarInformacionDetalleTablaAmorti;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleTablaAmorti;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleTablaAmorti;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleTablaAmorti;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleTablaAmorti;
	protected JButton jButtonModificarToolBarDetalleTablaAmorti;
	protected JButton jButtonActualizarToolBarDetalleTablaAmorti;
    protected JButton jButtonEliminarToolBarDetalleTablaAmorti;
	protected JButton jButtonCancelarToolBarDetalleTablaAmorti;
    protected JButton jButtonGuardarCambiosToolBarDetalleTablaAmorti;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleTablaAmorti;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleTablaAmorti;
	protected JButton jButtonCerrarToolBarDetalleTablaAmorti;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleTablaAmorti;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleTablaAmorti;
	protected JMenuItem jMenuItemModificarDetalleTablaAmorti;
	protected JMenuItem jMenuItemActualizarDetalleTablaAmorti;
    protected JMenuItem jMenuItemEliminarDetalleTablaAmorti;
	protected JMenuItem jMenuItemCancelarDetalleTablaAmorti;
    protected JMenuItem jMenuItemGuardarCambiosDetalleTablaAmorti;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleTablaAmorti;
	protected JMenuItem jMenuItemCerrarDetalleTablaAmorti;
	protected JMenuItem jMenuItemDetalleCerrarDetalleTablaAmorti;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleTablaAmorti;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleTablaAmorti;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleTablaAmorti;
	protected JMenuItem jMenuItemMostrarOcultarDetalleTablaAmorti;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleTablaAmorti;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleTablaAmorti;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleTablaAmorti;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleTablaAmorti;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleTablaAmorti;
	public JLabel jLabelIdDetalleTablaAmorti;
	public JLabel jLabelidDetalleTablaAmorti;
	public JButton jButtonidDetalleTablaAmortiBusqueda= new JButtonMe();

	public JPanel jPanelvalorDetalleTablaAmorti;
	public JLabel jLabelvalorDetalleTablaAmorti;
	public JTextField jTextFieldvalorDetalleTablaAmorti;
	public JButton jButtonvalorDetalleTablaAmortiBusqueda= new JButtonMe();

	public JPanel jPanelinteresDetalleTablaAmorti;
	public JLabel jLabelinteresDetalleTablaAmorti;
	public JTextField jTextFieldinteresDetalleTablaAmorti;
	public JButton jButtoninteresDetalleTablaAmortiBusqueda= new JButtonMe();

	public JPanel jPanelcapitalDetalleTablaAmorti;
	public JLabel jLabelcapitalDetalleTablaAmorti;
	public JTextField jTextFieldcapitalDetalleTablaAmorti;
	public JButton jButtoncapitalDetalleTablaAmortiBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioDetalleTablaAmorti;
	public JLabel jLabelfecha_inicioDetalleTablaAmorti;
	//public JFormattedTextField jDateChooserfecha_inicioDetalleTablaAmorti;

	public JDateChooser jDateChooserfecha_inicioDetalleTablaAmorti;
	public JButton jButtonfecha_inicioDetalleTablaAmortiBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finDetalleTablaAmorti;
	public JLabel jLabelfecha_finDetalleTablaAmorti;
	//public JFormattedTextField jDateChooserfecha_finDetalleTablaAmorti;

	public JDateChooser jDateChooserfecha_finDetalleTablaAmorti;
	public JButton jButtonfecha_finDetalleTablaAmortiBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetalleTablaAmorti;
	public JLabel jLabeldescripcionDetalleTablaAmorti;
	public JTextField jTextFielddescripcionDetalleTablaAmorti;
	public JButton jButtondescripcionDetalleTablaAmortiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetalleTablaAmorti;
	public JLabel jLabelid_empresaDetalleTablaAmorti;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleTablaAmorti;
	public JButton jButtonid_empresaDetalleTablaAmorti= new JButtonMe();
	public JButton jButtonid_empresaDetalleTablaAmortiUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleTablaAmortiBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleTablaAmorti;
	public JLabel jLabelid_sucursalDetalleTablaAmorti;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleTablaAmorti;
	public JButton jButtonid_sucursalDetalleTablaAmorti= new JButtonMe();
	public JButton jButtonid_sucursalDetalleTablaAmortiUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleTablaAmortiBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetalleTablaAmorti;
	public JLabel jLabelid_ejercicioDetalleTablaAmorti;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetalleTablaAmorti;
	public JButton jButtonid_ejercicioDetalleTablaAmorti= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleTablaAmortiUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleTablaAmortiBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetalleTablaAmorti;
	public JLabel jLabelid_periodoDetalleTablaAmorti;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetalleTablaAmorti;
	public JButton jButtonid_periodoDetalleTablaAmorti= new JButtonMe();
	public JButton jButtonid_periodoDetalleTablaAmortiUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetalleTablaAmortiBusqueda= new JButtonMe();

	public JPanel jPanelid_tabla_amortiDetalleTablaAmorti;
	public JLabel jLabelid_tabla_amortiDetalleTablaAmorti;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tabla_amortiDetalleTablaAmorti;
	public JButton jButtonid_tabla_amortiDetalleTablaAmorti= new JButtonMe();
	public JButton jButtonid_tabla_amortiDetalleTablaAmortiUpdate= new JButtonMe();
	public JButton jButtonid_tabla_amortiDetalleTablaAmortiBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetalleTablaAmorti;
	public JLabel jLabelid_anioDetalleTablaAmorti;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetalleTablaAmorti;
	public JButton jButtonid_anioDetalleTablaAmorti= new JButtonMe();
	public JButton jButtonid_anioDetalleTablaAmortiUpdate= new JButtonMe();
	public JButton jButtonid_anioDetalleTablaAmortiBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetalleTablaAmorti;
	public JLabel jLabelid_mesDetalleTablaAmorti;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetalleTablaAmorti;
	public JButton jButtonid_mesDetalleTablaAmorti= new JButtonMe();
	public JButton jButtonid_mesDetalleTablaAmortiUpdate= new JButtonMe();
	public JButton jButtonid_mesDetalleTablaAmortiBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleTablaAmorti;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleTablaAmortiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleTablaAmorti=new JPanel();
				this.jPanelAccionesFormularioDetalleTablaAmorti=new JPanel();
				this.jmenuBarDetalleDetalleTablaAmorti=new JMenuBar();
				this.jTtoolBarDetalleDetalleTablaAmorti=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleTablaAmortiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleTablaAmorti No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleTablaAmortiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleTablaAmorti No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleTablaAmortiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleTablaAmorti No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleTablaAmortiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleTablaAmorti No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleTablaAmortiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleTablaAmorti No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleTablaAmorti() {
		return this.jButtonActualizarToolBarDetalleTablaAmorti;
	}
	
	public JButton getjButtonEliminarToolBarDetalleTablaAmorti() {
		return this.jButtonEliminarToolBarDetalleTablaAmorti;
	}
	
	public JButton getjButtonCancelarToolBarDetalleTablaAmorti() {
		return this.jButtonCancelarToolBarDetalleTablaAmorti;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleTablaAmorti() {
		return this.jButtonProcesarInformacionDetalleTablaAmorti;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleTablaAmorti)	{
		this.jButtonProcesarInformacionDetalleTablaAmorti = jButtonProcesarInformacionDetalleTablaAmorti;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleTablaAmorti() {
		return this.jComboBoxTiposAccionesDetalleTablaAmorti;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleTablaAmorti(
			JComboBox jComboBoxTiposRelacionesDetalleTablaAmorti) {
		this.jComboBoxTiposRelacionesDetalleTablaAmorti = jComboBoxTiposRelacionesDetalleTablaAmorti;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleTablaAmorti(
			JComboBox jComboBoxTiposAccionesDetalleTablaAmorti) {
		this.jComboBoxTiposAccionesDetalleTablaAmorti = jComboBoxTiposAccionesDetalleTablaAmorti;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleTablaAmorti() {
		return this.jComboBoxTiposAccionesFormularioDetalleTablaAmorti;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleTablaAmorti(
			JComboBox jComboBoxTiposAccionesFormularioDetalleTablaAmorti) {
		this.jComboBoxTiposAccionesFormularioDetalleTablaAmorti = jComboBoxTiposAccionesFormularioDetalleTablaAmorti;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalletablaamortiSessionBean=new DetalleTablaAmortiSessionBean();
		
		this.detalletablaamortiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalletablaamortiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalletablaamortiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleTablaAmortiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleTablaAmortiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleTablaAmortiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Tabla Amorti MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleTablaAmortiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleTablaAmorti= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleTablaAmorti=new JButtonMe();
				this.jButtonModificarToolBarDetalleTablaAmorti=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleTablaAmorti,this.jTtoolBarDetalleDetalleTablaAmorti,
							"actualizar","actualizar","Actualizar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleTablaAmorti,this.jTtoolBarDetalleDetalleTablaAmorti,
							"eliminar","eliminar","Eliminar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleTablaAmorti,this.jTtoolBarDetalleDetalleTablaAmorti,
							"cancelar","cancelar","Cancelar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleTablaAmorti=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleTablaAmorti,this.jTtoolBarDetalleDetalleTablaAmorti,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleTablaAmorti=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleTablaAmorti=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleTablaAmorti=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleTablaAmorti=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleTablaAmorti=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleTablaAmorti= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleTablaAmorti.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleTablaAmorti,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleTablaAmorti= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleTablaAmorti.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleTablaAmorti,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleTablaAmorti= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleTablaAmorti.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleTablaAmorti,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleTablaAmorti= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleTablaAmorti.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleTablaAmorti,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleTablaAmorti= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleTablaAmorti.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleTablaAmorti,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleTablaAmorti= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleTablaAmorti.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleTablaAmorti,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleTablaAmorti= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleTablaAmorti.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleTablaAmorti,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleTablaAmorti= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleTablaAmorti.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleTablaAmorti,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleTablaAmorti= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleTablaAmorti.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleTablaAmorti,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleTablaAmorti= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleTablaAmorti.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleTablaAmorti,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleTablaAmorti.add(this.jMenuItemDetalleCerrarDetalleTablaAmorti);
		
		this.jmenuDetalleAccionesDetalleTablaAmorti.add(this.jMenuItemActualizarDetalleTablaAmorti);
		this.jmenuDetalleAccionesDetalleTablaAmorti.add(this.jMenuItemEliminarDetalleTablaAmorti);
		this.jmenuDetalleAccionesDetalleTablaAmorti.add(this.jMenuItemCancelarDetalleTablaAmorti);		
		
		//this.jmenuDetalleDatosDetalleTablaAmorti.add(this.jMenuItemDetalleAbrirOrderByDetalleTablaAmorti);				
		this.jmenuDetalleDatosDetalleTablaAmorti.add(this.jMenuItemDetalleMostarOcultarDetalleTablaAmorti);				
				
		//this.jmenuDetalleAccionesDetalleTablaAmorti.add(this.jMenuItemGuardarCambiosDetalleTablaAmorti);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleTablaAmorti.add(this.jmenuDetalleArchivoDetalleTablaAmorti);		
		this.jmenuBarDetalleDetalleTablaAmorti.add(this.jmenuDetalleAccionesDetalleTablaAmorti);		
		this.jmenuBarDetalleDetalleTablaAmorti.add(this.jmenuDetalleDatosDetalleTablaAmorti);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleTablaAmorti);				
	}
	
	
	public void inicializarElementosCamposDetalleTablaAmorti() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleTablaAmorti = new JLabelMe();
		jLabelIdDetalleTablaAmorti.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleTablaAmorti = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleTablaAmorti.setToolTipText(DetalleTablaAmortiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleTablaAmorti= new GridBagLayout();

		this.jPanelidDetalleTablaAmorti.setLayout(this.gridaBagLayoutDetalleTablaAmorti);

		jLabelidDetalleTablaAmorti = new JLabel();
		jLabelidDetalleTablaAmorti.setText("Id");

		jLabelidDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalorDetalleTablaAmorti = new JLabelMe();
		this.jLabelvalorDetalleTablaAmorti.setText(""+DetalleTablaAmortiConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorDetalleTablaAmorti.setToolTipText("Valor");
		this.jLabelvalorDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorDetalleTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorDetalleTablaAmorti.setToolTipText(DetalleTablaAmortiConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutDetalleTablaAmorti = new GridBagLayout();
		this.jPanelvalorDetalleTablaAmorti.setLayout(this.gridaBagLayoutDetalleTablaAmorti);


		jTextFieldvalorDetalleTablaAmorti= new JTextFieldMe();
		jTextFieldvalorDetalleTablaAmorti.setEnabled(false);
		jTextFieldvalorDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorDetalleTablaAmorti.setText("0.0");

		this.jButtonvalorDetalleTablaAmortiBusqueda= new JButtonMe();
		this.jButtonvalorDetalleTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorDetalleTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorDetalleTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorDetalleTablaAmortiBusqueda.setText("U");
		this.jButtonvalorDetalleTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorDetalleTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorDetalleTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorDetalleTablaAmortiBusqueda"));

		if(this.detalletablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorDetalleTablaAmortiBusqueda.setVisible(false);		}


					
		this.jLabelinteresDetalleTablaAmorti = new JLabelMe();
		this.jLabelinteresDetalleTablaAmorti.setText(""+DetalleTablaAmortiConstantesFunciones.LABEL_INTERES+" : *");
		this.jLabelinteresDetalleTablaAmorti.setToolTipText("Interes");
		this.jLabelinteresDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelinteresDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelinteresDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelinteresDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelinteresDetalleTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelinteresDetalleTablaAmorti.setToolTipText(DetalleTablaAmortiConstantesFunciones.LABEL_INTERES);
		this.gridaBagLayoutDetalleTablaAmorti = new GridBagLayout();
		this.jPanelinteresDetalleTablaAmorti.setLayout(this.gridaBagLayoutDetalleTablaAmorti);


		jTextFieldinteresDetalleTablaAmorti= new JTextFieldMe();
		jTextFieldinteresDetalleTablaAmorti.setEnabled(false);
		jTextFieldinteresDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldinteresDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldinteresDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldinteresDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldinteresDetalleTablaAmorti.setText("0.0");

		this.jButtoninteresDetalleTablaAmortiBusqueda= new JButtonMe();
		this.jButtoninteresDetalleTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoninteresDetalleTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoninteresDetalleTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoninteresDetalleTablaAmortiBusqueda.setText("U");
		this.jButtoninteresDetalleTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoninteresDetalleTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoninteresDetalleTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldinteresDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldinteresDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"interesDetalleTablaAmortiBusqueda"));

		if(this.detalletablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoninteresDetalleTablaAmortiBusqueda.setVisible(false);		}


					
		this.jLabelcapitalDetalleTablaAmorti = new JLabelMe();
		this.jLabelcapitalDetalleTablaAmorti.setText(""+DetalleTablaAmortiConstantesFunciones.LABEL_CAPITAL+" : *");
		this.jLabelcapitalDetalleTablaAmorti.setToolTipText("Capital");
		this.jLabelcapitalDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcapitalDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcapitalDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcapitalDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcapitalDetalleTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcapitalDetalleTablaAmorti.setToolTipText(DetalleTablaAmortiConstantesFunciones.LABEL_CAPITAL);
		this.gridaBagLayoutDetalleTablaAmorti = new GridBagLayout();
		this.jPanelcapitalDetalleTablaAmorti.setLayout(this.gridaBagLayoutDetalleTablaAmorti);


		jTextFieldcapitalDetalleTablaAmorti= new JTextFieldMe();
		jTextFieldcapitalDetalleTablaAmorti.setEnabled(false);
		jTextFieldcapitalDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcapitalDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcapitalDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcapitalDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcapitalDetalleTablaAmorti.setText("0.0");

		this.jButtoncapitalDetalleTablaAmortiBusqueda= new JButtonMe();
		this.jButtoncapitalDetalleTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncapitalDetalleTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncapitalDetalleTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncapitalDetalleTablaAmortiBusqueda.setText("U");
		this.jButtoncapitalDetalleTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncapitalDetalleTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncapitalDetalleTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcapitalDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcapitalDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"capitalDetalleTablaAmortiBusqueda"));

		if(this.detalletablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncapitalDetalleTablaAmortiBusqueda.setVisible(false);		}


					
		this.jLabelfecha_inicioDetalleTablaAmorti = new JLabelMe();
		this.jLabelfecha_inicioDetalleTablaAmorti.setText(""+DetalleTablaAmortiConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioDetalleTablaAmorti.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioDetalleTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioDetalleTablaAmorti.setToolTipText(DetalleTablaAmortiConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutDetalleTablaAmorti = new GridBagLayout();
		this.jPanelfecha_inicioDetalleTablaAmorti.setLayout(this.gridaBagLayoutDetalleTablaAmorti);


		//jFormattedTextFieldfecha_inicioDetalleTablaAmorti= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioDetalleTablaAmorti= new JDateChooser();
		jDateChooserfecha_inicioDetalleTablaAmorti.setEnabled(false);
		jDateChooserfecha_inicioDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioDetalleTablaAmorti.setDate(new Date());
		jDateChooserfecha_inicioDetalleTablaAmorti.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioDetalleTablaAmorti.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioDetalleTablaAmortiBusqueda= new JButtonMe();
		this.jButtonfecha_inicioDetalleTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioDetalleTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioDetalleTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioDetalleTablaAmortiBusqueda.setText("U");
		this.jButtonfecha_inicioDetalleTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioDetalleTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioDetalleTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioDetalleTablaAmortiBusqueda"));

		if(this.detalletablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioDetalleTablaAmortiBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finDetalleTablaAmorti = new JLabelMe();
		this.jLabelfecha_finDetalleTablaAmorti.setText(""+DetalleTablaAmortiConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finDetalleTablaAmorti.setToolTipText("Fecha Fin");
		this.jLabelfecha_finDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finDetalleTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finDetalleTablaAmorti.setToolTipText(DetalleTablaAmortiConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutDetalleTablaAmorti = new GridBagLayout();
		this.jPanelfecha_finDetalleTablaAmorti.setLayout(this.gridaBagLayoutDetalleTablaAmorti);


		//jFormattedTextFieldfecha_finDetalleTablaAmorti= new JFormattedTextFieldMe();

		jDateChooserfecha_finDetalleTablaAmorti= new JDateChooser();
		jDateChooserfecha_finDetalleTablaAmorti.setEnabled(false);
		jDateChooserfecha_finDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finDetalleTablaAmorti.setDate(new Date());
		jDateChooserfecha_finDetalleTablaAmorti.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finDetalleTablaAmorti.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finDetalleTablaAmortiBusqueda= new JButtonMe();
		this.jButtonfecha_finDetalleTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finDetalleTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finDetalleTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finDetalleTablaAmortiBusqueda.setText("U");
		this.jButtonfecha_finDetalleTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finDetalleTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finDetalleTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finDetalleTablaAmortiBusqueda"));

		if(this.detalletablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finDetalleTablaAmortiBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDetalleTablaAmorti = new JLabelMe();
		this.jLabeldescripcionDetalleTablaAmorti.setText(""+DetalleTablaAmortiConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionDetalleTablaAmorti.setToolTipText("Descripcion");
		this.jLabeldescripcionDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetalleTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetalleTablaAmorti.setToolTipText(DetalleTablaAmortiConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetalleTablaAmorti = new GridBagLayout();
		this.jPaneldescripcionDetalleTablaAmorti.setLayout(this.gridaBagLayoutDetalleTablaAmorti);


		jTextFielddescripcionDetalleTablaAmorti= new JTextFieldMe();

		jTextFielddescripcionDetalleTablaAmorti.setEnabled(false);
		jTextFielddescripcionDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescripcionDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescripcionDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescripcionDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtondescripcionDetalleTablaAmortiBusqueda= new JButtonMe();
		this.jButtondescripcionDetalleTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetalleTablaAmortiBusqueda.setText("U");
		this.jButtondescripcionDetalleTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetalleTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetalleTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescripcionDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescripcionDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetalleTablaAmortiBusqueda"));

		if(this.detalletablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetalleTablaAmortiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleTablaAmorti() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetalleTablaAmorti = new JLabelMe();
		this.jLabelid_empresaDetalleTablaAmorti.setText(""+DetalleTablaAmortiConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleTablaAmorti.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleTablaAmorti.setToolTipText(DetalleTablaAmortiConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleTablaAmorti = new GridBagLayout();
		this.jPanelid_empresaDetalleTablaAmorti.setLayout(this.gridaBagLayoutDetalleTablaAmorti);


		jComboBoxid_empresaDetalleTablaAmorti= new JComboBoxMe();
		jComboBoxid_empresaDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleTablaAmorti.setEnabled(false);

		this.jButtonid_empresaDetalleTablaAmorti= new JButtonMe();
		this.jButtonid_empresaDetalleTablaAmorti.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleTablaAmorti.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleTablaAmorti.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleTablaAmorti.setText("Buscar");
		this.jButtonid_empresaDetalleTablaAmorti.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleTablaAmorti.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleTablaAmorti,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleTablaAmorti"));

		this.jButtonid_empresaDetalleTablaAmortiBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleTablaAmortiBusqueda.setText("U");
		this.jButtonid_empresaDetalleTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleTablaAmortiBusqueda"));

		if(this.detalletablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleTablaAmortiBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleTablaAmortiUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleTablaAmortiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleTablaAmortiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleTablaAmortiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleTablaAmortiUpdate.setText("U");
		this.jButtonid_empresaDetalleTablaAmortiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleTablaAmortiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleTablaAmortiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleTablaAmortiUpdate"));



					
		this.jLabelid_sucursalDetalleTablaAmorti = new JLabelMe();
		this.jLabelid_sucursalDetalleTablaAmorti.setText(""+DetalleTablaAmortiConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleTablaAmorti.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleTablaAmorti.setToolTipText(DetalleTablaAmortiConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleTablaAmorti = new GridBagLayout();
		this.jPanelid_sucursalDetalleTablaAmorti.setLayout(this.gridaBagLayoutDetalleTablaAmorti);


		jComboBoxid_sucursalDetalleTablaAmorti= new JComboBoxMe();
		jComboBoxid_sucursalDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleTablaAmorti.setEnabled(false);

		this.jButtonid_sucursalDetalleTablaAmorti= new JButtonMe();
		this.jButtonid_sucursalDetalleTablaAmorti.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleTablaAmorti.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleTablaAmorti.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleTablaAmorti.setText("Buscar");
		this.jButtonid_sucursalDetalleTablaAmorti.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleTablaAmorti.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleTablaAmorti,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleTablaAmorti"));

		this.jButtonid_sucursalDetalleTablaAmortiBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleTablaAmortiBusqueda.setText("U");
		this.jButtonid_sucursalDetalleTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleTablaAmortiBusqueda"));

		if(this.detalletablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleTablaAmortiBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleTablaAmortiUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleTablaAmortiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleTablaAmortiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleTablaAmortiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleTablaAmortiUpdate.setText("U");
		this.jButtonid_sucursalDetalleTablaAmortiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleTablaAmortiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleTablaAmortiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleTablaAmortiUpdate"));



					
		this.jLabelid_ejercicioDetalleTablaAmorti = new JLabelMe();
		this.jLabelid_ejercicioDetalleTablaAmorti.setText(""+DetalleTablaAmortiConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetalleTablaAmorti.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetalleTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetalleTablaAmorti.setToolTipText(DetalleTablaAmortiConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetalleTablaAmorti = new GridBagLayout();
		this.jPanelid_ejercicioDetalleTablaAmorti.setLayout(this.gridaBagLayoutDetalleTablaAmorti);


		jComboBoxid_ejercicioDetalleTablaAmorti= new JComboBoxMe();
		jComboBoxid_ejercicioDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetalleTablaAmorti.setEnabled(false);

		this.jButtonid_ejercicioDetalleTablaAmorti= new JButtonMe();
		this.jButtonid_ejercicioDetalleTablaAmorti.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleTablaAmorti.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleTablaAmorti.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleTablaAmorti.setText("Buscar");
		this.jButtonid_ejercicioDetalleTablaAmorti.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetalleTablaAmorti.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleTablaAmorti,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleTablaAmorti"));

		this.jButtonid_ejercicioDetalleTablaAmortiBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetalleTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleTablaAmortiBusqueda.setText("U");
		this.jButtonid_ejercicioDetalleTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetalleTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleTablaAmortiBusqueda"));

		if(this.detalletablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetalleTablaAmortiBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetalleTablaAmortiUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetalleTablaAmortiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleTablaAmortiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleTablaAmortiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleTablaAmortiUpdate.setText("U");
		this.jButtonid_ejercicioDetalleTablaAmortiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetalleTablaAmortiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleTablaAmortiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleTablaAmortiUpdate"));



					
		this.jLabelid_periodoDetalleTablaAmorti = new JLabelMe();
		this.jLabelid_periodoDetalleTablaAmorti.setText(""+DetalleTablaAmortiConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetalleTablaAmorti.setToolTipText("Periodo");
		this.jLabelid_periodoDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetalleTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetalleTablaAmorti.setToolTipText(DetalleTablaAmortiConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetalleTablaAmorti = new GridBagLayout();
		this.jPanelid_periodoDetalleTablaAmorti.setLayout(this.gridaBagLayoutDetalleTablaAmorti);


		jComboBoxid_periodoDetalleTablaAmorti= new JComboBoxMe();
		jComboBoxid_periodoDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetalleTablaAmorti.setEnabled(false);

		this.jButtonid_periodoDetalleTablaAmorti= new JButtonMe();
		this.jButtonid_periodoDetalleTablaAmorti.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleTablaAmorti.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleTablaAmorti.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleTablaAmorti.setText("Buscar");
		this.jButtonid_periodoDetalleTablaAmorti.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetalleTablaAmorti.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleTablaAmorti,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleTablaAmorti"));

		this.jButtonid_periodoDetalleTablaAmortiBusqueda= new JButtonMe();
		this.jButtonid_periodoDetalleTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleTablaAmortiBusqueda.setText("U");
		this.jButtonid_periodoDetalleTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetalleTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleTablaAmortiBusqueda"));

		if(this.detalletablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetalleTablaAmortiBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetalleTablaAmortiUpdate= new JButtonMe();
		this.jButtonid_periodoDetalleTablaAmortiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleTablaAmortiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleTablaAmortiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleTablaAmortiUpdate.setText("U");
		this.jButtonid_periodoDetalleTablaAmortiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetalleTablaAmortiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleTablaAmortiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleTablaAmortiUpdate"));



					
		this.jLabelid_tabla_amortiDetalleTablaAmorti = new JLabelMe();
		this.jLabelid_tabla_amortiDetalleTablaAmorti.setText(""+DetalleTablaAmortiConstantesFunciones.LABEL_IDTABLAAMORTI+" : *");
		this.jLabelid_tabla_amortiDetalleTablaAmorti.setToolTipText("Tabla Amorti");
		this.jLabelid_tabla_amortiDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tabla_amortiDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tabla_amortiDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tabla_amortiDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tabla_amortiDetalleTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tabla_amortiDetalleTablaAmorti.setToolTipText(DetalleTablaAmortiConstantesFunciones.LABEL_IDTABLAAMORTI);
		this.gridaBagLayoutDetalleTablaAmorti = new GridBagLayout();
		this.jPanelid_tabla_amortiDetalleTablaAmorti.setLayout(this.gridaBagLayoutDetalleTablaAmorti);


		jComboBoxid_tabla_amortiDetalleTablaAmorti= new JComboBoxMe();
		jComboBoxid_tabla_amortiDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tabla_amortiDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tabla_amortiDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tabla_amortiDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tabla_amortiDetalleTablaAmorti= new JButtonMe();
		this.jButtonid_tabla_amortiDetalleTablaAmorti.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tabla_amortiDetalleTablaAmorti.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tabla_amortiDetalleTablaAmorti.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tabla_amortiDetalleTablaAmorti.setText("Buscar");
		this.jButtonid_tabla_amortiDetalleTablaAmorti.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tabla_amortiDetalleTablaAmorti.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tabla_amortiDetalleTablaAmorti,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tabla_amortiDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tabla_amortiDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tabla_amortiDetalleTablaAmorti"));

		this.jButtonid_tabla_amortiDetalleTablaAmortiBusqueda= new JButtonMe();
		this.jButtonid_tabla_amortiDetalleTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tabla_amortiDetalleTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tabla_amortiDetalleTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tabla_amortiDetalleTablaAmortiBusqueda.setText("U");
		this.jButtonid_tabla_amortiDetalleTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tabla_amortiDetalleTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tabla_amortiDetalleTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tabla_amortiDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tabla_amortiDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tabla_amortiDetalleTablaAmortiBusqueda"));

		if(this.detalletablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tabla_amortiDetalleTablaAmortiBusqueda.setVisible(false);		}

		this.jButtonid_tabla_amortiDetalleTablaAmortiUpdate= new JButtonMe();
		this.jButtonid_tabla_amortiDetalleTablaAmortiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tabla_amortiDetalleTablaAmortiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tabla_amortiDetalleTablaAmortiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tabla_amortiDetalleTablaAmortiUpdate.setText("U");
		this.jButtonid_tabla_amortiDetalleTablaAmortiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tabla_amortiDetalleTablaAmortiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tabla_amortiDetalleTablaAmortiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tabla_amortiDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tabla_amortiDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tabla_amortiDetalleTablaAmortiUpdate"));



					
		this.jLabelid_anioDetalleTablaAmorti = new JLabelMe();
		this.jLabelid_anioDetalleTablaAmorti.setText(""+DetalleTablaAmortiConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetalleTablaAmorti.setToolTipText("Anio");
		this.jLabelid_anioDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetalleTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetalleTablaAmorti.setToolTipText(DetalleTablaAmortiConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetalleTablaAmorti = new GridBagLayout();
		this.jPanelid_anioDetalleTablaAmorti.setLayout(this.gridaBagLayoutDetalleTablaAmorti);


		jComboBoxid_anioDetalleTablaAmorti= new JComboBoxMe();
		jComboBoxid_anioDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetalleTablaAmorti.setEnabled(false);

		this.jButtonid_anioDetalleTablaAmorti= new JButtonMe();
		this.jButtonid_anioDetalleTablaAmorti.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleTablaAmorti.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleTablaAmorti.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleTablaAmorti.setText("Buscar");
		this.jButtonid_anioDetalleTablaAmorti.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetalleTablaAmorti.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleTablaAmorti,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleTablaAmorti"));

		this.jButtonid_anioDetalleTablaAmortiBusqueda= new JButtonMe();
		this.jButtonid_anioDetalleTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleTablaAmortiBusqueda.setText("U");
		this.jButtonid_anioDetalleTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetalleTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleTablaAmortiBusqueda"));

		if(this.detalletablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetalleTablaAmortiBusqueda.setVisible(false);		}

		this.jButtonid_anioDetalleTablaAmortiUpdate= new JButtonMe();
		this.jButtonid_anioDetalleTablaAmortiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleTablaAmortiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleTablaAmortiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleTablaAmortiUpdate.setText("U");
		this.jButtonid_anioDetalleTablaAmortiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetalleTablaAmortiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleTablaAmortiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleTablaAmortiUpdate"));



					
		this.jLabelid_mesDetalleTablaAmorti = new JLabelMe();
		this.jLabelid_mesDetalleTablaAmorti.setText(""+DetalleTablaAmortiConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetalleTablaAmorti.setToolTipText("Mes");
		this.jLabelid_mesDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetalleTablaAmorti=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetalleTablaAmorti.setToolTipText(DetalleTablaAmortiConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetalleTablaAmorti = new GridBagLayout();
		this.jPanelid_mesDetalleTablaAmorti.setLayout(this.gridaBagLayoutDetalleTablaAmorti);


		jComboBoxid_mesDetalleTablaAmorti= new JComboBoxMe();
		jComboBoxid_mesDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetalleTablaAmorti.setEnabled(false);

		this.jButtonid_mesDetalleTablaAmorti= new JButtonMe();
		this.jButtonid_mesDetalleTablaAmorti.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleTablaAmorti.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleTablaAmorti.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleTablaAmorti.setText("Buscar");
		this.jButtonid_mesDetalleTablaAmorti.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetalleTablaAmorti.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleTablaAmorti,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleTablaAmorti"));

		this.jButtonid_mesDetalleTablaAmortiBusqueda= new JButtonMe();
		this.jButtonid_mesDetalleTablaAmortiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleTablaAmortiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleTablaAmortiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleTablaAmortiBusqueda.setText("U");
		this.jButtonid_mesDetalleTablaAmortiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetalleTablaAmortiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleTablaAmortiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleTablaAmortiBusqueda"));

		if(this.detalletablaamortiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetalleTablaAmortiBusqueda.setVisible(false);		}

		this.jButtonid_mesDetalleTablaAmortiUpdate= new JButtonMe();
		this.jButtonid_mesDetalleTablaAmortiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleTablaAmortiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleTablaAmortiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleTablaAmortiUpdate.setText("U");
		this.jButtonid_mesDetalleTablaAmortiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetalleTablaAmortiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleTablaAmortiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleTablaAmortiUpdate"));



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
		//this.jInternalFrameDetalleDetalleTablaAmorti = new DetalleTablaAmortiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Tabla Amorti DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleTablaAmorti= new GridBagLayout();
		

		
		String sToolTipDetalleTablaAmorti="";
		sToolTipDetalleTablaAmorti=DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleTablaAmorti+="(Facturacion.DetalleTablaAmorti)";
		}
		
		if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleTablaAmorti+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleTablaAmorti = new JButtonMe();
		this.jButtonModificarDetalleTablaAmorti = new JButtonMe();
        this.jButtonActualizarDetalleTablaAmorti = new JButtonMe();
        this.jButtonEliminarDetalleTablaAmorti = new JButtonMe();
        this.jButtonCancelarDetalleTablaAmorti = new JButtonMe();
        this.jButtonGuardarCambiosDetalleTablaAmorti = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleTablaAmorti = new JButtonMe();
		this.jButtonCerrarDetalleTablaAmorti = new JButtonMe();
		
		this.jScrollPanelDatosDetalleTablaAmorti = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleTablaAmorti = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleTablaAmorti = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Tabla Amorti";
		
		if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Tabla Amortis" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleTablaAmorti.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleTablaAmorti.setName("jPanelCamposDetalleTablaAmorti"); 

		this.jPanelCamposOcultosDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleTablaAmorti.setName("jPanelCamposOcultosDetalleTablaAmorti"); 

        this.jPanelAccionesDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleTablaAmorti.setToolTipText("Acciones");
        this.jPanelAccionesDetalleTablaAmorti.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleTablaAmorti.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleTablaAmorti.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleTablaAmorti.setText("Nuevo");
		this.jButtonModificarDetalleTablaAmorti.setText("Editar");
        this.jButtonActualizarDetalleTablaAmorti.setText("Actualizar");
        this.jButtonEliminarDetalleTablaAmorti.setText("Eliminar");
        this.jButtonCancelarDetalleTablaAmorti.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleTablaAmorti.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleTablaAmorti.setText("Guardar");
		this.jButtonCerrarDetalleTablaAmorti.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleTablaAmorti,"nuevo_button","Nuevo",this.detalletablaamortiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleTablaAmorti,"modificar_button","Editar",this.detalletablaamortiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleTablaAmorti,"actualizar_button","Actualizar",this.detalletablaamortiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleTablaAmorti,"eliminar_button","Eliminar",this.detalletablaamortiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleTablaAmorti,"cancelar_button","Cancelar",this.detalletablaamortiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleTablaAmorti,"guardarcambios_button","Guardar",this.detalletablaamortiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleTablaAmorti,"guardarcambiostabla_button","Guardar",this.detalletablaamortiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleTablaAmorti,"cerrar_button","Salir",this.detalletablaamortiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleTablaAmorti.setToolTipText("Nuevo"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleTablaAmorti.setToolTipText("Editar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleTablaAmorti.setToolTipText("Actualizar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleTablaAmorti.setToolTipText("Eliminar)"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleTablaAmorti.setToolTipText("Cancelar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleTablaAmorti.setToolTipText("Guardar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleTablaAmorti.setToolTipText("Guardar"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleTablaAmorti.setToolTipText("Salir"+" "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleTablaAmorti";
		inputMap = this.jButtonNuevoDetalleTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleTablaAmorti.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleTablaAmorti"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleTablaAmorti";
		inputMap = this.jButtonActualizarDetalleTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleTablaAmorti"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleTablaAmorti";
		inputMap = this.jButtonEliminarDetalleTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleTablaAmorti"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleTablaAmorti";
		inputMap = this.jButtonCancelarDetalleTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleTablaAmorti"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleTablaAmorti";
		inputMap = this.jButtonCerrarDetalleTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleTablaAmorti"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleTablaAmorti";
		inputMap = this.jButtonGuardarCambiosTablaDetalleTablaAmorti.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleTablaAmorti.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleTablaAmorti"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleTablaAmorti = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleTablaAmorti.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleTablaAmorti.setToolTipText("Nuevo DetalleTablaAmorti");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleTablaAmorti = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleTablaAmorti.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleTablaAmorti.setToolTipText("Sin Cerrar Ventana DetalleTablaAmorti");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleTablaAmorti = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleTablaAmorti.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleTablaAmorti.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleTablaAmorti = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleTablaAmorti.setText("Accion");
		this.jComboBoxTiposAccionesDetalleTablaAmorti.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleTablaAmorti = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleTablaAmorti.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleTablaAmorti.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleTablaAmorti = new JLabelMe();
		
		this.jLabelAccionesDetalleTablaAmorti.setText("Acciones");		
		this.jLabelAccionesDetalleTablaAmorti.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleTablaAmorti.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleTablaAmorti.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleTablaAmorti();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleTablaAmorti();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleTablaAmorti=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleTablaAmorti.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleTablaAmorti,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleTablaAmorti.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleTablaAmorti.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleTablaAmorti.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleTablaAmorti.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleTablaAmorti.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleTablaAmorti.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleTablaAmorti, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleTablaAmorti = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleTablaAmorti = new GridBagLayout();
		
		this.jPanelCamposDetalleTablaAmorti.setLayout(gridaBagLayoutCamposDetalleTablaAmorti);
		this.jPanelCamposOcultosDetalleTablaAmorti.setLayout(gridaBagLayoutCamposOcultosDetalleTablaAmorti);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleTablaAmorti.add(jLabelIdDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 1;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleTablaAmorti.add(jLabelidDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);


	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleTablaAmorti.add(jLabelid_empresaDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 2;
		this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
		this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleTablaAmorti.add(jButtonid_empresaDetalleTablaAmortiBusqueda, this.gridBagConstraintsDetalleTablaAmorti);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 3;
		this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
		this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleTablaAmorti.add(jButtonid_empresaDetalleTablaAmortiUpdate, this.gridBagConstraintsDetalleTablaAmorti);
	}

	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 1;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleTablaAmorti.add(jComboBoxid_empresaDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);


	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleTablaAmorti.add(jLabelid_sucursalDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 2;
		this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
		this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleTablaAmorti.add(jButtonid_sucursalDetalleTablaAmortiBusqueda, this.gridBagConstraintsDetalleTablaAmorti);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 3;
		this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
		this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleTablaAmorti.add(jButtonid_sucursalDetalleTablaAmortiUpdate, this.gridBagConstraintsDetalleTablaAmorti);
	}

	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 1;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleTablaAmorti.add(jComboBoxid_sucursalDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);


	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetalleTablaAmorti.add(jLabelid_ejercicioDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 2;
		this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
		this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleTablaAmorti.add(jButtonid_ejercicioDetalleTablaAmortiBusqueda, this.gridBagConstraintsDetalleTablaAmorti);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 3;
		this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
		this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleTablaAmorti.add(jButtonid_ejercicioDetalleTablaAmortiUpdate, this.gridBagConstraintsDetalleTablaAmorti);
	}

	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 1;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetalleTablaAmorti.add(jComboBoxid_ejercicioDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);


	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetalleTablaAmorti.add(jLabelid_periodoDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 2;
		this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
		this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleTablaAmorti.add(jButtonid_periodoDetalleTablaAmortiBusqueda, this.gridBagConstraintsDetalleTablaAmorti);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 3;
		this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
		this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleTablaAmorti.add(jButtonid_periodoDetalleTablaAmortiUpdate, this.gridBagConstraintsDetalleTablaAmorti);
	}

	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 1;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetalleTablaAmorti.add(jComboBoxid_periodoDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);


	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tabla_amortiDetalleTablaAmorti.add(jLabelid_tabla_amortiDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 2;
		this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
		this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tabla_amortiDetalleTablaAmorti.add(jButtonid_tabla_amortiDetalleTablaAmortiBusqueda, this.gridBagConstraintsDetalleTablaAmorti);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 3;
		this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
		this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tabla_amortiDetalleTablaAmorti.add(jButtonid_tabla_amortiDetalleTablaAmortiUpdate, this.gridBagConstraintsDetalleTablaAmorti);
	}

	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 1;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tabla_amortiDetalleTablaAmorti.add(jComboBoxid_tabla_amortiDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);


	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorDetalleTablaAmorti.add(jLabelvalorDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 2;
		this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
		this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorDetalleTablaAmorti.add(jButtonvalorDetalleTablaAmortiBusqueda, this.gridBagConstraintsDetalleTablaAmorti);
	}

	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 1;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorDetalleTablaAmorti.add(jTextFieldvalorDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);


	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelinteresDetalleTablaAmorti.add(jLabelinteresDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 2;
		this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
		this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelinteresDetalleTablaAmorti.add(jButtoninteresDetalleTablaAmortiBusqueda, this.gridBagConstraintsDetalleTablaAmorti);
	}

	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 1;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelinteresDetalleTablaAmorti.add(jTextFieldinteresDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);


	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcapitalDetalleTablaAmorti.add(jLabelcapitalDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 2;
		this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
		this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelcapitalDetalleTablaAmorti.add(jButtoncapitalDetalleTablaAmortiBusqueda, this.gridBagConstraintsDetalleTablaAmorti);
	}

	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 1;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcapitalDetalleTablaAmorti.add(jTextFieldcapitalDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);


	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioDetalleTablaAmorti.add(jLabelfecha_inicioDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 2;
		this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
		this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioDetalleTablaAmorti.add(jButtonfecha_inicioDetalleTablaAmortiBusqueda, this.gridBagConstraintsDetalleTablaAmorti);
	}

	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 1;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioDetalleTablaAmorti.add(jDateChooserfecha_inicioDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);


	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finDetalleTablaAmorti.add(jLabelfecha_finDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 2;
		this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
		this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finDetalleTablaAmorti.add(jButtonfecha_finDetalleTablaAmortiBusqueda, this.gridBagConstraintsDetalleTablaAmorti);
	}

	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 1;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finDetalleTablaAmorti.add(jDateChooserfecha_finDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);


	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetalleTablaAmorti.add(jLabeldescripcionDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 2;
		this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
		this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetalleTablaAmorti.add(jButtondescripcionDetalleTablaAmortiBusqueda, this.gridBagConstraintsDetalleTablaAmorti);
	}

	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 1;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetalleTablaAmorti.add(jTextFielddescripcionDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);


	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDetalleTablaAmorti.add(jLabelid_anioDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 2;
		this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
		this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleTablaAmorti.add(jButtonid_anioDetalleTablaAmortiBusqueda, this.gridBagConstraintsDetalleTablaAmorti);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 3;
		this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
		this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleTablaAmorti.add(jButtonid_anioDetalleTablaAmortiUpdate, this.gridBagConstraintsDetalleTablaAmorti);
	}

	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 1;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDetalleTablaAmorti.add(jComboBoxid_anioDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);


	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDetalleTablaAmorti.add(jLabelid_mesDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 2;
		this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
		this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleTablaAmorti.add(jButtonid_mesDetalleTablaAmortiBusqueda, this.gridBagConstraintsDetalleTablaAmorti);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 3;
		this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
		this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleTablaAmorti.add(jButtonid_mesDetalleTablaAmortiUpdate, this.gridBagConstraintsDetalleTablaAmorti);
	}

	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = 1;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDetalleTablaAmorti.add(jComboBoxid_mesDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = iYPanelCamposDetalleTablaAmorti;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = iXPanelCamposDetalleTablaAmorti++;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleTablaAmorti.add(this.jPanelidDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(iXPanelCamposDetalleTablaAmorti % 2==0) {
		iXPanelCamposDetalleTablaAmorti=0;
		iYPanelCamposDetalleTablaAmorti++;
	}
	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = iYPanelCamposDetalleTablaAmorti;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = iXPanelCamposDetalleTablaAmorti++;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleTablaAmorti.add(this.jPanelid_tabla_amortiDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(iXPanelCamposDetalleTablaAmorti % 2==0) {
		iXPanelCamposDetalleTablaAmorti=0;
		iYPanelCamposDetalleTablaAmorti++;
	}
	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = iYPanelCamposDetalleTablaAmorti;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = iXPanelCamposDetalleTablaAmorti++;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleTablaAmorti.add(this.jPanelvalorDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(iXPanelCamposDetalleTablaAmorti % 2==0) {
		iXPanelCamposDetalleTablaAmorti=0;
		iYPanelCamposDetalleTablaAmorti++;
	}
	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = iYPanelCamposDetalleTablaAmorti;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = iXPanelCamposDetalleTablaAmorti++;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleTablaAmorti.add(this.jPanelinteresDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(iXPanelCamposDetalleTablaAmorti % 2==0) {
		iXPanelCamposDetalleTablaAmorti=0;
		iYPanelCamposDetalleTablaAmorti++;
	}
	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = iYPanelCamposDetalleTablaAmorti;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = iXPanelCamposDetalleTablaAmorti++;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleTablaAmorti.add(this.jPanelcapitalDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(iXPanelCamposDetalleTablaAmorti % 2==0) {
		iXPanelCamposDetalleTablaAmorti=0;
		iYPanelCamposDetalleTablaAmorti++;
	}
	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = iYPanelCamposDetalleTablaAmorti;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = iXPanelCamposDetalleTablaAmorti++;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleTablaAmorti.add(this.jPanelfecha_inicioDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(iXPanelCamposDetalleTablaAmorti % 2==0) {
		iXPanelCamposDetalleTablaAmorti=0;
		iYPanelCamposDetalleTablaAmorti++;
	}
	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = iYPanelCamposDetalleTablaAmorti;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = iXPanelCamposDetalleTablaAmorti++;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleTablaAmorti.add(this.jPanelfecha_finDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(iXPanelCamposDetalleTablaAmorti % 2==0) {
		iXPanelCamposDetalleTablaAmorti=0;
		iYPanelCamposDetalleTablaAmorti++;
	}
	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = iYPanelCamposDetalleTablaAmorti;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = iXPanelCamposDetalleTablaAmorti++;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleTablaAmorti.add(this.jPaneldescripcionDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(iXPanelCamposDetalleTablaAmorti % 2==0) {
		iXPanelCamposDetalleTablaAmorti=0;
		iYPanelCamposDetalleTablaAmorti++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = iYPanelCamposOcultosDetalleTablaAmorti;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = iXPanelCamposOcultosDetalleTablaAmorti++;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleTablaAmorti.add(this.jPanelid_empresaDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(iXPanelCamposOcultosDetalleTablaAmorti % 2==0) {
		iXPanelCamposOcultosDetalleTablaAmorti=0;
		iYPanelCamposOcultosDetalleTablaAmorti++;
	}
	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = iYPanelCamposOcultosDetalleTablaAmorti;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = iXPanelCamposOcultosDetalleTablaAmorti++;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleTablaAmorti.add(this.jPanelid_sucursalDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(iXPanelCamposOcultosDetalleTablaAmorti % 2==0) {
		iXPanelCamposOcultosDetalleTablaAmorti=0;
		iYPanelCamposOcultosDetalleTablaAmorti++;
	}
	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = iYPanelCamposOcultosDetalleTablaAmorti;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = iXPanelCamposOcultosDetalleTablaAmorti++;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleTablaAmorti.add(this.jPanelid_ejercicioDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(iXPanelCamposOcultosDetalleTablaAmorti % 2==0) {
		iXPanelCamposOcultosDetalleTablaAmorti=0;
		iYPanelCamposOcultosDetalleTablaAmorti++;
	}
	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = iYPanelCamposOcultosDetalleTablaAmorti;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = iXPanelCamposOcultosDetalleTablaAmorti++;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleTablaAmorti.add(this.jPanelid_periodoDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(iXPanelCamposOcultosDetalleTablaAmorti % 2==0) {
		iXPanelCamposOcultosDetalleTablaAmorti=0;
		iYPanelCamposOcultosDetalleTablaAmorti++;
	}
	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = iYPanelCamposOcultosDetalleTablaAmorti;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = iXPanelCamposOcultosDetalleTablaAmorti++;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleTablaAmorti.add(this.jPanelid_anioDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(iXPanelCamposOcultosDetalleTablaAmorti % 2==0) {
		iXPanelCamposOcultosDetalleTablaAmorti=0;
		iYPanelCamposOcultosDetalleTablaAmorti++;
	}
	this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTablaAmorti.gridy = iYPanelCamposOcultosDetalleTablaAmorti;
	this.gridBagConstraintsDetalleTablaAmorti.gridx = iXPanelCamposOcultosDetalleTablaAmorti++;
	this.gridBagConstraintsDetalleTablaAmorti.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTablaAmorti.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleTablaAmorti.add(this.jPanelid_mesDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);



	if(iXPanelCamposOcultosDetalleTablaAmorti % 2==0) {
		iXPanelCamposOcultosDetalleTablaAmorti=0;
		iYPanelCamposOcultosDetalleTablaAmorti++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleTablaAmorti= new GridBagLayout();
		this.jPanelAccionesDetalleTablaAmorti.setLayout(gridaBagLayoutAccionesDetalleTablaAmorti);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleTablaAmorti= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleTablaAmorti.setLayout(gridaBagLayoutAccionesFormularioDetalleTablaAmorti);
		
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleTablaAmorti.add(this.jComboBoxTiposAccionesFormularioDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleTablaAmorti.add(this.jCheckBoxPostAccionNuevoDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalletablaamortiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleTablaAmorti.add(this.jCheckBoxPostAccionSinCerrarDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalletablaamortiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleTablaAmorti.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleTablaAmorti.add(this.jCheckBoxPostAccionSinMensajeDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleTablaAmorti.add(this.jButtonModificarDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);							

		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;
		this.gridBagConstraintsDetalleTablaAmorti.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleTablaAmorti.add(this.jButtonEliminarDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		
			
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleTablaAmorti.add(this.jButtonActualizarDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);


		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleTablaAmorti.add(this.jButtonGuardarCambiosDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);	
		
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.gridy = 0;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleTablaAmorti.add(this.jButtonCancelarDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleTablaAmorti = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleTablaAmorti);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();						
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;		
			//this.gridBagConstraintsDetalleTablaAmorti.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleTablaAmorti.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleTablaAmorti.gridx =0;
		this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleTablaAmorti.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleTablaAmortiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleTablaAmorti = new DetalleTablaAmortiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Tabla Amorti DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Tabla Amorti DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Tabla Amorti Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleTablaAmortiModel detalletablaamortiModel=new DetalleTablaAmortiModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleTablaAmortiModel.DetalleTablaAmortiFocusTraversalPolicy detalletablaamortiFocusTraversalPolicy = detalletablaamortiModel.new DetalleTablaAmortiFocusTraversalPolicy(this);
			
			//detalletablaamortiFocusTraversalPolicy.setdetalletablaamortiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalletablaamortiModel);
			
			
			this.jContentPaneDetalleDetalleTablaAmorti = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleTablaAmorti = new GridBagLayout();	
			this.jContentPaneDetalleDetalleTablaAmorti.setLayout(gridaBagLayoutDetalleDetalleTablaAmorti);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleTablaAmorti = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
				this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleTablaAmorti.add(jTtoolBarDetalleDetalleTablaAmorti, gridBagConstraintsDetalleTablaAmorti);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleTablaAmorti=   new JScrollPane(jContentPaneDetalleDetalleTablaAmorti,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleTablaAmorti.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleTablaAmorti.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleTablaAmorti.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleTablaAmorti=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleTablaAmorti.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleTablaAmorti.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleTablaAmorti.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
	        
			this.jContentPaneDetalleDetalleTablaAmorti.add(jPanelCamposDetalleTablaAmorti, gridBagConstraintsDetalleTablaAmorti);
			
			
			
			
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
						&& detalletablaamortiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detalletablaamortiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleTablaAmorti= new GridBagConstraints();
						this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
						this.jContentPaneDetalleDetalleTablaAmorti.add(this.jTabbedPaneRelacionesDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleTablaAmorti.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleTablaAmorti.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
					this.gridBagConstraintsDetalleTablaAmorti.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleTablaAmorti.add(jPanelCamposOcultosDetalleTablaAmorti, gridBagConstraintsDetalleTablaAmorti);
				
					this.jPanelCamposOcultosDetalleTablaAmorti.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
	        this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleTablaAmorti.add(this.jPanelAccionesFormularioDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);							
			
			
			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
	        this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleTablaAmorti.add(this.jPanelAccionesDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleTablaAmorti);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleTablaAmorti=   new JScrollPane(this.jPanelCamposDetalleTablaAmorti,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleTablaAmorti.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleTablaAmorti.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleTablaAmorti.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
			this.gridBagConstraintsDetalleTablaAmorti.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleTablaAmorti.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleTablaAmorti.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);			
			
			this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
			this.gridBagConstraintsDetalleTablaAmorti.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
			
			
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		
			
		this.gridBagConstraintsDetalleTablaAmorti = new GridBagConstraints();
		this.gridBagConstraintsDetalleTablaAmorti.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTablaAmorti.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleTablaAmorti, this.gridBagConstraintsDetalleTablaAmorti);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleTablaAmorti;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleTablaAmorti;
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
