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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.SolicitudVacacionConstantesFunciones;

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
public class SolicitudVacacionDetalleFormJInternalFrame extends SolicitudVacacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSolicitudVacacion;
	
	protected JMenuBar jmenuBarDetalleSolicitudVacacion;
	
	protected JMenu jmenuDetalleSolicitudVacacion;
	protected JMenu jmenuDetalleArchivoSolicitudVacacion;
	protected JMenu jmenuDetalleAccionesSolicitudVacacion;
	protected JMenu jmenuDetalleDatosSolicitudVacacion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSolicitudVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSolicitudVacacion;	
	protected GridBagConstraints gridBagConstraintsSolicitudVacacion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SolicitudVacacionBeanSwingJInternalFrameAdditional jInternalFrameDetalleSolicitudVacacion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EmpleadoBeanSwingJInternalFrame empleadojefeBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadojefe="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EstadoSolicitudNomiBeanSwingJInternalFrame estadosolicitudnomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadosolicitudnomi="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";
	
	public SolicitudVacacionSessionBean solicitudvacacionSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EmpleadoSessionBean empleadojefeSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EstadoSolicitudNomiSessionBean estadosolicitudnomiSessionBean;
	public FormatoSessionBean formatoSessionBean;	
	
	public SolicitudVacacionLogic solicitudvacacionLogic;
	
	public JScrollPane jScrollPanelDatosSolicitudVacacion;
	public JScrollPane jScrollPanelDatosEdicionSolicitudVacacion;
	public JScrollPane jScrollPanelDatosGeneralSolicitudVacacion;
	
	protected JPanel jPanelCamposSolicitudVacacion;    
	protected JPanel jPanelCamposOcultosSolicitudVacacion;    	
	protected JPanel jPanelAccionesSolicitudVacacion;
	protected JPanel jPanelAccionesFormularioSolicitudVacacion;
    
	
	
	protected Integer iXPanelCamposSolicitudVacacion=0;
	protected Integer iYPanelCamposSolicitudVacacion=0;
	
	protected Integer iXPanelCamposOcultosSolicitudVacacion=0;
	protected Integer iYPanelCamposOcultosSolicitudVacacion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSolicitudVacacion;
	public JButton jButtonModificarSolicitudVacacion;
	public JButton jButtonActualizarSolicitudVacacion;
    public JButton jButtonEliminarSolicitudVacacion;
	public JButton jButtonCancelarSolicitudVacacion;
    public JButton jButtonGuardarCambiosSolicitudVacacion;
	public JButton jButtonGuardarCambiosTablaSolicitudVacacion;
	protected JButton jButtonCerrarSolicitudVacacion;
	
	
	protected JButton jButtonProcesarInformacionSolicitudVacacion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSolicitudVacacion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSolicitudVacacion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSolicitudVacacion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSolicitudVacacion;
	protected JButton jButtonModificarToolBarSolicitudVacacion;
	protected JButton jButtonActualizarToolBarSolicitudVacacion;
    protected JButton jButtonEliminarToolBarSolicitudVacacion;
	protected JButton jButtonCancelarToolBarSolicitudVacacion;
    protected JButton jButtonGuardarCambiosToolBarSolicitudVacacion;
	protected JButton jButtonGuardarCambiosTablaToolBarSolicitudVacacion;
	protected JButton jButtonMostrarOcultarTablaToolBarSolicitudVacacion;
	protected JButton jButtonCerrarToolBarSolicitudVacacion;
	
	protected JButton jButtonProcesarInformacionToolBarSolicitudVacacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSolicitudVacacion;
	protected JMenuItem jMenuItemModificarSolicitudVacacion;
	protected JMenuItem jMenuItemActualizarSolicitudVacacion;
    protected JMenuItem jMenuItemEliminarSolicitudVacacion;
	protected JMenuItem jMenuItemCancelarSolicitudVacacion;
    protected JMenuItem jMenuItemGuardarCambiosSolicitudVacacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaSolicitudVacacion;
	protected JMenuItem jMenuItemCerrarSolicitudVacacion;
	protected JMenuItem jMenuItemDetalleCerrarSolicitudVacacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarSolicitudVacacion;
	
	protected JMenuItem jMenuItemProcesarInformacionSolicitudVacacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSolicitudVacacion;
	protected JMenuItem jMenuItemMostrarOcultarSolicitudVacacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSolicitudVacacion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSolicitudVacacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSolicitudVacacion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSolicitudVacacion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSolicitudVacacion;
	public JLabel jLabelIdSolicitudVacacion;
	public JLabel jLabelidSolicitudVacacion;
	public JButton jButtonidSolicitudVacacionBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialSolicitudVacacion;
	public JLabel jLabelsecuencialSolicitudVacacion;
	public JTextField jTextFieldsecuencialSolicitudVacacion;
	public JButton jButtonsecuencialSolicitudVacacionBusqueda= new JButtonMe();

	public JPanel jPanelfecha_solicitaSolicitudVacacion;
	public JLabel jLabelfecha_solicitaSolicitudVacacion;
	//public JFormattedTextField jDateChooserfecha_solicitaSolicitudVacacion;

	public JDateChooser jDateChooserfecha_solicitaSolicitudVacacion;
	public JButton jButtonfecha_solicitaSolicitudVacacionBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ejecutaSolicitudVacacion;
	public JLabel jLabelfecha_ejecutaSolicitudVacacion;
	//public JFormattedTextField jDateChooserfecha_ejecutaSolicitudVacacion;

	public JDateChooser jDateChooserfecha_ejecutaSolicitudVacacion;
	public JButton jButtonfecha_ejecutaSolicitudVacacionBusqueda= new JButtonMe();

	public JPanel jPanelnumero_horasSolicitudVacacion;
	public JLabel jLabelnumero_horasSolicitudVacacion;
	public JTextField jTextFieldnumero_horasSolicitudVacacion;
	public JButton jButtonnumero_horasSolicitudVacacionBusqueda= new JButtonMe();

	public JPanel jPanelcosto_unitarioSolicitudVacacion;
	public JLabel jLabelcosto_unitarioSolicitudVacacion;
	public JTextField jTextFieldcosto_unitarioSolicitudVacacion;
	public JButton jButtoncosto_unitarioSolicitudVacacionBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalSolicitudVacacion;
	public JLabel jLabelcosto_totalSolicitudVacacion;
	public JTextField jTextFieldcosto_totalSolicitudVacacion;
	public JButton jButtoncosto_totalSolicitudVacacionBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionSolicitudVacacion;
	public JLabel jLabeldescripcionSolicitudVacacion;
	public JTextArea jTextAreadescripcionSolicitudVacacion;
	public JScrollPane jscrollPanedescripcionSolicitudVacacion;
	public JButton jButtondescripcionSolicitudVacacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaSolicitudVacacion;
	public JLabel jLabelid_empresaSolicitudVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaSolicitudVacacion;
	public JButton jButtonid_empresaSolicitudVacacion= new JButtonMe();
	public JButton jButtonid_empresaSolicitudVacacionUpdate= new JButtonMe();
	public JButton jButtonid_empresaSolicitudVacacionBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalSolicitudVacacion;
	public JLabel jLabelid_sucursalSolicitudVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalSolicitudVacacion;
	public JButton jButtonid_sucursalSolicitudVacacion= new JButtonMe();
	public JButton jButtonid_sucursalSolicitudVacacionUpdate= new JButtonMe();
	public JButton jButtonid_sucursalSolicitudVacacionBusqueda= new JButtonMe();

	public JPanel jPanelid_empleado_jefeSolicitudVacacion;
	public JLabel jLabelid_empleado_jefeSolicitudVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_jefeSolicitudVacacion;
	public JButton jButtonid_empleado_jefeSolicitudVacacion= new JButtonMe();
	public JButton jButtonid_empleado_jefeSolicitudVacacionUpdate= new JButtonMe();
	public JButton jButtonid_empleado_jefeSolicitudVacacionBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoSolicitudVacacion;
	public JLabel jLabelid_empleadoSolicitudVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoSolicitudVacacion;
	public JButton jButtonid_empleadoSolicitudVacacion= new JButtonMe();
	public JButton jButtonid_empleadoSolicitudVacacionUpdate= new JButtonMe();
	public JButton jButtonid_empleadoSolicitudVacacionBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraSolicitudVacacion;
	public JLabel jLabelid_estructuraSolicitudVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraSolicitudVacacion;
	public JButton jButtonid_estructuraSolicitudVacacion= new JButtonMe();
	public JButton jButtonid_estructuraSolicitudVacacionUpdate= new JButtonMe();
	public JButton jButtonid_estructuraSolicitudVacacionBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraSolicitudVacacionArbol= new JButtonMe();

	public JPanel jPanelid_estado_solicitud_nomiSolicitudVacacion;
	public JLabel jLabelid_estado_solicitud_nomiSolicitudVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_solicitud_nomiSolicitudVacacion;
	public JButton jButtonid_estado_solicitud_nomiSolicitudVacacion= new JButtonMe();
	public JButton jButtonid_estado_solicitud_nomiSolicitudVacacionUpdate= new JButtonMe();
	public JButton jButtonid_estado_solicitud_nomiSolicitudVacacionBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoSolicitudVacacion;
	public JLabel jLabelid_formatoSolicitudVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoSolicitudVacacion;
	public JButton jButtonid_formatoSolicitudVacacion= new JButtonMe();
	public JButton jButtonid_formatoSolicitudVacacionUpdate= new JButtonMe();
	public JButton jButtonid_formatoSolicitudVacacionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSolicitudVacacion;
	
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
	
	public SolicitudVacacionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSolicitudVacacion=new JPanel();
				this.jPanelAccionesFormularioSolicitudVacacion=new JPanel();
				this.jmenuBarDetalleSolicitudVacacion=new JMenuBar();
				this.jTtoolBarDetalleSolicitudVacacion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SolicitudVacacionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("SolicitudVacacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SolicitudVacacionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("SolicitudVacacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SolicitudVacacionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SolicitudVacacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SolicitudVacacionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SolicitudVacacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SolicitudVacacionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SolicitudVacacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSolicitudVacacion() {
		return this.jButtonActualizarToolBarSolicitudVacacion;
	}
	
	public JButton getjButtonEliminarToolBarSolicitudVacacion() {
		return this.jButtonEliminarToolBarSolicitudVacacion;
	}
	
	public JButton getjButtonCancelarToolBarSolicitudVacacion() {
		return this.jButtonCancelarToolBarSolicitudVacacion;
	}		
	
	public JButton getjButtonProcesarInformacionSolicitudVacacion() {
		return this.jButtonProcesarInformacionSolicitudVacacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSolicitudVacacion)	{
		this.jButtonProcesarInformacionSolicitudVacacion = jButtonProcesarInformacionSolicitudVacacion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSolicitudVacacion() {
		return this.jComboBoxTiposAccionesSolicitudVacacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSolicitudVacacion(
			JComboBox jComboBoxTiposRelacionesSolicitudVacacion) {
		this.jComboBoxTiposRelacionesSolicitudVacacion = jComboBoxTiposRelacionesSolicitudVacacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSolicitudVacacion(
			JComboBox jComboBoxTiposAccionesSolicitudVacacion) {
		this.jComboBoxTiposAccionesSolicitudVacacion = jComboBoxTiposAccionesSolicitudVacacion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSolicitudVacacion() {
		return this.jComboBoxTiposAccionesFormularioSolicitudVacacion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSolicitudVacacion(
			JComboBox jComboBoxTiposAccionesFormularioSolicitudVacacion) {
		this.jComboBoxTiposAccionesFormularioSolicitudVacacion = jComboBoxTiposAccionesFormularioSolicitudVacacion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.solicitudvacacionSessionBean=new SolicitudVacacionSessionBean();
		
		this.solicitudvacacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.solicitudvacacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.solicitudvacacionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SolicitudVacacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SolicitudVacacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SolicitudVacacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Solicitud Vacacion MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
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
	
		SolicitudVacacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSolicitudVacacion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSolicitudVacacion=new JButtonMe();
				this.jButtonModificarToolBarSolicitudVacacion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSolicitudVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSolicitudVacacion,this.jTtoolBarDetalleSolicitudVacacion,
							"actualizar","actualizar","Actualizar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSolicitudVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSolicitudVacacion,this.jTtoolBarDetalleSolicitudVacacion,
							"eliminar","eliminar","Eliminar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSolicitudVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSolicitudVacacion,this.jTtoolBarDetalleSolicitudVacacion,
							"cancelar","cancelar","Cancelar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSolicitudVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSolicitudVacacion,this.jTtoolBarDetalleSolicitudVacacion,
							"guardarcambios","guardarcambios","Guardar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSolicitudVacacion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSolicitudVacacion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSolicitudVacacion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSolicitudVacacion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSolicitudVacacion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSolicitudVacacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSolicitudVacacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSolicitudVacacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSolicitudVacacion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSolicitudVacacion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSolicitudVacacion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSolicitudVacacion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSolicitudVacacion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSolicitudVacacion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSolicitudVacacion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSolicitudVacacion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSolicitudVacacion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSolicitudVacacion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSolicitudVacacion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSolicitudVacacion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSolicitudVacacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSolicitudVacacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSolicitudVacacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSolicitudVacacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSolicitudVacacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSolicitudVacacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSolicitudVacacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSolicitudVacacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSolicitudVacacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSolicitudVacacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSolicitudVacacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSolicitudVacacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSolicitudVacacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSolicitudVacacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSolicitudVacacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSolicitudVacacion.add(this.jMenuItemDetalleCerrarSolicitudVacacion);
		
		this.jmenuDetalleAccionesSolicitudVacacion.add(this.jMenuItemActualizarSolicitudVacacion);
		this.jmenuDetalleAccionesSolicitudVacacion.add(this.jMenuItemEliminarSolicitudVacacion);
		this.jmenuDetalleAccionesSolicitudVacacion.add(this.jMenuItemCancelarSolicitudVacacion);		
		
		//this.jmenuDetalleDatosSolicitudVacacion.add(this.jMenuItemDetalleAbrirOrderBySolicitudVacacion);				
		this.jmenuDetalleDatosSolicitudVacacion.add(this.jMenuItemDetalleMostarOcultarSolicitudVacacion);				
				
		//this.jmenuDetalleAccionesSolicitudVacacion.add(this.jMenuItemGuardarCambiosSolicitudVacacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSolicitudVacacion.add(this.jmenuDetalleArchivoSolicitudVacacion);		
		this.jmenuBarDetalleSolicitudVacacion.add(this.jmenuDetalleAccionesSolicitudVacacion);		
		this.jmenuBarDetalleSolicitudVacacion.add(this.jmenuDetalleDatosSolicitudVacacion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSolicitudVacacion);				
	}
	
	
	public void inicializarElementosCamposSolicitudVacacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSolicitudVacacion = new JLabelMe();
		jLabelIdSolicitudVacacion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSolicitudVacacion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSolicitudVacacion.setToolTipText(SolicitudVacacionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSolicitudVacacion= new GridBagLayout();

		this.jPanelidSolicitudVacacion.setLayout(this.gridaBagLayoutSolicitudVacacion);

		jLabelidSolicitudVacacion = new JLabel();
		jLabelidSolicitudVacacion.setText("Id");

		jLabelidSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelsecuencialSolicitudVacacion = new JLabelMe();
		this.jLabelsecuencialSolicitudVacacion.setText(""+SolicitudVacacionConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialSolicitudVacacion.setToolTipText("Secuencial");
		this.jLabelsecuencialSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialSolicitudVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialSolicitudVacacion.setToolTipText(SolicitudVacacionConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutSolicitudVacacion = new GridBagLayout();
		this.jPanelsecuencialSolicitudVacacion.setLayout(this.gridaBagLayoutSolicitudVacacion);


		jTextFieldsecuencialSolicitudVacacion= new JTextFieldMe();

		jTextFieldsecuencialSolicitudVacacion.setEnabled(false);
		jTextFieldsecuencialSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialSolicitudVacacionBusqueda= new JButtonMe();
		this.jButtonsecuencialSolicitudVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialSolicitudVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialSolicitudVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialSolicitudVacacionBusqueda.setText("U");
		this.jButtonsecuencialSolicitudVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialSolicitudVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialSolicitudVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialSolicitudVacacionBusqueda"));

		if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialSolicitudVacacionBusqueda.setVisible(false);		}


					
		this.jLabelfecha_solicitaSolicitudVacacion = new JLabelMe();
		this.jLabelfecha_solicitaSolicitudVacacion.setText(""+SolicitudVacacionConstantesFunciones.LABEL_FECHASOLICITA+" : *");
		this.jLabelfecha_solicitaSolicitudVacacion.setToolTipText("Fecha Solicita");
		this.jLabelfecha_solicitaSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_solicitaSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_solicitaSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_solicitaSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_solicitaSolicitudVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_solicitaSolicitudVacacion.setToolTipText(SolicitudVacacionConstantesFunciones.LABEL_FECHASOLICITA);
		this.gridaBagLayoutSolicitudVacacion = new GridBagLayout();
		this.jPanelfecha_solicitaSolicitudVacacion.setLayout(this.gridaBagLayoutSolicitudVacacion);


		//jFormattedTextFieldfecha_solicitaSolicitudVacacion= new JFormattedTextFieldMe();

		jDateChooserfecha_solicitaSolicitudVacacion= new JDateChooser();
		jDateChooserfecha_solicitaSolicitudVacacion.setEnabled(false);
		jDateChooserfecha_solicitaSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_solicitaSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_solicitaSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_solicitaSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_solicitaSolicitudVacacion.setDate(new Date());
		jDateChooserfecha_solicitaSolicitudVacacion.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_solicitaSolicitudVacacion.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_solicitaSolicitudVacacionBusqueda= new JButtonMe();
		this.jButtonfecha_solicitaSolicitudVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_solicitaSolicitudVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_solicitaSolicitudVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_solicitaSolicitudVacacionBusqueda.setText("U");
		this.jButtonfecha_solicitaSolicitudVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_solicitaSolicitudVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_solicitaSolicitudVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_solicitaSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_solicitaSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_solicitaSolicitudVacacionBusqueda"));

		if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_solicitaSolicitudVacacionBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ejecutaSolicitudVacacion = new JLabelMe();
		this.jLabelfecha_ejecutaSolicitudVacacion.setText(""+SolicitudVacacionConstantesFunciones.LABEL_FECHAEJECUTA+" : *");
		this.jLabelfecha_ejecutaSolicitudVacacion.setToolTipText("Fecha Ejecuta");
		this.jLabelfecha_ejecutaSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ejecutaSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ejecutaSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ejecutaSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ejecutaSolicitudVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ejecutaSolicitudVacacion.setToolTipText(SolicitudVacacionConstantesFunciones.LABEL_FECHAEJECUTA);
		this.gridaBagLayoutSolicitudVacacion = new GridBagLayout();
		this.jPanelfecha_ejecutaSolicitudVacacion.setLayout(this.gridaBagLayoutSolicitudVacacion);


		//jFormattedTextFieldfecha_ejecutaSolicitudVacacion= new JFormattedTextFieldMe();

		jDateChooserfecha_ejecutaSolicitudVacacion= new JDateChooser();
		jDateChooserfecha_ejecutaSolicitudVacacion.setEnabled(false);
		jDateChooserfecha_ejecutaSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ejecutaSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ejecutaSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ejecutaSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ejecutaSolicitudVacacion.setDate(new Date());
		jDateChooserfecha_ejecutaSolicitudVacacion.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ejecutaSolicitudVacacion.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ejecutaSolicitudVacacionBusqueda= new JButtonMe();
		this.jButtonfecha_ejecutaSolicitudVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ejecutaSolicitudVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ejecutaSolicitudVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ejecutaSolicitudVacacionBusqueda.setText("U");
		this.jButtonfecha_ejecutaSolicitudVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ejecutaSolicitudVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ejecutaSolicitudVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ejecutaSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ejecutaSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ejecutaSolicitudVacacionBusqueda"));

		if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ejecutaSolicitudVacacionBusqueda.setVisible(false);		}


					
		this.jLabelnumero_horasSolicitudVacacion = new JLabelMe();
		this.jLabelnumero_horasSolicitudVacacion.setText(""+SolicitudVacacionConstantesFunciones.LABEL_NUMEROHORAS+" : *");
		this.jLabelnumero_horasSolicitudVacacion.setToolTipText("Numero Horas");
		this.jLabelnumero_horasSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_horasSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_horasSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_horasSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_horasSolicitudVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_horasSolicitudVacacion.setToolTipText(SolicitudVacacionConstantesFunciones.LABEL_NUMEROHORAS);
		this.gridaBagLayoutSolicitudVacacion = new GridBagLayout();
		this.jPanelnumero_horasSolicitudVacacion.setLayout(this.gridaBagLayoutSolicitudVacacion);


		jTextFieldnumero_horasSolicitudVacacion= new JTextFieldMe();
		jTextFieldnumero_horasSolicitudVacacion.setEnabled(false);
		jTextFieldnumero_horasSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_horasSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_horasSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_horasSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_horasSolicitudVacacion.setText("0");

		this.jButtonnumero_horasSolicitudVacacionBusqueda= new JButtonMe();
		this.jButtonnumero_horasSolicitudVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_horasSolicitudVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_horasSolicitudVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_horasSolicitudVacacionBusqueda.setText("U");
		this.jButtonnumero_horasSolicitudVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_horasSolicitudVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_horasSolicitudVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_horasSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_horasSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_horasSolicitudVacacionBusqueda"));

		if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_horasSolicitudVacacionBusqueda.setVisible(false);		}


					
		this.jLabelcosto_unitarioSolicitudVacacion = new JLabelMe();
		this.jLabelcosto_unitarioSolicitudVacacion.setText(""+SolicitudVacacionConstantesFunciones.LABEL_COSTOUNITARIO+" : *");
		this.jLabelcosto_unitarioSolicitudVacacion.setToolTipText("Costo Unitario");
		this.jLabelcosto_unitarioSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_unitarioSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_unitarioSolicitudVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_unitarioSolicitudVacacion.setToolTipText(SolicitudVacacionConstantesFunciones.LABEL_COSTOUNITARIO);
		this.gridaBagLayoutSolicitudVacacion = new GridBagLayout();
		this.jPanelcosto_unitarioSolicitudVacacion.setLayout(this.gridaBagLayoutSolicitudVacacion);


		jTextFieldcosto_unitarioSolicitudVacacion= new JTextFieldMe();
		jTextFieldcosto_unitarioSolicitudVacacion.setEnabled(false);
		jTextFieldcosto_unitarioSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_unitarioSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_unitarioSolicitudVacacion.setText("0.0");

		this.jButtoncosto_unitarioSolicitudVacacionBusqueda= new JButtonMe();
		this.jButtoncosto_unitarioSolicitudVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioSolicitudVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioSolicitudVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_unitarioSolicitudVacacionBusqueda.setText("U");
		this.jButtoncosto_unitarioSolicitudVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_unitarioSolicitudVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_unitarioSolicitudVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_unitarioSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_unitarioSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_unitarioSolicitudVacacionBusqueda"));

		if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_unitarioSolicitudVacacionBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalSolicitudVacacion = new JLabelMe();
		this.jLabelcosto_totalSolicitudVacacion.setText(""+SolicitudVacacionConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalSolicitudVacacion.setToolTipText("Costo Total");
		this.jLabelcosto_totalSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalSolicitudVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalSolicitudVacacion.setToolTipText(SolicitudVacacionConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutSolicitudVacacion = new GridBagLayout();
		this.jPanelcosto_totalSolicitudVacacion.setLayout(this.gridaBagLayoutSolicitudVacacion);


		jTextFieldcosto_totalSolicitudVacacion= new JTextFieldMe();
		jTextFieldcosto_totalSolicitudVacacion.setEnabled(false);
		jTextFieldcosto_totalSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalSolicitudVacacion.setText("0.0");

		this.jButtoncosto_totalSolicitudVacacionBusqueda= new JButtonMe();
		this.jButtoncosto_totalSolicitudVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalSolicitudVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalSolicitudVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalSolicitudVacacionBusqueda.setText("U");
		this.jButtoncosto_totalSolicitudVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalSolicitudVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalSolicitudVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalSolicitudVacacionBusqueda"));

		if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalSolicitudVacacionBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionSolicitudVacacion = new JLabelMe();
		this.jLabeldescripcionSolicitudVacacion.setText(""+SolicitudVacacionConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionSolicitudVacacion.setToolTipText("Descripcion");
		this.jLabeldescripcionSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionSolicitudVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionSolicitudVacacion.setToolTipText(SolicitudVacacionConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutSolicitudVacacion = new GridBagLayout();
		this.jPaneldescripcionSolicitudVacacion.setLayout(this.gridaBagLayoutSolicitudVacacion);


		jTextAreadescripcionSolicitudVacacion= new JTextAreaMe();
		jTextAreadescripcionSolicitudVacacion.setEnabled(false);
		jTextAreadescripcionSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionSolicitudVacacion.setLineWrap(true);
		jTextAreadescripcionSolicitudVacacion.setWrapStyleWord(true);
		jTextAreadescripcionSolicitudVacacion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionSolicitudVacacion.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionSolicitudVacacion = new JScrollPane(jTextAreadescripcionSolicitudVacacion);
		jscrollPanedescripcionSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionSolicitudVacacionBusqueda= new JButtonMe();
		this.jButtondescripcionSolicitudVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionSolicitudVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionSolicitudVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionSolicitudVacacionBusqueda.setText("U");
		this.jButtondescripcionSolicitudVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionSolicitudVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionSolicitudVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionSolicitudVacacionBusqueda"));

		if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionSolicitudVacacionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSolicitudVacacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaSolicitudVacacion = new JLabelMe();
		this.jLabelid_empresaSolicitudVacacion.setText(""+SolicitudVacacionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaSolicitudVacacion.setToolTipText("Empresa");
		this.jLabelid_empresaSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaSolicitudVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaSolicitudVacacion.setToolTipText(SolicitudVacacionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutSolicitudVacacion = new GridBagLayout();
		this.jPanelid_empresaSolicitudVacacion.setLayout(this.gridaBagLayoutSolicitudVacacion);


		jComboBoxid_empresaSolicitudVacacion= new JComboBoxMe();
		jComboBoxid_empresaSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaSolicitudVacacion.setEnabled(false);

		this.jButtonid_empresaSolicitudVacacion= new JButtonMe();
		this.jButtonid_empresaSolicitudVacacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSolicitudVacacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSolicitudVacacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSolicitudVacacion.setText("Buscar");
		this.jButtonid_empresaSolicitudVacacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaSolicitudVacacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSolicitudVacacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSolicitudVacacion"));

		this.jButtonid_empresaSolicitudVacacionBusqueda= new JButtonMe();
		this.jButtonid_empresaSolicitudVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSolicitudVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSolicitudVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSolicitudVacacionBusqueda.setText("U");
		this.jButtonid_empresaSolicitudVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaSolicitudVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSolicitudVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSolicitudVacacionBusqueda"));

		if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaSolicitudVacacionBusqueda.setVisible(false);		}

		this.jButtonid_empresaSolicitudVacacionUpdate= new JButtonMe();
		this.jButtonid_empresaSolicitudVacacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSolicitudVacacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSolicitudVacacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSolicitudVacacionUpdate.setText("U");
		this.jButtonid_empresaSolicitudVacacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaSolicitudVacacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSolicitudVacacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSolicitudVacacionUpdate"));



					
		this.jLabelid_sucursalSolicitudVacacion = new JLabelMe();
		this.jLabelid_sucursalSolicitudVacacion.setText(""+SolicitudVacacionConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalSolicitudVacacion.setToolTipText("Sucursal");
		this.jLabelid_sucursalSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalSolicitudVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalSolicitudVacacion.setToolTipText(SolicitudVacacionConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutSolicitudVacacion = new GridBagLayout();
		this.jPanelid_sucursalSolicitudVacacion.setLayout(this.gridaBagLayoutSolicitudVacacion);


		jComboBoxid_sucursalSolicitudVacacion= new JComboBoxMe();
		jComboBoxid_sucursalSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalSolicitudVacacion.setEnabled(false);

		this.jButtonid_sucursalSolicitudVacacion= new JButtonMe();
		this.jButtonid_sucursalSolicitudVacacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSolicitudVacacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSolicitudVacacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSolicitudVacacion.setText("Buscar");
		this.jButtonid_sucursalSolicitudVacacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalSolicitudVacacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSolicitudVacacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSolicitudVacacion"));

		this.jButtonid_sucursalSolicitudVacacionBusqueda= new JButtonMe();
		this.jButtonid_sucursalSolicitudVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSolicitudVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSolicitudVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalSolicitudVacacionBusqueda.setText("U");
		this.jButtonid_sucursalSolicitudVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalSolicitudVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSolicitudVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSolicitudVacacionBusqueda"));

		if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalSolicitudVacacionBusqueda.setVisible(false);		}

		this.jButtonid_sucursalSolicitudVacacionUpdate= new JButtonMe();
		this.jButtonid_sucursalSolicitudVacacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSolicitudVacacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSolicitudVacacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalSolicitudVacacionUpdate.setText("U");
		this.jButtonid_sucursalSolicitudVacacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalSolicitudVacacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSolicitudVacacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSolicitudVacacionUpdate"));



					
		this.jLabelid_empleado_jefeSolicitudVacacion = new JLabelMe();
		this.jLabelid_empleado_jefeSolicitudVacacion.setText(""+SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADOJEFE+" : *");
		this.jLabelid_empleado_jefeSolicitudVacacion.setToolTipText("Empleado Jefe");
		this.jLabelid_empleado_jefeSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleado_jefeSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleado_jefeSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_jefeSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleado_jefeSolicitudVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleado_jefeSolicitudVacacion.setToolTipText(SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADOJEFE);
		this.gridaBagLayoutSolicitudVacacion = new GridBagLayout();
		this.jPanelid_empleado_jefeSolicitudVacacion.setLayout(this.gridaBagLayoutSolicitudVacacion);


		jComboBoxid_empleado_jefeSolicitudVacacion= new JComboBoxMe();
		jComboBoxid_empleado_jefeSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_jefeSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_jefeSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_jefeSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleado_jefeSolicitudVacacion= new JButtonMe();
		this.jButtonid_empleado_jefeSolicitudVacacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_jefeSolicitudVacacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_jefeSolicitudVacacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_jefeSolicitudVacacion.setText("Buscar");
		this.jButtonid_empleado_jefeSolicitudVacacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleado_jefeSolicitudVacacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_jefeSolicitudVacacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleado_jefeSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_jefeSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_jefeSolicitudVacacion"));

		this.jButtonid_empleado_jefeSolicitudVacacionBusqueda= new JButtonMe();
		this.jButtonid_empleado_jefeSolicitudVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_jefeSolicitudVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_jefeSolicitudVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_jefeSolicitudVacacionBusqueda.setText("U");
		this.jButtonid_empleado_jefeSolicitudVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleado_jefeSolicitudVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_jefeSolicitudVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleado_jefeSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_jefeSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_jefeSolicitudVacacionBusqueda"));

		if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleado_jefeSolicitudVacacionBusqueda.setVisible(false);		}

		this.jButtonid_empleado_jefeSolicitudVacacionUpdate= new JButtonMe();
		this.jButtonid_empleado_jefeSolicitudVacacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_jefeSolicitudVacacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_jefeSolicitudVacacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_jefeSolicitudVacacionUpdate.setText("U");
		this.jButtonid_empleado_jefeSolicitudVacacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleado_jefeSolicitudVacacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_jefeSolicitudVacacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleado_jefeSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_jefeSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_jefeSolicitudVacacionUpdate"));



					
		this.jLabelid_empleadoSolicitudVacacion = new JLabelMe();
		this.jLabelid_empleadoSolicitudVacacion.setText(""+SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoSolicitudVacacion.setToolTipText("Empleado");
		this.jLabelid_empleadoSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoSolicitudVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoSolicitudVacacion.setToolTipText(SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutSolicitudVacacion = new GridBagLayout();
		this.jPanelid_empleadoSolicitudVacacion.setLayout(this.gridaBagLayoutSolicitudVacacion);


		jComboBoxid_empleadoSolicitudVacacion= new JComboBoxMe();
		jComboBoxid_empleadoSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoSolicitudVacacion= new JButtonMe();
		this.jButtonid_empleadoSolicitudVacacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoSolicitudVacacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoSolicitudVacacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoSolicitudVacacion.setText("Buscar");
		this.jButtonid_empleadoSolicitudVacacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoSolicitudVacacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoSolicitudVacacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoSolicitudVacacion"));

		this.jButtonid_empleadoSolicitudVacacionBusqueda= new JButtonMe();
		this.jButtonid_empleadoSolicitudVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoSolicitudVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoSolicitudVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoSolicitudVacacionBusqueda.setText("U");
		this.jButtonid_empleadoSolicitudVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoSolicitudVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoSolicitudVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoSolicitudVacacionBusqueda"));

		if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoSolicitudVacacionBusqueda.setVisible(false);		}

		this.jButtonid_empleadoSolicitudVacacionUpdate= new JButtonMe();
		this.jButtonid_empleadoSolicitudVacacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoSolicitudVacacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoSolicitudVacacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoSolicitudVacacionUpdate.setText("U");
		this.jButtonid_empleadoSolicitudVacacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoSolicitudVacacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoSolicitudVacacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoSolicitudVacacionUpdate"));



					
		this.jLabelid_estructuraSolicitudVacacion = new JLabelMe();
		this.jLabelid_estructuraSolicitudVacacion.setText(""+SolicitudVacacionConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraSolicitudVacacion.setToolTipText("Estructura");
		this.jLabelid_estructuraSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraSolicitudVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraSolicitudVacacion.setToolTipText(SolicitudVacacionConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutSolicitudVacacion = new GridBagLayout();
		this.jPanelid_estructuraSolicitudVacacion.setLayout(this.gridaBagLayoutSolicitudVacacion);


		jComboBoxid_estructuraSolicitudVacacion= new JComboBoxMe();
		jComboBoxid_estructuraSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraSolicitudVacacion= new JButtonMe();
		this.jButtonid_estructuraSolicitudVacacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraSolicitudVacacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraSolicitudVacacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraSolicitudVacacion.setText("Buscar");
		this.jButtonid_estructuraSolicitudVacacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraSolicitudVacacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraSolicitudVacacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraSolicitudVacacion"));

		this.jButtonid_estructuraSolicitudVacacionBusqueda= new JButtonMe();
		this.jButtonid_estructuraSolicitudVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraSolicitudVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraSolicitudVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraSolicitudVacacionBusqueda.setText("U");
		this.jButtonid_estructuraSolicitudVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraSolicitudVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraSolicitudVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraSolicitudVacacionBusqueda"));

		if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraSolicitudVacacionBusqueda.setVisible(false);		}

		this.jButtonid_estructuraSolicitudVacacionUpdate= new JButtonMe();
		this.jButtonid_estructuraSolicitudVacacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraSolicitudVacacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraSolicitudVacacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraSolicitudVacacionUpdate.setText("U");
		this.jButtonid_estructuraSolicitudVacacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraSolicitudVacacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraSolicitudVacacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraSolicitudVacacionUpdate"));


		jButtonid_estructuraSolicitudVacacionArbol= new JButtonMe();
		jButtonid_estructuraSolicitudVacacionArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraSolicitudVacacionArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraSolicitudVacacionArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraSolicitudVacacionArbol.setText("Arbol");
		jButtonid_estructuraSolicitudVacacionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructuraSolicitudVacacionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraSolicitudVacacionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructuraSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraSolicitudVacacionArbol"));



					
		this.jLabelid_estado_solicitud_nomiSolicitudVacacion = new JLabelMe();
		this.jLabelid_estado_solicitud_nomiSolicitudVacacion.setText(""+SolicitudVacacionConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI+" : *");
		this.jLabelid_estado_solicitud_nomiSolicitudVacacion.setToolTipText("Estado Solicitud Nomi");
		this.jLabelid_estado_solicitud_nomiSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_solicitud_nomiSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_solicitud_nomiSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_solicitud_nomiSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_solicitud_nomiSolicitudVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_solicitud_nomiSolicitudVacacion.setToolTipText(SolicitudVacacionConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI);
		this.gridaBagLayoutSolicitudVacacion = new GridBagLayout();
		this.jPanelid_estado_solicitud_nomiSolicitudVacacion.setLayout(this.gridaBagLayoutSolicitudVacacion);


		jComboBoxid_estado_solicitud_nomiSolicitudVacacion= new JComboBoxMe();
		jComboBoxid_estado_solicitud_nomiSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_solicitud_nomiSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_solicitud_nomiSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_solicitud_nomiSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_solicitud_nomiSolicitudVacacion= new JButtonMe();
		this.jButtonid_estado_solicitud_nomiSolicitudVacacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_solicitud_nomiSolicitudVacacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_solicitud_nomiSolicitudVacacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_solicitud_nomiSolicitudVacacion.setText("Buscar");
		this.jButtonid_estado_solicitud_nomiSolicitudVacacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_solicitud_nomiSolicitudVacacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_solicitud_nomiSolicitudVacacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_solicitud_nomiSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_solicitud_nomiSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_solicitud_nomiSolicitudVacacion"));

		this.jButtonid_estado_solicitud_nomiSolicitudVacacionBusqueda= new JButtonMe();
		this.jButtonid_estado_solicitud_nomiSolicitudVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_solicitud_nomiSolicitudVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_solicitud_nomiSolicitudVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_solicitud_nomiSolicitudVacacionBusqueda.setText("U");
		this.jButtonid_estado_solicitud_nomiSolicitudVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_solicitud_nomiSolicitudVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_solicitud_nomiSolicitudVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_solicitud_nomiSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_solicitud_nomiSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_solicitud_nomiSolicitudVacacionBusqueda"));

		if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_solicitud_nomiSolicitudVacacionBusqueda.setVisible(false);		}

		this.jButtonid_estado_solicitud_nomiSolicitudVacacionUpdate= new JButtonMe();
		this.jButtonid_estado_solicitud_nomiSolicitudVacacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_solicitud_nomiSolicitudVacacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_solicitud_nomiSolicitudVacacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_solicitud_nomiSolicitudVacacionUpdate.setText("U");
		this.jButtonid_estado_solicitud_nomiSolicitudVacacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_solicitud_nomiSolicitudVacacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_solicitud_nomiSolicitudVacacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_solicitud_nomiSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_solicitud_nomiSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_solicitud_nomiSolicitudVacacionUpdate"));



					
		this.jLabelid_formatoSolicitudVacacion = new JLabelMe();
		this.jLabelid_formatoSolicitudVacacion.setText(""+SolicitudVacacionConstantesFunciones.LABEL_IDFORMATO+" : *");
		this.jLabelid_formatoSolicitudVacacion.setToolTipText("Formato");
		this.jLabelid_formatoSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoSolicitudVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoSolicitudVacacion.setToolTipText(SolicitudVacacionConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutSolicitudVacacion = new GridBagLayout();
		this.jPanelid_formatoSolicitudVacacion.setLayout(this.gridaBagLayoutSolicitudVacacion);


		jComboBoxid_formatoSolicitudVacacion= new JComboBoxMe();
		jComboBoxid_formatoSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoSolicitudVacacion= new JButtonMe();
		this.jButtonid_formatoSolicitudVacacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoSolicitudVacacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoSolicitudVacacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoSolicitudVacacion.setText("Buscar");
		this.jButtonid_formatoSolicitudVacacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoSolicitudVacacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoSolicitudVacacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoSolicitudVacacion"));

		this.jButtonid_formatoSolicitudVacacionBusqueda= new JButtonMe();
		this.jButtonid_formatoSolicitudVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoSolicitudVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoSolicitudVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoSolicitudVacacionBusqueda.setText("U");
		this.jButtonid_formatoSolicitudVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoSolicitudVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoSolicitudVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoSolicitudVacacionBusqueda"));

		if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoSolicitudVacacionBusqueda.setVisible(false);		}

		this.jButtonid_formatoSolicitudVacacionUpdate= new JButtonMe();
		this.jButtonid_formatoSolicitudVacacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoSolicitudVacacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoSolicitudVacacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoSolicitudVacacionUpdate.setText("U");
		this.jButtonid_formatoSolicitudVacacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoSolicitudVacacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoSolicitudVacacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoSolicitudVacacionUpdate"));



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
		//this.jInternalFrameDetalleSolicitudVacacion = new SolicitudVacacionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Solicitud Vacacion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSolicitudVacacion= new GridBagLayout();
		

		
		String sToolTipSolicitudVacacion="";
		sToolTipSolicitudVacacion=SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSolicitudVacacion+="(Nomina.SolicitudVacacion)";
		}
		
		if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipSolicitudVacacion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSolicitudVacacion = new JButtonMe();
		this.jButtonModificarSolicitudVacacion = new JButtonMe();
        this.jButtonActualizarSolicitudVacacion = new JButtonMe();
        this.jButtonEliminarSolicitudVacacion = new JButtonMe();
        this.jButtonCancelarSolicitudVacacion = new JButtonMe();
        this.jButtonGuardarCambiosSolicitudVacacion = new JButtonMe();
		this.jButtonGuardarCambiosTablaSolicitudVacacion = new JButtonMe();
		this.jButtonCerrarSolicitudVacacion = new JButtonMe();
		
		this.jScrollPanelDatosSolicitudVacacion = new JScrollPane();   
        this.jScrollPanelDatosEdicionSolicitudVacacion = new JScrollPane();
		this.jScrollPanelDatosGeneralSolicitudVacacion = new JScrollPane();
				
		
		
		this.jPanelCamposSolicitudVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSolicitudVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSolicitudVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSolicitudVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Solicitud Vacacion";
		
		if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Vacaciones" + this.sPath));
		} else {
			this.jScrollPanelDatosSolicitudVacacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSolicitudVacacion.setName("jPanelCamposSolicitudVacacion"); 

		this.jPanelCamposOcultosSolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSolicitudVacacion.setName("jPanelCamposOcultosSolicitudVacacion"); 

        this.jPanelAccionesSolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSolicitudVacacion.setToolTipText("Acciones");
        this.jPanelAccionesSolicitudVacacion.setName("Acciones"); 

		this.jPanelAccionesFormularioSolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSolicitudVacacion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSolicitudVacacion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSolicitudVacacion.setText("Nuevo");
		this.jButtonModificarSolicitudVacacion.setText("Editar");
        this.jButtonActualizarSolicitudVacacion.setText("Actualizar");
        this.jButtonEliminarSolicitudVacacion.setText("Eliminar");
        this.jButtonCancelarSolicitudVacacion.setText("Cancelar");
        this.jButtonGuardarCambiosSolicitudVacacion.setText("Guardar");
		this.jButtonGuardarCambiosTablaSolicitudVacacion.setText("Guardar");
		this.jButtonCerrarSolicitudVacacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSolicitudVacacion,"nuevo_button","Nuevo",this.solicitudvacacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSolicitudVacacion,"modificar_button","Editar",this.solicitudvacacionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSolicitudVacacion,"actualizar_button","Actualizar",this.solicitudvacacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSolicitudVacacion,"eliminar_button","Eliminar",this.solicitudvacacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSolicitudVacacion,"cancelar_button","Cancelar",this.solicitudvacacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSolicitudVacacion,"guardarcambios_button","Guardar",this.solicitudvacacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSolicitudVacacion,"guardarcambiostabla_button","Guardar",this.solicitudvacacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSolicitudVacacion,"cerrar_button","Salir",this.solicitudvacacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSolicitudVacacion.setToolTipText("Nuevo"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSolicitudVacacion.setToolTipText("Editar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSolicitudVacacion.setToolTipText("Actualizar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSolicitudVacacion.setToolTipText("Eliminar)"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSolicitudVacacion.setToolTipText("Cancelar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSolicitudVacacion.setToolTipText("Guardar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSolicitudVacacion.setToolTipText("Guardar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSolicitudVacacion.setToolTipText("Salir"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSolicitudVacacion";
		inputMap = this.jButtonNuevoSolicitudVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSolicitudVacacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSolicitudVacacion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSolicitudVacacion";
		inputMap = this.jButtonActualizarSolicitudVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSolicitudVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSolicitudVacacion"));
		
		//ELIMINAR
		sMapKey = "EliminarSolicitudVacacion";
		inputMap = this.jButtonEliminarSolicitudVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSolicitudVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSolicitudVacacion"));
		
		//CANCELAR	
		sMapKey = "CancelarSolicitudVacacion";
		inputMap = this.jButtonCancelarSolicitudVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSolicitudVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSolicitudVacacion"));
		
		//CERRAR		
		sMapKey = "CerrarSolicitudVacacion";
		inputMap = this.jButtonCerrarSolicitudVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSolicitudVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSolicitudVacacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSolicitudVacacion";
		inputMap = this.jButtonGuardarCambiosTablaSolicitudVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSolicitudVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSolicitudVacacion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSolicitudVacacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSolicitudVacacion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSolicitudVacacion.setToolTipText("Nuevo SolicitudVacacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSolicitudVacacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSolicitudVacacion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSolicitudVacacion.setToolTipText("Sin Cerrar Ventana SolicitudVacacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSolicitudVacacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSolicitudVacacion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSolicitudVacacion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSolicitudVacacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSolicitudVacacion.setText("Accion");
		this.jComboBoxTiposAccionesSolicitudVacacion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSolicitudVacacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSolicitudVacacion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSolicitudVacacion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSolicitudVacacion = new JLabelMe();
		
		this.jLabelAccionesSolicitudVacacion.setText("Acciones");		
		this.jLabelAccionesSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSolicitudVacacion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSolicitudVacacion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSolicitudVacacion=new JTabbedPane();
		this.jTabbedPaneRelacionesSolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSolicitudVacacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSolicitudVacacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSolicitudVacacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSolicitudVacacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSolicitudVacacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSolicitudVacacion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSolicitudVacacion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSolicitudVacacion = new GridBagLayout();
		
		this.jPanelCamposSolicitudVacacion.setLayout(gridaBagLayoutCamposSolicitudVacacion);
		this.jPanelCamposOcultosSolicitudVacacion.setLayout(gridaBagLayoutCamposOcultosSolicitudVacacion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 0;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSolicitudVacacion.add(jLabelIdSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 1;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSolicitudVacacion.add(jLabelidSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);


	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 0;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaSolicitudVacacion.add(jLabelid_empresaSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx = 2;
		this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
		this.gridBagConstraintsSolicitudVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSolicitudVacacion.add(jButtonid_empresaSolicitudVacacionBusqueda, this.gridBagConstraintsSolicitudVacacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx = 3;
		this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
		this.gridBagConstraintsSolicitudVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSolicitudVacacion.add(jButtonid_empresaSolicitudVacacionUpdate, this.gridBagConstraintsSolicitudVacacion);
	}

	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 1;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaSolicitudVacacion.add(jComboBoxid_empresaSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);


	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 0;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalSolicitudVacacion.add(jLabelid_sucursalSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx = 2;
		this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
		this.gridBagConstraintsSolicitudVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalSolicitudVacacion.add(jButtonid_sucursalSolicitudVacacionBusqueda, this.gridBagConstraintsSolicitudVacacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx = 3;
		this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
		this.gridBagConstraintsSolicitudVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalSolicitudVacacion.add(jButtonid_sucursalSolicitudVacacionUpdate, this.gridBagConstraintsSolicitudVacacion);
	}

	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 1;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalSolicitudVacacion.add(jComboBoxid_sucursalSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);


	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 0;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleado_jefeSolicitudVacacion.add(jLabelid_empleado_jefeSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx = 2;
		this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
		this.gridBagConstraintsSolicitudVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_jefeSolicitudVacacion.add(jButtonid_empleado_jefeSolicitudVacacionBusqueda, this.gridBagConstraintsSolicitudVacacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx = 3;
		this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
		this.gridBagConstraintsSolicitudVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_jefeSolicitudVacacion.add(jButtonid_empleado_jefeSolicitudVacacionUpdate, this.gridBagConstraintsSolicitudVacacion);
	}

	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 1;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleado_jefeSolicitudVacacion.add(jComboBoxid_empleado_jefeSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);


	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 0;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoSolicitudVacacion.add(jLabelid_empleadoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx = 2;
		this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
		this.gridBagConstraintsSolicitudVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoSolicitudVacacion.add(jButtonid_empleadoSolicitudVacacionBusqueda, this.gridBagConstraintsSolicitudVacacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx = 3;
		this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
		this.gridBagConstraintsSolicitudVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoSolicitudVacacion.add(jButtonid_empleadoSolicitudVacacionUpdate, this.gridBagConstraintsSolicitudVacacion);
	}

	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 1;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoSolicitudVacacion.add(jComboBoxid_empleadoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);


	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 0;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraSolicitudVacacion.add(jLabelid_estructuraSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx = 2;
		this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
		this.gridBagConstraintsSolicitudVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraSolicitudVacacion.add(jButtonid_estructuraSolicitudVacacionBusqueda, this.gridBagConstraintsSolicitudVacacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx = 3;
		this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
		this.gridBagConstraintsSolicitudVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraSolicitudVacacion.add(jButtonid_estructuraSolicitudVacacionUpdate, this.gridBagConstraintsSolicitudVacacion);
	}

	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 1;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraSolicitudVacacion.add(jComboBoxid_estructuraSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);


	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 0;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_solicitud_nomiSolicitudVacacion.add(jLabelid_estado_solicitud_nomiSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx = 2;
		this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
		this.gridBagConstraintsSolicitudVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_solicitud_nomiSolicitudVacacion.add(jButtonid_estado_solicitud_nomiSolicitudVacacionBusqueda, this.gridBagConstraintsSolicitudVacacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx = 3;
		this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
		this.gridBagConstraintsSolicitudVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_solicitud_nomiSolicitudVacacion.add(jButtonid_estado_solicitud_nomiSolicitudVacacionUpdate, this.gridBagConstraintsSolicitudVacacion);
	}

	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 1;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_solicitud_nomiSolicitudVacacion.add(jComboBoxid_estado_solicitud_nomiSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);


	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 0;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formatoSolicitudVacacion.add(jLabelid_formatoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx = 2;
		this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
		this.gridBagConstraintsSolicitudVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoSolicitudVacacion.add(jButtonid_formatoSolicitudVacacionBusqueda, this.gridBagConstraintsSolicitudVacacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx = 3;
		this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
		this.gridBagConstraintsSolicitudVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoSolicitudVacacion.add(jButtonid_formatoSolicitudVacacionUpdate, this.gridBagConstraintsSolicitudVacacion);
	}

	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 1;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formatoSolicitudVacacion.add(jComboBoxid_formatoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);


	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 0;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialSolicitudVacacion.add(jLabelsecuencialSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx = 2;
		this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
		this.gridBagConstraintsSolicitudVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialSolicitudVacacion.add(jButtonsecuencialSolicitudVacacionBusqueda, this.gridBagConstraintsSolicitudVacacion);
	}

	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 1;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialSolicitudVacacion.add(jTextFieldsecuencialSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);


	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 0;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_solicitaSolicitudVacacion.add(jLabelfecha_solicitaSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx = 2;
		this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
		this.gridBagConstraintsSolicitudVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_solicitaSolicitudVacacion.add(jButtonfecha_solicitaSolicitudVacacionBusqueda, this.gridBagConstraintsSolicitudVacacion);
	}

	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 1;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_solicitaSolicitudVacacion.add(jDateChooserfecha_solicitaSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);


	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 0;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ejecutaSolicitudVacacion.add(jLabelfecha_ejecutaSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx = 2;
		this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
		this.gridBagConstraintsSolicitudVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ejecutaSolicitudVacacion.add(jButtonfecha_ejecutaSolicitudVacacionBusqueda, this.gridBagConstraintsSolicitudVacacion);
	}

	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 1;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ejecutaSolicitudVacacion.add(jDateChooserfecha_ejecutaSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);


	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 0;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_horasSolicitudVacacion.add(jLabelnumero_horasSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx = 2;
		this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
		this.gridBagConstraintsSolicitudVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_horasSolicitudVacacion.add(jButtonnumero_horasSolicitudVacacionBusqueda, this.gridBagConstraintsSolicitudVacacion);
	}

	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 1;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_horasSolicitudVacacion.add(jTextFieldnumero_horasSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);


	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 0;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_unitarioSolicitudVacacion.add(jLabelcosto_unitarioSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx = 2;
		this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
		this.gridBagConstraintsSolicitudVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_unitarioSolicitudVacacion.add(jButtoncosto_unitarioSolicitudVacacionBusqueda, this.gridBagConstraintsSolicitudVacacion);
	}

	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 1;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_unitarioSolicitudVacacion.add(jTextFieldcosto_unitarioSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);


	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 0;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalSolicitudVacacion.add(jLabelcosto_totalSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx = 2;
		this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
		this.gridBagConstraintsSolicitudVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalSolicitudVacacion.add(jButtoncosto_totalSolicitudVacacionBusqueda, this.gridBagConstraintsSolicitudVacacion);
	}

	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 1;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalSolicitudVacacion.add(jTextFieldcosto_totalSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);


	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 0;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionSolicitudVacacion.add(jLabeldescripcionSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx = 2;
		this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
		this.gridBagConstraintsSolicitudVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionSolicitudVacacion.add(jButtondescripcionSolicitudVacacionBusqueda, this.gridBagConstraintsSolicitudVacacion);
	}

	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudVacacion.gridy = 0;
	this.gridBagConstraintsSolicitudVacacion.gridx = 1;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionSolicitudVacacion.add(jscrollPanedescripcionSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudVacacion.gridy = iYPanelCamposSolicitudVacacion;
	this.gridBagConstraintsSolicitudVacacion.gridx = iXPanelCamposSolicitudVacacion++;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudVacacion.add(this.jPanelidSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(iXPanelCamposSolicitudVacacion % 1==0) {
		iXPanelCamposSolicitudVacacion=0;
		iYPanelCamposSolicitudVacacion++;
	}
	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudVacacion.gridy = iYPanelCamposSolicitudVacacion;
	this.gridBagConstraintsSolicitudVacacion.gridx = iXPanelCamposSolicitudVacacion++;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudVacacion.add(this.jPanelid_empleado_jefeSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(iXPanelCamposSolicitudVacacion % 1==0) {
		iXPanelCamposSolicitudVacacion=0;
		iYPanelCamposSolicitudVacacion++;
	}
	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudVacacion.gridy = iYPanelCamposSolicitudVacacion;
	this.gridBagConstraintsSolicitudVacacion.gridx = iXPanelCamposSolicitudVacacion++;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudVacacion.add(this.jPanelid_empleadoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(iXPanelCamposSolicitudVacacion % 1==0) {
		iXPanelCamposSolicitudVacacion=0;
		iYPanelCamposSolicitudVacacion++;
	}
	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudVacacion.gridy = iYPanelCamposSolicitudVacacion;
	this.gridBagConstraintsSolicitudVacacion.gridx = iXPanelCamposSolicitudVacacion++;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudVacacion.add(this.jPanelid_estructuraSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(iXPanelCamposSolicitudVacacion % 1==0) {
		iXPanelCamposSolicitudVacacion=0;
		iYPanelCamposSolicitudVacacion++;
	}
	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudVacacion.gridy = iYPanelCamposSolicitudVacacion;
	this.gridBagConstraintsSolicitudVacacion.gridx = iXPanelCamposSolicitudVacacion++;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudVacacion.add(this.jPanelid_estado_solicitud_nomiSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(iXPanelCamposSolicitudVacacion % 1==0) {
		iXPanelCamposSolicitudVacacion=0;
		iYPanelCamposSolicitudVacacion++;
	}
	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudVacacion.gridy = iYPanelCamposSolicitudVacacion;
	this.gridBagConstraintsSolicitudVacacion.gridx = iXPanelCamposSolicitudVacacion++;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudVacacion.add(this.jPanelid_formatoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(iXPanelCamposSolicitudVacacion % 1==0) {
		iXPanelCamposSolicitudVacacion=0;
		iYPanelCamposSolicitudVacacion++;
	}
	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudVacacion.gridy = iYPanelCamposSolicitudVacacion;
	this.gridBagConstraintsSolicitudVacacion.gridx = iXPanelCamposSolicitudVacacion++;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudVacacion.add(this.jPanelsecuencialSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(iXPanelCamposSolicitudVacacion % 1==0) {
		iXPanelCamposSolicitudVacacion=0;
		iYPanelCamposSolicitudVacacion++;
	}
	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudVacacion.gridy = iYPanelCamposSolicitudVacacion;
	this.gridBagConstraintsSolicitudVacacion.gridx = iXPanelCamposSolicitudVacacion++;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudVacacion.add(this.jPanelfecha_solicitaSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(iXPanelCamposSolicitudVacacion % 1==0) {
		iXPanelCamposSolicitudVacacion=0;
		iYPanelCamposSolicitudVacacion++;
	}
	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudVacacion.gridy = iYPanelCamposSolicitudVacacion;
	this.gridBagConstraintsSolicitudVacacion.gridx = iXPanelCamposSolicitudVacacion++;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudVacacion.add(this.jPanelfecha_ejecutaSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(iXPanelCamposSolicitudVacacion % 1==0) {
		iXPanelCamposSolicitudVacacion=0;
		iYPanelCamposSolicitudVacacion++;
	}
	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudVacacion.gridy = iYPanelCamposSolicitudVacacion;
	this.gridBagConstraintsSolicitudVacacion.gridx = iXPanelCamposSolicitudVacacion++;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudVacacion.add(this.jPanelnumero_horasSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(iXPanelCamposSolicitudVacacion % 1==0) {
		iXPanelCamposSolicitudVacacion=0;
		iYPanelCamposSolicitudVacacion++;
	}
	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudVacacion.gridy = iYPanelCamposSolicitudVacacion;
	this.gridBagConstraintsSolicitudVacacion.gridx = iXPanelCamposSolicitudVacacion++;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudVacacion.add(this.jPanelcosto_unitarioSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(iXPanelCamposSolicitudVacacion % 1==0) {
		iXPanelCamposSolicitudVacacion=0;
		iYPanelCamposSolicitudVacacion++;
	}
	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudVacacion.gridy = iYPanelCamposSolicitudVacacion;
	this.gridBagConstraintsSolicitudVacacion.gridx = iXPanelCamposSolicitudVacacion++;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudVacacion.add(this.jPanelcosto_totalSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(iXPanelCamposSolicitudVacacion % 1==0) {
		iXPanelCamposSolicitudVacacion=0;
		iYPanelCamposSolicitudVacacion++;
	}
	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudVacacion.gridy = iYPanelCamposSolicitudVacacion;
	this.gridBagConstraintsSolicitudVacacion.gridx = iXPanelCamposSolicitudVacacion++;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudVacacion.add(this.jPaneldescripcionSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(iXPanelCamposSolicitudVacacion % 1==0) {
		iXPanelCamposSolicitudVacacion=0;
		iYPanelCamposSolicitudVacacion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudVacacion.gridy = iYPanelCamposOcultosSolicitudVacacion;
	this.gridBagConstraintsSolicitudVacacion.gridx = iXPanelCamposOcultosSolicitudVacacion++;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSolicitudVacacion.add(this.jPanelid_empresaSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(iXPanelCamposOcultosSolicitudVacacion % 1==0) {
		iXPanelCamposOcultosSolicitudVacacion=0;
		iYPanelCamposOcultosSolicitudVacacion++;
	}
	this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudVacacion.gridy = iYPanelCamposOcultosSolicitudVacacion;
	this.gridBagConstraintsSolicitudVacacion.gridx = iXPanelCamposOcultosSolicitudVacacion++;
	this.gridBagConstraintsSolicitudVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSolicitudVacacion.add(this.jPanelid_sucursalSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);



	if(iXPanelCamposOcultosSolicitudVacacion % 1==0) {
		iXPanelCamposOcultosSolicitudVacacion=0;
		iYPanelCamposOcultosSolicitudVacacion++;
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
			
		GridBagLayout gridaBagLayoutAccionesSolicitudVacacion= new GridBagLayout();
		this.jPanelAccionesSolicitudVacacion.setLayout(gridaBagLayoutAccionesSolicitudVacacion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSolicitudVacacion= new GridBagLayout();
		this.jPanelAccionesFormularioSolicitudVacacion.setLayout(gridaBagLayoutAccionesFormularioSolicitudVacacion);
		
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSolicitudVacacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSolicitudVacacion.add(this.jComboBoxTiposAccionesFormularioSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSolicitudVacacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSolicitudVacacion.add(this.jCheckBoxPostAccionNuevoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.solicitudvacacionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSolicitudVacacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSolicitudVacacion.add(this.jCheckBoxPostAccionSinCerrarSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.solicitudvacacionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSolicitudVacacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSolicitudVacacion.add(this.jCheckBoxPostAccionSinMensajeSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXAccion++;
			
		this.jPanelAccionesSolicitudVacacion.add(this.jButtonModificarSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);							

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx =iPosXAccion++;
			
		this.jPanelAccionesSolicitudVacacion.add(this.jButtonEliminarSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		
			
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;		
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesSolicitudVacacion.add(this.jButtonActualizarSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);


		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;		
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesSolicitudVacacion.add(this.jButtonGuardarCambiosSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);	
		
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;		
		this.gridBagConstraintsSolicitudVacacion.gridx =iPosXAccion++;
		
		this.jPanelAccionesSolicitudVacacion.add(this.jButtonCancelarSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSolicitudVacacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSolicitudVacacion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();						
			this.gridBagConstraintsSolicitudVacacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSolicitudVacacion.gridx = 0;		
			//this.gridBagConstraintsSolicitudVacacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSolicitudVacacion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSolicitudVacacion.gridx =0;
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSolicitudVacacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SolicitudVacacionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSolicitudVacacion = new SolicitudVacacionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Solicitud Vacacion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Solicitud Vacacion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Solicitud Vacacion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SolicitudVacacionModel solicitudvacacionModel=new SolicitudVacacionModel(this);
			
			//SI USARA CLASE INTERNA
			//SolicitudVacacionModel.SolicitudVacacionFocusTraversalPolicy solicitudvacacionFocusTraversalPolicy = solicitudvacacionModel.new SolicitudVacacionFocusTraversalPolicy(this);
			
			//solicitudvacacionFocusTraversalPolicy.setsolicitudvacacionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(solicitudvacacionModel);
			
			
			this.jContentPaneDetalleSolicitudVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSolicitudVacacion = new GridBagLayout();	
			this.jContentPaneDetalleSolicitudVacacion.setLayout(gridaBagLayoutDetalleSolicitudVacacion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSolicitudVacacion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
				this.gridBagConstraintsSolicitudVacacion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSolicitudVacacion.gridx = 0;
					
				
				this.jContentPaneDetalleSolicitudVacacion.add(jTtoolBarDetalleSolicitudVacacion, gridBagConstraintsSolicitudVacacion);								
				
}
			
			this.jScrollPanelDatosEdicionSolicitudVacacion=   new JScrollPane(jContentPaneDetalleSolicitudVacacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSolicitudVacacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSolicitudVacacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSolicitudVacacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSolicitudVacacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSolicitudVacacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSolicitudVacacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSolicitudVacacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSolicitudVacacion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSolicitudVacacion.gridx = 0;
	        
			this.jContentPaneDetalleSolicitudVacacion.add(jPanelCamposSolicitudVacacion, gridBagConstraintsSolicitudVacacion);
			
			
			
			
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
						&& solicitudvacacionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.solicitudvacacionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSolicitudVacacion= new GridBagConstraints();
						this.gridBagConstraintsSolicitudVacacion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSolicitudVacacion.gridx = 0;
						this.jContentPaneDetalleSolicitudVacacion.add(this.jTabbedPaneRelacionesSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSolicitudVacacion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSolicitudVacacion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
					this.gridBagConstraintsSolicitudVacacion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSolicitudVacacion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSolicitudVacacion.gridx = 0;
					
				
					this.jContentPaneDetalleSolicitudVacacion.add(jPanelCamposOcultosSolicitudVacacion, gridBagConstraintsSolicitudVacacion);
				
					this.jPanelCamposOcultosSolicitudVacacion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsSolicitudVacacion.gridx = 0;
	        this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSolicitudVacacion.add(this.jPanelAccionesFormularioSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);							
			
			
			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
	        this.gridBagConstraintsSolicitudVacacion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsSolicitudVacacion.gridx = 0;
	        
			
			this.jContentPaneDetalleSolicitudVacacion.add(this.jPanelAccionesSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSolicitudVacacion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSolicitudVacacion=   new JScrollPane(this.jPanelCamposSolicitudVacacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSolicitudVacacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSolicitudVacacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSolicitudVacacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSolicitudVacacion.gridx = 0;
			this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSolicitudVacacion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSolicitudVacacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);			
			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSolicitudVacacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudVacacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
			
			
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudVacacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		
			
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudVacacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSolicitudVacacion;//jContentPane;
		
		return jScrollPanelDatosEdicionSolicitudVacacion;
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
