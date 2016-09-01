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
import com.bydan.erp.puntoventa.util.TarjetaCreditoConexionConstantesFunciones;

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
public class TarjetaCreditoConexionDetalleFormJInternalFrame extends TarjetaCreditoConexionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTarjetaCreditoConexion;
	
	protected JMenuBar jmenuBarDetalleTarjetaCreditoConexion;
	
	protected JMenu jmenuDetalleTarjetaCreditoConexion;
	protected JMenu jmenuDetalleArchivoTarjetaCreditoConexion;
	protected JMenu jmenuDetalleAccionesTarjetaCreditoConexion;
	protected JMenu jmenuDetalleDatosTarjetaCreditoConexion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTarjetaCreditoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTarjetaCreditoConexion;	
	protected GridBagConstraints gridBagConstraintsTarjetaCreditoConexion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TarjetaCreditoConexionBeanSwingJInternalFrameAdditional jInternalFrameDetalleTarjetaCreditoConexion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tarjetacredito="";

	protected ConexionBeanSwingJInternalFrame conexionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_conexion="";
	
	public TarjetaCreditoConexionSessionBean tarjetacreditoconexionSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TarjetaCreditoSessionBean tarjetacreditoSessionBean;
	public ConexionSessionBean conexionSessionBean;	
	
	public TarjetaCreditoConexionLogic tarjetacreditoconexionLogic;
	
	public JScrollPane jScrollPanelDatosTarjetaCreditoConexion;
	public JScrollPane jScrollPanelDatosEdicionTarjetaCreditoConexion;
	public JScrollPane jScrollPanelDatosGeneralTarjetaCreditoConexion;
	
	protected JPanel jPanelCamposTarjetaCreditoConexion;    
	protected JPanel jPanelCamposOcultosTarjetaCreditoConexion;    	
	protected JPanel jPanelAccionesTarjetaCreditoConexion;
	protected JPanel jPanelAccionesFormularioTarjetaCreditoConexion;
    
	
	
	protected Integer iXPanelCamposTarjetaCreditoConexion=0;
	protected Integer iYPanelCamposTarjetaCreditoConexion=0;
	
	protected Integer iXPanelCamposOcultosTarjetaCreditoConexion=0;
	protected Integer iYPanelCamposOcultosTarjetaCreditoConexion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTarjetaCreditoConexion;
	public JButton jButtonModificarTarjetaCreditoConexion;
	public JButton jButtonActualizarTarjetaCreditoConexion;
    public JButton jButtonEliminarTarjetaCreditoConexion;
	public JButton jButtonCancelarTarjetaCreditoConexion;
    public JButton jButtonGuardarCambiosTarjetaCreditoConexion;
	public JButton jButtonGuardarCambiosTablaTarjetaCreditoConexion;
	protected JButton jButtonCerrarTarjetaCreditoConexion;
	
	
	protected JButton jButtonProcesarInformacionTarjetaCreditoConexion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTarjetaCreditoConexion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTarjetaCreditoConexion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTarjetaCreditoConexion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTarjetaCreditoConexion;
	protected JButton jButtonModificarToolBarTarjetaCreditoConexion;
	protected JButton jButtonActualizarToolBarTarjetaCreditoConexion;
    protected JButton jButtonEliminarToolBarTarjetaCreditoConexion;
	protected JButton jButtonCancelarToolBarTarjetaCreditoConexion;
    protected JButton jButtonGuardarCambiosToolBarTarjetaCreditoConexion;
	protected JButton jButtonGuardarCambiosTablaToolBarTarjetaCreditoConexion;
	protected JButton jButtonMostrarOcultarTablaToolBarTarjetaCreditoConexion;
	protected JButton jButtonCerrarToolBarTarjetaCreditoConexion;
	
	protected JButton jButtonProcesarInformacionToolBarTarjetaCreditoConexion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTarjetaCreditoConexion;
	protected JMenuItem jMenuItemModificarTarjetaCreditoConexion;
	protected JMenuItem jMenuItemActualizarTarjetaCreditoConexion;
    protected JMenuItem jMenuItemEliminarTarjetaCreditoConexion;
	protected JMenuItem jMenuItemCancelarTarjetaCreditoConexion;
    protected JMenuItem jMenuItemGuardarCambiosTarjetaCreditoConexion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTarjetaCreditoConexion;
	protected JMenuItem jMenuItemCerrarTarjetaCreditoConexion;
	protected JMenuItem jMenuItemDetalleCerrarTarjetaCreditoConexion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTarjetaCreditoConexion;
	
	protected JMenuItem jMenuItemProcesarInformacionTarjetaCreditoConexion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTarjetaCreditoConexion;
	protected JMenuItem jMenuItemMostrarOcultarTarjetaCreditoConexion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTarjetaCreditoConexion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTarjetaCreditoConexion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTarjetaCreditoConexion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTarjetaCreditoConexion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTarjetaCreditoConexion;
	public JLabel jLabelIdTarjetaCreditoConexion;
	public JLabel jLabelidTarjetaCreditoConexion;
	public JButton jButtonidTarjetaCreditoConexionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTarjetaCreditoConexion;
	public JLabel jLabelid_empresaTarjetaCreditoConexion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTarjetaCreditoConexion;
	public JButton jButtonid_empresaTarjetaCreditoConexion= new JButtonMe();
	public JButton jButtonid_empresaTarjetaCreditoConexionUpdate= new JButtonMe();
	public JButton jButtonid_empresaTarjetaCreditoConexionBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalTarjetaCreditoConexion;
	public JLabel jLabelid_sucursalTarjetaCreditoConexion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalTarjetaCreditoConexion;
	public JButton jButtonid_sucursalTarjetaCreditoConexion= new JButtonMe();
	public JButton jButtonid_sucursalTarjetaCreditoConexionUpdate= new JButtonMe();
	public JButton jButtonid_sucursalTarjetaCreditoConexionBusqueda= new JButtonMe();

	public JPanel jPanelid_tarjeta_creditoTarjetaCreditoConexion;
	public JLabel jLabelid_tarjeta_creditoTarjetaCreditoConexion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tarjeta_creditoTarjetaCreditoConexion;
	public JButton jButtonid_tarjeta_creditoTarjetaCreditoConexion= new JButtonMe();
	public JButton jButtonid_tarjeta_creditoTarjetaCreditoConexionUpdate= new JButtonMe();
	public JButton jButtonid_tarjeta_creditoTarjetaCreditoConexionBusqueda= new JButtonMe();

	public JPanel jPanelid_conexionTarjetaCreditoConexion;
	public JLabel jLabelid_conexionTarjetaCreditoConexion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_conexionTarjetaCreditoConexion;
	public JButton jButtonid_conexionTarjetaCreditoConexion= new JButtonMe();
	public JButton jButtonid_conexionTarjetaCreditoConexionUpdate= new JButtonMe();
	public JButton jButtonid_conexionTarjetaCreditoConexionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTarjetaCreditoConexion;
	
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
	public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TarjetaCreditoConexionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTarjetaCreditoConexion=new JPanel();
				this.jPanelAccionesFormularioTarjetaCreditoConexion=new JPanel();
				this.jmenuBarDetalleTarjetaCreditoConexion=new JMenuBar();
				this.jTtoolBarDetalleTarjetaCreditoConexion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetaCreditoConexionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TarjetaCreditoConexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TarjetaCreditoConexionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TarjetaCreditoConexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetaCreditoConexionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TarjetaCreditoConexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetaCreditoConexionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TarjetaCreditoConexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetaCreditoConexionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TarjetaCreditoConexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTarjetaCreditoConexion() {
		return this.jButtonActualizarToolBarTarjetaCreditoConexion;
	}
	
	public JButton getjButtonEliminarToolBarTarjetaCreditoConexion() {
		return this.jButtonEliminarToolBarTarjetaCreditoConexion;
	}
	
	public JButton getjButtonCancelarToolBarTarjetaCreditoConexion() {
		return this.jButtonCancelarToolBarTarjetaCreditoConexion;
	}		
	
	public JButton getjButtonProcesarInformacionTarjetaCreditoConexion() {
		return this.jButtonProcesarInformacionTarjetaCreditoConexion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTarjetaCreditoConexion)	{
		this.jButtonProcesarInformacionTarjetaCreditoConexion = jButtonProcesarInformacionTarjetaCreditoConexion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTarjetaCreditoConexion() {
		return this.jComboBoxTiposAccionesTarjetaCreditoConexion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTarjetaCreditoConexion(
			JComboBox jComboBoxTiposRelacionesTarjetaCreditoConexion) {
		this.jComboBoxTiposRelacionesTarjetaCreditoConexion = jComboBoxTiposRelacionesTarjetaCreditoConexion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTarjetaCreditoConexion(
			JComboBox jComboBoxTiposAccionesTarjetaCreditoConexion) {
		this.jComboBoxTiposAccionesTarjetaCreditoConexion = jComboBoxTiposAccionesTarjetaCreditoConexion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTarjetaCreditoConexion() {
		return this.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTarjetaCreditoConexion(
			JComboBox jComboBoxTiposAccionesFormularioTarjetaCreditoConexion) {
		this.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion = jComboBoxTiposAccionesFormularioTarjetaCreditoConexion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tarjetacreditoconexionSessionBean=new TarjetaCreditoConexionSessionBean();
		
		this.tarjetacreditoconexionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tarjetacreditoconexionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TarjetaCreditoConexionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TarjetaCreditoConexionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TarjetaCreditoConexionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tarjeta Credito Conexion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
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
	
		TarjetaCreditoConexionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTarjetaCreditoConexion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTarjetaCreditoConexion=new JButtonMe();
				this.jButtonModificarToolBarTarjetaCreditoConexion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTarjetaCreditoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTarjetaCreditoConexion,this.jTtoolBarDetalleTarjetaCreditoConexion,
							"actualizar","actualizar","Actualizar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTarjetaCreditoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTarjetaCreditoConexion,this.jTtoolBarDetalleTarjetaCreditoConexion,
							"eliminar","eliminar","Eliminar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTarjetaCreditoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTarjetaCreditoConexion,this.jTtoolBarDetalleTarjetaCreditoConexion,
							"cancelar","cancelar","Cancelar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTarjetaCreditoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTarjetaCreditoConexion,this.jTtoolBarDetalleTarjetaCreditoConexion,
							"guardarcambios","guardarcambios","Guardar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTarjetaCreditoConexion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTarjetaCreditoConexion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTarjetaCreditoConexion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTarjetaCreditoConexion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTarjetaCreditoConexion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTarjetaCreditoConexion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTarjetaCreditoConexion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTarjetaCreditoConexion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTarjetaCreditoConexion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTarjetaCreditoConexion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTarjetaCreditoConexion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTarjetaCreditoConexion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTarjetaCreditoConexion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTarjetaCreditoConexion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTarjetaCreditoConexion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTarjetaCreditoConexion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTarjetaCreditoConexion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTarjetaCreditoConexion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTarjetaCreditoConexion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTarjetaCreditoConexion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTarjetaCreditoConexion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTarjetaCreditoConexion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTarjetaCreditoConexion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTarjetaCreditoConexion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTarjetaCreditoConexion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTarjetaCreditoConexion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTarjetaCreditoConexion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTarjetaCreditoConexion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTarjetaCreditoConexion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTarjetaCreditoConexion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTarjetaCreditoConexion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTarjetaCreditoConexion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTarjetaCreditoConexion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTarjetaCreditoConexion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTarjetaCreditoConexion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTarjetaCreditoConexion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTarjetaCreditoConexion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTarjetaCreditoConexion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTarjetaCreditoConexion.add(this.jMenuItemDetalleCerrarTarjetaCreditoConexion);
		
		this.jmenuDetalleAccionesTarjetaCreditoConexion.add(this.jMenuItemActualizarTarjetaCreditoConexion);
		this.jmenuDetalleAccionesTarjetaCreditoConexion.add(this.jMenuItemEliminarTarjetaCreditoConexion);
		this.jmenuDetalleAccionesTarjetaCreditoConexion.add(this.jMenuItemCancelarTarjetaCreditoConexion);		
		
		//this.jmenuDetalleDatosTarjetaCreditoConexion.add(this.jMenuItemDetalleAbrirOrderByTarjetaCreditoConexion);				
		this.jmenuDetalleDatosTarjetaCreditoConexion.add(this.jMenuItemDetalleMostarOcultarTarjetaCreditoConexion);				
				
		//this.jmenuDetalleAccionesTarjetaCreditoConexion.add(this.jMenuItemGuardarCambiosTarjetaCreditoConexion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTarjetaCreditoConexion.add(this.jmenuDetalleArchivoTarjetaCreditoConexion);		
		this.jmenuBarDetalleTarjetaCreditoConexion.add(this.jmenuDetalleAccionesTarjetaCreditoConexion);		
		this.jmenuBarDetalleTarjetaCreditoConexion.add(this.jmenuDetalleDatosTarjetaCreditoConexion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTarjetaCreditoConexion);				
	}
	
	
	public void inicializarElementosCamposTarjetaCreditoConexion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTarjetaCreditoConexion = new JLabelMe();
		jLabelIdTarjetaCreditoConexion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTarjetaCreditoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTarjetaCreditoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTarjetaCreditoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTarjetaCreditoConexion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTarjetaCreditoConexion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTarjetaCreditoConexion.setToolTipText(TarjetaCreditoConexionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTarjetaCreditoConexion= new GridBagLayout();

		this.jPanelidTarjetaCreditoConexion.setLayout(this.gridaBagLayoutTarjetaCreditoConexion);

		jLabelidTarjetaCreditoConexion = new JLabel();
		jLabelidTarjetaCreditoConexion.setText("Id");

		jLabelidTarjetaCreditoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTarjetaCreditoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTarjetaCreditoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysTarjetaCreditoConexion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTarjetaCreditoConexion = new JLabelMe();
		this.jLabelid_empresaTarjetaCreditoConexion.setText(""+TarjetaCreditoConexionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTarjetaCreditoConexion.setToolTipText("Empresa");
		this.jLabelid_empresaTarjetaCreditoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTarjetaCreditoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTarjetaCreditoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTarjetaCreditoConexion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTarjetaCreditoConexion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTarjetaCreditoConexion.setToolTipText(TarjetaCreditoConexionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTarjetaCreditoConexion = new GridBagLayout();
		this.jPanelid_empresaTarjetaCreditoConexion.setLayout(this.gridaBagLayoutTarjetaCreditoConexion);


		jComboBoxid_empresaTarjetaCreditoConexion= new JComboBoxMe();
		jComboBoxid_empresaTarjetaCreditoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTarjetaCreditoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTarjetaCreditoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTarjetaCreditoConexion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTarjetaCreditoConexion.setEnabled(false);

		this.jButtonid_empresaTarjetaCreditoConexion= new JButtonMe();
		this.jButtonid_empresaTarjetaCreditoConexion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTarjetaCreditoConexion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTarjetaCreditoConexion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTarjetaCreditoConexion.setText("Buscar");
		this.jButtonid_empresaTarjetaCreditoConexion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTarjetaCreditoConexion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTarjetaCreditoConexion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTarjetaCreditoConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTarjetaCreditoConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTarjetaCreditoConexion"));

		this.jButtonid_empresaTarjetaCreditoConexionBusqueda= new JButtonMe();
		this.jButtonid_empresaTarjetaCreditoConexionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTarjetaCreditoConexionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTarjetaCreditoConexionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTarjetaCreditoConexionBusqueda.setText("U");
		this.jButtonid_empresaTarjetaCreditoConexionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTarjetaCreditoConexionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTarjetaCreditoConexionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTarjetaCreditoConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTarjetaCreditoConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTarjetaCreditoConexionBusqueda"));

		if(this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTarjetaCreditoConexionBusqueda.setVisible(false);		}

		this.jButtonid_empresaTarjetaCreditoConexionUpdate= new JButtonMe();
		this.jButtonid_empresaTarjetaCreditoConexionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTarjetaCreditoConexionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTarjetaCreditoConexionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTarjetaCreditoConexionUpdate.setText("U");
		this.jButtonid_empresaTarjetaCreditoConexionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTarjetaCreditoConexionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTarjetaCreditoConexionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTarjetaCreditoConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTarjetaCreditoConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTarjetaCreditoConexionUpdate"));



					
		this.jLabelid_sucursalTarjetaCreditoConexion = new JLabelMe();
		this.jLabelid_sucursalTarjetaCreditoConexion.setText(""+TarjetaCreditoConexionConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalTarjetaCreditoConexion.setToolTipText("Sucursal");
		this.jLabelid_sucursalTarjetaCreditoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTarjetaCreditoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTarjetaCreditoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalTarjetaCreditoConexion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalTarjetaCreditoConexion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalTarjetaCreditoConexion.setToolTipText(TarjetaCreditoConexionConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutTarjetaCreditoConexion = new GridBagLayout();
		this.jPanelid_sucursalTarjetaCreditoConexion.setLayout(this.gridaBagLayoutTarjetaCreditoConexion);


		jComboBoxid_sucursalTarjetaCreditoConexion= new JComboBoxMe();
		jComboBoxid_sucursalTarjetaCreditoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTarjetaCreditoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTarjetaCreditoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalTarjetaCreditoConexion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalTarjetaCreditoConexion.setEnabled(false);

		this.jButtonid_sucursalTarjetaCreditoConexion= new JButtonMe();
		this.jButtonid_sucursalTarjetaCreditoConexion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTarjetaCreditoConexion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTarjetaCreditoConexion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTarjetaCreditoConexion.setText("Buscar");
		this.jButtonid_sucursalTarjetaCreditoConexion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalTarjetaCreditoConexion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTarjetaCreditoConexion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalTarjetaCreditoConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTarjetaCreditoConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTarjetaCreditoConexion"));

		this.jButtonid_sucursalTarjetaCreditoConexionBusqueda= new JButtonMe();
		this.jButtonid_sucursalTarjetaCreditoConexionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTarjetaCreditoConexionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTarjetaCreditoConexionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTarjetaCreditoConexionBusqueda.setText("U");
		this.jButtonid_sucursalTarjetaCreditoConexionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalTarjetaCreditoConexionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTarjetaCreditoConexionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalTarjetaCreditoConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTarjetaCreditoConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTarjetaCreditoConexionBusqueda"));

		if(this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalTarjetaCreditoConexionBusqueda.setVisible(false);		}

		this.jButtonid_sucursalTarjetaCreditoConexionUpdate= new JButtonMe();
		this.jButtonid_sucursalTarjetaCreditoConexionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTarjetaCreditoConexionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTarjetaCreditoConexionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTarjetaCreditoConexionUpdate.setText("U");
		this.jButtonid_sucursalTarjetaCreditoConexionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalTarjetaCreditoConexionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTarjetaCreditoConexionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalTarjetaCreditoConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTarjetaCreditoConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTarjetaCreditoConexionUpdate"));



					
		this.jLabelid_tarjeta_creditoTarjetaCreditoConexion = new JLabelMe();
		this.jLabelid_tarjeta_creditoTarjetaCreditoConexion.setText(""+TarjetaCreditoConexionConstantesFunciones.LABEL_IDTARJETACREDITO+" : *");
		this.jLabelid_tarjeta_creditoTarjetaCreditoConexion.setToolTipText("Tarjeta Credito");
		this.jLabelid_tarjeta_creditoTarjetaCreditoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tarjeta_creditoTarjetaCreditoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tarjeta_creditoTarjetaCreditoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tarjeta_creditoTarjetaCreditoConexion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tarjeta_creditoTarjetaCreditoConexion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tarjeta_creditoTarjetaCreditoConexion.setToolTipText(TarjetaCreditoConexionConstantesFunciones.LABEL_IDTARJETACREDITO);
		this.gridaBagLayoutTarjetaCreditoConexion = new GridBagLayout();
		this.jPanelid_tarjeta_creditoTarjetaCreditoConexion.setLayout(this.gridaBagLayoutTarjetaCreditoConexion);


		jComboBoxid_tarjeta_creditoTarjetaCreditoConexion= new JComboBoxMe();
		jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tarjeta_creditoTarjetaCreditoConexion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tarjeta_creditoTarjetaCreditoConexion= new JButtonMe();
		this.jButtonid_tarjeta_creditoTarjetaCreditoConexion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tarjeta_creditoTarjetaCreditoConexion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tarjeta_creditoTarjetaCreditoConexion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tarjeta_creditoTarjetaCreditoConexion.setText("Buscar");
		this.jButtonid_tarjeta_creditoTarjetaCreditoConexion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tarjeta_creditoTarjetaCreditoConexion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tarjeta_creditoTarjetaCreditoConexion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tarjeta_creditoTarjetaCreditoConexion"));

		this.jButtonid_tarjeta_creditoTarjetaCreditoConexionBusqueda= new JButtonMe();
		this.jButtonid_tarjeta_creditoTarjetaCreditoConexionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tarjeta_creditoTarjetaCreditoConexionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tarjeta_creditoTarjetaCreditoConexionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tarjeta_creditoTarjetaCreditoConexionBusqueda.setText("U");
		this.jButtonid_tarjeta_creditoTarjetaCreditoConexionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tarjeta_creditoTarjetaCreditoConexionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tarjeta_creditoTarjetaCreditoConexionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tarjeta_creditoTarjetaCreditoConexionBusqueda"));

		if(this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tarjeta_creditoTarjetaCreditoConexionBusqueda.setVisible(false);		}

		this.jButtonid_tarjeta_creditoTarjetaCreditoConexionUpdate= new JButtonMe();
		this.jButtonid_tarjeta_creditoTarjetaCreditoConexionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tarjeta_creditoTarjetaCreditoConexionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tarjeta_creditoTarjetaCreditoConexionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tarjeta_creditoTarjetaCreditoConexionUpdate.setText("U");
		this.jButtonid_tarjeta_creditoTarjetaCreditoConexionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tarjeta_creditoTarjetaCreditoConexionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tarjeta_creditoTarjetaCreditoConexionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tarjeta_creditoTarjetaCreditoConexionUpdate"));



					
		this.jLabelid_conexionTarjetaCreditoConexion = new JLabelMe();
		this.jLabelid_conexionTarjetaCreditoConexion.setText(""+TarjetaCreditoConexionConstantesFunciones.LABEL_IDCONEXION+" : *");
		this.jLabelid_conexionTarjetaCreditoConexion.setToolTipText("Conexion");
		this.jLabelid_conexionTarjetaCreditoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_conexionTarjetaCreditoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_conexionTarjetaCreditoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_conexionTarjetaCreditoConexion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_conexionTarjetaCreditoConexion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_conexionTarjetaCreditoConexion.setToolTipText(TarjetaCreditoConexionConstantesFunciones.LABEL_IDCONEXION);
		this.gridaBagLayoutTarjetaCreditoConexion = new GridBagLayout();
		this.jPanelid_conexionTarjetaCreditoConexion.setLayout(this.gridaBagLayoutTarjetaCreditoConexion);


		jComboBoxid_conexionTarjetaCreditoConexion= new JComboBoxMe();
		jComboBoxid_conexionTarjetaCreditoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_conexionTarjetaCreditoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_conexionTarjetaCreditoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_conexionTarjetaCreditoConexion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_conexionTarjetaCreditoConexion= new JButtonMe();
		this.jButtonid_conexionTarjetaCreditoConexion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_conexionTarjetaCreditoConexion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_conexionTarjetaCreditoConexion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_conexionTarjetaCreditoConexion.setText("Buscar");
		this.jButtonid_conexionTarjetaCreditoConexion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_conexionTarjetaCreditoConexion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_conexionTarjetaCreditoConexion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_conexionTarjetaCreditoConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_conexionTarjetaCreditoConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_conexionTarjetaCreditoConexion"));

		this.jButtonid_conexionTarjetaCreditoConexionBusqueda= new JButtonMe();
		this.jButtonid_conexionTarjetaCreditoConexionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_conexionTarjetaCreditoConexionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_conexionTarjetaCreditoConexionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_conexionTarjetaCreditoConexionBusqueda.setText("U");
		this.jButtonid_conexionTarjetaCreditoConexionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_conexionTarjetaCreditoConexionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_conexionTarjetaCreditoConexionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_conexionTarjetaCreditoConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_conexionTarjetaCreditoConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_conexionTarjetaCreditoConexionBusqueda"));

		if(this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_conexionTarjetaCreditoConexionBusqueda.setVisible(false);		}

		this.jButtonid_conexionTarjetaCreditoConexionUpdate= new JButtonMe();
		this.jButtonid_conexionTarjetaCreditoConexionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_conexionTarjetaCreditoConexionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_conexionTarjetaCreditoConexionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_conexionTarjetaCreditoConexionUpdate.setText("U");
		this.jButtonid_conexionTarjetaCreditoConexionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_conexionTarjetaCreditoConexionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_conexionTarjetaCreditoConexionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_conexionTarjetaCreditoConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_conexionTarjetaCreditoConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_conexionTarjetaCreditoConexionUpdate"));



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
		//this.jInternalFrameDetalleTarjetaCreditoConexion = new TarjetaCreditoConexionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tarjeta Credito Conexion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTarjetaCreditoConexion= new GridBagLayout();
		

		
		String sToolTipTarjetaCreditoConexion="";
		sToolTipTarjetaCreditoConexion=TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTarjetaCreditoConexion+="(PuntoVenta.TarjetaCreditoConexion)";
		}
		
		if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTarjetaCreditoConexion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTarjetaCreditoConexion = new JButtonMe();
		this.jButtonModificarTarjetaCreditoConexion = new JButtonMe();
        this.jButtonActualizarTarjetaCreditoConexion = new JButtonMe();
        this.jButtonEliminarTarjetaCreditoConexion = new JButtonMe();
        this.jButtonCancelarTarjetaCreditoConexion = new JButtonMe();
        this.jButtonGuardarCambiosTarjetaCreditoConexion = new JButtonMe();
		this.jButtonGuardarCambiosTablaTarjetaCreditoConexion = new JButtonMe();
		this.jButtonCerrarTarjetaCreditoConexion = new JButtonMe();
		
		this.jScrollPanelDatosTarjetaCreditoConexion = new JScrollPane();   
        this.jScrollPanelDatosEdicionTarjetaCreditoConexion = new JScrollPane();
		this.jScrollPanelDatosGeneralTarjetaCreditoConexion = new JScrollPane();
				
		
		
		this.jPanelCamposTarjetaCreditoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTarjetaCreditoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTarjetaCreditoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTarjetaCreditoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tarjeta Credito Conexion";
		
		if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Credito Conexiones" + this.sPath));
		} else {
			this.jScrollPanelDatosTarjetaCreditoConexion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTarjetaCreditoConexion.setName("jPanelCamposTarjetaCreditoConexion"); 

		this.jPanelCamposOcultosTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTarjetaCreditoConexion.setName("jPanelCamposOcultosTarjetaCreditoConexion"); 

        this.jPanelAccionesTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTarjetaCreditoConexion.setToolTipText("Acciones");
        this.jPanelAccionesTarjetaCreditoConexion.setName("Acciones"); 

		this.jPanelAccionesFormularioTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTarjetaCreditoConexion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTarjetaCreditoConexion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTarjetaCreditoConexion.setText("Nuevo");
		this.jButtonModificarTarjetaCreditoConexion.setText("Editar");
        this.jButtonActualizarTarjetaCreditoConexion.setText("Actualizar");
        this.jButtonEliminarTarjetaCreditoConexion.setText("Eliminar");
        this.jButtonCancelarTarjetaCreditoConexion.setText("Cancelar");
        this.jButtonGuardarCambiosTarjetaCreditoConexion.setText("Guardar");
		this.jButtonGuardarCambiosTablaTarjetaCreditoConexion.setText("Guardar");
		this.jButtonCerrarTarjetaCreditoConexion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTarjetaCreditoConexion,"nuevo_button","Nuevo",this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTarjetaCreditoConexion,"modificar_button","Editar",this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTarjetaCreditoConexion,"actualizar_button","Actualizar",this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTarjetaCreditoConexion,"eliminar_button","Eliminar",this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTarjetaCreditoConexion,"cancelar_button","Cancelar",this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTarjetaCreditoConexion,"guardarcambios_button","Guardar",this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTarjetaCreditoConexion,"guardarcambiostabla_button","Guardar",this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTarjetaCreditoConexion,"cerrar_button","Salir",this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTarjetaCreditoConexion.setToolTipText("Nuevo"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTarjetaCreditoConexion.setToolTipText("Editar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTarjetaCreditoConexion.setToolTipText("Actualizar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTarjetaCreditoConexion.setToolTipText("Eliminar)"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTarjetaCreditoConexion.setToolTipText("Cancelar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTarjetaCreditoConexion.setToolTipText("Guardar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTarjetaCreditoConexion.setToolTipText("Guardar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTarjetaCreditoConexion.setToolTipText("Salir"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTarjetaCreditoConexion";
		inputMap = this.jButtonNuevoTarjetaCreditoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTarjetaCreditoConexion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTarjetaCreditoConexion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTarjetaCreditoConexion";
		inputMap = this.jButtonActualizarTarjetaCreditoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTarjetaCreditoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTarjetaCreditoConexion"));
		
		//ELIMINAR
		sMapKey = "EliminarTarjetaCreditoConexion";
		inputMap = this.jButtonEliminarTarjetaCreditoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTarjetaCreditoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTarjetaCreditoConexion"));
		
		//CANCELAR	
		sMapKey = "CancelarTarjetaCreditoConexion";
		inputMap = this.jButtonCancelarTarjetaCreditoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTarjetaCreditoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTarjetaCreditoConexion"));
		
		//CERRAR		
		sMapKey = "CerrarTarjetaCreditoConexion";
		inputMap = this.jButtonCerrarTarjetaCreditoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTarjetaCreditoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTarjetaCreditoConexion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTarjetaCreditoConexion";
		inputMap = this.jButtonGuardarCambiosTablaTarjetaCreditoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTarjetaCreditoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTarjetaCreditoConexion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTarjetaCreditoConexion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTarjetaCreditoConexion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTarjetaCreditoConexion.setToolTipText("Nuevo TarjetaCreditoConexion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTarjetaCreditoConexion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTarjetaCreditoConexion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTarjetaCreditoConexion.setToolTipText("Sin Cerrar Ventana TarjetaCreditoConexion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTarjetaCreditoConexion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTarjetaCreditoConexion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTarjetaCreditoConexion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTarjetaCreditoConexion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTarjetaCreditoConexion.setText("Accion");
		this.jComboBoxTiposAccionesTarjetaCreditoConexion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTarjetaCreditoConexion = new JLabelMe();
		
		this.jLabelAccionesTarjetaCreditoConexion.setText("Acciones");		
		this.jLabelAccionesTarjetaCreditoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTarjetaCreditoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTarjetaCreditoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTarjetaCreditoConexion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTarjetaCreditoConexion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTarjetaCreditoConexion=new JTabbedPane();
		this.jTabbedPaneRelacionesTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTarjetaCreditoConexion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTarjetaCreditoConexion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTarjetaCreditoConexion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTarjetaCreditoConexion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTarjetaCreditoConexion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTarjetaCreditoConexion = new GridBagLayout();
		
		this.jPanelCamposTarjetaCreditoConexion.setLayout(gridaBagLayoutCamposTarjetaCreditoConexion);
		this.jPanelCamposOcultosTarjetaCreditoConexion.setLayout(gridaBagLayoutCamposOcultosTarjetaCreditoConexion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTarjetaCreditoConexion.add(jLabelIdTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);



	this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.gridx = 1;
	this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTarjetaCreditoConexion.add(jLabelidTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);


	this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTarjetaCreditoConexion.add(jLabelid_empresaTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = 2;
		this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 0;
		this.gridBagConstraintsTarjetaCreditoConexion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTarjetaCreditoConexion.add(jButtonid_empresaTarjetaCreditoConexionBusqueda, this.gridBagConstraintsTarjetaCreditoConexion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = 3;
		this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 0;
		this.gridBagConstraintsTarjetaCreditoConexion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTarjetaCreditoConexion.add(jButtonid_empresaTarjetaCreditoConexionUpdate, this.gridBagConstraintsTarjetaCreditoConexion);
	}

	this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.gridx = 1;
	this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTarjetaCreditoConexion.add(jComboBoxid_empresaTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);


	this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalTarjetaCreditoConexion.add(jLabelid_sucursalTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = 2;
		this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 0;
		this.gridBagConstraintsTarjetaCreditoConexion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTarjetaCreditoConexion.add(jButtonid_sucursalTarjetaCreditoConexionBusqueda, this.gridBagConstraintsTarjetaCreditoConexion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = 3;
		this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 0;
		this.gridBagConstraintsTarjetaCreditoConexion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTarjetaCreditoConexion.add(jButtonid_sucursalTarjetaCreditoConexionUpdate, this.gridBagConstraintsTarjetaCreditoConexion);
	}

	this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.gridx = 1;
	this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalTarjetaCreditoConexion.add(jComboBoxid_sucursalTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);


	this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tarjeta_creditoTarjetaCreditoConexion.add(jLabelid_tarjeta_creditoTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = 2;
		this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 0;
		this.gridBagConstraintsTarjetaCreditoConexion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tarjeta_creditoTarjetaCreditoConexion.add(jButtonid_tarjeta_creditoTarjetaCreditoConexionBusqueda, this.gridBagConstraintsTarjetaCreditoConexion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = 3;
		this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 0;
		this.gridBagConstraintsTarjetaCreditoConexion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tarjeta_creditoTarjetaCreditoConexion.add(jButtonid_tarjeta_creditoTarjetaCreditoConexionUpdate, this.gridBagConstraintsTarjetaCreditoConexion);
	}

	this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.gridx = 1;
	this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tarjeta_creditoTarjetaCreditoConexion.add(jComboBoxid_tarjeta_creditoTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);


	this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_conexionTarjetaCreditoConexion.add(jLabelid_conexionTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = 2;
		this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 0;
		this.gridBagConstraintsTarjetaCreditoConexion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_conexionTarjetaCreditoConexion.add(jButtonid_conexionTarjetaCreditoConexionBusqueda, this.gridBagConstraintsTarjetaCreditoConexion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = 3;
		this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 0;
		this.gridBagConstraintsTarjetaCreditoConexion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_conexionTarjetaCreditoConexion.add(jButtonid_conexionTarjetaCreditoConexionUpdate, this.gridBagConstraintsTarjetaCreditoConexion);
	}

	this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.gridx = 1;
	this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_conexionTarjetaCreditoConexion.add(jComboBoxid_conexionTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCreditoConexion.gridy = iYPanelCamposTarjetaCreditoConexion;
	this.gridBagConstraintsTarjetaCreditoConexion.gridx = iXPanelCamposTarjetaCreditoConexion++;
	this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCreditoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTarjetaCreditoConexion.add(this.jPanelidTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);



	if(iXPanelCamposTarjetaCreditoConexion % 1==0) {
		iXPanelCamposTarjetaCreditoConexion=0;
		iYPanelCamposTarjetaCreditoConexion++;
	}
	this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCreditoConexion.gridy = iYPanelCamposTarjetaCreditoConexion;
	this.gridBagConstraintsTarjetaCreditoConexion.gridx = iXPanelCamposTarjetaCreditoConexion++;
	this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCreditoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTarjetaCreditoConexion.add(this.jPanelid_tarjeta_creditoTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);



	if(iXPanelCamposTarjetaCreditoConexion % 1==0) {
		iXPanelCamposTarjetaCreditoConexion=0;
		iYPanelCamposTarjetaCreditoConexion++;
	}
	this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCreditoConexion.gridy = iYPanelCamposTarjetaCreditoConexion;
	this.gridBagConstraintsTarjetaCreditoConexion.gridx = iXPanelCamposTarjetaCreditoConexion++;
	this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCreditoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTarjetaCreditoConexion.add(this.jPanelid_conexionTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);



	if(iXPanelCamposTarjetaCreditoConexion % 1==0) {
		iXPanelCamposTarjetaCreditoConexion=0;
		iYPanelCamposTarjetaCreditoConexion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCreditoConexion.gridy = iYPanelCamposOcultosTarjetaCreditoConexion;
	this.gridBagConstraintsTarjetaCreditoConexion.gridx = iXPanelCamposOcultosTarjetaCreditoConexion++;
	this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCreditoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTarjetaCreditoConexion.add(this.jPanelid_empresaTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);



	if(iXPanelCamposOcultosTarjetaCreditoConexion % 1==0) {
		iXPanelCamposOcultosTarjetaCreditoConexion=0;
		iYPanelCamposOcultosTarjetaCreditoConexion++;
	}
	this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCreditoConexion.gridy = iYPanelCamposOcultosTarjetaCreditoConexion;
	this.gridBagConstraintsTarjetaCreditoConexion.gridx = iXPanelCamposOcultosTarjetaCreditoConexion++;
	this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCreditoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTarjetaCreditoConexion.add(this.jPanelid_sucursalTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);



	if(iXPanelCamposOcultosTarjetaCreditoConexion % 1==0) {
		iXPanelCamposOcultosTarjetaCreditoConexion=0;
		iYPanelCamposOcultosTarjetaCreditoConexion++;
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
			
		GridBagLayout gridaBagLayoutAccionesTarjetaCreditoConexion= new GridBagLayout();
		this.jPanelAccionesTarjetaCreditoConexion.setLayout(gridaBagLayoutAccionesTarjetaCreditoConexion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTarjetaCreditoConexion= new GridBagLayout();
		this.jPanelAccionesFormularioTarjetaCreditoConexion.setLayout(gridaBagLayoutAccionesFormularioTarjetaCreditoConexion);
		
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTarjetaCreditoConexion.add(this.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);

		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTarjetaCreditoConexion.add(this.jCheckBoxPostAccionNuevoTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tarjetacreditoconexionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTarjetaCreditoConexion.add(this.jCheckBoxPostAccionSinCerrarTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tarjetacreditoconexionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTarjetaCreditoConexion.add(this.jCheckBoxPostAccionSinMensajeTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXAccion++;
			
		this.jPanelAccionesTarjetaCreditoConexion.add(this.jButtonModificarTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);							

		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx =iPosXAccion++;
			
		this.jPanelAccionesTarjetaCreditoConexion.add(this.jButtonEliminarTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
		
			
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;		
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTarjetaCreditoConexion.add(this.jButtonActualizarTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);


		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;		
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTarjetaCreditoConexion.add(this.jButtonGuardarCambiosTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);	
		
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;		
		this.gridBagConstraintsTarjetaCreditoConexion.gridx =iPosXAccion++;
		
		this.jPanelAccionesTarjetaCreditoConexion.add(this.jButtonCancelarTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTarjetaCreditoConexion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTarjetaCreditoConexion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();						
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;		
			//this.gridBagConstraintsTarjetaCreditoConexion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx =0;
		this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTarjetaCreditoConexion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TarjetaCreditoConexionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTarjetaCreditoConexion = new TarjetaCreditoConexionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tarjeta Credito Conexion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tarjeta Credito Conexion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tarjeta Credito Conexion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TarjetaCreditoConexionModel tarjetacreditoconexionModel=new TarjetaCreditoConexionModel(this);
			
			//SI USARA CLASE INTERNA
			//TarjetaCreditoConexionModel.TarjetaCreditoConexionFocusTraversalPolicy tarjetacreditoconexionFocusTraversalPolicy = tarjetacreditoconexionModel.new TarjetaCreditoConexionFocusTraversalPolicy(this);
			
			//tarjetacreditoconexionFocusTraversalPolicy.settarjetacreditoconexionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tarjetacreditoconexionModel);
			
			
			this.jContentPaneDetalleTarjetaCreditoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTarjetaCreditoConexion = new GridBagLayout();	
			this.jContentPaneDetalleTarjetaCreditoConexion.setLayout(gridaBagLayoutDetalleTarjetaCreditoConexion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTarjetaCreditoConexion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
				this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
					
				
				this.jContentPaneDetalleTarjetaCreditoConexion.add(jTtoolBarDetalleTarjetaCreditoConexion, gridBagConstraintsTarjetaCreditoConexion);								
				
}
			
			this.jScrollPanelDatosEdicionTarjetaCreditoConexion=   new JScrollPane(jContentPaneDetalleTarjetaCreditoConexion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTarjetaCreditoConexion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTarjetaCreditoConexion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTarjetaCreditoConexion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTarjetaCreditoConexion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTarjetaCreditoConexion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTarjetaCreditoConexion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTarjetaCreditoConexion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
	        
			this.jContentPaneDetalleTarjetaCreditoConexion.add(jPanelCamposTarjetaCreditoConexion, gridBagConstraintsTarjetaCreditoConexion);
			
			
			
			
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
						&& tarjetacreditoconexionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tarjetacreditoconexionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTarjetaCreditoConexion= new GridBagConstraints();
						this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
						this.jContentPaneDetalleTarjetaCreditoConexion.add(this.jTabbedPaneRelacionesTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTarjetaCreditoConexion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTarjetaCreditoConexion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
					this.gridBagConstraintsTarjetaCreditoConexion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
					
				
					this.jContentPaneDetalleTarjetaCreditoConexion.add(jPanelCamposOcultosTarjetaCreditoConexion, gridBagConstraintsTarjetaCreditoConexion);
				
					this.jPanelCamposOcultosTarjetaCreditoConexion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
	        this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTarjetaCreditoConexion.add(this.jPanelAccionesFormularioTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);							
			
			
			
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
	        this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
	        
			
			this.jContentPaneDetalleTarjetaCreditoConexion.add(this.jPanelAccionesTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTarjetaCreditoConexion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTarjetaCreditoConexion=   new JScrollPane(this.jPanelCamposTarjetaCreditoConexion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTarjetaCreditoConexion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTarjetaCreditoConexion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTarjetaCreditoConexion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
			this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTarjetaCreditoConexion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);			
			
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
			
			
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
		
			
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCreditoConexion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTarjetaCreditoConexion;//jContentPane;
		
		return jScrollPanelDatosEdicionTarjetaCreditoConexion;
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
