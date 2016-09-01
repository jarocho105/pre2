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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.DetalleMensajeCorreoInvenConstantesFunciones;

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
public class DetalleMensajeCorreoInvenDetalleFormJInternalFrame extends DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleMensajeCorreoInven;
	
	protected JMenuBar jmenuBarDetalleDetalleMensajeCorreoInven;
	
	protected JMenu jmenuDetalleDetalleMensajeCorreoInven;
	protected JMenu jmenuDetalleArchivoDetalleMensajeCorreoInven;
	protected JMenu jmenuDetalleAccionesDetalleMensajeCorreoInven;
	protected JMenu jmenuDetalleDatosDetalleMensajeCorreoInven;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleMensajeCorreoInven;	
	protected GridBagConstraints gridBagConstraintsDetalleMensajeCorreoInven;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleMensajeCorreoInven;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected MensajeCorreoInvenBeanSwingJInternalFrame mensajecorreoinvenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mensajecorreoinven="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public DetalleMensajeCorreoInvenSessionBean detallemensajecorreoinvenSessionBean;
	
	
	
	
	public MensajeCorreoInvenSessionBean mensajecorreoinvenSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;	
	
	public DetalleMensajeCorreoInvenLogic detallemensajecorreoinvenLogic;
	
	public JScrollPane jScrollPanelDatosDetalleMensajeCorreoInven;
	public JScrollPane jScrollPanelDatosEdicionDetalleMensajeCorreoInven;
	public JScrollPane jScrollPanelDatosGeneralDetalleMensajeCorreoInven;
	
	protected JPanel jPanelCamposDetalleMensajeCorreoInven;    
	protected JPanel jPanelCamposOcultosDetalleMensajeCorreoInven;    	
	protected JPanel jPanelAccionesDetalleMensajeCorreoInven;
	protected JPanel jPanelAccionesFormularioDetalleMensajeCorreoInven;
    
	
	
	protected Integer iXPanelCamposDetalleMensajeCorreoInven=0;
	protected Integer iYPanelCamposDetalleMensajeCorreoInven=0;
	
	protected Integer iXPanelCamposOcultosDetalleMensajeCorreoInven=0;
	protected Integer iYPanelCamposOcultosDetalleMensajeCorreoInven=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleMensajeCorreoInven;
	public JButton jButtonModificarDetalleMensajeCorreoInven;
	public JButton jButtonActualizarDetalleMensajeCorreoInven;
    public JButton jButtonEliminarDetalleMensajeCorreoInven;
	public JButton jButtonCancelarDetalleMensajeCorreoInven;
    public JButton jButtonGuardarCambiosDetalleMensajeCorreoInven;
	public JButton jButtonGuardarCambiosTablaDetalleMensajeCorreoInven;
	protected JButton jButtonCerrarDetalleMensajeCorreoInven;
	
	
	protected JButton jButtonProcesarInformacionDetalleMensajeCorreoInven;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleMensajeCorreoInven;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleMensajeCorreoInven;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleMensajeCorreoInven;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleMensajeCorreoInven;
	protected JButton jButtonModificarToolBarDetalleMensajeCorreoInven;
	protected JButton jButtonActualizarToolBarDetalleMensajeCorreoInven;
    protected JButton jButtonEliminarToolBarDetalleMensajeCorreoInven;
	protected JButton jButtonCancelarToolBarDetalleMensajeCorreoInven;
    protected JButton jButtonGuardarCambiosToolBarDetalleMensajeCorreoInven;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleMensajeCorreoInven;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleMensajeCorreoInven;
	protected JButton jButtonCerrarToolBarDetalleMensajeCorreoInven;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleMensajeCorreoInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemModificarDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemActualizarDetalleMensajeCorreoInven;
    protected JMenuItem jMenuItemEliminarDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemCancelarDetalleMensajeCorreoInven;
    protected JMenuItem jMenuItemGuardarCambiosDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemCerrarDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemDetalleCerrarDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleMensajeCorreoInven;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleMensajeCorreoInven;
	protected JMenuItem jMenuItemMostrarOcultarDetalleMensajeCorreoInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleMensajeCorreoInven;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleMensajeCorreoInven;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleMensajeCorreoInven;
	public JLabel jLabelIdDetalleMensajeCorreoInven;
	public JLabel jLabelidDetalleMensajeCorreoInven;
	public JButton jButtonidDetalleMensajeCorreoInvenBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoDetalleMensajeCorreoInven;
	public JLabel jLabelesta_activoDetalleMensajeCorreoInven;
	public JCheckBox jCheckBoxesta_activoDetalleMensajeCorreoInven;
	public JButton jButtonesta_activoDetalleMensajeCorreoInvenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mensaje_correo_invenDetalleMensajeCorreoInven;
	public JLabel jLabelid_mensaje_correo_invenDetalleMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven;
	public JButton jButtonid_mensaje_correo_invenDetalleMensajeCorreoInven= new JButtonMe();
	public JButton jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenUpdate= new JButtonMe();
	public JButton jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaDetalleMensajeCorreoInven;
	public JLabel jLabelid_empresaDetalleMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleMensajeCorreoInven;
	public JButton jButtonid_empresaDetalleMensajeCorreoInven= new JButtonMe();
	public JButton jButtonid_empresaDetalleMensajeCorreoInvenUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleMensajeCorreoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleMensajeCorreoInven;
	public JLabel jLabelid_sucursalDetalleMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleMensajeCorreoInven;
	public JButton jButtonid_sucursalDetalleMensajeCorreoInven= new JButtonMe();
	public JButton jButtonid_sucursalDetalleMensajeCorreoInvenUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleMensajeCorreoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloDetalleMensajeCorreoInven;
	public JLabel jLabelid_moduloDetalleMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloDetalleMensajeCorreoInven;
	public JButton jButtonid_moduloDetalleMensajeCorreoInven= new JButtonMe();
	public JButton jButtonid_moduloDetalleMensajeCorreoInvenUpdate= new JButtonMe();
	public JButton jButtonid_moduloDetalleMensajeCorreoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioDetalleMensajeCorreoInven;
	public JLabel jLabelid_usuarioDetalleMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioDetalleMensajeCorreoInven;
	public JButton jButtonid_usuarioDetalleMensajeCorreoInven= new JButtonMe();
	public JButton jButtonid_usuarioDetalleMensajeCorreoInvenUpdate= new JButtonMe();
	public JButton jButtonid_usuarioDetalleMensajeCorreoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoDetalleMensajeCorreoInven;
	public JLabel jLabelid_empleadoDetalleMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoDetalleMensajeCorreoInven;
	public JButton jButtonid_empleadoDetalleMensajeCorreoInven= new JButtonMe();
	public JButton jButtonid_empleadoDetalleMensajeCorreoInvenUpdate= new JButtonMe();
	public JButton jButtonid_empleadoDetalleMensajeCorreoInvenBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleMensajeCorreoInven;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleMensajeCorreoInvenDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleMensajeCorreoInven=new JPanel();
				this.jPanelAccionesFormularioDetalleMensajeCorreoInven=new JPanel();
				this.jmenuBarDetalleDetalleMensajeCorreoInven=new JMenuBar();
				this.jTtoolBarDetalleDetalleMensajeCorreoInven=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleMensajeCorreoInvenDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleMensajeCorreoInvenDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleMensajeCorreoInvenDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleMensajeCorreoInvenDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleMensajeCorreoInvenDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleMensajeCorreoInven() {
		return this.jButtonActualizarToolBarDetalleMensajeCorreoInven;
	}
	
	public JButton getjButtonEliminarToolBarDetalleMensajeCorreoInven() {
		return this.jButtonEliminarToolBarDetalleMensajeCorreoInven;
	}
	
	public JButton getjButtonCancelarToolBarDetalleMensajeCorreoInven() {
		return this.jButtonCancelarToolBarDetalleMensajeCorreoInven;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleMensajeCorreoInven() {
		return this.jButtonProcesarInformacionDetalleMensajeCorreoInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleMensajeCorreoInven)	{
		this.jButtonProcesarInformacionDetalleMensajeCorreoInven = jButtonProcesarInformacionDetalleMensajeCorreoInven;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleMensajeCorreoInven() {
		return this.jComboBoxTiposAccionesDetalleMensajeCorreoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleMensajeCorreoInven(
			JComboBox jComboBoxTiposRelacionesDetalleMensajeCorreoInven) {
		this.jComboBoxTiposRelacionesDetalleMensajeCorreoInven = jComboBoxTiposRelacionesDetalleMensajeCorreoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleMensajeCorreoInven(
			JComboBox jComboBoxTiposAccionesDetalleMensajeCorreoInven) {
		this.jComboBoxTiposAccionesDetalleMensajeCorreoInven = jComboBoxTiposAccionesDetalleMensajeCorreoInven;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven() {
		return this.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven(
			JComboBox jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven) {
		this.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven = jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallemensajecorreoinvenSessionBean=new DetalleMensajeCorreoInvenSessionBean();
		
		this.detallemensajecorreoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallemensajecorreoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleMensajeCorreoInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Mensaje Correo Inven MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleMensajeCorreoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleMensajeCorreoInven= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleMensajeCorreoInven=new JButtonMe();
				this.jButtonModificarToolBarDetalleMensajeCorreoInven=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleMensajeCorreoInven,this.jTtoolBarDetalleDetalleMensajeCorreoInven,
							"actualizar","actualizar","Actualizar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleMensajeCorreoInven,this.jTtoolBarDetalleDetalleMensajeCorreoInven,
							"eliminar","eliminar","Eliminar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleMensajeCorreoInven,this.jTtoolBarDetalleDetalleMensajeCorreoInven,
							"cancelar","cancelar","Cancelar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleMensajeCorreoInven,this.jTtoolBarDetalleDetalleMensajeCorreoInven,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleMensajeCorreoInven=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleMensajeCorreoInven=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleMensajeCorreoInven=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleMensajeCorreoInven=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleMensajeCorreoInven=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleMensajeCorreoInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleMensajeCorreoInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleMensajeCorreoInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleMensajeCorreoInven= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleMensajeCorreoInven.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleMensajeCorreoInven,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleMensajeCorreoInven= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleMensajeCorreoInven.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleMensajeCorreoInven,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleMensajeCorreoInven= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleMensajeCorreoInven.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleMensajeCorreoInven,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleMensajeCorreoInven= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleMensajeCorreoInven.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleMensajeCorreoInven,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleMensajeCorreoInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleMensajeCorreoInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleMensajeCorreoInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleMensajeCorreoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleMensajeCorreoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleMensajeCorreoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleMensajeCorreoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleMensajeCorreoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleMensajeCorreoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleMensajeCorreoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleMensajeCorreoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleMensajeCorreoInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleMensajeCorreoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleMensajeCorreoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleMensajeCorreoInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleMensajeCorreoInven.add(this.jMenuItemDetalleCerrarDetalleMensajeCorreoInven);
		
		this.jmenuDetalleAccionesDetalleMensajeCorreoInven.add(this.jMenuItemActualizarDetalleMensajeCorreoInven);
		this.jmenuDetalleAccionesDetalleMensajeCorreoInven.add(this.jMenuItemEliminarDetalleMensajeCorreoInven);
		this.jmenuDetalleAccionesDetalleMensajeCorreoInven.add(this.jMenuItemCancelarDetalleMensajeCorreoInven);		
		
		//this.jmenuDetalleDatosDetalleMensajeCorreoInven.add(this.jMenuItemDetalleAbrirOrderByDetalleMensajeCorreoInven);				
		this.jmenuDetalleDatosDetalleMensajeCorreoInven.add(this.jMenuItemDetalleMostarOcultarDetalleMensajeCorreoInven);				
				
		//this.jmenuDetalleAccionesDetalleMensajeCorreoInven.add(this.jMenuItemGuardarCambiosDetalleMensajeCorreoInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleMensajeCorreoInven.add(this.jmenuDetalleArchivoDetalleMensajeCorreoInven);		
		this.jmenuBarDetalleDetalleMensajeCorreoInven.add(this.jmenuDetalleAccionesDetalleMensajeCorreoInven);		
		this.jmenuBarDetalleDetalleMensajeCorreoInven.add(this.jmenuDetalleDatosDetalleMensajeCorreoInven);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleMensajeCorreoInven);				
	}
	
	
	public void inicializarElementosCamposDetalleMensajeCorreoInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleMensajeCorreoInven = new JLabelMe();
		jLabelIdDetalleMensajeCorreoInven.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleMensajeCorreoInven = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleMensajeCorreoInven.setToolTipText(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleMensajeCorreoInven= new GridBagLayout();

		this.jPanelidDetalleMensajeCorreoInven.setLayout(this.gridaBagLayoutDetalleMensajeCorreoInven);

		jLabelidDetalleMensajeCorreoInven = new JLabel();
		jLabelidDetalleMensajeCorreoInven.setText("Id");

		jLabelidDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelesta_activoDetalleMensajeCorreoInven = new JLabelMe();
		this.jLabelesta_activoDetalleMensajeCorreoInven.setText(""+DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoDetalleMensajeCorreoInven.setToolTipText("Esta Activo");
		this.jLabelesta_activoDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoDetalleMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoDetalleMensajeCorreoInven.setToolTipText(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutDetalleMensajeCorreoInven = new GridBagLayout();
		this.jPanelesta_activoDetalleMensajeCorreoInven.setLayout(this.gridaBagLayoutDetalleMensajeCorreoInven);


		jCheckBoxesta_activoDetalleMensajeCorreoInven= new JCheckBoxMe();
		jCheckBoxesta_activoDetalleMensajeCorreoInven.setEnabled(false);

		jCheckBoxesta_activoDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoDetalleMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtonesta_activoDetalleMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoDetalleMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoDetalleMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoDetalleMensajeCorreoInvenBusqueda.setText("U");
		this.jButtonesta_activoDetalleMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoDetalleMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoDetalleMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoDetalleMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoDetalleMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoDetalleMensajeCorreoInvenBusqueda"));

		if(this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoDetalleMensajeCorreoInvenBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleMensajeCorreoInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_mensaje_correo_invenDetalleMensajeCorreoInven = new JLabelMe();
		this.jLabelid_mensaje_correo_invenDetalleMensajeCorreoInven.setText(""+DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN+" : *");
		this.jLabelid_mensaje_correo_invenDetalleMensajeCorreoInven.setToolTipText("Mensaje Correo Inven");
		this.jLabelid_mensaje_correo_invenDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_mensaje_correo_invenDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_mensaje_correo_invenDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mensaje_correo_invenDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mensaje_correo_invenDetalleMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mensaje_correo_invenDetalleMensajeCorreoInven.setToolTipText(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN);
		this.gridaBagLayoutDetalleMensajeCorreoInven = new GridBagLayout();
		this.jPanelid_mensaje_correo_invenDetalleMensajeCorreoInven.setLayout(this.gridaBagLayoutDetalleMensajeCorreoInven);


		jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven= new JComboBoxMe();
		jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInven= new JButtonMe();
		this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInven.setText("Buscar");
		this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mensaje_correo_invenDetalleMensajeCorreoInven"));

		this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenBusqueda.setText("U");
		this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mensaje_correo_invenDetalleMensajeCorreoInvenBusqueda"));

		if(this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenBusqueda.setVisible(false);		}

		this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenUpdate= new JButtonMe();
		this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenUpdate.setText("U");
		this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mensaje_correo_invenDetalleMensajeCorreoInvenUpdate"));



					
		this.jLabelid_empresaDetalleMensajeCorreoInven = new JLabelMe();
		this.jLabelid_empresaDetalleMensajeCorreoInven.setText(""+DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleMensajeCorreoInven.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleMensajeCorreoInven.setToolTipText(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleMensajeCorreoInven = new GridBagLayout();
		this.jPanelid_empresaDetalleMensajeCorreoInven.setLayout(this.gridaBagLayoutDetalleMensajeCorreoInven);


		jComboBoxid_empresaDetalleMensajeCorreoInven= new JComboBoxMe();
		jComboBoxid_empresaDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleMensajeCorreoInven.setEnabled(false);

		this.jButtonid_empresaDetalleMensajeCorreoInven= new JButtonMe();
		this.jButtonid_empresaDetalleMensajeCorreoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleMensajeCorreoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleMensajeCorreoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleMensajeCorreoInven.setText("Buscar");
		this.jButtonid_empresaDetalleMensajeCorreoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleMensajeCorreoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleMensajeCorreoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleMensajeCorreoInven"));

		this.jButtonid_empresaDetalleMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleMensajeCorreoInvenBusqueda.setText("U");
		this.jButtonid_empresaDetalleMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleMensajeCorreoInvenBusqueda"));

		if(this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleMensajeCorreoInvenBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleMensajeCorreoInvenUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleMensajeCorreoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleMensajeCorreoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleMensajeCorreoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleMensajeCorreoInvenUpdate.setText("U");
		this.jButtonid_empresaDetalleMensajeCorreoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleMensajeCorreoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleMensajeCorreoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleMensajeCorreoInvenUpdate"));



					
		this.jLabelid_sucursalDetalleMensajeCorreoInven = new JLabelMe();
		this.jLabelid_sucursalDetalleMensajeCorreoInven.setText(""+DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleMensajeCorreoInven.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleMensajeCorreoInven.setToolTipText(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleMensajeCorreoInven = new GridBagLayout();
		this.jPanelid_sucursalDetalleMensajeCorreoInven.setLayout(this.gridaBagLayoutDetalleMensajeCorreoInven);


		jComboBoxid_sucursalDetalleMensajeCorreoInven= new JComboBoxMe();
		jComboBoxid_sucursalDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleMensajeCorreoInven.setEnabled(false);

		this.jButtonid_sucursalDetalleMensajeCorreoInven= new JButtonMe();
		this.jButtonid_sucursalDetalleMensajeCorreoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleMensajeCorreoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleMensajeCorreoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleMensajeCorreoInven.setText("Buscar");
		this.jButtonid_sucursalDetalleMensajeCorreoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleMensajeCorreoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleMensajeCorreoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleMensajeCorreoInven"));

		this.jButtonid_sucursalDetalleMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleMensajeCorreoInvenBusqueda.setText("U");
		this.jButtonid_sucursalDetalleMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleMensajeCorreoInvenBusqueda"));

		if(this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleMensajeCorreoInvenBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleMensajeCorreoInvenUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleMensajeCorreoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleMensajeCorreoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleMensajeCorreoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleMensajeCorreoInvenUpdate.setText("U");
		this.jButtonid_sucursalDetalleMensajeCorreoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleMensajeCorreoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleMensajeCorreoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleMensajeCorreoInvenUpdate"));



					
		this.jLabelid_moduloDetalleMensajeCorreoInven = new JLabelMe();
		this.jLabelid_moduloDetalleMensajeCorreoInven.setText(""+DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloDetalleMensajeCorreoInven.setToolTipText("Modulo");
		this.jLabelid_moduloDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloDetalleMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloDetalleMensajeCorreoInven.setToolTipText(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutDetalleMensajeCorreoInven = new GridBagLayout();
		this.jPanelid_moduloDetalleMensajeCorreoInven.setLayout(this.gridaBagLayoutDetalleMensajeCorreoInven);


		jComboBoxid_moduloDetalleMensajeCorreoInven= new JComboBoxMe();
		jComboBoxid_moduloDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloDetalleMensajeCorreoInven.setEnabled(false);

		this.jButtonid_moduloDetalleMensajeCorreoInven= new JButtonMe();
		this.jButtonid_moduloDetalleMensajeCorreoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDetalleMensajeCorreoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDetalleMensajeCorreoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDetalleMensajeCorreoInven.setText("Buscar");
		this.jButtonid_moduloDetalleMensajeCorreoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloDetalleMensajeCorreoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDetalleMensajeCorreoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloDetalleMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDetalleMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDetalleMensajeCorreoInven"));

		this.jButtonid_moduloDetalleMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtonid_moduloDetalleMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloDetalleMensajeCorreoInvenBusqueda.setText("U");
		this.jButtonid_moduloDetalleMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloDetalleMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDetalleMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloDetalleMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDetalleMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDetalleMensajeCorreoInvenBusqueda"));

		if(this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloDetalleMensajeCorreoInvenBusqueda.setVisible(false);		}

		this.jButtonid_moduloDetalleMensajeCorreoInvenUpdate= new JButtonMe();
		this.jButtonid_moduloDetalleMensajeCorreoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleMensajeCorreoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleMensajeCorreoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloDetalleMensajeCorreoInvenUpdate.setText("U");
		this.jButtonid_moduloDetalleMensajeCorreoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloDetalleMensajeCorreoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDetalleMensajeCorreoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloDetalleMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDetalleMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDetalleMensajeCorreoInvenUpdate"));



					
		this.jLabelid_usuarioDetalleMensajeCorreoInven = new JLabelMe();
		this.jLabelid_usuarioDetalleMensajeCorreoInven.setText(""+DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioDetalleMensajeCorreoInven.setToolTipText("Usuario");
		this.jLabelid_usuarioDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioDetalleMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioDetalleMensajeCorreoInven.setToolTipText(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutDetalleMensajeCorreoInven = new GridBagLayout();
		this.jPanelid_usuarioDetalleMensajeCorreoInven.setLayout(this.gridaBagLayoutDetalleMensajeCorreoInven);


		jComboBoxid_usuarioDetalleMensajeCorreoInven= new JComboBoxMe();
		jComboBoxid_usuarioDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_usuarioDetalleMensajeCorreoInven= new JButtonMe();
		this.jButtonid_usuarioDetalleMensajeCorreoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioDetalleMensajeCorreoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioDetalleMensajeCorreoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioDetalleMensajeCorreoInven.setText("Buscar");
		this.jButtonid_usuarioDetalleMensajeCorreoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioDetalleMensajeCorreoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioDetalleMensajeCorreoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioDetalleMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioDetalleMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioDetalleMensajeCorreoInven"));

		this.jButtonid_usuarioDetalleMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtonid_usuarioDetalleMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDetalleMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDetalleMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioDetalleMensajeCorreoInvenBusqueda.setText("U");
		this.jButtonid_usuarioDetalleMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioDetalleMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioDetalleMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioDetalleMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioDetalleMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioDetalleMensajeCorreoInvenBusqueda"));

		if(this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioDetalleMensajeCorreoInvenBusqueda.setVisible(false);		}

		this.jButtonid_usuarioDetalleMensajeCorreoInvenUpdate= new JButtonMe();
		this.jButtonid_usuarioDetalleMensajeCorreoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDetalleMensajeCorreoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDetalleMensajeCorreoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioDetalleMensajeCorreoInvenUpdate.setText("U");
		this.jButtonid_usuarioDetalleMensajeCorreoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioDetalleMensajeCorreoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioDetalleMensajeCorreoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioDetalleMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioDetalleMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioDetalleMensajeCorreoInvenUpdate"));



					
		this.jLabelid_empleadoDetalleMensajeCorreoInven = new JLabelMe();
		this.jLabelid_empleadoDetalleMensajeCorreoInven.setText(""+DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoDetalleMensajeCorreoInven.setToolTipText("Empleado");
		this.jLabelid_empleadoDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoDetalleMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoDetalleMensajeCorreoInven.setToolTipText(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutDetalleMensajeCorreoInven = new GridBagLayout();
		this.jPanelid_empleadoDetalleMensajeCorreoInven.setLayout(this.gridaBagLayoutDetalleMensajeCorreoInven);


		jComboBoxid_empleadoDetalleMensajeCorreoInven= new JComboBoxMe();
		jComboBoxid_empleadoDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoDetalleMensajeCorreoInven= new JButtonMe();
		this.jButtonid_empleadoDetalleMensajeCorreoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoDetalleMensajeCorreoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoDetalleMensajeCorreoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoDetalleMensajeCorreoInven.setText("Buscar");
		this.jButtonid_empleadoDetalleMensajeCorreoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoDetalleMensajeCorreoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoDetalleMensajeCorreoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoDetalleMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoDetalleMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoDetalleMensajeCorreoInven"));

		this.jButtonid_empleadoDetalleMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtonid_empleadoDetalleMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoDetalleMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoDetalleMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoDetalleMensajeCorreoInvenBusqueda.setText("U");
		this.jButtonid_empleadoDetalleMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoDetalleMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoDetalleMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoDetalleMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoDetalleMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoDetalleMensajeCorreoInvenBusqueda"));

		if(this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoDetalleMensajeCorreoInvenBusqueda.setVisible(false);		}

		this.jButtonid_empleadoDetalleMensajeCorreoInvenUpdate= new JButtonMe();
		this.jButtonid_empleadoDetalleMensajeCorreoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoDetalleMensajeCorreoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoDetalleMensajeCorreoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoDetalleMensajeCorreoInvenUpdate.setText("U");
		this.jButtonid_empleadoDetalleMensajeCorreoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoDetalleMensajeCorreoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoDetalleMensajeCorreoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoDetalleMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoDetalleMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoDetalleMensajeCorreoInvenUpdate"));



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
		//this.jInternalFrameDetalleDetalleMensajeCorreoInven = new DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Mensaje Correo Inven DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleMensajeCorreoInven= new GridBagLayout();
		

		
		String sToolTipDetalleMensajeCorreoInven="";
		sToolTipDetalleMensajeCorreoInven=DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleMensajeCorreoInven+="(Inventario.DetalleMensajeCorreoInven)";
		}
		
		if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleMensajeCorreoInven+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleMensajeCorreoInven = new JButtonMe();
		this.jButtonModificarDetalleMensajeCorreoInven = new JButtonMe();
        this.jButtonActualizarDetalleMensajeCorreoInven = new JButtonMe();
        this.jButtonEliminarDetalleMensajeCorreoInven = new JButtonMe();
        this.jButtonCancelarDetalleMensajeCorreoInven = new JButtonMe();
        this.jButtonGuardarCambiosDetalleMensajeCorreoInven = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleMensajeCorreoInven = new JButtonMe();
		this.jButtonCerrarDetalleMensajeCorreoInven = new JButtonMe();
		
		this.jScrollPanelDatosDetalleMensajeCorreoInven = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleMensajeCorreoInven = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Mensaje Correo Inven";
		
		if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Mensaje Correo Invenes" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleMensajeCorreoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleMensajeCorreoInven.setName("jPanelCamposDetalleMensajeCorreoInven"); 

		this.jPanelCamposOcultosDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleMensajeCorreoInven.setName("jPanelCamposOcultosDetalleMensajeCorreoInven"); 

        this.jPanelAccionesDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleMensajeCorreoInven.setToolTipText("Acciones");
        this.jPanelAccionesDetalleMensajeCorreoInven.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleMensajeCorreoInven.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleMensajeCorreoInven.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleMensajeCorreoInven.setText("Nuevo");
		this.jButtonModificarDetalleMensajeCorreoInven.setText("Editar");
        this.jButtonActualizarDetalleMensajeCorreoInven.setText("Actualizar");
        this.jButtonEliminarDetalleMensajeCorreoInven.setText("Eliminar");
        this.jButtonCancelarDetalleMensajeCorreoInven.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleMensajeCorreoInven.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleMensajeCorreoInven.setText("Guardar");
		this.jButtonCerrarDetalleMensajeCorreoInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleMensajeCorreoInven,"nuevo_button","Nuevo",this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleMensajeCorreoInven,"modificar_button","Editar",this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleMensajeCorreoInven,"actualizar_button","Actualizar",this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleMensajeCorreoInven,"eliminar_button","Eliminar",this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleMensajeCorreoInven,"cancelar_button","Cancelar",this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleMensajeCorreoInven,"guardarcambios_button","Guardar",this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleMensajeCorreoInven,"guardarcambiostabla_button","Guardar",this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleMensajeCorreoInven,"cerrar_button","Salir",this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleMensajeCorreoInven.setToolTipText("Nuevo"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleMensajeCorreoInven.setToolTipText("Editar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleMensajeCorreoInven.setToolTipText("Actualizar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleMensajeCorreoInven.setToolTipText("Eliminar)"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleMensajeCorreoInven.setToolTipText("Cancelar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleMensajeCorreoInven.setToolTipText("Guardar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleMensajeCorreoInven.setToolTipText("Guardar"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleMensajeCorreoInven.setToolTipText("Salir"+" "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleMensajeCorreoInven";
		inputMap = this.jButtonNuevoDetalleMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleMensajeCorreoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleMensajeCorreoInven"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleMensajeCorreoInven";
		inputMap = this.jButtonActualizarDetalleMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleMensajeCorreoInven"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleMensajeCorreoInven";
		inputMap = this.jButtonEliminarDetalleMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleMensajeCorreoInven"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleMensajeCorreoInven";
		inputMap = this.jButtonCancelarDetalleMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleMensajeCorreoInven"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleMensajeCorreoInven";
		inputMap = this.jButtonCerrarDetalleMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleMensajeCorreoInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleMensajeCorreoInven";
		inputMap = this.jButtonGuardarCambiosTablaDetalleMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleMensajeCorreoInven"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleMensajeCorreoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleMensajeCorreoInven.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleMensajeCorreoInven.setToolTipText("Nuevo DetalleMensajeCorreoInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleMensajeCorreoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleMensajeCorreoInven.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleMensajeCorreoInven.setToolTipText("Sin Cerrar Ventana DetalleMensajeCorreoInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleMensajeCorreoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleMensajeCorreoInven.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleMensajeCorreoInven.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.setText("Accion");
		this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleMensajeCorreoInven = new JLabelMe();
		
		this.jLabelAccionesDetalleMensajeCorreoInven.setText("Acciones");		
		this.jLabelAccionesDetalleMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleMensajeCorreoInven();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleMensajeCorreoInven();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleMensajeCorreoInven=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleMensajeCorreoInven = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleMensajeCorreoInven = new GridBagLayout();
		
		this.jPanelCamposDetalleMensajeCorreoInven.setLayout(gridaBagLayoutCamposDetalleMensajeCorreoInven);
		this.jPanelCamposOcultosDetalleMensajeCorreoInven.setLayout(gridaBagLayoutCamposOcultosDetalleMensajeCorreoInven);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleMensajeCorreoInven.add(jLabelIdDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);



	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleMensajeCorreoInven.add(jLabelidDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);


	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mensaje_correo_invenDetalleMensajeCorreoInven.add(jLabelid_mensaje_correo_invenDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mensaje_correo_invenDetalleMensajeCorreoInven.add(jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenBusqueda, this.gridBagConstraintsDetalleMensajeCorreoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 3;
		this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mensaje_correo_invenDetalleMensajeCorreoInven.add(jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenUpdate, this.gridBagConstraintsDetalleMensajeCorreoInven);
	}

	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mensaje_correo_invenDetalleMensajeCorreoInven.add(jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);


	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleMensajeCorreoInven.add(jLabelid_empresaDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleMensajeCorreoInven.add(jButtonid_empresaDetalleMensajeCorreoInvenBusqueda, this.gridBagConstraintsDetalleMensajeCorreoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 3;
		this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleMensajeCorreoInven.add(jButtonid_empresaDetalleMensajeCorreoInvenUpdate, this.gridBagConstraintsDetalleMensajeCorreoInven);
	}

	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleMensajeCorreoInven.add(jComboBoxid_empresaDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);


	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleMensajeCorreoInven.add(jLabelid_sucursalDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleMensajeCorreoInven.add(jButtonid_sucursalDetalleMensajeCorreoInvenBusqueda, this.gridBagConstraintsDetalleMensajeCorreoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 3;
		this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleMensajeCorreoInven.add(jButtonid_sucursalDetalleMensajeCorreoInvenUpdate, this.gridBagConstraintsDetalleMensajeCorreoInven);
	}

	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleMensajeCorreoInven.add(jComboBoxid_sucursalDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);


	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloDetalleMensajeCorreoInven.add(jLabelid_moduloDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloDetalleMensajeCorreoInven.add(jButtonid_moduloDetalleMensajeCorreoInvenBusqueda, this.gridBagConstraintsDetalleMensajeCorreoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 3;
		this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloDetalleMensajeCorreoInven.add(jButtonid_moduloDetalleMensajeCorreoInvenUpdate, this.gridBagConstraintsDetalleMensajeCorreoInven);
	}

	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloDetalleMensajeCorreoInven.add(jComboBoxid_moduloDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);


	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioDetalleMensajeCorreoInven.add(jLabelid_usuarioDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioDetalleMensajeCorreoInven.add(jButtonid_usuarioDetalleMensajeCorreoInvenBusqueda, this.gridBagConstraintsDetalleMensajeCorreoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 3;
		this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioDetalleMensajeCorreoInven.add(jButtonid_usuarioDetalleMensajeCorreoInvenUpdate, this.gridBagConstraintsDetalleMensajeCorreoInven);
	}

	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioDetalleMensajeCorreoInven.add(jComboBoxid_usuarioDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);


	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoDetalleMensajeCorreoInven.add(jLabelid_empleadoDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoDetalleMensajeCorreoInven.add(jButtonid_empleadoDetalleMensajeCorreoInvenBusqueda, this.gridBagConstraintsDetalleMensajeCorreoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 3;
		this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoDetalleMensajeCorreoInven.add(jButtonid_empleadoDetalleMensajeCorreoInvenUpdate, this.gridBagConstraintsDetalleMensajeCorreoInven);
	}

	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoDetalleMensajeCorreoInven.add(jComboBoxid_empleadoDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);


	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoDetalleMensajeCorreoInven.add(jLabelesta_activoDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoDetalleMensajeCorreoInven.add(jButtonesta_activoDetalleMensajeCorreoInvenBusqueda, this.gridBagConstraintsDetalleMensajeCorreoInven);
	}

	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoDetalleMensajeCorreoInven.add(jCheckBoxesta_activoDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iYPanelCamposDetalleMensajeCorreoInven;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iXPanelCamposDetalleMensajeCorreoInven++;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleMensajeCorreoInven.add(this.jPanelidDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);



	if(iXPanelCamposDetalleMensajeCorreoInven % 1==0) {
		iXPanelCamposDetalleMensajeCorreoInven=0;
		iYPanelCamposDetalleMensajeCorreoInven++;
	}
	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iYPanelCamposDetalleMensajeCorreoInven;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iXPanelCamposDetalleMensajeCorreoInven++;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleMensajeCorreoInven.add(this.jPanelid_mensaje_correo_invenDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);



	if(iXPanelCamposDetalleMensajeCorreoInven % 1==0) {
		iXPanelCamposDetalleMensajeCorreoInven=0;
		iYPanelCamposDetalleMensajeCorreoInven++;
	}
	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iYPanelCamposDetalleMensajeCorreoInven;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iXPanelCamposDetalleMensajeCorreoInven++;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleMensajeCorreoInven.add(this.jPanelid_usuarioDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);



	if(iXPanelCamposDetalleMensajeCorreoInven % 1==0) {
		iXPanelCamposDetalleMensajeCorreoInven=0;
		iYPanelCamposDetalleMensajeCorreoInven++;
	}
	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iYPanelCamposDetalleMensajeCorreoInven;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iXPanelCamposDetalleMensajeCorreoInven++;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleMensajeCorreoInven.add(this.jPanelid_empleadoDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);



	if(iXPanelCamposDetalleMensajeCorreoInven % 1==0) {
		iXPanelCamposDetalleMensajeCorreoInven=0;
		iYPanelCamposDetalleMensajeCorreoInven++;
	}
	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iYPanelCamposDetalleMensajeCorreoInven;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iXPanelCamposDetalleMensajeCorreoInven++;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleMensajeCorreoInven.add(this.jPanelesta_activoDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);



	if(iXPanelCamposDetalleMensajeCorreoInven % 1==0) {
		iXPanelCamposDetalleMensajeCorreoInven=0;
		iYPanelCamposDetalleMensajeCorreoInven++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iYPanelCamposOcultosDetalleMensajeCorreoInven;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iXPanelCamposOcultosDetalleMensajeCorreoInven++;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMensajeCorreoInven.add(this.jPanelid_empresaDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);



	if(iXPanelCamposOcultosDetalleMensajeCorreoInven % 1==0) {
		iXPanelCamposOcultosDetalleMensajeCorreoInven=0;
		iYPanelCamposOcultosDetalleMensajeCorreoInven++;
	}
	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iYPanelCamposOcultosDetalleMensajeCorreoInven;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iXPanelCamposOcultosDetalleMensajeCorreoInven++;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMensajeCorreoInven.add(this.jPanelid_sucursalDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);



	if(iXPanelCamposOcultosDetalleMensajeCorreoInven % 1==0) {
		iXPanelCamposOcultosDetalleMensajeCorreoInven=0;
		iYPanelCamposOcultosDetalleMensajeCorreoInven++;
	}
	this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iYPanelCamposOcultosDetalleMensajeCorreoInven;
	this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iXPanelCamposOcultosDetalleMensajeCorreoInven++;
	this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMensajeCorreoInven.add(this.jPanelid_moduloDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);



	if(iXPanelCamposOcultosDetalleMensajeCorreoInven % 1==0) {
		iXPanelCamposOcultosDetalleMensajeCorreoInven=0;
		iYPanelCamposOcultosDetalleMensajeCorreoInven++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleMensajeCorreoInven= new GridBagLayout();
		this.jPanelAccionesDetalleMensajeCorreoInven.setLayout(gridaBagLayoutAccionesDetalleMensajeCorreoInven);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleMensajeCorreoInven= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleMensajeCorreoInven.setLayout(gridaBagLayoutAccionesFormularioDetalleMensajeCorreoInven);
		
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleMensajeCorreoInven.add(this.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);

		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleMensajeCorreoInven.add(this.jCheckBoxPostAccionNuevoDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detallemensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleMensajeCorreoInven.add(this.jCheckBoxPostAccionSinCerrarDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detallemensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleMensajeCorreoInven.add(this.jCheckBoxPostAccionSinMensajeDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleMensajeCorreoInven.add(this.jButtonModificarDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);							

		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleMensajeCorreoInven.add(this.jButtonEliminarDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
		
			
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;		
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleMensajeCorreoInven.add(this.jButtonActualizarDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);


		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;		
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleMensajeCorreoInven.add(this.jButtonGuardarCambiosDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);	
		
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = 0;		
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleMensajeCorreoInven.add(this.jButtonCancelarDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleMensajeCorreoInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleMensajeCorreoInven);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();						
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;		
			//this.gridBagConstraintsDetalleMensajeCorreoInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleMensajeCorreoInven.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx =0;
		this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleMensajeCorreoInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleMensajeCorreoInven = new DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Mensaje Correo Inven DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Mensaje Correo Inven DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Mensaje Correo Inven Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleMensajeCorreoInvenModel detallemensajecorreoinvenModel=new DetalleMensajeCorreoInvenModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleMensajeCorreoInvenModel.DetalleMensajeCorreoInvenFocusTraversalPolicy detallemensajecorreoinvenFocusTraversalPolicy = detallemensajecorreoinvenModel.new DetalleMensajeCorreoInvenFocusTraversalPolicy(this);
			
			//detallemensajecorreoinvenFocusTraversalPolicy.setdetallemensajecorreoinvenJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallemensajecorreoinvenModel);
			
			
			this.jContentPaneDetalleDetalleMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleMensajeCorreoInven = new GridBagLayout();	
			this.jContentPaneDetalleDetalleMensajeCorreoInven.setLayout(gridaBagLayoutDetalleDetalleMensajeCorreoInven);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleMensajeCorreoInven = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
				this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleMensajeCorreoInven.add(jTtoolBarDetalleDetalleMensajeCorreoInven, gridBagConstraintsDetalleMensajeCorreoInven);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven=   new JScrollPane(jContentPaneDetalleDetalleMensajeCorreoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleMensajeCorreoInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleMensajeCorreoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleMensajeCorreoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleMensajeCorreoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
	        
			this.jContentPaneDetalleDetalleMensajeCorreoInven.add(jPanelCamposDetalleMensajeCorreoInven, gridBagConstraintsDetalleMensajeCorreoInven);
			
			
			
			
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
						&& detallemensajecorreoinvenSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallemensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleMensajeCorreoInven= new GridBagConstraints();
						this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
						this.jContentPaneDetalleDetalleMensajeCorreoInven.add(this.jTabbedPaneRelacionesDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleMensajeCorreoInven.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleMensajeCorreoInven.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
					this.gridBagConstraintsDetalleMensajeCorreoInven.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleMensajeCorreoInven.add(jPanelCamposOcultosDetalleMensajeCorreoInven, gridBagConstraintsDetalleMensajeCorreoInven);
				
					this.jPanelCamposOcultosDetalleMensajeCorreoInven.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
	        this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleMensajeCorreoInven.add(this.jPanelAccionesFormularioDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);							
			
			
			
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
	        this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleMensajeCorreoInven.add(this.jPanelAccionesDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleMensajeCorreoInven);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven=   new JScrollPane(this.jPanelCamposDetalleMensajeCorreoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
			this.gridBagConstraintsDetalleMensajeCorreoInven.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleMensajeCorreoInven.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);			
			
			this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
			
			
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
		
			
		this.gridBagConstraintsDetalleMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMensajeCorreoInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleMensajeCorreoInven, this.gridBagConstraintsDetalleMensajeCorreoInven);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleMensajeCorreoInven;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleMensajeCorreoInven;
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
