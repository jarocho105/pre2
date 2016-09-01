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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.seguridad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.report.*;
import com.bydan.erp.seguridad.util.report.ProcesoCambiarEmpresaSucursalConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.report.*;
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
public class ProcesoCambiarEmpresaSucursalDetalleFormJInternalFrame extends ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoCambiarEmpresaSucursal;
	
	protected JMenuBar jmenuBarDetalleProcesoCambiarEmpresaSucursal;
	
	protected JMenu jmenuDetalleProcesoCambiarEmpresaSucursal;
	protected JMenu jmenuDetalleArchivoProcesoCambiarEmpresaSucursal;
	protected JMenu jmenuDetalleAccionesProcesoCambiarEmpresaSucursal;
	protected JMenu jmenuDetalleDatosProcesoCambiarEmpresaSucursal;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoCambiarEmpresaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoCambiarEmpresaSucursal;	
	protected GridBagConstraints gridBagConstraintsProcesoCambiarEmpresaSucursal;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoCambiarEmpresaSucursal;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public ProcesoCambiarEmpresaSucursalSessionBean procesocambiarempresasucursalSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;	
	
	public ProcesoCambiarEmpresaSucursalLogic procesocambiarempresasucursalLogic;
	
	public JScrollPane jScrollPanelDatosProcesoCambiarEmpresaSucursal;
	public JScrollPane jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal;
	public JScrollPane jScrollPanelDatosGeneralProcesoCambiarEmpresaSucursal;
	
	protected JPanel jPanelCamposProcesoCambiarEmpresaSucursal;    
	protected JPanel jPanelCamposOcultosProcesoCambiarEmpresaSucursal;    	
	protected JPanel jPanelAccionesProcesoCambiarEmpresaSucursal;
	protected JPanel jPanelAccionesFormularioProcesoCambiarEmpresaSucursal;
    
	
	
	protected Integer iXPanelCamposProcesoCambiarEmpresaSucursal=0;
	protected Integer iYPanelCamposProcesoCambiarEmpresaSucursal=0;
	
	protected Integer iXPanelCamposOcultosProcesoCambiarEmpresaSucursal=0;
	protected Integer iYPanelCamposOcultosProcesoCambiarEmpresaSucursal=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoCambiarEmpresaSucursal;
	public JButton jButtonModificarProcesoCambiarEmpresaSucursal;
	public JButton jButtonActualizarProcesoCambiarEmpresaSucursal;
    public JButton jButtonEliminarProcesoCambiarEmpresaSucursal;
	public JButton jButtonCancelarProcesoCambiarEmpresaSucursal;
    public JButton jButtonGuardarCambiosProcesoCambiarEmpresaSucursal;
	public JButton jButtonGuardarCambiosTablaProcesoCambiarEmpresaSucursal;
	protected JButton jButtonCerrarProcesoCambiarEmpresaSucursal;
	
	
	protected JButton jButtonProcesarInformacionProcesoCambiarEmpresaSucursal;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoCambiarEmpresaSucursal;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoCambiarEmpresaSucursal;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoCambiarEmpresaSucursal;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoCambiarEmpresaSucursal;
	protected JButton jButtonModificarToolBarProcesoCambiarEmpresaSucursal;
	protected JButton jButtonActualizarToolBarProcesoCambiarEmpresaSucursal;
    protected JButton jButtonEliminarToolBarProcesoCambiarEmpresaSucursal;
	protected JButton jButtonCancelarToolBarProcesoCambiarEmpresaSucursal;
    protected JButton jButtonGuardarCambiosToolBarProcesoCambiarEmpresaSucursal;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoCambiarEmpresaSucursal;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoCambiarEmpresaSucursal;
	protected JButton jButtonCerrarToolBarProcesoCambiarEmpresaSucursal;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoCambiarEmpresaSucursal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemModificarProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemActualizarProcesoCambiarEmpresaSucursal;
    protected JMenuItem jMenuItemEliminarProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemCancelarProcesoCambiarEmpresaSucursal;
    protected JMenuItem jMenuItemGuardarCambiosProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemCerrarProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemDetalleCerrarProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoCambiarEmpresaSucursal;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoCambiarEmpresaSucursal;
	protected JMenuItem jMenuItemMostrarOcultarProcesoCambiarEmpresaSucursal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoCambiarEmpresaSucursal;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoCambiarEmpresaSucursal;
	public JLabel jLabelIdProcesoCambiarEmpresaSucursal;
	public JLabel jLabelidProcesoCambiarEmpresaSucursal;
	public JButton jButtonidProcesoCambiarEmpresaSucursalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProcesoCambiarEmpresaSucursal;
	public JLabel jLabelid_empresaProcesoCambiarEmpresaSucursal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProcesoCambiarEmpresaSucursal;
	public JButton jButtonid_empresaProcesoCambiarEmpresaSucursal= new JButtonMe();
	public JButton jButtonid_empresaProcesoCambiarEmpresaSucursalUpdate= new JButtonMe();
	public JButton jButtonid_empresaProcesoCambiarEmpresaSucursalBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProcesoCambiarEmpresaSucursal;
	public JLabel jLabelid_sucursalProcesoCambiarEmpresaSucursal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProcesoCambiarEmpresaSucursal;
	public JButton jButtonid_sucursalProcesoCambiarEmpresaSucursal= new JButtonMe();
	public JButton jButtonid_sucursalProcesoCambiarEmpresaSucursalUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProcesoCambiarEmpresaSucursalBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoCambiarEmpresaSucursal;
	
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
	public int iHeightFormulario=154;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoCambiarEmpresaSucursalDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoCambiarEmpresaSucursal=new JPanel();
				this.jPanelAccionesFormularioProcesoCambiarEmpresaSucursal=new JPanel();
				this.jmenuBarDetalleProcesoCambiarEmpresaSucursal=new JMenuBar();
				this.jTtoolBarDetalleProcesoCambiarEmpresaSucursal=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCambiarEmpresaSucursalDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoCambiarEmpresaSucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoCambiarEmpresaSucursalDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoCambiarEmpresaSucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCambiarEmpresaSucursalDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCambiarEmpresaSucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCambiarEmpresaSucursalDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCambiarEmpresaSucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCambiarEmpresaSucursalDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoCambiarEmpresaSucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoCambiarEmpresaSucursal() {
		return this.jButtonActualizarToolBarProcesoCambiarEmpresaSucursal;
	}
	
	public JButton getjButtonEliminarToolBarProcesoCambiarEmpresaSucursal() {
		return this.jButtonEliminarToolBarProcesoCambiarEmpresaSucursal;
	}
	
	public JButton getjButtonCancelarToolBarProcesoCambiarEmpresaSucursal() {
		return this.jButtonCancelarToolBarProcesoCambiarEmpresaSucursal;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoCambiarEmpresaSucursal() {
		return this.jButtonProcesarInformacionProcesoCambiarEmpresaSucursal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoCambiarEmpresaSucursal)	{
		this.jButtonProcesarInformacionProcesoCambiarEmpresaSucursal = jButtonProcesarInformacionProcesoCambiarEmpresaSucursal;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoCambiarEmpresaSucursal() {
		return this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal(
			JComboBox jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal) {
		this.jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal = jComboBoxTiposRelacionesProcesoCambiarEmpresaSucursal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoCambiarEmpresaSucursal(
			JComboBox jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal) {
		this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal = jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal() {
		return this.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal(
			JComboBox jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal) {
		this.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal = jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesocambiarempresasucursalSessionBean=new ProcesoCambiarEmpresaSucursalSessionBean();
		
		this.procesocambiarempresasucursalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocambiarempresasucursalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoCambiarEmpresaSucursalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoCambiarEmpresaSucursalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoCambiarEmpresaSucursalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Cambiar Empresa Sucursal MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoCambiarEmpresaSucursalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoCambiarEmpresaSucursal= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoCambiarEmpresaSucursal=new JButtonMe();
				this.jButtonModificarToolBarProcesoCambiarEmpresaSucursal=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoCambiarEmpresaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoCambiarEmpresaSucursal,this.jTtoolBarDetalleProcesoCambiarEmpresaSucursal,
							"actualizar","actualizar","Actualizar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoCambiarEmpresaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoCambiarEmpresaSucursal,this.jTtoolBarDetalleProcesoCambiarEmpresaSucursal,
							"eliminar","eliminar","Eliminar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoCambiarEmpresaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoCambiarEmpresaSucursal,this.jTtoolBarDetalleProcesoCambiarEmpresaSucursal,
							"cancelar","cancelar","Cancelar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoCambiarEmpresaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoCambiarEmpresaSucursal,this.jTtoolBarDetalleProcesoCambiarEmpresaSucursal,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoCambiarEmpresaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoCambiarEmpresaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoCambiarEmpresaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoCambiarEmpresaSucursal=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoCambiarEmpresaSucursal=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoCambiarEmpresaSucursal=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoCambiarEmpresaSucursal=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoCambiarEmpresaSucursal=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoCambiarEmpresaSucursal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoCambiarEmpresaSucursal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoCambiarEmpresaSucursal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoCambiarEmpresaSucursal= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoCambiarEmpresaSucursal.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoCambiarEmpresaSucursal,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoCambiarEmpresaSucursal= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoCambiarEmpresaSucursal.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoCambiarEmpresaSucursal,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoCambiarEmpresaSucursal= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoCambiarEmpresaSucursal.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoCambiarEmpresaSucursal,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoCambiarEmpresaSucursal= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoCambiarEmpresaSucursal.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoCambiarEmpresaSucursal,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoCambiarEmpresaSucursal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoCambiarEmpresaSucursal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoCambiarEmpresaSucursal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoCambiarEmpresaSucursal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoCambiarEmpresaSucursal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoCambiarEmpresaSucursal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoCambiarEmpresaSucursal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoCambiarEmpresaSucursal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoCambiarEmpresaSucursal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoCambiarEmpresaSucursal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoCambiarEmpresaSucursal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoCambiarEmpresaSucursal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoCambiarEmpresaSucursal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoCambiarEmpresaSucursal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoCambiarEmpresaSucursal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoCambiarEmpresaSucursal.add(this.jMenuItemDetalleCerrarProcesoCambiarEmpresaSucursal);
		
		this.jmenuDetalleAccionesProcesoCambiarEmpresaSucursal.add(this.jMenuItemActualizarProcesoCambiarEmpresaSucursal);
		this.jmenuDetalleAccionesProcesoCambiarEmpresaSucursal.add(this.jMenuItemEliminarProcesoCambiarEmpresaSucursal);
		this.jmenuDetalleAccionesProcesoCambiarEmpresaSucursal.add(this.jMenuItemCancelarProcesoCambiarEmpresaSucursal);		
		
		//this.jmenuDetalleDatosProcesoCambiarEmpresaSucursal.add(this.jMenuItemDetalleAbrirOrderByProcesoCambiarEmpresaSucursal);				
		this.jmenuDetalleDatosProcesoCambiarEmpresaSucursal.add(this.jMenuItemDetalleMostarOcultarProcesoCambiarEmpresaSucursal);				
				
		//this.jmenuDetalleAccionesProcesoCambiarEmpresaSucursal.add(this.jMenuItemGuardarCambiosProcesoCambiarEmpresaSucursal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoCambiarEmpresaSucursal.add(this.jmenuDetalleArchivoProcesoCambiarEmpresaSucursal);		
		this.jmenuBarDetalleProcesoCambiarEmpresaSucursal.add(this.jmenuDetalleAccionesProcesoCambiarEmpresaSucursal);		
		this.jmenuBarDetalleProcesoCambiarEmpresaSucursal.add(this.jmenuDetalleDatosProcesoCambiarEmpresaSucursal);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoCambiarEmpresaSucursal);				
	}
	
	
	public void inicializarElementosCamposProcesoCambiarEmpresaSucursal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoCambiarEmpresaSucursal = new JLabelMe();
		jLabelIdProcesoCambiarEmpresaSucursal.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoCambiarEmpresaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoCambiarEmpresaSucursal = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoCambiarEmpresaSucursal.setToolTipText(ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoCambiarEmpresaSucursal= new GridBagLayout();

		this.jPanelidProcesoCambiarEmpresaSucursal.setLayout(this.gridaBagLayoutProcesoCambiarEmpresaSucursal);

		jLabelidProcesoCambiarEmpresaSucursal = new JLabel();
		jLabelidProcesoCambiarEmpresaSucursal.setText("Id");

		jLabelidProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysProcesoCambiarEmpresaSucursal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProcesoCambiarEmpresaSucursal = new JLabelMe();
		this.jLabelid_empresaProcesoCambiarEmpresaSucursal.setText(""+ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProcesoCambiarEmpresaSucursal.setToolTipText("Empresa");
		this.jLabelid_empresaProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProcesoCambiarEmpresaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProcesoCambiarEmpresaSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProcesoCambiarEmpresaSucursal.setToolTipText(ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProcesoCambiarEmpresaSucursal = new GridBagLayout();
		this.jPanelid_empresaProcesoCambiarEmpresaSucursal.setLayout(this.gridaBagLayoutProcesoCambiarEmpresaSucursal);


		jComboBoxid_empresaProcesoCambiarEmpresaSucursal= new JComboBoxMe();
		jComboBoxid_empresaProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProcesoCambiarEmpresaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProcesoCambiarEmpresaSucursal.setEnabled(false);

		this.jButtonid_empresaProcesoCambiarEmpresaSucursal= new JButtonMe();
		this.jButtonid_empresaProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProcesoCambiarEmpresaSucursal.setText("Procesar");
		this.jButtonid_empresaProcesoCambiarEmpresaSucursal.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProcesoCambiarEmpresaSucursal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoCambiarEmpresaSucursal,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProcesoCambiarEmpresaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoCambiarEmpresaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoCambiarEmpresaSucursal"));

		this.jButtonid_empresaProcesoCambiarEmpresaSucursalBusqueda= new JButtonMe();
		this.jButtonid_empresaProcesoCambiarEmpresaSucursalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoCambiarEmpresaSucursalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoCambiarEmpresaSucursalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProcesoCambiarEmpresaSucursalBusqueda.setText("U");
		this.jButtonid_empresaProcesoCambiarEmpresaSucursalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProcesoCambiarEmpresaSucursalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoCambiarEmpresaSucursalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProcesoCambiarEmpresaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoCambiarEmpresaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoCambiarEmpresaSucursalBusqueda"));

		if(this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProcesoCambiarEmpresaSucursalBusqueda.setVisible(false);		}

		this.jButtonid_empresaProcesoCambiarEmpresaSucursalUpdate= new JButtonMe();
		this.jButtonid_empresaProcesoCambiarEmpresaSucursalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoCambiarEmpresaSucursalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProcesoCambiarEmpresaSucursalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProcesoCambiarEmpresaSucursalUpdate.setText("U");
		this.jButtonid_empresaProcesoCambiarEmpresaSucursalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProcesoCambiarEmpresaSucursalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProcesoCambiarEmpresaSucursalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProcesoCambiarEmpresaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProcesoCambiarEmpresaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProcesoCambiarEmpresaSucursalUpdate"));



					
		this.jLabelid_sucursalProcesoCambiarEmpresaSucursal = new JLabelMe();
		this.jLabelid_sucursalProcesoCambiarEmpresaSucursal.setText(""+ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProcesoCambiarEmpresaSucursal.setToolTipText("Sucursal");
		this.jLabelid_sucursalProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProcesoCambiarEmpresaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProcesoCambiarEmpresaSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProcesoCambiarEmpresaSucursal.setToolTipText(ProcesoCambiarEmpresaSucursalConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProcesoCambiarEmpresaSucursal = new GridBagLayout();
		this.jPanelid_sucursalProcesoCambiarEmpresaSucursal.setLayout(this.gridaBagLayoutProcesoCambiarEmpresaSucursal);


		jComboBoxid_sucursalProcesoCambiarEmpresaSucursal= new JComboBoxMe();
		jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProcesoCambiarEmpresaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.setEnabled(false);

		this.jButtonid_sucursalProcesoCambiarEmpresaSucursal= new JButtonMe();
		this.jButtonid_sucursalProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProcesoCambiarEmpresaSucursal.setText("Procesar");
		this.jButtonid_sucursalProcesoCambiarEmpresaSucursal.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProcesoCambiarEmpresaSucursal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoCambiarEmpresaSucursal,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoCambiarEmpresaSucursal"));

		this.jButtonid_sucursalProcesoCambiarEmpresaSucursalBusqueda= new JButtonMe();
		this.jButtonid_sucursalProcesoCambiarEmpresaSucursalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoCambiarEmpresaSucursalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoCambiarEmpresaSucursalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProcesoCambiarEmpresaSucursalBusqueda.setText("U");
		this.jButtonid_sucursalProcesoCambiarEmpresaSucursalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProcesoCambiarEmpresaSucursalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoCambiarEmpresaSucursalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoCambiarEmpresaSucursalBusqueda"));

		if(this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProcesoCambiarEmpresaSucursalBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProcesoCambiarEmpresaSucursalUpdate= new JButtonMe();
		this.jButtonid_sucursalProcesoCambiarEmpresaSucursalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoCambiarEmpresaSucursalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProcesoCambiarEmpresaSucursalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProcesoCambiarEmpresaSucursalUpdate.setText("U");
		this.jButtonid_sucursalProcesoCambiarEmpresaSucursalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProcesoCambiarEmpresaSucursalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProcesoCambiarEmpresaSucursalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProcesoCambiarEmpresaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProcesoCambiarEmpresaSucursalUpdate"));



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
		//this.jInternalFrameDetalleProcesoCambiarEmpresaSucursal = new ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Cambiar Empresa Sucursal DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoCambiarEmpresaSucursal= new GridBagLayout();
		

		
		String sToolTipProcesoCambiarEmpresaSucursal="";
		sToolTipProcesoCambiarEmpresaSucursal=ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoCambiarEmpresaSucursal+="(Seguridad.ProcesoCambiarEmpresaSucursal)";
		}
		
		if(!this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoCambiarEmpresaSucursal+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoCambiarEmpresaSucursal = new JButtonMe();
		this.jButtonModificarProcesoCambiarEmpresaSucursal = new JButtonMe();
        this.jButtonActualizarProcesoCambiarEmpresaSucursal = new JButtonMe();
        this.jButtonEliminarProcesoCambiarEmpresaSucursal = new JButtonMe();
        this.jButtonCancelarProcesoCambiarEmpresaSucursal = new JButtonMe();
        this.jButtonGuardarCambiosProcesoCambiarEmpresaSucursal = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoCambiarEmpresaSucursal = new JButtonMe();
		this.jButtonCerrarProcesoCambiarEmpresaSucursal = new JButtonMe();
		
		this.jScrollPanelDatosProcesoCambiarEmpresaSucursal = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoCambiarEmpresaSucursal = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoCambiarEmpresaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoCambiarEmpresaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoCambiarEmpresaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoCambiarEmpresaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Cambiar Empresa Sucursal";
		
		if(!this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cambiar Empresa Sucursales" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoCambiarEmpresaSucursal.setName("jPanelCamposProcesoCambiarEmpresaSucursal"); 

		this.jPanelCamposOcultosProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoCambiarEmpresaSucursal.setName("jPanelCamposOcultosProcesoCambiarEmpresaSucursal"); 

        this.jPanelAccionesProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoCambiarEmpresaSucursal.setToolTipText("Acciones");
        this.jPanelAccionesProcesoCambiarEmpresaSucursal.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoCambiarEmpresaSucursal.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoCambiarEmpresaSucursal.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoCambiarEmpresaSucursal.setText("Nuevo");
		this.jButtonModificarProcesoCambiarEmpresaSucursal.setText("Editar");
        this.jButtonActualizarProcesoCambiarEmpresaSucursal.setText("Actualizar");
        this.jButtonEliminarProcesoCambiarEmpresaSucursal.setText("Eliminar");
        this.jButtonCancelarProcesoCambiarEmpresaSucursal.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoCambiarEmpresaSucursal.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoCambiarEmpresaSucursal.setText("Guardar");
		this.jButtonCerrarProcesoCambiarEmpresaSucursal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoCambiarEmpresaSucursal,"nuevo_button","Nuevo",this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoCambiarEmpresaSucursal,"modificar_button","Editar",this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoCambiarEmpresaSucursal,"actualizar_button","Actualizar",this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoCambiarEmpresaSucursal,"eliminar_button","Eliminar",this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoCambiarEmpresaSucursal,"cancelar_button","Cancelar",this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoCambiarEmpresaSucursal,"guardarcambios_button","Guardar",this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoCambiarEmpresaSucursal,"guardarcambiostabla_button","Guardar",this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoCambiarEmpresaSucursal,"cerrar_button","Salir",this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoCambiarEmpresaSucursal.setToolTipText("Nuevo"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoCambiarEmpresaSucursal.setToolTipText("Editar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoCambiarEmpresaSucursal.setToolTipText("Actualizar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoCambiarEmpresaSucursal.setToolTipText("Eliminar)"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoCambiarEmpresaSucursal.setToolTipText("Cancelar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoCambiarEmpresaSucursal.setToolTipText("Guardar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoCambiarEmpresaSucursal.setToolTipText("Guardar"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoCambiarEmpresaSucursal.setToolTipText("Salir"+" "+ProcesoCambiarEmpresaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonNuevoProcesoCambiarEmpresaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoCambiarEmpresaSucursal"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonActualizarProcesoCambiarEmpresaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoCambiarEmpresaSucursal"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonEliminarProcesoCambiarEmpresaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoCambiarEmpresaSucursal"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonCancelarProcesoCambiarEmpresaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoCambiarEmpresaSucursal"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonCerrarProcesoCambiarEmpresaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoCambiarEmpresaSucursal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoCambiarEmpresaSucursal";
		inputMap = this.jButtonGuardarCambiosTablaProcesoCambiarEmpresaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoCambiarEmpresaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoCambiarEmpresaSucursal"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoCambiarEmpresaSucursal = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoCambiarEmpresaSucursal.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoCambiarEmpresaSucursal.setToolTipText("Nuevo ProcesoCambiarEmpresaSucursal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoCambiarEmpresaSucursal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoCambiarEmpresaSucursal.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoCambiarEmpresaSucursal.setToolTipText("Sin Cerrar Ventana ProcesoCambiarEmpresaSucursal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoCambiarEmpresaSucursal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoCambiarEmpresaSucursal.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoCambiarEmpresaSucursal.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.setText("Accion");
		this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoCambiarEmpresaSucursal = new JLabelMe();
		
		this.jLabelAccionesProcesoCambiarEmpresaSucursal.setText("Acciones");		
		this.jLabelAccionesProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoCambiarEmpresaSucursal();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoCambiarEmpresaSucursal();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoCambiarEmpresaSucursal=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoCambiarEmpresaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoCambiarEmpresaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoCambiarEmpresaSucursal = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoCambiarEmpresaSucursal = new GridBagLayout();
		
		this.jPanelCamposProcesoCambiarEmpresaSucursal.setLayout(gridaBagLayoutCamposProcesoCambiarEmpresaSucursal);
		this.jPanelCamposOcultosProcesoCambiarEmpresaSucursal.setLayout(gridaBagLayoutCamposOcultosProcesoCambiarEmpresaSucursal);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 0;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoCambiarEmpresaSucursal.add(jLabelIdProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);



	this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 0;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 1;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoCambiarEmpresaSucursal.add(jLabelidProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);


	this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 0;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProcesoCambiarEmpresaSucursal.add(jLabelid_empresaProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 0;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 2;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.ipadx = 0;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProcesoCambiarEmpresaSucursal.add(jButtonid_empresaProcesoCambiarEmpresaSucursalBusqueda, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 0;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 3;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.ipadx = 0;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProcesoCambiarEmpresaSucursal.add(jButtonid_empresaProcesoCambiarEmpresaSucursalUpdate, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
	}

	this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 0;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 1;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProcesoCambiarEmpresaSucursal.add(jComboBoxid_empresaProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);


	this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 0;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProcesoCambiarEmpresaSucursal.add(jLabelid_sucursalProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 0;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 2;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.ipadx = 0;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProcesoCambiarEmpresaSucursal.add(jButtonid_sucursalProcesoCambiarEmpresaSucursalBusqueda, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 0;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 3;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.ipadx = 0;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProcesoCambiarEmpresaSucursal.add(jButtonid_sucursalProcesoCambiarEmpresaSucursalUpdate, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
	}

	this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 0;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 1;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProcesoCambiarEmpresaSucursal.add(jComboBoxid_sucursalProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iYPanelCamposProcesoCambiarEmpresaSucursal;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iXPanelCamposProcesoCambiarEmpresaSucursal++;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCambiarEmpresaSucursal.add(this.jPanelidProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);



	if(iXPanelCamposProcesoCambiarEmpresaSucursal % 1==0) {
		iXPanelCamposProcesoCambiarEmpresaSucursal=0;
		iYPanelCamposProcesoCambiarEmpresaSucursal++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iYPanelCamposOcultosProcesoCambiarEmpresaSucursal;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iXPanelCamposOcultosProcesoCambiarEmpresaSucursal++;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoCambiarEmpresaSucursal.add(this.jPanelid_empresaProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);



	if(iXPanelCamposOcultosProcesoCambiarEmpresaSucursal % 1==0) {
		iXPanelCamposOcultosProcesoCambiarEmpresaSucursal=0;
		iYPanelCamposOcultosProcesoCambiarEmpresaSucursal++;
	}
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iYPanelCamposOcultosProcesoCambiarEmpresaSucursal;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iXPanelCamposOcultosProcesoCambiarEmpresaSucursal++;
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCambiarEmpresaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoCambiarEmpresaSucursal.add(this.jPanelid_sucursalProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);



	if(iXPanelCamposOcultosProcesoCambiarEmpresaSucursal % 1==0) {
		iXPanelCamposOcultosProcesoCambiarEmpresaSucursal=0;
		iYPanelCamposOcultosProcesoCambiarEmpresaSucursal++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoCambiarEmpresaSucursal= new GridBagLayout();
		this.jPanelAccionesProcesoCambiarEmpresaSucursal.setLayout(gridaBagLayoutAccionesProcesoCambiarEmpresaSucursal);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoCambiarEmpresaSucursal= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoCambiarEmpresaSucursal.setLayout(gridaBagLayoutAccionesFormularioProcesoCambiarEmpresaSucursal);
		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoCambiarEmpresaSucursal.add(this.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 0;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoCambiarEmpresaSucursal.add(this.jButtonModificarProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);							

		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 0;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoCambiarEmpresaSucursal.add(this.jButtonEliminarProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
		
			
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 0;		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoCambiarEmpresaSucursal.add(this.jButtonActualizarProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);


		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 0;		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoCambiarEmpresaSucursal.add(this.jButtonGuardarCambiosProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);	
		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = 0;		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoCambiarEmpresaSucursal.add(this.jButtonCancelarProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoCambiarEmpresaSucursal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoCambiarEmpresaSucursal);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesocambiarempresasucursalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();						
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;		
			//this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx =0;
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoCambiarEmpresaSucursal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoCambiarEmpresaSucursalJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoCambiarEmpresaSucursal = new ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Cambiar Empresa Sucursal DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Cambiar Empresa Sucursal DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Cambiar Empresa Sucursal Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoCambiarEmpresaSucursalModel procesocambiarempresasucursalModel=new ProcesoCambiarEmpresaSucursalModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoCambiarEmpresaSucursalModel.ProcesoCambiarEmpresaSucursalFocusTraversalPolicy procesocambiarempresasucursalFocusTraversalPolicy = procesocambiarempresasucursalModel.new ProcesoCambiarEmpresaSucursalFocusTraversalPolicy(this);
			
			//procesocambiarempresasucursalFocusTraversalPolicy.setprocesocambiarempresasucursalJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesocambiarempresasucursalModel);
			
			
			this.jContentPaneDetalleProcesoCambiarEmpresaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoCambiarEmpresaSucursal = new GridBagLayout();	
			this.jContentPaneDetalleProcesoCambiarEmpresaSucursal.setLayout(gridaBagLayoutDetalleProcesoCambiarEmpresaSucursal);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoCambiarEmpresaSucursal = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
				this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoCambiarEmpresaSucursal.add(jTtoolBarDetalleProcesoCambiarEmpresaSucursal, gridBagConstraintsProcesoCambiarEmpresaSucursal);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal=   new JScrollPane(jContentPaneDetalleProcesoCambiarEmpresaSucursal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoCambiarEmpresaSucursal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;
	        
			this.jContentPaneDetalleProcesoCambiarEmpresaSucursal.add(jPanelCamposProcesoCambiarEmpresaSucursal, gridBagConstraintsProcesoCambiarEmpresaSucursal);
			
			
			
			
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
						//&& procesocambiarempresasucursalSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesocambiarempresasucursalSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoCambiarEmpresaSucursal= new GridBagConstraints();
						this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;
						this.jContentPaneDetalleProcesoCambiarEmpresaSucursal.add(this.jTabbedPaneRelacionesProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoCambiarEmpresaSucursal.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoCambiarEmpresaSucursal.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
					this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoCambiarEmpresaSucursal.add(jPanelCamposOcultosProcesoCambiarEmpresaSucursal, gridBagConstraintsProcesoCambiarEmpresaSucursal);
				
					this.jPanelCamposOcultosProcesoCambiarEmpresaSucursal.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;
	        this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoCambiarEmpresaSucursal.add(this.jPanelAccionesFormularioProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);							
			
			
			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
	        this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoCambiarEmpresaSucursal.add(this.jPanelAccionesProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal=   new JScrollPane(this.jPanelCamposProcesoCambiarEmpresaSucursal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);			
			
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
			
			
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
		
			
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarEmpresaSucursal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoCambiarEmpresaSucursal, this.gridBagConstraintsProcesoCambiarEmpresaSucursal);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosProcesoCambiarEmpresaSucursal.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesProcesoCambiarEmpresaSucursal.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoCambiarEmpresaSucursal.setVisible(false);
		//this.jComboBoxTiposSeleccionarProcesoCambiarEmpresaSucursal.setVisible(false);		
		
		
		
		
		//this.jTtoolBarProcesoCambiarEmpresaSucursal.setVisible(false);
			
		this.jMenuItemMostrarOcultarProcesoCambiarEmpresaSucursal.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralProcesoCambiarEmpresaSucursal;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoCambiarEmpresaSucursal;
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
