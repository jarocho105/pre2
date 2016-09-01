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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TelefonoConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TelefonoDetalleFormJInternalFrame extends TelefonoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTelefono;
	
	protected JMenuBar jmenuBarDetalleTelefono;
	
	protected JMenu jmenuDetalleTelefono;
	protected JMenu jmenuDetalleArchivoTelefono;
	protected JMenu jmenuDetalleAccionesTelefono;
	protected JMenu jmenuDetalleDatosTelefono;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTelefono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTelefono;	
	protected GridBagConstraints gridBagConstraintsTelefono;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TelefonoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTelefono;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoTelefoBeanSwingJInternalFrame tipotelefoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotelefo="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public TelefonoSessionBean telefonoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoTelefoSessionBean tipotelefoSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;	
	
	public TelefonoLogic telefonoLogic;
	
	public JScrollPane jScrollPanelDatosTelefono;
	public JScrollPane jScrollPanelDatosEdicionTelefono;
	public JScrollPane jScrollPanelDatosGeneralTelefono;
	
	protected JPanel jPanelCamposTelefono;    
	protected JPanel jPanelCamposOcultosTelefono;    	
	protected JPanel jPanelAccionesTelefono;
	protected JPanel jPanelAccionesFormularioTelefono;
    
	
	
	protected Integer iXPanelCamposTelefono=0;
	protected Integer iYPanelCamposTelefono=0;
	
	protected Integer iXPanelCamposOcultosTelefono=0;
	protected Integer iYPanelCamposOcultosTelefono=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTelefono;
	public JButton jButtonModificarTelefono;
	public JButton jButtonActualizarTelefono;
    public JButton jButtonEliminarTelefono;
	public JButton jButtonCancelarTelefono;
    public JButton jButtonGuardarCambiosTelefono;
	public JButton jButtonGuardarCambiosTablaTelefono;
	protected JButton jButtonCerrarTelefono;
	
	
	protected JButton jButtonProcesarInformacionTelefono;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTelefono;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTelefono;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTelefono;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTelefono;
	protected JButton jButtonModificarToolBarTelefono;
	protected JButton jButtonActualizarToolBarTelefono;
    protected JButton jButtonEliminarToolBarTelefono;
	protected JButton jButtonCancelarToolBarTelefono;
    protected JButton jButtonGuardarCambiosToolBarTelefono;
	protected JButton jButtonGuardarCambiosTablaToolBarTelefono;
	protected JButton jButtonMostrarOcultarTablaToolBarTelefono;
	protected JButton jButtonCerrarToolBarTelefono;
	
	protected JButton jButtonProcesarInformacionToolBarTelefono;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTelefono;
	protected JMenuItem jMenuItemModificarTelefono;
	protected JMenuItem jMenuItemActualizarTelefono;
    protected JMenuItem jMenuItemEliminarTelefono;
	protected JMenuItem jMenuItemCancelarTelefono;
    protected JMenuItem jMenuItemGuardarCambiosTelefono;
	protected JMenuItem jMenuItemGuardarCambiosTablaTelefono;
	protected JMenuItem jMenuItemCerrarTelefono;
	protected JMenuItem jMenuItemDetalleCerrarTelefono;
	protected JMenuItem jMenuItemDetalleMostarOcultarTelefono;
	
	protected JMenuItem jMenuItemProcesarInformacionTelefono;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTelefono;
	protected JMenuItem jMenuItemMostrarOcultarTelefono;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTelefono;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTelefono;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTelefono;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTelefono;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTelefono;
	public JLabel jLabelIdTelefono;
	public JLabel jLabelidTelefono;
	public JButton jButtonidTelefonoBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoTelefono;
	public JLabel jLabeltelefonoTelefono;
	public JTextArea jTextAreatelefonoTelefono;
	public JScrollPane jscrollPanetelefonoTelefono;
	public JButton jButtontelefonoTelefonoBusqueda= new JButtonMe();

	public JPanel jPanelextensionTelefono;
	public JLabel jLabelextensionTelefono;
	public JTextField jTextFieldextensionTelefono;
	public JButton jButtonextensionTelefonoBusqueda= new JButtonMe();

	public JPanel jPaneles_activoTelefono;
	public JLabel jLabeles_activoTelefono;
	public JCheckBox jCheckBoxes_activoTelefono;
	public JButton jButtones_activoTelefonoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTelefono;
	public JLabel jLabeldescripcionTelefono;
	public JTextArea jTextAreadescripcionTelefono;
	public JScrollPane jscrollPanedescripcionTelefono;
	public JButton jButtondescripcionTelefonoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTelefono;
	public JLabel jLabelid_empresaTelefono;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTelefono;
	public JButton jButtonid_empresaTelefono= new JButtonMe();
	public JButton jButtonid_empresaTelefonoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTelefonoBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteTelefono;
	public JLabel jLabelid_clienteTelefono;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteTelefono;
	public JButton jButtonid_clienteTelefono= new JButtonMe();
	public JButton jButtonid_clienteTelefonoUpdate= new JButtonMe();
	public JButton jButtonid_clienteTelefonoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_telefonoTelefono;
	public JLabel jLabelid_tipo_telefonoTelefono;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_telefonoTelefono;
	public JButton jButtonid_tipo_telefonoTelefono= new JButtonMe();
	public JButton jButtonid_tipo_telefonoTelefonoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_telefonoTelefonoBusqueda= new JButtonMe();

	public JPanel jPanelid_paisTelefono;
	public JLabel jLabelid_paisTelefono;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisTelefono;
	public JButton jButtonid_paisTelefono= new JButtonMe();
	public JButton jButtonid_paisTelefonoUpdate= new JButtonMe();
	public JButton jButtonid_paisTelefonoBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadTelefono;
	public JLabel jLabelid_ciudadTelefono;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadTelefono;
	public JButton jButtonid_ciudadTelefono= new JButtonMe();
	public JButton jButtonid_ciudadTelefonoUpdate= new JButtonMe();
	public JButton jButtonid_ciudadTelefonoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTelefono;
	
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
	public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TelefonoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTelefono=new JPanel();
				this.jPanelAccionesFormularioTelefono=new JPanel();
				this.jmenuBarDetalleTelefono=new JMenuBar();
				this.jTtoolBarDetalleTelefono=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TelefonoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Telefono No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TelefonoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Telefono No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TelefonoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Telefono No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TelefonoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Telefono No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TelefonoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Telefono No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTelefono() {
		return this.jButtonActualizarToolBarTelefono;
	}
	
	public JButton getjButtonEliminarToolBarTelefono() {
		return this.jButtonEliminarToolBarTelefono;
	}
	
	public JButton getjButtonCancelarToolBarTelefono() {
		return this.jButtonCancelarToolBarTelefono;
	}		
	
	public JButton getjButtonProcesarInformacionTelefono() {
		return this.jButtonProcesarInformacionTelefono;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTelefono)	{
		this.jButtonProcesarInformacionTelefono = jButtonProcesarInformacionTelefono;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTelefono() {
		return this.jComboBoxTiposAccionesTelefono;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTelefono(
			JComboBox jComboBoxTiposRelacionesTelefono) {
		this.jComboBoxTiposRelacionesTelefono = jComboBoxTiposRelacionesTelefono;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTelefono(
			JComboBox jComboBoxTiposAccionesTelefono) {
		this.jComboBoxTiposAccionesTelefono = jComboBoxTiposAccionesTelefono;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTelefono() {
		return this.jComboBoxTiposAccionesFormularioTelefono;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTelefono(
			JComboBox jComboBoxTiposAccionesFormularioTelefono) {
		this.jComboBoxTiposAccionesFormularioTelefono = jComboBoxTiposAccionesFormularioTelefono;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.telefonoSessionBean=new TelefonoSessionBean();
		
		this.telefonoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.telefonoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.telefonoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TelefonoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TelefonoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TelefonoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Telefono MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.telefonoSessionBean.getEsGuardarRelacionado()) {
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
	
		TelefonoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTelefono= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTelefono=new JButtonMe();
				this.jButtonModificarToolBarTelefono=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTelefono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTelefono,this.jTtoolBarDetalleTelefono,
							"actualizar","actualizar","Actualizar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTelefono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTelefono,this.jTtoolBarDetalleTelefono,
							"eliminar","eliminar","Eliminar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTelefono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTelefono,this.jTtoolBarDetalleTelefono,
							"cancelar","cancelar","Cancelar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTelefono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTelefono,this.jTtoolBarDetalleTelefono,
							"guardarcambios","guardarcambios","Guardar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTelefono,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTelefono,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTelefono,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTelefono=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTelefono=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTelefono=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTelefono=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTelefono=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTelefono= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTelefono.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTelefono,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTelefono= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTelefono.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTelefono,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTelefono= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTelefono.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTelefono,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTelefono= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTelefono.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTelefono,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTelefono= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTelefono.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTelefono,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTelefono= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTelefono.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTelefono,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTelefono= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTelefono.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTelefono,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTelefono= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTelefono.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTelefono,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTelefono= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTelefono.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTelefono,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTelefono= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTelefono.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTelefono,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTelefono, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTelefono.add(this.jMenuItemDetalleCerrarTelefono);
		
		this.jmenuDetalleAccionesTelefono.add(this.jMenuItemActualizarTelefono);
		this.jmenuDetalleAccionesTelefono.add(this.jMenuItemEliminarTelefono);
		this.jmenuDetalleAccionesTelefono.add(this.jMenuItemCancelarTelefono);		
		
		//this.jmenuDetalleDatosTelefono.add(this.jMenuItemDetalleAbrirOrderByTelefono);				
		this.jmenuDetalleDatosTelefono.add(this.jMenuItemDetalleMostarOcultarTelefono);				
				
		//this.jmenuDetalleAccionesTelefono.add(this.jMenuItemGuardarCambiosTelefono);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTelefono.add(this.jmenuDetalleArchivoTelefono);		
		this.jmenuBarDetalleTelefono.add(this.jmenuDetalleAccionesTelefono);		
		this.jmenuBarDetalleTelefono.add(this.jmenuDetalleDatosTelefono);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTelefono);				
	}
	
	
	public void inicializarElementosCamposTelefono() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTelefono = new JLabelMe();
		jLabelIdTelefono.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTelefono,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTelefono = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTelefono.setToolTipText(TelefonoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTelefono= new GridBagLayout();

		this.jPanelidTelefono.setLayout(this.gridaBagLayoutTelefono);

		jLabelidTelefono = new JLabel();
		jLabelidTelefono.setText("Id");

		jLabelidTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeltelefonoTelefono = new JLabelMe();
		this.jLabeltelefonoTelefono.setText(""+TelefonoConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoTelefono.setToolTipText("Telefono");
		this.jLabeltelefonoTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoTelefono,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoTelefono=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoTelefono.setToolTipText(TelefonoConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutTelefono = new GridBagLayout();
		this.jPaneltelefonoTelefono.setLayout(this.gridaBagLayoutTelefono);


		jTextAreatelefonoTelefono= new JTextAreaMe();
		jTextAreatelefonoTelefono.setEnabled(false);
		jTextAreatelefonoTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoTelefono.setLineWrap(true);
		jTextAreatelefonoTelefono.setWrapStyleWord(true);
		jTextAreatelefonoTelefono.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefonoTelefono.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatelefonoTelefono,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefonoTelefono = new JScrollPane(jTextAreatelefonoTelefono);
		jscrollPanetelefonoTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefonoTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefonoTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontelefonoTelefonoBusqueda= new JButtonMe();
		this.jButtontelefonoTelefonoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoTelefonoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoTelefonoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoTelefonoBusqueda.setText("U");
		this.jButtontelefonoTelefonoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoTelefonoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoTelefonoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefonoTelefono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefonoTelefono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoTelefonoBusqueda"));

		if(this.telefonoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoTelefonoBusqueda.setVisible(false);		}


					
		this.jLabelextensionTelefono = new JLabelMe();
		this.jLabelextensionTelefono.setText(""+TelefonoConstantesFunciones.LABEL_EXTENSION+" : *");
		this.jLabelextensionTelefono.setToolTipText("Extension");
		this.jLabelextensionTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelextensionTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelextensionTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelextensionTelefono,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelextensionTelefono=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelextensionTelefono.setToolTipText(TelefonoConstantesFunciones.LABEL_EXTENSION);
		this.gridaBagLayoutTelefono = new GridBagLayout();
		this.jPanelextensionTelefono.setLayout(this.gridaBagLayoutTelefono);


		jTextFieldextensionTelefono= new JTextFieldMe();

		jTextFieldextensionTelefono.setEnabled(false);
		jTextFieldextensionTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldextensionTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldextensionTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldextensionTelefono,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonextensionTelefonoBusqueda= new JButtonMe();
		this.jButtonextensionTelefonoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonextensionTelefonoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonextensionTelefonoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonextensionTelefonoBusqueda.setText("U");
		this.jButtonextensionTelefonoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonextensionTelefonoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonextensionTelefonoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldextensionTelefono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldextensionTelefono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"extensionTelefonoBusqueda"));

		if(this.telefonoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonextensionTelefonoBusqueda.setVisible(false);		}


					
		this.jLabeles_activoTelefono = new JLabelMe();
		this.jLabeles_activoTelefono.setText(""+TelefonoConstantesFunciones.LABEL_ESACTIVO+" : *");
		this.jLabeles_activoTelefono.setToolTipText("Es Activo");
		this.jLabeles_activoTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_activoTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_activoTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_activoTelefono,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_activoTelefono=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_activoTelefono.setToolTipText(TelefonoConstantesFunciones.LABEL_ESACTIVO);
		this.gridaBagLayoutTelefono = new GridBagLayout();
		this.jPaneles_activoTelefono.setLayout(this.gridaBagLayoutTelefono);


		jCheckBoxes_activoTelefono= new JCheckBoxMe();
		jCheckBoxes_activoTelefono.setEnabled(false);

		jCheckBoxes_activoTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_activoTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_activoTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_activoTelefono,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_activoTelefonoBusqueda= new JButtonMe();
		this.jButtones_activoTelefonoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_activoTelefonoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_activoTelefonoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_activoTelefonoBusqueda.setText("U");
		this.jButtones_activoTelefonoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_activoTelefonoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_activoTelefonoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_activoTelefono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_activoTelefono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_activoTelefonoBusqueda"));

		if(this.telefonoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_activoTelefonoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTelefono = new JLabelMe();
		this.jLabeldescripcionTelefono.setText(""+TelefonoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionTelefono.setToolTipText("Descripcion");
		this.jLabeldescripcionTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTelefono,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTelefono=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTelefono.setToolTipText(TelefonoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTelefono = new GridBagLayout();
		this.jPaneldescripcionTelefono.setLayout(this.gridaBagLayoutTelefono);


		jTextAreadescripcionTelefono= new JTextAreaMe();
		jTextAreadescripcionTelefono.setEnabled(false);
		jTextAreadescripcionTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTelefono.setLineWrap(true);
		jTextAreadescripcionTelefono.setWrapStyleWord(true);
		jTextAreadescripcionTelefono.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTelefono.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTelefono,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTelefono = new JScrollPane(jTextAreadescripcionTelefono);
		jscrollPanedescripcionTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionTelefonoBusqueda= new JButtonMe();
		this.jButtondescripcionTelefonoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTelefonoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTelefonoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTelefonoBusqueda.setText("U");
		this.jButtondescripcionTelefonoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTelefonoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTelefonoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTelefono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTelefono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTelefonoBusqueda"));

		if(this.telefonoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTelefonoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTelefono() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTelefono = new JLabelMe();
		this.jLabelid_empresaTelefono.setText(""+TelefonoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTelefono.setToolTipText("Empresa");
		this.jLabelid_empresaTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTelefono,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTelefono=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTelefono.setToolTipText(TelefonoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTelefono = new GridBagLayout();
		this.jPanelid_empresaTelefono.setLayout(this.gridaBagLayoutTelefono);


		jComboBoxid_empresaTelefono= new JComboBoxMe();
		jComboBoxid_empresaTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTelefono,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTelefono.setEnabled(false);

		this.jButtonid_empresaTelefono= new JButtonMe();
		this.jButtonid_empresaTelefono.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTelefono.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTelefono.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTelefono.setText("Buscar");
		this.jButtonid_empresaTelefono.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTelefono.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTelefono,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTelefono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTelefono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTelefono"));

		this.jButtonid_empresaTelefonoBusqueda= new JButtonMe();
		this.jButtonid_empresaTelefonoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTelefonoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTelefonoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTelefonoBusqueda.setText("U");
		this.jButtonid_empresaTelefonoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTelefonoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTelefonoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTelefono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTelefono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTelefonoBusqueda"));

		if(this.telefonoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTelefonoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTelefonoUpdate= new JButtonMe();
		this.jButtonid_empresaTelefonoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTelefonoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTelefonoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTelefonoUpdate.setText("U");
		this.jButtonid_empresaTelefonoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTelefonoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTelefonoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTelefono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTelefono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTelefonoUpdate"));



					
		this.jLabelid_clienteTelefono = new JLabelMe();
		this.jLabelid_clienteTelefono.setText(""+TelefonoConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteTelefono.setToolTipText("Cliente");
		this.jLabelid_clienteTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteTelefono,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteTelefono=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteTelefono.setToolTipText(TelefonoConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutTelefono = new GridBagLayout();
		this.jPanelid_clienteTelefono.setLayout(this.gridaBagLayoutTelefono);


		jComboBoxid_clienteTelefono= new JComboBoxMe();
		jComboBoxid_clienteTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteTelefono,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteTelefono= new JButtonMe();
		this.jButtonid_clienteTelefono.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteTelefono.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteTelefono.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteTelefono.setText("Buscar");
		this.jButtonid_clienteTelefono.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteTelefono.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteTelefono,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteTelefono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteTelefono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteTelefono"));

		this.jButtonid_clienteTelefonoBusqueda= new JButtonMe();
		this.jButtonid_clienteTelefonoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteTelefonoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteTelefonoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteTelefonoBusqueda.setText("U");
		this.jButtonid_clienteTelefonoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteTelefonoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteTelefonoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteTelefono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteTelefono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteTelefonoBusqueda"));

		if(this.telefonoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteTelefonoBusqueda.setVisible(false);		}

		this.jButtonid_clienteTelefonoUpdate= new JButtonMe();
		this.jButtonid_clienteTelefonoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteTelefonoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteTelefonoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteTelefonoUpdate.setText("U");
		this.jButtonid_clienteTelefonoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteTelefonoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteTelefonoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteTelefono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteTelefono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteTelefonoUpdate"));



					
		this.jLabelid_tipo_telefonoTelefono = new JLabelMe();
		this.jLabelid_tipo_telefonoTelefono.setText(""+TelefonoConstantesFunciones.LABEL_IDTIPOTELEFO+" : *");
		this.jLabelid_tipo_telefonoTelefono.setToolTipText("Tipo Telefono");
		this.jLabelid_tipo_telefonoTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_telefonoTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_telefonoTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_telefonoTelefono,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_telefonoTelefono=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_telefonoTelefono.setToolTipText(TelefonoConstantesFunciones.LABEL_IDTIPOTELEFO);
		this.gridaBagLayoutTelefono = new GridBagLayout();
		this.jPanelid_tipo_telefonoTelefono.setLayout(this.gridaBagLayoutTelefono);


		jComboBoxid_tipo_telefonoTelefono= new JComboBoxMe();
		jComboBoxid_tipo_telefonoTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_telefonoTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_telefonoTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_telefonoTelefono,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_telefonoTelefono= new JButtonMe();
		this.jButtonid_tipo_telefonoTelefono.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_telefonoTelefono.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_telefonoTelefono.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_telefonoTelefono.setText("Buscar");
		this.jButtonid_tipo_telefonoTelefono.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_telefonoTelefono.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_telefonoTelefono,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_telefonoTelefono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_telefonoTelefono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_telefonoTelefono"));

		this.jButtonid_tipo_telefonoTelefonoBusqueda= new JButtonMe();
		this.jButtonid_tipo_telefonoTelefonoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_telefonoTelefonoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_telefonoTelefonoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_telefonoTelefonoBusqueda.setText("U");
		this.jButtonid_tipo_telefonoTelefonoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_telefonoTelefonoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_telefonoTelefonoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_telefonoTelefono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_telefonoTelefono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_telefonoTelefonoBusqueda"));

		if(this.telefonoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_telefonoTelefonoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_telefonoTelefonoUpdate= new JButtonMe();
		this.jButtonid_tipo_telefonoTelefonoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_telefonoTelefonoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_telefonoTelefonoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_telefonoTelefonoUpdate.setText("U");
		this.jButtonid_tipo_telefonoTelefonoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_telefonoTelefonoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_telefonoTelefonoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_telefonoTelefono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_telefonoTelefono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_telefonoTelefonoUpdate"));



					
		this.jLabelid_paisTelefono = new JLabelMe();
		this.jLabelid_paisTelefono.setText(""+TelefonoConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisTelefono.setToolTipText("Pais");
		this.jLabelid_paisTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisTelefono,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisTelefono=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisTelefono.setToolTipText(TelefonoConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutTelefono = new GridBagLayout();
		this.jPanelid_paisTelefono.setLayout(this.gridaBagLayoutTelefono);


		jComboBoxid_paisTelefono= new JComboBoxMe();
		jComboBoxid_paisTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisTelefono,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisTelefono= new JButtonMe();
		this.jButtonid_paisTelefono.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTelefono.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTelefono.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTelefono.setText("Buscar");
		this.jButtonid_paisTelefono.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisTelefono.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTelefono,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisTelefono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTelefono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTelefono"));

		this.jButtonid_paisTelefonoBusqueda= new JButtonMe();
		this.jButtonid_paisTelefonoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTelefonoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTelefonoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTelefonoBusqueda.setText("U");
		this.jButtonid_paisTelefonoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisTelefonoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTelefonoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisTelefono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTelefono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTelefonoBusqueda"));

		if(this.telefonoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisTelefonoBusqueda.setVisible(false);		}

		this.jButtonid_paisTelefonoUpdate= new JButtonMe();
		this.jButtonid_paisTelefonoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTelefonoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTelefonoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTelefonoUpdate.setText("U");
		this.jButtonid_paisTelefonoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisTelefonoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTelefonoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisTelefono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTelefono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTelefonoUpdate"));



					
		this.jLabelid_ciudadTelefono = new JLabelMe();
		this.jLabelid_ciudadTelefono.setText(""+TelefonoConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadTelefono.setToolTipText("Ciudad");
		this.jLabelid_ciudadTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadTelefono,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadTelefono=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadTelefono.setToolTipText(TelefonoConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutTelefono = new GridBagLayout();
		this.jPanelid_ciudadTelefono.setLayout(this.gridaBagLayoutTelefono);


		jComboBoxid_ciudadTelefono= new JComboBoxMe();
		jComboBoxid_ciudadTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadTelefono,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadTelefono= new JButtonMe();
		this.jButtonid_ciudadTelefono.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadTelefono.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadTelefono.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadTelefono.setText("Buscar");
		this.jButtonid_ciudadTelefono.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadTelefono.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadTelefono,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadTelefono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadTelefono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadTelefono"));

		this.jButtonid_ciudadTelefonoBusqueda= new JButtonMe();
		this.jButtonid_ciudadTelefonoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadTelefonoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadTelefonoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadTelefonoBusqueda.setText("U");
		this.jButtonid_ciudadTelefonoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadTelefonoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadTelefonoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadTelefono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadTelefono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadTelefonoBusqueda"));

		if(this.telefonoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadTelefonoBusqueda.setVisible(false);		}

		this.jButtonid_ciudadTelefonoUpdate= new JButtonMe();
		this.jButtonid_ciudadTelefonoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadTelefonoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadTelefonoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadTelefonoUpdate.setText("U");
		this.jButtonid_ciudadTelefonoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadTelefonoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadTelefonoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadTelefono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadTelefono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadTelefonoUpdate"));



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
		//this.jInternalFrameDetalleTelefono = new TelefonoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Telefono DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTelefono= new GridBagLayout();
		

		
		String sToolTipTelefono="";
		sToolTipTelefono=TelefonoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTelefono+="(Cartera.Telefono)";
		}
		
		if(!this.telefonoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTelefono+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTelefono = new JButtonMe();
		this.jButtonModificarTelefono = new JButtonMe();
        this.jButtonActualizarTelefono = new JButtonMe();
        this.jButtonEliminarTelefono = new JButtonMe();
        this.jButtonCancelarTelefono = new JButtonMe();
        this.jButtonGuardarCambiosTelefono = new JButtonMe();
		this.jButtonGuardarCambiosTablaTelefono = new JButtonMe();
		this.jButtonCerrarTelefono = new JButtonMe();
		
		this.jScrollPanelDatosTelefono = new JScrollPane();   
        this.jScrollPanelDatosEdicionTelefono = new JScrollPane();
		this.jScrollPanelDatosGeneralTelefono = new JScrollPane();
				
		
		
		this.jPanelCamposTelefono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTelefono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTelefono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTelefono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Telefono";
		
		if(!this.telefonoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Telefonos" + this.sPath));
		} else {
			this.jScrollPanelDatosTelefono.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTelefono.setName("jPanelCamposTelefono"); 

		this.jPanelCamposOcultosTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTelefono.setName("jPanelCamposOcultosTelefono"); 

        this.jPanelAccionesTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTelefono.setToolTipText("Acciones");
        this.jPanelAccionesTelefono.setName("Acciones"); 

		this.jPanelAccionesFormularioTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTelefono.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTelefono.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTelefono, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTelefono, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTelefono, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTelefono, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTelefono, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTelefono, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTelefono.setText("Nuevo");
		this.jButtonModificarTelefono.setText("Editar");
        this.jButtonActualizarTelefono.setText("Actualizar");
        this.jButtonEliminarTelefono.setText("Eliminar");
        this.jButtonCancelarTelefono.setText("Cancelar");
        this.jButtonGuardarCambiosTelefono.setText("Guardar");
		this.jButtonGuardarCambiosTablaTelefono.setText("Guardar");
		this.jButtonCerrarTelefono.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTelefono,"nuevo_button","Nuevo",this.telefonoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTelefono,"modificar_button","Editar",this.telefonoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTelefono,"actualizar_button","Actualizar",this.telefonoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTelefono,"eliminar_button","Eliminar",this.telefonoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTelefono,"cancelar_button","Cancelar",this.telefonoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTelefono,"guardarcambios_button","Guardar",this.telefonoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTelefono,"guardarcambiostabla_button","Guardar",this.telefonoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTelefono,"cerrar_button","Salir",this.telefonoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTelefono, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTelefono, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTelefono, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTelefono.setToolTipText("Nuevo"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTelefono.setToolTipText("Editar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTelefono.setToolTipText("Actualizar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTelefono.setToolTipText("Eliminar)"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTelefono.setToolTipText("Cancelar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTelefono.setToolTipText("Guardar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTelefono.setToolTipText("Guardar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTelefono.setToolTipText("Salir"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTelefono";
		inputMap = this.jButtonNuevoTelefono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTelefono.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTelefono"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTelefono";
		inputMap = this.jButtonActualizarTelefono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTelefono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTelefono"));
		
		//ELIMINAR
		sMapKey = "EliminarTelefono";
		inputMap = this.jButtonEliminarTelefono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTelefono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTelefono"));
		
		//CANCELAR	
		sMapKey = "CancelarTelefono";
		inputMap = this.jButtonCancelarTelefono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTelefono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTelefono"));
		
		//CERRAR		
		sMapKey = "CerrarTelefono";
		inputMap = this.jButtonCerrarTelefono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTelefono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTelefono"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTelefono";
		inputMap = this.jButtonGuardarCambiosTablaTelefono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTelefono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTelefono"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTelefono = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTelefono.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTelefono.setToolTipText("Nuevo Telefono");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTelefono, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTelefono = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTelefono.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTelefono.setToolTipText("Sin Cerrar Ventana Telefono");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTelefono, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTelefono = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTelefono.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTelefono.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTelefono, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTelefono = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTelefono.setText("Accion");
		this.jComboBoxTiposAccionesTelefono.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTelefono = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTelefono.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTelefono.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTelefono = new JLabelMe();
		
		this.jLabelAccionesTelefono.setText("Acciones");		
		this.jLabelAccionesTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTelefono();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTelefono();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTelefono=new JTabbedPane();
		this.jTabbedPaneRelacionesTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTelefono,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTelefono.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTelefono.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTelefono.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTelefono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTelefono.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTelefono.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTelefono.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTelefono, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTelefono = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTelefono = new GridBagLayout();
		
		this.jPanelCamposTelefono.setLayout(gridaBagLayoutCamposTelefono);
		this.jPanelCamposOcultosTelefono.setLayout(gridaBagLayoutCamposOcultosTelefono);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono.gridy = 0;
	this.gridBagConstraintsTelefono.gridx = 0;
	this.gridBagConstraintsTelefono.ipadx = 0;
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTelefono.add(jLabelIdTelefono, this.gridBagConstraintsTelefono);



	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono.gridy = 0;
	this.gridBagConstraintsTelefono.gridx = 1;
	this.gridBagConstraintsTelefono.ipadx = 0;
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTelefono.add(jLabelidTelefono, this.gridBagConstraintsTelefono);


	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono.gridy = 0;
	this.gridBagConstraintsTelefono.gridx = 0;
	this.gridBagConstraintsTelefono.ipadx = 0;
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTelefono.add(jLabelid_empresaTelefono, this.gridBagConstraintsTelefono);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTelefono = new GridBagConstraints();
		//this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono.gridy = 0;
		this.gridBagConstraintsTelefono.gridx = 2;
		this.gridBagConstraintsTelefono.ipadx = 0;
		this.gridBagConstraintsTelefono.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTelefono.add(jButtonid_empresaTelefonoBusqueda, this.gridBagConstraintsTelefono);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTelefono = new GridBagConstraints();
		//this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono.gridy = 0;
		this.gridBagConstraintsTelefono.gridx = 3;
		this.gridBagConstraintsTelefono.ipadx = 0;
		this.gridBagConstraintsTelefono.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTelefono.add(jButtonid_empresaTelefonoUpdate, this.gridBagConstraintsTelefono);
	}

	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono.gridy = 0;
	this.gridBagConstraintsTelefono.gridx = 1;
	this.gridBagConstraintsTelefono.ipadx = 0;
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTelefono.add(jComboBoxid_empresaTelefono, this.gridBagConstraintsTelefono);


	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono.gridy = 0;
	this.gridBagConstraintsTelefono.gridx = 0;
	this.gridBagConstraintsTelefono.ipadx = 0;
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteTelefono.add(jLabelid_clienteTelefono, this.gridBagConstraintsTelefono);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTelefono = new GridBagConstraints();
	//this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono.gridy = 0;
	this.gridBagConstraintsTelefono.gridx = 2;
	this.gridBagConstraintsTelefono.ipadx = 0;
	this.gridBagConstraintsTelefono.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteTelefono.add(jButtonid_clienteTelefono, this.gridBagConstraintsTelefono);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTelefono = new GridBagConstraints();
		//this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono.gridy = 0;
		this.gridBagConstraintsTelefono.gridx = 3;
		this.gridBagConstraintsTelefono.ipadx = 0;
		this.gridBagConstraintsTelefono.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteTelefono.add(jButtonid_clienteTelefonoBusqueda, this.gridBagConstraintsTelefono);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTelefono = new GridBagConstraints();
		//this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono.gridy = 0;
		this.gridBagConstraintsTelefono.gridx = 4;
		this.gridBagConstraintsTelefono.ipadx = 0;
		this.gridBagConstraintsTelefono.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteTelefono.add(jButtonid_clienteTelefonoUpdate, this.gridBagConstraintsTelefono);
	}

	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono.gridy = 0;
	this.gridBagConstraintsTelefono.gridx = 1;
	this.gridBagConstraintsTelefono.ipadx = 0;
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteTelefono.add(jComboBoxid_clienteTelefono, this.gridBagConstraintsTelefono);


	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono.gridy = 0;
	this.gridBagConstraintsTelefono.gridx = 0;
	this.gridBagConstraintsTelefono.ipadx = 0;
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_telefonoTelefono.add(jLabelid_tipo_telefonoTelefono, this.gridBagConstraintsTelefono);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTelefono = new GridBagConstraints();
		//this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono.gridy = 0;
		this.gridBagConstraintsTelefono.gridx = 2;
		this.gridBagConstraintsTelefono.ipadx = 0;
		this.gridBagConstraintsTelefono.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_telefonoTelefono.add(jButtonid_tipo_telefonoTelefonoBusqueda, this.gridBagConstraintsTelefono);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTelefono = new GridBagConstraints();
		//this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono.gridy = 0;
		this.gridBagConstraintsTelefono.gridx = 3;
		this.gridBagConstraintsTelefono.ipadx = 0;
		this.gridBagConstraintsTelefono.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_telefonoTelefono.add(jButtonid_tipo_telefonoTelefonoUpdate, this.gridBagConstraintsTelefono);
	}

	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono.gridy = 0;
	this.gridBagConstraintsTelefono.gridx = 1;
	this.gridBagConstraintsTelefono.ipadx = 0;
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_telefonoTelefono.add(jComboBoxid_tipo_telefonoTelefono, this.gridBagConstraintsTelefono);


	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono.gridy = 0;
	this.gridBagConstraintsTelefono.gridx = 0;
	this.gridBagConstraintsTelefono.ipadx = 0;
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisTelefono.add(jLabelid_paisTelefono, this.gridBagConstraintsTelefono);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTelefono = new GridBagConstraints();
		//this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono.gridy = 0;
		this.gridBagConstraintsTelefono.gridx = 2;
		this.gridBagConstraintsTelefono.ipadx = 0;
		this.gridBagConstraintsTelefono.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTelefono.add(jButtonid_paisTelefonoBusqueda, this.gridBagConstraintsTelefono);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTelefono = new GridBagConstraints();
		//this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono.gridy = 0;
		this.gridBagConstraintsTelefono.gridx = 3;
		this.gridBagConstraintsTelefono.ipadx = 0;
		this.gridBagConstraintsTelefono.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTelefono.add(jButtonid_paisTelefonoUpdate, this.gridBagConstraintsTelefono);
	}

	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono.gridy = 0;
	this.gridBagConstraintsTelefono.gridx = 1;
	this.gridBagConstraintsTelefono.ipadx = 0;
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisTelefono.add(jComboBoxid_paisTelefono, this.gridBagConstraintsTelefono);


	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono.gridy = 0;
	this.gridBagConstraintsTelefono.gridx = 0;
	this.gridBagConstraintsTelefono.ipadx = 0;
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadTelefono.add(jLabelid_ciudadTelefono, this.gridBagConstraintsTelefono);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTelefono = new GridBagConstraints();
		//this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono.gridy = 0;
		this.gridBagConstraintsTelefono.gridx = 2;
		this.gridBagConstraintsTelefono.ipadx = 0;
		this.gridBagConstraintsTelefono.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadTelefono.add(jButtonid_ciudadTelefonoBusqueda, this.gridBagConstraintsTelefono);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTelefono = new GridBagConstraints();
		//this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono.gridy = 0;
		this.gridBagConstraintsTelefono.gridx = 3;
		this.gridBagConstraintsTelefono.ipadx = 0;
		this.gridBagConstraintsTelefono.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadTelefono.add(jButtonid_ciudadTelefonoUpdate, this.gridBagConstraintsTelefono);
	}

	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono.gridy = 0;
	this.gridBagConstraintsTelefono.gridx = 1;
	this.gridBagConstraintsTelefono.ipadx = 0;
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadTelefono.add(jComboBoxid_ciudadTelefono, this.gridBagConstraintsTelefono);


	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono.gridy = 0;
	this.gridBagConstraintsTelefono.gridx = 0;
	this.gridBagConstraintsTelefono.ipadx = 0;
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoTelefono.add(jLabeltelefonoTelefono, this.gridBagConstraintsTelefono);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTelefono = new GridBagConstraints();
		//this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono.gridy = 0;
		this.gridBagConstraintsTelefono.gridx = 2;
		this.gridBagConstraintsTelefono.ipadx = 0;
		this.gridBagConstraintsTelefono.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoTelefono.add(jButtontelefonoTelefonoBusqueda, this.gridBagConstraintsTelefono);
	}

	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono.gridy = 0;
	this.gridBagConstraintsTelefono.gridx = 1;
	this.gridBagConstraintsTelefono.ipadx = 0;
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoTelefono.add(jscrollPanetelefonoTelefono, this.gridBagConstraintsTelefono);


	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono.gridy = 0;
	this.gridBagConstraintsTelefono.gridx = 0;
	this.gridBagConstraintsTelefono.ipadx = 0;
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelextensionTelefono.add(jLabelextensionTelefono, this.gridBagConstraintsTelefono);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTelefono = new GridBagConstraints();
		//this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono.gridy = 0;
		this.gridBagConstraintsTelefono.gridx = 2;
		this.gridBagConstraintsTelefono.ipadx = 0;
		this.gridBagConstraintsTelefono.insets = new Insets(0, 0, 0, 0);
		this.jPanelextensionTelefono.add(jButtonextensionTelefonoBusqueda, this.gridBagConstraintsTelefono);
	}

	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono.gridy = 0;
	this.gridBagConstraintsTelefono.gridx = 1;
	this.gridBagConstraintsTelefono.ipadx = 0;
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelextensionTelefono.add(jTextFieldextensionTelefono, this.gridBagConstraintsTelefono);


	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono.gridy = 0;
	this.gridBagConstraintsTelefono.gridx = 0;
	this.gridBagConstraintsTelefono.ipadx = 0;
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_activoTelefono.add(jLabeles_activoTelefono, this.gridBagConstraintsTelefono);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTelefono = new GridBagConstraints();
		//this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono.gridy = 0;
		this.gridBagConstraintsTelefono.gridx = 2;
		this.gridBagConstraintsTelefono.ipadx = 0;
		this.gridBagConstraintsTelefono.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_activoTelefono.add(jButtones_activoTelefonoBusqueda, this.gridBagConstraintsTelefono);
	}

	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono.gridy = 0;
	this.gridBagConstraintsTelefono.gridx = 1;
	this.gridBagConstraintsTelefono.ipadx = 0;
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_activoTelefono.add(jCheckBoxes_activoTelefono, this.gridBagConstraintsTelefono);


	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono.gridy = 0;
	this.gridBagConstraintsTelefono.gridx = 0;
	this.gridBagConstraintsTelefono.ipadx = 0;
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTelefono.add(jLabeldescripcionTelefono, this.gridBagConstraintsTelefono);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTelefono = new GridBagConstraints();
		//this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono.gridy = 0;
		this.gridBagConstraintsTelefono.gridx = 2;
		this.gridBagConstraintsTelefono.ipadx = 0;
		this.gridBagConstraintsTelefono.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTelefono.add(jButtondescripcionTelefonoBusqueda, this.gridBagConstraintsTelefono);
	}

	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefono.gridy = 0;
	this.gridBagConstraintsTelefono.gridx = 1;
	this.gridBagConstraintsTelefono.ipadx = 0;
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTelefono.add(jscrollPanedescripcionTelefono, this.gridBagConstraintsTelefono);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTelefono.gridy = iYPanelCamposTelefono;
	this.gridBagConstraintsTelefono.gridx = iXPanelCamposTelefono++;
	this.gridBagConstraintsTelefono.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTelefono.add(this.jPanelidTelefono, this.gridBagConstraintsTelefono);



	if(iXPanelCamposTelefono % 1==0) {
		iXPanelCamposTelefono=0;
		iYPanelCamposTelefono++;
	}
	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTelefono.gridy = iYPanelCamposTelefono;
	this.gridBagConstraintsTelefono.gridx = iXPanelCamposTelefono++;
	this.gridBagConstraintsTelefono.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTelefono.add(this.jPanelid_clienteTelefono, this.gridBagConstraintsTelefono);



	if(iXPanelCamposTelefono % 1==0) {
		iXPanelCamposTelefono=0;
		iYPanelCamposTelefono++;
	}
	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTelefono.gridy = iYPanelCamposTelefono;
	this.gridBagConstraintsTelefono.gridx = iXPanelCamposTelefono++;
	this.gridBagConstraintsTelefono.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTelefono.add(this.jPanelid_tipo_telefonoTelefono, this.gridBagConstraintsTelefono);



	if(iXPanelCamposTelefono % 1==0) {
		iXPanelCamposTelefono=0;
		iYPanelCamposTelefono++;
	}
	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTelefono.gridy = iYPanelCamposTelefono;
	this.gridBagConstraintsTelefono.gridx = iXPanelCamposTelefono++;
	this.gridBagConstraintsTelefono.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTelefono.add(this.jPanelid_paisTelefono, this.gridBagConstraintsTelefono);



	if(iXPanelCamposTelefono % 1==0) {
		iXPanelCamposTelefono=0;
		iYPanelCamposTelefono++;
	}
	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTelefono.gridy = iYPanelCamposTelefono;
	this.gridBagConstraintsTelefono.gridx = iXPanelCamposTelefono++;
	this.gridBagConstraintsTelefono.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTelefono.add(this.jPanelid_ciudadTelefono, this.gridBagConstraintsTelefono);



	if(iXPanelCamposTelefono % 1==0) {
		iXPanelCamposTelefono=0;
		iYPanelCamposTelefono++;
	}
	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTelefono.gridy = iYPanelCamposTelefono;
	this.gridBagConstraintsTelefono.gridx = iXPanelCamposTelefono++;
	this.gridBagConstraintsTelefono.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTelefono.add(this.jPaneltelefonoTelefono, this.gridBagConstraintsTelefono);



	if(iXPanelCamposTelefono % 1==0) {
		iXPanelCamposTelefono=0;
		iYPanelCamposTelefono++;
	}
	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTelefono.gridy = iYPanelCamposTelefono;
	this.gridBagConstraintsTelefono.gridx = iXPanelCamposTelefono++;
	this.gridBagConstraintsTelefono.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTelefono.add(this.jPanelextensionTelefono, this.gridBagConstraintsTelefono);



	if(iXPanelCamposTelefono % 1==0) {
		iXPanelCamposTelefono=0;
		iYPanelCamposTelefono++;
	}
	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTelefono.gridy = iYPanelCamposTelefono;
	this.gridBagConstraintsTelefono.gridx = iXPanelCamposTelefono++;
	this.gridBagConstraintsTelefono.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTelefono.add(this.jPaneles_activoTelefono, this.gridBagConstraintsTelefono);



	if(iXPanelCamposTelefono % 1==0) {
		iXPanelCamposTelefono=0;
		iYPanelCamposTelefono++;
	}
	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTelefono.gridy = iYPanelCamposTelefono;
	this.gridBagConstraintsTelefono.gridx = iXPanelCamposTelefono++;
	this.gridBagConstraintsTelefono.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTelefono.add(this.jPaneldescripcionTelefono, this.gridBagConstraintsTelefono);



	if(iXPanelCamposTelefono % 1==0) {
		iXPanelCamposTelefono=0;
		iYPanelCamposTelefono++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTelefono = new GridBagConstraints();
	this.gridBagConstraintsTelefono.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTelefono.gridy = iYPanelCamposOcultosTelefono;
	this.gridBagConstraintsTelefono.gridx = iXPanelCamposOcultosTelefono++;
	this.gridBagConstraintsTelefono.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTelefono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTelefono.add(this.jPanelid_empresaTelefono, this.gridBagConstraintsTelefono);



	if(iXPanelCamposOcultosTelefono % 1==0) {
		iXPanelCamposOcultosTelefono=0;
		iYPanelCamposOcultosTelefono++;
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
			
		GridBagLayout gridaBagLayoutAccionesTelefono= new GridBagLayout();
		this.jPanelAccionesTelefono.setLayout(gridaBagLayoutAccionesTelefono);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTelefono= new GridBagLayout();
		this.jPanelAccionesFormularioTelefono.setLayout(gridaBagLayoutAccionesFormularioTelefono);
		
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTelefono.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTelefono.add(this.jComboBoxTiposAccionesFormularioTelefono, this.gridBagConstraintsTelefono);

		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTelefono.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTelefono.add(this.jCheckBoxPostAccionNuevoTelefono, this.gridBagConstraintsTelefono);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.telefonoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTelefono.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTelefono.add(this.jCheckBoxPostAccionSinCerrarTelefono, this.gridBagConstraintsTelefono);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.telefonoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.telefonoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTelefono.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTelefono.add(this.jCheckBoxPostAccionSinMensajeTelefono, this.gridBagConstraintsTelefono);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono.gridy = 0;
		this.gridBagConstraintsTelefono.gridx = iPosXAccion++;
			
		this.jPanelAccionesTelefono.add(this.jButtonModificarTelefono, this.gridBagConstraintsTelefono);							

		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono.gridy = 0;
		this.gridBagConstraintsTelefono.gridx =iPosXAccion++;
			
		this.jPanelAccionesTelefono.add(this.jButtonEliminarTelefono, this.gridBagConstraintsTelefono);
		
			
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.gridy = 0;		
		this.gridBagConstraintsTelefono.gridx = iPosXAccion++;
		
		this.jPanelAccionesTelefono.add(this.jButtonActualizarTelefono, this.gridBagConstraintsTelefono);


		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.gridy = 0;		
		this.gridBagConstraintsTelefono.gridx = iPosXAccion++;
		
		this.jPanelAccionesTelefono.add(this.jButtonGuardarCambiosTelefono, this.gridBagConstraintsTelefono);	
		
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.gridy = 0;		
		this.gridBagConstraintsTelefono.gridx =iPosXAccion++;
		
		this.jPanelAccionesTelefono.add(this.jButtonCancelarTelefono, this.gridBagConstraintsTelefono);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTelefono = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTelefono);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.telefonoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTelefono = new GridBagConstraints();						
			this.gridBagConstraintsTelefono.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTelefono.gridx = 0;		
			//this.gridBagConstraintsTelefono.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTelefono.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTelefono.gridx =0;
		this.gridBagConstraintsTelefono.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTelefono.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTelefono, this.gridBagConstraintsTelefono);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TelefonoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTelefono = new TelefonoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Telefono DATOS");
			
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
			
	        //this.setTitle("[FOR] - Telefono DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Telefono Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TelefonoModel telefonoModel=new TelefonoModel(this);
			
			//SI USARA CLASE INTERNA
			//TelefonoModel.TelefonoFocusTraversalPolicy telefonoFocusTraversalPolicy = telefonoModel.new TelefonoFocusTraversalPolicy(this);
			
			//telefonoFocusTraversalPolicy.settelefonoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(telefonoModel);
			
			
			this.jContentPaneDetalleTelefono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTelefono = new GridBagLayout();	
			this.jContentPaneDetalleTelefono.setLayout(gridaBagLayoutDetalleTelefono);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTelefono = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTelefono = new GridBagConstraints();
				this.gridBagConstraintsTelefono.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTelefono.gridx = 0;
					
				
				this.jContentPaneDetalleTelefono.add(jTtoolBarDetalleTelefono, gridBagConstraintsTelefono);								
				
}
			
			this.jScrollPanelDatosEdicionTelefono=   new JScrollPane(jContentPaneDetalleTelefono,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTelefono.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTelefono.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTelefono.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTelefono=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTelefono.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTelefono.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTelefono.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTelefono.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTelefono.gridx = 0;
	        
			this.jContentPaneDetalleTelefono.add(jPanelCamposTelefono, gridBagConstraintsTelefono);
			
			
			
			
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
						&& telefonoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.telefonoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTelefono= new GridBagConstraints();
						this.gridBagConstraintsTelefono.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTelefono.gridx = 0;
						this.jContentPaneDetalleTelefono.add(this.jTabbedPaneRelacionesTelefono, this.gridBagConstraintsTelefono);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTelefono.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTelefono.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTelefono = new GridBagConstraints();
					this.gridBagConstraintsTelefono.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTelefono.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTelefono.gridx = 0;
					
				
					this.jContentPaneDetalleTelefono.add(jPanelCamposOcultosTelefono, gridBagConstraintsTelefono);
				
					this.jPanelCamposOcultosTelefono.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTelefono.gridx = 0;
	        this.gridBagConstraintsTelefono.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTelefono.add(this.jPanelAccionesFormularioTelefono, this.gridBagConstraintsTelefono);							
			
			
			
			this.gridBagConstraintsTelefono = new GridBagConstraints();
	        this.gridBagConstraintsTelefono.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTelefono.gridx = 0;
	        
			
			this.jContentPaneDetalleTelefono.add(this.jPanelAccionesTelefono, this.gridBagConstraintsTelefono);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTelefono);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTelefono=   new JScrollPane(this.jPanelCamposTelefono,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTelefono.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTelefono.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTelefono.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTelefono.gridx = 0;
			this.gridBagConstraintsTelefono.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTelefono.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTelefono, this.gridBagConstraintsTelefono);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTelefono.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTelefono, this.gridBagConstraintsTelefono);			
			
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTelefono.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTelefono, this.gridBagConstraintsTelefono);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTelefono.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTelefono, this.gridBagConstraintsTelefono);
			
			
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTelefono.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTelefono, this.gridBagConstraintsTelefono);
		
			
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTelefono.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTelefono, this.gridBagConstraintsTelefono);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTelefono;//jContentPane;
		
		return jScrollPanelDatosEdicionTelefono;
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
