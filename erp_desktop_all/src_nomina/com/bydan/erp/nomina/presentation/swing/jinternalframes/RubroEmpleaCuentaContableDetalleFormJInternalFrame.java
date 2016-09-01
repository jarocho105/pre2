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
import com.bydan.erp.nomina.util.RubroEmpleaCuentaContableConstantesFunciones;

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
public class RubroEmpleaCuentaContableDetalleFormJInternalFrame extends RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRubroEmpleaCuentaContable;
	
	protected JMenuBar jmenuBarDetalleRubroEmpleaCuentaContable;
	
	protected JMenu jmenuDetalleRubroEmpleaCuentaContable;
	protected JMenu jmenuDetalleArchivoRubroEmpleaCuentaContable;
	protected JMenu jmenuDetalleAccionesRubroEmpleaCuentaContable;
	protected JMenu jmenuDetalleDatosRubroEmpleaCuentaContable;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRubroEmpleaCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRubroEmpleaCuentaContable;	
	protected GridBagConstraints gridBagConstraintsRubroEmpleaCuentaContable;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional jInternalFrameDetalleRubroEmpleaCuentaContable;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rubroemplea="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";
	
	public RubroEmpleaCuentaContableSessionBean rubroempleacuentacontableSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public RubroEmpleaSessionBean rubroempleaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public EstructuraSessionBean estructuraSessionBean;	
	
	public RubroEmpleaCuentaContableLogic rubroempleacuentacontableLogic;
	
	public JScrollPane jScrollPanelDatosRubroEmpleaCuentaContable;
	public JScrollPane jScrollPanelDatosEdicionRubroEmpleaCuentaContable;
	public JScrollPane jScrollPanelDatosGeneralRubroEmpleaCuentaContable;
	
	protected JPanel jPanelCamposRubroEmpleaCuentaContable;    
	protected JPanel jPanelCamposOcultosRubroEmpleaCuentaContable;    	
	protected JPanel jPanelAccionesRubroEmpleaCuentaContable;
	protected JPanel jPanelAccionesFormularioRubroEmpleaCuentaContable;
    
	
	
	protected Integer iXPanelCamposRubroEmpleaCuentaContable=0;
	protected Integer iYPanelCamposRubroEmpleaCuentaContable=0;
	
	protected Integer iXPanelCamposOcultosRubroEmpleaCuentaContable=0;
	protected Integer iYPanelCamposOcultosRubroEmpleaCuentaContable=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRubroEmpleaCuentaContable;
	public JButton jButtonModificarRubroEmpleaCuentaContable;
	public JButton jButtonActualizarRubroEmpleaCuentaContable;
    public JButton jButtonEliminarRubroEmpleaCuentaContable;
	public JButton jButtonCancelarRubroEmpleaCuentaContable;
    public JButton jButtonGuardarCambiosRubroEmpleaCuentaContable;
	public JButton jButtonGuardarCambiosTablaRubroEmpleaCuentaContable;
	protected JButton jButtonCerrarRubroEmpleaCuentaContable;
	
	
	protected JButton jButtonProcesarInformacionRubroEmpleaCuentaContable;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRubroEmpleaCuentaContable;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRubroEmpleaCuentaContable;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRubroEmpleaCuentaContable;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRubroEmpleaCuentaContable;
	protected JButton jButtonModificarToolBarRubroEmpleaCuentaContable;
	protected JButton jButtonActualizarToolBarRubroEmpleaCuentaContable;
    protected JButton jButtonEliminarToolBarRubroEmpleaCuentaContable;
	protected JButton jButtonCancelarToolBarRubroEmpleaCuentaContable;
    protected JButton jButtonGuardarCambiosToolBarRubroEmpleaCuentaContable;
	protected JButton jButtonGuardarCambiosTablaToolBarRubroEmpleaCuentaContable;
	protected JButton jButtonMostrarOcultarTablaToolBarRubroEmpleaCuentaContable;
	protected JButton jButtonCerrarToolBarRubroEmpleaCuentaContable;
	
	protected JButton jButtonProcesarInformacionToolBarRubroEmpleaCuentaContable;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemModificarRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemActualizarRubroEmpleaCuentaContable;
    protected JMenuItem jMenuItemEliminarRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemCancelarRubroEmpleaCuentaContable;
    protected JMenuItem jMenuItemGuardarCambiosRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemGuardarCambiosTablaRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemCerrarRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemDetalleCerrarRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemDetalleMostarOcultarRubroEmpleaCuentaContable;
	
	protected JMenuItem jMenuItemProcesarInformacionRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRubroEmpleaCuentaContable;
	protected JMenuItem jMenuItemMostrarOcultarRubroEmpleaCuentaContable;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRubroEmpleaCuentaContable;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRubroEmpleaCuentaContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRubroEmpleaCuentaContable;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRubroEmpleaCuentaContable;
	public JLabel jLabelIdRubroEmpleaCuentaContable;
	public JLabel jLabelidRubroEmpleaCuentaContable;
	public JButton jButtonidRubroEmpleaCuentaContableBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaRubroEmpleaCuentaContable;
	public JLabel jLabelid_empresaRubroEmpleaCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaRubroEmpleaCuentaContable;
	public JButton jButtonid_empresaRubroEmpleaCuentaContable= new JButtonMe();
	public JButton jButtonid_empresaRubroEmpleaCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_empresaRubroEmpleaCuentaContableBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalRubroEmpleaCuentaContable;
	public JLabel jLabelid_sucursalRubroEmpleaCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalRubroEmpleaCuentaContable;
	public JButton jButtonid_sucursalRubroEmpleaCuentaContable= new JButtonMe();
	public JButton jButtonid_sucursalRubroEmpleaCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_sucursalRubroEmpleaCuentaContableBusqueda= new JButtonMe();

	public JPanel jPanelid_rubro_empleaRubroEmpleaCuentaContable;
	public JLabel jLabelid_rubro_empleaRubroEmpleaCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rubro_empleaRubroEmpleaCuentaContable;
	public JButton jButtonid_rubro_empleaRubroEmpleaCuentaContable= new JButtonMe();
	public JButton jButtonid_rubro_empleaRubroEmpleaCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_rubro_empleaRubroEmpleaCuentaContableBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableRubroEmpleaCuentaContable;
	public JLabel jLabelid_cuenta_contableRubroEmpleaCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableRubroEmpleaCuentaContable;
	public JButton jButtonid_cuenta_contableRubroEmpleaCuentaContable= new JButtonMe();
	public JButton jButtonid_cuenta_contableRubroEmpleaCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableRubroEmpleaCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableRubroEmpleaCuentaContableArbol= new JButtonMe();

	public JPanel jPanelid_estructuraRubroEmpleaCuentaContable;
	public JLabel jLabelid_estructuraRubroEmpleaCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraRubroEmpleaCuentaContable;
	public JButton jButtonid_estructuraRubroEmpleaCuentaContable= new JButtonMe();
	public JButton jButtonid_estructuraRubroEmpleaCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_estructuraRubroEmpleaCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraRubroEmpleaCuentaContableArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRubroEmpleaCuentaContable;
	
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
		
	public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public RubroEmpleaCuentaContableDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRubroEmpleaCuentaContable=new JPanel();
				this.jPanelAccionesFormularioRubroEmpleaCuentaContable=new JPanel();
				this.jmenuBarDetalleRubroEmpleaCuentaContable=new JMenuBar();
				this.jTtoolBarDetalleRubroEmpleaCuentaContable=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEmpleaCuentaContableDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("RubroEmpleaCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RubroEmpleaCuentaContableDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("RubroEmpleaCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEmpleaCuentaContableDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RubroEmpleaCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEmpleaCuentaContableDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RubroEmpleaCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEmpleaCuentaContableDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RubroEmpleaCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarRubroEmpleaCuentaContable() {
		return this.jButtonActualizarToolBarRubroEmpleaCuentaContable;
	}
	
	public JButton getjButtonEliminarToolBarRubroEmpleaCuentaContable() {
		return this.jButtonEliminarToolBarRubroEmpleaCuentaContable;
	}
	
	public JButton getjButtonCancelarToolBarRubroEmpleaCuentaContable() {
		return this.jButtonCancelarToolBarRubroEmpleaCuentaContable;
	}		
	
	public JButton getjButtonProcesarInformacionRubroEmpleaCuentaContable() {
		return this.jButtonProcesarInformacionRubroEmpleaCuentaContable;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRubroEmpleaCuentaContable)	{
		this.jButtonProcesarInformacionRubroEmpleaCuentaContable = jButtonProcesarInformacionRubroEmpleaCuentaContable;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRubroEmpleaCuentaContable() {
		return this.jComboBoxTiposAccionesRubroEmpleaCuentaContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRubroEmpleaCuentaContable(
			JComboBox jComboBoxTiposRelacionesRubroEmpleaCuentaContable) {
		this.jComboBoxTiposRelacionesRubroEmpleaCuentaContable = jComboBoxTiposRelacionesRubroEmpleaCuentaContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRubroEmpleaCuentaContable(
			JComboBox jComboBoxTiposAccionesRubroEmpleaCuentaContable) {
		this.jComboBoxTiposAccionesRubroEmpleaCuentaContable = jComboBoxTiposAccionesRubroEmpleaCuentaContable;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable() {
		return this.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable(
			JComboBox jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable) {
		this.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable = jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.rubroempleacuentacontableSessionBean=new RubroEmpleaCuentaContableSessionBean();
		
		this.rubroempleacuentacontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rubroempleacuentacontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RubroEmpleaCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RubroEmpleaCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RubroEmpleaCuentaContableJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Rubro Emplea Cuenta Contable MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
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
	
		RubroEmpleaCuentaContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRubroEmpleaCuentaContable= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRubroEmpleaCuentaContable=new JButtonMe();
				this.jButtonModificarToolBarRubroEmpleaCuentaContable=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRubroEmpleaCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRubroEmpleaCuentaContable,this.jTtoolBarDetalleRubroEmpleaCuentaContable,
							"actualizar","actualizar","Actualizar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRubroEmpleaCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRubroEmpleaCuentaContable,this.jTtoolBarDetalleRubroEmpleaCuentaContable,
							"eliminar","eliminar","Eliminar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRubroEmpleaCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRubroEmpleaCuentaContable,this.jTtoolBarDetalleRubroEmpleaCuentaContable,
							"cancelar","cancelar","Cancelar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRubroEmpleaCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRubroEmpleaCuentaContable,this.jTtoolBarDetalleRubroEmpleaCuentaContable,
							"guardarcambios","guardarcambios","Guardar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRubroEmpleaCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRubroEmpleaCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRubroEmpleaCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRubroEmpleaCuentaContable=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRubroEmpleaCuentaContable=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRubroEmpleaCuentaContable=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRubroEmpleaCuentaContable=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRubroEmpleaCuentaContable=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRubroEmpleaCuentaContable= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRubroEmpleaCuentaContable.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRubroEmpleaCuentaContable,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRubroEmpleaCuentaContable= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRubroEmpleaCuentaContable.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRubroEmpleaCuentaContable,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRubroEmpleaCuentaContable= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRubroEmpleaCuentaContable.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRubroEmpleaCuentaContable,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRubroEmpleaCuentaContable= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRubroEmpleaCuentaContable.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRubroEmpleaCuentaContable,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRubroEmpleaCuentaContable= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRubroEmpleaCuentaContable.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRubroEmpleaCuentaContable,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRubroEmpleaCuentaContable= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRubroEmpleaCuentaContable.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRubroEmpleaCuentaContable,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRubroEmpleaCuentaContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRubroEmpleaCuentaContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRubroEmpleaCuentaContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRubroEmpleaCuentaContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRubroEmpleaCuentaContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRubroEmpleaCuentaContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRubroEmpleaCuentaContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRubroEmpleaCuentaContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRubroEmpleaCuentaContable,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRubroEmpleaCuentaContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRubroEmpleaCuentaContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRubroEmpleaCuentaContable,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRubroEmpleaCuentaContable.add(this.jMenuItemDetalleCerrarRubroEmpleaCuentaContable);
		
		this.jmenuDetalleAccionesRubroEmpleaCuentaContable.add(this.jMenuItemActualizarRubroEmpleaCuentaContable);
		this.jmenuDetalleAccionesRubroEmpleaCuentaContable.add(this.jMenuItemEliminarRubroEmpleaCuentaContable);
		this.jmenuDetalleAccionesRubroEmpleaCuentaContable.add(this.jMenuItemCancelarRubroEmpleaCuentaContable);		
		
		//this.jmenuDetalleDatosRubroEmpleaCuentaContable.add(this.jMenuItemDetalleAbrirOrderByRubroEmpleaCuentaContable);				
		this.jmenuDetalleDatosRubroEmpleaCuentaContable.add(this.jMenuItemDetalleMostarOcultarRubroEmpleaCuentaContable);				
				
		//this.jmenuDetalleAccionesRubroEmpleaCuentaContable.add(this.jMenuItemGuardarCambiosRubroEmpleaCuentaContable);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRubroEmpleaCuentaContable.add(this.jmenuDetalleArchivoRubroEmpleaCuentaContable);		
		this.jmenuBarDetalleRubroEmpleaCuentaContable.add(this.jmenuDetalleAccionesRubroEmpleaCuentaContable);		
		this.jmenuBarDetalleRubroEmpleaCuentaContable.add(this.jmenuDetalleDatosRubroEmpleaCuentaContable);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRubroEmpleaCuentaContable);				
	}
	
	
	public void inicializarElementosCamposRubroEmpleaCuentaContable() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRubroEmpleaCuentaContable = new JLabelMe();
		jLabelIdRubroEmpleaCuentaContable.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRubroEmpleaCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRubroEmpleaCuentaContable = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRubroEmpleaCuentaContable.setToolTipText(RubroEmpleaCuentaContableConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRubroEmpleaCuentaContable= new GridBagLayout();

		this.jPanelidRubroEmpleaCuentaContable.setLayout(this.gridaBagLayoutRubroEmpleaCuentaContable);

		jLabelidRubroEmpleaCuentaContable = new JLabel();
		jLabelidRubroEmpleaCuentaContable.setText("Id");

		jLabelidRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysRubroEmpleaCuentaContable() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaRubroEmpleaCuentaContable = new JLabelMe();
		this.jLabelid_empresaRubroEmpleaCuentaContable.setText(""+RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaRubroEmpleaCuentaContable.setToolTipText("Empresa");
		this.jLabelid_empresaRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaRubroEmpleaCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaRubroEmpleaCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaRubroEmpleaCuentaContable.setToolTipText(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutRubroEmpleaCuentaContable = new GridBagLayout();
		this.jPanelid_empresaRubroEmpleaCuentaContable.setLayout(this.gridaBagLayoutRubroEmpleaCuentaContable);


		jComboBoxid_empresaRubroEmpleaCuentaContable= new JComboBoxMe();
		jComboBoxid_empresaRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaRubroEmpleaCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaRubroEmpleaCuentaContable.setEnabled(false);

		this.jButtonid_empresaRubroEmpleaCuentaContable= new JButtonMe();
		this.jButtonid_empresaRubroEmpleaCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRubroEmpleaCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRubroEmpleaCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRubroEmpleaCuentaContable.setText("Buscar");
		this.jButtonid_empresaRubroEmpleaCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaRubroEmpleaCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRubroEmpleaCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaRubroEmpleaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRubroEmpleaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRubroEmpleaCuentaContable"));

		this.jButtonid_empresaRubroEmpleaCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_empresaRubroEmpleaCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRubroEmpleaCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRubroEmpleaCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRubroEmpleaCuentaContableBusqueda.setText("U");
		this.jButtonid_empresaRubroEmpleaCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaRubroEmpleaCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRubroEmpleaCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaRubroEmpleaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRubroEmpleaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRubroEmpleaCuentaContableBusqueda"));

		if(this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaRubroEmpleaCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_empresaRubroEmpleaCuentaContableUpdate= new JButtonMe();
		this.jButtonid_empresaRubroEmpleaCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRubroEmpleaCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRubroEmpleaCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRubroEmpleaCuentaContableUpdate.setText("U");
		this.jButtonid_empresaRubroEmpleaCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaRubroEmpleaCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRubroEmpleaCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaRubroEmpleaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRubroEmpleaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRubroEmpleaCuentaContableUpdate"));



					
		this.jLabelid_sucursalRubroEmpleaCuentaContable = new JLabelMe();
		this.jLabelid_sucursalRubroEmpleaCuentaContable.setText(""+RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalRubroEmpleaCuentaContable.setToolTipText("Sucursal");
		this.jLabelid_sucursalRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalRubroEmpleaCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalRubroEmpleaCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalRubroEmpleaCuentaContable.setToolTipText(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutRubroEmpleaCuentaContable = new GridBagLayout();
		this.jPanelid_sucursalRubroEmpleaCuentaContable.setLayout(this.gridaBagLayoutRubroEmpleaCuentaContable);


		jComboBoxid_sucursalRubroEmpleaCuentaContable= new JComboBoxMe();
		jComboBoxid_sucursalRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalRubroEmpleaCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalRubroEmpleaCuentaContable.setEnabled(false);

		this.jButtonid_sucursalRubroEmpleaCuentaContable= new JButtonMe();
		this.jButtonid_sucursalRubroEmpleaCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRubroEmpleaCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRubroEmpleaCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRubroEmpleaCuentaContable.setText("Buscar");
		this.jButtonid_sucursalRubroEmpleaCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalRubroEmpleaCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRubroEmpleaCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalRubroEmpleaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRubroEmpleaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRubroEmpleaCuentaContable"));

		this.jButtonid_sucursalRubroEmpleaCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_sucursalRubroEmpleaCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRubroEmpleaCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRubroEmpleaCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalRubroEmpleaCuentaContableBusqueda.setText("U");
		this.jButtonid_sucursalRubroEmpleaCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalRubroEmpleaCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRubroEmpleaCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalRubroEmpleaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRubroEmpleaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRubroEmpleaCuentaContableBusqueda"));

		if(this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalRubroEmpleaCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_sucursalRubroEmpleaCuentaContableUpdate= new JButtonMe();
		this.jButtonid_sucursalRubroEmpleaCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRubroEmpleaCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRubroEmpleaCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalRubroEmpleaCuentaContableUpdate.setText("U");
		this.jButtonid_sucursalRubroEmpleaCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalRubroEmpleaCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRubroEmpleaCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalRubroEmpleaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRubroEmpleaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRubroEmpleaCuentaContableUpdate"));



					
		this.jLabelid_rubro_empleaRubroEmpleaCuentaContable = new JLabelMe();
		this.jLabelid_rubro_empleaRubroEmpleaCuentaContable.setText(""+RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDRUBROEMPLEA+" : *");
		this.jLabelid_rubro_empleaRubroEmpleaCuentaContable.setToolTipText("Rubro Emplea");
		this.jLabelid_rubro_empleaRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rubro_empleaRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rubro_empleaRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_rubro_empleaRubroEmpleaCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_rubro_empleaRubroEmpleaCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_rubro_empleaRubroEmpleaCuentaContable.setToolTipText(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDRUBROEMPLEA);
		this.gridaBagLayoutRubroEmpleaCuentaContable = new GridBagLayout();
		this.jPanelid_rubro_empleaRubroEmpleaCuentaContable.setLayout(this.gridaBagLayoutRubroEmpleaCuentaContable);


		jComboBoxid_rubro_empleaRubroEmpleaCuentaContable= new JComboBoxMe();
		jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rubro_empleaRubroEmpleaCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_rubro_empleaRubroEmpleaCuentaContable= new JButtonMe();
		this.jButtonid_rubro_empleaRubroEmpleaCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaRubroEmpleaCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaRubroEmpleaCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaRubroEmpleaCuentaContable.setText("Buscar");
		this.jButtonid_rubro_empleaRubroEmpleaCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_rubro_empleaRubroEmpleaCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaRubroEmpleaCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaRubroEmpleaCuentaContable"));

		this.jButtonid_rubro_empleaRubroEmpleaCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_rubro_empleaRubroEmpleaCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaRubroEmpleaCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaRubroEmpleaCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rubro_empleaRubroEmpleaCuentaContableBusqueda.setText("U");
		this.jButtonid_rubro_empleaRubroEmpleaCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_rubro_empleaRubroEmpleaCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaRubroEmpleaCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaRubroEmpleaCuentaContableBusqueda"));

		if(this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_rubro_empleaRubroEmpleaCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_rubro_empleaRubroEmpleaCuentaContableUpdate= new JButtonMe();
		this.jButtonid_rubro_empleaRubroEmpleaCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaRubroEmpleaCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaRubroEmpleaCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rubro_empleaRubroEmpleaCuentaContableUpdate.setText("U");
		this.jButtonid_rubro_empleaRubroEmpleaCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_rubro_empleaRubroEmpleaCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaRubroEmpleaCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaRubroEmpleaCuentaContableUpdate"));



					
		this.jLabelid_cuenta_contableRubroEmpleaCuentaContable = new JLabelMe();
		this.jLabelid_cuenta_contableRubroEmpleaCuentaContable.setText(""+RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableRubroEmpleaCuentaContable.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableRubroEmpleaCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableRubroEmpleaCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableRubroEmpleaCuentaContable.setToolTipText(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutRubroEmpleaCuentaContable = new GridBagLayout();
		this.jPanelid_cuenta_contableRubroEmpleaCuentaContable.setLayout(this.gridaBagLayoutRubroEmpleaCuentaContable);


		jComboBoxid_cuenta_contableRubroEmpleaCuentaContable= new JComboBoxMe();
		jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableRubroEmpleaCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableRubroEmpleaCuentaContable= new JButtonMe();
		this.jButtonid_cuenta_contableRubroEmpleaCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableRubroEmpleaCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableRubroEmpleaCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableRubroEmpleaCuentaContable.setText("Buscar");
		this.jButtonid_cuenta_contableRubroEmpleaCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableRubroEmpleaCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableRubroEmpleaCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableRubroEmpleaCuentaContable"));

		this.jButtonid_cuenta_contableRubroEmpleaCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableRubroEmpleaCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableRubroEmpleaCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableRubroEmpleaCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableRubroEmpleaCuentaContableBusqueda.setText("U");
		this.jButtonid_cuenta_contableRubroEmpleaCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableRubroEmpleaCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableRubroEmpleaCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableRubroEmpleaCuentaContableBusqueda"));

		if(this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableRubroEmpleaCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableRubroEmpleaCuentaContableUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableRubroEmpleaCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableRubroEmpleaCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableRubroEmpleaCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableRubroEmpleaCuentaContableUpdate.setText("U");
		this.jButtonid_cuenta_contableRubroEmpleaCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableRubroEmpleaCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableRubroEmpleaCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableRubroEmpleaCuentaContableUpdate"));


		jButtonid_cuenta_contableRubroEmpleaCuentaContableArbol= new JButtonMe();
		jButtonid_cuenta_contableRubroEmpleaCuentaContableArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableRubroEmpleaCuentaContableArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableRubroEmpleaCuentaContableArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableRubroEmpleaCuentaContableArbol.setText("Arbol");
		jButtonid_cuenta_contableRubroEmpleaCuentaContableArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableRubroEmpleaCuentaContableArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableRubroEmpleaCuentaContableArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableRubroEmpleaCuentaContableArbol"));



					
		this.jLabelid_estructuraRubroEmpleaCuentaContable = new JLabelMe();
		this.jLabelid_estructuraRubroEmpleaCuentaContable.setText(""+RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraRubroEmpleaCuentaContable.setToolTipText("Estructura");
		this.jLabelid_estructuraRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraRubroEmpleaCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraRubroEmpleaCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraRubroEmpleaCuentaContable.setToolTipText(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutRubroEmpleaCuentaContable = new GridBagLayout();
		this.jPanelid_estructuraRubroEmpleaCuentaContable.setLayout(this.gridaBagLayoutRubroEmpleaCuentaContable);


		jComboBoxid_estructuraRubroEmpleaCuentaContable= new JComboBoxMe();
		jComboBoxid_estructuraRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraRubroEmpleaCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraRubroEmpleaCuentaContable= new JButtonMe();
		this.jButtonid_estructuraRubroEmpleaCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraRubroEmpleaCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraRubroEmpleaCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraRubroEmpleaCuentaContable.setText("Buscar");
		this.jButtonid_estructuraRubroEmpleaCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraRubroEmpleaCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraRubroEmpleaCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraRubroEmpleaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraRubroEmpleaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraRubroEmpleaCuentaContable"));

		this.jButtonid_estructuraRubroEmpleaCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_estructuraRubroEmpleaCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraRubroEmpleaCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraRubroEmpleaCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraRubroEmpleaCuentaContableBusqueda.setText("U");
		this.jButtonid_estructuraRubroEmpleaCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraRubroEmpleaCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraRubroEmpleaCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraRubroEmpleaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraRubroEmpleaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraRubroEmpleaCuentaContableBusqueda"));

		if(this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraRubroEmpleaCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_estructuraRubroEmpleaCuentaContableUpdate= new JButtonMe();
		this.jButtonid_estructuraRubroEmpleaCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraRubroEmpleaCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraRubroEmpleaCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraRubroEmpleaCuentaContableUpdate.setText("U");
		this.jButtonid_estructuraRubroEmpleaCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraRubroEmpleaCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraRubroEmpleaCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraRubroEmpleaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraRubroEmpleaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraRubroEmpleaCuentaContableUpdate"));


		jButtonid_estructuraRubroEmpleaCuentaContableArbol= new JButtonMe();
		jButtonid_estructuraRubroEmpleaCuentaContableArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraRubroEmpleaCuentaContableArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraRubroEmpleaCuentaContableArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraRubroEmpleaCuentaContableArbol.setText("Arbol");
		jButtonid_estructuraRubroEmpleaCuentaContableArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructuraRubroEmpleaCuentaContableArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraRubroEmpleaCuentaContableArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructuraRubroEmpleaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraRubroEmpleaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraRubroEmpleaCuentaContableArbol"));



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
		//this.jInternalFrameDetalleRubroEmpleaCuentaContable = new RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Rubro Emplea Cuenta Contable DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRubroEmpleaCuentaContable= new GridBagLayout();
		

		
		String sToolTipRubroEmpleaCuentaContable="";
		sToolTipRubroEmpleaCuentaContable=RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRubroEmpleaCuentaContable+="(Nomina.RubroEmpleaCuentaContable)";
		}
		
		if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
			sToolTipRubroEmpleaCuentaContable+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRubroEmpleaCuentaContable = new JButtonMe();
		this.jButtonModificarRubroEmpleaCuentaContable = new JButtonMe();
        this.jButtonActualizarRubroEmpleaCuentaContable = new JButtonMe();
        this.jButtonEliminarRubroEmpleaCuentaContable = new JButtonMe();
        this.jButtonCancelarRubroEmpleaCuentaContable = new JButtonMe();
        this.jButtonGuardarCambiosRubroEmpleaCuentaContable = new JButtonMe();
		this.jButtonGuardarCambiosTablaRubroEmpleaCuentaContable = new JButtonMe();
		this.jButtonCerrarRubroEmpleaCuentaContable = new JButtonMe();
		
		this.jScrollPanelDatosRubroEmpleaCuentaContable = new JScrollPane();   
        this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable = new JScrollPane();
		this.jScrollPanelDatosGeneralRubroEmpleaCuentaContable = new JScrollPane();
				
		
		
		this.jPanelCamposRubroEmpleaCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRubroEmpleaCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRubroEmpleaCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRubroEmpleaCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Rubro Emplea Cuenta Contable";
		
		if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Emplea Cuenta Contables" + this.sPath));
		} else {
			this.jScrollPanelDatosRubroEmpleaCuentaContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposRubroEmpleaCuentaContable.setName("jPanelCamposRubroEmpleaCuentaContable"); 

		this.jPanelCamposOcultosRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRubroEmpleaCuentaContable.setName("jPanelCamposOcultosRubroEmpleaCuentaContable"); 

        this.jPanelAccionesRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRubroEmpleaCuentaContable.setToolTipText("Acciones");
        this.jPanelAccionesRubroEmpleaCuentaContable.setName("Acciones"); 

		this.jPanelAccionesFormularioRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRubroEmpleaCuentaContable.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRubroEmpleaCuentaContable.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRubroEmpleaCuentaContable.setText("Nuevo");
		this.jButtonModificarRubroEmpleaCuentaContable.setText("Editar");
        this.jButtonActualizarRubroEmpleaCuentaContable.setText("Actualizar");
        this.jButtonEliminarRubroEmpleaCuentaContable.setText("Eliminar");
        this.jButtonCancelarRubroEmpleaCuentaContable.setText("Cancelar");
        this.jButtonGuardarCambiosRubroEmpleaCuentaContable.setText("Guardar");
		this.jButtonGuardarCambiosTablaRubroEmpleaCuentaContable.setText("Guardar");
		this.jButtonCerrarRubroEmpleaCuentaContable.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRubroEmpleaCuentaContable,"nuevo_button","Nuevo",this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRubroEmpleaCuentaContable,"modificar_button","Editar",this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRubroEmpleaCuentaContable,"actualizar_button","Actualizar",this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRubroEmpleaCuentaContable,"eliminar_button","Eliminar",this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRubroEmpleaCuentaContable,"cancelar_button","Cancelar",this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRubroEmpleaCuentaContable,"guardarcambios_button","Guardar",this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRubroEmpleaCuentaContable,"guardarcambiostabla_button","Guardar",this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRubroEmpleaCuentaContable,"cerrar_button","Salir",this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRubroEmpleaCuentaContable.setToolTipText("Nuevo"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRubroEmpleaCuentaContable.setToolTipText("Editar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRubroEmpleaCuentaContable.setToolTipText("Actualizar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRubroEmpleaCuentaContable.setToolTipText("Eliminar)"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRubroEmpleaCuentaContable.setToolTipText("Cancelar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRubroEmpleaCuentaContable.setToolTipText("Guardar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRubroEmpleaCuentaContable.setToolTipText("Guardar"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRubroEmpleaCuentaContable.setToolTipText("Salir"+" "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRubroEmpleaCuentaContable";
		inputMap = this.jButtonNuevoRubroEmpleaCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRubroEmpleaCuentaContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRubroEmpleaCuentaContable"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRubroEmpleaCuentaContable";
		inputMap = this.jButtonActualizarRubroEmpleaCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRubroEmpleaCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRubroEmpleaCuentaContable"));
		
		//ELIMINAR
		sMapKey = "EliminarRubroEmpleaCuentaContable";
		inputMap = this.jButtonEliminarRubroEmpleaCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRubroEmpleaCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRubroEmpleaCuentaContable"));
		
		//CANCELAR	
		sMapKey = "CancelarRubroEmpleaCuentaContable";
		inputMap = this.jButtonCancelarRubroEmpleaCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRubroEmpleaCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRubroEmpleaCuentaContable"));
		
		//CERRAR		
		sMapKey = "CerrarRubroEmpleaCuentaContable";
		inputMap = this.jButtonCerrarRubroEmpleaCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRubroEmpleaCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRubroEmpleaCuentaContable"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRubroEmpleaCuentaContable";
		inputMap = this.jButtonGuardarCambiosTablaRubroEmpleaCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRubroEmpleaCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRubroEmpleaCuentaContable"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRubroEmpleaCuentaContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRubroEmpleaCuentaContable.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRubroEmpleaCuentaContable.setToolTipText("Nuevo RubroEmpleaCuentaContable");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRubroEmpleaCuentaContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRubroEmpleaCuentaContable.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRubroEmpleaCuentaContable.setToolTipText("Sin Cerrar Ventana RubroEmpleaCuentaContable");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRubroEmpleaCuentaContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRubroEmpleaCuentaContable.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRubroEmpleaCuentaContable.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRubroEmpleaCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.setText("Accion");
		this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRubroEmpleaCuentaContable = new JLabelMe();
		
		this.jLabelAccionesRubroEmpleaCuentaContable.setText("Acciones");		
		this.jLabelAccionesRubroEmpleaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRubroEmpleaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRubroEmpleaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRubroEmpleaCuentaContable();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRubroEmpleaCuentaContable();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRubroEmpleaCuentaContable=new JTabbedPane();
		this.jTabbedPaneRelacionesRubroEmpleaCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRubroEmpleaCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRubroEmpleaCuentaContable = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRubroEmpleaCuentaContable = new GridBagLayout();
		
		this.jPanelCamposRubroEmpleaCuentaContable.setLayout(gridaBagLayoutCamposRubroEmpleaCuentaContable);
		this.jPanelCamposOcultosRubroEmpleaCuentaContable.setLayout(gridaBagLayoutCamposOcultosRubroEmpleaCuentaContable);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidRubroEmpleaCuentaContable.add(jLabelIdRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);



	this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 1;
	this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidRubroEmpleaCuentaContable.add(jLabelidRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);


	this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaRubroEmpleaCuentaContable.add(jLabelid_empresaRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 2;
		this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRubroEmpleaCuentaContable.add(jButtonid_empresaRubroEmpleaCuentaContableBusqueda, this.gridBagConstraintsRubroEmpleaCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 3;
		this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRubroEmpleaCuentaContable.add(jButtonid_empresaRubroEmpleaCuentaContableUpdate, this.gridBagConstraintsRubroEmpleaCuentaContable);
	}

	this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 1;
	this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaRubroEmpleaCuentaContable.add(jComboBoxid_empresaRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);


	this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalRubroEmpleaCuentaContable.add(jLabelid_sucursalRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 2;
		this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalRubroEmpleaCuentaContable.add(jButtonid_sucursalRubroEmpleaCuentaContableBusqueda, this.gridBagConstraintsRubroEmpleaCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 3;
		this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalRubroEmpleaCuentaContable.add(jButtonid_sucursalRubroEmpleaCuentaContableUpdate, this.gridBagConstraintsRubroEmpleaCuentaContable);
	}

	this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 1;
	this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalRubroEmpleaCuentaContable.add(jComboBoxid_sucursalRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);


	this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_rubro_empleaRubroEmpleaCuentaContable.add(jLabelid_rubro_empleaRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 2;
		this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rubro_empleaRubroEmpleaCuentaContable.add(jButtonid_rubro_empleaRubroEmpleaCuentaContableBusqueda, this.gridBagConstraintsRubroEmpleaCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 3;
		this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rubro_empleaRubroEmpleaCuentaContable.add(jButtonid_rubro_empleaRubroEmpleaCuentaContableUpdate, this.gridBagConstraintsRubroEmpleaCuentaContable);
	}

	this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 1;
	this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_rubro_empleaRubroEmpleaCuentaContable.add(jComboBoxid_rubro_empleaRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);


	this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableRubroEmpleaCuentaContable.add(jLabelid_cuenta_contableRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 2;
		this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableRubroEmpleaCuentaContable.add(jButtonid_cuenta_contableRubroEmpleaCuentaContableBusqueda, this.gridBagConstraintsRubroEmpleaCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 3;
		this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableRubroEmpleaCuentaContable.add(jButtonid_cuenta_contableRubroEmpleaCuentaContableUpdate, this.gridBagConstraintsRubroEmpleaCuentaContable);
	}

	this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 1;
	this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableRubroEmpleaCuentaContable.add(jComboBoxid_cuenta_contableRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);


	this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraRubroEmpleaCuentaContable.add(jLabelid_estructuraRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 2;
		this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraRubroEmpleaCuentaContable.add(jButtonid_estructuraRubroEmpleaCuentaContableBusqueda, this.gridBagConstraintsRubroEmpleaCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 3;
		this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraRubroEmpleaCuentaContable.add(jButtonid_estructuraRubroEmpleaCuentaContableUpdate, this.gridBagConstraintsRubroEmpleaCuentaContable);
	}

	this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 1;
	this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
	this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraRubroEmpleaCuentaContable.add(jComboBoxid_estructuraRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iYPanelCamposRubroEmpleaCuentaContable;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iXPanelCamposRubroEmpleaCuentaContable++;
	this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmpleaCuentaContable.add(this.jPanelidRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);



	if(iXPanelCamposRubroEmpleaCuentaContable % 1==0) {
		iXPanelCamposRubroEmpleaCuentaContable=0;
		iYPanelCamposRubroEmpleaCuentaContable++;
	}
	this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iYPanelCamposRubroEmpleaCuentaContable;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iXPanelCamposRubroEmpleaCuentaContable++;
	this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmpleaCuentaContable.add(this.jPanelid_rubro_empleaRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);



	if(iXPanelCamposRubroEmpleaCuentaContable % 1==0) {
		iXPanelCamposRubroEmpleaCuentaContable=0;
		iYPanelCamposRubroEmpleaCuentaContable++;
	}
	this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iYPanelCamposRubroEmpleaCuentaContable;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iXPanelCamposRubroEmpleaCuentaContable++;
	this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmpleaCuentaContable.add(this.jPanelid_cuenta_contableRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);



	if(iXPanelCamposRubroEmpleaCuentaContable % 1==0) {
		iXPanelCamposRubroEmpleaCuentaContable=0;
		iYPanelCamposRubroEmpleaCuentaContable++;
	}
	this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iYPanelCamposRubroEmpleaCuentaContable;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iXPanelCamposRubroEmpleaCuentaContable++;
	this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEmpleaCuentaContable.add(this.jPanelid_estructuraRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);



	if(iXPanelCamposRubroEmpleaCuentaContable % 1==0) {
		iXPanelCamposRubroEmpleaCuentaContable=0;
		iYPanelCamposRubroEmpleaCuentaContable++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iYPanelCamposOcultosRubroEmpleaCuentaContable;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iXPanelCamposOcultosRubroEmpleaCuentaContable++;
	this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRubroEmpleaCuentaContable.add(this.jPanelid_empresaRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);



	if(iXPanelCamposOcultosRubroEmpleaCuentaContable % 1==0) {
		iXPanelCamposOcultosRubroEmpleaCuentaContable=0;
		iYPanelCamposOcultosRubroEmpleaCuentaContable++;
	}
	this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iYPanelCamposOcultosRubroEmpleaCuentaContable;
	this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iXPanelCamposOcultosRubroEmpleaCuentaContable++;
	this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEmpleaCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRubroEmpleaCuentaContable.add(this.jPanelid_sucursalRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);



	if(iXPanelCamposOcultosRubroEmpleaCuentaContable % 1==0) {
		iXPanelCamposOcultosRubroEmpleaCuentaContable=0;
		iYPanelCamposOcultosRubroEmpleaCuentaContable++;
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
			
		GridBagLayout gridaBagLayoutAccionesRubroEmpleaCuentaContable= new GridBagLayout();
		this.jPanelAccionesRubroEmpleaCuentaContable.setLayout(gridaBagLayoutAccionesRubroEmpleaCuentaContable);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRubroEmpleaCuentaContable= new GridBagLayout();
		this.jPanelAccionesFormularioRubroEmpleaCuentaContable.setLayout(gridaBagLayoutAccionesFormularioRubroEmpleaCuentaContable);
		
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRubroEmpleaCuentaContable.add(this.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);

		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRubroEmpleaCuentaContable.add(this.jCheckBoxPostAccionNuevoRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.rubroempleacuentacontableSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRubroEmpleaCuentaContable.add(this.jCheckBoxPostAccionSinCerrarRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.rubroempleacuentacontableSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRubroEmpleaCuentaContable.add(this.jCheckBoxPostAccionSinMensajeRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXAccion++;
			
		this.jPanelAccionesRubroEmpleaCuentaContable.add(this.jButtonModificarRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);							

		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx =iPosXAccion++;
			
		this.jPanelAccionesRubroEmpleaCuentaContable.add(this.jButtonEliminarRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
		
			
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;		
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXAccion++;
		
		this.jPanelAccionesRubroEmpleaCuentaContable.add(this.jButtonActualizarRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);


		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;		
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = iPosXAccion++;
		
		this.jPanelAccionesRubroEmpleaCuentaContable.add(this.jButtonGuardarCambiosRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);	
		
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = 0;		
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx =iPosXAccion++;
		
		this.jPanelAccionesRubroEmpleaCuentaContable.add(this.jButtonCancelarRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRubroEmpleaCuentaContable = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRubroEmpleaCuentaContable);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();						
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;		
			//this.gridBagConstraintsRubroEmpleaCuentaContable.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRubroEmpleaCuentaContable.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx =0;
		this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRubroEmpleaCuentaContable.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RubroEmpleaCuentaContableJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRubroEmpleaCuentaContable = new RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Rubro Emplea Cuenta Contable DATOS");
			
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
			
	        //this.setTitle("[FOR] - Rubro Emplea Cuenta Contable DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Rubro Emplea Cuenta Contable Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RubroEmpleaCuentaContableModel rubroempleacuentacontableModel=new RubroEmpleaCuentaContableModel(this);
			
			//SI USARA CLASE INTERNA
			//RubroEmpleaCuentaContableModel.RubroEmpleaCuentaContableFocusTraversalPolicy rubroempleacuentacontableFocusTraversalPolicy = rubroempleacuentacontableModel.new RubroEmpleaCuentaContableFocusTraversalPolicy(this);
			
			//rubroempleacuentacontableFocusTraversalPolicy.setrubroempleacuentacontableJInternalFrame(this);
			
			this.setFocusTraversalPolicy(rubroempleacuentacontableModel);
			
			
			this.jContentPaneDetalleRubroEmpleaCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRubroEmpleaCuentaContable = new GridBagLayout();	
			this.jContentPaneDetalleRubroEmpleaCuentaContable.setLayout(gridaBagLayoutDetalleRubroEmpleaCuentaContable);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRubroEmpleaCuentaContable = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
				this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
					
				
				this.jContentPaneDetalleRubroEmpleaCuentaContable.add(jTtoolBarDetalleRubroEmpleaCuentaContable, gridBagConstraintsRubroEmpleaCuentaContable);								
				
}
			
			this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable=   new JScrollPane(jContentPaneDetalleRubroEmpleaCuentaContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRubroEmpleaCuentaContable=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRubroEmpleaCuentaContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRubroEmpleaCuentaContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRubroEmpleaCuentaContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			
			
	        this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
	        
			this.jContentPaneDetalleRubroEmpleaCuentaContable.add(jPanelCamposRubroEmpleaCuentaContable, gridBagConstraintsRubroEmpleaCuentaContable);
			
			
			
			
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
						&& rubroempleacuentacontableSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.rubroempleacuentacontableSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRubroEmpleaCuentaContable= new GridBagConstraints();
						this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
						this.jContentPaneDetalleRubroEmpleaCuentaContable.add(this.jTabbedPaneRelacionesRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRubroEmpleaCuentaContable.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRubroEmpleaCuentaContable.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
					this.gridBagConstraintsRubroEmpleaCuentaContable.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
					
				
					this.jContentPaneDetalleRubroEmpleaCuentaContable.add(jPanelCamposOcultosRubroEmpleaCuentaContable, gridBagConstraintsRubroEmpleaCuentaContable);
				
					this.jPanelCamposOcultosRubroEmpleaCuentaContable.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
	        this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRubroEmpleaCuentaContable.add(this.jPanelAccionesFormularioRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);							
			
			
			
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
	        this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
	        
			
			this.jContentPaneDetalleRubroEmpleaCuentaContable.add(this.jPanelAccionesRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRubroEmpleaCuentaContable);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable=   new JScrollPane(this.jPanelCamposRubroEmpleaCuentaContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
			this.gridBagConstraintsRubroEmpleaCuentaContable.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRubroEmpleaCuentaContable.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRubroEmpleaCuentaContable.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);			
			
			this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
			
			
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
		
			
		this.gridBagConstraintsRubroEmpleaCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmpleaCuentaContable.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRubroEmpleaCuentaContable, this.gridBagConstraintsRubroEmpleaCuentaContable);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRubroEmpleaCuentaContable;//jContentPane;
		
		return jScrollPanelDatosEdicionRubroEmpleaCuentaContable;
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
