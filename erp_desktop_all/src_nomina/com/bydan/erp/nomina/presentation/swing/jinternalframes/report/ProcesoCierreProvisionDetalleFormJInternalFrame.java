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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.ProcesoCierreProvisionConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class ProcesoCierreProvisionDetalleFormJInternalFrame extends ProcesoCierreProvisionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoCierreProvision;
	
	protected JMenuBar jmenuBarDetalleProcesoCierreProvision;
	
	protected JMenu jmenuDetalleProcesoCierreProvision;
	protected JMenu jmenuDetalleArchivoProcesoCierreProvision;
	protected JMenu jmenuDetalleAccionesProcesoCierreProvision;
	protected JMenu jmenuDetalleDatosProcesoCierreProvision;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoCierreProvision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoCierreProvision;	
	protected GridBagConstraints gridBagConstraintsProcesoCierreProvision;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoCierreProvisionBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoCierreProvision;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected DefiProvisionEmpleadoBeanSwingJInternalFrame defiprovisionempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_defiprovisionempleado="";
	
	public ProcesoCierreProvisionSessionBean procesocierreprovisionSessionBean;
	
	
	
	
	public AnioSessionBean anioSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public DefiProvisionEmpleadoSessionBean defiprovisionempleadoSessionBean;	
	
	public ProcesoCierreProvisionLogic procesocierreprovisionLogic;
	
	public JScrollPane jScrollPanelDatosProcesoCierreProvision;
	public JScrollPane jScrollPanelDatosEdicionProcesoCierreProvision;
	public JScrollPane jScrollPanelDatosGeneralProcesoCierreProvision;
	
	protected JPanel jPanelCamposProcesoCierreProvision;    
	protected JPanel jPanelCamposOcultosProcesoCierreProvision;    	
	protected JPanel jPanelAccionesProcesoCierreProvision;
	protected JPanel jPanelAccionesFormularioProcesoCierreProvision;
    
	
	
	protected Integer iXPanelCamposProcesoCierreProvision=0;
	protected Integer iYPanelCamposProcesoCierreProvision=0;
	
	protected Integer iXPanelCamposOcultosProcesoCierreProvision=0;
	protected Integer iYPanelCamposOcultosProcesoCierreProvision=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoCierreProvision;
	public JButton jButtonModificarProcesoCierreProvision;
	public JButton jButtonActualizarProcesoCierreProvision;
    public JButton jButtonEliminarProcesoCierreProvision;
	public JButton jButtonCancelarProcesoCierreProvision;
    public JButton jButtonGuardarCambiosProcesoCierreProvision;
	public JButton jButtonGuardarCambiosTablaProcesoCierreProvision;
	protected JButton jButtonCerrarProcesoCierreProvision;
	
	
	protected JButton jButtonProcesarInformacionProcesoCierreProvision;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoCierreProvision;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoCierreProvision;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoCierreProvision;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoCierreProvision;
	protected JButton jButtonModificarToolBarProcesoCierreProvision;
	protected JButton jButtonActualizarToolBarProcesoCierreProvision;
    protected JButton jButtonEliminarToolBarProcesoCierreProvision;
	protected JButton jButtonCancelarToolBarProcesoCierreProvision;
    protected JButton jButtonGuardarCambiosToolBarProcesoCierreProvision;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoCierreProvision;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoCierreProvision;
	protected JButton jButtonCerrarToolBarProcesoCierreProvision;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoCierreProvision;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoCierreProvision;
	protected JMenuItem jMenuItemModificarProcesoCierreProvision;
	protected JMenuItem jMenuItemActualizarProcesoCierreProvision;
    protected JMenuItem jMenuItemEliminarProcesoCierreProvision;
	protected JMenuItem jMenuItemCancelarProcesoCierreProvision;
    protected JMenuItem jMenuItemGuardarCambiosProcesoCierreProvision;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoCierreProvision;
	protected JMenuItem jMenuItemCerrarProcesoCierreProvision;
	protected JMenuItem jMenuItemDetalleCerrarProcesoCierreProvision;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoCierreProvision;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoCierreProvision;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoCierreProvision;
	protected JMenuItem jMenuItemMostrarOcultarProcesoCierreProvision;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoCierreProvision;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoCierreProvision;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoCierreProvision;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoCierreProvision;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoCierreProvision;
	public JLabel jLabelIdProcesoCierreProvision;
	public JLabel jLabelidProcesoCierreProvision;
	public JButton jButtonidProcesoCierreProvisionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_anioProcesoCierreProvision;
	public JLabel jLabelid_anioProcesoCierreProvision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioProcesoCierreProvision;
	public JButton jButtonid_anioProcesoCierreProvision= new JButtonMe();
	public JButton jButtonid_anioProcesoCierreProvisionUpdate= new JButtonMe();
	public JButton jButtonid_anioProcesoCierreProvisionBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraProcesoCierreProvision;
	public JLabel jLabelid_estructuraProcesoCierreProvision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraProcesoCierreProvision;
	public JButton jButtonid_estructuraProcesoCierreProvision= new JButtonMe();
	public JButton jButtonid_estructuraProcesoCierreProvisionUpdate= new JButtonMe();
	public JButton jButtonid_estructuraProcesoCierreProvisionBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoProcesoCierreProvision;
	public JLabel jLabelid_empleadoProcesoCierreProvision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoProcesoCierreProvision;
	public JButton jButtonid_empleadoProcesoCierreProvision= new JButtonMe();
	public JButton jButtonid_empleadoProcesoCierreProvisionUpdate= new JButtonMe();
	public JButton jButtonid_empleadoProcesoCierreProvisionBusqueda= new JButtonMe();

	public JPanel jPanelid_defi_provision_empleadoProcesoCierreProvision;
	public JLabel jLabelid_defi_provision_empleadoProcesoCierreProvision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_defi_provision_empleadoProcesoCierreProvision;
	public JButton jButtonid_defi_provision_empleadoProcesoCierreProvision= new JButtonMe();
	public JButton jButtonid_defi_provision_empleadoProcesoCierreProvisionUpdate= new JButtonMe();
	public JButton jButtonid_defi_provision_empleadoProcesoCierreProvisionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoCierreProvision;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	
	public ProcesoCierreProvisionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoCierreProvision=new JPanel();
				this.jPanelAccionesFormularioProcesoCierreProvision=new JPanel();
				this.jmenuBarDetalleProcesoCierreProvision=new JMenuBar();
				this.jTtoolBarDetalleProcesoCierreProvision=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreProvisionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoCierreProvision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoCierreProvisionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoCierreProvision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreProvisionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCierreProvision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreProvisionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCierreProvision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreProvisionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoCierreProvision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoCierreProvision() {
		return this.jButtonActualizarToolBarProcesoCierreProvision;
	}
	
	public JButton getjButtonEliminarToolBarProcesoCierreProvision() {
		return this.jButtonEliminarToolBarProcesoCierreProvision;
	}
	
	public JButton getjButtonCancelarToolBarProcesoCierreProvision() {
		return this.jButtonCancelarToolBarProcesoCierreProvision;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoCierreProvision() {
		return this.jButtonProcesarInformacionProcesoCierreProvision;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoCierreProvision)	{
		this.jButtonProcesarInformacionProcesoCierreProvision = jButtonProcesarInformacionProcesoCierreProvision;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoCierreProvision() {
		return this.jComboBoxTiposAccionesProcesoCierreProvision;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoCierreProvision(
			JComboBox jComboBoxTiposRelacionesProcesoCierreProvision) {
		this.jComboBoxTiposRelacionesProcesoCierreProvision = jComboBoxTiposRelacionesProcesoCierreProvision;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoCierreProvision(
			JComboBox jComboBoxTiposAccionesProcesoCierreProvision) {
		this.jComboBoxTiposAccionesProcesoCierreProvision = jComboBoxTiposAccionesProcesoCierreProvision;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoCierreProvision() {
		return this.jComboBoxTiposAccionesFormularioProcesoCierreProvision;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoCierreProvision(
			JComboBox jComboBoxTiposAccionesFormularioProcesoCierreProvision) {
		this.jComboBoxTiposAccionesFormularioProcesoCierreProvision = jComboBoxTiposAccionesFormularioProcesoCierreProvision;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesocierreprovisionSessionBean=new ProcesoCierreProvisionSessionBean();
		
		this.procesocierreprovisionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocierreprovisionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesocierreprovisionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoCierreProvisionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoCierreProvisionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoCierreProvisionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Cierre Provision MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoCierreProvisionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoCierreProvision= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoCierreProvision=new JButtonMe();
				this.jButtonModificarToolBarProcesoCierreProvision=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoCierreProvision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoCierreProvision,this.jTtoolBarDetalleProcesoCierreProvision,
							"actualizar","actualizar","Actualizar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoCierreProvision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoCierreProvision,this.jTtoolBarDetalleProcesoCierreProvision,
							"eliminar","eliminar","Eliminar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoCierreProvision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoCierreProvision,this.jTtoolBarDetalleProcesoCierreProvision,
							"cancelar","cancelar","Cancelar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoCierreProvision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoCierreProvision,this.jTtoolBarDetalleProcesoCierreProvision,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoCierreProvision,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoCierreProvision,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoCierreProvision,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoCierreProvision=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoCierreProvision=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoCierreProvision=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoCierreProvision=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoCierreProvision=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoCierreProvision= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoCierreProvision.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoCierreProvision,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoCierreProvision= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoCierreProvision.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoCierreProvision,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoCierreProvision= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoCierreProvision.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoCierreProvision,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoCierreProvision= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoCierreProvision.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoCierreProvision,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoCierreProvision= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoCierreProvision.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoCierreProvision,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoCierreProvision= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoCierreProvision.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoCierreProvision,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoCierreProvision= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoCierreProvision.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoCierreProvision,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoCierreProvision= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoCierreProvision.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoCierreProvision,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoCierreProvision= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoCierreProvision.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoCierreProvision,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoCierreProvision= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoCierreProvision.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoCierreProvision,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoCierreProvision.add(this.jMenuItemDetalleCerrarProcesoCierreProvision);
		
		this.jmenuDetalleAccionesProcesoCierreProvision.add(this.jMenuItemActualizarProcesoCierreProvision);
		this.jmenuDetalleAccionesProcesoCierreProvision.add(this.jMenuItemEliminarProcesoCierreProvision);
		this.jmenuDetalleAccionesProcesoCierreProvision.add(this.jMenuItemCancelarProcesoCierreProvision);		
		
		//this.jmenuDetalleDatosProcesoCierreProvision.add(this.jMenuItemDetalleAbrirOrderByProcesoCierreProvision);				
		this.jmenuDetalleDatosProcesoCierreProvision.add(this.jMenuItemDetalleMostarOcultarProcesoCierreProvision);				
				
		//this.jmenuDetalleAccionesProcesoCierreProvision.add(this.jMenuItemGuardarCambiosProcesoCierreProvision);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoCierreProvision.add(this.jmenuDetalleArchivoProcesoCierreProvision);		
		this.jmenuBarDetalleProcesoCierreProvision.add(this.jmenuDetalleAccionesProcesoCierreProvision);		
		this.jmenuBarDetalleProcesoCierreProvision.add(this.jmenuDetalleDatosProcesoCierreProvision);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoCierreProvision);				
	}
	
	
	public void inicializarElementosCamposProcesoCierreProvision() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoCierreProvision = new JLabelMe();
		jLabelIdProcesoCierreProvision.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoCierreProvision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoCierreProvision = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoCierreProvision.setToolTipText(ProcesoCierreProvisionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoCierreProvision= new GridBagLayout();

		this.jPanelidProcesoCierreProvision.setLayout(this.gridaBagLayoutProcesoCierreProvision);

		jLabelidProcesoCierreProvision = new JLabel();
		jLabelidProcesoCierreProvision.setText("Id");

		jLabelidProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysProcesoCierreProvision() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_anioProcesoCierreProvision = new JLabelMe();
		this.jLabelid_anioProcesoCierreProvision.setText(""+ProcesoCierreProvisionConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioProcesoCierreProvision.setToolTipText("Anio");
		this.jLabelid_anioProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioProcesoCierreProvision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioProcesoCierreProvision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioProcesoCierreProvision.setToolTipText(ProcesoCierreProvisionConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutProcesoCierreProvision = new GridBagLayout();
		this.jPanelid_anioProcesoCierreProvision.setLayout(this.gridaBagLayoutProcesoCierreProvision);


		jComboBoxid_anioProcesoCierreProvision= new JComboBoxMe();
		jComboBoxid_anioProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioProcesoCierreProvision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioProcesoCierreProvision= new JButtonMe();
		this.jButtonid_anioProcesoCierreProvision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesoCierreProvision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesoCierreProvision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesoCierreProvision.setText("Procesar");
		this.jButtonid_anioProcesoCierreProvision.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioProcesoCierreProvision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesoCierreProvision,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioProcesoCierreProvision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesoCierreProvision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesoCierreProvision"));

		this.jButtonid_anioProcesoCierreProvisionBusqueda= new JButtonMe();
		this.jButtonid_anioProcesoCierreProvisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoCierreProvisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoCierreProvisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioProcesoCierreProvisionBusqueda.setText("U");
		this.jButtonid_anioProcesoCierreProvisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioProcesoCierreProvisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesoCierreProvisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioProcesoCierreProvision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesoCierreProvision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesoCierreProvisionBusqueda"));

		if(this.procesocierreprovisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioProcesoCierreProvisionBusqueda.setVisible(false);		}

		this.jButtonid_anioProcesoCierreProvisionUpdate= new JButtonMe();
		this.jButtonid_anioProcesoCierreProvisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoCierreProvisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoCierreProvisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioProcesoCierreProvisionUpdate.setText("U");
		this.jButtonid_anioProcesoCierreProvisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioProcesoCierreProvisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesoCierreProvisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioProcesoCierreProvision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesoCierreProvision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesoCierreProvisionUpdate"));



					
		this.jLabelid_estructuraProcesoCierreProvision = new JLabelMe();
		this.jLabelid_estructuraProcesoCierreProvision.setText(""+ProcesoCierreProvisionConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraProcesoCierreProvision.setToolTipText("Estructura");
		this.jLabelid_estructuraProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraProcesoCierreProvision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraProcesoCierreProvision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraProcesoCierreProvision.setToolTipText(ProcesoCierreProvisionConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutProcesoCierreProvision = new GridBagLayout();
		this.jPanelid_estructuraProcesoCierreProvision.setLayout(this.gridaBagLayoutProcesoCierreProvision);


		jComboBoxid_estructuraProcesoCierreProvision= new JComboBoxMe();
		jComboBoxid_estructuraProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraProcesoCierreProvision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraProcesoCierreProvision= new JButtonMe();
		this.jButtonid_estructuraProcesoCierreProvision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraProcesoCierreProvision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraProcesoCierreProvision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraProcesoCierreProvision.setText("Procesar");
		this.jButtonid_estructuraProcesoCierreProvision.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraProcesoCierreProvision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraProcesoCierreProvision,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraProcesoCierreProvision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraProcesoCierreProvision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraProcesoCierreProvision"));

		this.jButtonid_estructuraProcesoCierreProvisionBusqueda= new JButtonMe();
		this.jButtonid_estructuraProcesoCierreProvisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraProcesoCierreProvisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraProcesoCierreProvisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraProcesoCierreProvisionBusqueda.setText("U");
		this.jButtonid_estructuraProcesoCierreProvisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraProcesoCierreProvisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraProcesoCierreProvisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraProcesoCierreProvision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraProcesoCierreProvision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraProcesoCierreProvisionBusqueda"));

		if(this.procesocierreprovisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraProcesoCierreProvisionBusqueda.setVisible(false);		}

		this.jButtonid_estructuraProcesoCierreProvisionUpdate= new JButtonMe();
		this.jButtonid_estructuraProcesoCierreProvisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraProcesoCierreProvisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraProcesoCierreProvisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraProcesoCierreProvisionUpdate.setText("U");
		this.jButtonid_estructuraProcesoCierreProvisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraProcesoCierreProvisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraProcesoCierreProvisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraProcesoCierreProvision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraProcesoCierreProvision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraProcesoCierreProvisionUpdate"));



					
		this.jLabelid_empleadoProcesoCierreProvision = new JLabelMe();
		this.jLabelid_empleadoProcesoCierreProvision.setText(""+ProcesoCierreProvisionConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoProcesoCierreProvision.setToolTipText("Empleado");
		this.jLabelid_empleadoProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoProcesoCierreProvision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoProcesoCierreProvision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoProcesoCierreProvision.setToolTipText(ProcesoCierreProvisionConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutProcesoCierreProvision = new GridBagLayout();
		this.jPanelid_empleadoProcesoCierreProvision.setLayout(this.gridaBagLayoutProcesoCierreProvision);


		jComboBoxid_empleadoProcesoCierreProvision= new JComboBoxMe();
		jComboBoxid_empleadoProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoProcesoCierreProvision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoProcesoCierreProvision= new JButtonMe();
		this.jButtonid_empleadoProcesoCierreProvision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoProcesoCierreProvision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoProcesoCierreProvision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoProcesoCierreProvision.setText("Procesar");
		this.jButtonid_empleadoProcesoCierreProvision.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoProcesoCierreProvision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoProcesoCierreProvision,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoProcesoCierreProvision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoProcesoCierreProvision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoProcesoCierreProvision"));

		this.jButtonid_empleadoProcesoCierreProvisionBusqueda= new JButtonMe();
		this.jButtonid_empleadoProcesoCierreProvisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoProcesoCierreProvisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoProcesoCierreProvisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoProcesoCierreProvisionBusqueda.setText("U");
		this.jButtonid_empleadoProcesoCierreProvisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoProcesoCierreProvisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoProcesoCierreProvisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoProcesoCierreProvision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoProcesoCierreProvision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoProcesoCierreProvisionBusqueda"));

		if(this.procesocierreprovisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoProcesoCierreProvisionBusqueda.setVisible(false);		}

		this.jButtonid_empleadoProcesoCierreProvisionUpdate= new JButtonMe();
		this.jButtonid_empleadoProcesoCierreProvisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoProcesoCierreProvisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoProcesoCierreProvisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoProcesoCierreProvisionUpdate.setText("U");
		this.jButtonid_empleadoProcesoCierreProvisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoProcesoCierreProvisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoProcesoCierreProvisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoProcesoCierreProvision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoProcesoCierreProvision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoProcesoCierreProvisionUpdate"));



					
		this.jLabelid_defi_provision_empleadoProcesoCierreProvision = new JLabelMe();
		this.jLabelid_defi_provision_empleadoProcesoCierreProvision.setText(""+ProcesoCierreProvisionConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO+" : *");
		this.jLabelid_defi_provision_empleadoProcesoCierreProvision.setToolTipText("Defi Provision Empleado");
		this.jLabelid_defi_provision_empleadoProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_defi_provision_empleadoProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_defi_provision_empleadoProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_defi_provision_empleadoProcesoCierreProvision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_defi_provision_empleadoProcesoCierreProvision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_defi_provision_empleadoProcesoCierreProvision.setToolTipText(ProcesoCierreProvisionConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO);
		this.gridaBagLayoutProcesoCierreProvision = new GridBagLayout();
		this.jPanelid_defi_provision_empleadoProcesoCierreProvision.setLayout(this.gridaBagLayoutProcesoCierreProvision);


		jComboBoxid_defi_provision_empleadoProcesoCierreProvision= new JComboBoxMe();
		jComboBoxid_defi_provision_empleadoProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_defi_provision_empleadoProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_defi_provision_empleadoProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_defi_provision_empleadoProcesoCierreProvision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_defi_provision_empleadoProcesoCierreProvision= new JButtonMe();
		this.jButtonid_defi_provision_empleadoProcesoCierreProvision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_defi_provision_empleadoProcesoCierreProvision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_defi_provision_empleadoProcesoCierreProvision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_defi_provision_empleadoProcesoCierreProvision.setText("Procesar");
		this.jButtonid_defi_provision_empleadoProcesoCierreProvision.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_defi_provision_empleadoProcesoCierreProvision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_defi_provision_empleadoProcesoCierreProvision,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_defi_provision_empleadoProcesoCierreProvision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_defi_provision_empleadoProcesoCierreProvision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_defi_provision_empleadoProcesoCierreProvision"));

		this.jButtonid_defi_provision_empleadoProcesoCierreProvisionBusqueda= new JButtonMe();
		this.jButtonid_defi_provision_empleadoProcesoCierreProvisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_defi_provision_empleadoProcesoCierreProvisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_defi_provision_empleadoProcesoCierreProvisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_defi_provision_empleadoProcesoCierreProvisionBusqueda.setText("U");
		this.jButtonid_defi_provision_empleadoProcesoCierreProvisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_defi_provision_empleadoProcesoCierreProvisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_defi_provision_empleadoProcesoCierreProvisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_defi_provision_empleadoProcesoCierreProvision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_defi_provision_empleadoProcesoCierreProvision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_defi_provision_empleadoProcesoCierreProvisionBusqueda"));

		if(this.procesocierreprovisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_defi_provision_empleadoProcesoCierreProvisionBusqueda.setVisible(false);		}

		this.jButtonid_defi_provision_empleadoProcesoCierreProvisionUpdate= new JButtonMe();
		this.jButtonid_defi_provision_empleadoProcesoCierreProvisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_defi_provision_empleadoProcesoCierreProvisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_defi_provision_empleadoProcesoCierreProvisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_defi_provision_empleadoProcesoCierreProvisionUpdate.setText("U");
		this.jButtonid_defi_provision_empleadoProcesoCierreProvisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_defi_provision_empleadoProcesoCierreProvisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_defi_provision_empleadoProcesoCierreProvisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_defi_provision_empleadoProcesoCierreProvision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_defi_provision_empleadoProcesoCierreProvision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_defi_provision_empleadoProcesoCierreProvisionUpdate"));



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
		//this.jInternalFrameDetalleProcesoCierreProvision = new ProcesoCierreProvisionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Cierre Provision DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoCierreProvision= new GridBagLayout();
		

		
		String sToolTipProcesoCierreProvision="";
		sToolTipProcesoCierreProvision=ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoCierreProvision+="(Nomina.ProcesoCierreProvision)";
		}
		
		if(!this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoCierreProvision+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoCierreProvision = new JButtonMe();
		this.jButtonModificarProcesoCierreProvision = new JButtonMe();
        this.jButtonActualizarProcesoCierreProvision = new JButtonMe();
        this.jButtonEliminarProcesoCierreProvision = new JButtonMe();
        this.jButtonCancelarProcesoCierreProvision = new JButtonMe();
        this.jButtonGuardarCambiosProcesoCierreProvision = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoCierreProvision = new JButtonMe();
		this.jButtonCerrarProcesoCierreProvision = new JButtonMe();
		
		this.jScrollPanelDatosProcesoCierreProvision = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoCierreProvision = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoCierreProvision = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoCierreProvision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoCierreProvision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoCierreProvision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoCierreProvision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Cierre Provision";
		
		if(!this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Provisiones" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoCierreProvision.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoCierreProvision.setName("jPanelCamposProcesoCierreProvision"); 

		this.jPanelCamposOcultosProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoCierreProvision.setName("jPanelCamposOcultosProcesoCierreProvision"); 

        this.jPanelAccionesProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoCierreProvision.setToolTipText("Acciones");
        this.jPanelAccionesProcesoCierreProvision.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoCierreProvision.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoCierreProvision.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoCierreProvision.setText("Nuevo");
		this.jButtonModificarProcesoCierreProvision.setText("Editar");
        this.jButtonActualizarProcesoCierreProvision.setText("Actualizar");
        this.jButtonEliminarProcesoCierreProvision.setText("Eliminar");
        this.jButtonCancelarProcesoCierreProvision.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoCierreProvision.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoCierreProvision.setText("Guardar");
		this.jButtonCerrarProcesoCierreProvision.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoCierreProvision,"nuevo_button","Nuevo",this.procesocierreprovisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoCierreProvision,"modificar_button","Editar",this.procesocierreprovisionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoCierreProvision,"actualizar_button","Actualizar",this.procesocierreprovisionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoCierreProvision,"eliminar_button","Eliminar",this.procesocierreprovisionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoCierreProvision,"cancelar_button","Cancelar",this.procesocierreprovisionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoCierreProvision,"guardarcambios_button","Guardar",this.procesocierreprovisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoCierreProvision,"guardarcambiostabla_button","Guardar",this.procesocierreprovisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoCierreProvision,"cerrar_button","Salir",this.procesocierreprovisionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoCierreProvision.setToolTipText("Nuevo"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoCierreProvision.setToolTipText("Editar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoCierreProvision.setToolTipText("Actualizar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoCierreProvision.setToolTipText("Eliminar)"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoCierreProvision.setToolTipText("Cancelar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoCierreProvision.setToolTipText("Guardar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoCierreProvision.setToolTipText("Guardar"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoCierreProvision.setToolTipText("Salir"+" "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoCierreProvision";
		inputMap = this.jButtonNuevoProcesoCierreProvision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoCierreProvision.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoCierreProvision"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoCierreProvision";
		inputMap = this.jButtonActualizarProcesoCierreProvision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoCierreProvision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoCierreProvision"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoCierreProvision";
		inputMap = this.jButtonEliminarProcesoCierreProvision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoCierreProvision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoCierreProvision"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoCierreProvision";
		inputMap = this.jButtonCancelarProcesoCierreProvision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoCierreProvision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoCierreProvision"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoCierreProvision";
		inputMap = this.jButtonCerrarProcesoCierreProvision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoCierreProvision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoCierreProvision"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoCierreProvision";
		inputMap = this.jButtonGuardarCambiosTablaProcesoCierreProvision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoCierreProvision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoCierreProvision"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoCierreProvision = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoCierreProvision.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoCierreProvision.setToolTipText("Nuevo ProcesoCierreProvision");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoCierreProvision = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoCierreProvision.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoCierreProvision.setToolTipText("Sin Cerrar Ventana ProcesoCierreProvision");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoCierreProvision = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoCierreProvision.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoCierreProvision.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoCierreProvision = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoCierreProvision.setText("Accion");
		this.jComboBoxTiposAccionesProcesoCierreProvision.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoCierreProvision = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoCierreProvision.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoCierreProvision.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoCierreProvision = new JLabelMe();
		
		this.jLabelAccionesProcesoCierreProvision.setText("Acciones");		
		this.jLabelAccionesProcesoCierreProvision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCierreProvision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCierreProvision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoCierreProvision();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoCierreProvision();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoCierreProvision=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoCierreProvision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoCierreProvision,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoCierreProvision.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCierreProvision.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCierreProvision.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoCierreProvision.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoCierreProvision.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoCierreProvision.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoCierreProvision, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoCierreProvision = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoCierreProvision = new GridBagLayout();
		
		this.jPanelCamposProcesoCierreProvision.setLayout(gridaBagLayoutCamposProcesoCierreProvision);
		this.jPanelCamposOcultosProcesoCierreProvision.setLayout(gridaBagLayoutCamposOcultosProcesoCierreProvision);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
	this.gridBagConstraintsProcesoCierreProvision.gridx = 0;
	this.gridBagConstraintsProcesoCierreProvision.ipadx = 0;
	this.gridBagConstraintsProcesoCierreProvision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoCierreProvision.add(jLabelIdProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);



	this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
	this.gridBagConstraintsProcesoCierreProvision.gridx = 1;
	this.gridBagConstraintsProcesoCierreProvision.ipadx = 0;
	this.gridBagConstraintsProcesoCierreProvision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoCierreProvision.add(jLabelidProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);


	this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
	this.gridBagConstraintsProcesoCierreProvision.gridx = 0;
	this.gridBagConstraintsProcesoCierreProvision.ipadx = 0;
	this.gridBagConstraintsProcesoCierreProvision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioProcesoCierreProvision.add(jLabelid_anioProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
		this.gridBagConstraintsProcesoCierreProvision.gridx = 2;
		this.gridBagConstraintsProcesoCierreProvision.ipadx = 0;
		this.gridBagConstraintsProcesoCierreProvision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioProcesoCierreProvision.add(jButtonid_anioProcesoCierreProvisionBusqueda, this.gridBagConstraintsProcesoCierreProvision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
		this.gridBagConstraintsProcesoCierreProvision.gridx = 3;
		this.gridBagConstraintsProcesoCierreProvision.ipadx = 0;
		this.gridBagConstraintsProcesoCierreProvision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioProcesoCierreProvision.add(jButtonid_anioProcesoCierreProvisionUpdate, this.gridBagConstraintsProcesoCierreProvision);
	}

	this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
	this.gridBagConstraintsProcesoCierreProvision.gridx = 1;
	this.gridBagConstraintsProcesoCierreProvision.ipadx = 0;
	this.gridBagConstraintsProcesoCierreProvision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioProcesoCierreProvision.add(jComboBoxid_anioProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);


	this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
	this.gridBagConstraintsProcesoCierreProvision.gridx = 0;
	this.gridBagConstraintsProcesoCierreProvision.ipadx = 0;
	this.gridBagConstraintsProcesoCierreProvision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraProcesoCierreProvision.add(jLabelid_estructuraProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
		this.gridBagConstraintsProcesoCierreProvision.gridx = 2;
		this.gridBagConstraintsProcesoCierreProvision.ipadx = 0;
		this.gridBagConstraintsProcesoCierreProvision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraProcesoCierreProvision.add(jButtonid_estructuraProcesoCierreProvisionBusqueda, this.gridBagConstraintsProcesoCierreProvision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
		this.gridBagConstraintsProcesoCierreProvision.gridx = 3;
		this.gridBagConstraintsProcesoCierreProvision.ipadx = 0;
		this.gridBagConstraintsProcesoCierreProvision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraProcesoCierreProvision.add(jButtonid_estructuraProcesoCierreProvisionUpdate, this.gridBagConstraintsProcesoCierreProvision);
	}

	this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
	this.gridBagConstraintsProcesoCierreProvision.gridx = 1;
	this.gridBagConstraintsProcesoCierreProvision.ipadx = 0;
	this.gridBagConstraintsProcesoCierreProvision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraProcesoCierreProvision.add(jComboBoxid_estructuraProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);


	this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
	this.gridBagConstraintsProcesoCierreProvision.gridx = 0;
	this.gridBagConstraintsProcesoCierreProvision.ipadx = 0;
	this.gridBagConstraintsProcesoCierreProvision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoProcesoCierreProvision.add(jLabelid_empleadoProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
		this.gridBagConstraintsProcesoCierreProvision.gridx = 2;
		this.gridBagConstraintsProcesoCierreProvision.ipadx = 0;
		this.gridBagConstraintsProcesoCierreProvision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoProcesoCierreProvision.add(jButtonid_empleadoProcesoCierreProvisionBusqueda, this.gridBagConstraintsProcesoCierreProvision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
		this.gridBagConstraintsProcesoCierreProvision.gridx = 3;
		this.gridBagConstraintsProcesoCierreProvision.ipadx = 0;
		this.gridBagConstraintsProcesoCierreProvision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoProcesoCierreProvision.add(jButtonid_empleadoProcesoCierreProvisionUpdate, this.gridBagConstraintsProcesoCierreProvision);
	}

	this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
	this.gridBagConstraintsProcesoCierreProvision.gridx = 1;
	this.gridBagConstraintsProcesoCierreProvision.ipadx = 0;
	this.gridBagConstraintsProcesoCierreProvision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoProcesoCierreProvision.add(jComboBoxid_empleadoProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);


	this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
	this.gridBagConstraintsProcesoCierreProvision.gridx = 0;
	this.gridBagConstraintsProcesoCierreProvision.ipadx = 0;
	this.gridBagConstraintsProcesoCierreProvision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_defi_provision_empleadoProcesoCierreProvision.add(jLabelid_defi_provision_empleadoProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
		this.gridBagConstraintsProcesoCierreProvision.gridx = 2;
		this.gridBagConstraintsProcesoCierreProvision.ipadx = 0;
		this.gridBagConstraintsProcesoCierreProvision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_defi_provision_empleadoProcesoCierreProvision.add(jButtonid_defi_provision_empleadoProcesoCierreProvisionBusqueda, this.gridBagConstraintsProcesoCierreProvision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
		this.gridBagConstraintsProcesoCierreProvision.gridx = 3;
		this.gridBagConstraintsProcesoCierreProvision.ipadx = 0;
		this.gridBagConstraintsProcesoCierreProvision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_defi_provision_empleadoProcesoCierreProvision.add(jButtonid_defi_provision_empleadoProcesoCierreProvisionUpdate, this.gridBagConstraintsProcesoCierreProvision);
	}

	this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
	this.gridBagConstraintsProcesoCierreProvision.gridx = 1;
	this.gridBagConstraintsProcesoCierreProvision.ipadx = 0;
	this.gridBagConstraintsProcesoCierreProvision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_defi_provision_empleadoProcesoCierreProvision.add(jComboBoxid_defi_provision_empleadoProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCierreProvision.gridy = iYPanelCamposProcesoCierreProvision;
	this.gridBagConstraintsProcesoCierreProvision.gridx = iXPanelCamposProcesoCierreProvision++;
	this.gridBagConstraintsProcesoCierreProvision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCierreProvision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCierreProvision.add(this.jPanelidProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);



	if(iXPanelCamposProcesoCierreProvision % 1==0) {
		iXPanelCamposProcesoCierreProvision=0;
		iYPanelCamposProcesoCierreProvision++;
	}
	this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCierreProvision.gridy = iYPanelCamposProcesoCierreProvision;
	this.gridBagConstraintsProcesoCierreProvision.gridx = iXPanelCamposProcesoCierreProvision++;
	this.gridBagConstraintsProcesoCierreProvision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCierreProvision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCierreProvision.add(this.jPanelid_anioProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);



	if(iXPanelCamposProcesoCierreProvision % 1==0) {
		iXPanelCamposProcesoCierreProvision=0;
		iYPanelCamposProcesoCierreProvision++;
	}
	this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCierreProvision.gridy = iYPanelCamposProcesoCierreProvision;
	this.gridBagConstraintsProcesoCierreProvision.gridx = iXPanelCamposProcesoCierreProvision++;
	this.gridBagConstraintsProcesoCierreProvision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCierreProvision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCierreProvision.add(this.jPanelid_estructuraProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);



	if(iXPanelCamposProcesoCierreProvision % 1==0) {
		iXPanelCamposProcesoCierreProvision=0;
		iYPanelCamposProcesoCierreProvision++;
	}
	this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCierreProvision.gridy = iYPanelCamposProcesoCierreProvision;
	this.gridBagConstraintsProcesoCierreProvision.gridx = iXPanelCamposProcesoCierreProvision++;
	this.gridBagConstraintsProcesoCierreProvision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCierreProvision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCierreProvision.add(this.jPanelid_empleadoProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);



	if(iXPanelCamposProcesoCierreProvision % 1==0) {
		iXPanelCamposProcesoCierreProvision=0;
		iYPanelCamposProcesoCierreProvision++;
	}
	this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCierreProvision.gridy = iYPanelCamposProcesoCierreProvision;
	this.gridBagConstraintsProcesoCierreProvision.gridx = iXPanelCamposProcesoCierreProvision++;
	this.gridBagConstraintsProcesoCierreProvision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCierreProvision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCierreProvision.add(this.jPanelid_defi_provision_empleadoProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);



	if(iXPanelCamposProcesoCierreProvision % 1==0) {
		iXPanelCamposProcesoCierreProvision=0;
		iYPanelCamposProcesoCierreProvision++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoCierreProvision= new GridBagLayout();
		this.jPanelAccionesProcesoCierreProvision.setLayout(gridaBagLayoutAccionesProcesoCierreProvision);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoCierreProvision= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoCierreProvision.setLayout(gridaBagLayoutAccionesFormularioProcesoCierreProvision);
		
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoCierreProvision.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoCierreProvision.add(this.jComboBoxTiposAccionesFormularioProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
		this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoCierreProvision.add(this.jButtonModificarProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);							

		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreProvision.gridy = 0;
		this.gridBagConstraintsProcesoCierreProvision.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoCierreProvision.add(this.jButtonEliminarProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
		
			
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.gridy = 0;		
		this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoCierreProvision.add(this.jButtonActualizarProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);


		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.gridy = 0;		
		this.gridBagConstraintsProcesoCierreProvision.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoCierreProvision.add(this.jButtonGuardarCambiosProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);	
		
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.gridy = 0;		
		this.gridBagConstraintsProcesoCierreProvision.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoCierreProvision.add(this.jButtonCancelarProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoCierreProvision = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoCierreProvision);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();						
			this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCierreProvision.gridx = 0;		
			//this.gridBagConstraintsProcesoCierreProvision.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoCierreProvision.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoCierreProvision.gridx =0;
		this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoCierreProvision.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoCierreProvisionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoCierreProvision = new ProcesoCierreProvisionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Cierre Provision DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Cierre Provision DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Cierre Provision Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoCierreProvisionModel procesocierreprovisionModel=new ProcesoCierreProvisionModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoCierreProvisionModel.ProcesoCierreProvisionFocusTraversalPolicy procesocierreprovisionFocusTraversalPolicy = procesocierreprovisionModel.new ProcesoCierreProvisionFocusTraversalPolicy(this);
			
			//procesocierreprovisionFocusTraversalPolicy.setprocesocierreprovisionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesocierreprovisionModel);
			
			
			this.jContentPaneDetalleProcesoCierreProvision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoCierreProvision = new GridBagLayout();	
			this.jContentPaneDetalleProcesoCierreProvision.setLayout(gridaBagLayoutDetalleProcesoCierreProvision);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoCierreProvision = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
				this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoCierreProvision.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoCierreProvision.add(jTtoolBarDetalleProcesoCierreProvision, gridBagConstraintsProcesoCierreProvision);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoCierreProvision=   new JScrollPane(jContentPaneDetalleProcesoCierreProvision,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoCierreProvision.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCierreProvision.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCierreProvision.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoCierreProvision=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoCierreProvision.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCierreProvision.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCierreProvision.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoCierreProvision.gridx = 0;
	        
			this.jContentPaneDetalleProcesoCierreProvision.add(jPanelCamposProcesoCierreProvision, gridBagConstraintsProcesoCierreProvision);
			
			
			
			
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
						//&& procesocierreprovisionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesocierreprovisionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoCierreProvision= new GridBagConstraints();
						this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoCierreProvision.gridx = 0;
						this.jContentPaneDetalleProcesoCierreProvision.add(this.jTabbedPaneRelacionesProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoCierreProvision.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoCierreProvision.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
					this.gridBagConstraintsProcesoCierreProvision.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoCierreProvision.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoCierreProvision.add(jPanelCamposOcultosProcesoCierreProvision, gridBagConstraintsProcesoCierreProvision);
				
					this.jPanelCamposOcultosProcesoCierreProvision.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoCierreProvision.gridx = 0;
	        this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoCierreProvision.add(this.jPanelAccionesFormularioProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);							
			
			
			
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
	        this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoCierreProvision.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoCierreProvision.add(this.jPanelAccionesProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoCierreProvision);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoCierreProvision=   new JScrollPane(this.jPanelCamposProcesoCierreProvision,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoCierreProvision.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCierreProvision.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCierreProvision.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCierreProvision.gridx = 0;
			this.gridBagConstraintsProcesoCierreProvision.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoCierreProvision.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoCierreProvision.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCierreProvision.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);			
			
			this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreProvision.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCierreProvision.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreProvision.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
			
			
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreProvision.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
		
			
		this.gridBagConstraintsProcesoCierreProvision = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreProvision.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreProvision.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoCierreProvision, this.gridBagConstraintsProcesoCierreProvision);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosProcesoCierreProvision.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesProcesoCierreProvision.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoCierreProvision.setVisible(false);
		//this.jComboBoxTiposSeleccionarProcesoCierreProvision.setVisible(false);		
		
		
		
		
		//this.jTtoolBarProcesoCierreProvision.setVisible(false);
			
		this.jMenuItemMostrarOcultarProcesoCierreProvision.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralProcesoCierreProvision;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoCierreProvision;
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
