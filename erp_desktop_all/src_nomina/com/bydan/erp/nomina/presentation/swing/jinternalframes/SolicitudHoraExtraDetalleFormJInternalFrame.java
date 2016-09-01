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
import com.bydan.erp.nomina.util.SolicitudHoraExtraConstantesFunciones;

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
public class SolicitudHoraExtraDetalleFormJInternalFrame extends SolicitudHoraExtraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSolicitudHoraExtra;
	
	protected JMenuBar jmenuBarDetalleSolicitudHoraExtra;
	
	protected JMenu jmenuDetalleSolicitudHoraExtra;
	protected JMenu jmenuDetalleArchivoSolicitudHoraExtra;
	protected JMenu jmenuDetalleAccionesSolicitudHoraExtra;
	protected JMenu jmenuDetalleDatosSolicitudHoraExtra;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSolicitudHoraExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSolicitudHoraExtra;	
	protected GridBagConstraints gridBagConstraintsSolicitudHoraExtra;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SolicitudHoraExtraBeanSwingJInternalFrameAdditional jInternalFrameDetalleSolicitudHoraExtra;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpleadoBeanSwingJInternalFrame empleadojefeBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadojefe="";

	protected EstadoSolicitudNomiBeanSwingJInternalFrame estadosolicitudnomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadosolicitudnomi="";

	protected EmpleadoBeanSwingJInternalFrame empleadoreemplazoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadoreemplazo="";
	
	public SolicitudHoraExtraSessionBean solicitudhoraextraSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpleadoSessionBean empleadojefeSessionBean;
	public EstadoSolicitudNomiSessionBean estadosolicitudnomiSessionBean;
	public EmpleadoSessionBean empleadoreemplazoSessionBean;	
	
	public SolicitudHoraExtraLogic solicitudhoraextraLogic;
	
	public JScrollPane jScrollPanelDatosSolicitudHoraExtra;
	public JScrollPane jScrollPanelDatosEdicionSolicitudHoraExtra;
	public JScrollPane jScrollPanelDatosGeneralSolicitudHoraExtra;
	
	protected JPanel jPanelCamposSolicitudHoraExtra;    
	protected JPanel jPanelCamposOcultosSolicitudHoraExtra;    	
	protected JPanel jPanelAccionesSolicitudHoraExtra;
	protected JPanel jPanelAccionesFormularioSolicitudHoraExtra;
    
	
	
	protected Integer iXPanelCamposSolicitudHoraExtra=0;
	protected Integer iYPanelCamposSolicitudHoraExtra=0;
	
	protected Integer iXPanelCamposOcultosSolicitudHoraExtra=0;
	protected Integer iYPanelCamposOcultosSolicitudHoraExtra=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSolicitudHoraExtra;
	public JButton jButtonModificarSolicitudHoraExtra;
	public JButton jButtonActualizarSolicitudHoraExtra;
    public JButton jButtonEliminarSolicitudHoraExtra;
	public JButton jButtonCancelarSolicitudHoraExtra;
    public JButton jButtonGuardarCambiosSolicitudHoraExtra;
	public JButton jButtonGuardarCambiosTablaSolicitudHoraExtra;
	protected JButton jButtonCerrarSolicitudHoraExtra;
	
	
	protected JButton jButtonProcesarInformacionSolicitudHoraExtra;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSolicitudHoraExtra;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSolicitudHoraExtra;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSolicitudHoraExtra;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSolicitudHoraExtra;
	protected JButton jButtonModificarToolBarSolicitudHoraExtra;
	protected JButton jButtonActualizarToolBarSolicitudHoraExtra;
    protected JButton jButtonEliminarToolBarSolicitudHoraExtra;
	protected JButton jButtonCancelarToolBarSolicitudHoraExtra;
    protected JButton jButtonGuardarCambiosToolBarSolicitudHoraExtra;
	protected JButton jButtonGuardarCambiosTablaToolBarSolicitudHoraExtra;
	protected JButton jButtonMostrarOcultarTablaToolBarSolicitudHoraExtra;
	protected JButton jButtonCerrarToolBarSolicitudHoraExtra;
	
	protected JButton jButtonProcesarInformacionToolBarSolicitudHoraExtra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSolicitudHoraExtra;
	protected JMenuItem jMenuItemModificarSolicitudHoraExtra;
	protected JMenuItem jMenuItemActualizarSolicitudHoraExtra;
    protected JMenuItem jMenuItemEliminarSolicitudHoraExtra;
	protected JMenuItem jMenuItemCancelarSolicitudHoraExtra;
    protected JMenuItem jMenuItemGuardarCambiosSolicitudHoraExtra;
	protected JMenuItem jMenuItemGuardarCambiosTablaSolicitudHoraExtra;
	protected JMenuItem jMenuItemCerrarSolicitudHoraExtra;
	protected JMenuItem jMenuItemDetalleCerrarSolicitudHoraExtra;
	protected JMenuItem jMenuItemDetalleMostarOcultarSolicitudHoraExtra;
	
	protected JMenuItem jMenuItemProcesarInformacionSolicitudHoraExtra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSolicitudHoraExtra;
	protected JMenuItem jMenuItemMostrarOcultarSolicitudHoraExtra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSolicitudHoraExtra;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSolicitudHoraExtra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSolicitudHoraExtra;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSolicitudHoraExtra;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSolicitudHoraExtra;
	public JLabel jLabelIdSolicitudHoraExtra;
	public JLabel jLabelidSolicitudHoraExtra;
	public JButton jButtonidSolicitudHoraExtraBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialSolicitudHoraExtra;
	public JLabel jLabelsecuencialSolicitudHoraExtra;
	public JTextField jTextFieldsecuencialSolicitudHoraExtra;
	public JButton jButtonsecuencialSolicitudHoraExtraBusqueda= new JButtonMe();

	public JPanel jPanelfecha_solicitaSolicitudHoraExtra;
	public JLabel jLabelfecha_solicitaSolicitudHoraExtra;
	//public JFormattedTextField jDateChooserfecha_solicitaSolicitudHoraExtra;

	public JDateChooser jDateChooserfecha_solicitaSolicitudHoraExtra;
	public JButton jButtonfecha_solicitaSolicitudHoraExtraBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ejecutaSolicitudHoraExtra;
	public JLabel jLabelfecha_ejecutaSolicitudHoraExtra;
	//public JFormattedTextField jDateChooserfecha_ejecutaSolicitudHoraExtra;

	public JDateChooser jDateChooserfecha_ejecutaSolicitudHoraExtra;
	public JButton jButtonfecha_ejecutaSolicitudHoraExtraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_horasSolicitudHoraExtra;
	public JLabel jLabelnumero_horasSolicitudHoraExtra;
	public JTextField jTextFieldnumero_horasSolicitudHoraExtra;
	public JButton jButtonnumero_horasSolicitudHoraExtraBusqueda= new JButtonMe();

	public JPanel jPanelcosto_unitarioSolicitudHoraExtra;
	public JLabel jLabelcosto_unitarioSolicitudHoraExtra;
	public JTextField jTextFieldcosto_unitarioSolicitudHoraExtra;
	public JButton jButtoncosto_unitarioSolicitudHoraExtraBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalSolicitudHoraExtra;
	public JLabel jLabelcosto_totalSolicitudHoraExtra;
	public JTextField jTextFieldcosto_totalSolicitudHoraExtra;
	public JButton jButtoncosto_totalSolicitudHoraExtraBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionSolicitudHoraExtra;
	public JLabel jLabeldescripcionSolicitudHoraExtra;
	public JTextArea jTextAreadescripcionSolicitudHoraExtra;
	public JScrollPane jscrollPanedescripcionSolicitudHoraExtra;
	public JButton jButtondescripcionSolicitudHoraExtraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaSolicitudHoraExtra;
	public JLabel jLabelid_empresaSolicitudHoraExtra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaSolicitudHoraExtra;
	public JButton jButtonid_empresaSolicitudHoraExtra= new JButtonMe();
	public JButton jButtonid_empresaSolicitudHoraExtraUpdate= new JButtonMe();
	public JButton jButtonid_empresaSolicitudHoraExtraBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalSolicitudHoraExtra;
	public JLabel jLabelid_sucursalSolicitudHoraExtra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalSolicitudHoraExtra;
	public JButton jButtonid_sucursalSolicitudHoraExtra= new JButtonMe();
	public JButton jButtonid_sucursalSolicitudHoraExtraUpdate= new JButtonMe();
	public JButton jButtonid_sucursalSolicitudHoraExtraBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoSolicitudHoraExtra;
	public JLabel jLabelid_empleadoSolicitudHoraExtra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoSolicitudHoraExtra;
	public JButton jButtonid_empleadoSolicitudHoraExtra= new JButtonMe();
	public JButton jButtonid_empleadoSolicitudHoraExtraUpdate= new JButtonMe();
	public JButton jButtonid_empleadoSolicitudHoraExtraBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraSolicitudHoraExtra;
	public JLabel jLabelid_estructuraSolicitudHoraExtra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraSolicitudHoraExtra;
	public JButton jButtonid_estructuraSolicitudHoraExtra= new JButtonMe();
	public JButton jButtonid_estructuraSolicitudHoraExtraUpdate= new JButtonMe();
	public JButton jButtonid_estructuraSolicitudHoraExtraBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraSolicitudHoraExtraArbol= new JButtonMe();

	public JPanel jPanelid_empleado_jefeSolicitudHoraExtra;
	public JLabel jLabelid_empleado_jefeSolicitudHoraExtra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_jefeSolicitudHoraExtra;
	public JButton jButtonid_empleado_jefeSolicitudHoraExtra= new JButtonMe();
	public JButton jButtonid_empleado_jefeSolicitudHoraExtraUpdate= new JButtonMe();
	public JButton jButtonid_empleado_jefeSolicitudHoraExtraBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_solicitud_nomiSolicitudHoraExtra;
	public JLabel jLabelid_estado_solicitud_nomiSolicitudHoraExtra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra;
	public JButton jButtonid_estado_solicitud_nomiSolicitudHoraExtra= new JButtonMe();
	public JButton jButtonid_estado_solicitud_nomiSolicitudHoraExtraUpdate= new JButtonMe();
	public JButton jButtonid_estado_solicitud_nomiSolicitudHoraExtraBusqueda= new JButtonMe();

	public JPanel jPanelid_empleado_reemplazoSolicitudHoraExtra;
	public JLabel jLabelid_empleado_reemplazoSolicitudHoraExtra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_reemplazoSolicitudHoraExtra;
	public JButton jButtonid_empleado_reemplazoSolicitudHoraExtra= new JButtonMe();
	public JButton jButtonid_empleado_reemplazoSolicitudHoraExtraUpdate= new JButtonMe();
	public JButton jButtonid_empleado_reemplazoSolicitudHoraExtraBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSolicitudHoraExtra;
	
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
	
	public SolicitudHoraExtraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSolicitudHoraExtra=new JPanel();
				this.jPanelAccionesFormularioSolicitudHoraExtra=new JPanel();
				this.jmenuBarDetalleSolicitudHoraExtra=new JMenuBar();
				this.jTtoolBarDetalleSolicitudHoraExtra=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SolicitudHoraExtraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("SolicitudHoraExtra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SolicitudHoraExtraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("SolicitudHoraExtra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SolicitudHoraExtraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SolicitudHoraExtra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SolicitudHoraExtraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SolicitudHoraExtra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SolicitudHoraExtraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SolicitudHoraExtra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSolicitudHoraExtra() {
		return this.jButtonActualizarToolBarSolicitudHoraExtra;
	}
	
	public JButton getjButtonEliminarToolBarSolicitudHoraExtra() {
		return this.jButtonEliminarToolBarSolicitudHoraExtra;
	}
	
	public JButton getjButtonCancelarToolBarSolicitudHoraExtra() {
		return this.jButtonCancelarToolBarSolicitudHoraExtra;
	}		
	
	public JButton getjButtonProcesarInformacionSolicitudHoraExtra() {
		return this.jButtonProcesarInformacionSolicitudHoraExtra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSolicitudHoraExtra)	{
		this.jButtonProcesarInformacionSolicitudHoraExtra = jButtonProcesarInformacionSolicitudHoraExtra;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSolicitudHoraExtra() {
		return this.jComboBoxTiposAccionesSolicitudHoraExtra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSolicitudHoraExtra(
			JComboBox jComboBoxTiposRelacionesSolicitudHoraExtra) {
		this.jComboBoxTiposRelacionesSolicitudHoraExtra = jComboBoxTiposRelacionesSolicitudHoraExtra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSolicitudHoraExtra(
			JComboBox jComboBoxTiposAccionesSolicitudHoraExtra) {
		this.jComboBoxTiposAccionesSolicitudHoraExtra = jComboBoxTiposAccionesSolicitudHoraExtra;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSolicitudHoraExtra() {
		return this.jComboBoxTiposAccionesFormularioSolicitudHoraExtra;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSolicitudHoraExtra(
			JComboBox jComboBoxTiposAccionesFormularioSolicitudHoraExtra) {
		this.jComboBoxTiposAccionesFormularioSolicitudHoraExtra = jComboBoxTiposAccionesFormularioSolicitudHoraExtra;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.solicitudhoraextraSessionBean=new SolicitudHoraExtraSessionBean();
		
		this.solicitudhoraextraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.solicitudhoraextraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.solicitudhoraextraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SolicitudHoraExtraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SolicitudHoraExtraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SolicitudHoraExtraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Solicitud Hora Extra MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
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
	
		SolicitudHoraExtraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSolicitudHoraExtra= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSolicitudHoraExtra=new JButtonMe();
				this.jButtonModificarToolBarSolicitudHoraExtra=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSolicitudHoraExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSolicitudHoraExtra,this.jTtoolBarDetalleSolicitudHoraExtra,
							"actualizar","actualizar","Actualizar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSolicitudHoraExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSolicitudHoraExtra,this.jTtoolBarDetalleSolicitudHoraExtra,
							"eliminar","eliminar","Eliminar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSolicitudHoraExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSolicitudHoraExtra,this.jTtoolBarDetalleSolicitudHoraExtra,
							"cancelar","cancelar","Cancelar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSolicitudHoraExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSolicitudHoraExtra,this.jTtoolBarDetalleSolicitudHoraExtra,
							"guardarcambios","guardarcambios","Guardar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSolicitudHoraExtra=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSolicitudHoraExtra=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSolicitudHoraExtra=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSolicitudHoraExtra=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSolicitudHoraExtra=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSolicitudHoraExtra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSolicitudHoraExtra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSolicitudHoraExtra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSolicitudHoraExtra= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSolicitudHoraExtra.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSolicitudHoraExtra,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSolicitudHoraExtra= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSolicitudHoraExtra.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSolicitudHoraExtra,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSolicitudHoraExtra= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSolicitudHoraExtra.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSolicitudHoraExtra,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSolicitudHoraExtra= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSolicitudHoraExtra.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSolicitudHoraExtra,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSolicitudHoraExtra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSolicitudHoraExtra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSolicitudHoraExtra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSolicitudHoraExtra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSolicitudHoraExtra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSolicitudHoraExtra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSolicitudHoraExtra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSolicitudHoraExtra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSolicitudHoraExtra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSolicitudHoraExtra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSolicitudHoraExtra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSolicitudHoraExtra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSolicitudHoraExtra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSolicitudHoraExtra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSolicitudHoraExtra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSolicitudHoraExtra.add(this.jMenuItemDetalleCerrarSolicitudHoraExtra);
		
		this.jmenuDetalleAccionesSolicitudHoraExtra.add(this.jMenuItemActualizarSolicitudHoraExtra);
		this.jmenuDetalleAccionesSolicitudHoraExtra.add(this.jMenuItemEliminarSolicitudHoraExtra);
		this.jmenuDetalleAccionesSolicitudHoraExtra.add(this.jMenuItemCancelarSolicitudHoraExtra);		
		
		//this.jmenuDetalleDatosSolicitudHoraExtra.add(this.jMenuItemDetalleAbrirOrderBySolicitudHoraExtra);				
		this.jmenuDetalleDatosSolicitudHoraExtra.add(this.jMenuItemDetalleMostarOcultarSolicitudHoraExtra);				
				
		//this.jmenuDetalleAccionesSolicitudHoraExtra.add(this.jMenuItemGuardarCambiosSolicitudHoraExtra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSolicitudHoraExtra.add(this.jmenuDetalleArchivoSolicitudHoraExtra);		
		this.jmenuBarDetalleSolicitudHoraExtra.add(this.jmenuDetalleAccionesSolicitudHoraExtra);		
		this.jmenuBarDetalleSolicitudHoraExtra.add(this.jmenuDetalleDatosSolicitudHoraExtra);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSolicitudHoraExtra);				
	}
	
	
	public void inicializarElementosCamposSolicitudHoraExtra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSolicitudHoraExtra = new JLabelMe();
		jLabelIdSolicitudHoraExtra.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSolicitudHoraExtra = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSolicitudHoraExtra.setToolTipText(SolicitudHoraExtraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSolicitudHoraExtra= new GridBagLayout();

		this.jPanelidSolicitudHoraExtra.setLayout(this.gridaBagLayoutSolicitudHoraExtra);

		jLabelidSolicitudHoraExtra = new JLabel();
		jLabelidSolicitudHoraExtra.setText("Id");

		jLabelidSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelsecuencialSolicitudHoraExtra = new JLabelMe();
		this.jLabelsecuencialSolicitudHoraExtra.setText(""+SolicitudHoraExtraConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialSolicitudHoraExtra.setToolTipText("Secuencial");
		this.jLabelsecuencialSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialSolicitudHoraExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialSolicitudHoraExtra.setToolTipText(SolicitudHoraExtraConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutSolicitudHoraExtra = new GridBagLayout();
		this.jPanelsecuencialSolicitudHoraExtra.setLayout(this.gridaBagLayoutSolicitudHoraExtra);


		jTextFieldsecuencialSolicitudHoraExtra= new JTextFieldMe();

		jTextFieldsecuencialSolicitudHoraExtra.setEnabled(false);
		jTextFieldsecuencialSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialSolicitudHoraExtraBusqueda= new JButtonMe();
		this.jButtonsecuencialSolicitudHoraExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialSolicitudHoraExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialSolicitudHoraExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialSolicitudHoraExtraBusqueda.setText("U");
		this.jButtonsecuencialSolicitudHoraExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialSolicitudHoraExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialSolicitudHoraExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialSolicitudHoraExtraBusqueda"));

		if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialSolicitudHoraExtraBusqueda.setVisible(false);		}


					
		this.jLabelfecha_solicitaSolicitudHoraExtra = new JLabelMe();
		this.jLabelfecha_solicitaSolicitudHoraExtra.setText(""+SolicitudHoraExtraConstantesFunciones.LABEL_FECHASOLICITA+" : *");
		this.jLabelfecha_solicitaSolicitudHoraExtra.setToolTipText("Fecha Solicita");
		this.jLabelfecha_solicitaSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_solicitaSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_solicitaSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_solicitaSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_solicitaSolicitudHoraExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_solicitaSolicitudHoraExtra.setToolTipText(SolicitudHoraExtraConstantesFunciones.LABEL_FECHASOLICITA);
		this.gridaBagLayoutSolicitudHoraExtra = new GridBagLayout();
		this.jPanelfecha_solicitaSolicitudHoraExtra.setLayout(this.gridaBagLayoutSolicitudHoraExtra);


		//jFormattedTextFieldfecha_solicitaSolicitudHoraExtra= new JFormattedTextFieldMe();

		jDateChooserfecha_solicitaSolicitudHoraExtra= new JDateChooser();
		jDateChooserfecha_solicitaSolicitudHoraExtra.setEnabled(false);
		jDateChooserfecha_solicitaSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_solicitaSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_solicitaSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_solicitaSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_solicitaSolicitudHoraExtra.setDate(new Date());
		jDateChooserfecha_solicitaSolicitudHoraExtra.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_solicitaSolicitudHoraExtra.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_solicitaSolicitudHoraExtraBusqueda= new JButtonMe();
		this.jButtonfecha_solicitaSolicitudHoraExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_solicitaSolicitudHoraExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_solicitaSolicitudHoraExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_solicitaSolicitudHoraExtraBusqueda.setText("U");
		this.jButtonfecha_solicitaSolicitudHoraExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_solicitaSolicitudHoraExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_solicitaSolicitudHoraExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_solicitaSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_solicitaSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_solicitaSolicitudHoraExtraBusqueda"));

		if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_solicitaSolicitudHoraExtraBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ejecutaSolicitudHoraExtra = new JLabelMe();
		this.jLabelfecha_ejecutaSolicitudHoraExtra.setText(""+SolicitudHoraExtraConstantesFunciones.LABEL_FECHAEJECUTA+" : *");
		this.jLabelfecha_ejecutaSolicitudHoraExtra.setToolTipText("Fecha Ejecuta");
		this.jLabelfecha_ejecutaSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ejecutaSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ejecutaSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ejecutaSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ejecutaSolicitudHoraExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ejecutaSolicitudHoraExtra.setToolTipText(SolicitudHoraExtraConstantesFunciones.LABEL_FECHAEJECUTA);
		this.gridaBagLayoutSolicitudHoraExtra = new GridBagLayout();
		this.jPanelfecha_ejecutaSolicitudHoraExtra.setLayout(this.gridaBagLayoutSolicitudHoraExtra);


		//jFormattedTextFieldfecha_ejecutaSolicitudHoraExtra= new JFormattedTextFieldMe();

		jDateChooserfecha_ejecutaSolicitudHoraExtra= new JDateChooser();
		jDateChooserfecha_ejecutaSolicitudHoraExtra.setEnabled(false);
		jDateChooserfecha_ejecutaSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ejecutaSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ejecutaSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ejecutaSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ejecutaSolicitudHoraExtra.setDate(new Date());
		jDateChooserfecha_ejecutaSolicitudHoraExtra.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ejecutaSolicitudHoraExtra.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ejecutaSolicitudHoraExtraBusqueda= new JButtonMe();
		this.jButtonfecha_ejecutaSolicitudHoraExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ejecutaSolicitudHoraExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ejecutaSolicitudHoraExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ejecutaSolicitudHoraExtraBusqueda.setText("U");
		this.jButtonfecha_ejecutaSolicitudHoraExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ejecutaSolicitudHoraExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ejecutaSolicitudHoraExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ejecutaSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ejecutaSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ejecutaSolicitudHoraExtraBusqueda"));

		if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ejecutaSolicitudHoraExtraBusqueda.setVisible(false);		}


					
		this.jLabelnumero_horasSolicitudHoraExtra = new JLabelMe();
		this.jLabelnumero_horasSolicitudHoraExtra.setText(""+SolicitudHoraExtraConstantesFunciones.LABEL_NUMEROHORAS+" : *");
		this.jLabelnumero_horasSolicitudHoraExtra.setToolTipText("Numero Horas");
		this.jLabelnumero_horasSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_horasSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_horasSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_horasSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_horasSolicitudHoraExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_horasSolicitudHoraExtra.setToolTipText(SolicitudHoraExtraConstantesFunciones.LABEL_NUMEROHORAS);
		this.gridaBagLayoutSolicitudHoraExtra = new GridBagLayout();
		this.jPanelnumero_horasSolicitudHoraExtra.setLayout(this.gridaBagLayoutSolicitudHoraExtra);


		jTextFieldnumero_horasSolicitudHoraExtra= new JTextFieldMe();
		jTextFieldnumero_horasSolicitudHoraExtra.setEnabled(false);
		jTextFieldnumero_horasSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_horasSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_horasSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_horasSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_horasSolicitudHoraExtra.setText("0");

		this.jButtonnumero_horasSolicitudHoraExtraBusqueda= new JButtonMe();
		this.jButtonnumero_horasSolicitudHoraExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_horasSolicitudHoraExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_horasSolicitudHoraExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_horasSolicitudHoraExtraBusqueda.setText("U");
		this.jButtonnumero_horasSolicitudHoraExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_horasSolicitudHoraExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_horasSolicitudHoraExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_horasSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_horasSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_horasSolicitudHoraExtraBusqueda"));

		if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_horasSolicitudHoraExtraBusqueda.setVisible(false);		}


					
		this.jLabelcosto_unitarioSolicitudHoraExtra = new JLabelMe();
		this.jLabelcosto_unitarioSolicitudHoraExtra.setText(""+SolicitudHoraExtraConstantesFunciones.LABEL_COSTOUNITARIO+" : *");
		this.jLabelcosto_unitarioSolicitudHoraExtra.setToolTipText("Costo Unitario");
		this.jLabelcosto_unitarioSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_unitarioSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_unitarioSolicitudHoraExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_unitarioSolicitudHoraExtra.setToolTipText(SolicitudHoraExtraConstantesFunciones.LABEL_COSTOUNITARIO);
		this.gridaBagLayoutSolicitudHoraExtra = new GridBagLayout();
		this.jPanelcosto_unitarioSolicitudHoraExtra.setLayout(this.gridaBagLayoutSolicitudHoraExtra);


		jTextFieldcosto_unitarioSolicitudHoraExtra= new JTextFieldMe();
		jTextFieldcosto_unitarioSolicitudHoraExtra.setEnabled(false);
		jTextFieldcosto_unitarioSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_unitarioSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_unitarioSolicitudHoraExtra.setText("0.0");

		this.jButtoncosto_unitarioSolicitudHoraExtraBusqueda= new JButtonMe();
		this.jButtoncosto_unitarioSolicitudHoraExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioSolicitudHoraExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioSolicitudHoraExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_unitarioSolicitudHoraExtraBusqueda.setText("U");
		this.jButtoncosto_unitarioSolicitudHoraExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_unitarioSolicitudHoraExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_unitarioSolicitudHoraExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_unitarioSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_unitarioSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_unitarioSolicitudHoraExtraBusqueda"));

		if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_unitarioSolicitudHoraExtraBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalSolicitudHoraExtra = new JLabelMe();
		this.jLabelcosto_totalSolicitudHoraExtra.setText(""+SolicitudHoraExtraConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalSolicitudHoraExtra.setToolTipText("Costo Total");
		this.jLabelcosto_totalSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalSolicitudHoraExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalSolicitudHoraExtra.setToolTipText(SolicitudHoraExtraConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutSolicitudHoraExtra = new GridBagLayout();
		this.jPanelcosto_totalSolicitudHoraExtra.setLayout(this.gridaBagLayoutSolicitudHoraExtra);


		jTextFieldcosto_totalSolicitudHoraExtra= new JTextFieldMe();
		jTextFieldcosto_totalSolicitudHoraExtra.setEnabled(false);
		jTextFieldcosto_totalSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalSolicitudHoraExtra.setText("0.0");

		this.jButtoncosto_totalSolicitudHoraExtraBusqueda= new JButtonMe();
		this.jButtoncosto_totalSolicitudHoraExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalSolicitudHoraExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalSolicitudHoraExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalSolicitudHoraExtraBusqueda.setText("U");
		this.jButtoncosto_totalSolicitudHoraExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalSolicitudHoraExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalSolicitudHoraExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalSolicitudHoraExtraBusqueda"));

		if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalSolicitudHoraExtraBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionSolicitudHoraExtra = new JLabelMe();
		this.jLabeldescripcionSolicitudHoraExtra.setText(""+SolicitudHoraExtraConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionSolicitudHoraExtra.setToolTipText("Descripcion");
		this.jLabeldescripcionSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionSolicitudHoraExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionSolicitudHoraExtra.setToolTipText(SolicitudHoraExtraConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutSolicitudHoraExtra = new GridBagLayout();
		this.jPaneldescripcionSolicitudHoraExtra.setLayout(this.gridaBagLayoutSolicitudHoraExtra);


		jTextAreadescripcionSolicitudHoraExtra= new JTextAreaMe();
		jTextAreadescripcionSolicitudHoraExtra.setEnabled(false);
		jTextAreadescripcionSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionSolicitudHoraExtra.setLineWrap(true);
		jTextAreadescripcionSolicitudHoraExtra.setWrapStyleWord(true);
		jTextAreadescripcionSolicitudHoraExtra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionSolicitudHoraExtra.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionSolicitudHoraExtra = new JScrollPane(jTextAreadescripcionSolicitudHoraExtra);
		jscrollPanedescripcionSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionSolicitudHoraExtraBusqueda= new JButtonMe();
		this.jButtondescripcionSolicitudHoraExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionSolicitudHoraExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionSolicitudHoraExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionSolicitudHoraExtraBusqueda.setText("U");
		this.jButtondescripcionSolicitudHoraExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionSolicitudHoraExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionSolicitudHoraExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionSolicitudHoraExtraBusqueda"));

		if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionSolicitudHoraExtraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSolicitudHoraExtra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaSolicitudHoraExtra = new JLabelMe();
		this.jLabelid_empresaSolicitudHoraExtra.setText(""+SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaSolicitudHoraExtra.setToolTipText("Empresa");
		this.jLabelid_empresaSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaSolicitudHoraExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaSolicitudHoraExtra.setToolTipText(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutSolicitudHoraExtra = new GridBagLayout();
		this.jPanelid_empresaSolicitudHoraExtra.setLayout(this.gridaBagLayoutSolicitudHoraExtra);


		jComboBoxid_empresaSolicitudHoraExtra= new JComboBoxMe();
		jComboBoxid_empresaSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaSolicitudHoraExtra.setEnabled(false);

		this.jButtonid_empresaSolicitudHoraExtra= new JButtonMe();
		this.jButtonid_empresaSolicitudHoraExtra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSolicitudHoraExtra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSolicitudHoraExtra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSolicitudHoraExtra.setText("Buscar");
		this.jButtonid_empresaSolicitudHoraExtra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaSolicitudHoraExtra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSolicitudHoraExtra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSolicitudHoraExtra"));

		this.jButtonid_empresaSolicitudHoraExtraBusqueda= new JButtonMe();
		this.jButtonid_empresaSolicitudHoraExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSolicitudHoraExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSolicitudHoraExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSolicitudHoraExtraBusqueda.setText("U");
		this.jButtonid_empresaSolicitudHoraExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaSolicitudHoraExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSolicitudHoraExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSolicitudHoraExtraBusqueda"));

		if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaSolicitudHoraExtraBusqueda.setVisible(false);		}

		this.jButtonid_empresaSolicitudHoraExtraUpdate= new JButtonMe();
		this.jButtonid_empresaSolicitudHoraExtraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSolicitudHoraExtraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSolicitudHoraExtraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSolicitudHoraExtraUpdate.setText("U");
		this.jButtonid_empresaSolicitudHoraExtraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaSolicitudHoraExtraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSolicitudHoraExtraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSolicitudHoraExtraUpdate"));



					
		this.jLabelid_sucursalSolicitudHoraExtra = new JLabelMe();
		this.jLabelid_sucursalSolicitudHoraExtra.setText(""+SolicitudHoraExtraConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalSolicitudHoraExtra.setToolTipText("Sucursal");
		this.jLabelid_sucursalSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalSolicitudHoraExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalSolicitudHoraExtra.setToolTipText(SolicitudHoraExtraConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutSolicitudHoraExtra = new GridBagLayout();
		this.jPanelid_sucursalSolicitudHoraExtra.setLayout(this.gridaBagLayoutSolicitudHoraExtra);


		jComboBoxid_sucursalSolicitudHoraExtra= new JComboBoxMe();
		jComboBoxid_sucursalSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalSolicitudHoraExtra.setEnabled(false);

		this.jButtonid_sucursalSolicitudHoraExtra= new JButtonMe();
		this.jButtonid_sucursalSolicitudHoraExtra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSolicitudHoraExtra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSolicitudHoraExtra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSolicitudHoraExtra.setText("Buscar");
		this.jButtonid_sucursalSolicitudHoraExtra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalSolicitudHoraExtra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSolicitudHoraExtra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSolicitudHoraExtra"));

		this.jButtonid_sucursalSolicitudHoraExtraBusqueda= new JButtonMe();
		this.jButtonid_sucursalSolicitudHoraExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSolicitudHoraExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSolicitudHoraExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalSolicitudHoraExtraBusqueda.setText("U");
		this.jButtonid_sucursalSolicitudHoraExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalSolicitudHoraExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSolicitudHoraExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSolicitudHoraExtraBusqueda"));

		if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalSolicitudHoraExtraBusqueda.setVisible(false);		}

		this.jButtonid_sucursalSolicitudHoraExtraUpdate= new JButtonMe();
		this.jButtonid_sucursalSolicitudHoraExtraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSolicitudHoraExtraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSolicitudHoraExtraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalSolicitudHoraExtraUpdate.setText("U");
		this.jButtonid_sucursalSolicitudHoraExtraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalSolicitudHoraExtraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSolicitudHoraExtraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSolicitudHoraExtraUpdate"));



					
		this.jLabelid_empleadoSolicitudHoraExtra = new JLabelMe();
		this.jLabelid_empleadoSolicitudHoraExtra.setText(""+SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoSolicitudHoraExtra.setToolTipText("Empleado");
		this.jLabelid_empleadoSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoSolicitudHoraExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoSolicitudHoraExtra.setToolTipText(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutSolicitudHoraExtra = new GridBagLayout();
		this.jPanelid_empleadoSolicitudHoraExtra.setLayout(this.gridaBagLayoutSolicitudHoraExtra);


		jComboBoxid_empleadoSolicitudHoraExtra= new JComboBoxMe();
		jComboBoxid_empleadoSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoSolicitudHoraExtra= new JButtonMe();
		this.jButtonid_empleadoSolicitudHoraExtra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoSolicitudHoraExtra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoSolicitudHoraExtra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoSolicitudHoraExtra.setText("Buscar");
		this.jButtonid_empleadoSolicitudHoraExtra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoSolicitudHoraExtra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoSolicitudHoraExtra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoSolicitudHoraExtra"));

		this.jButtonid_empleadoSolicitudHoraExtraBusqueda= new JButtonMe();
		this.jButtonid_empleadoSolicitudHoraExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoSolicitudHoraExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoSolicitudHoraExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoSolicitudHoraExtraBusqueda.setText("U");
		this.jButtonid_empleadoSolicitudHoraExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoSolicitudHoraExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoSolicitudHoraExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoSolicitudHoraExtraBusqueda"));

		if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoSolicitudHoraExtraBusqueda.setVisible(false);		}

		this.jButtonid_empleadoSolicitudHoraExtraUpdate= new JButtonMe();
		this.jButtonid_empleadoSolicitudHoraExtraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoSolicitudHoraExtraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoSolicitudHoraExtraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoSolicitudHoraExtraUpdate.setText("U");
		this.jButtonid_empleadoSolicitudHoraExtraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoSolicitudHoraExtraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoSolicitudHoraExtraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoSolicitudHoraExtraUpdate"));



					
		this.jLabelid_estructuraSolicitudHoraExtra = new JLabelMe();
		this.jLabelid_estructuraSolicitudHoraExtra.setText(""+SolicitudHoraExtraConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraSolicitudHoraExtra.setToolTipText("Estructura");
		this.jLabelid_estructuraSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraSolicitudHoraExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraSolicitudHoraExtra.setToolTipText(SolicitudHoraExtraConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutSolicitudHoraExtra = new GridBagLayout();
		this.jPanelid_estructuraSolicitudHoraExtra.setLayout(this.gridaBagLayoutSolicitudHoraExtra);


		jComboBoxid_estructuraSolicitudHoraExtra= new JComboBoxMe();
		jComboBoxid_estructuraSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraSolicitudHoraExtra= new JButtonMe();
		this.jButtonid_estructuraSolicitudHoraExtra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraSolicitudHoraExtra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraSolicitudHoraExtra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraSolicitudHoraExtra.setText("Buscar");
		this.jButtonid_estructuraSolicitudHoraExtra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraSolicitudHoraExtra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraSolicitudHoraExtra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraSolicitudHoraExtra"));

		this.jButtonid_estructuraSolicitudHoraExtraBusqueda= new JButtonMe();
		this.jButtonid_estructuraSolicitudHoraExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraSolicitudHoraExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraSolicitudHoraExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraSolicitudHoraExtraBusqueda.setText("U");
		this.jButtonid_estructuraSolicitudHoraExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraSolicitudHoraExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraSolicitudHoraExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraSolicitudHoraExtraBusqueda"));

		if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraSolicitudHoraExtraBusqueda.setVisible(false);		}

		this.jButtonid_estructuraSolicitudHoraExtraUpdate= new JButtonMe();
		this.jButtonid_estructuraSolicitudHoraExtraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraSolicitudHoraExtraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraSolicitudHoraExtraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraSolicitudHoraExtraUpdate.setText("U");
		this.jButtonid_estructuraSolicitudHoraExtraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraSolicitudHoraExtraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraSolicitudHoraExtraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraSolicitudHoraExtraUpdate"));


		jButtonid_estructuraSolicitudHoraExtraArbol= new JButtonMe();
		jButtonid_estructuraSolicitudHoraExtraArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraSolicitudHoraExtraArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraSolicitudHoraExtraArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraSolicitudHoraExtraArbol.setText("Arbol");
		jButtonid_estructuraSolicitudHoraExtraArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructuraSolicitudHoraExtraArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraSolicitudHoraExtraArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructuraSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraSolicitudHoraExtraArbol"));



					
		this.jLabelid_empleado_jefeSolicitudHoraExtra = new JLabelMe();
		this.jLabelid_empleado_jefeSolicitudHoraExtra.setText(""+SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOJEFE+" : *");
		this.jLabelid_empleado_jefeSolicitudHoraExtra.setToolTipText("Empleado Jefe");
		this.jLabelid_empleado_jefeSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleado_jefeSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleado_jefeSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_jefeSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleado_jefeSolicitudHoraExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleado_jefeSolicitudHoraExtra.setToolTipText(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOJEFE);
		this.gridaBagLayoutSolicitudHoraExtra = new GridBagLayout();
		this.jPanelid_empleado_jefeSolicitudHoraExtra.setLayout(this.gridaBagLayoutSolicitudHoraExtra);


		jComboBoxid_empleado_jefeSolicitudHoraExtra= new JComboBoxMe();
		jComboBoxid_empleado_jefeSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_jefeSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_jefeSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_jefeSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleado_jefeSolicitudHoraExtra= new JButtonMe();
		this.jButtonid_empleado_jefeSolicitudHoraExtra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_jefeSolicitudHoraExtra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_jefeSolicitudHoraExtra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_jefeSolicitudHoraExtra.setText("Buscar");
		this.jButtonid_empleado_jefeSolicitudHoraExtra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleado_jefeSolicitudHoraExtra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_jefeSolicitudHoraExtra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleado_jefeSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_jefeSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_jefeSolicitudHoraExtra"));

		this.jButtonid_empleado_jefeSolicitudHoraExtraBusqueda= new JButtonMe();
		this.jButtonid_empleado_jefeSolicitudHoraExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_jefeSolicitudHoraExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_jefeSolicitudHoraExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_jefeSolicitudHoraExtraBusqueda.setText("U");
		this.jButtonid_empleado_jefeSolicitudHoraExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleado_jefeSolicitudHoraExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_jefeSolicitudHoraExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleado_jefeSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_jefeSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_jefeSolicitudHoraExtraBusqueda"));

		if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleado_jefeSolicitudHoraExtraBusqueda.setVisible(false);		}

		this.jButtonid_empleado_jefeSolicitudHoraExtraUpdate= new JButtonMe();
		this.jButtonid_empleado_jefeSolicitudHoraExtraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_jefeSolicitudHoraExtraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_jefeSolicitudHoraExtraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_jefeSolicitudHoraExtraUpdate.setText("U");
		this.jButtonid_empleado_jefeSolicitudHoraExtraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleado_jefeSolicitudHoraExtraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_jefeSolicitudHoraExtraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleado_jefeSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_jefeSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_jefeSolicitudHoraExtraUpdate"));



					
		this.jLabelid_estado_solicitud_nomiSolicitudHoraExtra = new JLabelMe();
		this.jLabelid_estado_solicitud_nomiSolicitudHoraExtra.setText(""+SolicitudHoraExtraConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI+" : *");
		this.jLabelid_estado_solicitud_nomiSolicitudHoraExtra.setToolTipText("Estado Solicitud Nomi");
		this.jLabelid_estado_solicitud_nomiSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_solicitud_nomiSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_solicitud_nomiSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_solicitud_nomiSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_solicitud_nomiSolicitudHoraExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_solicitud_nomiSolicitudHoraExtra.setToolTipText(SolicitudHoraExtraConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI);
		this.gridaBagLayoutSolicitudHoraExtra = new GridBagLayout();
		this.jPanelid_estado_solicitud_nomiSolicitudHoraExtra.setLayout(this.gridaBagLayoutSolicitudHoraExtra);


		jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra= new JComboBoxMe();
		jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_solicitud_nomiSolicitudHoraExtra= new JButtonMe();
		this.jButtonid_estado_solicitud_nomiSolicitudHoraExtra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_solicitud_nomiSolicitudHoraExtra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_solicitud_nomiSolicitudHoraExtra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_solicitud_nomiSolicitudHoraExtra.setText("Buscar");
		this.jButtonid_estado_solicitud_nomiSolicitudHoraExtra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_solicitud_nomiSolicitudHoraExtra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_solicitud_nomiSolicitudHoraExtra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_solicitud_nomiSolicitudHoraExtra"));

		this.jButtonid_estado_solicitud_nomiSolicitudHoraExtraBusqueda= new JButtonMe();
		this.jButtonid_estado_solicitud_nomiSolicitudHoraExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_solicitud_nomiSolicitudHoraExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_solicitud_nomiSolicitudHoraExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_solicitud_nomiSolicitudHoraExtraBusqueda.setText("U");
		this.jButtonid_estado_solicitud_nomiSolicitudHoraExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_solicitud_nomiSolicitudHoraExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_solicitud_nomiSolicitudHoraExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_solicitud_nomiSolicitudHoraExtraBusqueda"));

		if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_solicitud_nomiSolicitudHoraExtraBusqueda.setVisible(false);		}

		this.jButtonid_estado_solicitud_nomiSolicitudHoraExtraUpdate= new JButtonMe();
		this.jButtonid_estado_solicitud_nomiSolicitudHoraExtraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_solicitud_nomiSolicitudHoraExtraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_solicitud_nomiSolicitudHoraExtraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_solicitud_nomiSolicitudHoraExtraUpdate.setText("U");
		this.jButtonid_estado_solicitud_nomiSolicitudHoraExtraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_solicitud_nomiSolicitudHoraExtraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_solicitud_nomiSolicitudHoraExtraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_solicitud_nomiSolicitudHoraExtraUpdate"));



					
		this.jLabelid_empleado_reemplazoSolicitudHoraExtra = new JLabelMe();
		this.jLabelid_empleado_reemplazoSolicitudHoraExtra.setText(""+SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO+" : *");
		this.jLabelid_empleado_reemplazoSolicitudHoraExtra.setToolTipText("Empleado Reemplazo");
		this.jLabelid_empleado_reemplazoSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_empleado_reemplazoSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_empleado_reemplazoSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_reemplazoSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleado_reemplazoSolicitudHoraExtra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleado_reemplazoSolicitudHoraExtra.setToolTipText(SolicitudHoraExtraConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO);
		this.gridaBagLayoutSolicitudHoraExtra = new GridBagLayout();
		this.jPanelid_empleado_reemplazoSolicitudHoraExtra.setLayout(this.gridaBagLayoutSolicitudHoraExtra);


		jComboBoxid_empleado_reemplazoSolicitudHoraExtra= new JComboBoxMe();
		jComboBoxid_empleado_reemplazoSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_reemplazoSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_reemplazoSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_reemplazoSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleado_reemplazoSolicitudHoraExtra= new JButtonMe();
		this.jButtonid_empleado_reemplazoSolicitudHoraExtra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_reemplazoSolicitudHoraExtra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_reemplazoSolicitudHoraExtra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_reemplazoSolicitudHoraExtra.setText("Buscar");
		this.jButtonid_empleado_reemplazoSolicitudHoraExtra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleado_reemplazoSolicitudHoraExtra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_reemplazoSolicitudHoraExtra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleado_reemplazoSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_reemplazoSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_reemplazoSolicitudHoraExtra"));

		this.jButtonid_empleado_reemplazoSolicitudHoraExtraBusqueda= new JButtonMe();
		this.jButtonid_empleado_reemplazoSolicitudHoraExtraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_reemplazoSolicitudHoraExtraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_reemplazoSolicitudHoraExtraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_reemplazoSolicitudHoraExtraBusqueda.setText("U");
		this.jButtonid_empleado_reemplazoSolicitudHoraExtraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleado_reemplazoSolicitudHoraExtraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_reemplazoSolicitudHoraExtraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleado_reemplazoSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_reemplazoSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_reemplazoSolicitudHoraExtraBusqueda"));

		if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleado_reemplazoSolicitudHoraExtraBusqueda.setVisible(false);		}

		this.jButtonid_empleado_reemplazoSolicitudHoraExtraUpdate= new JButtonMe();
		this.jButtonid_empleado_reemplazoSolicitudHoraExtraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_reemplazoSolicitudHoraExtraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_reemplazoSolicitudHoraExtraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_reemplazoSolicitudHoraExtraUpdate.setText("U");
		this.jButtonid_empleado_reemplazoSolicitudHoraExtraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleado_reemplazoSolicitudHoraExtraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_reemplazoSolicitudHoraExtraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleado_reemplazoSolicitudHoraExtra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_reemplazoSolicitudHoraExtra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_reemplazoSolicitudHoraExtraUpdate"));



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
		//this.jInternalFrameDetalleSolicitudHoraExtra = new SolicitudHoraExtraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Solicitud Hora Extra DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSolicitudHoraExtra= new GridBagLayout();
		

		
		String sToolTipSolicitudHoraExtra="";
		sToolTipSolicitudHoraExtra=SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSolicitudHoraExtra+="(Nomina.SolicitudHoraExtra)";
		}
		
		if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
			sToolTipSolicitudHoraExtra+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSolicitudHoraExtra = new JButtonMe();
		this.jButtonModificarSolicitudHoraExtra = new JButtonMe();
        this.jButtonActualizarSolicitudHoraExtra = new JButtonMe();
        this.jButtonEliminarSolicitudHoraExtra = new JButtonMe();
        this.jButtonCancelarSolicitudHoraExtra = new JButtonMe();
        this.jButtonGuardarCambiosSolicitudHoraExtra = new JButtonMe();
		this.jButtonGuardarCambiosTablaSolicitudHoraExtra = new JButtonMe();
		this.jButtonCerrarSolicitudHoraExtra = new JButtonMe();
		
		this.jScrollPanelDatosSolicitudHoraExtra = new JScrollPane();   
        this.jScrollPanelDatosEdicionSolicitudHoraExtra = new JScrollPane();
		this.jScrollPanelDatosGeneralSolicitudHoraExtra = new JScrollPane();
				
		
		
		this.jPanelCamposSolicitudHoraExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSolicitudHoraExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSolicitudHoraExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSolicitudHoraExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Solicitud Hora Extra";
		
		if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Hora Extras" + this.sPath));
		} else {
			this.jScrollPanelDatosSolicitudHoraExtra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSolicitudHoraExtra.setName("jPanelCamposSolicitudHoraExtra"); 

		this.jPanelCamposOcultosSolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSolicitudHoraExtra.setName("jPanelCamposOcultosSolicitudHoraExtra"); 

        this.jPanelAccionesSolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSolicitudHoraExtra.setToolTipText("Acciones");
        this.jPanelAccionesSolicitudHoraExtra.setName("Acciones"); 

		this.jPanelAccionesFormularioSolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSolicitudHoraExtra.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSolicitudHoraExtra.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSolicitudHoraExtra.setText("Nuevo");
		this.jButtonModificarSolicitudHoraExtra.setText("Editar");
        this.jButtonActualizarSolicitudHoraExtra.setText("Actualizar");
        this.jButtonEliminarSolicitudHoraExtra.setText("Eliminar");
        this.jButtonCancelarSolicitudHoraExtra.setText("Cancelar");
        this.jButtonGuardarCambiosSolicitudHoraExtra.setText("Guardar");
		this.jButtonGuardarCambiosTablaSolicitudHoraExtra.setText("Guardar");
		this.jButtonCerrarSolicitudHoraExtra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSolicitudHoraExtra,"nuevo_button","Nuevo",this.solicitudhoraextraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSolicitudHoraExtra,"modificar_button","Editar",this.solicitudhoraextraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSolicitudHoraExtra,"actualizar_button","Actualizar",this.solicitudhoraextraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSolicitudHoraExtra,"eliminar_button","Eliminar",this.solicitudhoraextraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSolicitudHoraExtra,"cancelar_button","Cancelar",this.solicitudhoraextraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSolicitudHoraExtra,"guardarcambios_button","Guardar",this.solicitudhoraextraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSolicitudHoraExtra,"guardarcambiostabla_button","Guardar",this.solicitudhoraextraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSolicitudHoraExtra,"cerrar_button","Salir",this.solicitudhoraextraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSolicitudHoraExtra.setToolTipText("Nuevo"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSolicitudHoraExtra.setToolTipText("Editar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSolicitudHoraExtra.setToolTipText("Actualizar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSolicitudHoraExtra.setToolTipText("Eliminar)"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSolicitudHoraExtra.setToolTipText("Cancelar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSolicitudHoraExtra.setToolTipText("Guardar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSolicitudHoraExtra.setToolTipText("Guardar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSolicitudHoraExtra.setToolTipText("Salir"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSolicitudHoraExtra";
		inputMap = this.jButtonNuevoSolicitudHoraExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSolicitudHoraExtra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSolicitudHoraExtra"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSolicitudHoraExtra";
		inputMap = this.jButtonActualizarSolicitudHoraExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSolicitudHoraExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSolicitudHoraExtra"));
		
		//ELIMINAR
		sMapKey = "EliminarSolicitudHoraExtra";
		inputMap = this.jButtonEliminarSolicitudHoraExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSolicitudHoraExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSolicitudHoraExtra"));
		
		//CANCELAR	
		sMapKey = "CancelarSolicitudHoraExtra";
		inputMap = this.jButtonCancelarSolicitudHoraExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSolicitudHoraExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSolicitudHoraExtra"));
		
		//CERRAR		
		sMapKey = "CerrarSolicitudHoraExtra";
		inputMap = this.jButtonCerrarSolicitudHoraExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSolicitudHoraExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSolicitudHoraExtra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSolicitudHoraExtra";
		inputMap = this.jButtonGuardarCambiosTablaSolicitudHoraExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSolicitudHoraExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSolicitudHoraExtra"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSolicitudHoraExtra = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSolicitudHoraExtra.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSolicitudHoraExtra.setToolTipText("Nuevo SolicitudHoraExtra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSolicitudHoraExtra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSolicitudHoraExtra.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSolicitudHoraExtra.setToolTipText("Sin Cerrar Ventana SolicitudHoraExtra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSolicitudHoraExtra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSolicitudHoraExtra.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSolicitudHoraExtra.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSolicitudHoraExtra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSolicitudHoraExtra.setText("Accion");
		this.jComboBoxTiposAccionesSolicitudHoraExtra.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSolicitudHoraExtra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSolicitudHoraExtra.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSolicitudHoraExtra.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSolicitudHoraExtra = new JLabelMe();
		
		this.jLabelAccionesSolicitudHoraExtra.setText("Acciones");		
		this.jLabelAccionesSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSolicitudHoraExtra();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSolicitudHoraExtra();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSolicitudHoraExtra=new JTabbedPane();
		this.jTabbedPaneRelacionesSolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSolicitudHoraExtra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSolicitudHoraExtra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSolicitudHoraExtra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSolicitudHoraExtra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSolicitudHoraExtra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSolicitudHoraExtra.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSolicitudHoraExtra = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSolicitudHoraExtra = new GridBagLayout();
		
		this.jPanelCamposSolicitudHoraExtra.setLayout(gridaBagLayoutCamposSolicitudHoraExtra);
		this.jPanelCamposOcultosSolicitudHoraExtra.setLayout(gridaBagLayoutCamposOcultosSolicitudHoraExtra);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSolicitudHoraExtra.add(jLabelIdSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 1;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSolicitudHoraExtra.add(jLabelidSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);


	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaSolicitudHoraExtra.add(jLabelid_empresaSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 2;
		this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
		this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSolicitudHoraExtra.add(jButtonid_empresaSolicitudHoraExtraBusqueda, this.gridBagConstraintsSolicitudHoraExtra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 3;
		this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
		this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSolicitudHoraExtra.add(jButtonid_empresaSolicitudHoraExtraUpdate, this.gridBagConstraintsSolicitudHoraExtra);
	}

	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 1;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaSolicitudHoraExtra.add(jComboBoxid_empresaSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);


	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalSolicitudHoraExtra.add(jLabelid_sucursalSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 2;
		this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
		this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalSolicitudHoraExtra.add(jButtonid_sucursalSolicitudHoraExtraBusqueda, this.gridBagConstraintsSolicitudHoraExtra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 3;
		this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
		this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalSolicitudHoraExtra.add(jButtonid_sucursalSolicitudHoraExtraUpdate, this.gridBagConstraintsSolicitudHoraExtra);
	}

	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 1;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalSolicitudHoraExtra.add(jComboBoxid_sucursalSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);


	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoSolicitudHoraExtra.add(jLabelid_empleadoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 2;
		this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
		this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoSolicitudHoraExtra.add(jButtonid_empleadoSolicitudHoraExtraBusqueda, this.gridBagConstraintsSolicitudHoraExtra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 3;
		this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
		this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoSolicitudHoraExtra.add(jButtonid_empleadoSolicitudHoraExtraUpdate, this.gridBagConstraintsSolicitudHoraExtra);
	}

	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 1;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoSolicitudHoraExtra.add(jComboBoxid_empleadoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);


	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraSolicitudHoraExtra.add(jLabelid_estructuraSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 2;
		this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
		this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraSolicitudHoraExtra.add(jButtonid_estructuraSolicitudHoraExtraBusqueda, this.gridBagConstraintsSolicitudHoraExtra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 3;
		this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
		this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraSolicitudHoraExtra.add(jButtonid_estructuraSolicitudHoraExtraUpdate, this.gridBagConstraintsSolicitudHoraExtra);
	}

	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 1;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraSolicitudHoraExtra.add(jComboBoxid_estructuraSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);


	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleado_jefeSolicitudHoraExtra.add(jLabelid_empleado_jefeSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 2;
		this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
		this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_jefeSolicitudHoraExtra.add(jButtonid_empleado_jefeSolicitudHoraExtraBusqueda, this.gridBagConstraintsSolicitudHoraExtra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 3;
		this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
		this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_jefeSolicitudHoraExtra.add(jButtonid_empleado_jefeSolicitudHoraExtraUpdate, this.gridBagConstraintsSolicitudHoraExtra);
	}

	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 1;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleado_jefeSolicitudHoraExtra.add(jComboBoxid_empleado_jefeSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);


	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_solicitud_nomiSolicitudHoraExtra.add(jLabelid_estado_solicitud_nomiSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 2;
		this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
		this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_solicitud_nomiSolicitudHoraExtra.add(jButtonid_estado_solicitud_nomiSolicitudHoraExtraBusqueda, this.gridBagConstraintsSolicitudHoraExtra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 3;
		this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
		this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_solicitud_nomiSolicitudHoraExtra.add(jButtonid_estado_solicitud_nomiSolicitudHoraExtraUpdate, this.gridBagConstraintsSolicitudHoraExtra);
	}

	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 1;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_solicitud_nomiSolicitudHoraExtra.add(jComboBoxid_estado_solicitud_nomiSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);


	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleado_reemplazoSolicitudHoraExtra.add(jLabelid_empleado_reemplazoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 2;
		this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
		this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_reemplazoSolicitudHoraExtra.add(jButtonid_empleado_reemplazoSolicitudHoraExtraBusqueda, this.gridBagConstraintsSolicitudHoraExtra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 3;
		this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
		this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_reemplazoSolicitudHoraExtra.add(jButtonid_empleado_reemplazoSolicitudHoraExtraUpdate, this.gridBagConstraintsSolicitudHoraExtra);
	}

	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 1;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleado_reemplazoSolicitudHoraExtra.add(jComboBoxid_empleado_reemplazoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);


	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialSolicitudHoraExtra.add(jLabelsecuencialSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 2;
		this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
		this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialSolicitudHoraExtra.add(jButtonsecuencialSolicitudHoraExtraBusqueda, this.gridBagConstraintsSolicitudHoraExtra);
	}

	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 1;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialSolicitudHoraExtra.add(jTextFieldsecuencialSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);


	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_solicitaSolicitudHoraExtra.add(jLabelfecha_solicitaSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 2;
		this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
		this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_solicitaSolicitudHoraExtra.add(jButtonfecha_solicitaSolicitudHoraExtraBusqueda, this.gridBagConstraintsSolicitudHoraExtra);
	}

	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 1;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_solicitaSolicitudHoraExtra.add(jDateChooserfecha_solicitaSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);


	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ejecutaSolicitudHoraExtra.add(jLabelfecha_ejecutaSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 2;
		this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
		this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ejecutaSolicitudHoraExtra.add(jButtonfecha_ejecutaSolicitudHoraExtraBusqueda, this.gridBagConstraintsSolicitudHoraExtra);
	}

	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 1;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ejecutaSolicitudHoraExtra.add(jDateChooserfecha_ejecutaSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);


	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_horasSolicitudHoraExtra.add(jLabelnumero_horasSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 2;
		this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
		this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_horasSolicitudHoraExtra.add(jButtonnumero_horasSolicitudHoraExtraBusqueda, this.gridBagConstraintsSolicitudHoraExtra);
	}

	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 1;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_horasSolicitudHoraExtra.add(jTextFieldnumero_horasSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);


	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_unitarioSolicitudHoraExtra.add(jLabelcosto_unitarioSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 2;
		this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
		this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_unitarioSolicitudHoraExtra.add(jButtoncosto_unitarioSolicitudHoraExtraBusqueda, this.gridBagConstraintsSolicitudHoraExtra);
	}

	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 1;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_unitarioSolicitudHoraExtra.add(jTextFieldcosto_unitarioSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);


	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalSolicitudHoraExtra.add(jLabelcosto_totalSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 2;
		this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
		this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalSolicitudHoraExtra.add(jButtoncosto_totalSolicitudHoraExtraBusqueda, this.gridBagConstraintsSolicitudHoraExtra);
	}

	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 1;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalSolicitudHoraExtra.add(jTextFieldcosto_totalSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);


	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionSolicitudHoraExtra.add(jLabeldescripcionSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 2;
		this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
		this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionSolicitudHoraExtra.add(jButtondescripcionSolicitudHoraExtraBusqueda, this.gridBagConstraintsSolicitudHoraExtra);
	}

	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = 1;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionSolicitudHoraExtra.add(jscrollPanedescripcionSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = iYPanelCamposSolicitudHoraExtra;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = iXPanelCamposSolicitudHoraExtra++;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudHoraExtra.add(this.jPanelidSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(iXPanelCamposSolicitudHoraExtra % 1==0) {
		iXPanelCamposSolicitudHoraExtra=0;
		iYPanelCamposSolicitudHoraExtra++;
	}
	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = iYPanelCamposSolicitudHoraExtra;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = iXPanelCamposSolicitudHoraExtra++;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudHoraExtra.add(this.jPanelid_empleadoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(iXPanelCamposSolicitudHoraExtra % 1==0) {
		iXPanelCamposSolicitudHoraExtra=0;
		iYPanelCamposSolicitudHoraExtra++;
	}
	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = iYPanelCamposSolicitudHoraExtra;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = iXPanelCamposSolicitudHoraExtra++;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudHoraExtra.add(this.jPanelid_estructuraSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(iXPanelCamposSolicitudHoraExtra % 1==0) {
		iXPanelCamposSolicitudHoraExtra=0;
		iYPanelCamposSolicitudHoraExtra++;
	}
	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = iYPanelCamposSolicitudHoraExtra;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = iXPanelCamposSolicitudHoraExtra++;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudHoraExtra.add(this.jPanelid_empleado_jefeSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(iXPanelCamposSolicitudHoraExtra % 1==0) {
		iXPanelCamposSolicitudHoraExtra=0;
		iYPanelCamposSolicitudHoraExtra++;
	}
	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = iYPanelCamposSolicitudHoraExtra;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = iXPanelCamposSolicitudHoraExtra++;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudHoraExtra.add(this.jPanelid_estado_solicitud_nomiSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(iXPanelCamposSolicitudHoraExtra % 1==0) {
		iXPanelCamposSolicitudHoraExtra=0;
		iYPanelCamposSolicitudHoraExtra++;
	}
	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = iYPanelCamposSolicitudHoraExtra;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = iXPanelCamposSolicitudHoraExtra++;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudHoraExtra.add(this.jPanelid_empleado_reemplazoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(iXPanelCamposSolicitudHoraExtra % 1==0) {
		iXPanelCamposSolicitudHoraExtra=0;
		iYPanelCamposSolicitudHoraExtra++;
	}
	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = iYPanelCamposSolicitudHoraExtra;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = iXPanelCamposSolicitudHoraExtra++;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudHoraExtra.add(this.jPanelsecuencialSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(iXPanelCamposSolicitudHoraExtra % 1==0) {
		iXPanelCamposSolicitudHoraExtra=0;
		iYPanelCamposSolicitudHoraExtra++;
	}
	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = iYPanelCamposSolicitudHoraExtra;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = iXPanelCamposSolicitudHoraExtra++;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudHoraExtra.add(this.jPanelfecha_solicitaSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(iXPanelCamposSolicitudHoraExtra % 1==0) {
		iXPanelCamposSolicitudHoraExtra=0;
		iYPanelCamposSolicitudHoraExtra++;
	}
	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = iYPanelCamposSolicitudHoraExtra;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = iXPanelCamposSolicitudHoraExtra++;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudHoraExtra.add(this.jPanelfecha_ejecutaSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(iXPanelCamposSolicitudHoraExtra % 1==0) {
		iXPanelCamposSolicitudHoraExtra=0;
		iYPanelCamposSolicitudHoraExtra++;
	}
	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = iYPanelCamposSolicitudHoraExtra;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = iXPanelCamposSolicitudHoraExtra++;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudHoraExtra.add(this.jPanelnumero_horasSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(iXPanelCamposSolicitudHoraExtra % 1==0) {
		iXPanelCamposSolicitudHoraExtra=0;
		iYPanelCamposSolicitudHoraExtra++;
	}
	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = iYPanelCamposSolicitudHoraExtra;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = iXPanelCamposSolicitudHoraExtra++;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudHoraExtra.add(this.jPanelcosto_unitarioSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(iXPanelCamposSolicitudHoraExtra % 1==0) {
		iXPanelCamposSolicitudHoraExtra=0;
		iYPanelCamposSolicitudHoraExtra++;
	}
	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = iYPanelCamposSolicitudHoraExtra;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = iXPanelCamposSolicitudHoraExtra++;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudHoraExtra.add(this.jPanelcosto_totalSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(iXPanelCamposSolicitudHoraExtra % 1==0) {
		iXPanelCamposSolicitudHoraExtra=0;
		iYPanelCamposSolicitudHoraExtra++;
	}
	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = iYPanelCamposSolicitudHoraExtra;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = iXPanelCamposSolicitudHoraExtra++;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSolicitudHoraExtra.add(this.jPaneldescripcionSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(iXPanelCamposSolicitudHoraExtra % 1==0) {
		iXPanelCamposSolicitudHoraExtra=0;
		iYPanelCamposSolicitudHoraExtra++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = iYPanelCamposOcultosSolicitudHoraExtra;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = iXPanelCamposOcultosSolicitudHoraExtra++;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSolicitudHoraExtra.add(this.jPanelid_empresaSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(iXPanelCamposOcultosSolicitudHoraExtra % 1==0) {
		iXPanelCamposOcultosSolicitudHoraExtra=0;
		iYPanelCamposOcultosSolicitudHoraExtra++;
	}
	this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSolicitudHoraExtra.gridy = iYPanelCamposOcultosSolicitudHoraExtra;
	this.gridBagConstraintsSolicitudHoraExtra.gridx = iXPanelCamposOcultosSolicitudHoraExtra++;
	this.gridBagConstraintsSolicitudHoraExtra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSolicitudHoraExtra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSolicitudHoraExtra.add(this.jPanelid_sucursalSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);



	if(iXPanelCamposOcultosSolicitudHoraExtra % 1==0) {
		iXPanelCamposOcultosSolicitudHoraExtra=0;
		iYPanelCamposOcultosSolicitudHoraExtra++;
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
			
		GridBagLayout gridaBagLayoutAccionesSolicitudHoraExtra= new GridBagLayout();
		this.jPanelAccionesSolicitudHoraExtra.setLayout(gridaBagLayoutAccionesSolicitudHoraExtra);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSolicitudHoraExtra= new GridBagLayout();
		this.jPanelAccionesFormularioSolicitudHoraExtra.setLayout(gridaBagLayoutAccionesFormularioSolicitudHoraExtra);
		
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSolicitudHoraExtra.add(this.jComboBoxTiposAccionesFormularioSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSolicitudHoraExtra.add(this.jCheckBoxPostAccionNuevoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.solicitudhoraextraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSolicitudHoraExtra.add(this.jCheckBoxPostAccionSinCerrarSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.solicitudhoraextraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSolicitudHoraExtra.add(this.jCheckBoxPostAccionSinMensajeSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXAccion++;
			
		this.jPanelAccionesSolicitudHoraExtra.add(this.jButtonModificarSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);							

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx =iPosXAccion++;
			
		this.jPanelAccionesSolicitudHoraExtra.add(this.jButtonEliminarSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		
			
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXAccion++;
		
		this.jPanelAccionesSolicitudHoraExtra.add(this.jButtonActualizarSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);


		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXAccion++;
		
		this.jPanelAccionesSolicitudHoraExtra.add(this.jButtonGuardarCambiosSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);	
		
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx =iPosXAccion++;
		
		this.jPanelAccionesSolicitudHoraExtra.add(this.jButtonCancelarSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSolicitudHoraExtra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSolicitudHoraExtra);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();						
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;		
			//this.gridBagConstraintsSolicitudHoraExtra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSolicitudHoraExtra.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSolicitudHoraExtra.gridx =0;
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSolicitudHoraExtra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SolicitudHoraExtraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSolicitudHoraExtra = new SolicitudHoraExtraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Solicitud Hora Extra DATOS");
			
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
			
	        //this.setTitle("[FOR] - Solicitud Hora Extra DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Solicitud Hora Extra Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SolicitudHoraExtraModel solicitudhoraextraModel=new SolicitudHoraExtraModel(this);
			
			//SI USARA CLASE INTERNA
			//SolicitudHoraExtraModel.SolicitudHoraExtraFocusTraversalPolicy solicitudhoraextraFocusTraversalPolicy = solicitudhoraextraModel.new SolicitudHoraExtraFocusTraversalPolicy(this);
			
			//solicitudhoraextraFocusTraversalPolicy.setsolicitudhoraextraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(solicitudhoraextraModel);
			
			
			this.jContentPaneDetalleSolicitudHoraExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSolicitudHoraExtra = new GridBagLayout();	
			this.jContentPaneDetalleSolicitudHoraExtra.setLayout(gridaBagLayoutDetalleSolicitudHoraExtra);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSolicitudHoraExtra = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
				this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
					
				
				this.jContentPaneDetalleSolicitudHoraExtra.add(jTtoolBarDetalleSolicitudHoraExtra, gridBagConstraintsSolicitudHoraExtra);								
				
}
			
			this.jScrollPanelDatosEdicionSolicitudHoraExtra=   new JScrollPane(jContentPaneDetalleSolicitudHoraExtra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSolicitudHoraExtra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSolicitudHoraExtra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSolicitudHoraExtra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSolicitudHoraExtra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSolicitudHoraExtra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSolicitudHoraExtra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSolicitudHoraExtra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
	        
			this.jContentPaneDetalleSolicitudHoraExtra.add(jPanelCamposSolicitudHoraExtra, gridBagConstraintsSolicitudHoraExtra);
			
			
			
			
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
						&& solicitudhoraextraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.solicitudhoraextraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSolicitudHoraExtra= new GridBagConstraints();
						this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
						this.jContentPaneDetalleSolicitudHoraExtra.add(this.jTabbedPaneRelacionesSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSolicitudHoraExtra.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSolicitudHoraExtra.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
					this.gridBagConstraintsSolicitudHoraExtra.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
					
				
					this.jContentPaneDetalleSolicitudHoraExtra.add(jPanelCamposOcultosSolicitudHoraExtra, gridBagConstraintsSolicitudHoraExtra);
				
					this.jPanelCamposOcultosSolicitudHoraExtra.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
	        this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSolicitudHoraExtra.add(this.jPanelAccionesFormularioSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);							
			
			
			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
	        this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
	        
			
			this.jContentPaneDetalleSolicitudHoraExtra.add(this.jPanelAccionesSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSolicitudHoraExtra);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSolicitudHoraExtra=   new JScrollPane(this.jPanelCamposSolicitudHoraExtra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSolicitudHoraExtra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSolicitudHoraExtra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSolicitudHoraExtra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
			this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSolicitudHoraExtra.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);			
			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
			
			
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		
			
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSolicitudHoraExtra;//jContentPane;
		
		return jScrollPanelDatosEdicionSolicitudHoraExtra;
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
