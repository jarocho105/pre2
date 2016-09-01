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
import com.bydan.erp.nomina.util.EmpleadoImpuestoRentaConstantesFunciones;

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
public class EmpleadoImpuestoRentaDetalleFormJInternalFrame extends EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEmpleadoImpuestoRenta;
	
	protected JMenuBar jmenuBarDetalleEmpleadoImpuestoRenta;
	
	protected JMenu jmenuDetalleEmpleadoImpuestoRenta;
	protected JMenu jmenuDetalleArchivoEmpleadoImpuestoRenta;
	protected JMenu jmenuDetalleAccionesEmpleadoImpuestoRenta;
	protected JMenu jmenuDetalleDatosEmpleadoImpuestoRenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEmpleadoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleadoImpuestoRenta;	
	protected GridBagConstraints gridBagConstraintsEmpleadoImpuestoRenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleEmpleadoImpuestoRenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";
	
	public EmpleadoImpuestoRentaSessionBean empleadoimpuestorentaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public EstructuraSessionBean estructuraSessionBean;	
	
	public EmpleadoImpuestoRentaLogic empleadoimpuestorentaLogic;
	
	public JScrollPane jScrollPanelDatosEmpleadoImpuestoRenta;
	public JScrollPane jScrollPanelDatosEdicionEmpleadoImpuestoRenta;
	public JScrollPane jScrollPanelDatosGeneralEmpleadoImpuestoRenta;
	
	protected JPanel jPanelCamposEmpleadoImpuestoRenta;    
	protected JPanel jPanelCamposOcultosEmpleadoImpuestoRenta;    	
	protected JPanel jPanelAccionesEmpleadoImpuestoRenta;
	protected JPanel jPanelAccionesFormularioEmpleadoImpuestoRenta;
    
	
	
	protected Integer iXPanelCamposEmpleadoImpuestoRenta=0;
	protected Integer iYPanelCamposEmpleadoImpuestoRenta=0;
	
	protected Integer iXPanelCamposOcultosEmpleadoImpuestoRenta=0;
	protected Integer iYPanelCamposOcultosEmpleadoImpuestoRenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEmpleadoImpuestoRenta;
	public JButton jButtonModificarEmpleadoImpuestoRenta;
	public JButton jButtonActualizarEmpleadoImpuestoRenta;
    public JButton jButtonEliminarEmpleadoImpuestoRenta;
	public JButton jButtonCancelarEmpleadoImpuestoRenta;
    public JButton jButtonGuardarCambiosEmpleadoImpuestoRenta;
	public JButton jButtonGuardarCambiosTablaEmpleadoImpuestoRenta;
	protected JButton jButtonCerrarEmpleadoImpuestoRenta;
	
	
	protected JButton jButtonProcesarInformacionEmpleadoImpuestoRenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEmpleadoImpuestoRenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEmpleadoImpuestoRenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEmpleadoImpuestoRenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleadoImpuestoRenta;
	protected JButton jButtonModificarToolBarEmpleadoImpuestoRenta;
	protected JButton jButtonActualizarToolBarEmpleadoImpuestoRenta;
    protected JButton jButtonEliminarToolBarEmpleadoImpuestoRenta;
	protected JButton jButtonCancelarToolBarEmpleadoImpuestoRenta;
    protected JButton jButtonGuardarCambiosToolBarEmpleadoImpuestoRenta;
	protected JButton jButtonGuardarCambiosTablaToolBarEmpleadoImpuestoRenta;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleadoImpuestoRenta;
	protected JButton jButtonCerrarToolBarEmpleadoImpuestoRenta;
	
	protected JButton jButtonProcesarInformacionToolBarEmpleadoImpuestoRenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemModificarEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemActualizarEmpleadoImpuestoRenta;
    protected JMenuItem jMenuItemEliminarEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemCancelarEmpleadoImpuestoRenta;
    protected JMenuItem jMenuItemGuardarCambiosEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemCerrarEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemDetalleCerrarEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleadoImpuestoRenta;
	
	protected JMenuItem jMenuItemProcesarInformacionEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleadoImpuestoRenta;
	protected JMenuItem jMenuItemMostrarOcultarEmpleadoImpuestoRenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleadoImpuestoRenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleadoImpuestoRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleadoImpuestoRenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEmpleadoImpuestoRenta;
	public JLabel jLabelIdEmpleadoImpuestoRenta;
	public JLabel jLabelidEmpleadoImpuestoRenta;
	public JButton jButtonidEmpleadoImpuestoRentaBusqueda= new JButtonMe();

	public JPanel jPanelfechaEmpleadoImpuestoRenta;
	public JLabel jLabelfechaEmpleadoImpuestoRenta;
	//public JFormattedTextField jDateChooserfechaEmpleadoImpuestoRenta;

	public JDateChooser jDateChooserfechaEmpleadoImpuestoRenta;
	public JButton jButtonfechaEmpleadoImpuestoRentaBusqueda= new JButtonMe();

	public JPanel jPanelvalor_pagoEmpleadoImpuestoRenta;
	public JLabel jLabelvalor_pagoEmpleadoImpuestoRenta;
	public JTextField jTextFieldvalor_pagoEmpleadoImpuestoRenta;
	public JButton jButtonvalor_pagoEmpleadoImpuestoRentaBusqueda= new JButtonMe();

	public JPanel jPanelingreso_liquidoEmpleadoImpuestoRenta;
	public JLabel jLabelingreso_liquidoEmpleadoImpuestoRenta;
	public JTextField jTextFieldingreso_liquidoEmpleadoImpuestoRenta;
	public JButton jButtoningreso_liquidoEmpleadoImpuestoRentaBusqueda= new JButtonMe();

	public JPanel jPanelaporte_iessEmpleadoImpuestoRenta;
	public JLabel jLabelaporte_iessEmpleadoImpuestoRenta;
	public JTextField jTextFieldaporte_iessEmpleadoImpuestoRenta;
	public JButton jButtonaporte_iessEmpleadoImpuestoRentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEmpleadoImpuestoRenta;
	public JLabel jLabelid_empresaEmpleadoImpuestoRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEmpleadoImpuestoRenta;
	public JButton jButtonid_empresaEmpleadoImpuestoRenta= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoImpuestoRentaUpdate= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoImpuestoRentaBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoEmpleadoImpuestoRenta;
	public JLabel jLabelid_empleadoEmpleadoImpuestoRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoEmpleadoImpuestoRenta;
	public JButton jButtonid_empleadoEmpleadoImpuestoRenta= new JButtonMe();
	public JButton jButtonid_empleadoEmpleadoImpuestoRentaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoEmpleadoImpuestoRentaBusqueda= new JButtonMe();

	public JPanel jPanelid_anioEmpleadoImpuestoRenta;
	public JLabel jLabelid_anioEmpleadoImpuestoRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioEmpleadoImpuestoRenta;
	public JButton jButtonid_anioEmpleadoImpuestoRenta= new JButtonMe();
	public JButton jButtonid_anioEmpleadoImpuestoRentaUpdate= new JButtonMe();
	public JButton jButtonid_anioEmpleadoImpuestoRentaBusqueda= new JButtonMe();

	public JPanel jPanelid_mesEmpleadoImpuestoRenta;
	public JLabel jLabelid_mesEmpleadoImpuestoRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesEmpleadoImpuestoRenta;
	public JButton jButtonid_mesEmpleadoImpuestoRenta= new JButtonMe();
	public JButton jButtonid_mesEmpleadoImpuestoRentaUpdate= new JButtonMe();
	public JButton jButtonid_mesEmpleadoImpuestoRentaBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraEmpleadoImpuestoRenta;
	public JLabel jLabelid_estructuraEmpleadoImpuestoRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraEmpleadoImpuestoRenta;
	public JButton jButtonid_estructuraEmpleadoImpuestoRenta= new JButtonMe();
	public JButton jButtonid_estructuraEmpleadoImpuestoRentaUpdate= new JButtonMe();
	public JButton jButtonid_estructuraEmpleadoImpuestoRentaBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraEmpleadoImpuestoRentaArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEmpleadoImpuestoRenta;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EmpleadoImpuestoRentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEmpleadoImpuestoRenta=new JPanel();
				this.jPanelAccionesFormularioEmpleadoImpuestoRenta=new JPanel();
				this.jmenuBarDetalleEmpleadoImpuestoRenta=new JMenuBar();
				this.jTtoolBarDetalleEmpleadoImpuestoRenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoImpuestoRentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EmpleadoImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EmpleadoImpuestoRentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EmpleadoImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoImpuestoRentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoImpuestoRentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoImpuestoRentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpleadoImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEmpleadoImpuestoRenta() {
		return this.jButtonActualizarToolBarEmpleadoImpuestoRenta;
	}
	
	public JButton getjButtonEliminarToolBarEmpleadoImpuestoRenta() {
		return this.jButtonEliminarToolBarEmpleadoImpuestoRenta;
	}
	
	public JButton getjButtonCancelarToolBarEmpleadoImpuestoRenta() {
		return this.jButtonCancelarToolBarEmpleadoImpuestoRenta;
	}		
	
	public JButton getjButtonProcesarInformacionEmpleadoImpuestoRenta() {
		return this.jButtonProcesarInformacionEmpleadoImpuestoRenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleadoImpuestoRenta)	{
		this.jButtonProcesarInformacionEmpleadoImpuestoRenta = jButtonProcesarInformacionEmpleadoImpuestoRenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleadoImpuestoRenta() {
		return this.jComboBoxTiposAccionesEmpleadoImpuestoRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleadoImpuestoRenta(
			JComboBox jComboBoxTiposRelacionesEmpleadoImpuestoRenta) {
		this.jComboBoxTiposRelacionesEmpleadoImpuestoRenta = jComboBoxTiposRelacionesEmpleadoImpuestoRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleadoImpuestoRenta(
			JComboBox jComboBoxTiposAccionesEmpleadoImpuestoRenta) {
		this.jComboBoxTiposAccionesEmpleadoImpuestoRenta = jComboBoxTiposAccionesEmpleadoImpuestoRenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta() {
		return this.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta(
			JComboBox jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta) {
		this.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta = jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.empleadoimpuestorentaSessionBean=new EmpleadoImpuestoRentaSessionBean();
		
		this.empleadoimpuestorentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoimpuestorentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoImpuestoRentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoImpuestoRentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoImpuestoRentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado Impuesto Renta MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
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
	
		EmpleadoImpuestoRentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEmpleadoImpuestoRenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEmpleadoImpuestoRenta=new JButtonMe();
				this.jButtonModificarToolBarEmpleadoImpuestoRenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEmpleadoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEmpleadoImpuestoRenta,this.jTtoolBarDetalleEmpleadoImpuestoRenta,
							"actualizar","actualizar","Actualizar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEmpleadoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEmpleadoImpuestoRenta,this.jTtoolBarDetalleEmpleadoImpuestoRenta,
							"eliminar","eliminar","Eliminar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEmpleadoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEmpleadoImpuestoRenta,this.jTtoolBarDetalleEmpleadoImpuestoRenta,
							"cancelar","cancelar","Cancelar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEmpleadoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEmpleadoImpuestoRenta,this.jTtoolBarDetalleEmpleadoImpuestoRenta,
							"guardarcambios","guardarcambios","Guardar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEmpleadoImpuestoRenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEmpleadoImpuestoRenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEmpleadoImpuestoRenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEmpleadoImpuestoRenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEmpleadoImpuestoRenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleadoImpuestoRenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleadoImpuestoRenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleadoImpuestoRenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEmpleadoImpuestoRenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEmpleadoImpuestoRenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEmpleadoImpuestoRenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEmpleadoImpuestoRenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEmpleadoImpuestoRenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEmpleadoImpuestoRenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEmpleadoImpuestoRenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEmpleadoImpuestoRenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEmpleadoImpuestoRenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEmpleadoImpuestoRenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEmpleadoImpuestoRenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEmpleadoImpuestoRenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEmpleadoImpuestoRenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleadoImpuestoRenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleadoImpuestoRenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleadoImpuestoRenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleadoImpuestoRenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleadoImpuestoRenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEmpleadoImpuestoRenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEmpleadoImpuestoRenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEmpleadoImpuestoRenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleadoImpuestoRenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleadoImpuestoRenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleadoImpuestoRenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleadoImpuestoRenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleadoImpuestoRenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleadoImpuestoRenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEmpleadoImpuestoRenta.add(this.jMenuItemDetalleCerrarEmpleadoImpuestoRenta);
		
		this.jmenuDetalleAccionesEmpleadoImpuestoRenta.add(this.jMenuItemActualizarEmpleadoImpuestoRenta);
		this.jmenuDetalleAccionesEmpleadoImpuestoRenta.add(this.jMenuItemEliminarEmpleadoImpuestoRenta);
		this.jmenuDetalleAccionesEmpleadoImpuestoRenta.add(this.jMenuItemCancelarEmpleadoImpuestoRenta);		
		
		//this.jmenuDetalleDatosEmpleadoImpuestoRenta.add(this.jMenuItemDetalleAbrirOrderByEmpleadoImpuestoRenta);				
		this.jmenuDetalleDatosEmpleadoImpuestoRenta.add(this.jMenuItemDetalleMostarOcultarEmpleadoImpuestoRenta);				
				
		//this.jmenuDetalleAccionesEmpleadoImpuestoRenta.add(this.jMenuItemGuardarCambiosEmpleadoImpuestoRenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEmpleadoImpuestoRenta.add(this.jmenuDetalleArchivoEmpleadoImpuestoRenta);		
		this.jmenuBarDetalleEmpleadoImpuestoRenta.add(this.jmenuDetalleAccionesEmpleadoImpuestoRenta);		
		this.jmenuBarDetalleEmpleadoImpuestoRenta.add(this.jmenuDetalleDatosEmpleadoImpuestoRenta);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEmpleadoImpuestoRenta);				
	}
	
	
	public void inicializarElementosCamposEmpleadoImpuestoRenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEmpleadoImpuestoRenta = new JLabelMe();
		jLabelIdEmpleadoImpuestoRenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEmpleadoImpuestoRenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEmpleadoImpuestoRenta.setToolTipText(EmpleadoImpuestoRentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEmpleadoImpuestoRenta= new GridBagLayout();

		this.jPanelidEmpleadoImpuestoRenta.setLayout(this.gridaBagLayoutEmpleadoImpuestoRenta);

		jLabelidEmpleadoImpuestoRenta = new JLabel();
		jLabelidEmpleadoImpuestoRenta.setText("Id");

		jLabelidEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfechaEmpleadoImpuestoRenta = new JLabelMe();
		this.jLabelfechaEmpleadoImpuestoRenta.setText(""+EmpleadoImpuestoRentaConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaEmpleadoImpuestoRenta.setToolTipText("Fecha");
		this.jLabelfechaEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaEmpleadoImpuestoRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaEmpleadoImpuestoRenta.setToolTipText(EmpleadoImpuestoRentaConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutEmpleadoImpuestoRenta = new GridBagLayout();
		this.jPanelfechaEmpleadoImpuestoRenta.setLayout(this.gridaBagLayoutEmpleadoImpuestoRenta);


		//jFormattedTextFieldfechaEmpleadoImpuestoRenta= new JFormattedTextFieldMe();

		jDateChooserfechaEmpleadoImpuestoRenta= new JDateChooser();
		jDateChooserfechaEmpleadoImpuestoRenta.setEnabled(false);
		jDateChooserfechaEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaEmpleadoImpuestoRenta.setDate(new Date());
		jDateChooserfechaEmpleadoImpuestoRenta.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaEmpleadoImpuestoRenta.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaEmpleadoImpuestoRentaBusqueda= new JButtonMe();
		this.jButtonfechaEmpleadoImpuestoRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaEmpleadoImpuestoRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaEmpleadoImpuestoRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaEmpleadoImpuestoRentaBusqueda.setText("U");
		this.jButtonfechaEmpleadoImpuestoRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaEmpleadoImpuestoRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaEmpleadoImpuestoRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaEmpleadoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaEmpleadoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaEmpleadoImpuestoRentaBusqueda"));

		if(this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaEmpleadoImpuestoRentaBusqueda.setVisible(false);		}


					
		this.jLabelvalor_pagoEmpleadoImpuestoRenta = new JLabelMe();
		this.jLabelvalor_pagoEmpleadoImpuestoRenta.setText(""+EmpleadoImpuestoRentaConstantesFunciones.LABEL_VALORPAGO+" : *");
		this.jLabelvalor_pagoEmpleadoImpuestoRenta.setToolTipText("Valor Pago");
		this.jLabelvalor_pagoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_pagoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_pagoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_pagoEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_pagoEmpleadoImpuestoRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_pagoEmpleadoImpuestoRenta.setToolTipText(EmpleadoImpuestoRentaConstantesFunciones.LABEL_VALORPAGO);
		this.gridaBagLayoutEmpleadoImpuestoRenta = new GridBagLayout();
		this.jPanelvalor_pagoEmpleadoImpuestoRenta.setLayout(this.gridaBagLayoutEmpleadoImpuestoRenta);


		jTextFieldvalor_pagoEmpleadoImpuestoRenta= new JTextFieldMe();
		jTextFieldvalor_pagoEmpleadoImpuestoRenta.setEnabled(false);
		jTextFieldvalor_pagoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_pagoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_pagoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_pagoEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_pagoEmpleadoImpuestoRenta.setText("0.0");

		this.jButtonvalor_pagoEmpleadoImpuestoRentaBusqueda= new JButtonMe();
		this.jButtonvalor_pagoEmpleadoImpuestoRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_pagoEmpleadoImpuestoRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_pagoEmpleadoImpuestoRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_pagoEmpleadoImpuestoRentaBusqueda.setText("U");
		this.jButtonvalor_pagoEmpleadoImpuestoRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_pagoEmpleadoImpuestoRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_pagoEmpleadoImpuestoRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_pagoEmpleadoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_pagoEmpleadoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_pagoEmpleadoImpuestoRentaBusqueda"));

		if(this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_pagoEmpleadoImpuestoRentaBusqueda.setVisible(false);		}


					
		this.jLabelingreso_liquidoEmpleadoImpuestoRenta = new JLabelMe();
		this.jLabelingreso_liquidoEmpleadoImpuestoRenta.setText(""+EmpleadoImpuestoRentaConstantesFunciones.LABEL_INGRESOLIQUIDO+" : *");
		this.jLabelingreso_liquidoEmpleadoImpuestoRenta.setToolTipText("Ingreso Liquo");
		this.jLabelingreso_liquidoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingreso_liquidoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingreso_liquidoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelingreso_liquidoEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelingreso_liquidoEmpleadoImpuestoRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelingreso_liquidoEmpleadoImpuestoRenta.setToolTipText(EmpleadoImpuestoRentaConstantesFunciones.LABEL_INGRESOLIQUIDO);
		this.gridaBagLayoutEmpleadoImpuestoRenta = new GridBagLayout();
		this.jPanelingreso_liquidoEmpleadoImpuestoRenta.setLayout(this.gridaBagLayoutEmpleadoImpuestoRenta);


		jTextFieldingreso_liquidoEmpleadoImpuestoRenta= new JTextFieldMe();
		jTextFieldingreso_liquidoEmpleadoImpuestoRenta.setEnabled(false);
		jTextFieldingreso_liquidoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingreso_liquidoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldingreso_liquidoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldingreso_liquidoEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldingreso_liquidoEmpleadoImpuestoRenta.setText("0.0");

		this.jButtoningreso_liquidoEmpleadoImpuestoRentaBusqueda= new JButtonMe();
		this.jButtoningreso_liquidoEmpleadoImpuestoRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningreso_liquidoEmpleadoImpuestoRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningreso_liquidoEmpleadoImpuestoRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoningreso_liquidoEmpleadoImpuestoRentaBusqueda.setText("U");
		this.jButtoningreso_liquidoEmpleadoImpuestoRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoningreso_liquidoEmpleadoImpuestoRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoningreso_liquidoEmpleadoImpuestoRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldingreso_liquidoEmpleadoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldingreso_liquidoEmpleadoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ingreso_liquidoEmpleadoImpuestoRentaBusqueda"));

		if(this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoningreso_liquidoEmpleadoImpuestoRentaBusqueda.setVisible(false);		}


					
		this.jLabelaporte_iessEmpleadoImpuestoRenta = new JLabelMe();
		this.jLabelaporte_iessEmpleadoImpuestoRenta.setText(""+EmpleadoImpuestoRentaConstantesFunciones.LABEL_APORTEIESS+" : *");
		this.jLabelaporte_iessEmpleadoImpuestoRenta.setToolTipText("Aporte Iess");
		this.jLabelaporte_iessEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelaporte_iessEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelaporte_iessEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelaporte_iessEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelaporte_iessEmpleadoImpuestoRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelaporte_iessEmpleadoImpuestoRenta.setToolTipText(EmpleadoImpuestoRentaConstantesFunciones.LABEL_APORTEIESS);
		this.gridaBagLayoutEmpleadoImpuestoRenta = new GridBagLayout();
		this.jPanelaporte_iessEmpleadoImpuestoRenta.setLayout(this.gridaBagLayoutEmpleadoImpuestoRenta);


		jTextFieldaporte_iessEmpleadoImpuestoRenta= new JTextFieldMe();
		jTextFieldaporte_iessEmpleadoImpuestoRenta.setEnabled(false);
		jTextFieldaporte_iessEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldaporte_iessEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldaporte_iessEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldaporte_iessEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldaporte_iessEmpleadoImpuestoRenta.setText("0.0");

		this.jButtonaporte_iessEmpleadoImpuestoRentaBusqueda= new JButtonMe();
		this.jButtonaporte_iessEmpleadoImpuestoRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonaporte_iessEmpleadoImpuestoRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonaporte_iessEmpleadoImpuestoRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonaporte_iessEmpleadoImpuestoRentaBusqueda.setText("U");
		this.jButtonaporte_iessEmpleadoImpuestoRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonaporte_iessEmpleadoImpuestoRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonaporte_iessEmpleadoImpuestoRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldaporte_iessEmpleadoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldaporte_iessEmpleadoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"aporte_iessEmpleadoImpuestoRentaBusqueda"));

		if(this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonaporte_iessEmpleadoImpuestoRentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEmpleadoImpuestoRenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEmpleadoImpuestoRenta = new JLabelMe();
		this.jLabelid_empresaEmpleadoImpuestoRenta.setText(""+EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEmpleadoImpuestoRenta.setToolTipText("Empresa");
		this.jLabelid_empresaEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEmpleadoImpuestoRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEmpleadoImpuestoRenta.setToolTipText(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEmpleadoImpuestoRenta = new GridBagLayout();
		this.jPanelid_empresaEmpleadoImpuestoRenta.setLayout(this.gridaBagLayoutEmpleadoImpuestoRenta);


		jComboBoxid_empresaEmpleadoImpuestoRenta= new JComboBoxMe();
		jComboBoxid_empresaEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEmpleadoImpuestoRenta.setEnabled(false);

		this.jButtonid_empresaEmpleadoImpuestoRenta= new JButtonMe();
		this.jButtonid_empresaEmpleadoImpuestoRenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoImpuestoRenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoImpuestoRenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoImpuestoRenta.setText("Buscar");
		this.jButtonid_empresaEmpleadoImpuestoRenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEmpleadoImpuestoRenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoImpuestoRenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEmpleadoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoImpuestoRenta"));

		this.jButtonid_empresaEmpleadoImpuestoRentaBusqueda= new JButtonMe();
		this.jButtonid_empresaEmpleadoImpuestoRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoImpuestoRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoImpuestoRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoImpuestoRentaBusqueda.setText("U");
		this.jButtonid_empresaEmpleadoImpuestoRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEmpleadoImpuestoRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoImpuestoRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEmpleadoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoImpuestoRentaBusqueda"));

		if(this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEmpleadoImpuestoRentaBusqueda.setVisible(false);		}

		this.jButtonid_empresaEmpleadoImpuestoRentaUpdate= new JButtonMe();
		this.jButtonid_empresaEmpleadoImpuestoRentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoImpuestoRentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoImpuestoRentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoImpuestoRentaUpdate.setText("U");
		this.jButtonid_empresaEmpleadoImpuestoRentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEmpleadoImpuestoRentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoImpuestoRentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEmpleadoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoImpuestoRentaUpdate"));



					
		this.jLabelid_empleadoEmpleadoImpuestoRenta = new JLabelMe();
		this.jLabelid_empleadoEmpleadoImpuestoRenta.setText(""+EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoEmpleadoImpuestoRenta.setToolTipText("Empleado");
		this.jLabelid_empleadoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoEmpleadoImpuestoRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoEmpleadoImpuestoRenta.setToolTipText(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutEmpleadoImpuestoRenta = new GridBagLayout();
		this.jPanelid_empleadoEmpleadoImpuestoRenta.setLayout(this.gridaBagLayoutEmpleadoImpuestoRenta);


		jComboBoxid_empleadoEmpleadoImpuestoRenta= new JComboBoxMe();
		jComboBoxid_empleadoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoEmpleadoImpuestoRenta= new JButtonMe();
		this.jButtonid_empleadoEmpleadoImpuestoRenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoImpuestoRenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoImpuestoRenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoImpuestoRenta.setText("Buscar");
		this.jButtonid_empleadoEmpleadoImpuestoRenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoEmpleadoImpuestoRenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoImpuestoRenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoEmpleadoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoImpuestoRenta"));

		this.jButtonid_empleadoEmpleadoImpuestoRentaBusqueda= new JButtonMe();
		this.jButtonid_empleadoEmpleadoImpuestoRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoImpuestoRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoImpuestoRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmpleadoImpuestoRentaBusqueda.setText("U");
		this.jButtonid_empleadoEmpleadoImpuestoRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoEmpleadoImpuestoRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoImpuestoRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoEmpleadoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoImpuestoRentaBusqueda"));

		if(this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoEmpleadoImpuestoRentaBusqueda.setVisible(false);		}

		this.jButtonid_empleadoEmpleadoImpuestoRentaUpdate= new JButtonMe();
		this.jButtonid_empleadoEmpleadoImpuestoRentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoImpuestoRentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoImpuestoRentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmpleadoImpuestoRentaUpdate.setText("U");
		this.jButtonid_empleadoEmpleadoImpuestoRentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoEmpleadoImpuestoRentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoImpuestoRentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoEmpleadoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoImpuestoRentaUpdate"));



					
		this.jLabelid_anioEmpleadoImpuestoRenta = new JLabelMe();
		this.jLabelid_anioEmpleadoImpuestoRenta.setText(""+EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioEmpleadoImpuestoRenta.setToolTipText("Anio");
		this.jLabelid_anioEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioEmpleadoImpuestoRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioEmpleadoImpuestoRenta.setToolTipText(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutEmpleadoImpuestoRenta = new GridBagLayout();
		this.jPanelid_anioEmpleadoImpuestoRenta.setLayout(this.gridaBagLayoutEmpleadoImpuestoRenta);


		jComboBoxid_anioEmpleadoImpuestoRenta= new JComboBoxMe();
		jComboBoxid_anioEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioEmpleadoImpuestoRenta= new JButtonMe();
		this.jButtonid_anioEmpleadoImpuestoRenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioEmpleadoImpuestoRenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioEmpleadoImpuestoRenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioEmpleadoImpuestoRenta.setText("Buscar");
		this.jButtonid_anioEmpleadoImpuestoRenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioEmpleadoImpuestoRenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioEmpleadoImpuestoRenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioEmpleadoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioEmpleadoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioEmpleadoImpuestoRenta"));

		this.jButtonid_anioEmpleadoImpuestoRentaBusqueda= new JButtonMe();
		this.jButtonid_anioEmpleadoImpuestoRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioEmpleadoImpuestoRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioEmpleadoImpuestoRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioEmpleadoImpuestoRentaBusqueda.setText("U");
		this.jButtonid_anioEmpleadoImpuestoRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioEmpleadoImpuestoRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioEmpleadoImpuestoRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioEmpleadoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioEmpleadoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioEmpleadoImpuestoRentaBusqueda"));

		if(this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioEmpleadoImpuestoRentaBusqueda.setVisible(false);		}

		this.jButtonid_anioEmpleadoImpuestoRentaUpdate= new JButtonMe();
		this.jButtonid_anioEmpleadoImpuestoRentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioEmpleadoImpuestoRentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioEmpleadoImpuestoRentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioEmpleadoImpuestoRentaUpdate.setText("U");
		this.jButtonid_anioEmpleadoImpuestoRentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioEmpleadoImpuestoRentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioEmpleadoImpuestoRentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioEmpleadoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioEmpleadoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioEmpleadoImpuestoRentaUpdate"));



					
		this.jLabelid_mesEmpleadoImpuestoRenta = new JLabelMe();
		this.jLabelid_mesEmpleadoImpuestoRenta.setText(""+EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesEmpleadoImpuestoRenta.setToolTipText("Mes");
		this.jLabelid_mesEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesEmpleadoImpuestoRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesEmpleadoImpuestoRenta.setToolTipText(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutEmpleadoImpuestoRenta = new GridBagLayout();
		this.jPanelid_mesEmpleadoImpuestoRenta.setLayout(this.gridaBagLayoutEmpleadoImpuestoRenta);


		jComboBoxid_mesEmpleadoImpuestoRenta= new JComboBoxMe();
		jComboBoxid_mesEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesEmpleadoImpuestoRenta= new JButtonMe();
		this.jButtonid_mesEmpleadoImpuestoRenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesEmpleadoImpuestoRenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesEmpleadoImpuestoRenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesEmpleadoImpuestoRenta.setText("Buscar");
		this.jButtonid_mesEmpleadoImpuestoRenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesEmpleadoImpuestoRenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesEmpleadoImpuestoRenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesEmpleadoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesEmpleadoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesEmpleadoImpuestoRenta"));

		this.jButtonid_mesEmpleadoImpuestoRentaBusqueda= new JButtonMe();
		this.jButtonid_mesEmpleadoImpuestoRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesEmpleadoImpuestoRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesEmpleadoImpuestoRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesEmpleadoImpuestoRentaBusqueda.setText("U");
		this.jButtonid_mesEmpleadoImpuestoRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesEmpleadoImpuestoRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesEmpleadoImpuestoRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesEmpleadoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesEmpleadoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesEmpleadoImpuestoRentaBusqueda"));

		if(this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesEmpleadoImpuestoRentaBusqueda.setVisible(false);		}

		this.jButtonid_mesEmpleadoImpuestoRentaUpdate= new JButtonMe();
		this.jButtonid_mesEmpleadoImpuestoRentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesEmpleadoImpuestoRentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesEmpleadoImpuestoRentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesEmpleadoImpuestoRentaUpdate.setText("U");
		this.jButtonid_mesEmpleadoImpuestoRentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesEmpleadoImpuestoRentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesEmpleadoImpuestoRentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesEmpleadoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesEmpleadoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesEmpleadoImpuestoRentaUpdate"));



					
		this.jLabelid_estructuraEmpleadoImpuestoRenta = new JLabelMe();
		this.jLabelid_estructuraEmpleadoImpuestoRenta.setText(""+EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraEmpleadoImpuestoRenta.setToolTipText("Estructura");
		this.jLabelid_estructuraEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraEmpleadoImpuestoRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraEmpleadoImpuestoRenta.setToolTipText(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutEmpleadoImpuestoRenta = new GridBagLayout();
		this.jPanelid_estructuraEmpleadoImpuestoRenta.setLayout(this.gridaBagLayoutEmpleadoImpuestoRenta);


		jComboBoxid_estructuraEmpleadoImpuestoRenta= new JComboBoxMe();
		jComboBoxid_estructuraEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraEmpleadoImpuestoRenta= new JButtonMe();
		this.jButtonid_estructuraEmpleadoImpuestoRenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEmpleadoImpuestoRenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEmpleadoImpuestoRenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEmpleadoImpuestoRenta.setText("Buscar");
		this.jButtonid_estructuraEmpleadoImpuestoRenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraEmpleadoImpuestoRenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEmpleadoImpuestoRenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraEmpleadoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEmpleadoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEmpleadoImpuestoRenta"));

		this.jButtonid_estructuraEmpleadoImpuestoRentaBusqueda= new JButtonMe();
		this.jButtonid_estructuraEmpleadoImpuestoRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEmpleadoImpuestoRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEmpleadoImpuestoRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraEmpleadoImpuestoRentaBusqueda.setText("U");
		this.jButtonid_estructuraEmpleadoImpuestoRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraEmpleadoImpuestoRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEmpleadoImpuestoRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraEmpleadoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEmpleadoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEmpleadoImpuestoRentaBusqueda"));

		if(this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraEmpleadoImpuestoRentaBusqueda.setVisible(false);		}

		this.jButtonid_estructuraEmpleadoImpuestoRentaUpdate= new JButtonMe();
		this.jButtonid_estructuraEmpleadoImpuestoRentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEmpleadoImpuestoRentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEmpleadoImpuestoRentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraEmpleadoImpuestoRentaUpdate.setText("U");
		this.jButtonid_estructuraEmpleadoImpuestoRentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraEmpleadoImpuestoRentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEmpleadoImpuestoRentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraEmpleadoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEmpleadoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEmpleadoImpuestoRentaUpdate"));


		jButtonid_estructuraEmpleadoImpuestoRentaArbol= new JButtonMe();
		jButtonid_estructuraEmpleadoImpuestoRentaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEmpleadoImpuestoRentaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEmpleadoImpuestoRentaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEmpleadoImpuestoRentaArbol.setText("Arbol");
		jButtonid_estructuraEmpleadoImpuestoRentaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructuraEmpleadoImpuestoRentaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEmpleadoImpuestoRentaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructuraEmpleadoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEmpleadoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEmpleadoImpuestoRentaArbol"));



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
		//this.jInternalFrameDetalleEmpleadoImpuestoRenta = new EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Empleado Impuesto Renta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleadoImpuestoRenta= new GridBagLayout();
		

		
		String sToolTipEmpleadoImpuestoRenta="";
		sToolTipEmpleadoImpuestoRenta=EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleadoImpuestoRenta+="(Nomina.EmpleadoImpuestoRenta)";
		}
		
		if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleadoImpuestoRenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEmpleadoImpuestoRenta = new JButtonMe();
		this.jButtonModificarEmpleadoImpuestoRenta = new JButtonMe();
        this.jButtonActualizarEmpleadoImpuestoRenta = new JButtonMe();
        this.jButtonEliminarEmpleadoImpuestoRenta = new JButtonMe();
        this.jButtonCancelarEmpleadoImpuestoRenta = new JButtonMe();
        this.jButtonGuardarCambiosEmpleadoImpuestoRenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaEmpleadoImpuestoRenta = new JButtonMe();
		this.jButtonCerrarEmpleadoImpuestoRenta = new JButtonMe();
		
		this.jScrollPanelDatosEmpleadoImpuestoRenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta = new JScrollPane();
		this.jScrollPanelDatosGeneralEmpleadoImpuestoRenta = new JScrollPane();
				
		
		
		this.jPanelCamposEmpleadoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEmpleadoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEmpleadoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEmpleadoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Empleado Impuesto Renta";
		
		if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Impuesto Rentas" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleadoImpuestoRenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEmpleadoImpuestoRenta.setName("jPanelCamposEmpleadoImpuestoRenta"); 

		this.jPanelCamposOcultosEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEmpleadoImpuestoRenta.setName("jPanelCamposOcultosEmpleadoImpuestoRenta"); 

        this.jPanelAccionesEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleadoImpuestoRenta.setToolTipText("Acciones");
        this.jPanelAccionesEmpleadoImpuestoRenta.setName("Acciones"); 

		this.jPanelAccionesFormularioEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEmpleadoImpuestoRenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEmpleadoImpuestoRenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEmpleadoImpuestoRenta.setText("Nuevo");
		this.jButtonModificarEmpleadoImpuestoRenta.setText("Editar");
        this.jButtonActualizarEmpleadoImpuestoRenta.setText("Actualizar");
        this.jButtonEliminarEmpleadoImpuestoRenta.setText("Eliminar");
        this.jButtonCancelarEmpleadoImpuestoRenta.setText("Cancelar");
        this.jButtonGuardarCambiosEmpleadoImpuestoRenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaEmpleadoImpuestoRenta.setText("Guardar");
		this.jButtonCerrarEmpleadoImpuestoRenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleadoImpuestoRenta,"nuevo_button","Nuevo",this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEmpleadoImpuestoRenta,"modificar_button","Editar",this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEmpleadoImpuestoRenta,"actualizar_button","Actualizar",this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEmpleadoImpuestoRenta,"eliminar_button","Eliminar",this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEmpleadoImpuestoRenta,"cancelar_button","Cancelar",this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEmpleadoImpuestoRenta,"guardarcambios_button","Guardar",this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleadoImpuestoRenta,"guardarcambiostabla_button","Guardar",this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleadoImpuestoRenta,"cerrar_button","Salir",this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEmpleadoImpuestoRenta.setToolTipText("Nuevo"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEmpleadoImpuestoRenta.setToolTipText("Editar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEmpleadoImpuestoRenta.setToolTipText("Actualizar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEmpleadoImpuestoRenta.setToolTipText("Eliminar)"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEmpleadoImpuestoRenta.setToolTipText("Cancelar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEmpleadoImpuestoRenta.setToolTipText("Guardar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEmpleadoImpuestoRenta.setToolTipText("Guardar"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleadoImpuestoRenta.setToolTipText("Salir"+" "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleadoImpuestoRenta";
		inputMap = this.jButtonNuevoEmpleadoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleadoImpuestoRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleadoImpuestoRenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEmpleadoImpuestoRenta";
		inputMap = this.jButtonActualizarEmpleadoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEmpleadoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEmpleadoImpuestoRenta"));
		
		//ELIMINAR
		sMapKey = "EliminarEmpleadoImpuestoRenta";
		inputMap = this.jButtonEliminarEmpleadoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEmpleadoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEmpleadoImpuestoRenta"));
		
		//CANCELAR	
		sMapKey = "CancelarEmpleadoImpuestoRenta";
		inputMap = this.jButtonCancelarEmpleadoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEmpleadoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEmpleadoImpuestoRenta"));
		
		//CERRAR		
		sMapKey = "CerrarEmpleadoImpuestoRenta";
		inputMap = this.jButtonCerrarEmpleadoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleadoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleadoImpuestoRenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleadoImpuestoRenta";
		inputMap = this.jButtonGuardarCambiosTablaEmpleadoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleadoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleadoImpuestoRenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEmpleadoImpuestoRenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEmpleadoImpuestoRenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEmpleadoImpuestoRenta.setToolTipText("Nuevo EmpleadoImpuestoRenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEmpleadoImpuestoRenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEmpleadoImpuestoRenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEmpleadoImpuestoRenta.setToolTipText("Sin Cerrar Ventana EmpleadoImpuestoRenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEmpleadoImpuestoRenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEmpleadoImpuestoRenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEmpleadoImpuestoRenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEmpleadoImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.setText("Accion");
		this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEmpleadoImpuestoRenta = new JLabelMe();
		
		this.jLabelAccionesEmpleadoImpuestoRenta.setText("Acciones");		
		this.jLabelAccionesEmpleadoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEmpleadoImpuestoRenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEmpleadoImpuestoRenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEmpleadoImpuestoRenta=new JTabbedPane();
		this.jTabbedPaneRelacionesEmpleadoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEmpleadoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEmpleadoImpuestoRenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEmpleadoImpuestoRenta = new GridBagLayout();
		
		this.jPanelCamposEmpleadoImpuestoRenta.setLayout(gridaBagLayoutCamposEmpleadoImpuestoRenta);
		this.jPanelCamposOcultosEmpleadoImpuestoRenta.setLayout(gridaBagLayoutCamposOcultosEmpleadoImpuestoRenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEmpleadoImpuestoRenta.add(jLabelIdEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);



	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 1;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEmpleadoImpuestoRenta.add(jLabelidEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);


	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEmpleadoImpuestoRenta.add(jLabelid_empresaEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 2;
		this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleadoImpuestoRenta.add(jButtonid_empresaEmpleadoImpuestoRentaBusqueda, this.gridBagConstraintsEmpleadoImpuestoRenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 3;
		this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleadoImpuestoRenta.add(jButtonid_empresaEmpleadoImpuestoRentaUpdate, this.gridBagConstraintsEmpleadoImpuestoRenta);
	}

	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 1;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEmpleadoImpuestoRenta.add(jComboBoxid_empresaEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);


	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoEmpleadoImpuestoRenta.add(jLabelid_empleadoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 2;
		this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmpleadoImpuestoRenta.add(jButtonid_empleadoEmpleadoImpuestoRentaBusqueda, this.gridBagConstraintsEmpleadoImpuestoRenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 3;
		this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmpleadoImpuestoRenta.add(jButtonid_empleadoEmpleadoImpuestoRentaUpdate, this.gridBagConstraintsEmpleadoImpuestoRenta);
	}

	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 1;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoEmpleadoImpuestoRenta.add(jComboBoxid_empleadoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);


	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioEmpleadoImpuestoRenta.add(jLabelid_anioEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 2;
		this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioEmpleadoImpuestoRenta.add(jButtonid_anioEmpleadoImpuestoRentaBusqueda, this.gridBagConstraintsEmpleadoImpuestoRenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 3;
		this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioEmpleadoImpuestoRenta.add(jButtonid_anioEmpleadoImpuestoRentaUpdate, this.gridBagConstraintsEmpleadoImpuestoRenta);
	}

	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 1;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioEmpleadoImpuestoRenta.add(jComboBoxid_anioEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);


	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesEmpleadoImpuestoRenta.add(jLabelid_mesEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 2;
		this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesEmpleadoImpuestoRenta.add(jButtonid_mesEmpleadoImpuestoRentaBusqueda, this.gridBagConstraintsEmpleadoImpuestoRenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 3;
		this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesEmpleadoImpuestoRenta.add(jButtonid_mesEmpleadoImpuestoRentaUpdate, this.gridBagConstraintsEmpleadoImpuestoRenta);
	}

	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 1;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesEmpleadoImpuestoRenta.add(jComboBoxid_mesEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);


	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraEmpleadoImpuestoRenta.add(jLabelid_estructuraEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 2;
		this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraEmpleadoImpuestoRenta.add(jButtonid_estructuraEmpleadoImpuestoRentaBusqueda, this.gridBagConstraintsEmpleadoImpuestoRenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 3;
		this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraEmpleadoImpuestoRenta.add(jButtonid_estructuraEmpleadoImpuestoRentaUpdate, this.gridBagConstraintsEmpleadoImpuestoRenta);
	}

	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 1;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraEmpleadoImpuestoRenta.add(jComboBoxid_estructuraEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);


	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaEmpleadoImpuestoRenta.add(jLabelfechaEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 2;
		this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaEmpleadoImpuestoRenta.add(jButtonfechaEmpleadoImpuestoRentaBusqueda, this.gridBagConstraintsEmpleadoImpuestoRenta);
	}

	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 1;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaEmpleadoImpuestoRenta.add(jDateChooserfechaEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);


	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_pagoEmpleadoImpuestoRenta.add(jLabelvalor_pagoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 2;
		this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_pagoEmpleadoImpuestoRenta.add(jButtonvalor_pagoEmpleadoImpuestoRentaBusqueda, this.gridBagConstraintsEmpleadoImpuestoRenta);
	}

	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 1;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_pagoEmpleadoImpuestoRenta.add(jTextFieldvalor_pagoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);


	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelingreso_liquidoEmpleadoImpuestoRenta.add(jLabelingreso_liquidoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 2;
		this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelingreso_liquidoEmpleadoImpuestoRenta.add(jButtoningreso_liquidoEmpleadoImpuestoRentaBusqueda, this.gridBagConstraintsEmpleadoImpuestoRenta);
	}

	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 1;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelingreso_liquidoEmpleadoImpuestoRenta.add(jTextFieldingreso_liquidoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);


	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelaporte_iessEmpleadoImpuestoRenta.add(jLabelaporte_iessEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 2;
		this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelaporte_iessEmpleadoImpuestoRenta.add(jButtonaporte_iessEmpleadoImpuestoRentaBusqueda, this.gridBagConstraintsEmpleadoImpuestoRenta);
	}

	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 1;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelaporte_iessEmpleadoImpuestoRenta.add(jTextFieldaporte_iessEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iYPanelCamposEmpleadoImpuestoRenta;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iXPanelCamposEmpleadoImpuestoRenta++;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoImpuestoRenta.add(this.jPanelidEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);



	if(iXPanelCamposEmpleadoImpuestoRenta % 1==0) {
		iXPanelCamposEmpleadoImpuestoRenta=0;
		iYPanelCamposEmpleadoImpuestoRenta++;
	}
	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iYPanelCamposEmpleadoImpuestoRenta;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iXPanelCamposEmpleadoImpuestoRenta++;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoImpuestoRenta.add(this.jPanelid_empleadoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);



	if(iXPanelCamposEmpleadoImpuestoRenta % 1==0) {
		iXPanelCamposEmpleadoImpuestoRenta=0;
		iYPanelCamposEmpleadoImpuestoRenta++;
	}
	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iYPanelCamposEmpleadoImpuestoRenta;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iXPanelCamposEmpleadoImpuestoRenta++;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoImpuestoRenta.add(this.jPanelid_anioEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);



	if(iXPanelCamposEmpleadoImpuestoRenta % 1==0) {
		iXPanelCamposEmpleadoImpuestoRenta=0;
		iYPanelCamposEmpleadoImpuestoRenta++;
	}
	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iYPanelCamposEmpleadoImpuestoRenta;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iXPanelCamposEmpleadoImpuestoRenta++;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoImpuestoRenta.add(this.jPanelid_mesEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);



	if(iXPanelCamposEmpleadoImpuestoRenta % 1==0) {
		iXPanelCamposEmpleadoImpuestoRenta=0;
		iYPanelCamposEmpleadoImpuestoRenta++;
	}
	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iYPanelCamposEmpleadoImpuestoRenta;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iXPanelCamposEmpleadoImpuestoRenta++;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoImpuestoRenta.add(this.jPanelid_estructuraEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);



	if(iXPanelCamposEmpleadoImpuestoRenta % 1==0) {
		iXPanelCamposEmpleadoImpuestoRenta=0;
		iYPanelCamposEmpleadoImpuestoRenta++;
	}
	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iYPanelCamposEmpleadoImpuestoRenta;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iXPanelCamposEmpleadoImpuestoRenta++;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoImpuestoRenta.add(this.jPanelfechaEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);



	if(iXPanelCamposEmpleadoImpuestoRenta % 1==0) {
		iXPanelCamposEmpleadoImpuestoRenta=0;
		iYPanelCamposEmpleadoImpuestoRenta++;
	}
	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iYPanelCamposEmpleadoImpuestoRenta;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iXPanelCamposEmpleadoImpuestoRenta++;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoImpuestoRenta.add(this.jPanelvalor_pagoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);



	if(iXPanelCamposEmpleadoImpuestoRenta % 1==0) {
		iXPanelCamposEmpleadoImpuestoRenta=0;
		iYPanelCamposEmpleadoImpuestoRenta++;
	}
	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iYPanelCamposEmpleadoImpuestoRenta;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iXPanelCamposEmpleadoImpuestoRenta++;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoImpuestoRenta.add(this.jPanelingreso_liquidoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);



	if(iXPanelCamposEmpleadoImpuestoRenta % 1==0) {
		iXPanelCamposEmpleadoImpuestoRenta=0;
		iYPanelCamposEmpleadoImpuestoRenta++;
	}
	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iYPanelCamposEmpleadoImpuestoRenta;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iXPanelCamposEmpleadoImpuestoRenta++;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoImpuestoRenta.add(this.jPanelaporte_iessEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);



	if(iXPanelCamposEmpleadoImpuestoRenta % 1==0) {
		iXPanelCamposEmpleadoImpuestoRenta=0;
		iYPanelCamposEmpleadoImpuestoRenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iYPanelCamposOcultosEmpleadoImpuestoRenta;
	this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iXPanelCamposOcultosEmpleadoImpuestoRenta++;
	this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEmpleadoImpuestoRenta.add(this.jPanelid_empresaEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);



	if(iXPanelCamposOcultosEmpleadoImpuestoRenta % 1==0) {
		iXPanelCamposOcultosEmpleadoImpuestoRenta=0;
		iYPanelCamposOcultosEmpleadoImpuestoRenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesEmpleadoImpuestoRenta= new GridBagLayout();
		this.jPanelAccionesEmpleadoImpuestoRenta.setLayout(gridaBagLayoutAccionesEmpleadoImpuestoRenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEmpleadoImpuestoRenta= new GridBagLayout();
		this.jPanelAccionesFormularioEmpleadoImpuestoRenta.setLayout(gridaBagLayoutAccionesFormularioEmpleadoImpuestoRenta);
		
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleadoImpuestoRenta.add(this.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);

		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleadoImpuestoRenta.add(this.jCheckBoxPostAccionNuevoEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.empleadoimpuestorentaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleadoImpuestoRenta.add(this.jCheckBoxPostAccionSinCerrarEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.empleadoimpuestorentaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleadoImpuestoRenta.add(this.jCheckBoxPostAccionSinMensajeEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesEmpleadoImpuestoRenta.add(this.jButtonModificarEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);							

		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesEmpleadoImpuestoRenta.add(this.jButtonEliminarEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		
			
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleadoImpuestoRenta.add(this.jButtonActualizarEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);


		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleadoImpuestoRenta.add(this.jButtonGuardarCambiosEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);	
		
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = 0;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesEmpleadoImpuestoRenta.add(this.jButtonCancelarEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleadoImpuestoRenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleadoImpuestoRenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();						
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;		
			//this.gridBagConstraintsEmpleadoImpuestoRenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleadoImpuestoRenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx =0;
		this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleadoImpuestoRenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EmpleadoImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEmpleadoImpuestoRenta = new EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Empleado Impuesto Renta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Empleado Impuesto Renta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empleado Impuesto Renta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EmpleadoImpuestoRentaModel empleadoimpuestorentaModel=new EmpleadoImpuestoRentaModel(this);
			
			//SI USARA CLASE INTERNA
			//EmpleadoImpuestoRentaModel.EmpleadoImpuestoRentaFocusTraversalPolicy empleadoimpuestorentaFocusTraversalPolicy = empleadoimpuestorentaModel.new EmpleadoImpuestoRentaFocusTraversalPolicy(this);
			
			//empleadoimpuestorentaFocusTraversalPolicy.setempleadoimpuestorentaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(empleadoimpuestorentaModel);
			
			
			this.jContentPaneDetalleEmpleadoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEmpleadoImpuestoRenta = new GridBagLayout();	
			this.jContentPaneDetalleEmpleadoImpuestoRenta.setLayout(gridaBagLayoutDetalleEmpleadoImpuestoRenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleadoImpuestoRenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
					
				
				this.jContentPaneDetalleEmpleadoImpuestoRenta.add(jTtoolBarDetalleEmpleadoImpuestoRenta, gridBagConstraintsEmpleadoImpuestoRenta);								
				
}
			
			this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta=   new JScrollPane(jContentPaneDetalleEmpleadoImpuestoRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEmpleadoImpuestoRenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleadoImpuestoRenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoImpuestoRenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoImpuestoRenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
	        
			this.jContentPaneDetalleEmpleadoImpuestoRenta.add(jPanelCamposEmpleadoImpuestoRenta, gridBagConstraintsEmpleadoImpuestoRenta);
			
			
			
			
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
						&& empleadoimpuestorentaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.empleadoimpuestorentaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEmpleadoImpuestoRenta= new GridBagConstraints();
						this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
						this.jContentPaneDetalleEmpleadoImpuestoRenta.add(this.jTabbedPaneRelacionesEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEmpleadoImpuestoRenta.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEmpleadoImpuestoRenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
					this.gridBagConstraintsEmpleadoImpuestoRenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
					
				
					this.jContentPaneDetalleEmpleadoImpuestoRenta.add(jPanelCamposOcultosEmpleadoImpuestoRenta, gridBagConstraintsEmpleadoImpuestoRenta);
				
					this.jPanelCamposOcultosEmpleadoImpuestoRenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
	        this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEmpleadoImpuestoRenta.add(this.jPanelAccionesFormularioEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);							
			
			
			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
	        this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
	        
			
			this.jContentPaneDetalleEmpleadoImpuestoRenta.add(this.jPanelAccionesEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEmpleadoImpuestoRenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta=   new JScrollPane(this.jPanelCamposEmpleadoImpuestoRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
			this.gridBagConstraintsEmpleadoImpuestoRenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEmpleadoImpuestoRenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEmpleadoImpuestoRenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);			
			
			this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
			
			
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		
			
		this.gridBagConstraintsEmpleadoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoImpuestoRenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleadoImpuestoRenta, this.gridBagConstraintsEmpleadoImpuestoRenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEmpleadoImpuestoRenta;//jContentPane;
		
		return jScrollPanelDatosEdicionEmpleadoImpuestoRenta;
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
