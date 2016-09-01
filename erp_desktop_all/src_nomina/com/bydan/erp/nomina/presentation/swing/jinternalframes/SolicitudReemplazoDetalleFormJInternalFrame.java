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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.SolicitudReemplazoConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class SolicitudReemplazoDetalleFormJInternalFrame extends SolicitudReemplazoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSolicitudReemplazo;
	
	protected JMenuBar jmenuBarDetalleSolicitudReemplazo;
	
	protected JMenu jmenuDetalleSolicitudReemplazo;
	protected JMenu jmenuDetalleArchivoSolicitudReemplazo;
	protected JMenu jmenuDetalleAccionesSolicitudReemplazo;
	protected JMenu jmenuDetalleDatosSolicitudReemplazo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSolicitudReemplazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSolicitudReemplazo;	
	protected GridBagConstraints gridBagConstraintsSolicitudReemplazo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SolicitudReemplazoBeanSwingJInternalFrameAdditional jInternalFrameDetalleSolicitudReemplazo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EmpleadoBeanSwingJInternalFrame empleadojefeBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadojefe="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EmpleadoBeanSwingJInternalFrame empleadoreemplazoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadoreemplazo="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EstadoSolicitudNomiBeanSwingJInternalFrame estadosolicitudnomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadosolicitudnomi="";
	
	public SolicitudReemplazoSessionBean solicitudreemplazoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EmpleadoSessionBean empleadojefeSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EmpleadoSessionBean empleadoreemplazoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EstadoSolicitudNomiSessionBean estadosolicitudnomiSessionBean;	
	
	public SolicitudReemplazoLogic solicitudreemplazoLogic;
	
	public JScrollPane jScrollPanelDatosSolicitudReemplazo;
	public JScrollPane jScrollPanelDatosEdicionSolicitudReemplazo;
	public JScrollPane jScrollPanelDatosGeneralSolicitudReemplazo;
	
	protected JPanel jPanelCamposSolicitudReemplazo;    
	protected JPanel jPanelCamposOcultosSolicitudReemplazo;    	
	protected JPanel jPanelAccionesSolicitudReemplazo;
	protected JPanel jPanelAccionesFormularioSolicitudReemplazo;
    
	
	
	protected Integer iXPanelCamposSolicitudReemplazo=0;
	protected Integer iYPanelCamposSolicitudReemplazo=0;
	
	protected Integer iXPanelCamposOcultosSolicitudReemplazo=0;
	protected Integer iYPanelCamposOcultosSolicitudReemplazo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSolicitudReemplazo;
	public JButton jButtonModificarSolicitudReemplazo;
	public JButton jButtonActualizarSolicitudReemplazo;
    public JButton jButtonEliminarSolicitudReemplazo;
	public JButton jButtonCancelarSolicitudReemplazo;
    public JButton jButtonGuardarCambiosSolicitudReemplazo;
	public JButton jButtonGuardarCambiosTablaSolicitudReemplazo;
	protected JButton jButtonCerrarSolicitudReemplazo;
	
	
	protected JButton jButtonProcesarInformacionSolicitudReemplazo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSolicitudReemplazo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSolicitudReemplazo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSolicitudReemplazo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSolicitudReemplazo;
	protected JButton jButtonModificarToolBarSolicitudReemplazo;
	protected JButton jButtonActualizarToolBarSolicitudReemplazo;
    protected JButton jButtonEliminarToolBarSolicitudReemplazo;
	protected JButton jButtonCancelarToolBarSolicitudReemplazo;
    protected JButton jButtonGuardarCambiosToolBarSolicitudReemplazo;
	protected JButton jButtonGuardarCambiosTablaToolBarSolicitudReemplazo;
	protected JButton jButtonMostrarOcultarTablaToolBarSolicitudReemplazo;
	protected JButton jButtonCerrarToolBarSolicitudReemplazo;
	
	protected JButton jButtonProcesarInformacionToolBarSolicitudReemplazo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSolicitudReemplazo;
	protected JMenuItem jMenuItemModificarSolicitudReemplazo;
	protected JMenuItem jMenuItemActualizarSolicitudReemplazo;
    protected JMenuItem jMenuItemEliminarSolicitudReemplazo;
	protected JMenuItem jMenuItemCancelarSolicitudReemplazo;
    protected JMenuItem jMenuItemGuardarCambiosSolicitudReemplazo;
	protected JMenuItem jMenuItemGuardarCambiosTablaSolicitudReemplazo;
	protected JMenuItem jMenuItemCerrarSolicitudReemplazo;
	protected JMenuItem jMenuItemDetalleCerrarSolicitudReemplazo;
	protected JMenuItem jMenuItemDetalleMostarOcultarSolicitudReemplazo;
	
	protected JMenuItem jMenuItemProcesarInformacionSolicitudReemplazo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSolicitudReemplazo;
	protected JMenuItem jMenuItemMostrarOcultarSolicitudReemplazo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSolicitudReemplazo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSolicitudReemplazo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSolicitudReemplazo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSolicitudReemplazo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSolicitudReemplazo;
	public JLabel jLabelIdSolicitudReemplazo;
	public JLabel jLabelidSolicitudReemplazo;
	public JButton jButtonidSolicitudReemplazoBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialSolicitudReemplazo;
	public JLabel jLabelsecuencialSolicitudReemplazo;
	public JTextField jTextFieldsecuencialSolicitudReemplazo;
	public JButton jButtonsecuencialSolicitudReemplazoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_solicitaSolicitudReemplazo;
	public JLabel jLabelfecha_solicitaSolicitudReemplazo;
	//public JFormattedTextField jDateChooserfecha_solicitaSolicitudReemplazo;

	public JDateChooser jDateChooserfecha_solicitaSolicitudReemplazo;
	public JButton jButtonfecha_solicitaSolicitudReemplazoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ejecutaSolicitudReemplazo;
	public JLabel jLabelfecha_ejecutaSolicitudReemplazo;
	//public JFormattedTextField jDateChooserfecha_ejecutaSolicitudReemplazo;

	public JDateChooser jDateChooserfecha_ejecutaSolicitudReemplazo;
	public JButton jButtonfecha_ejecutaSolicitudReemplazoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_horasSolicitudReemplazo;
	public JLabel jLabelnumero_horasSolicitudReemplazo;
	public JTextField jTextFieldnumero_horasSolicitudReemplazo;
	public JButton jButtonnumero_horasSolicitudReemplazoBusqueda= new JButtonMe();

	public JPanel jPanelcosto_unitarioSolicitudReemplazo;
	public JLabel jLabelcosto_unitarioSolicitudReemplazo;
	public JTextField jTextFieldcosto_unitarioSolicitudReemplazo;
	public JButton jButtoncosto_unitarioSolicitudReemplazoBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalSolicitudReemplazo;
	public JLabel jLabelcosto_totalSolicitudReemplazo;
	public JTextField jTextFieldcosto_totalSolicitudReemplazo;
	public JButton jButtoncosto_totalSolicitudReemplazoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionSolicitudReemplazo;
	public JLabel jLabeldescripcionSolicitudReemplazo;
	public JTextArea jTextAreadescripcionSolicitudReemplazo;
	public JScrollPane jscrollPanedescripcionSolicitudReemplazo;
	public JButton jButtondescripcionSolicitudReemplazoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaSolicitudReemplazo;
	public JLabel jLabelid_empresaSolicitudReemplazo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaSolicitudReemplazo;
	public JButton jButtonid_empresaSolicitudReemplazo= new JButtonMe();
	public JButton jButtonid_empresaSolicitudReemplazoUpdate= new JButtonMe();
	public JButton jButtonid_empresaSolicitudReemplazoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalSolicitudReemplazo;
	public JLabel jLabelid_sucursalSolicitudReemplazo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalSolicitudReemplazo;
	public JButton jButtonid_sucursalSolicitudReemplazo= new JButtonMe();
	public JButton jButtonid_sucursalSolicitudReemplazoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalSolicitudReemplazoBusqueda= new JButtonMe();

	public JPanel jPanelid_empleado_jefeSolicitudReemplazo;
	public JLabel jLabelid_empleado_jefeSolicitudReemplazo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_jefeSolicitudReemplazo;
	public JButton jButtonid_empleado_jefeSolicitudReemplazo= new JButtonMe();
	public JButton jButtonid_empleado_jefeSolicitudReemplazoUpdate= new JButtonMe();
	public JButton jButtonid_empleado_jefeSolicitudReemplazoBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoSolicitudReemplazo;
	public JLabel jLabelid_empleadoSolicitudReemplazo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoSolicitudReemplazo;
	public JButton jButtonid_empleadoSolicitudReemplazo= new JButtonMe();
	public JButton jButtonid_empleadoSolicitudReemplazoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoSolicitudReemplazoBusqueda= new JButtonMe();

	public JPanel jPanelid_empleado_reemplazoSolicitudReemplazo;
	public JLabel jLabelid_empleado_reemplazoSolicitudReemplazo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_reemplazoSolicitudReemplazo;
	public JButton jButtonid_empleado_reemplazoSolicitudReemplazo= new JButtonMe();
	public JButton jButtonid_empleado_reemplazoSolicitudReemplazoUpdate= new JButtonMe();
	public JButton jButtonid_empleado_reemplazoSolicitudReemplazoBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraSolicitudReemplazo;
	public JLabel jLabelid_estructuraSolicitudReemplazo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraSolicitudReemplazo;
	public JButton jButtonid_estructuraSolicitudReemplazo= new JButtonMe();
	public JButton jButtonid_estructuraSolicitudReemplazoUpdate= new JButtonMe();
	public JButton jButtonid_estructuraSolicitudReemplazoBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraSolicitudReemplazoArbol= new JButtonMe();

	public JPanel jPanelid_estado_solicitud_nomiSolicitudReemplazo;
	public JLabel jLabelid_estado_solicitud_nomiSolicitudReemplazo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_solicitud_nomiSolicitudReemplazo;
	public JButton jButtonid_estado_solicitud_nomiSolicitudReemplazo= new JButtonMe();
	public JButton jButtonid_estado_solicitud_nomiSolicitudReemplazoUpdate= new JButtonMe();
	public JButton jButtonid_estado_solicitud_nomiSolicitudReemplazoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSolicitudReemplazo;
	
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
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SolicitudReemplazoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSolicitudReemplazo=new JPanel();
				this.jPanelAccionesFormularioSolicitudReemplazo=new JPanel();
				this.jmenuBarDetalleSolicitudReemplazo=new JMenuBar();
				this.jTtoolBarDetalleSolicitudReemplazo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SolicitudReemplazoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("SolicitudReemplazo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SolicitudReemplazoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("SolicitudReemplazo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SolicitudReemplazoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SolicitudReemplazo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SolicitudReemplazoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SolicitudReemplazo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SolicitudReemplazoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SolicitudReemplazo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSolicitudReemplazo() {
		return this.jButtonActualizarToolBarSolicitudReemplazo;
	}
	
	public JButton getjButtonEliminarToolBarSolicitudReemplazo() {
		return this.jButtonEliminarToolBarSolicitudReemplazo;
	}
	
	public JButton getjButtonCancelarToolBarSolicitudReemplazo() {
		return this.jButtonCancelarToolBarSolicitudReemplazo;
	}		
	
	public JButton getjButtonProcesarInformacionSolicitudReemplazo() {
		return this.jButtonProcesarInformacionSolicitudReemplazo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSolicitudReemplazo)	{
		this.jButtonProcesarInformacionSolicitudReemplazo = jButtonProcesarInformacionSolicitudReemplazo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSolicitudReemplazo() {
		return this.jComboBoxTiposAccionesSolicitudReemplazo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSolicitudReemplazo(
			JComboBox jComboBoxTiposRelacionesSolicitudReemplazo) {
		this.jComboBoxTiposRelacionesSolicitudReemplazo = jComboBoxTiposRelacionesSolicitudReemplazo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSolicitudReemplazo(
			JComboBox jComboBoxTiposAccionesSolicitudReemplazo) {
		this.jComboBoxTiposAccionesSolicitudReemplazo = jComboBoxTiposAccionesSolicitudReemplazo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSolicitudReemplazo() {
		return this.jComboBoxTiposAccionesFormularioSolicitudReemplazo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSolicitudReemplazo(
			JComboBox jComboBoxTiposAccionesFormularioSolicitudReemplazo) {
		this.jComboBoxTiposAccionesFormularioSolicitudReemplazo = jComboBoxTiposAccionesFormularioSolicitudReemplazo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.solicitudreemplazoSessionBean=new SolicitudReemplazoSessionBean();
		
		this.solicitudreemplazoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.solicitudreemplazoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.solicitudreemplazoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SolicitudReemplazoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SolicitudReemplazoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SolicitudReemplazoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Solicitud Reemplazo MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
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
	
		SolicitudReemplazoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSolicitudReemplazo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSolicitudReemplazo=new JButtonMe();
				this.jButtonModificarToolBarSolicitudReemplazo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSolicitudReemplazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSolicitudReemplazo,this.jTtoolBarDetalleSolicitudReemplazo,
							"actualizar","actualizar","Actualizar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSolicitudReemplazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSolicitudReemplazo,this.jTtoolBarDetalleSolicitudReemplazo,
							"eliminar","eliminar","Eliminar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSolicitudReemplazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSolicitudReemplazo,this.jTtoolBarDetalleSolicitudReemplazo,
							"cancelar","cancelar","Cancelar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSolicitudReemplazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSolicitudReemplazo,this.jTtoolBarDetalleSolicitudReemplazo,
							"guardarcambios","guardarcambios","Guardar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSolicitudReemplazo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSolicitudReemplazo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSolicitudReemplazo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSolicitudReemplazo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSolicitudReemplazo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSolicitudReemplazo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSolicitudReemplazo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSolicitudReemplazo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSolicitudReemplazo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSolicitudReemplazo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSolicitudReemplazo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSolicitudReemplazo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSolicitudReemplazo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSolicitudReemplazo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSolicitudReemplazo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSolicitudReemplazo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSolicitudReemplazo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSolicitudReemplazo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSolicitudReemplazo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSolicitudReemplazo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSolicitudReemplazo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSolicitudReemplazo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSolicitudReemplazo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSolicitudReemplazo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSolicitudReemplazo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSolicitudReemplazo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSolicitudReemplazo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSolicitudReemplazo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSolicitudReemplazo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSolicitudReemplazo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSolicitudReemplazo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSolicitudReemplazo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSolicitudReemplazo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSolicitudReemplazo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSolicitudReemplazo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSolicitudReemplazo.add(this.jMenuItemDetalleCerrarSolicitudReemplazo);
		
		this.jmenuDetalleAccionesSolicitudReemplazo.add(this.jMenuItemActualizarSolicitudReemplazo);
		this.jmenuDetalleAccionesSolicitudReemplazo.add(this.jMenuItemEliminarSolicitudReemplazo);
		this.jmenuDetalleAccionesSolicitudReemplazo.add(this.jMenuItemCancelarSolicitudReemplazo);		
		
		//this.jmenuDetalleDatosSolicitudReemplazo.add(this.jMenuItemDetalleAbrirOrderBySolicitudReemplazo);				
		this.jmenuDetalleDatosSolicitudReemplazo.add(this.jMenuItemDetalleMostarOcultarSolicitudReemplazo);				
				
		//this.jmenuDetalleAccionesSolicitudReemplazo.add(this.jMenuItemGuardarCambiosSolicitudReemplazo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSolicitudReemplazo.add(this.jmenuDetalleArchivoSolicitudReemplazo);		
		this.jmenuBarDetalleSolicitudReemplazo.add(this.jmenuDetalleAccionesSolicitudReemplazo);		
		this.jmenuBarDetalleSolicitudReemplazo.add(this.jmenuDetalleDatosSolicitudReemplazo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSolicitudReemplazo);				
	}
	
	
	public void inicializarElementosCamposSolicitudReemplazo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSolicitudReemplazo = new JLabelMe();
		jLabelIdSolicitudReemplazo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSolicitudReemplazo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSolicitudReemplazo.setToolTipText(SolicitudReemplazoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSolicitudReemplazo= new GridBagLayout();

		this.jPanelidSolicitudReemplazo.setLayout(this.gridaBagLayoutSolicitudReemplazo);

		jLabelidSolicitudReemplazo = new JLabel();
		jLabelidSolicitudReemplazo.setText("Id");

		jLabelidSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelsecuencialSolicitudReemplazo = new JLabelMe();
		this.jLabelsecuencialSolicitudReemplazo.setText(""+SolicitudReemplazoConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialSolicitudReemplazo.setToolTipText("Secuencial");
		this.jLabelsecuencialSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialSolicitudReemplazo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialSolicitudReemplazo.setToolTipText(SolicitudReemplazoConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutSolicitudReemplazo = new GridBagLayout();
		this.jPanelsecuencialSolicitudReemplazo.setLayout(this.gridaBagLayoutSolicitudReemplazo);


		jTextFieldsecuencialSolicitudReemplazo= new JTextFieldMe();

		jTextFieldsecuencialSolicitudReemplazo.setEnabled(false);
		jTextFieldsecuencialSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialSolicitudReemplazoBusqueda= new JButtonMe();
		this.jButtonsecuencialSolicitudReemplazoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialSolicitudReemplazoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialSolicitudReemplazoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialSolicitudReemplazoBusqueda.setText("U");
		this.jButtonsecuencialSolicitudReemplazoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialSolicitudReemplazoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialSolicitudReemplazoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialSolicitudReemplazoBusqueda"));

		if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialSolicitudReemplazoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_solicitaSolicitudReemplazo = new JLabelMe();
		this.jLabelfecha_solicitaSolicitudReemplazo.setText(""+SolicitudReemplazoConstantesFunciones.LABEL_FECHASOLICITA+" : *");
		this.jLabelfecha_solicitaSolicitudReemplazo.setToolTipText("Fecha Solicita");
		this.jLabelfecha_solicitaSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_solicitaSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_solicitaSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_solicitaSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_solicitaSolicitudReemplazo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_solicitaSolicitudReemplazo.setToolTipText(SolicitudReemplazoConstantesFunciones.LABEL_FECHASOLICITA);
		this.gridaBagLayoutSolicitudReemplazo = new GridBagLayout();
		this.jPanelfecha_solicitaSolicitudReemplazo.setLayout(this.gridaBagLayoutSolicitudReemplazo);


		//jFormattedTextFieldfecha_solicitaSolicitudReemplazo= new JFormattedTextFieldMe();

		jDateChooserfecha_solicitaSolicitudReemplazo= new JDateChooser();
		jDateChooserfecha_solicitaSolicitudReemplazo.setEnabled(false);
		jDateChooserfecha_solicitaSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_solicitaSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_solicitaSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_solicitaSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_solicitaSolicitudReemplazo.setDate(new Date());
		jDateChooserfecha_solicitaSolicitudReemplazo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_solicitaSolicitudReemplazo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_solicitaSolicitudReemplazoBusqueda= new JButtonMe();
		this.jButtonfecha_solicitaSolicitudReemplazoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_solicitaSolicitudReemplazoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_solicitaSolicitudReemplazoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_solicitaSolicitudReemplazoBusqueda.setText("U");
		this.jButtonfecha_solicitaSolicitudReemplazoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_solicitaSolicitudReemplazoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_solicitaSolicitudReemplazoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_solicitaSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_solicitaSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_solicitaSolicitudReemplazoBusqueda"));

		if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_solicitaSolicitudReemplazoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ejecutaSolicitudReemplazo = new JLabelMe();
		this.jLabelfecha_ejecutaSolicitudReemplazo.setText(""+SolicitudReemplazoConstantesFunciones.LABEL_FECHAEJECUTA+" : *");
		this.jLabelfecha_ejecutaSolicitudReemplazo.setToolTipText("Fecha Ejecuta");
		this.jLabelfecha_ejecutaSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ejecutaSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ejecutaSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ejecutaSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ejecutaSolicitudReemplazo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ejecutaSolicitudReemplazo.setToolTipText(SolicitudReemplazoConstantesFunciones.LABEL_FECHAEJECUTA);
		this.gridaBagLayoutSolicitudReemplazo = new GridBagLayout();
		this.jPanelfecha_ejecutaSolicitudReemplazo.setLayout(this.gridaBagLayoutSolicitudReemplazo);


		//jFormattedTextFieldfecha_ejecutaSolicitudReemplazo= new JFormattedTextFieldMe();

		jDateChooserfecha_ejecutaSolicitudReemplazo= new JDateChooser();
		jDateChooserfecha_ejecutaSolicitudReemplazo.setEnabled(false);
		jDateChooserfecha_ejecutaSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ejecutaSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ejecutaSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ejecutaSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ejecutaSolicitudReemplazo.setDate(new Date());
		jDateChooserfecha_ejecutaSolicitudReemplazo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ejecutaSolicitudReemplazo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ejecutaSolicitudReemplazoBusqueda= new JButtonMe();
		this.jButtonfecha_ejecutaSolicitudReemplazoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ejecutaSolicitudReemplazoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ejecutaSolicitudReemplazoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ejecutaSolicitudReemplazoBusqueda.setText("U");
		this.jButtonfecha_ejecutaSolicitudReemplazoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ejecutaSolicitudReemplazoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ejecutaSolicitudReemplazoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ejecutaSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ejecutaSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ejecutaSolicitudReemplazoBusqueda"));

		if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ejecutaSolicitudReemplazoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_horasSolicitudReemplazo = new JLabelMe();
		this.jLabelnumero_horasSolicitudReemplazo.setText(""+SolicitudReemplazoConstantesFunciones.LABEL_NUMEROHORAS+" : *");
		this.jLabelnumero_horasSolicitudReemplazo.setToolTipText("Numero Horas");
		this.jLabelnumero_horasSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_horasSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_horasSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_horasSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_horasSolicitudReemplazo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_horasSolicitudReemplazo.setToolTipText(SolicitudReemplazoConstantesFunciones.LABEL_NUMEROHORAS);
		this.gridaBagLayoutSolicitudReemplazo = new GridBagLayout();
		this.jPanelnumero_horasSolicitudReemplazo.setLayout(this.gridaBagLayoutSolicitudReemplazo);


		jTextFieldnumero_horasSolicitudReemplazo= new JTextFieldMe();
		jTextFieldnumero_horasSolicitudReemplazo.setEnabled(false);
		jTextFieldnumero_horasSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_horasSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_horasSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_horasSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_horasSolicitudReemplazo.setText("0");

		this.jButtonnumero_horasSolicitudReemplazoBusqueda= new JButtonMe();
		this.jButtonnumero_horasSolicitudReemplazoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_horasSolicitudReemplazoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_horasSolicitudReemplazoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_horasSolicitudReemplazoBusqueda.setText("U");
		this.jButtonnumero_horasSolicitudReemplazoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_horasSolicitudReemplazoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_horasSolicitudReemplazoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_horasSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_horasSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_horasSolicitudReemplazoBusqueda"));

		if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_horasSolicitudReemplazoBusqueda.setVisible(false);		}


					
		this.jLabelcosto_unitarioSolicitudReemplazo = new JLabelMe();
		this.jLabelcosto_unitarioSolicitudReemplazo.setText(""+SolicitudReemplazoConstantesFunciones.LABEL_COSTOUNITARIO+" : *");
		this.jLabelcosto_unitarioSolicitudReemplazo.setToolTipText("Costo Unitario");
		this.jLabelcosto_unitarioSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_unitarioSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_unitarioSolicitudReemplazo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_unitarioSolicitudReemplazo.setToolTipText(SolicitudReemplazoConstantesFunciones.LABEL_COSTOUNITARIO);
		this.gridaBagLayoutSolicitudReemplazo = new GridBagLayout();
		this.jPanelcosto_unitarioSolicitudReemplazo.setLayout(this.gridaBagLayoutSolicitudReemplazo);


		jTextFieldcosto_unitarioSolicitudReemplazo= new JTextFieldMe();
		jTextFieldcosto_unitarioSolicitudReemplazo.setEnabled(false);
		jTextFieldcosto_unitarioSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_unitarioSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_unitarioSolicitudReemplazo.setText("0.0");

		this.jButtoncosto_unitarioSolicitudReemplazoBusqueda= new JButtonMe();
		this.jButtoncosto_unitarioSolicitudReemplazoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioSolicitudReemplazoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioSolicitudReemplazoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_unitarioSolicitudReemplazoBusqueda.setText("U");
		this.jButtoncosto_unitarioSolicitudReemplazoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_unitarioSolicitudReemplazoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_unitarioSolicitudReemplazoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_unitarioSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_unitarioSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_unitarioSolicitudReemplazoBusqueda"));

		if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_unitarioSolicitudReemplazoBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalSolicitudReemplazo = new JLabelMe();
		this.jLabelcosto_totalSolicitudReemplazo.setText(""+SolicitudReemplazoConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalSolicitudReemplazo.setToolTipText("Costo Total");
		this.jLabelcosto_totalSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalSolicitudReemplazo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalSolicitudReemplazo.setToolTipText(SolicitudReemplazoConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutSolicitudReemplazo = new GridBagLayout();
		this.jPanelcosto_totalSolicitudReemplazo.setLayout(this.gridaBagLayoutSolicitudReemplazo);


		jTextFieldcosto_totalSolicitudReemplazo= new JTextFieldMe();
		jTextFieldcosto_totalSolicitudReemplazo.setEnabled(false);
		jTextFieldcosto_totalSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalSolicitudReemplazo.setText("0.0");

		this.jButtoncosto_totalSolicitudReemplazoBusqueda= new JButtonMe();
		this.jButtoncosto_totalSolicitudReemplazoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalSolicitudReemplazoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalSolicitudReemplazoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalSolicitudReemplazoBusqueda.setText("U");
		this.jButtoncosto_totalSolicitudReemplazoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalSolicitudReemplazoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalSolicitudReemplazoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalSolicitudReemplazoBusqueda"));

		if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalSolicitudReemplazoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionSolicitudReemplazo = new JLabelMe();
		this.jLabeldescripcionSolicitudReemplazo.setText(""+SolicitudReemplazoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionSolicitudReemplazo.setToolTipText("Descripcion");
		this.jLabeldescripcionSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionSolicitudReemplazo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionSolicitudReemplazo.setToolTipText(SolicitudReemplazoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutSolicitudReemplazo = new GridBagLayout();
		this.jPaneldescripcionSolicitudReemplazo.setLayout(this.gridaBagLayoutSolicitudReemplazo);


		jTextAreadescripcionSolicitudReemplazo= new JTextAreaMe();
		jTextAreadescripcionSolicitudReemplazo.setEnabled(false);
		jTextAreadescripcionSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionSolicitudReemplazo.setLineWrap(true);
		jTextAreadescripcionSolicitudReemplazo.setWrapStyleWord(true);
		jTextAreadescripcionSolicitudReemplazo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionSolicitudReemplazo.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionSolicitudReemplazo = new JScrollPane(jTextAreadescripcionSolicitudReemplazo);
		jscrollPanedescripcionSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionSolicitudReemplazoBusqueda= new JButtonMe();
		this.jButtondescripcionSolicitudReemplazoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionSolicitudReemplazoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionSolicitudReemplazoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionSolicitudReemplazoBusqueda.setText("U");
		this.jButtondescripcionSolicitudReemplazoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionSolicitudReemplazoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionSolicitudReemplazoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionSolicitudReemplazoBusqueda"));

		if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionSolicitudReemplazoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSolicitudReemplazo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaSolicitudReemplazo = new JLabelMe();
		this.jLabelid_empresaSolicitudReemplazo.setText(""+SolicitudReemplazoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaSolicitudReemplazo.setToolTipText("Empresa");
		this.jLabelid_empresaSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaSolicitudReemplazo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaSolicitudReemplazo.setToolTipText(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutSolicitudReemplazo = new GridBagLayout();
		this.jPanelid_empresaSolicitudReemplazo.setLayout(this.gridaBagLayoutSolicitudReemplazo);


		jComboBoxid_empresaSolicitudReemplazo= new JComboBoxMe();
		jComboBoxid_empresaSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaSolicitudReemplazo.setEnabled(false);

		this.jButtonid_empresaSolicitudReemplazo= new JButtonMe();
		this.jButtonid_empresaSolicitudReemplazo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSolicitudReemplazo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSolicitudReemplazo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSolicitudReemplazo.setText("Buscar");
		this.jButtonid_empresaSolicitudReemplazo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaSolicitudReemplazo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSolicitudReemplazo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSolicitudReemplazo"));

		this.jButtonid_empresaSolicitudReemplazoBusqueda= new JButtonMe();
		this.jButtonid_empresaSolicitudReemplazoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSolicitudReemplazoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSolicitudReemplazoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSolicitudReemplazoBusqueda.setText("U");
		this.jButtonid_empresaSolicitudReemplazoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaSolicitudReemplazoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSolicitudReemplazoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSolicitudReemplazoBusqueda"));

		if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaSolicitudReemplazoBusqueda.setVisible(false);		}

		this.jButtonid_empresaSolicitudReemplazoUpdate= new JButtonMe();
		this.jButtonid_empresaSolicitudReemplazoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSolicitudReemplazoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSolicitudReemplazoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSolicitudReemplazoUpdate.setText("U");
		this.jButtonid_empresaSolicitudReemplazoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaSolicitudReemplazoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSolicitudReemplazoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSolicitudReemplazoUpdate"));



					
		this.jLabelid_sucursalSolicitudReemplazo = new JLabelMe();
		this.jLabelid_sucursalSolicitudReemplazo.setText(""+SolicitudReemplazoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalSolicitudReemplazo.setToolTipText("Sucursal");
		this.jLabelid_sucursalSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalSolicitudReemplazo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalSolicitudReemplazo.setToolTipText(SolicitudReemplazoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutSolicitudReemplazo = new GridBagLayout();
		this.jPanelid_sucursalSolicitudReemplazo.setLayout(this.gridaBagLayoutSolicitudReemplazo);


		jComboBoxid_sucursalSolicitudReemplazo= new JComboBoxMe();
		jComboBoxid_sucursalSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalSolicitudReemplazo.setEnabled(false);

		this.jButtonid_sucursalSolicitudReemplazo= new JButtonMe();
		this.jButtonid_sucursalSolicitudReemplazo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSolicitudReemplazo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSolicitudReemplazo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSolicitudReemplazo.setText("Buscar");
		this.jButtonid_sucursalSolicitudReemplazo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalSolicitudReemplazo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSolicitudReemplazo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSolicitudReemplazo"));

		this.jButtonid_sucursalSolicitudReemplazoBusqueda= new JButtonMe();
		this.jButtonid_sucursalSolicitudReemplazoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSolicitudReemplazoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSolicitudReemplazoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalSolicitudReemplazoBusqueda.setText("U");
		this.jButtonid_sucursalSolicitudReemplazoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalSolicitudReemplazoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSolicitudReemplazoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSolicitudReemplazoBusqueda"));

		if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalSolicitudReemplazoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalSolicitudReemplazoUpdate= new JButtonMe();
		this.jButtonid_sucursalSolicitudReemplazoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSolicitudReemplazoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSolicitudReemplazoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalSolicitudReemplazoUpdate.setText("U");
		this.jButtonid_sucursalSolicitudReemplazoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalSolicitudReemplazoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSolicitudReemplazoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSolicitudReemplazoUpdate"));



					
		this.jLabelid_empleado_jefeSolicitudReemplazo = new JLabelMe();
		this.jLabelid_empleado_jefeSolicitudReemplazo.setText(""+SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOJEFE+" : *");
		this.jLabelid_empleado_jefeSolicitudReemplazo.setToolTipText("Empleado Jefe");
		this.jLabelid_empleado_jefeSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleado_jefeSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleado_jefeSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_jefeSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleado_jefeSolicitudReemplazo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleado_jefeSolicitudReemplazo.setToolTipText(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOJEFE);
		this.gridaBagLayoutSolicitudReemplazo = new GridBagLayout();
		this.jPanelid_empleado_jefeSolicitudReemplazo.setLayout(this.gridaBagLayoutSolicitudReemplazo);


		jComboBoxid_empleado_jefeSolicitudReemplazo= new JComboBoxMe();
		jComboBoxid_empleado_jefeSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_jefeSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_jefeSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_jefeSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleado_jefeSolicitudReemplazo= new JButtonMe();
		this.jButtonid_empleado_jefeSolicitudReemplazo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_jefeSolicitudReemplazo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_jefeSolicitudReemplazo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_jefeSolicitudReemplazo.setText("Buscar");
		this.jButtonid_empleado_jefeSolicitudReemplazo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleado_jefeSolicitudReemplazo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_jefeSolicitudReemplazo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleado_jefeSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_jefeSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_jefeSolicitudReemplazo"));

		this.jButtonid_empleado_jefeSolicitudReemplazoBusqueda= new JButtonMe();
		this.jButtonid_empleado_jefeSolicitudReemplazoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_jefeSolicitudReemplazoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_jefeSolicitudReemplazoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_jefeSolicitudReemplazoBusqueda.setText("U");
		this.jButtonid_empleado_jefeSolicitudReemplazoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleado_jefeSolicitudReemplazoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_jefeSolicitudReemplazoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleado_jefeSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_jefeSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_jefeSolicitudReemplazoBusqueda"));

		if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleado_jefeSolicitudReemplazoBusqueda.setVisible(false);		}

		this.jButtonid_empleado_jefeSolicitudReemplazoUpdate= new JButtonMe();
		this.jButtonid_empleado_jefeSolicitudReemplazoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_jefeSolicitudReemplazoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_jefeSolicitudReemplazoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_jefeSolicitudReemplazoUpdate.setText("U");
		this.jButtonid_empleado_jefeSolicitudReemplazoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleado_jefeSolicitudReemplazoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_jefeSolicitudReemplazoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleado_jefeSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_jefeSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_jefeSolicitudReemplazoUpdate"));



					
		this.jLabelid_empleadoSolicitudReemplazo = new JLabelMe();
		this.jLabelid_empleadoSolicitudReemplazo.setText(""+SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoSolicitudReemplazo.setToolTipText("Empleado");
		this.jLabelid_empleadoSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoSolicitudReemplazo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoSolicitudReemplazo.setToolTipText(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutSolicitudReemplazo = new GridBagLayout();
		this.jPanelid_empleadoSolicitudReemplazo.setLayout(this.gridaBagLayoutSolicitudReemplazo);


		jComboBoxid_empleadoSolicitudReemplazo= new JComboBoxMe();
		jComboBoxid_empleadoSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoSolicitudReemplazo= new JButtonMe();
		this.jButtonid_empleadoSolicitudReemplazo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoSolicitudReemplazo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoSolicitudReemplazo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoSolicitudReemplazo.setText("Buscar");
		this.jButtonid_empleadoSolicitudReemplazo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoSolicitudReemplazo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoSolicitudReemplazo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoSolicitudReemplazo"));

		this.jButtonid_empleadoSolicitudReemplazoBusqueda= new JButtonMe();
		this.jButtonid_empleadoSolicitudReemplazoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoSolicitudReemplazoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoSolicitudReemplazoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoSolicitudReemplazoBusqueda.setText("U");
		this.jButtonid_empleadoSolicitudReemplazoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoSolicitudReemplazoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoSolicitudReemplazoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoSolicitudReemplazoBusqueda"));

		if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoSolicitudReemplazoBusqueda.setVisible(false);		}

		this.jButtonid_empleadoSolicitudReemplazoUpdate= new JButtonMe();
		this.jButtonid_empleadoSolicitudReemplazoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoSolicitudReemplazoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoSolicitudReemplazoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoSolicitudReemplazoUpdate.setText("U");
		this.jButtonid_empleadoSolicitudReemplazoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoSolicitudReemplazoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoSolicitudReemplazoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoSolicitudReemplazoUpdate"));



					
		this.jLabelid_empleado_reemplazoSolicitudReemplazo = new JLabelMe();
		this.jLabelid_empleado_reemplazoSolicitudReemplazo.setText(""+SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO+" : *");
		this.jLabelid_empleado_reemplazoSolicitudReemplazo.setToolTipText("Empleado Reemplazo");
		this.jLabelid_empleado_reemplazoSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_empleado_reemplazoSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_empleado_reemplazoSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_reemplazoSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleado_reemplazoSolicitudReemplazo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleado_reemplazoSolicitudReemplazo.setToolTipText(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO);
		this.gridaBagLayoutSolicitudReemplazo = new GridBagLayout();
		this.jPanelid_empleado_reemplazoSolicitudReemplazo.setLayout(this.gridaBagLayoutSolicitudReemplazo);


		jComboBoxid_empleado_reemplazoSolicitudReemplazo= new JComboBoxMe();
		jComboBoxid_empleado_reemplazoSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_reemplazoSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_reemplazoSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_reemplazoSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleado_reemplazoSolicitudReemplazo= new JButtonMe();
		this.jButtonid_empleado_reemplazoSolicitudReemplazo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_reemplazoSolicitudReemplazo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_reemplazoSolicitudReemplazo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_reemplazoSolicitudReemplazo.setText("Buscar");
		this.jButtonid_empleado_reemplazoSolicitudReemplazo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleado_reemplazoSolicitudReemplazo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_reemplazoSolicitudReemplazo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleado_reemplazoSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_reemplazoSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_reemplazoSolicitudReemplazo"));

		this.jButtonid_empleado_reemplazoSolicitudReemplazoBusqueda= new JButtonMe();
		this.jButtonid_empleado_reemplazoSolicitudReemplazoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_reemplazoSolicitudReemplazoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_reemplazoSolicitudReemplazoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_reemplazoSolicitudReemplazoBusqueda.setText("U");
		this.jButtonid_empleado_reemplazoSolicitudReemplazoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleado_reemplazoSolicitudReemplazoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_reemplazoSolicitudReemplazoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleado_reemplazoSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_reemplazoSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_reemplazoSolicitudReemplazoBusqueda"));

		if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleado_reemplazoSolicitudReemplazoBusqueda.setVisible(false);		}

		this.jButtonid_empleado_reemplazoSolicitudReemplazoUpdate= new JButtonMe();
		this.jButtonid_empleado_reemplazoSolicitudReemplazoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_reemplazoSolicitudReemplazoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_reemplazoSolicitudReemplazoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_reemplazoSolicitudReemplazoUpdate.setText("U");
		this.jButtonid_empleado_reemplazoSolicitudReemplazoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleado_reemplazoSolicitudReemplazoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_reemplazoSolicitudReemplazoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleado_reemplazoSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_reemplazoSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_reemplazoSolicitudReemplazoUpdate"));



					
		this.jLabelid_estructuraSolicitudReemplazo = new JLabelMe();
		this.jLabelid_estructuraSolicitudReemplazo.setText(""+SolicitudReemplazoConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraSolicitudReemplazo.setToolTipText("Estructura");
		this.jLabelid_estructuraSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraSolicitudReemplazo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraSolicitudReemplazo.setToolTipText(SolicitudReemplazoConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutSolicitudReemplazo = new GridBagLayout();
		this.jPanelid_estructuraSolicitudReemplazo.setLayout(this.gridaBagLayoutSolicitudReemplazo);


		jComboBoxid_estructuraSolicitudReemplazo= new JComboBoxMe();
		jComboBoxid_estructuraSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraSolicitudReemplazo= new JButtonMe();
		this.jButtonid_estructuraSolicitudReemplazo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraSolicitudReemplazo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraSolicitudReemplazo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraSolicitudReemplazo.setText("Buscar");
		this.jButtonid_estructuraSolicitudReemplazo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraSolicitudReemplazo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraSolicitudReemplazo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraSolicitudReemplazo"));

		this.jButtonid_estructuraSolicitudReemplazoBusqueda= new JButtonMe();
		this.jButtonid_estructuraSolicitudReemplazoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraSolicitudReemplazoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraSolicitudReemplazoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraSolicitudReemplazoBusqueda.setText("U");
		this.jButtonid_estructuraSolicitudReemplazoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraSolicitudReemplazoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraSolicitudReemplazoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraSolicitudReemplazoBusqueda"));

		if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraSolicitudReemplazoBusqueda.setVisible(false);		}

		this.jButtonid_estructuraSolicitudReemplazoUpdate= new JButtonMe();
		this.jButtonid_estructuraSolicitudReemplazoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraSolicitudReemplazoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraSolicitudReemplazoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraSolicitudReemplazoUpdate.setText("U");
		this.jButtonid_estructuraSolicitudReemplazoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraSolicitudReemplazoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraSolicitudReemplazoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraSolicitudReemplazoUpdate"));


		jButtonid_estructuraSolicitudReemplazoArbol= new JButtonMe();
		jButtonid_estructuraSolicitudReemplazoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraSolicitudReemplazoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraSolicitudReemplazoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraSolicitudReemplazoArbol.setText("Arbol");
		jButtonid_estructuraSolicitudReemplazoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructuraSolicitudReemplazoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraSolicitudReemplazoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructuraSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraSolicitudReemplazoArbol"));



					
		this.jLabelid_estado_solicitud_nomiSolicitudReemplazo = new JLabelMe();
		this.jLabelid_estado_solicitud_nomiSolicitudReemplazo.setText(""+SolicitudReemplazoConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI+" : *");
		this.jLabelid_estado_solicitud_nomiSolicitudReemplazo.setToolTipText("Estado Solicitud Nomi");
		this.jLabelid_estado_solicitud_nomiSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_solicitud_nomiSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_solicitud_nomiSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_solicitud_nomiSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_solicitud_nomiSolicitudReemplazo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_solicitud_nomiSolicitudReemplazo.setToolTipText(SolicitudReemplazoConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI);
		this.gridaBagLayoutSolicitudReemplazo = new GridBagLayout();
		this.jPanelid_estado_solicitud_nomiSolicitudReemplazo.setLayout(this.gridaBagLayoutSolicitudReemplazo);


		jComboBoxid_estado_solicitud_nomiSolicitudReemplazo= new JComboBoxMe();
		jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_solicitud_nomiSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_solicitud_nomiSolicitudReemplazo= new JButtonMe();
		this.jButtonid_estado_solicitud_nomiSolicitudReemplazo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_solicitud_nomiSolicitudReemplazo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_solicitud_nomiSolicitudReemplazo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_solicitud_nomiSolicitudReemplazo.setText("Buscar");
		this.jButtonid_estado_solicitud_nomiSolicitudReemplazo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_solicitud_nomiSolicitudReemplazo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_solicitud_nomiSolicitudReemplazo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_solicitud_nomiSolicitudReemplazo"));

		this.jButtonid_estado_solicitud_nomiSolicitudReemplazoBusqueda= new JButtonMe();
		this.jButtonid_estado_solicitud_nomiSolicitudReemplazoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_solicitud_nomiSolicitudReemplazoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_solicitud_nomiSolicitudReemplazoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_solicitud_nomiSolicitudReemplazoBusqueda.setText("U");
		this.jButtonid_estado_solicitud_nomiSolicitudReemplazoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_solicitud_nomiSolicitudReemplazoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_solicitud_nomiSolicitudReemplazoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_solicitud_nomiSolicitudReemplazoBusqueda"));

		if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_solicitud_nomiSolicitudReemplazoBusqueda.setVisible(false);		}

		this.jButtonid_estado_solicitud_nomiSolicitudReemplazoUpdate= new JButtonMe();
		this.jButtonid_estado_solicitud_nomiSolicitudReemplazoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_solicitud_nomiSolicitudReemplazoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_solicitud_nomiSolicitudReemplazoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_solicitud_nomiSolicitudReemplazoUpdate.setText("U");
		this.jButtonid_estado_solicitud_nomiSolicitudReemplazoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_solicitud_nomiSolicitudReemplazoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_solicitud_nomiSolicitudReemplazoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_solicitud_nomiSolicitudReemplazoUpdate"));



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
		//this.jInternalFrameDetalleSolicitudReemplazo = new SolicitudReemplazoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Solicitud Reemplazo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSolicitudReemplazo= new GridBagLayout();
		

		
		String sToolTipSolicitudReemplazo="";
		sToolTipSolicitudReemplazo=SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSolicitudReemplazo+="(Nomina.SolicitudReemplazo)";
		}
		
		if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
			sToolTipSolicitudReemplazo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSolicitudReemplazo = new JButtonMe();
		this.jButtonModificarSolicitudReemplazo = new JButtonMe();
        this.jButtonActualizarSolicitudReemplazo = new JButtonMe();
        this.jButtonEliminarSolicitudReemplazo = new JButtonMe();
        this.jButtonCancelarSolicitudReemplazo = new JButtonMe();
        this.jButtonGuardarCambiosSolicitudReemplazo = new JButtonMe();
		this.jButtonGuardarCambiosTablaSolicitudReemplazo = new JButtonMe();
		this.jButtonCerrarSolicitudReemplazo = new JButtonMe();
		
		this.jScrollPanelDatosSolicitudReemplazo = new JScrollPane();   
        this.jScrollPanelDatosEdicionSolicitudReemplazo = new JScrollPane();
		this.jScrollPanelDatosGeneralSolicitudReemplazo = new JScrollPane();
				
		
		
		this.jPanelCamposSolicitudReemplazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSolicitudReemplazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSolicitudReemplazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSolicitudReemplazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Solicitud Reemplazo";
		
		if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Reemplazos" + this.sPath));
		} else {
			this.jScrollPanelDatosSolicitudReemplazo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSolicitudReemplazo.setName("jPanelCamposSolicitudReemplazo"); 

		this.jPanelCamposOcultosSolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSolicitudReemplazo.setName("jPanelCamposOcultosSolicitudReemplazo"); 

        this.jPanelAccionesSolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSolicitudReemplazo.setToolTipText("Acciones");
        this.jPanelAccionesSolicitudReemplazo.setName("Acciones"); 

		this.jPanelAccionesFormularioSolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSolicitudReemplazo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSolicitudReemplazo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSolicitudReemplazo.setText("Nuevo");
		this.jButtonModificarSolicitudReemplazo.setText("Editar");
        this.jButtonActualizarSolicitudReemplazo.setText("Actualizar");
        this.jButtonEliminarSolicitudReemplazo.setText("Eliminar");
        this.jButtonCancelarSolicitudReemplazo.setText("Cancelar");
        this.jButtonGuardarCambiosSolicitudReemplazo.setText("Guardar");
		this.jButtonGuardarCambiosTablaSolicitudReemplazo.setText("Guardar");
		this.jButtonCerrarSolicitudReemplazo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSolicitudReemplazo,"nuevo_button","Nuevo",this.solicitudreemplazoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSolicitudReemplazo,"modificar_button","Editar",this.solicitudreemplazoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSolicitudReemplazo,"actualizar_button","Actualizar",this.solicitudreemplazoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSolicitudReemplazo,"eliminar_button","Eliminar",this.solicitudreemplazoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSolicitudReemplazo,"cancelar_button","Cancelar",this.solicitudreemplazoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSolicitudReemplazo,"guardarcambios_button","Guardar",this.solicitudreemplazoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSolicitudReemplazo,"guardarcambiostabla_button","Guardar",this.solicitudreemplazoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSolicitudReemplazo,"cerrar_button","Salir",this.solicitudreemplazoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSolicitudReemplazo.setToolTipText("Nuevo"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSolicitudReemplazo.setToolTipText("Editar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSolicitudReemplazo.setToolTipText("Actualizar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSolicitudReemplazo.setToolTipText("Eliminar)"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSolicitudReemplazo.setToolTipText("Cancelar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSolicitudReemplazo.setToolTipText("Guardar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSolicitudReemplazo.setToolTipText("Guardar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSolicitudReemplazo.setToolTipText("Salir"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSolicitudReemplazo";
		inputMap = this.jButtonNuevoSolicitudReemplazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSolicitudReemplazo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSolicitudReemplazo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSolicitudReemplazo";
		inputMap = this.jButtonActualizarSolicitudReemplazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSolicitudReemplazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSolicitudReemplazo"));
		
		//ELIMINAR
		sMapKey = "EliminarSolicitudReemplazo";
		inputMap = this.jButtonEliminarSolicitudReemplazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSolicitudReemplazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSolicitudReemplazo"));
		
		//CANCELAR	
		sMapKey = "CancelarSolicitudReemplazo";
		inputMap = this.jButtonCancelarSolicitudReemplazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSolicitudReemplazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSolicitudReemplazo"));
		
		//CERRAR		
		sMapKey = "CerrarSolicitudReemplazo";
		inputMap = this.jButtonCerrarSolicitudReemplazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSolicitudReemplazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSolicitudReemplazo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSolicitudReemplazo";
		inputMap = this.jButtonGuardarCambiosTablaSolicitudReemplazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSolicitudReemplazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSolicitudReemplazo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSolicitudReemplazo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSolicitudReemplazo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSolicitudReemplazo.setToolTipText("Nuevo SolicitudReemplazo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSolicitudReemplazo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSolicitudReemplazo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSolicitudReemplazo.setToolTipText("Sin Cerrar Ventana SolicitudReemplazo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSolicitudReemplazo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSolicitudReemplazo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSolicitudReemplazo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSolicitudReemplazo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSolicitudReemplazo.setText("Accion");
		this.jComboBoxTiposAccionesSolicitudReemplazo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSolicitudReemplazo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSolicitudReemplazo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSolicitudReemplazo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSolicitudReemplazo = new JLabelMe();
		
		this.jLabelAccionesSolicitudReemplazo.setText("Acciones");		
		this.jLabelAccionesSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSolicitudReemplazo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSolicitudReemplazo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSolicitudReemplazo=new JTabbedPane();
		this.jTabbedPaneRelacionesSolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSolicitudReemplazo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSolicitudReemplazo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSolicitudReemplazo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSolicitudReemplazo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSolicitudReemplazo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSolicitudReemplazo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSolicitudReemplazo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSolicitudReemplazo = new GridBagLayout();
		
		this.jPanelCamposSolicitudReemplazo.setLayout(gridaBagLayoutCamposSolicitudReemplazo);
		this.jPanelCamposOcultosSolicitudReemplazo.setLayout(gridaBagLayoutCamposOcultosSolicitudReemplazo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSolicitudReemplazo.add(jLabelIdSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 1;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSolicitudReemplazo.add(jLabelidSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);


	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaSolicitudReemplazo.add(jLabelid_empresaSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx = 2;
		this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
		this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSolicitudReemplazo.add(jButtonid_empresaSolicitudReemplazoBusqueda, this.gridBagConstraintsSolicitudReemplazo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx = 3;
		this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
		this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSolicitudReemplazo.add(jButtonid_empresaSolicitudReemplazoUpdate, this.gridBagConstraintsSolicitudReemplazo);
	}

	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 1;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaSolicitudReemplazo.add(jComboBoxid_empresaSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);


	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalSolicitudReemplazo.add(jLabelid_sucursalSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx = 2;
		this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
		this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalSolicitudReemplazo.add(jButtonid_sucursalSolicitudReemplazoBusqueda, this.gridBagConstraintsSolicitudReemplazo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx = 3;
		this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
		this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalSolicitudReemplazo.add(jButtonid_sucursalSolicitudReemplazoUpdate, this.gridBagConstraintsSolicitudReemplazo);
	}

	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 1;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalSolicitudReemplazo.add(jComboBoxid_sucursalSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);


	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleado_jefeSolicitudReemplazo.add(jLabelid_empleado_jefeSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx = 2;
		this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
		this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_jefeSolicitudReemplazo.add(jButtonid_empleado_jefeSolicitudReemplazoBusqueda, this.gridBagConstraintsSolicitudReemplazo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx = 3;
		this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
		this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_jefeSolicitudReemplazo.add(jButtonid_empleado_jefeSolicitudReemplazoUpdate, this.gridBagConstraintsSolicitudReemplazo);
	}

	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 1;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleado_jefeSolicitudReemplazo.add(jComboBoxid_empleado_jefeSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);


	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoSolicitudReemplazo.add(jLabelid_empleadoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx = 2;
		this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
		this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoSolicitudReemplazo.add(jButtonid_empleadoSolicitudReemplazoBusqueda, this.gridBagConstraintsSolicitudReemplazo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx = 3;
		this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
		this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoSolicitudReemplazo.add(jButtonid_empleadoSolicitudReemplazoUpdate, this.gridBagConstraintsSolicitudReemplazo);
	}

	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 1;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoSolicitudReemplazo.add(jComboBoxid_empleadoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);


	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleado_reemplazoSolicitudReemplazo.add(jLabelid_empleado_reemplazoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx = 2;
		this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
		this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_reemplazoSolicitudReemplazo.add(jButtonid_empleado_reemplazoSolicitudReemplazoBusqueda, this.gridBagConstraintsSolicitudReemplazo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx = 3;
		this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
		this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_reemplazoSolicitudReemplazo.add(jButtonid_empleado_reemplazoSolicitudReemplazoUpdate, this.gridBagConstraintsSolicitudReemplazo);
	}

	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 1;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleado_reemplazoSolicitudReemplazo.add(jComboBoxid_empleado_reemplazoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);


	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraSolicitudReemplazo.add(jLabelid_estructuraSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx = 2;
		this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
		this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraSolicitudReemplazo.add(jButtonid_estructuraSolicitudReemplazoBusqueda, this.gridBagConstraintsSolicitudReemplazo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx = 3;
		this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
		this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraSolicitudReemplazo.add(jButtonid_estructuraSolicitudReemplazoUpdate, this.gridBagConstraintsSolicitudReemplazo);
	}

	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 1;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraSolicitudReemplazo.add(jComboBoxid_estructuraSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);


	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_solicitud_nomiSolicitudReemplazo.add(jLabelid_estado_solicitud_nomiSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx = 2;
		this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
		this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_solicitud_nomiSolicitudReemplazo.add(jButtonid_estado_solicitud_nomiSolicitudReemplazoBusqueda, this.gridBagConstraintsSolicitudReemplazo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx = 3;
		this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
		this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_solicitud_nomiSolicitudReemplazo.add(jButtonid_estado_solicitud_nomiSolicitudReemplazoUpdate, this.gridBagConstraintsSolicitudReemplazo);
	}

	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 1;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_solicitud_nomiSolicitudReemplazo.add(jComboBoxid_estado_solicitud_nomiSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);


	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialSolicitudReemplazo.add(jLabelsecuencialSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx = 2;
		this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
		this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialSolicitudReemplazo.add(jButtonsecuencialSolicitudReemplazoBusqueda, this.gridBagConstraintsSolicitudReemplazo);
	}

	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 1;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialSolicitudReemplazo.add(jTextFieldsecuencialSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);


	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_solicitaSolicitudReemplazo.add(jLabelfecha_solicitaSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx = 2;
		this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
		this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_solicitaSolicitudReemplazo.add(jButtonfecha_solicitaSolicitudReemplazoBusqueda, this.gridBagConstraintsSolicitudReemplazo);
	}

	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 1;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_solicitaSolicitudReemplazo.add(jDateChooserfecha_solicitaSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);


	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ejecutaSolicitudReemplazo.add(jLabelfecha_ejecutaSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx = 2;
		this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
		this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ejecutaSolicitudReemplazo.add(jButtonfecha_ejecutaSolicitudReemplazoBusqueda, this.gridBagConstraintsSolicitudReemplazo);
	}

	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 1;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ejecutaSolicitudReemplazo.add(jDateChooserfecha_ejecutaSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);


	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_horasSolicitudReemplazo.add(jLabelnumero_horasSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx = 2;
		this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
		this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_horasSolicitudReemplazo.add(jButtonnumero_horasSolicitudReemplazoBusqueda, this.gridBagConstraintsSolicitudReemplazo);
	}

	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 1;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_horasSolicitudReemplazo.add(jTextFieldnumero_horasSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);


	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_unitarioSolicitudReemplazo.add(jLabelcosto_unitarioSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx = 2;
		this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
		this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_unitarioSolicitudReemplazo.add(jButtoncosto_unitarioSolicitudReemplazoBusqueda, this.gridBagConstraintsSolicitudReemplazo);
	}

	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 1;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_unitarioSolicitudReemplazo.add(jTextFieldcosto_unitarioSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);


	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalSolicitudReemplazo.add(jLabelcosto_totalSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx = 2;
		this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
		this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalSolicitudReemplazo.add(jButtoncosto_totalSolicitudReemplazoBusqueda, this.gridBagConstraintsSolicitudReemplazo);
	}

	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 1;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalSolicitudReemplazo.add(jTextFieldcosto_totalSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);


	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionSolicitudReemplazo.add(jLabeldescripcionSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx = 2;
		this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
		this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionSolicitudReemplazo.add(jButtondescripcionSolicitudReemplazoBusqueda, this.gridBagConstraintsSolicitudReemplazo);
	}

	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
	this.gridBagConstraintsSolicitudReemplazo.gridx = 1;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionSolicitudReemplazo.add(jscrollPanedescripcionSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudReemplazo.gridy = iYPanelCamposSolicitudReemplazo;
	this.gridBagConstraintsSolicitudReemplazo.gridx = iXPanelCamposSolicitudReemplazo++;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudReemplazo.add(this.jPanelidSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(iXPanelCamposSolicitudReemplazo % 1==0) {
		iXPanelCamposSolicitudReemplazo=0;
		iYPanelCamposSolicitudReemplazo++;
	}
	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudReemplazo.gridy = iYPanelCamposSolicitudReemplazo;
	this.gridBagConstraintsSolicitudReemplazo.gridx = iXPanelCamposSolicitudReemplazo++;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudReemplazo.add(this.jPanelid_empleado_jefeSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(iXPanelCamposSolicitudReemplazo % 1==0) {
		iXPanelCamposSolicitudReemplazo=0;
		iYPanelCamposSolicitudReemplazo++;
	}
	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudReemplazo.gridy = iYPanelCamposSolicitudReemplazo;
	this.gridBagConstraintsSolicitudReemplazo.gridx = iXPanelCamposSolicitudReemplazo++;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudReemplazo.add(this.jPanelid_empleadoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(iXPanelCamposSolicitudReemplazo % 1==0) {
		iXPanelCamposSolicitudReemplazo=0;
		iYPanelCamposSolicitudReemplazo++;
	}
	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudReemplazo.gridy = iYPanelCamposSolicitudReemplazo;
	this.gridBagConstraintsSolicitudReemplazo.gridx = iXPanelCamposSolicitudReemplazo++;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudReemplazo.add(this.jPanelid_empleado_reemplazoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(iXPanelCamposSolicitudReemplazo % 1==0) {
		iXPanelCamposSolicitudReemplazo=0;
		iYPanelCamposSolicitudReemplazo++;
	}
	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudReemplazo.gridy = iYPanelCamposSolicitudReemplazo;
	this.gridBagConstraintsSolicitudReemplazo.gridx = iXPanelCamposSolicitudReemplazo++;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudReemplazo.add(this.jPanelid_estructuraSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(iXPanelCamposSolicitudReemplazo % 1==0) {
		iXPanelCamposSolicitudReemplazo=0;
		iYPanelCamposSolicitudReemplazo++;
	}
	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudReemplazo.gridy = iYPanelCamposSolicitudReemplazo;
	this.gridBagConstraintsSolicitudReemplazo.gridx = iXPanelCamposSolicitudReemplazo++;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudReemplazo.add(this.jPanelid_estado_solicitud_nomiSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(iXPanelCamposSolicitudReemplazo % 1==0) {
		iXPanelCamposSolicitudReemplazo=0;
		iYPanelCamposSolicitudReemplazo++;
	}
	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudReemplazo.gridy = iYPanelCamposSolicitudReemplazo;
	this.gridBagConstraintsSolicitudReemplazo.gridx = iXPanelCamposSolicitudReemplazo++;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudReemplazo.add(this.jPanelsecuencialSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(iXPanelCamposSolicitudReemplazo % 1==0) {
		iXPanelCamposSolicitudReemplazo=0;
		iYPanelCamposSolicitudReemplazo++;
	}
	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudReemplazo.gridy = iYPanelCamposSolicitudReemplazo;
	this.gridBagConstraintsSolicitudReemplazo.gridx = iXPanelCamposSolicitudReemplazo++;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudReemplazo.add(this.jPanelfecha_solicitaSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(iXPanelCamposSolicitudReemplazo % 1==0) {
		iXPanelCamposSolicitudReemplazo=0;
		iYPanelCamposSolicitudReemplazo++;
	}
	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudReemplazo.gridy = iYPanelCamposSolicitudReemplazo;
	this.gridBagConstraintsSolicitudReemplazo.gridx = iXPanelCamposSolicitudReemplazo++;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudReemplazo.add(this.jPanelfecha_ejecutaSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(iXPanelCamposSolicitudReemplazo % 1==0) {
		iXPanelCamposSolicitudReemplazo=0;
		iYPanelCamposSolicitudReemplazo++;
	}
	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudReemplazo.gridy = iYPanelCamposSolicitudReemplazo;
	this.gridBagConstraintsSolicitudReemplazo.gridx = iXPanelCamposSolicitudReemplazo++;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudReemplazo.add(this.jPanelnumero_horasSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(iXPanelCamposSolicitudReemplazo % 1==0) {
		iXPanelCamposSolicitudReemplazo=0;
		iYPanelCamposSolicitudReemplazo++;
	}
	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudReemplazo.gridy = iYPanelCamposSolicitudReemplazo;
	this.gridBagConstraintsSolicitudReemplazo.gridx = iXPanelCamposSolicitudReemplazo++;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudReemplazo.add(this.jPanelcosto_unitarioSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(iXPanelCamposSolicitudReemplazo % 1==0) {
		iXPanelCamposSolicitudReemplazo=0;
		iYPanelCamposSolicitudReemplazo++;
	}
	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudReemplazo.gridy = iYPanelCamposSolicitudReemplazo;
	this.gridBagConstraintsSolicitudReemplazo.gridx = iXPanelCamposSolicitudReemplazo++;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudReemplazo.add(this.jPanelcosto_totalSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(iXPanelCamposSolicitudReemplazo % 1==0) {
		iXPanelCamposSolicitudReemplazo=0;
		iYPanelCamposSolicitudReemplazo++;
	}
	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudReemplazo.gridy = iYPanelCamposSolicitudReemplazo;
	this.gridBagConstraintsSolicitudReemplazo.gridx = iXPanelCamposSolicitudReemplazo++;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudReemplazo.add(this.jPaneldescripcionSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(iXPanelCamposSolicitudReemplazo % 1==0) {
		iXPanelCamposSolicitudReemplazo=0;
		iYPanelCamposSolicitudReemplazo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudReemplazo.gridy = iYPanelCamposOcultosSolicitudReemplazo;
	this.gridBagConstraintsSolicitudReemplazo.gridx = iXPanelCamposOcultosSolicitudReemplazo++;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSolicitudReemplazo.add(this.jPanelid_empresaSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(iXPanelCamposOcultosSolicitudReemplazo % 1==0) {
		iXPanelCamposOcultosSolicitudReemplazo=0;
		iYPanelCamposOcultosSolicitudReemplazo++;
	}
	this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudReemplazo.gridy = iYPanelCamposOcultosSolicitudReemplazo;
	this.gridBagConstraintsSolicitudReemplazo.gridx = iXPanelCamposOcultosSolicitudReemplazo++;
	this.gridBagConstraintsSolicitudReemplazo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudReemplazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSolicitudReemplazo.add(this.jPanelid_sucursalSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);



	if(iXPanelCamposOcultosSolicitudReemplazo % 1==0) {
		iXPanelCamposOcultosSolicitudReemplazo=0;
		iYPanelCamposOcultosSolicitudReemplazo++;
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
			
		GridBagLayout gridaBagLayoutAccionesSolicitudReemplazo= new GridBagLayout();
		this.jPanelAccionesSolicitudReemplazo.setLayout(gridaBagLayoutAccionesSolicitudReemplazo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSolicitudReemplazo= new GridBagLayout();
		this.jPanelAccionesFormularioSolicitudReemplazo.setLayout(gridaBagLayoutAccionesFormularioSolicitudReemplazo);
		
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSolicitudReemplazo.add(this.jComboBoxTiposAccionesFormularioSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSolicitudReemplazo.add(this.jCheckBoxPostAccionNuevoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.solicitudreemplazoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSolicitudReemplazo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSolicitudReemplazo.add(this.jCheckBoxPostAccionSinCerrarSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.solicitudreemplazoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSolicitudReemplazo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSolicitudReemplazo.add(this.jCheckBoxPostAccionSinMensajeSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXAccion++;
			
		this.jPanelAccionesSolicitudReemplazo.add(this.jButtonModificarSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);							

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx =iPosXAccion++;
			
		this.jPanelAccionesSolicitudReemplazo.add(this.jButtonEliminarSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		
			
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXAccion++;
		
		this.jPanelAccionesSolicitudReemplazo.add(this.jButtonActualizarSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);


		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXAccion++;
		
		this.jPanelAccionesSolicitudReemplazo.add(this.jButtonGuardarCambiosSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);	
		
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;		
		this.gridBagConstraintsSolicitudReemplazo.gridx =iPosXAccion++;
		
		this.jPanelAccionesSolicitudReemplazo.add(this.jButtonCancelarSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSolicitudReemplazo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSolicitudReemplazo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();						
			this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSolicitudReemplazo.gridx = 0;		
			//this.gridBagConstraintsSolicitudReemplazo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSolicitudReemplazo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSolicitudReemplazo.gridx =0;
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSolicitudReemplazo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SolicitudReemplazoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSolicitudReemplazo = new SolicitudReemplazoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Solicitud Reemplazo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Solicitud Reemplazo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Solicitud Reemplazo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SolicitudReemplazoModel solicitudreemplazoModel=new SolicitudReemplazoModel(this);
			
			//SI USARA CLASE INTERNA
			//SolicitudReemplazoModel.SolicitudReemplazoFocusTraversalPolicy solicitudreemplazoFocusTraversalPolicy = solicitudreemplazoModel.new SolicitudReemplazoFocusTraversalPolicy(this);
			
			//solicitudreemplazoFocusTraversalPolicy.setsolicitudreemplazoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(solicitudreemplazoModel);
			
			
			this.jContentPaneDetalleSolicitudReemplazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSolicitudReemplazo = new GridBagLayout();	
			this.jContentPaneDetalleSolicitudReemplazo.setLayout(gridaBagLayoutDetalleSolicitudReemplazo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSolicitudReemplazo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
				this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
					
				
				this.jContentPaneDetalleSolicitudReemplazo.add(jTtoolBarDetalleSolicitudReemplazo, gridBagConstraintsSolicitudReemplazo);								
				
}
			
			this.jScrollPanelDatosEdicionSolicitudReemplazo=   new JScrollPane(jContentPaneDetalleSolicitudReemplazo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSolicitudReemplazo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSolicitudReemplazo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSolicitudReemplazo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSolicitudReemplazo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSolicitudReemplazo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSolicitudReemplazo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSolicitudReemplazo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
	        
			this.jContentPaneDetalleSolicitudReemplazo.add(jPanelCamposSolicitudReemplazo, gridBagConstraintsSolicitudReemplazo);
			
			
			
			
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
						&& solicitudreemplazoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.solicitudreemplazoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSolicitudReemplazo= new GridBagConstraints();
						this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
						this.jContentPaneDetalleSolicitudReemplazo.add(this.jTabbedPaneRelacionesSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSolicitudReemplazo.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSolicitudReemplazo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
					this.gridBagConstraintsSolicitudReemplazo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
					
				
					this.jContentPaneDetalleSolicitudReemplazo.add(jPanelCamposOcultosSolicitudReemplazo, gridBagConstraintsSolicitudReemplazo);
				
					this.jPanelCamposOcultosSolicitudReemplazo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
	        this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSolicitudReemplazo.add(this.jPanelAccionesFormularioSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);							
			
			
			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
	        this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
	        
			
			this.jContentPaneDetalleSolicitudReemplazo.add(this.jPanelAccionesSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSolicitudReemplazo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSolicitudReemplazo=   new JScrollPane(this.jPanelCamposSolicitudReemplazo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSolicitudReemplazo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSolicitudReemplazo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSolicitudReemplazo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
			this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSolicitudReemplazo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);			
			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
			
			
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		
			
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudReemplazo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSolicitudReemplazo;//jContentPane;
		
		return jScrollPanelDatosEdicionSolicitudReemplazo;
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
