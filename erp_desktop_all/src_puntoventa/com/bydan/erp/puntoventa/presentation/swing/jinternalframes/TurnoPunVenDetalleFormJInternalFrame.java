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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.TurnoPunVenConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class TurnoPunVenDetalleFormJInternalFrame extends TurnoPunVenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTurnoPunVen;
	
	protected JMenuBar jmenuBarDetalleTurnoPunVen;
	
	protected JMenu jmenuDetalleTurnoPunVen;
	protected JMenu jmenuDetalleArchivoTurnoPunVen;
	protected JMenu jmenuDetalleAccionesTurnoPunVen;
	protected JMenu jmenuDetalleDatosTurnoPunVen;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTurnoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTurnoPunVen;	
	protected GridBagConstraints gridBagConstraintsTurnoPunVen;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TurnoPunVenBeanSwingJInternalFrameAdditional jInternalFrameDetalleTurnoPunVen;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public TurnoPunVenSessionBean turnopunvenSessionBean;
	
	

	public CajaIngresoBeanSwingJInternalFrame cajaingresoBeanSwingJInternalFrame=null;
	public CajaIngresoBeanSwingJInternalFrame cajaingresoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCajaIngreso=false;
	public CajaIngresoSessionBean cajaingresoSessionBean;

	public CajeroTurnoBeanSwingJInternalFrame cajeroturnoBeanSwingJInternalFrame=null;
	public CajeroTurnoBeanSwingJInternalFrame cajeroturnoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCajeroTurno=false;
	public CajeroTurnoSessionBean cajeroturnoSessionBean;

	public CajaEgresoBeanSwingJInternalFrame cajaegresoBeanSwingJInternalFrame=null;
	public CajaEgresoBeanSwingJInternalFrame cajaegresoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCajaEgreso=false;
	public CajaEgresoSessionBean cajaegresoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;	
	
	public TurnoPunVenLogic turnopunvenLogic;
	
	public JScrollPane jScrollPanelDatosTurnoPunVen;
	public JScrollPane jScrollPanelDatosEdicionTurnoPunVen;
	public JScrollPane jScrollPanelDatosGeneralTurnoPunVen;
	
	protected JPanel jPanelCamposTurnoPunVen;    
	protected JPanel jPanelCamposOcultosTurnoPunVen;    	
	protected JPanel jPanelAccionesTurnoPunVen;
	protected JPanel jPanelAccionesFormularioTurnoPunVen;
    
	
	
	protected Integer iXPanelCamposTurnoPunVen=0;
	protected Integer iYPanelCamposTurnoPunVen=0;
	
	protected Integer iXPanelCamposOcultosTurnoPunVen=0;
	protected Integer iYPanelCamposOcultosTurnoPunVen=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTurnoPunVen;
	public JButton jButtonModificarTurnoPunVen;
	public JButton jButtonActualizarTurnoPunVen;
    public JButton jButtonEliminarTurnoPunVen;
	public JButton jButtonCancelarTurnoPunVen;
    public JButton jButtonGuardarCambiosTurnoPunVen;
	public JButton jButtonGuardarCambiosTablaTurnoPunVen;
	protected JButton jButtonCerrarTurnoPunVen;
	
	
	protected JButton jButtonProcesarInformacionTurnoPunVen;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTurnoPunVen;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTurnoPunVen;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTurnoPunVen;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTurnoPunVen;
	protected JButton jButtonModificarToolBarTurnoPunVen;
	protected JButton jButtonActualizarToolBarTurnoPunVen;
    protected JButton jButtonEliminarToolBarTurnoPunVen;
	protected JButton jButtonCancelarToolBarTurnoPunVen;
    protected JButton jButtonGuardarCambiosToolBarTurnoPunVen;
	protected JButton jButtonGuardarCambiosTablaToolBarTurnoPunVen;
	protected JButton jButtonMostrarOcultarTablaToolBarTurnoPunVen;
	protected JButton jButtonCerrarToolBarTurnoPunVen;
	
	protected JButton jButtonProcesarInformacionToolBarTurnoPunVen;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTurnoPunVen;
	protected JMenuItem jMenuItemModificarTurnoPunVen;
	protected JMenuItem jMenuItemActualizarTurnoPunVen;
    protected JMenuItem jMenuItemEliminarTurnoPunVen;
	protected JMenuItem jMenuItemCancelarTurnoPunVen;
    protected JMenuItem jMenuItemGuardarCambiosTurnoPunVen;
	protected JMenuItem jMenuItemGuardarCambiosTablaTurnoPunVen;
	protected JMenuItem jMenuItemCerrarTurnoPunVen;
	protected JMenuItem jMenuItemDetalleCerrarTurnoPunVen;
	protected JMenuItem jMenuItemDetalleMostarOcultarTurnoPunVen;
	
	protected JMenuItem jMenuItemProcesarInformacionTurnoPunVen;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTurnoPunVen;
	protected JMenuItem jMenuItemMostrarOcultarTurnoPunVen;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTurnoPunVen;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTurnoPunVen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTurnoPunVen;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTurnoPunVen;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTurnoPunVen;
	public JLabel jLabelIdTurnoPunVen;
	public JLabel jLabelidTurnoPunVen;
	public JButton jButtonidTurnoPunVenBusqueda= new JButtonMe();

	public JPanel jPanelnombreTurnoPunVen;
	public JLabel jLabelnombreTurnoPunVen;
	public JTextField jTextFieldnombreTurnoPunVen;
	public JButton jButtonnombreTurnoPunVenBusqueda= new JButtonMe();

	public JPanel jPanelhora_inicioTurnoPunVen;
	public JLabel jLabelhora_inicioTurnoPunVen;
	public JSpinner jSpinnerhora_inicioTurnoPunVen= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_inicioTurnoPunVenBusqueda= new JButtonMe();

	public JPanel jPanelhora_finTurnoPunVen;
	public JLabel jLabelhora_finTurnoPunVen;
	public JSpinner jSpinnerhora_finTurnoPunVen= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_finTurnoPunVenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTurnoPunVen;
	public JLabel jLabelid_empresaTurnoPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTurnoPunVen;
	public JButton jButtonid_empresaTurnoPunVen= new JButtonMe();
	public JButton jButtonid_empresaTurnoPunVenUpdate= new JButtonMe();
	public JButton jButtonid_empresaTurnoPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalTurnoPunVen;
	public JLabel jLabelid_sucursalTurnoPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalTurnoPunVen;
	public JButton jButtonid_sucursalTurnoPunVen= new JButtonMe();
	public JButton jButtonid_sucursalTurnoPunVenUpdate= new JButtonMe();
	public JButton jButtonid_sucursalTurnoPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioTurnoPunVen;
	public JLabel jLabelid_usuarioTurnoPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioTurnoPunVen;
	public JButton jButtonid_usuarioTurnoPunVen= new JButtonMe();
	public JButton jButtonid_usuarioTurnoPunVenUpdate= new JButtonMe();
	public JButton jButtonid_usuarioTurnoPunVenBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTurnoPunVen;
	
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
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TurnoPunVenDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTurnoPunVen=new JPanel();
				this.jPanelAccionesFormularioTurnoPunVen=new JPanel();
				this.jmenuBarDetalleTurnoPunVen=new JMenuBar();
				this.jTtoolBarDetalleTurnoPunVen=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TurnoPunVenDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TurnoPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TurnoPunVenDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TurnoPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TurnoPunVenDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TurnoPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TurnoPunVenDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TurnoPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TurnoPunVenDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TurnoPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTurnoPunVen() {
		return this.jButtonActualizarToolBarTurnoPunVen;
	}
	
	public JButton getjButtonEliminarToolBarTurnoPunVen() {
		return this.jButtonEliminarToolBarTurnoPunVen;
	}
	
	public JButton getjButtonCancelarToolBarTurnoPunVen() {
		return this.jButtonCancelarToolBarTurnoPunVen;
	}		
	
	public JButton getjButtonProcesarInformacionTurnoPunVen() {
		return this.jButtonProcesarInformacionTurnoPunVen;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTurnoPunVen)	{
		this.jButtonProcesarInformacionTurnoPunVen = jButtonProcesarInformacionTurnoPunVen;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTurnoPunVen() {
		return this.jComboBoxTiposAccionesTurnoPunVen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTurnoPunVen(
			JComboBox jComboBoxTiposRelacionesTurnoPunVen) {
		this.jComboBoxTiposRelacionesTurnoPunVen = jComboBoxTiposRelacionesTurnoPunVen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTurnoPunVen(
			JComboBox jComboBoxTiposAccionesTurnoPunVen) {
		this.jComboBoxTiposAccionesTurnoPunVen = jComboBoxTiposAccionesTurnoPunVen;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTurnoPunVen() {
		return this.jComboBoxTiposAccionesFormularioTurnoPunVen;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTurnoPunVen(
			JComboBox jComboBoxTiposAccionesFormularioTurnoPunVen) {
		this.jComboBoxTiposAccionesFormularioTurnoPunVen = jComboBoxTiposAccionesFormularioTurnoPunVen;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.turnopunvenSessionBean=new TurnoPunVenSessionBean();
		
		this.turnopunvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.turnopunvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.turnopunvenSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.cajaingresoSessionBean=new CajaIngresoSessionBean();
		//this.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
		//this.cajaegresoSessionBean=new CajaEgresoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TurnoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TurnoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TurnoPunVenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Turno Pun Ven MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
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
	
		TurnoPunVenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTurnoPunVen= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTurnoPunVen=new JButtonMe();
				this.jButtonModificarToolBarTurnoPunVen=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTurnoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTurnoPunVen,this.jTtoolBarDetalleTurnoPunVen,
							"actualizar","actualizar","Actualizar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTurnoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTurnoPunVen,this.jTtoolBarDetalleTurnoPunVen,
							"eliminar","eliminar","Eliminar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTurnoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTurnoPunVen,this.jTtoolBarDetalleTurnoPunVen,
							"cancelar","cancelar","Cancelar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTurnoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTurnoPunVen,this.jTtoolBarDetalleTurnoPunVen,
							"guardarcambios","guardarcambios","Guardar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTurnoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTurnoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTurnoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTurnoPunVen=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTurnoPunVen=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTurnoPunVen=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTurnoPunVen=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTurnoPunVen=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTurnoPunVen= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTurnoPunVen.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTurnoPunVen,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTurnoPunVen= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTurnoPunVen.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTurnoPunVen,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTurnoPunVen= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTurnoPunVen.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTurnoPunVen,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTurnoPunVen= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTurnoPunVen.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTurnoPunVen,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTurnoPunVen= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTurnoPunVen.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTurnoPunVen,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTurnoPunVen= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTurnoPunVen.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTurnoPunVen,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTurnoPunVen= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTurnoPunVen.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTurnoPunVen,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTurnoPunVen= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTurnoPunVen.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTurnoPunVen,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTurnoPunVen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTurnoPunVen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTurnoPunVen,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTurnoPunVen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTurnoPunVen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTurnoPunVen,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTurnoPunVen.add(this.jMenuItemDetalleCerrarTurnoPunVen);
		
		this.jmenuDetalleAccionesTurnoPunVen.add(this.jMenuItemActualizarTurnoPunVen);
		this.jmenuDetalleAccionesTurnoPunVen.add(this.jMenuItemEliminarTurnoPunVen);
		this.jmenuDetalleAccionesTurnoPunVen.add(this.jMenuItemCancelarTurnoPunVen);		
		
		//this.jmenuDetalleDatosTurnoPunVen.add(this.jMenuItemDetalleAbrirOrderByTurnoPunVen);				
		this.jmenuDetalleDatosTurnoPunVen.add(this.jMenuItemDetalleMostarOcultarTurnoPunVen);				
				
		//this.jmenuDetalleAccionesTurnoPunVen.add(this.jMenuItemGuardarCambiosTurnoPunVen);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTurnoPunVen.add(this.jmenuDetalleArchivoTurnoPunVen);		
		this.jmenuBarDetalleTurnoPunVen.add(this.jmenuDetalleAccionesTurnoPunVen);		
		this.jmenuBarDetalleTurnoPunVen.add(this.jmenuDetalleDatosTurnoPunVen);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTurnoPunVen.add(this.jmenuDetalleTurnoPunVen);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTurnoPunVen);				
	}
	
	
	public void inicializarElementosCamposTurnoPunVen() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTurnoPunVen = new JLabelMe();
		jLabelIdTurnoPunVen.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTurnoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTurnoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTurnoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTurnoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTurnoPunVen = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTurnoPunVen.setToolTipText(TurnoPunVenConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTurnoPunVen= new GridBagLayout();

		this.jPanelidTurnoPunVen.setLayout(this.gridaBagLayoutTurnoPunVen);

		jLabelidTurnoPunVen = new JLabel();
		jLabelidTurnoPunVen.setText("Id");

		jLabelidTurnoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTurnoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTurnoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTurnoPunVen = new JLabelMe();
		this.jLabelnombreTurnoPunVen.setText(""+TurnoPunVenConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTurnoPunVen.setToolTipText("Nombre");
		this.jLabelnombreTurnoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTurnoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTurnoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTurnoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTurnoPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTurnoPunVen.setToolTipText(TurnoPunVenConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTurnoPunVen = new GridBagLayout();
		this.jPanelnombreTurnoPunVen.setLayout(this.gridaBagLayoutTurnoPunVen);


		jTextFieldnombreTurnoPunVen= new JTextFieldMe();

		jTextFieldnombreTurnoPunVen.setEnabled(false);
		jTextFieldnombreTurnoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTurnoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTurnoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreTurnoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreTurnoPunVenBusqueda= new JButtonMe();
		this.jButtonnombreTurnoPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTurnoPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTurnoPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTurnoPunVenBusqueda.setText("U");
		this.jButtonnombreTurnoPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTurnoPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTurnoPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreTurnoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreTurnoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTurnoPunVenBusqueda"));

		if(this.turnopunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTurnoPunVenBusqueda.setVisible(false);		}


					
		this.jLabelhora_inicioTurnoPunVen = new JLabelMe();
		this.jLabelhora_inicioTurnoPunVen.setText(""+TurnoPunVenConstantesFunciones.LABEL_HORAINICIO+" : *");
		this.jLabelhora_inicioTurnoPunVen.setToolTipText("Hora Inicio");
		this.jLabelhora_inicioTurnoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_inicioTurnoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_inicioTurnoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_inicioTurnoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_inicioTurnoPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_inicioTurnoPunVen.setToolTipText(TurnoPunVenConstantesFunciones.LABEL_HORAINICIO);
		this.gridaBagLayoutTurnoPunVen = new GridBagLayout();
		this.jPanelhora_inicioTurnoPunVen.setLayout(this.gridaBagLayoutTurnoPunVen);


		//jFormattedTextFieldhora_inicioTurnoPunVen= new JFormattedTextFieldMe();

		jSpinnerhora_inicioTurnoPunVen= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_inicioTurnoPunVen.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_inicioTurnoPunVen = new JSpinner.DateEditor(jSpinnerhora_inicioTurnoPunVen, "HH:mm:ss");

		jSpinnerhora_inicioTurnoPunVen.setEditor(timeEditorhora_inicioTurnoPunVen);

		jSpinnerhora_inicioTurnoPunVen.setValue(new Date());

		jSpinnerhora_inicioTurnoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_inicioTurnoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_inicioTurnoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_inicioTurnoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_inicioTurnoPunVen.setValue(new Date());
		//jSpinnerhora_inicioTurnoPunVen.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_inicioTurnoPunVen.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_inicioTurnoPunVenBusqueda= new JButtonMe();
		this.jButtonhora_inicioTurnoPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_inicioTurnoPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_inicioTurnoPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_inicioTurnoPunVenBusqueda.setText("U");
		this.jButtonhora_inicioTurnoPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_inicioTurnoPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_inicioTurnoPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_inicioTurnoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_inicioTurnoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_inicioTurnoPunVenBusqueda"));

		if(this.turnopunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_inicioTurnoPunVenBusqueda.setVisible(false);		}


					
		this.jLabelhora_finTurnoPunVen = new JLabelMe();
		this.jLabelhora_finTurnoPunVen.setText(""+TurnoPunVenConstantesFunciones.LABEL_HORAFIN+" : *");
		this.jLabelhora_finTurnoPunVen.setToolTipText("Hora Fin");
		this.jLabelhora_finTurnoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_finTurnoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_finTurnoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_finTurnoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_finTurnoPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_finTurnoPunVen.setToolTipText(TurnoPunVenConstantesFunciones.LABEL_HORAFIN);
		this.gridaBagLayoutTurnoPunVen = new GridBagLayout();
		this.jPanelhora_finTurnoPunVen.setLayout(this.gridaBagLayoutTurnoPunVen);


		//jFormattedTextFieldhora_finTurnoPunVen= new JFormattedTextFieldMe();

		jSpinnerhora_finTurnoPunVen= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_finTurnoPunVen.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_finTurnoPunVen = new JSpinner.DateEditor(jSpinnerhora_finTurnoPunVen, "HH:mm:ss");

		jSpinnerhora_finTurnoPunVen.setEditor(timeEditorhora_finTurnoPunVen);

		jSpinnerhora_finTurnoPunVen.setValue(new Date());

		jSpinnerhora_finTurnoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_finTurnoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_finTurnoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_finTurnoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_finTurnoPunVen.setValue(new Date());
		//jSpinnerhora_finTurnoPunVen.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_finTurnoPunVen.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_finTurnoPunVenBusqueda= new JButtonMe();
		this.jButtonhora_finTurnoPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_finTurnoPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_finTurnoPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_finTurnoPunVenBusqueda.setText("U");
		this.jButtonhora_finTurnoPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_finTurnoPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_finTurnoPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_finTurnoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_finTurnoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_finTurnoPunVenBusqueda"));

		if(this.turnopunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_finTurnoPunVenBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTurnoPunVen() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTurnoPunVen = new JLabelMe();
		this.jLabelid_empresaTurnoPunVen.setText(""+TurnoPunVenConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTurnoPunVen.setToolTipText("Empresa");
		this.jLabelid_empresaTurnoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTurnoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTurnoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTurnoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTurnoPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTurnoPunVen.setToolTipText(TurnoPunVenConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTurnoPunVen = new GridBagLayout();
		this.jPanelid_empresaTurnoPunVen.setLayout(this.gridaBagLayoutTurnoPunVen);


		jComboBoxid_empresaTurnoPunVen= new JComboBoxMe();
		jComboBoxid_empresaTurnoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTurnoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTurnoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTurnoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTurnoPunVen.setEnabled(false);

		this.jButtonid_empresaTurnoPunVen= new JButtonMe();
		this.jButtonid_empresaTurnoPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTurnoPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTurnoPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTurnoPunVen.setText("Buscar");
		this.jButtonid_empresaTurnoPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTurnoPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTurnoPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTurnoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTurnoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTurnoPunVen"));

		this.jButtonid_empresaTurnoPunVenBusqueda= new JButtonMe();
		this.jButtonid_empresaTurnoPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTurnoPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTurnoPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTurnoPunVenBusqueda.setText("U");
		this.jButtonid_empresaTurnoPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTurnoPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTurnoPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTurnoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTurnoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTurnoPunVenBusqueda"));

		if(this.turnopunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTurnoPunVenBusqueda.setVisible(false);		}

		this.jButtonid_empresaTurnoPunVenUpdate= new JButtonMe();
		this.jButtonid_empresaTurnoPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTurnoPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTurnoPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTurnoPunVenUpdate.setText("U");
		this.jButtonid_empresaTurnoPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTurnoPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTurnoPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTurnoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTurnoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTurnoPunVenUpdate"));



					
		this.jLabelid_sucursalTurnoPunVen = new JLabelMe();
		this.jLabelid_sucursalTurnoPunVen.setText(""+TurnoPunVenConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalTurnoPunVen.setToolTipText("Sucursal");
		this.jLabelid_sucursalTurnoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTurnoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTurnoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalTurnoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalTurnoPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalTurnoPunVen.setToolTipText(TurnoPunVenConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutTurnoPunVen = new GridBagLayout();
		this.jPanelid_sucursalTurnoPunVen.setLayout(this.gridaBagLayoutTurnoPunVen);


		jComboBoxid_sucursalTurnoPunVen= new JComboBoxMe();
		jComboBoxid_sucursalTurnoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTurnoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTurnoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalTurnoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalTurnoPunVen.setEnabled(false);

		this.jButtonid_sucursalTurnoPunVen= new JButtonMe();
		this.jButtonid_sucursalTurnoPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTurnoPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTurnoPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTurnoPunVen.setText("Buscar");
		this.jButtonid_sucursalTurnoPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalTurnoPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTurnoPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalTurnoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTurnoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTurnoPunVen"));

		this.jButtonid_sucursalTurnoPunVenBusqueda= new JButtonMe();
		this.jButtonid_sucursalTurnoPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTurnoPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTurnoPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTurnoPunVenBusqueda.setText("U");
		this.jButtonid_sucursalTurnoPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalTurnoPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTurnoPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalTurnoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTurnoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTurnoPunVenBusqueda"));

		if(this.turnopunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalTurnoPunVenBusqueda.setVisible(false);		}

		this.jButtonid_sucursalTurnoPunVenUpdate= new JButtonMe();
		this.jButtonid_sucursalTurnoPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTurnoPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTurnoPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTurnoPunVenUpdate.setText("U");
		this.jButtonid_sucursalTurnoPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalTurnoPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTurnoPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalTurnoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTurnoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTurnoPunVenUpdate"));



					
		this.jLabelid_usuarioTurnoPunVen = new JLabelMe();
		this.jLabelid_usuarioTurnoPunVen.setText(""+TurnoPunVenConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioTurnoPunVen.setToolTipText("Usuario");
		this.jLabelid_usuarioTurnoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioTurnoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioTurnoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioTurnoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioTurnoPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioTurnoPunVen.setToolTipText(TurnoPunVenConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutTurnoPunVen = new GridBagLayout();
		this.jPanelid_usuarioTurnoPunVen.setLayout(this.gridaBagLayoutTurnoPunVen);


		jComboBoxid_usuarioTurnoPunVen= new JComboBoxMe();
		jComboBoxid_usuarioTurnoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioTurnoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioTurnoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioTurnoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioTurnoPunVen.setEnabled(false);

		this.jButtonid_usuarioTurnoPunVen= new JButtonMe();
		this.jButtonid_usuarioTurnoPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioTurnoPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioTurnoPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioTurnoPunVen.setText("Buscar");
		this.jButtonid_usuarioTurnoPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioTurnoPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioTurnoPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioTurnoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioTurnoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioTurnoPunVen"));

		this.jButtonid_usuarioTurnoPunVenBusqueda= new JButtonMe();
		this.jButtonid_usuarioTurnoPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioTurnoPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioTurnoPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioTurnoPunVenBusqueda.setText("U");
		this.jButtonid_usuarioTurnoPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioTurnoPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioTurnoPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioTurnoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioTurnoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioTurnoPunVenBusqueda"));

		if(this.turnopunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioTurnoPunVenBusqueda.setVisible(false);		}

		this.jButtonid_usuarioTurnoPunVenUpdate= new JButtonMe();
		this.jButtonid_usuarioTurnoPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioTurnoPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioTurnoPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioTurnoPunVenUpdate.setText("U");
		this.jButtonid_usuarioTurnoPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioTurnoPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioTurnoPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioTurnoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioTurnoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioTurnoPunVenUpdate"));



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
		//this.jInternalFrameDetalleTurnoPunVen = new TurnoPunVenBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Turno Pun Ven DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTurnoPunVen= new GridBagLayout();
		

		
		String sToolTipTurnoPunVen="";
		sToolTipTurnoPunVen=TurnoPunVenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTurnoPunVen+="(PuntoVenta.TurnoPunVen)";
		}
		
		if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipTurnoPunVen+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTurnoPunVen = new JButtonMe();
		this.jButtonModificarTurnoPunVen = new JButtonMe();
        this.jButtonActualizarTurnoPunVen = new JButtonMe();
        this.jButtonEliminarTurnoPunVen = new JButtonMe();
        this.jButtonCancelarTurnoPunVen = new JButtonMe();
        this.jButtonGuardarCambiosTurnoPunVen = new JButtonMe();
		this.jButtonGuardarCambiosTablaTurnoPunVen = new JButtonMe();
		this.jButtonCerrarTurnoPunVen = new JButtonMe();
		
		this.jScrollPanelDatosTurnoPunVen = new JScrollPane();   
        this.jScrollPanelDatosEdicionTurnoPunVen = new JScrollPane();
		this.jScrollPanelDatosGeneralTurnoPunVen = new JScrollPane();
				
		
		
		this.jPanelCamposTurnoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTurnoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTurnoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTurnoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Turno Pun Ven";
		
		if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTurnoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Turno Pun Venes" + this.sPath));
		} else {
			this.jScrollPanelDatosTurnoPunVen.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTurnoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTurnoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTurnoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTurnoPunVen.setName("jPanelCamposTurnoPunVen"); 

		this.jPanelCamposOcultosTurnoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTurnoPunVen.setName("jPanelCamposOcultosTurnoPunVen"); 

        this.jPanelAccionesTurnoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTurnoPunVen.setToolTipText("Acciones");
        this.jPanelAccionesTurnoPunVen.setName("Acciones"); 

		this.jPanelAccionesFormularioTurnoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTurnoPunVen.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTurnoPunVen.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTurnoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTurnoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTurnoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTurnoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTurnoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTurnoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTurnoPunVen.setText("Nuevo");
		this.jButtonModificarTurnoPunVen.setText("Editar");
        this.jButtonActualizarTurnoPunVen.setText("Actualizar");
        this.jButtonEliminarTurnoPunVen.setText("Eliminar");
        this.jButtonCancelarTurnoPunVen.setText("Cancelar");
        this.jButtonGuardarCambiosTurnoPunVen.setText("Guardar");
		this.jButtonGuardarCambiosTablaTurnoPunVen.setText("Guardar");
		this.jButtonCerrarTurnoPunVen.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTurnoPunVen,"nuevo_button","Nuevo",this.turnopunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTurnoPunVen,"modificar_button","Editar",this.turnopunvenSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTurnoPunVen,"actualizar_button","Actualizar",this.turnopunvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTurnoPunVen,"eliminar_button","Eliminar",this.turnopunvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTurnoPunVen,"cancelar_button","Cancelar",this.turnopunvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTurnoPunVen,"guardarcambios_button","Guardar",this.turnopunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTurnoPunVen,"guardarcambiostabla_button","Guardar",this.turnopunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTurnoPunVen,"cerrar_button","Salir",this.turnopunvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTurnoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTurnoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTurnoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTurnoPunVen.setToolTipText("Nuevo"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTurnoPunVen.setToolTipText("Editar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTurnoPunVen.setToolTipText("Actualizar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTurnoPunVen.setToolTipText("Eliminar)"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTurnoPunVen.setToolTipText("Cancelar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTurnoPunVen.setToolTipText("Guardar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTurnoPunVen.setToolTipText("Guardar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTurnoPunVen.setToolTipText("Salir"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTurnoPunVen";
		inputMap = this.jButtonNuevoTurnoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTurnoPunVen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTurnoPunVen"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTurnoPunVen";
		inputMap = this.jButtonActualizarTurnoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTurnoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTurnoPunVen"));
		
		//ELIMINAR
		sMapKey = "EliminarTurnoPunVen";
		inputMap = this.jButtonEliminarTurnoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTurnoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTurnoPunVen"));
		
		//CANCELAR	
		sMapKey = "CancelarTurnoPunVen";
		inputMap = this.jButtonCancelarTurnoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTurnoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTurnoPunVen"));
		
		//CERRAR		
		sMapKey = "CerrarTurnoPunVen";
		inputMap = this.jButtonCerrarTurnoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTurnoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTurnoPunVen"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTurnoPunVen";
		inputMap = this.jButtonGuardarCambiosTablaTurnoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTurnoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTurnoPunVen"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTurnoPunVen = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTurnoPunVen.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTurnoPunVen.setToolTipText("Nuevo TurnoPunVen");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTurnoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTurnoPunVen = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTurnoPunVen.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTurnoPunVen.setToolTipText("Sin Cerrar Ventana TurnoPunVen");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTurnoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTurnoPunVen = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTurnoPunVen.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTurnoPunVen.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTurnoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTurnoPunVen = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTurnoPunVen.setText("Accion");
		this.jComboBoxTiposAccionesTurnoPunVen.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTurnoPunVen = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTurnoPunVen.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTurnoPunVen.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTurnoPunVen = new JLabelMe();
		
		this.jLabelAccionesTurnoPunVen.setText("Acciones");		
		this.jLabelAccionesTurnoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTurnoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTurnoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTurnoPunVen();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTurnoPunVen();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTurnoPunVen=new JTabbedPane();
		this.jTabbedPaneRelacionesTurnoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTurnoPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTurnoPunVen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTurnoPunVen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTurnoPunVen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTurnoPunVen.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTurnoPunVen.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTurnoPunVen.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTurnoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTurnoPunVen = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTurnoPunVen = new GridBagLayout();
		
		this.jPanelCamposTurnoPunVen.setLayout(gridaBagLayoutCamposTurnoPunVen);
		this.jPanelCamposOcultosTurnoPunVen.setLayout(gridaBagLayoutCamposOcultosTurnoPunVen);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
	this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurnoPunVen.gridy = 0;
	this.gridBagConstraintsTurnoPunVen.gridx = 0;
	this.gridBagConstraintsTurnoPunVen.ipadx = 0;
	this.gridBagConstraintsTurnoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTurnoPunVen.add(jLabelIdTurnoPunVen, this.gridBagConstraintsTurnoPunVen);



	this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
	this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurnoPunVen.gridy = 0;
	this.gridBagConstraintsTurnoPunVen.gridx = 1;
	this.gridBagConstraintsTurnoPunVen.ipadx = 0;
	this.gridBagConstraintsTurnoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTurnoPunVen.add(jLabelidTurnoPunVen, this.gridBagConstraintsTurnoPunVen);


	this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
	this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurnoPunVen.gridy = 0;
	this.gridBagConstraintsTurnoPunVen.gridx = 0;
	this.gridBagConstraintsTurnoPunVen.ipadx = 0;
	this.gridBagConstraintsTurnoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTurnoPunVen.add(jLabelid_empresaTurnoPunVen, this.gridBagConstraintsTurnoPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		//this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurnoPunVen.gridy = 0;
		this.gridBagConstraintsTurnoPunVen.gridx = 2;
		this.gridBagConstraintsTurnoPunVen.ipadx = 0;
		this.gridBagConstraintsTurnoPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTurnoPunVen.add(jButtonid_empresaTurnoPunVenBusqueda, this.gridBagConstraintsTurnoPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		//this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurnoPunVen.gridy = 0;
		this.gridBagConstraintsTurnoPunVen.gridx = 3;
		this.gridBagConstraintsTurnoPunVen.ipadx = 0;
		this.gridBagConstraintsTurnoPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTurnoPunVen.add(jButtonid_empresaTurnoPunVenUpdate, this.gridBagConstraintsTurnoPunVen);
	}

	this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
	this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurnoPunVen.gridy = 0;
	this.gridBagConstraintsTurnoPunVen.gridx = 1;
	this.gridBagConstraintsTurnoPunVen.ipadx = 0;
	this.gridBagConstraintsTurnoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTurnoPunVen.add(jComboBoxid_empresaTurnoPunVen, this.gridBagConstraintsTurnoPunVen);


	this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
	this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurnoPunVen.gridy = 0;
	this.gridBagConstraintsTurnoPunVen.gridx = 0;
	this.gridBagConstraintsTurnoPunVen.ipadx = 0;
	this.gridBagConstraintsTurnoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalTurnoPunVen.add(jLabelid_sucursalTurnoPunVen, this.gridBagConstraintsTurnoPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		//this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurnoPunVen.gridy = 0;
		this.gridBagConstraintsTurnoPunVen.gridx = 2;
		this.gridBagConstraintsTurnoPunVen.ipadx = 0;
		this.gridBagConstraintsTurnoPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTurnoPunVen.add(jButtonid_sucursalTurnoPunVenBusqueda, this.gridBagConstraintsTurnoPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		//this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurnoPunVen.gridy = 0;
		this.gridBagConstraintsTurnoPunVen.gridx = 3;
		this.gridBagConstraintsTurnoPunVen.ipadx = 0;
		this.gridBagConstraintsTurnoPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTurnoPunVen.add(jButtonid_sucursalTurnoPunVenUpdate, this.gridBagConstraintsTurnoPunVen);
	}

	this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
	this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurnoPunVen.gridy = 0;
	this.gridBagConstraintsTurnoPunVen.gridx = 1;
	this.gridBagConstraintsTurnoPunVen.ipadx = 0;
	this.gridBagConstraintsTurnoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalTurnoPunVen.add(jComboBoxid_sucursalTurnoPunVen, this.gridBagConstraintsTurnoPunVen);


	this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
	this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurnoPunVen.gridy = 0;
	this.gridBagConstraintsTurnoPunVen.gridx = 0;
	this.gridBagConstraintsTurnoPunVen.ipadx = 0;
	this.gridBagConstraintsTurnoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioTurnoPunVen.add(jLabelid_usuarioTurnoPunVen, this.gridBagConstraintsTurnoPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		//this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurnoPunVen.gridy = 0;
		this.gridBagConstraintsTurnoPunVen.gridx = 2;
		this.gridBagConstraintsTurnoPunVen.ipadx = 0;
		this.gridBagConstraintsTurnoPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioTurnoPunVen.add(jButtonid_usuarioTurnoPunVenBusqueda, this.gridBagConstraintsTurnoPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		//this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurnoPunVen.gridy = 0;
		this.gridBagConstraintsTurnoPunVen.gridx = 3;
		this.gridBagConstraintsTurnoPunVen.ipadx = 0;
		this.gridBagConstraintsTurnoPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioTurnoPunVen.add(jButtonid_usuarioTurnoPunVenUpdate, this.gridBagConstraintsTurnoPunVen);
	}

	this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
	this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurnoPunVen.gridy = 0;
	this.gridBagConstraintsTurnoPunVen.gridx = 1;
	this.gridBagConstraintsTurnoPunVen.ipadx = 0;
	this.gridBagConstraintsTurnoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioTurnoPunVen.add(jComboBoxid_usuarioTurnoPunVen, this.gridBagConstraintsTurnoPunVen);


	this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
	this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurnoPunVen.gridy = 0;
	this.gridBagConstraintsTurnoPunVen.gridx = 0;
	this.gridBagConstraintsTurnoPunVen.ipadx = 0;
	this.gridBagConstraintsTurnoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTurnoPunVen.add(jLabelnombreTurnoPunVen, this.gridBagConstraintsTurnoPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		//this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurnoPunVen.gridy = 0;
		this.gridBagConstraintsTurnoPunVen.gridx = 2;
		this.gridBagConstraintsTurnoPunVen.ipadx = 0;
		this.gridBagConstraintsTurnoPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTurnoPunVen.add(jButtonnombreTurnoPunVenBusqueda, this.gridBagConstraintsTurnoPunVen);
	}

	this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
	this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurnoPunVen.gridy = 0;
	this.gridBagConstraintsTurnoPunVen.gridx = 1;
	this.gridBagConstraintsTurnoPunVen.ipadx = 0;
	this.gridBagConstraintsTurnoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTurnoPunVen.add(jTextFieldnombreTurnoPunVen, this.gridBagConstraintsTurnoPunVen);


	this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
	this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurnoPunVen.gridy = 0;
	this.gridBagConstraintsTurnoPunVen.gridx = 0;
	this.gridBagConstraintsTurnoPunVen.ipadx = 0;
	this.gridBagConstraintsTurnoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_inicioTurnoPunVen.add(jLabelhora_inicioTurnoPunVen, this.gridBagConstraintsTurnoPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		//this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurnoPunVen.gridy = 0;
		this.gridBagConstraintsTurnoPunVen.gridx = 2;
		this.gridBagConstraintsTurnoPunVen.ipadx = 0;
		this.gridBagConstraintsTurnoPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_inicioTurnoPunVen.add(jButtonhora_inicioTurnoPunVenBusqueda, this.gridBagConstraintsTurnoPunVen);
	}

	this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
	this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurnoPunVen.gridy = 0;
	this.gridBagConstraintsTurnoPunVen.gridx = 1;
	this.gridBagConstraintsTurnoPunVen.ipadx = 0;
	this.gridBagConstraintsTurnoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_inicioTurnoPunVen.add(jSpinnerhora_inicioTurnoPunVen, this.gridBagConstraintsTurnoPunVen);


	this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
	this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurnoPunVen.gridy = 0;
	this.gridBagConstraintsTurnoPunVen.gridx = 0;
	this.gridBagConstraintsTurnoPunVen.ipadx = 0;
	this.gridBagConstraintsTurnoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_finTurnoPunVen.add(jLabelhora_finTurnoPunVen, this.gridBagConstraintsTurnoPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		//this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurnoPunVen.gridy = 0;
		this.gridBagConstraintsTurnoPunVen.gridx = 2;
		this.gridBagConstraintsTurnoPunVen.ipadx = 0;
		this.gridBagConstraintsTurnoPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_finTurnoPunVen.add(jButtonhora_finTurnoPunVenBusqueda, this.gridBagConstraintsTurnoPunVen);
	}

	this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
	this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTurnoPunVen.gridy = 0;
	this.gridBagConstraintsTurnoPunVen.gridx = 1;
	this.gridBagConstraintsTurnoPunVen.ipadx = 0;
	this.gridBagConstraintsTurnoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_finTurnoPunVen.add(jSpinnerhora_finTurnoPunVen, this.gridBagConstraintsTurnoPunVen);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
	this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurnoPunVen.gridy = iYPanelCamposTurnoPunVen;
	this.gridBagConstraintsTurnoPunVen.gridx = iXPanelCamposTurnoPunVen++;
	this.gridBagConstraintsTurnoPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurnoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTurnoPunVen.add(this.jPanelidTurnoPunVen, this.gridBagConstraintsTurnoPunVen);



	if(iXPanelCamposTurnoPunVen % 1==0) {
		iXPanelCamposTurnoPunVen=0;
		iYPanelCamposTurnoPunVen++;
	}
	this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
	this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurnoPunVen.gridy = iYPanelCamposTurnoPunVen;
	this.gridBagConstraintsTurnoPunVen.gridx = iXPanelCamposTurnoPunVen++;
	this.gridBagConstraintsTurnoPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurnoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTurnoPunVen.add(this.jPanelnombreTurnoPunVen, this.gridBagConstraintsTurnoPunVen);



	if(iXPanelCamposTurnoPunVen % 1==0) {
		iXPanelCamposTurnoPunVen=0;
		iYPanelCamposTurnoPunVen++;
	}
	this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
	this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurnoPunVen.gridy = iYPanelCamposTurnoPunVen;
	this.gridBagConstraintsTurnoPunVen.gridx = iXPanelCamposTurnoPunVen++;
	this.gridBagConstraintsTurnoPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurnoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTurnoPunVen.add(this.jPanelhora_inicioTurnoPunVen, this.gridBagConstraintsTurnoPunVen);



	if(iXPanelCamposTurnoPunVen % 1==0) {
		iXPanelCamposTurnoPunVen=0;
		iYPanelCamposTurnoPunVen++;
	}
	this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
	this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurnoPunVen.gridy = iYPanelCamposTurnoPunVen;
	this.gridBagConstraintsTurnoPunVen.gridx = iXPanelCamposTurnoPunVen++;
	this.gridBagConstraintsTurnoPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurnoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTurnoPunVen.add(this.jPanelhora_finTurnoPunVen, this.gridBagConstraintsTurnoPunVen);



	if(iXPanelCamposTurnoPunVen % 1==0) {
		iXPanelCamposTurnoPunVen=0;
		iYPanelCamposTurnoPunVen++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
	this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurnoPunVen.gridy = iYPanelCamposOcultosTurnoPunVen;
	this.gridBagConstraintsTurnoPunVen.gridx = iXPanelCamposOcultosTurnoPunVen++;
	this.gridBagConstraintsTurnoPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurnoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTurnoPunVen.add(this.jPanelid_empresaTurnoPunVen, this.gridBagConstraintsTurnoPunVen);



	if(iXPanelCamposOcultosTurnoPunVen % 1==0) {
		iXPanelCamposOcultosTurnoPunVen=0;
		iYPanelCamposOcultosTurnoPunVen++;
	}
	this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
	this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurnoPunVen.gridy = iYPanelCamposOcultosTurnoPunVen;
	this.gridBagConstraintsTurnoPunVen.gridx = iXPanelCamposOcultosTurnoPunVen++;
	this.gridBagConstraintsTurnoPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurnoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTurnoPunVen.add(this.jPanelid_sucursalTurnoPunVen, this.gridBagConstraintsTurnoPunVen);



	if(iXPanelCamposOcultosTurnoPunVen % 1==0) {
		iXPanelCamposOcultosTurnoPunVen=0;
		iYPanelCamposOcultosTurnoPunVen++;
	}
	this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
	this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTurnoPunVen.gridy = iYPanelCamposOcultosTurnoPunVen;
	this.gridBagConstraintsTurnoPunVen.gridx = iXPanelCamposOcultosTurnoPunVen++;
	this.gridBagConstraintsTurnoPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTurnoPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTurnoPunVen.add(this.jPanelid_usuarioTurnoPunVen, this.gridBagConstraintsTurnoPunVen);



	if(iXPanelCamposOcultosTurnoPunVen % 1==0) {
		iXPanelCamposOcultosTurnoPunVen=0;
		iYPanelCamposOcultosTurnoPunVen++;
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
			
		GridBagLayout gridaBagLayoutAccionesTurnoPunVen= new GridBagLayout();
		this.jPanelAccionesTurnoPunVen.setLayout(gridaBagLayoutAccionesTurnoPunVen);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTurnoPunVen= new GridBagLayout();
		this.jPanelAccionesFormularioTurnoPunVen.setLayout(gridaBagLayoutAccionesFormularioTurnoPunVen);
		
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTurnoPunVen.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTurnoPunVen.add(this.jComboBoxTiposAccionesFormularioTurnoPunVen, this.gridBagConstraintsTurnoPunVen);

		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTurnoPunVen.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTurnoPunVen.add(this.jCheckBoxPostAccionNuevoTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.turnopunvenSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTurnoPunVen.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTurnoPunVen.add(this.jCheckBoxPostAccionSinCerrarTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.turnopunvenSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTurnoPunVen.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTurnoPunVen.add(this.jCheckBoxPostAccionSinMensajeTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurnoPunVen.gridy = 0;
		this.gridBagConstraintsTurnoPunVen.gridx = iPosXAccion++;
			
		this.jPanelAccionesTurnoPunVen.add(this.jButtonModificarTurnoPunVen, this.gridBagConstraintsTurnoPunVen);							

		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurnoPunVen.gridy = 0;
		this.gridBagConstraintsTurnoPunVen.gridx =iPosXAccion++;
			
		this.jPanelAccionesTurnoPunVen.add(this.jButtonEliminarTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		
			
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.gridy = 0;		
		this.gridBagConstraintsTurnoPunVen.gridx = iPosXAccion++;
		
		this.jPanelAccionesTurnoPunVen.add(this.jButtonActualizarTurnoPunVen, this.gridBagConstraintsTurnoPunVen);


		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.gridy = 0;		
		this.gridBagConstraintsTurnoPunVen.gridx = iPosXAccion++;
		
		this.jPanelAccionesTurnoPunVen.add(this.jButtonGuardarCambiosTurnoPunVen, this.gridBagConstraintsTurnoPunVen);	
		
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.gridy = 0;		
		this.gridBagConstraintsTurnoPunVen.gridx =iPosXAccion++;
		
		this.jPanelAccionesTurnoPunVen.add(this.jButtonCancelarTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTurnoPunVen = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTurnoPunVen);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.turnopunvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();						
			this.gridBagConstraintsTurnoPunVen.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTurnoPunVen.gridx = 0;		
			//this.gridBagConstraintsTurnoPunVen.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTurnoPunVen.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTurnoPunVen.gridx =0;
		this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTurnoPunVen.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TurnoPunVenJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTurnoPunVen = new TurnoPunVenBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Turno Pun Ven DATOS");
			
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
			
	        //this.setTitle("[FOR] - Turno Pun Ven DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Turno Pun Ven Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TurnoPunVenModel turnopunvenModel=new TurnoPunVenModel(this);
			
			//SI USARA CLASE INTERNA
			//TurnoPunVenModel.TurnoPunVenFocusTraversalPolicy turnopunvenFocusTraversalPolicy = turnopunvenModel.new TurnoPunVenFocusTraversalPolicy(this);
			
			//turnopunvenFocusTraversalPolicy.setturnopunvenJInternalFrame(this);
			
			this.setFocusTraversalPolicy(turnopunvenModel);
			
			
			this.jContentPaneDetalleTurnoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTurnoPunVen = new GridBagLayout();	
			this.jContentPaneDetalleTurnoPunVen.setLayout(gridaBagLayoutDetalleTurnoPunVen);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTurnoPunVen = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
				this.gridBagConstraintsTurnoPunVen.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTurnoPunVen.gridx = 0;
					
				
				this.jContentPaneDetalleTurnoPunVen.add(jTtoolBarDetalleTurnoPunVen, gridBagConstraintsTurnoPunVen);								
				
}
			
			this.jScrollPanelDatosEdicionTurnoPunVen=   new JScrollPane(jContentPaneDetalleTurnoPunVen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTurnoPunVen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTurnoPunVen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTurnoPunVen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTurnoPunVen=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTurnoPunVen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTurnoPunVen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTurnoPunVen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTurnoPunVen.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTurnoPunVen.gridx = 0;
	        
			this.jContentPaneDetalleTurnoPunVen.add(jPanelCamposTurnoPunVen, gridBagConstraintsTurnoPunVen);
			
			
			
			
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
						&& turnopunvenSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCajaEgreso(this.puedeCargarPorParteCajaEgreso,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCajaIngreso(this.puedeCargarPorParteCajaIngreso,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCajeroTurno(this.puedeCargarPorParteCajeroTurno,false,-1);
					
					if(this.turnopunvenSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTurnoPunVen= new GridBagConstraints();
						this.gridBagConstraintsTurnoPunVen.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTurnoPunVen.gridx = 0;
						this.jContentPaneDetalleTurnoPunVen.add(this.jTabbedPaneRelacionesTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTurnoPunVen.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCajaEgreso(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCajaIngreso(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCajeroTurno(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTurnoPunVen.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
					this.gridBagConstraintsTurnoPunVen.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTurnoPunVen.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTurnoPunVen.gridx = 0;
					
				
					this.jContentPaneDetalleTurnoPunVen.add(jPanelCamposOcultosTurnoPunVen, gridBagConstraintsTurnoPunVen);
				
					this.jPanelCamposOcultosTurnoPunVen.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.gridy = iGridyRelaciones++;//10;		
	        this.gridBagConstraintsTurnoPunVen.gridx = 0;
	        this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTurnoPunVen.add(this.jPanelAccionesFormularioTurnoPunVen, this.gridBagConstraintsTurnoPunVen);							
			
			
			
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
	        this.gridBagConstraintsTurnoPunVen.gridy = iGridyRelaciones;//10;		
	        this.gridBagConstraintsTurnoPunVen.gridx = 0;
	        
			
			this.jContentPaneDetalleTurnoPunVen.add(this.jPanelAccionesTurnoPunVen, this.gridBagConstraintsTurnoPunVen);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTurnoPunVen);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTurnoPunVen=   new JScrollPane(this.jPanelCamposTurnoPunVen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTurnoPunVen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTurnoPunVen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTurnoPunVen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTurnoPunVen.gridx = 0;
			this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTurnoPunVen.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTurnoPunVen.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTurnoPunVen, this.gridBagConstraintsTurnoPunVen);			
			
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTurnoPunVen.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTurnoPunVen, this.gridBagConstraintsTurnoPunVen);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTurnoPunVen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
			
			
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTurnoPunVen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		
			
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTurnoPunVen.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTurnoPunVen;//jContentPane;
		
		return jScrollPanelDatosEdicionTurnoPunVen;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCajaEgreso(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cajaegresoSessionBean=new CajaEgresoSessionBean();
		this.cajaegresoSessionBean.setConGuardarRelaciones(false);
		this.cajaegresoSessionBean.setEsGuardarRelacionado(true);

		this.cajaegresoBeanSwingJInternalFrame=null;//new CajaEgresoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cajaegresoBeanSwingJInternalFramePopup=new CajaEgresoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cajaegresoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cajaegresoSessionBean.getEsGuardarRelacionado()) {

				CajaEgresoJInternalFrame.STIPO_TAMANIO_GENERAL=TurnoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL;
				CajaEgresoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TurnoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cajaegresoSessionBean.setEsGuardarRelacionado(true);

				this.cajaegresoBeanSwingJInternalFrame=new CajaEgresoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cajaegresoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cajaegresoBeanSwingJInternalFrame.setcajaegresoSessionBean(this.cajaegresoSessionBean);

				//this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
				//this.gridBagConstraintsTurnoPunVen.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTurnoPunVen.gridx = 0;
				//this.jContentPaneDetalleTurnoPunVen.add(this.cajaegresoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTurnoPunVen);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTurnoPunVen.add("Caja Egresos",this.cajaegresoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTurnoPunVen.setComponentAt(iIndexTab,this.cajaegresoBeanSwingJInternalFrame.getContentPane());
				}

				//CajaEgresoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cajaegresoSessionBean.setEsGuardarRelacionado(false);
				this.cajaegresoBeanSwingJInternalFrame=null;//new CajaEgresoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCajaEgreso) {
					this.jTabbedPaneRelacionesTurnoPunVen.add("Caja Egresos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCajaIngreso(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cajaingresoSessionBean=new CajaIngresoSessionBean();
		this.cajaingresoSessionBean.setConGuardarRelaciones(false);
		this.cajaingresoSessionBean.setEsGuardarRelacionado(true);

		this.cajaingresoBeanSwingJInternalFrame=null;//new CajaIngresoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cajaingresoBeanSwingJInternalFramePopup=new CajaIngresoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cajaingresoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cajaingresoSessionBean.getEsGuardarRelacionado()) {

				CajaIngresoJInternalFrame.STIPO_TAMANIO_GENERAL=TurnoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL;
				CajaIngresoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TurnoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cajaingresoSessionBean.setEsGuardarRelacionado(true);

				this.cajaingresoBeanSwingJInternalFrame=new CajaIngresoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cajaingresoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cajaingresoBeanSwingJInternalFrame.setcajaingresoSessionBean(this.cajaingresoSessionBean);

				//this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
				//this.gridBagConstraintsTurnoPunVen.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTurnoPunVen.gridx = 0;
				//this.jContentPaneDetalleTurnoPunVen.add(this.cajaingresoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTurnoPunVen);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTurnoPunVen.add("Caja Ingresos",this.cajaingresoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTurnoPunVen.setComponentAt(iIndexTab,this.cajaingresoBeanSwingJInternalFrame.getContentPane());
				}

				//CajaIngresoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cajaingresoSessionBean.setEsGuardarRelacionado(false);
				this.cajaingresoBeanSwingJInternalFrame=null;//new CajaIngresoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCajaIngreso) {
					this.jTabbedPaneRelacionesTurnoPunVen.add("Caja Ingresos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCajeroTurno(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
		this.cajeroturnoSessionBean.setConGuardarRelaciones(false);
		this.cajeroturnoSessionBean.setEsGuardarRelacionado(true);

		this.cajeroturnoBeanSwingJInternalFrame=null;//new CajeroTurnoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cajeroturnoBeanSwingJInternalFramePopup=new CajeroTurnoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cajeroturnoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {

				CajeroTurnoJInternalFrame.STIPO_TAMANIO_GENERAL=TurnoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL;
				CajeroTurnoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TurnoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cajeroturnoSessionBean.setEsGuardarRelacionado(true);

				this.cajeroturnoBeanSwingJInternalFrame=new CajeroTurnoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cajeroturnoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cajeroturnoBeanSwingJInternalFrame.setcajeroturnoSessionBean(this.cajeroturnoSessionBean);

				//this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
				//this.gridBagConstraintsTurnoPunVen.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTurnoPunVen.gridx = 0;
				//this.jContentPaneDetalleTurnoPunVen.add(this.cajeroturnoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTurnoPunVen);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTurnoPunVen.add("Cajero Turnos",this.cajeroturnoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTurnoPunVen.setComponentAt(iIndexTab,this.cajeroturnoBeanSwingJInternalFrame.getContentPane());
				}

				//CajeroTurnoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cajeroturnoSessionBean.setEsGuardarRelacionado(false);
				this.cajeroturnoBeanSwingJInternalFrame=null;//new CajeroTurnoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCajeroTurno) {
					this.jTabbedPaneRelacionesTurnoPunVen.add("Cajero Turnos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarCajaIngresoBeanSwingJInternalFrame(List<TurnoPunVen> turnopunvens,TurnoPunVen turnopunven,CajaIngresoBeanSwingJInternalFrame cajaingresoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cajaingresoBeanSwingJInternalFrame=new CajaIngresoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cajaingresoBeanSwingJInternalFrame.getCajaIngresoLogic().setConnexion(this.turnopunvenLogic.getConnexion());

					cajaingresoBeanSwingJInternalFrame.setturnopunvensForeignKey(turnopunvens);
					cajaingresoBeanSwingJInternalFrame.setturnopunvenForeignKey(turnopunven);
					cajaingresoBeanSwingJInternalFrame.cajaingresoSessionBean.setisBusquedaDesdeForeignKeySesionTurnoPunVen(true);
					cajaingresoBeanSwingJInternalFrame.cajaingresoSessionBean.setlidTurnoPunVenActual(turnopunven.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cajaingresoBeanSwingJInternalFrame.cargarCombosForeignKeyCajaIngreso(cajaingresoBeanSwingJInternalFrame.isCargarCombosDependencia);
					cajaingresoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTurnoPunVen(true);
					cajaingresoBeanSwingJInternalFrame.setid_turno_pun_venFK_IdTurnoPunVen(turnopunven.getId());

					if(!this.conCargarFormDetalle) {
						cajaingresoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cajaingresoBeanSwingJInternalFrame.setSelectedItemCombosFrameTurnoPunVenForeignKey(turnopunven,1,false,true,true);
					cajaingresoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cajaingresoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTurnoPunVen");
					cajaingresoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTurnoPunVen");
					cajaingresoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajaIngreso(true);
					cajaingresoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCajaIngreso("n",cajaingresoBeanSwingJInternalFrame.isGuardarCambiosEnLote, cajaingresoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cajaingresoBeanSwingJInternalFrame.setAutoscrolls(true);
					cajaingresoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cajaingresoBeanSwingJInternalFrame.actualizarEstadoPanelsCajaIngreso("relacionado");
					} else {
						cajaingresoBeanSwingJInternalFrame.actualizarEstadoPanelsCajaIngreso("no_relacionado");
					}

					cajaingresoBeanSwingJInternalFrame.getjButtonRecargarInformacionCajaIngreso().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCajeroTurnoBeanSwingJInternalFrame(List<TurnoPunVen> turnopunvens,TurnoPunVen turnopunven,CajeroTurnoBeanSwingJInternalFrame cajeroturnoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cajeroturnoBeanSwingJInternalFrame=new CajeroTurnoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cajeroturnoBeanSwingJInternalFrame.getCajeroTurnoLogic().setConnexion(this.turnopunvenLogic.getConnexion());

					cajeroturnoBeanSwingJInternalFrame.setturnopunvensForeignKey(turnopunvens);
					cajeroturnoBeanSwingJInternalFrame.setturnopunvenForeignKey(turnopunven);
					cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.setisBusquedaDesdeForeignKeySesionTurnoPunVen(true);
					cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.setlidTurnoPunVenActual(turnopunven.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cajeroturnoBeanSwingJInternalFrame.cargarCombosForeignKeyCajeroTurno(cajeroturnoBeanSwingJInternalFrame.isCargarCombosDependencia);
					cajeroturnoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTurnoPunVen(true);
					cajeroturnoBeanSwingJInternalFrame.setid_turno_pun_venFK_IdTurnoPunVen(turnopunven.getId());

					if(!this.conCargarFormDetalle) {
						cajeroturnoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cajeroturnoBeanSwingJInternalFrame.setSelectedItemCombosFrameTurnoPunVenForeignKey(turnopunven,1,false,true,true);
					cajeroturnoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cajeroturnoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTurnoPunVen");
					cajeroturnoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTurnoPunVen");
					cajeroturnoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajeroTurno(true);
					cajeroturnoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCajeroTurno("n",cajeroturnoBeanSwingJInternalFrame.isGuardarCambiosEnLote, cajeroturnoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cajeroturnoBeanSwingJInternalFrame.setAutoscrolls(true);
					cajeroturnoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cajeroturnoBeanSwingJInternalFrame.actualizarEstadoPanelsCajeroTurno("relacionado");
					} else {
						cajeroturnoBeanSwingJInternalFrame.actualizarEstadoPanelsCajeroTurno("no_relacionado");
					}

					cajeroturnoBeanSwingJInternalFrame.getjButtonRecargarInformacionCajeroTurno().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCajaEgresoBeanSwingJInternalFrame(List<TurnoPunVen> turnopunvens,TurnoPunVen turnopunven,CajaEgresoBeanSwingJInternalFrame cajaegresoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cajaegresoBeanSwingJInternalFrame=new CajaEgresoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cajaegresoBeanSwingJInternalFrame.getCajaEgresoLogic().setConnexion(this.turnopunvenLogic.getConnexion());

					cajaegresoBeanSwingJInternalFrame.setturnopunvensForeignKey(turnopunvens);
					cajaegresoBeanSwingJInternalFrame.setturnopunvenForeignKey(turnopunven);
					cajaegresoBeanSwingJInternalFrame.cajaegresoSessionBean.setisBusquedaDesdeForeignKeySesionTurnoPunVen(true);
					cajaegresoBeanSwingJInternalFrame.cajaegresoSessionBean.setlidTurnoPunVenActual(turnopunven.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cajaegresoBeanSwingJInternalFrame.cargarCombosForeignKeyCajaEgreso(cajaegresoBeanSwingJInternalFrame.isCargarCombosDependencia);
					cajaegresoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTurnoPunVen(true);
					cajaegresoBeanSwingJInternalFrame.setid_turno_pun_venFK_IdTurnoPunVen(turnopunven.getId());

					if(!this.conCargarFormDetalle) {
						cajaegresoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cajaegresoBeanSwingJInternalFrame.setSelectedItemCombosFrameTurnoPunVenForeignKey(turnopunven,1,false,true,true);
					cajaegresoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cajaegresoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTurnoPunVen");
					cajaegresoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTurnoPunVen");
					cajaegresoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajaEgreso(true);
					cajaegresoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCajaEgreso("n",cajaegresoBeanSwingJInternalFrame.isGuardarCambiosEnLote, cajaegresoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cajaegresoBeanSwingJInternalFrame.setAutoscrolls(true);
					cajaegresoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cajaegresoBeanSwingJInternalFrame.actualizarEstadoPanelsCajaEgreso("relacionado");
					} else {
						cajaegresoBeanSwingJInternalFrame.actualizarEstadoPanelsCajaEgreso("no_relacionado");
					}

					cajaegresoBeanSwingJInternalFrame.getjButtonRecargarInformacionCajaEgreso().setVisible(false);

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
