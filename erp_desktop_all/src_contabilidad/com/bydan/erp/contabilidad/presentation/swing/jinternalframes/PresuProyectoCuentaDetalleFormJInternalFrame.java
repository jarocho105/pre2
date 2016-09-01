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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.PresuProyectoCuentaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class PresuProyectoCuentaDetalleFormJInternalFrame extends PresuProyectoCuentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePresuProyectoCuenta;
	
	protected JMenuBar jmenuBarDetallePresuProyectoCuenta;
	
	protected JMenu jmenuDetallePresuProyectoCuenta;
	protected JMenu jmenuDetalleArchivoPresuProyectoCuenta;
	protected JMenu jmenuDetalleAccionesPresuProyectoCuenta;
	protected JMenu jmenuDetalleDatosPresuProyectoCuenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePresuProyectoCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresuProyectoCuenta;	
	protected GridBagConstraints gridBagConstraintsPresuProyectoCuenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PresuProyectoCuentaBeanSwingJInternalFrameAdditional jInternalFrameDetallePresuProyectoCuenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PresuProyectoBeanSwingJInternalFrame presuproyectoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_presuproyecto="";

	protected PresuTipoCuentaProyectoBeanSwingJInternalFrame presutipocuentaproyectoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_presutipocuentaproyecto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected PresuEstadoBeanSwingJInternalFrame presuestadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_presuestado="";
	
	public PresuProyectoCuentaSessionBean presuproyectocuentaSessionBean;
	
	

	public PresuAsignacionBeanSwingJInternalFrame presuasignacionBeanSwingJInternalFrame=null;
	public PresuAsignacionBeanSwingJInternalFrame presuasignacionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePresuAsignacion=false;
	public PresuAsignacionSessionBean presuasignacionSessionBean;
	
	
	public PresuProyectoSessionBean presuproyectoSessionBean;
	public PresuTipoCuentaProyectoSessionBean presutipocuentaproyectoSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public PresuEstadoSessionBean presuestadoSessionBean;	
	
	public PresuProyectoCuentaLogic presuproyectocuentaLogic;
	
	public JScrollPane jScrollPanelDatosPresuProyectoCuenta;
	public JScrollPane jScrollPanelDatosEdicionPresuProyectoCuenta;
	public JScrollPane jScrollPanelDatosGeneralPresuProyectoCuenta;
	
	protected JPanel jPanelCamposPresuProyectoCuenta;    
	protected JPanel jPanelCamposOcultosPresuProyectoCuenta;    	
	protected JPanel jPanelAccionesPresuProyectoCuenta;
	protected JPanel jPanelAccionesFormularioPresuProyectoCuenta;
    
	
	
	protected Integer iXPanelCamposPresuProyectoCuenta=0;
	protected Integer iYPanelCamposPresuProyectoCuenta=0;
	
	protected Integer iXPanelCamposOcultosPresuProyectoCuenta=0;
	protected Integer iYPanelCamposOcultosPresuProyectoCuenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPresuProyectoCuenta;
	public JButton jButtonModificarPresuProyectoCuenta;
	public JButton jButtonActualizarPresuProyectoCuenta;
    public JButton jButtonEliminarPresuProyectoCuenta;
	public JButton jButtonCancelarPresuProyectoCuenta;
    public JButton jButtonGuardarCambiosPresuProyectoCuenta;
	public JButton jButtonGuardarCambiosTablaPresuProyectoCuenta;
	protected JButton jButtonCerrarPresuProyectoCuenta;
	
	
	protected JButton jButtonProcesarInformacionPresuProyectoCuenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPresuProyectoCuenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPresuProyectoCuenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajePresuProyectoCuenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresuProyectoCuenta;
	protected JButton jButtonModificarToolBarPresuProyectoCuenta;
	protected JButton jButtonActualizarToolBarPresuProyectoCuenta;
    protected JButton jButtonEliminarToolBarPresuProyectoCuenta;
	protected JButton jButtonCancelarToolBarPresuProyectoCuenta;
    protected JButton jButtonGuardarCambiosToolBarPresuProyectoCuenta;
	protected JButton jButtonGuardarCambiosTablaToolBarPresuProyectoCuenta;
	protected JButton jButtonMostrarOcultarTablaToolBarPresuProyectoCuenta;
	protected JButton jButtonCerrarToolBarPresuProyectoCuenta;
	
	protected JButton jButtonProcesarInformacionToolBarPresuProyectoCuenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresuProyectoCuenta;
	protected JMenuItem jMenuItemModificarPresuProyectoCuenta;
	protected JMenuItem jMenuItemActualizarPresuProyectoCuenta;
    protected JMenuItem jMenuItemEliminarPresuProyectoCuenta;
	protected JMenuItem jMenuItemCancelarPresuProyectoCuenta;
    protected JMenuItem jMenuItemGuardarCambiosPresuProyectoCuenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresuProyectoCuenta;
	protected JMenuItem jMenuItemCerrarPresuProyectoCuenta;
	protected JMenuItem jMenuItemDetalleCerrarPresuProyectoCuenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresuProyectoCuenta;
	
	protected JMenuItem jMenuItemProcesarInformacionPresuProyectoCuenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresuProyectoCuenta;
	protected JMenuItem jMenuItemMostrarOcultarPresuProyectoCuenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresuProyectoCuenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresuProyectoCuenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresuProyectoCuenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPresuProyectoCuenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPresuProyectoCuenta;
	public JLabel jLabelIdPresuProyectoCuenta;
	public JLabel jLabelidPresuProyectoCuenta;
	public JButton jButtonidPresuProyectoCuentaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoPresuProyectoCuenta;
	public JLabel jLabelcodigoPresuProyectoCuenta;
	public JTextField jTextFieldcodigoPresuProyectoCuenta;
	public JButton jButtoncodigoPresuProyectoCuentaBusqueda= new JButtonMe();

	public JPanel jPanelnombrePresuProyectoCuenta;
	public JLabel jLabelnombrePresuProyectoCuenta;
	public JTextArea jTextAreanombrePresuProyectoCuenta;
	public JScrollPane jscrollPanenombrePresuProyectoCuenta;
	public JButton jButtonnombrePresuProyectoCuentaBusqueda= new JButtonMe();

	public JPanel jPanelfechaPresuProyectoCuenta;
	public JLabel jLabelfechaPresuProyectoCuenta;
	//public JFormattedTextField jDateChooserfechaPresuProyectoCuenta;

	public JDateChooser jDateChooserfechaPresuProyectoCuenta;
	public JButton jButtonfechaPresuProyectoCuentaBusqueda= new JButtonMe();

	public JPanel jPanelvalorPresuProyectoCuenta;
	public JLabel jLabelvalorPresuProyectoCuenta;
	public JTextField jTextFieldvalorPresuProyectoCuenta;
	public JButton jButtonvalorPresuProyectoCuentaBusqueda= new JButtonMe();

	public JPanel jPanelordenPresuProyectoCuenta;
	public JLabel jLabelordenPresuProyectoCuenta;
	public JTextField jTextFieldordenPresuProyectoCuenta;
	public JButton jButtonordenPresuProyectoCuentaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionPresuProyectoCuenta;
	public JLabel jLabeldescripcionPresuProyectoCuenta;
	public JTextArea jTextAreadescripcionPresuProyectoCuenta;
	public JScrollPane jscrollPanedescripcionPresuProyectoCuenta;
	public JButton jButtondescripcionPresuProyectoCuentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_presu_proyectoPresuProyectoCuenta;
	public JLabel jLabelid_presu_proyectoPresuProyectoCuenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_presu_proyectoPresuProyectoCuenta;
	public JButton jButtonid_presu_proyectoPresuProyectoCuenta= new JButtonMe();
	public JButton jButtonid_presu_proyectoPresuProyectoCuentaUpdate= new JButtonMe();
	public JButton jButtonid_presu_proyectoPresuProyectoCuentaBusqueda= new JButtonMe();

	public JPanel jPanelid_presu_tipo_cuenta_proyectoPresuProyectoCuenta;
	public JLabel jLabelid_presu_tipo_cuenta_proyectoPresuProyectoCuenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta;
	public JButton jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuenta= new JButtonMe();
	public JButton jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaUpdate= new JButtonMe();
	public JButton jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contablePresuProyectoCuenta;
	public JLabel jLabelid_cuenta_contablePresuProyectoCuenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contablePresuProyectoCuenta;
	public JButton jButtonid_cuenta_contablePresuProyectoCuenta= new JButtonMe();
	public JButton jButtonid_cuenta_contablePresuProyectoCuentaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contablePresuProyectoCuentaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contablePresuProyectoCuentaArbol= new JButtonMe();

	public JPanel jPanelid_empleadoPresuProyectoCuenta;
	public JLabel jLabelid_empleadoPresuProyectoCuenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoPresuProyectoCuenta;
	public JButton jButtonid_empleadoPresuProyectoCuenta= new JButtonMe();
	public JButton jButtonid_empleadoPresuProyectoCuentaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoPresuProyectoCuentaBusqueda= new JButtonMe();

	public JPanel jPanelid_presu_estadoPresuProyectoCuenta;
	public JLabel jLabelid_presu_estadoPresuProyectoCuenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_presu_estadoPresuProyectoCuenta;
	public JButton jButtonid_presu_estadoPresuProyectoCuenta= new JButtonMe();
	public JButton jButtonid_presu_estadoPresuProyectoCuentaUpdate= new JButtonMe();
	public JButton jButtonid_presu_estadoPresuProyectoCuentaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPresuProyectoCuenta;
	
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
	public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PresuProyectoCuentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPresuProyectoCuenta=new JPanel();
				this.jPanelAccionesFormularioPresuProyectoCuenta=new JPanel();
				this.jmenuBarDetallePresuProyectoCuenta=new JMenuBar();
				this.jTtoolBarDetallePresuProyectoCuenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuProyectoCuentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PresuProyectoCuenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PresuProyectoCuentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PresuProyectoCuenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuProyectoCuentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuProyectoCuenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuProyectoCuentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuProyectoCuenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuProyectoCuentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresuProyectoCuenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPresuProyectoCuenta() {
		return this.jButtonActualizarToolBarPresuProyectoCuenta;
	}
	
	public JButton getjButtonEliminarToolBarPresuProyectoCuenta() {
		return this.jButtonEliminarToolBarPresuProyectoCuenta;
	}
	
	public JButton getjButtonCancelarToolBarPresuProyectoCuenta() {
		return this.jButtonCancelarToolBarPresuProyectoCuenta;
	}		
	
	public JButton getjButtonProcesarInformacionPresuProyectoCuenta() {
		return this.jButtonProcesarInformacionPresuProyectoCuenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresuProyectoCuenta)	{
		this.jButtonProcesarInformacionPresuProyectoCuenta = jButtonProcesarInformacionPresuProyectoCuenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresuProyectoCuenta() {
		return this.jComboBoxTiposAccionesPresuProyectoCuenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresuProyectoCuenta(
			JComboBox jComboBoxTiposRelacionesPresuProyectoCuenta) {
		this.jComboBoxTiposRelacionesPresuProyectoCuenta = jComboBoxTiposRelacionesPresuProyectoCuenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresuProyectoCuenta(
			JComboBox jComboBoxTiposAccionesPresuProyectoCuenta) {
		this.jComboBoxTiposAccionesPresuProyectoCuenta = jComboBoxTiposAccionesPresuProyectoCuenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPresuProyectoCuenta() {
		return this.jComboBoxTiposAccionesFormularioPresuProyectoCuenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPresuProyectoCuenta(
			JComboBox jComboBoxTiposAccionesFormularioPresuProyectoCuenta) {
		this.jComboBoxTiposAccionesFormularioPresuProyectoCuenta = jComboBoxTiposAccionesFormularioPresuProyectoCuenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.presuproyectocuentaSessionBean=new PresuProyectoCuentaSessionBean();
		
		this.presuproyectocuentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presuproyectocuentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presuproyectocuentaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.presuasignacionSessionBean=new PresuAsignacionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresuProyectoCuentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresuProyectoCuentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresuProyectoCuentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuenta Contable Proyecto MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
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
	
		PresuProyectoCuentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePresuProyectoCuenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPresuProyectoCuenta=new JButtonMe();
				this.jButtonModificarToolBarPresuProyectoCuenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPresuProyectoCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPresuProyectoCuenta,this.jTtoolBarDetallePresuProyectoCuenta,
							"actualizar","actualizar","Actualizar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPresuProyectoCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPresuProyectoCuenta,this.jTtoolBarDetallePresuProyectoCuenta,
							"eliminar","eliminar","Eliminar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPresuProyectoCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPresuProyectoCuenta,this.jTtoolBarDetallePresuProyectoCuenta,
							"cancelar","cancelar","Cancelar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPresuProyectoCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPresuProyectoCuenta,this.jTtoolBarDetallePresuProyectoCuenta,
							"guardarcambios","guardarcambios","Guardar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePresuProyectoCuenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePresuProyectoCuenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPresuProyectoCuenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPresuProyectoCuenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPresuProyectoCuenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresuProyectoCuenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresuProyectoCuenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresuProyectoCuenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPresuProyectoCuenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPresuProyectoCuenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPresuProyectoCuenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPresuProyectoCuenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPresuProyectoCuenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPresuProyectoCuenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPresuProyectoCuenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPresuProyectoCuenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPresuProyectoCuenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPresuProyectoCuenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPresuProyectoCuenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPresuProyectoCuenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPresuProyectoCuenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresuProyectoCuenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresuProyectoCuenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresuProyectoCuenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresuProyectoCuenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresuProyectoCuenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPresuProyectoCuenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPresuProyectoCuenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPresuProyectoCuenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresuProyectoCuenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresuProyectoCuenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresuProyectoCuenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresuProyectoCuenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresuProyectoCuenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresuProyectoCuenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPresuProyectoCuenta.add(this.jMenuItemDetalleCerrarPresuProyectoCuenta);
		
		this.jmenuDetalleAccionesPresuProyectoCuenta.add(this.jMenuItemActualizarPresuProyectoCuenta);
		this.jmenuDetalleAccionesPresuProyectoCuenta.add(this.jMenuItemEliminarPresuProyectoCuenta);
		this.jmenuDetalleAccionesPresuProyectoCuenta.add(this.jMenuItemCancelarPresuProyectoCuenta);		
		
		//this.jmenuDetalleDatosPresuProyectoCuenta.add(this.jMenuItemDetalleAbrirOrderByPresuProyectoCuenta);				
		this.jmenuDetalleDatosPresuProyectoCuenta.add(this.jMenuItemDetalleMostarOcultarPresuProyectoCuenta);				
				
		//this.jmenuDetalleAccionesPresuProyectoCuenta.add(this.jMenuItemGuardarCambiosPresuProyectoCuenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePresuProyectoCuenta.add(this.jmenuDetalleArchivoPresuProyectoCuenta);		
		this.jmenuBarDetallePresuProyectoCuenta.add(this.jmenuDetalleAccionesPresuProyectoCuenta);		
		this.jmenuBarDetallePresuProyectoCuenta.add(this.jmenuDetalleDatosPresuProyectoCuenta);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetallePresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePresuProyectoCuenta.add(this.jmenuDetallePresuProyectoCuenta);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePresuProyectoCuenta);				
	}
	
	
	public void inicializarElementosCamposPresuProyectoCuenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPresuProyectoCuenta = new JLabelMe();
		jLabelIdPresuProyectoCuenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPresuProyectoCuenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPresuProyectoCuenta.setToolTipText(PresuProyectoCuentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPresuProyectoCuenta= new GridBagLayout();

		this.jPanelidPresuProyectoCuenta.setLayout(this.gridaBagLayoutPresuProyectoCuenta);

		jLabelidPresuProyectoCuenta = new JLabel();
		jLabelidPresuProyectoCuenta.setText("Id");

		jLabelidPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoPresuProyectoCuenta = new JLabelMe();
		this.jLabelcodigoPresuProyectoCuenta.setText(""+PresuProyectoCuentaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoPresuProyectoCuenta.setToolTipText("Codigo");
		this.jLabelcodigoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoPresuProyectoCuenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoPresuProyectoCuenta.setToolTipText(PresuProyectoCuentaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutPresuProyectoCuenta = new GridBagLayout();
		this.jPanelcodigoPresuProyectoCuenta.setLayout(this.gridaBagLayoutPresuProyectoCuenta);


		jTextFieldcodigoPresuProyectoCuenta= new JTextFieldMe();

		jTextFieldcodigoPresuProyectoCuenta.setEnabled(false);
		jTextFieldcodigoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoPresuProyectoCuentaBusqueda= new JButtonMe();
		this.jButtoncodigoPresuProyectoCuentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPresuProyectoCuentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPresuProyectoCuentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoPresuProyectoCuentaBusqueda.setText("U");
		this.jButtoncodigoPresuProyectoCuentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoPresuProyectoCuentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoPresuProyectoCuentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoPresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoPresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoPresuProyectoCuentaBusqueda"));

		if(this.presuproyectocuentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoPresuProyectoCuentaBusqueda.setVisible(false);		}


					
		this.jLabelnombrePresuProyectoCuenta = new JLabelMe();
		this.jLabelnombrePresuProyectoCuenta.setText(""+PresuProyectoCuentaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombrePresuProyectoCuenta.setToolTipText("Nombre");
		this.jLabelnombrePresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombrePresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombrePresuProyectoCuenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombrePresuProyectoCuenta.setToolTipText(PresuProyectoCuentaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutPresuProyectoCuenta = new GridBagLayout();
		this.jPanelnombrePresuProyectoCuenta.setLayout(this.gridaBagLayoutPresuProyectoCuenta);


		jTextAreanombrePresuProyectoCuenta= new JTextAreaMe();
		jTextAreanombrePresuProyectoCuenta.setEnabled(false);
		jTextAreanombrePresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePresuProyectoCuenta.setLineWrap(true);
		jTextAreanombrePresuProyectoCuenta.setWrapStyleWord(true);
		jTextAreanombrePresuProyectoCuenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombrePresuProyectoCuenta.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombrePresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombrePresuProyectoCuenta = new JScrollPane(jTextAreanombrePresuProyectoCuenta);
		jscrollPanenombrePresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombrePresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombrePresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombrePresuProyectoCuentaBusqueda= new JButtonMe();
		this.jButtonnombrePresuProyectoCuentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePresuProyectoCuentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePresuProyectoCuentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombrePresuProyectoCuentaBusqueda.setText("U");
		this.jButtonnombrePresuProyectoCuentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombrePresuProyectoCuentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombrePresuProyectoCuentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombrePresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombrePresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombrePresuProyectoCuentaBusqueda"));

		if(this.presuproyectocuentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombrePresuProyectoCuentaBusqueda.setVisible(false);		}


					
		this.jLabelfechaPresuProyectoCuenta = new JLabelMe();
		this.jLabelfechaPresuProyectoCuenta.setText(""+PresuProyectoCuentaConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaPresuProyectoCuenta.setToolTipText("Fecha");
		this.jLabelfechaPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaPresuProyectoCuenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaPresuProyectoCuenta.setToolTipText(PresuProyectoCuentaConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutPresuProyectoCuenta = new GridBagLayout();
		this.jPanelfechaPresuProyectoCuenta.setLayout(this.gridaBagLayoutPresuProyectoCuenta);


		//jFormattedTextFieldfechaPresuProyectoCuenta= new JFormattedTextFieldMe();

		jDateChooserfechaPresuProyectoCuenta= new JDateChooser();
		jDateChooserfechaPresuProyectoCuenta.setEnabled(false);
		jDateChooserfechaPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaPresuProyectoCuenta.setDate(new Date());
		jDateChooserfechaPresuProyectoCuenta.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaPresuProyectoCuenta.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaPresuProyectoCuentaBusqueda= new JButtonMe();
		this.jButtonfechaPresuProyectoCuentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPresuProyectoCuentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPresuProyectoCuentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaPresuProyectoCuentaBusqueda.setText("U");
		this.jButtonfechaPresuProyectoCuentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaPresuProyectoCuentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaPresuProyectoCuentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaPresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaPresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaPresuProyectoCuentaBusqueda"));

		if(this.presuproyectocuentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaPresuProyectoCuentaBusqueda.setVisible(false);		}


					
		this.jLabelvalorPresuProyectoCuenta = new JLabelMe();
		this.jLabelvalorPresuProyectoCuenta.setText(""+PresuProyectoCuentaConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorPresuProyectoCuenta.setToolTipText("Valor");
		this.jLabelvalorPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorPresuProyectoCuenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorPresuProyectoCuenta.setToolTipText(PresuProyectoCuentaConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutPresuProyectoCuenta = new GridBagLayout();
		this.jPanelvalorPresuProyectoCuenta.setLayout(this.gridaBagLayoutPresuProyectoCuenta);


		jTextFieldvalorPresuProyectoCuenta= new JTextFieldMe();
		jTextFieldvalorPresuProyectoCuenta.setEnabled(false);
		jTextFieldvalorPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorPresuProyectoCuenta.setText("0.0");

		this.jButtonvalorPresuProyectoCuentaBusqueda= new JButtonMe();
		this.jButtonvalorPresuProyectoCuentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPresuProyectoCuentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPresuProyectoCuentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorPresuProyectoCuentaBusqueda.setText("U");
		this.jButtonvalorPresuProyectoCuentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorPresuProyectoCuentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorPresuProyectoCuentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorPresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorPresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorPresuProyectoCuentaBusqueda"));

		if(this.presuproyectocuentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorPresuProyectoCuentaBusqueda.setVisible(false);		}


					
		this.jLabelordenPresuProyectoCuenta = new JLabelMe();
		this.jLabelordenPresuProyectoCuenta.setText(""+PresuProyectoCuentaConstantesFunciones.LABEL_ORDEN+" : *");
		this.jLabelordenPresuProyectoCuenta.setToolTipText("Orden");
		this.jLabelordenPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelordenPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelordenPresuProyectoCuenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelordenPresuProyectoCuenta.setToolTipText(PresuProyectoCuentaConstantesFunciones.LABEL_ORDEN);
		this.gridaBagLayoutPresuProyectoCuenta = new GridBagLayout();
		this.jPanelordenPresuProyectoCuenta.setLayout(this.gridaBagLayoutPresuProyectoCuenta);


		jTextFieldordenPresuProyectoCuenta= new JTextFieldMe();
		jTextFieldordenPresuProyectoCuenta.setEnabled(false);
		jTextFieldordenPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldordenPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldordenPresuProyectoCuenta.setText("0");

		this.jButtonordenPresuProyectoCuentaBusqueda= new JButtonMe();
		this.jButtonordenPresuProyectoCuentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenPresuProyectoCuentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenPresuProyectoCuentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonordenPresuProyectoCuentaBusqueda.setText("U");
		this.jButtonordenPresuProyectoCuentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonordenPresuProyectoCuentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonordenPresuProyectoCuentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldordenPresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldordenPresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ordenPresuProyectoCuentaBusqueda"));

		if(this.presuproyectocuentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonordenPresuProyectoCuentaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionPresuProyectoCuenta = new JLabelMe();
		this.jLabeldescripcionPresuProyectoCuenta.setText(""+PresuProyectoCuentaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionPresuProyectoCuenta.setToolTipText("Descripcion");
		this.jLabeldescripcionPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionPresuProyectoCuenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionPresuProyectoCuenta.setToolTipText(PresuProyectoCuentaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutPresuProyectoCuenta = new GridBagLayout();
		this.jPaneldescripcionPresuProyectoCuenta.setLayout(this.gridaBagLayoutPresuProyectoCuenta);


		jTextAreadescripcionPresuProyectoCuenta= new JTextAreaMe();
		jTextAreadescripcionPresuProyectoCuenta.setEnabled(false);
		jTextAreadescripcionPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPresuProyectoCuenta.setLineWrap(true);
		jTextAreadescripcionPresuProyectoCuenta.setWrapStyleWord(true);
		jTextAreadescripcionPresuProyectoCuenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionPresuProyectoCuenta.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionPresuProyectoCuenta = new JScrollPane(jTextAreadescripcionPresuProyectoCuenta);
		jscrollPanedescripcionPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionPresuProyectoCuentaBusqueda= new JButtonMe();
		this.jButtondescripcionPresuProyectoCuentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPresuProyectoCuentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPresuProyectoCuentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionPresuProyectoCuentaBusqueda.setText("U");
		this.jButtondescripcionPresuProyectoCuentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionPresuProyectoCuentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionPresuProyectoCuentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionPresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionPresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionPresuProyectoCuentaBusqueda"));

		if(this.presuproyectocuentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionPresuProyectoCuentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPresuProyectoCuenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_presu_proyectoPresuProyectoCuenta = new JLabelMe();
		this.jLabelid_presu_proyectoPresuProyectoCuenta.setText(""+PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUPROYECTO+" : *");
		this.jLabelid_presu_proyectoPresuProyectoCuenta.setToolTipText("Proyecto");
		this.jLabelid_presu_proyectoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_presu_proyectoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_presu_proyectoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_presu_proyectoPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_presu_proyectoPresuProyectoCuenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_presu_proyectoPresuProyectoCuenta.setToolTipText(PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUPROYECTO);
		this.gridaBagLayoutPresuProyectoCuenta = new GridBagLayout();
		this.jPanelid_presu_proyectoPresuProyectoCuenta.setLayout(this.gridaBagLayoutPresuProyectoCuenta);


		jComboBoxid_presu_proyectoPresuProyectoCuenta= new JComboBoxMe();
		jComboBoxid_presu_proyectoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_proyectoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_proyectoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_presu_proyectoPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_presu_proyectoPresuProyectoCuenta= new JButtonMe();
		this.jButtonid_presu_proyectoPresuProyectoCuenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_proyectoPresuProyectoCuenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_proyectoPresuProyectoCuenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_proyectoPresuProyectoCuenta.setText("Buscar");
		this.jButtonid_presu_proyectoPresuProyectoCuenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_presu_proyectoPresuProyectoCuenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_proyectoPresuProyectoCuenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_presu_proyectoPresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_proyectoPresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_proyectoPresuProyectoCuenta"));

		this.jButtonid_presu_proyectoPresuProyectoCuentaBusqueda= new JButtonMe();
		this.jButtonid_presu_proyectoPresuProyectoCuentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_proyectoPresuProyectoCuentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_proyectoPresuProyectoCuentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_presu_proyectoPresuProyectoCuentaBusqueda.setText("U");
		this.jButtonid_presu_proyectoPresuProyectoCuentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_presu_proyectoPresuProyectoCuentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_proyectoPresuProyectoCuentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_presu_proyectoPresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_proyectoPresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_proyectoPresuProyectoCuentaBusqueda"));

		if(this.presuproyectocuentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_presu_proyectoPresuProyectoCuentaBusqueda.setVisible(false);		}

		this.jButtonid_presu_proyectoPresuProyectoCuentaUpdate= new JButtonMe();
		this.jButtonid_presu_proyectoPresuProyectoCuentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_proyectoPresuProyectoCuentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_proyectoPresuProyectoCuentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_presu_proyectoPresuProyectoCuentaUpdate.setText("U");
		this.jButtonid_presu_proyectoPresuProyectoCuentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_presu_proyectoPresuProyectoCuentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_proyectoPresuProyectoCuentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_presu_proyectoPresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_proyectoPresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_proyectoPresuProyectoCuentaUpdate"));



					
		this.jLabelid_presu_tipo_cuenta_proyectoPresuProyectoCuenta = new JLabelMe();
		this.jLabelid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setText(""+PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUTIPOCUENTAPROYECTO+" : *");
		this.jLabelid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setToolTipText("Tipo Cuenta Proyecto");
		this.jLabelid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_presu_tipo_cuenta_proyectoPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_presu_tipo_cuenta_proyectoPresuProyectoCuenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setToolTipText(PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUTIPOCUENTAPROYECTO);
		this.gridaBagLayoutPresuProyectoCuenta = new GridBagLayout();
		this.jPanelid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setLayout(this.gridaBagLayoutPresuProyectoCuenta);


		jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta= new JComboBoxMe();
		jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuenta= new JButtonMe();
		this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setText("Buscar");
		this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_tipo_cuenta_proyectoPresuProyectoCuenta"));

		this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaBusqueda= new JButtonMe();
		this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaBusqueda.setText("U");
		this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_tipo_cuenta_proyectoPresuProyectoCuentaBusqueda"));

		if(this.presuproyectocuentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaBusqueda.setVisible(false);		}

		this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaUpdate= new JButtonMe();
		this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaUpdate.setText("U");
		this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_tipo_cuenta_proyectoPresuProyectoCuentaUpdate"));



					
		this.jLabelid_cuenta_contablePresuProyectoCuenta = new JLabelMe();
		this.jLabelid_cuenta_contablePresuProyectoCuenta.setText(""+PresuProyectoCuentaConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contablePresuProyectoCuenta.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contablePresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contablePresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contablePresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contablePresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contablePresuProyectoCuenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contablePresuProyectoCuenta.setToolTipText(PresuProyectoCuentaConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutPresuProyectoCuenta = new GridBagLayout();
		this.jPanelid_cuenta_contablePresuProyectoCuenta.setLayout(this.gridaBagLayoutPresuProyectoCuenta);


		jComboBoxid_cuenta_contablePresuProyectoCuenta= new JComboBoxMe();
		jComboBoxid_cuenta_contablePresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contablePresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contablePresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contablePresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contablePresuProyectoCuenta= new JButtonMe();
		this.jButtonid_cuenta_contablePresuProyectoCuenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contablePresuProyectoCuenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contablePresuProyectoCuenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contablePresuProyectoCuenta.setText("Buscar");
		this.jButtonid_cuenta_contablePresuProyectoCuenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contablePresuProyectoCuenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contablePresuProyectoCuenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contablePresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contablePresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contablePresuProyectoCuenta"));

		this.jButtonid_cuenta_contablePresuProyectoCuentaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contablePresuProyectoCuentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contablePresuProyectoCuentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contablePresuProyectoCuentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contablePresuProyectoCuentaBusqueda.setText("U");
		this.jButtonid_cuenta_contablePresuProyectoCuentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contablePresuProyectoCuentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contablePresuProyectoCuentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contablePresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contablePresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contablePresuProyectoCuentaBusqueda"));

		if(this.presuproyectocuentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contablePresuProyectoCuentaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contablePresuProyectoCuentaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contablePresuProyectoCuentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contablePresuProyectoCuentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contablePresuProyectoCuentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contablePresuProyectoCuentaUpdate.setText("U");
		this.jButtonid_cuenta_contablePresuProyectoCuentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contablePresuProyectoCuentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contablePresuProyectoCuentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contablePresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contablePresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contablePresuProyectoCuentaUpdate"));


		jButtonid_cuenta_contablePresuProyectoCuentaArbol= new JButtonMe();
		jButtonid_cuenta_contablePresuProyectoCuentaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contablePresuProyectoCuentaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contablePresuProyectoCuentaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contablePresuProyectoCuentaArbol.setText("Arbol");
		jButtonid_cuenta_contablePresuProyectoCuentaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contablePresuProyectoCuentaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contablePresuProyectoCuentaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contablePresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contablePresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contablePresuProyectoCuentaArbol"));



					
		this.jLabelid_empleadoPresuProyectoCuenta = new JLabelMe();
		this.jLabelid_empleadoPresuProyectoCuenta.setText(""+PresuProyectoCuentaConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoPresuProyectoCuenta.setToolTipText("Empleado");
		this.jLabelid_empleadoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoPresuProyectoCuenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoPresuProyectoCuenta.setToolTipText(PresuProyectoCuentaConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutPresuProyectoCuenta = new GridBagLayout();
		this.jPanelid_empleadoPresuProyectoCuenta.setLayout(this.gridaBagLayoutPresuProyectoCuenta);


		jComboBoxid_empleadoPresuProyectoCuenta= new JComboBoxMe();
		jComboBoxid_empleadoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoPresuProyectoCuenta= new JButtonMe();
		this.jButtonid_empleadoPresuProyectoCuenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPresuProyectoCuenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPresuProyectoCuenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPresuProyectoCuenta.setText("Buscar");
		this.jButtonid_empleadoPresuProyectoCuenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoPresuProyectoCuenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPresuProyectoCuenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoPresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPresuProyectoCuenta"));

		this.jButtonid_empleadoPresuProyectoCuentaBusqueda= new JButtonMe();
		this.jButtonid_empleadoPresuProyectoCuentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPresuProyectoCuentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPresuProyectoCuentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoPresuProyectoCuentaBusqueda.setText("U");
		this.jButtonid_empleadoPresuProyectoCuentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoPresuProyectoCuentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPresuProyectoCuentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoPresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPresuProyectoCuentaBusqueda"));

		if(this.presuproyectocuentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoPresuProyectoCuentaBusqueda.setVisible(false);		}

		this.jButtonid_empleadoPresuProyectoCuentaUpdate= new JButtonMe();
		this.jButtonid_empleadoPresuProyectoCuentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPresuProyectoCuentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPresuProyectoCuentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoPresuProyectoCuentaUpdate.setText("U");
		this.jButtonid_empleadoPresuProyectoCuentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoPresuProyectoCuentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPresuProyectoCuentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoPresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPresuProyectoCuentaUpdate"));



					
		this.jLabelid_presu_estadoPresuProyectoCuenta = new JLabelMe();
		this.jLabelid_presu_estadoPresuProyectoCuenta.setText(""+PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUESTADO+" : *");
		this.jLabelid_presu_estadoPresuProyectoCuenta.setToolTipText("Estado");
		this.jLabelid_presu_estadoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_presu_estadoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_presu_estadoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_presu_estadoPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_presu_estadoPresuProyectoCuenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_presu_estadoPresuProyectoCuenta.setToolTipText(PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUESTADO);
		this.gridaBagLayoutPresuProyectoCuenta = new GridBagLayout();
		this.jPanelid_presu_estadoPresuProyectoCuenta.setLayout(this.gridaBagLayoutPresuProyectoCuenta);


		jComboBoxid_presu_estadoPresuProyectoCuenta= new JComboBoxMe();
		jComboBoxid_presu_estadoPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_estadoPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_estadoPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_presu_estadoPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_presu_estadoPresuProyectoCuenta= new JButtonMe();
		this.jButtonid_presu_estadoPresuProyectoCuenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_estadoPresuProyectoCuenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_estadoPresuProyectoCuenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_estadoPresuProyectoCuenta.setText("Buscar");
		this.jButtonid_presu_estadoPresuProyectoCuenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_presu_estadoPresuProyectoCuenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_estadoPresuProyectoCuenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_presu_estadoPresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_estadoPresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_estadoPresuProyectoCuenta"));

		this.jButtonid_presu_estadoPresuProyectoCuentaBusqueda= new JButtonMe();
		this.jButtonid_presu_estadoPresuProyectoCuentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_estadoPresuProyectoCuentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_estadoPresuProyectoCuentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_presu_estadoPresuProyectoCuentaBusqueda.setText("U");
		this.jButtonid_presu_estadoPresuProyectoCuentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_presu_estadoPresuProyectoCuentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_estadoPresuProyectoCuentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_presu_estadoPresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_estadoPresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_estadoPresuProyectoCuentaBusqueda"));

		if(this.presuproyectocuentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_presu_estadoPresuProyectoCuentaBusqueda.setVisible(false);		}

		this.jButtonid_presu_estadoPresuProyectoCuentaUpdate= new JButtonMe();
		this.jButtonid_presu_estadoPresuProyectoCuentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_estadoPresuProyectoCuentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_estadoPresuProyectoCuentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_presu_estadoPresuProyectoCuentaUpdate.setText("U");
		this.jButtonid_presu_estadoPresuProyectoCuentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_presu_estadoPresuProyectoCuentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_estadoPresuProyectoCuentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_presu_estadoPresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_estadoPresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_estadoPresuProyectoCuentaUpdate"));



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
		//this.jInternalFrameDetallePresuProyectoCuenta = new PresuProyectoCuentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cuenta Contable Proyecto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresuProyectoCuenta= new GridBagLayout();
		

		
		String sToolTipPresuProyectoCuenta="";
		sToolTipPresuProyectoCuenta=PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresuProyectoCuenta+="(Contabilidad.PresuProyectoCuenta)";
		}
		
		if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresuProyectoCuenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPresuProyectoCuenta = new JButtonMe();
		this.jButtonModificarPresuProyectoCuenta = new JButtonMe();
        this.jButtonActualizarPresuProyectoCuenta = new JButtonMe();
        this.jButtonEliminarPresuProyectoCuenta = new JButtonMe();
        this.jButtonCancelarPresuProyectoCuenta = new JButtonMe();
        this.jButtonGuardarCambiosPresuProyectoCuenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaPresuProyectoCuenta = new JButtonMe();
		this.jButtonCerrarPresuProyectoCuenta = new JButtonMe();
		
		this.jScrollPanelDatosPresuProyectoCuenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionPresuProyectoCuenta = new JScrollPane();
		this.jScrollPanelDatosGeneralPresuProyectoCuenta = new JScrollPane();
				
		
		
		this.jPanelCamposPresuProyectoCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPresuProyectoCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPresuProyectoCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPresuProyectoCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cuenta Contable Proyecto";
		
		if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Contable Proyectoes" + this.sPath));
		} else {
			this.jScrollPanelDatosPresuProyectoCuenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPresuProyectoCuenta.setName("jPanelCamposPresuProyectoCuenta"); 

		this.jPanelCamposOcultosPresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPresuProyectoCuenta.setName("jPanelCamposOcultosPresuProyectoCuenta"); 

        this.jPanelAccionesPresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresuProyectoCuenta.setToolTipText("Acciones");
        this.jPanelAccionesPresuProyectoCuenta.setName("Acciones"); 

		this.jPanelAccionesFormularioPresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPresuProyectoCuenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPresuProyectoCuenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPresuProyectoCuenta.setText("Nuevo");
		this.jButtonModificarPresuProyectoCuenta.setText("Editar");
        this.jButtonActualizarPresuProyectoCuenta.setText("Actualizar");
        this.jButtonEliminarPresuProyectoCuenta.setText("Eliminar");
        this.jButtonCancelarPresuProyectoCuenta.setText("Cancelar");
        this.jButtonGuardarCambiosPresuProyectoCuenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaPresuProyectoCuenta.setText("Guardar");
		this.jButtonCerrarPresuProyectoCuenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresuProyectoCuenta,"nuevo_button","Nuevo",this.presuproyectocuentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPresuProyectoCuenta,"modificar_button","Editar",this.presuproyectocuentaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPresuProyectoCuenta,"actualizar_button","Actualizar",this.presuproyectocuentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPresuProyectoCuenta,"eliminar_button","Eliminar",this.presuproyectocuentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPresuProyectoCuenta,"cancelar_button","Cancelar",this.presuproyectocuentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPresuProyectoCuenta,"guardarcambios_button","Guardar",this.presuproyectocuentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresuProyectoCuenta,"guardarcambiostabla_button","Guardar",this.presuproyectocuentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresuProyectoCuenta,"cerrar_button","Salir",this.presuproyectocuentaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPresuProyectoCuenta.setToolTipText("Nuevo"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPresuProyectoCuenta.setToolTipText("Editar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPresuProyectoCuenta.setToolTipText("Actualizar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPresuProyectoCuenta.setToolTipText("Eliminar)"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPresuProyectoCuenta.setToolTipText("Cancelar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPresuProyectoCuenta.setToolTipText("Guardar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPresuProyectoCuenta.setToolTipText("Guardar"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresuProyectoCuenta.setToolTipText("Salir"+" "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresuProyectoCuenta";
		inputMap = this.jButtonNuevoPresuProyectoCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresuProyectoCuenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresuProyectoCuenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPresuProyectoCuenta";
		inputMap = this.jButtonActualizarPresuProyectoCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPresuProyectoCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPresuProyectoCuenta"));
		
		//ELIMINAR
		sMapKey = "EliminarPresuProyectoCuenta";
		inputMap = this.jButtonEliminarPresuProyectoCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPresuProyectoCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPresuProyectoCuenta"));
		
		//CANCELAR	
		sMapKey = "CancelarPresuProyectoCuenta";
		inputMap = this.jButtonCancelarPresuProyectoCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPresuProyectoCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPresuProyectoCuenta"));
		
		//CERRAR		
		sMapKey = "CerrarPresuProyectoCuenta";
		inputMap = this.jButtonCerrarPresuProyectoCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresuProyectoCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresuProyectoCuenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresuProyectoCuenta";
		inputMap = this.jButtonGuardarCambiosTablaPresuProyectoCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresuProyectoCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresuProyectoCuenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPresuProyectoCuenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPresuProyectoCuenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPresuProyectoCuenta.setToolTipText("Nuevo PresuProyectoCuenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPresuProyectoCuenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPresuProyectoCuenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPresuProyectoCuenta.setToolTipText("Sin Cerrar Ventana PresuProyectoCuenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePresuProyectoCuenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePresuProyectoCuenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePresuProyectoCuenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPresuProyectoCuenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresuProyectoCuenta.setText("Accion");
		this.jComboBoxTiposAccionesPresuProyectoCuenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPresuProyectoCuenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPresuProyectoCuenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPresuProyectoCuenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPresuProyectoCuenta = new JLabelMe();
		
		this.jLabelAccionesPresuProyectoCuenta.setText("Acciones");		
		this.jLabelAccionesPresuProyectoCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuProyectoCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuProyectoCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPresuProyectoCuenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPresuProyectoCuenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPresuProyectoCuenta=new JTabbedPane();
		this.jTabbedPaneRelacionesPresuProyectoCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPresuProyectoCuenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPresuProyectoCuenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuProyectoCuenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuProyectoCuenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPresuProyectoCuenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresuProyectoCuenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresuProyectoCuenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPresuProyectoCuenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPresuProyectoCuenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPresuProyectoCuenta = new GridBagLayout();
		
		this.jPanelCamposPresuProyectoCuenta.setLayout(gridaBagLayoutCamposPresuProyectoCuenta);
		this.jPanelCamposOcultosPresuProyectoCuenta.setLayout(gridaBagLayoutCamposOcultosPresuProyectoCuenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPresuProyectoCuenta.add(jLabelIdPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 1;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPresuProyectoCuenta.add(jLabelidPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);


	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_presu_proyectoPresuProyectoCuenta.add(jLabelid_presu_proyectoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 2;
		this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
		this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_presu_proyectoPresuProyectoCuenta.add(jButtonid_presu_proyectoPresuProyectoCuentaBusqueda, this.gridBagConstraintsPresuProyectoCuenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 3;
		this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
		this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_presu_proyectoPresuProyectoCuenta.add(jButtonid_presu_proyectoPresuProyectoCuentaUpdate, this.gridBagConstraintsPresuProyectoCuenta);
	}

	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 1;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_presu_proyectoPresuProyectoCuenta.add(jComboBoxid_presu_proyectoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);


	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.add(jLabelid_presu_tipo_cuenta_proyectoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 2;
		this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
		this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.add(jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaBusqueda, this.gridBagConstraintsPresuProyectoCuenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 3;
		this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
		this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.add(jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaUpdate, this.gridBagConstraintsPresuProyectoCuenta);
	}

	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 1;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.add(jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);


	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoPresuProyectoCuenta.add(jLabelcodigoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 2;
		this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
		this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoPresuProyectoCuenta.add(jButtoncodigoPresuProyectoCuentaBusqueda, this.gridBagConstraintsPresuProyectoCuenta);
	}

	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 1;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoPresuProyectoCuenta.add(jTextFieldcodigoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);


	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombrePresuProyectoCuenta.add(jLabelnombrePresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 2;
		this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
		this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombrePresuProyectoCuenta.add(jButtonnombrePresuProyectoCuentaBusqueda, this.gridBagConstraintsPresuProyectoCuenta);
	}

	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 1;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombrePresuProyectoCuenta.add(jscrollPanenombrePresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);


	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contablePresuProyectoCuenta.add(jLabelid_cuenta_contablePresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	//this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 2;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contablePresuProyectoCuenta.add(jButtonid_cuenta_contablePresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	//this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 3;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contablePresuProyectoCuenta.add(jButtonid_cuenta_contablePresuProyectoCuentaArbol, this.gridBagConstraintsPresuProyectoCuenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 4;
		this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
		this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contablePresuProyectoCuenta.add(jButtonid_cuenta_contablePresuProyectoCuentaBusqueda, this.gridBagConstraintsPresuProyectoCuenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 5;
		this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
		this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contablePresuProyectoCuenta.add(jButtonid_cuenta_contablePresuProyectoCuentaUpdate, this.gridBagConstraintsPresuProyectoCuenta);
	}

	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 1;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contablePresuProyectoCuenta.add(jComboBoxid_cuenta_contablePresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);


	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoPresuProyectoCuenta.add(jLabelid_empleadoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	//this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 2;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoPresuProyectoCuenta.add(jButtonid_empleadoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 3;
		this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
		this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoPresuProyectoCuenta.add(jButtonid_empleadoPresuProyectoCuentaBusqueda, this.gridBagConstraintsPresuProyectoCuenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 4;
		this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
		this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoPresuProyectoCuenta.add(jButtonid_empleadoPresuProyectoCuentaUpdate, this.gridBagConstraintsPresuProyectoCuenta);
	}

	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 1;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoPresuProyectoCuenta.add(jComboBoxid_empleadoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);


	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaPresuProyectoCuenta.add(jLabelfechaPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 2;
		this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
		this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaPresuProyectoCuenta.add(jButtonfechaPresuProyectoCuentaBusqueda, this.gridBagConstraintsPresuProyectoCuenta);
	}

	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 1;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaPresuProyectoCuenta.add(jDateChooserfechaPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);


	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorPresuProyectoCuenta.add(jLabelvalorPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 2;
		this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
		this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorPresuProyectoCuenta.add(jButtonvalorPresuProyectoCuentaBusqueda, this.gridBagConstraintsPresuProyectoCuenta);
	}

	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 1;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorPresuProyectoCuenta.add(jTextFieldvalorPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);


	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelordenPresuProyectoCuenta.add(jLabelordenPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 2;
		this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
		this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelordenPresuProyectoCuenta.add(jButtonordenPresuProyectoCuentaBusqueda, this.gridBagConstraintsPresuProyectoCuenta);
	}

	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 1;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelordenPresuProyectoCuenta.add(jTextFieldordenPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);


	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_presu_estadoPresuProyectoCuenta.add(jLabelid_presu_estadoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 2;
		this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
		this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_presu_estadoPresuProyectoCuenta.add(jButtonid_presu_estadoPresuProyectoCuentaBusqueda, this.gridBagConstraintsPresuProyectoCuenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 3;
		this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
		this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_presu_estadoPresuProyectoCuenta.add(jButtonid_presu_estadoPresuProyectoCuentaUpdate, this.gridBagConstraintsPresuProyectoCuenta);
	}

	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 1;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_presu_estadoPresuProyectoCuenta.add(jComboBoxid_presu_estadoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);


	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionPresuProyectoCuenta.add(jLabeldescripcionPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 2;
		this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
		this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionPresuProyectoCuenta.add(jButtondescripcionPresuProyectoCuentaBusqueda, this.gridBagConstraintsPresuProyectoCuenta);
	}

	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = 1;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionPresuProyectoCuenta.add(jscrollPanedescripcionPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = iYPanelCamposPresuProyectoCuenta;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = iXPanelCamposPresuProyectoCuenta++;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuProyectoCuenta.add(this.jPanelidPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	if(iXPanelCamposPresuProyectoCuenta % 1==0) {
		iXPanelCamposPresuProyectoCuenta=0;
		iYPanelCamposPresuProyectoCuenta++;
	}
	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = iYPanelCamposPresuProyectoCuenta;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = iXPanelCamposPresuProyectoCuenta++;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuProyectoCuenta.add(this.jPanelid_presu_proyectoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	if(iXPanelCamposPresuProyectoCuenta % 1==0) {
		iXPanelCamposPresuProyectoCuenta=0;
		iYPanelCamposPresuProyectoCuenta++;
	}
	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = iYPanelCamposPresuProyectoCuenta;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = iXPanelCamposPresuProyectoCuenta++;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuProyectoCuenta.add(this.jPanelid_presu_tipo_cuenta_proyectoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	if(iXPanelCamposPresuProyectoCuenta % 1==0) {
		iXPanelCamposPresuProyectoCuenta=0;
		iYPanelCamposPresuProyectoCuenta++;
	}
	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = iYPanelCamposPresuProyectoCuenta;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = iXPanelCamposPresuProyectoCuenta++;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuProyectoCuenta.add(this.jPanelcodigoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	if(iXPanelCamposPresuProyectoCuenta % 1==0) {
		iXPanelCamposPresuProyectoCuenta=0;
		iYPanelCamposPresuProyectoCuenta++;
	}
	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = iYPanelCamposPresuProyectoCuenta;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = iXPanelCamposPresuProyectoCuenta++;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuProyectoCuenta.add(this.jPanelnombrePresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	if(iXPanelCamposPresuProyectoCuenta % 1==0) {
		iXPanelCamposPresuProyectoCuenta=0;
		iYPanelCamposPresuProyectoCuenta++;
	}
	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = iYPanelCamposPresuProyectoCuenta;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = iXPanelCamposPresuProyectoCuenta++;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuProyectoCuenta.add(this.jPanelid_cuenta_contablePresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	if(iXPanelCamposPresuProyectoCuenta % 1==0) {
		iXPanelCamposPresuProyectoCuenta=0;
		iYPanelCamposPresuProyectoCuenta++;
	}
	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = iYPanelCamposPresuProyectoCuenta;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = iXPanelCamposPresuProyectoCuenta++;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuProyectoCuenta.add(this.jPanelid_empleadoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	if(iXPanelCamposPresuProyectoCuenta % 1==0) {
		iXPanelCamposPresuProyectoCuenta=0;
		iYPanelCamposPresuProyectoCuenta++;
	}
	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = iYPanelCamposPresuProyectoCuenta;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = iXPanelCamposPresuProyectoCuenta++;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuProyectoCuenta.add(this.jPanelfechaPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	if(iXPanelCamposPresuProyectoCuenta % 1==0) {
		iXPanelCamposPresuProyectoCuenta=0;
		iYPanelCamposPresuProyectoCuenta++;
	}
	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = iYPanelCamposPresuProyectoCuenta;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = iXPanelCamposPresuProyectoCuenta++;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuProyectoCuenta.add(this.jPanelvalorPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	if(iXPanelCamposPresuProyectoCuenta % 1==0) {
		iXPanelCamposPresuProyectoCuenta=0;
		iYPanelCamposPresuProyectoCuenta++;
	}
	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = iYPanelCamposPresuProyectoCuenta;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = iXPanelCamposPresuProyectoCuenta++;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuProyectoCuenta.add(this.jPanelordenPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	if(iXPanelCamposPresuProyectoCuenta % 1==0) {
		iXPanelCamposPresuProyectoCuenta=0;
		iYPanelCamposPresuProyectoCuenta++;
	}
	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = iYPanelCamposPresuProyectoCuenta;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = iXPanelCamposPresuProyectoCuenta++;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuProyectoCuenta.add(this.jPanelid_presu_estadoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	if(iXPanelCamposPresuProyectoCuenta % 1==0) {
		iXPanelCamposPresuProyectoCuenta=0;
		iYPanelCamposPresuProyectoCuenta++;
	}
	this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuProyectoCuenta.gridy = iYPanelCamposPresuProyectoCuenta;
	this.gridBagConstraintsPresuProyectoCuenta.gridx = iXPanelCamposPresuProyectoCuenta++;
	this.gridBagConstraintsPresuProyectoCuenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuProyectoCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuProyectoCuenta.add(this.jPaneldescripcionPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);



	if(iXPanelCamposPresuProyectoCuenta % 1==0) {
		iXPanelCamposPresuProyectoCuenta=0;
		iYPanelCamposPresuProyectoCuenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesPresuProyectoCuenta= new GridBagLayout();
		this.jPanelAccionesPresuProyectoCuenta.setLayout(gridaBagLayoutAccionesPresuProyectoCuenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPresuProyectoCuenta= new GridBagLayout();
		this.jPanelAccionesFormularioPresuProyectoCuenta.setLayout(gridaBagLayoutAccionesFormularioPresuProyectoCuenta);
		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresuProyectoCuenta.add(this.jComboBoxTiposAccionesFormularioPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);

		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresuProyectoCuenta.add(this.jCheckBoxPostAccionNuevoPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.presuproyectocuentaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresuProyectoCuenta.add(this.jCheckBoxPostAccionSinCerrarPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.presuproyectocuentaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresuProyectoCuenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresuProyectoCuenta.add(this.jCheckBoxPostAccionSinMensajePresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesPresuProyectoCuenta.add(this.jButtonModificarPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);							

		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;
		this.gridBagConstraintsPresuProyectoCuenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesPresuProyectoCuenta.add(this.jButtonEliminarPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		
			
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresuProyectoCuenta.add(this.jButtonActualizarPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);


		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresuProyectoCuenta.add(this.jButtonGuardarCambiosPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);	
		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.gridy = 0;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesPresuProyectoCuenta.add(this.jButtonCancelarPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresuProyectoCuenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresuProyectoCuenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();						
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;		
			//this.gridBagConstraintsPresuProyectoCuenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresuProyectoCuenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresuProyectoCuenta.gridx =0;
		this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresuProyectoCuenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PresuProyectoCuentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePresuProyectoCuenta = new PresuProyectoCuentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cuenta Contable Proyecto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cuenta Contable Proyecto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cuenta Contable Proyecto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PresuProyectoCuentaModel presuproyectocuentaModel=new PresuProyectoCuentaModel(this);
			
			//SI USARA CLASE INTERNA
			//PresuProyectoCuentaModel.PresuProyectoCuentaFocusTraversalPolicy presuproyectocuentaFocusTraversalPolicy = presuproyectocuentaModel.new PresuProyectoCuentaFocusTraversalPolicy(this);
			
			//presuproyectocuentaFocusTraversalPolicy.setpresuproyectocuentaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(presuproyectocuentaModel);
			
			
			this.jContentPaneDetallePresuProyectoCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePresuProyectoCuenta = new GridBagLayout();	
			this.jContentPaneDetallePresuProyectoCuenta.setLayout(gridaBagLayoutDetallePresuProyectoCuenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresuProyectoCuenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
				this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
					
				
				this.jContentPaneDetallePresuProyectoCuenta.add(jTtoolBarDetallePresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);								
				
}
			
			this.jScrollPanelDatosEdicionPresuProyectoCuenta=   new JScrollPane(jContentPaneDetallePresuProyectoCuenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresuProyectoCuenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuProyectoCuenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuProyectoCuenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPresuProyectoCuenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresuProyectoCuenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuProyectoCuenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuProyectoCuenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
	        
			this.jContentPaneDetallePresuProyectoCuenta.add(jPanelCamposPresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);
			
			
			
			
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
						&& presuproyectocuentaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFramePresuAsignacion(this.puedeCargarPorPartePresuAsignacion,false,-1);
					
					if(this.presuproyectocuentaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPresuProyectoCuenta= new GridBagConstraints();
						this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
						this.jContentPaneDetallePresuProyectoCuenta.add(this.jTabbedPaneRelacionesPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPresuProyectoCuenta.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFramePresuAsignacion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPresuProyectoCuenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
					this.gridBagConstraintsPresuProyectoCuenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
					
				
					this.jContentPaneDetallePresuProyectoCuenta.add(jPanelCamposOcultosPresuProyectoCuenta, gridBagConstraintsPresuProyectoCuenta);
				
					this.jPanelCamposOcultosPresuProyectoCuenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
	        this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePresuProyectoCuenta.add(this.jPanelAccionesFormularioPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);							
			
			
			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
	        this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
	        
			
			this.jContentPaneDetallePresuProyectoCuenta.add(this.jPanelAccionesPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPresuProyectoCuenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPresuProyectoCuenta=   new JScrollPane(this.jPanelCamposPresuProyectoCuenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresuProyectoCuenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuProyectoCuenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuProyectoCuenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
			this.gridBagConstraintsPresuProyectoCuenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPresuProyectoCuenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPresuProyectoCuenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);			
			
			this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
			this.gridBagConstraintsPresuProyectoCuenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
			
			
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		
			
		this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
		this.gridBagConstraintsPresuProyectoCuenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresuProyectoCuenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresuProyectoCuenta, this.gridBagConstraintsPresuProyectoCuenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPresuProyectoCuenta;//jContentPane;
		
		return jScrollPanelDatosEdicionPresuProyectoCuenta;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFramePresuAsignacion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.presuasignacionSessionBean=new PresuAsignacionSessionBean();
		this.presuasignacionSessionBean.setConGuardarRelaciones(false);
		this.presuasignacionSessionBean.setEsGuardarRelacionado(true);

		this.presuasignacionBeanSwingJInternalFrame=null;//new PresuAsignacionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.presuasignacionBeanSwingJInternalFramePopup=new PresuAsignacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.presuasignacionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.presuasignacionSessionBean.getEsGuardarRelacionado()) {

				PresuAsignacionJInternalFrame.STIPO_TAMANIO_GENERAL=PresuProyectoCuentaJInternalFrame.STIPO_TAMANIO_GENERAL;
				PresuAsignacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PresuProyectoCuentaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.presuasignacionSessionBean.setEsGuardarRelacionado(true);

				this.presuasignacionBeanSwingJInternalFrame=new PresuAsignacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.presuasignacionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.presuasignacionBeanSwingJInternalFrame.setpresuasignacionSessionBean(this.presuasignacionSessionBean);

				//this.gridBagConstraintsPresuProyectoCuenta = new GridBagConstraints();
				//this.gridBagConstraintsPresuProyectoCuenta.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPresuProyectoCuenta.gridx = 0;
				//this.jContentPaneDetallePresuProyectoCuenta.add(this.presuasignacionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPresuProyectoCuenta);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPresuProyectoCuenta.add("Asignacion Presupuestoes",this.presuasignacionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPresuProyectoCuenta.setComponentAt(iIndexTab,this.presuasignacionBeanSwingJInternalFrame.getContentPane());
				}

				//PresuAsignacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.presuasignacionSessionBean.setEsGuardarRelacionado(false);
				this.presuasignacionBeanSwingJInternalFrame=null;//new PresuAsignacionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePresuAsignacion) {
					this.jTabbedPaneRelacionesPresuProyectoCuenta.add("Asignacion Presupuestoes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPresuAsignacionBeanSwingJInternalFrame(List<PresuProyectoCuenta> presuproyectocuentas,PresuProyectoCuenta presuproyectocuenta,PresuAsignacionBeanSwingJInternalFrame presuasignacionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//presuasignacionBeanSwingJInternalFrame=new PresuAsignacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					presuasignacionBeanSwingJInternalFrame.getPresuAsignacionLogic().setConnexion(this.presuproyectocuentaLogic.getConnexion());

					presuasignacionBeanSwingJInternalFrame.setpresuproyectocuentasForeignKey(presuproyectocuentas);
					presuasignacionBeanSwingJInternalFrame.setpresuproyectocuentaForeignKey(presuproyectocuenta);
					presuasignacionBeanSwingJInternalFrame.presuasignacionSessionBean.setisBusquedaDesdeForeignKeySesionPresuProyectoCuenta(true);
					presuasignacionBeanSwingJInternalFrame.presuasignacionSessionBean.setlidPresuProyectoCuentaActual(presuproyectocuenta.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					presuasignacionBeanSwingJInternalFrame.cargarCombosForeignKeyPresuAsignacion(presuasignacionBeanSwingJInternalFrame.isCargarCombosDependencia);
					presuasignacionBeanSwingJInternalFrame.setVisibilidadBusquedasParaPresuProyectoCuenta(true);
					presuasignacionBeanSwingJInternalFrame.setid_presu_proyecto_cuentaFK_IdPresuProyectoCuenta(presuproyectocuenta.getId());

					if(!this.conCargarFormDetalle) {
						presuasignacionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					presuasignacionBeanSwingJInternalFrame.setSelectedItemCombosFramePresuProyectoCuentaForeignKey(presuproyectocuenta,1,false,true,true);
					presuasignacionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					presuasignacionBeanSwingJInternalFrame.procesarBusqueda("FK_IdPresuProyectoCuenta");
					presuasignacionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPresuProyectoCuenta");
					presuasignacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresuAsignacion(true);
					presuasignacionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPresuAsignacion("n",presuasignacionBeanSwingJInternalFrame.isGuardarCambiosEnLote, presuasignacionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					presuasignacionBeanSwingJInternalFrame.setAutoscrolls(true);
					presuasignacionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						presuasignacionBeanSwingJInternalFrame.actualizarEstadoPanelsPresuAsignacion("relacionado");
					} else {
						presuasignacionBeanSwingJInternalFrame.actualizarEstadoPanelsPresuAsignacion("no_relacionado");
					}

					presuasignacionBeanSwingJInternalFrame.getjButtonRecargarInformacionPresuAsignacion().setVisible(false);

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
