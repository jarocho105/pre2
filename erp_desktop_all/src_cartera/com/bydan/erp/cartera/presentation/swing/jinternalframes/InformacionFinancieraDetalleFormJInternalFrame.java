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
import com.bydan.erp.cartera.util.InformacionFinancieraConstantesFunciones;

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
public class InformacionFinancieraDetalleFormJInternalFrame extends InformacionFinancieraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleInformacionFinanciera;
	
	protected JMenuBar jmenuBarDetalleInformacionFinanciera;
	
	protected JMenu jmenuDetalleInformacionFinanciera;
	protected JMenu jmenuDetalleArchivoInformacionFinanciera;
	protected JMenu jmenuDetalleAccionesInformacionFinanciera;
	protected JMenu jmenuDetalleDatosInformacionFinanciera;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleInformacionFinanciera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutInformacionFinanciera;	
	protected GridBagConstraints gridBagConstraintsInformacionFinanciera;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected InformacionFinancieraBeanSwingJInternalFrameAdditional jInternalFrameDetalleInformacionFinanciera;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoMoviFinanBeanSwingJInternalFrame tipomovifinanBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovifinan="";
	
	public InformacionFinancieraSessionBean informacionfinancieraSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoMoviFinanSessionBean tipomovifinanSessionBean;	
	
	public InformacionFinancieraLogic informacionfinancieraLogic;
	
	public JScrollPane jScrollPanelDatosInformacionFinanciera;
	public JScrollPane jScrollPanelDatosEdicionInformacionFinanciera;
	public JScrollPane jScrollPanelDatosGeneralInformacionFinanciera;
	
	protected JPanel jPanelCamposInformacionFinanciera;    
	protected JPanel jPanelCamposOcultosInformacionFinanciera;    	
	protected JPanel jPanelAccionesInformacionFinanciera;
	protected JPanel jPanelAccionesFormularioInformacionFinanciera;
    
	
	
	protected Integer iXPanelCamposInformacionFinanciera=0;
	protected Integer iYPanelCamposInformacionFinanciera=0;
	
	protected Integer iXPanelCamposOcultosInformacionFinanciera=0;
	protected Integer iYPanelCamposOcultosInformacionFinanciera=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoInformacionFinanciera;
	public JButton jButtonModificarInformacionFinanciera;
	public JButton jButtonActualizarInformacionFinanciera;
    public JButton jButtonEliminarInformacionFinanciera;
	public JButton jButtonCancelarInformacionFinanciera;
    public JButton jButtonGuardarCambiosInformacionFinanciera;
	public JButton jButtonGuardarCambiosTablaInformacionFinanciera;
	protected JButton jButtonCerrarInformacionFinanciera;
	
	
	protected JButton jButtonProcesarInformacionInformacionFinanciera;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoInformacionFinanciera;
	protected JCheckBox jCheckBoxPostAccionSinCerrarInformacionFinanciera;
	protected JCheckBox jCheckBoxPostAccionSinMensajeInformacionFinanciera;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarInformacionFinanciera;
	protected JButton jButtonModificarToolBarInformacionFinanciera;
	protected JButton jButtonActualizarToolBarInformacionFinanciera;
    protected JButton jButtonEliminarToolBarInformacionFinanciera;
	protected JButton jButtonCancelarToolBarInformacionFinanciera;
    protected JButton jButtonGuardarCambiosToolBarInformacionFinanciera;
	protected JButton jButtonGuardarCambiosTablaToolBarInformacionFinanciera;
	protected JButton jButtonMostrarOcultarTablaToolBarInformacionFinanciera;
	protected JButton jButtonCerrarToolBarInformacionFinanciera;
	
	protected JButton jButtonProcesarInformacionToolBarInformacionFinanciera;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoInformacionFinanciera;
	protected JMenuItem jMenuItemModificarInformacionFinanciera;
	protected JMenuItem jMenuItemActualizarInformacionFinanciera;
    protected JMenuItem jMenuItemEliminarInformacionFinanciera;
	protected JMenuItem jMenuItemCancelarInformacionFinanciera;
    protected JMenuItem jMenuItemGuardarCambiosInformacionFinanciera;
	protected JMenuItem jMenuItemGuardarCambiosTablaInformacionFinanciera;
	protected JMenuItem jMenuItemCerrarInformacionFinanciera;
	protected JMenuItem jMenuItemDetalleCerrarInformacionFinanciera;
	protected JMenuItem jMenuItemDetalleMostarOcultarInformacionFinanciera;
	
	protected JMenuItem jMenuItemProcesarInformacionInformacionFinanciera;
	protected JMenuItem jMenuItemNuevoGuardarCambiosInformacionFinanciera;
	protected JMenuItem jMenuItemMostrarOcultarInformacionFinanciera;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesInformacionFinanciera;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesInformacionFinanciera;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesInformacionFinanciera;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioInformacionFinanciera;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidInformacionFinanciera;
	public JLabel jLabelIdInformacionFinanciera;
	public JLabel jLabelidInformacionFinanciera;
	public JButton jButtonidInformacionFinancieraBusqueda= new JButtonMe();

	public JPanel jPanelvalorInformacionFinanciera;
	public JLabel jLabelvalorInformacionFinanciera;
	public JTextField jTextFieldvalorInformacionFinanciera;
	public JButton jButtonvalorInformacionFinancieraBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionInformacionFinanciera;
	public JLabel jLabeldescripcionInformacionFinanciera;
	public JTextArea jTextAreadescripcionInformacionFinanciera;
	public JScrollPane jscrollPanedescripcionInformacionFinanciera;
	public JButton jButtondescripcionInformacionFinancieraBusqueda= new JButtonMe();

	public JPanel jPanelesactivoInformacionFinanciera;
	public JLabel jLabelesactivoInformacionFinanciera;
	public JCheckBox jCheckBoxesactivoInformacionFinanciera;
	public JButton jButtonesactivoInformacionFinancieraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaInformacionFinanciera;
	public JLabel jLabelid_empresaInformacionFinanciera;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaInformacionFinanciera;
	public JButton jButtonid_empresaInformacionFinanciera= new JButtonMe();
	public JButton jButtonid_empresaInformacionFinancieraUpdate= new JButtonMe();
	public JButton jButtonid_empresaInformacionFinancieraBusqueda= new JButtonMe();

	public JPanel jPanelidclienteInformacionFinanciera;
	public JLabel jLabelidclienteInformacionFinanciera;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidclienteInformacionFinanciera;
	public JButton jButtonidclienteInformacionFinanciera= new JButtonMe();
	public JButton jButtonidclienteInformacionFinancieraUpdate= new JButtonMe();
	public JButton jButtonidclienteInformacionFinancieraBusqueda= new JButtonMe();

	public JPanel jPanelidvalorclientemovimientoInformacionFinanciera;
	public JLabel jLabelidvalorclientemovimientoInformacionFinanciera;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclientemovimientoInformacionFinanciera;
	public JButton jButtonidvalorclientemovimientoInformacionFinanciera= new JButtonMe();
	public JButton jButtonidvalorclientemovimientoInformacionFinancieraUpdate= new JButtonMe();
	public JButton jButtonidvalorclientemovimientoInformacionFinancieraBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesInformacionFinanciera;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public InformacionFinancieraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposInformacionFinanciera=new JPanel();
				this.jPanelAccionesFormularioInformacionFinanciera=new JPanel();
				this.jmenuBarDetalleInformacionFinanciera=new JMenuBar();
				this.jTtoolBarDetalleInformacionFinanciera=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformacionFinancieraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("InformacionFinanciera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public InformacionFinancieraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("InformacionFinanciera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformacionFinancieraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("InformacionFinanciera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformacionFinancieraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("InformacionFinanciera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformacionFinancieraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("InformacionFinanciera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarInformacionFinanciera() {
		return this.jButtonActualizarToolBarInformacionFinanciera;
	}
	
	public JButton getjButtonEliminarToolBarInformacionFinanciera() {
		return this.jButtonEliminarToolBarInformacionFinanciera;
	}
	
	public JButton getjButtonCancelarToolBarInformacionFinanciera() {
		return this.jButtonCancelarToolBarInformacionFinanciera;
	}		
	
	public JButton getjButtonProcesarInformacionInformacionFinanciera() {
		return this.jButtonProcesarInformacionInformacionFinanciera;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionInformacionFinanciera)	{
		this.jButtonProcesarInformacionInformacionFinanciera = jButtonProcesarInformacionInformacionFinanciera;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesInformacionFinanciera() {
		return this.jComboBoxTiposAccionesInformacionFinanciera;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesInformacionFinanciera(
			JComboBox jComboBoxTiposRelacionesInformacionFinanciera) {
		this.jComboBoxTiposRelacionesInformacionFinanciera = jComboBoxTiposRelacionesInformacionFinanciera;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesInformacionFinanciera(
			JComboBox jComboBoxTiposAccionesInformacionFinanciera) {
		this.jComboBoxTiposAccionesInformacionFinanciera = jComboBoxTiposAccionesInformacionFinanciera;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioInformacionFinanciera() {
		return this.jComboBoxTiposAccionesFormularioInformacionFinanciera;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioInformacionFinanciera(
			JComboBox jComboBoxTiposAccionesFormularioInformacionFinanciera) {
		this.jComboBoxTiposAccionesFormularioInformacionFinanciera = jComboBoxTiposAccionesFormularioInformacionFinanciera;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.informacionfinancieraSessionBean=new InformacionFinancieraSessionBean();
		
		this.informacionfinancieraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.informacionfinancieraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.informacionfinancieraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		InformacionFinancieraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		InformacionFinancieraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		InformacionFinancieraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Informacion Financiera MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
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
	
		InformacionFinancieraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleInformacionFinanciera= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarInformacionFinanciera=new JButtonMe();
				this.jButtonModificarToolBarInformacionFinanciera=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarInformacionFinanciera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarInformacionFinanciera,this.jTtoolBarDetalleInformacionFinanciera,
							"actualizar","actualizar","Actualizar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarInformacionFinanciera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarInformacionFinanciera,this.jTtoolBarDetalleInformacionFinanciera,
							"eliminar","eliminar","Eliminar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarInformacionFinanciera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarInformacionFinanciera,this.jTtoolBarDetalleInformacionFinanciera,
							"cancelar","cancelar","Cancelar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarInformacionFinanciera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarInformacionFinanciera,this.jTtoolBarDetalleInformacionFinanciera,
							"guardarcambios","guardarcambios","Guardar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarInformacionFinanciera,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarInformacionFinanciera,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarInformacionFinanciera,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleInformacionFinanciera=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleInformacionFinanciera=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoInformacionFinanciera=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesInformacionFinanciera=new JMenuMe("Acciones");
		this.jmenuDetalleDatosInformacionFinanciera=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoInformacionFinanciera= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoInformacionFinanciera.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoInformacionFinanciera,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarInformacionFinanciera= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarInformacionFinanciera.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarInformacionFinanciera,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarInformacionFinanciera= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarInformacionFinanciera.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarInformacionFinanciera,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarInformacionFinanciera= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarInformacionFinanciera.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarInformacionFinanciera,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarInformacionFinanciera= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarInformacionFinanciera.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarInformacionFinanciera,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosInformacionFinanciera= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosInformacionFinanciera.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosInformacionFinanciera,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarInformacionFinanciera= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarInformacionFinanciera.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarInformacionFinanciera,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarInformacionFinanciera= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarInformacionFinanciera.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarInformacionFinanciera,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarInformacionFinanciera= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarInformacionFinanciera.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarInformacionFinanciera,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarInformacionFinanciera= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarInformacionFinanciera.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarInformacionFinanciera,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoInformacionFinanciera.add(this.jMenuItemDetalleCerrarInformacionFinanciera);
		
		this.jmenuDetalleAccionesInformacionFinanciera.add(this.jMenuItemActualizarInformacionFinanciera);
		this.jmenuDetalleAccionesInformacionFinanciera.add(this.jMenuItemEliminarInformacionFinanciera);
		this.jmenuDetalleAccionesInformacionFinanciera.add(this.jMenuItemCancelarInformacionFinanciera);		
		
		//this.jmenuDetalleDatosInformacionFinanciera.add(this.jMenuItemDetalleAbrirOrderByInformacionFinanciera);				
		this.jmenuDetalleDatosInformacionFinanciera.add(this.jMenuItemDetalleMostarOcultarInformacionFinanciera);				
				
		//this.jmenuDetalleAccionesInformacionFinanciera.add(this.jMenuItemGuardarCambiosInformacionFinanciera);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleInformacionFinanciera.add(this.jmenuDetalleArchivoInformacionFinanciera);		
		this.jmenuBarDetalleInformacionFinanciera.add(this.jmenuDetalleAccionesInformacionFinanciera);		
		this.jmenuBarDetalleInformacionFinanciera.add(this.jmenuDetalleDatosInformacionFinanciera);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleInformacionFinanciera);				
	}
	
	
	public void inicializarElementosCamposInformacionFinanciera() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdInformacionFinanciera = new JLabelMe();
		jLabelIdInformacionFinanciera.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdInformacionFinanciera,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidInformacionFinanciera = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidInformacionFinanciera.setToolTipText(InformacionFinancieraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutInformacionFinanciera= new GridBagLayout();

		this.jPanelidInformacionFinanciera.setLayout(this.gridaBagLayoutInformacionFinanciera);

		jLabelidInformacionFinanciera = new JLabel();
		jLabelidInformacionFinanciera.setText("Id");

		jLabelidInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalorInformacionFinanciera = new JLabelMe();
		this.jLabelvalorInformacionFinanciera.setText(""+InformacionFinancieraConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorInformacionFinanciera.setToolTipText("Valor");
		this.jLabelvalorInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorInformacionFinanciera,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorInformacionFinanciera=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorInformacionFinanciera.setToolTipText(InformacionFinancieraConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutInformacionFinanciera = new GridBagLayout();
		this.jPanelvalorInformacionFinanciera.setLayout(this.gridaBagLayoutInformacionFinanciera);


		jTextFieldvalorInformacionFinanciera= new JTextFieldMe();
		jTextFieldvalorInformacionFinanciera.setEnabled(false);
		jTextFieldvalorInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorInformacionFinanciera,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorInformacionFinanciera.setText("0.0");

		this.jButtonvalorInformacionFinancieraBusqueda= new JButtonMe();
		this.jButtonvalorInformacionFinancieraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorInformacionFinancieraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorInformacionFinancieraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorInformacionFinancieraBusqueda.setText("U");
		this.jButtonvalorInformacionFinancieraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorInformacionFinancieraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorInformacionFinancieraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorInformacionFinanciera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorInformacionFinanciera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorInformacionFinancieraBusqueda"));

		if(this.informacionfinancieraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorInformacionFinancieraBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionInformacionFinanciera = new JLabelMe();
		this.jLabeldescripcionInformacionFinanciera.setText(""+InformacionFinancieraConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionInformacionFinanciera.setToolTipText("Descripcion");
		this.jLabeldescripcionInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionInformacionFinanciera,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionInformacionFinanciera=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionInformacionFinanciera.setToolTipText(InformacionFinancieraConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutInformacionFinanciera = new GridBagLayout();
		this.jPaneldescripcionInformacionFinanciera.setLayout(this.gridaBagLayoutInformacionFinanciera);


		jTextAreadescripcionInformacionFinanciera= new JTextAreaMe();
		jTextAreadescripcionInformacionFinanciera.setEnabled(false);
		jTextAreadescripcionInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionInformacionFinanciera.setLineWrap(true);
		jTextAreadescripcionInformacionFinanciera.setWrapStyleWord(true);
		jTextAreadescripcionInformacionFinanciera.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionInformacionFinanciera.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionInformacionFinanciera,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionInformacionFinanciera = new JScrollPane(jTextAreadescripcionInformacionFinanciera);
		jscrollPanedescripcionInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionInformacionFinancieraBusqueda= new JButtonMe();
		this.jButtondescripcionInformacionFinancieraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionInformacionFinancieraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionInformacionFinancieraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionInformacionFinancieraBusqueda.setText("U");
		this.jButtondescripcionInformacionFinancieraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionInformacionFinancieraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionInformacionFinancieraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionInformacionFinanciera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionInformacionFinanciera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionInformacionFinancieraBusqueda"));

		if(this.informacionfinancieraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionInformacionFinancieraBusqueda.setVisible(false);		}


					
		this.jLabelesactivoInformacionFinanciera = new JLabelMe();
		this.jLabelesactivoInformacionFinanciera.setText(""+InformacionFinancieraConstantesFunciones.LABEL_ESACTIVO+" : *");
		this.jLabelesactivoInformacionFinanciera.setToolTipText("Es Activo");
		this.jLabelesactivoInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesactivoInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesactivoInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesactivoInformacionFinanciera,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesactivoInformacionFinanciera=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesactivoInformacionFinanciera.setToolTipText(InformacionFinancieraConstantesFunciones.LABEL_ESACTIVO);
		this.gridaBagLayoutInformacionFinanciera = new GridBagLayout();
		this.jPanelesactivoInformacionFinanciera.setLayout(this.gridaBagLayoutInformacionFinanciera);


		jCheckBoxesactivoInformacionFinanciera= new JCheckBoxMe();
		jCheckBoxesactivoInformacionFinanciera.setEnabled(false);

		jCheckBoxesactivoInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesactivoInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesactivoInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesactivoInformacionFinanciera,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesactivoInformacionFinancieraBusqueda= new JButtonMe();
		this.jButtonesactivoInformacionFinancieraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesactivoInformacionFinancieraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesactivoInformacionFinancieraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesactivoInformacionFinancieraBusqueda.setText("U");
		this.jButtonesactivoInformacionFinancieraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesactivoInformacionFinancieraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesactivoInformacionFinancieraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesactivoInformacionFinanciera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesactivoInformacionFinanciera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esactivoInformacionFinancieraBusqueda"));

		if(this.informacionfinancieraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesactivoInformacionFinancieraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysInformacionFinanciera() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaInformacionFinanciera = new JLabelMe();
		this.jLabelid_empresaInformacionFinanciera.setText(""+InformacionFinancieraConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaInformacionFinanciera.setToolTipText("Empresa");
		this.jLabelid_empresaInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaInformacionFinanciera,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaInformacionFinanciera=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaInformacionFinanciera.setToolTipText(InformacionFinancieraConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutInformacionFinanciera = new GridBagLayout();
		this.jPanelid_empresaInformacionFinanciera.setLayout(this.gridaBagLayoutInformacionFinanciera);


		jComboBoxid_empresaInformacionFinanciera= new JComboBoxMe();
		jComboBoxid_empresaInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaInformacionFinanciera,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaInformacionFinanciera.setEnabled(false);

		this.jButtonid_empresaInformacionFinanciera= new JButtonMe();
		this.jButtonid_empresaInformacionFinanciera.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaInformacionFinanciera.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaInformacionFinanciera.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaInformacionFinanciera.setText("Buscar");
		this.jButtonid_empresaInformacionFinanciera.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaInformacionFinanciera.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaInformacionFinanciera,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaInformacionFinanciera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaInformacionFinanciera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaInformacionFinanciera"));

		this.jButtonid_empresaInformacionFinancieraBusqueda= new JButtonMe();
		this.jButtonid_empresaInformacionFinancieraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaInformacionFinancieraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaInformacionFinancieraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaInformacionFinancieraBusqueda.setText("U");
		this.jButtonid_empresaInformacionFinancieraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaInformacionFinancieraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaInformacionFinancieraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaInformacionFinanciera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaInformacionFinanciera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaInformacionFinancieraBusqueda"));

		if(this.informacionfinancieraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaInformacionFinancieraBusqueda.setVisible(false);		}

		this.jButtonid_empresaInformacionFinancieraUpdate= new JButtonMe();
		this.jButtonid_empresaInformacionFinancieraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaInformacionFinancieraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaInformacionFinancieraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaInformacionFinancieraUpdate.setText("U");
		this.jButtonid_empresaInformacionFinancieraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaInformacionFinancieraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaInformacionFinancieraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaInformacionFinanciera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaInformacionFinanciera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaInformacionFinancieraUpdate"));



					
		this.jLabelidclienteInformacionFinanciera = new JLabelMe();
		this.jLabelidclienteInformacionFinanciera.setText(""+InformacionFinancieraConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelidclienteInformacionFinanciera.setToolTipText("Cliente");
		this.jLabelidclienteInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidclienteInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidclienteInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidclienteInformacionFinanciera,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidclienteInformacionFinanciera=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidclienteInformacionFinanciera.setToolTipText(InformacionFinancieraConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutInformacionFinanciera = new GridBagLayout();
		this.jPanelidclienteInformacionFinanciera.setLayout(this.gridaBagLayoutInformacionFinanciera);


		jComboBoxidclienteInformacionFinanciera= new JComboBoxMe();
		jComboBoxidclienteInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidclienteInformacionFinanciera,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidclienteInformacionFinanciera= new JButtonMe();
		this.jButtonidclienteInformacionFinanciera.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteInformacionFinanciera.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteInformacionFinanciera.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteInformacionFinanciera.setText("Buscar");
		this.jButtonidclienteInformacionFinanciera.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidclienteInformacionFinanciera.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteInformacionFinanciera,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidclienteInformacionFinanciera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteInformacionFinanciera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteInformacionFinanciera"));

		this.jButtonidclienteInformacionFinancieraBusqueda= new JButtonMe();
		this.jButtonidclienteInformacionFinancieraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteInformacionFinancieraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteInformacionFinancieraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidclienteInformacionFinancieraBusqueda.setText("U");
		this.jButtonidclienteInformacionFinancieraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidclienteInformacionFinancieraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteInformacionFinancieraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidclienteInformacionFinanciera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteInformacionFinanciera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteInformacionFinancieraBusqueda"));

		if(this.informacionfinancieraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidclienteInformacionFinancieraBusqueda.setVisible(false);		}

		this.jButtonidclienteInformacionFinancieraUpdate= new JButtonMe();
		this.jButtonidclienteInformacionFinancieraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteInformacionFinancieraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteInformacionFinancieraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidclienteInformacionFinancieraUpdate.setText("U");
		this.jButtonidclienteInformacionFinancieraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidclienteInformacionFinancieraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteInformacionFinancieraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidclienteInformacionFinanciera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteInformacionFinanciera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteInformacionFinancieraUpdate"));



					
		this.jLabelidvalorclientemovimientoInformacionFinanciera = new JLabelMe();
		this.jLabelidvalorclientemovimientoInformacionFinanciera.setText(""+InformacionFinancieraConstantesFunciones.LABEL_IDTIPOMOVIFINAN+" : *");
		this.jLabelidvalorclientemovimientoInformacionFinanciera.setToolTipText("Tipo Movi Finan");
		this.jLabelidvalorclientemovimientoInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelidvalorclientemovimientoInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelidvalorclientemovimientoInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelidvalorclientemovimientoInformacionFinanciera,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidvalorclientemovimientoInformacionFinanciera=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidvalorclientemovimientoInformacionFinanciera.setToolTipText(InformacionFinancieraConstantesFunciones.LABEL_IDTIPOMOVIFINAN);
		this.gridaBagLayoutInformacionFinanciera = new GridBagLayout();
		this.jPanelidvalorclientemovimientoInformacionFinanciera.setLayout(this.gridaBagLayoutInformacionFinanciera);


		jComboBoxidvalorclientemovimientoInformacionFinanciera= new JComboBoxMe();
		jComboBoxidvalorclientemovimientoInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientemovimientoInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientemovimientoInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclientemovimientoInformacionFinanciera,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidvalorclientemovimientoInformacionFinanciera= new JButtonMe();
		this.jButtonidvalorclientemovimientoInformacionFinanciera.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientemovimientoInformacionFinanciera.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientemovimientoInformacionFinanciera.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientemovimientoInformacionFinanciera.setText("Buscar");
		this.jButtonidvalorclientemovimientoInformacionFinanciera.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidvalorclientemovimientoInformacionFinanciera.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientemovimientoInformacionFinanciera,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidvalorclientemovimientoInformacionFinanciera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientemovimientoInformacionFinanciera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientemovimientoInformacionFinanciera"));

		this.jButtonidvalorclientemovimientoInformacionFinancieraBusqueda= new JButtonMe();
		this.jButtonidvalorclientemovimientoInformacionFinancieraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientemovimientoInformacionFinancieraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientemovimientoInformacionFinancieraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclientemovimientoInformacionFinancieraBusqueda.setText("U");
		this.jButtonidvalorclientemovimientoInformacionFinancieraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidvalorclientemovimientoInformacionFinancieraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientemovimientoInformacionFinancieraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidvalorclientemovimientoInformacionFinanciera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientemovimientoInformacionFinanciera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientemovimientoInformacionFinancieraBusqueda"));

		if(this.informacionfinancieraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidvalorclientemovimientoInformacionFinancieraBusqueda.setVisible(false);		}

		this.jButtonidvalorclientemovimientoInformacionFinancieraUpdate= new JButtonMe();
		this.jButtonidvalorclientemovimientoInformacionFinancieraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientemovimientoInformacionFinancieraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientemovimientoInformacionFinancieraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclientemovimientoInformacionFinancieraUpdate.setText("U");
		this.jButtonidvalorclientemovimientoInformacionFinancieraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidvalorclientemovimientoInformacionFinancieraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientemovimientoInformacionFinancieraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidvalorclientemovimientoInformacionFinanciera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientemovimientoInformacionFinanciera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientemovimientoInformacionFinancieraUpdate"));



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
		//this.jInternalFrameDetalleInformacionFinanciera = new InformacionFinancieraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Informacion Financiera DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutInformacionFinanciera= new GridBagLayout();
		

		
		String sToolTipInformacionFinanciera="";
		sToolTipInformacionFinanciera=InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipInformacionFinanciera+="(Cartera.InformacionFinanciera)";
		}
		
		if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
			sToolTipInformacionFinanciera+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoInformacionFinanciera = new JButtonMe();
		this.jButtonModificarInformacionFinanciera = new JButtonMe();
        this.jButtonActualizarInformacionFinanciera = new JButtonMe();
        this.jButtonEliminarInformacionFinanciera = new JButtonMe();
        this.jButtonCancelarInformacionFinanciera = new JButtonMe();
        this.jButtonGuardarCambiosInformacionFinanciera = new JButtonMe();
		this.jButtonGuardarCambiosTablaInformacionFinanciera = new JButtonMe();
		this.jButtonCerrarInformacionFinanciera = new JButtonMe();
		
		this.jScrollPanelDatosInformacionFinanciera = new JScrollPane();   
        this.jScrollPanelDatosEdicionInformacionFinanciera = new JScrollPane();
		this.jScrollPanelDatosGeneralInformacionFinanciera = new JScrollPane();
				
		
		
		this.jPanelCamposInformacionFinanciera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosInformacionFinanciera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesInformacionFinanciera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioInformacionFinanciera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Informacion Financiera";
		
		if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informacion Financieras" + this.sPath));
		} else {
			this.jScrollPanelDatosInformacionFinanciera.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposInformacionFinanciera.setName("jPanelCamposInformacionFinanciera"); 

		this.jPanelCamposOcultosInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosInformacionFinanciera.setName("jPanelCamposOcultosInformacionFinanciera"); 

        this.jPanelAccionesInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesInformacionFinanciera.setToolTipText("Acciones");
        this.jPanelAccionesInformacionFinanciera.setName("Acciones"); 

		this.jPanelAccionesFormularioInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioInformacionFinanciera.setToolTipText("Acciones");
        this.jPanelAccionesFormularioInformacionFinanciera.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoInformacionFinanciera.setText("Nuevo");
		this.jButtonModificarInformacionFinanciera.setText("Editar");
        this.jButtonActualizarInformacionFinanciera.setText("Actualizar");
        this.jButtonEliminarInformacionFinanciera.setText("Eliminar");
        this.jButtonCancelarInformacionFinanciera.setText("Cancelar");
        this.jButtonGuardarCambiosInformacionFinanciera.setText("Guardar");
		this.jButtonGuardarCambiosTablaInformacionFinanciera.setText("Guardar");
		this.jButtonCerrarInformacionFinanciera.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoInformacionFinanciera,"nuevo_button","Nuevo",this.informacionfinancieraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarInformacionFinanciera,"modificar_button","Editar",this.informacionfinancieraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarInformacionFinanciera,"actualizar_button","Actualizar",this.informacionfinancieraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarInformacionFinanciera,"eliminar_button","Eliminar",this.informacionfinancieraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarInformacionFinanciera,"cancelar_button","Cancelar",this.informacionfinancieraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosInformacionFinanciera,"guardarcambios_button","Guardar",this.informacionfinancieraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaInformacionFinanciera,"guardarcambiostabla_button","Guardar",this.informacionfinancieraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarInformacionFinanciera,"cerrar_button","Salir",this.informacionfinancieraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoInformacionFinanciera.setToolTipText("Nuevo"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarInformacionFinanciera.setToolTipText("Editar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarInformacionFinanciera.setToolTipText("Actualizar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarInformacionFinanciera.setToolTipText("Eliminar)"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarInformacionFinanciera.setToolTipText("Cancelar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosInformacionFinanciera.setToolTipText("Guardar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaInformacionFinanciera.setToolTipText("Guardar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarInformacionFinanciera.setToolTipText("Salir"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoInformacionFinanciera";
		inputMap = this.jButtonNuevoInformacionFinanciera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoInformacionFinanciera.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoInformacionFinanciera"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarInformacionFinanciera";
		inputMap = this.jButtonActualizarInformacionFinanciera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarInformacionFinanciera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarInformacionFinanciera"));
		
		//ELIMINAR
		sMapKey = "EliminarInformacionFinanciera";
		inputMap = this.jButtonEliminarInformacionFinanciera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarInformacionFinanciera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarInformacionFinanciera"));
		
		//CANCELAR	
		sMapKey = "CancelarInformacionFinanciera";
		inputMap = this.jButtonCancelarInformacionFinanciera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarInformacionFinanciera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarInformacionFinanciera"));
		
		//CERRAR		
		sMapKey = "CerrarInformacionFinanciera";
		inputMap = this.jButtonCerrarInformacionFinanciera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarInformacionFinanciera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarInformacionFinanciera"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaInformacionFinanciera";
		inputMap = this.jButtonGuardarCambiosTablaInformacionFinanciera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaInformacionFinanciera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaInformacionFinanciera"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoInformacionFinanciera = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoInformacionFinanciera.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoInformacionFinanciera.setToolTipText("Nuevo InformacionFinanciera");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarInformacionFinanciera = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarInformacionFinanciera.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarInformacionFinanciera.setToolTipText("Sin Cerrar Ventana InformacionFinanciera");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeInformacionFinanciera = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeInformacionFinanciera.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeInformacionFinanciera.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesInformacionFinanciera = new JComboBoxMe();
		//this.jComboBoxTiposAccionesInformacionFinanciera.setText("Accion");
		this.jComboBoxTiposAccionesInformacionFinanciera.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioInformacionFinanciera = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioInformacionFinanciera.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioInformacionFinanciera.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesInformacionFinanciera = new JLabelMe();
		
		this.jLabelAccionesInformacionFinanciera.setText("Acciones");		
		this.jLabelAccionesInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposInformacionFinanciera();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysInformacionFinanciera();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesInformacionFinanciera=new JTabbedPane();
		this.jTabbedPaneRelacionesInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesInformacionFinanciera,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesInformacionFinanciera.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesInformacionFinanciera.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesInformacionFinanciera.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioInformacionFinanciera.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioInformacionFinanciera.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioInformacionFinanciera.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposInformacionFinanciera = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosInformacionFinanciera = new GridBagLayout();
		
		this.jPanelCamposInformacionFinanciera.setLayout(gridaBagLayoutCamposInformacionFinanciera);
		this.jPanelCamposOcultosInformacionFinanciera.setLayout(gridaBagLayoutCamposOcultosInformacionFinanciera);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
	this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionFinanciera.gridy = 0;
	this.gridBagConstraintsInformacionFinanciera.gridx = 0;
	this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
	this.gridBagConstraintsInformacionFinanciera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidInformacionFinanciera.add(jLabelIdInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);



	this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
	this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionFinanciera.gridy = 0;
	this.gridBagConstraintsInformacionFinanciera.gridx = 1;
	this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
	this.gridBagConstraintsInformacionFinanciera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidInformacionFinanciera.add(jLabelidInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);


	this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
	this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionFinanciera.gridy = 0;
	this.gridBagConstraintsInformacionFinanciera.gridx = 0;
	this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
	this.gridBagConstraintsInformacionFinanciera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaInformacionFinanciera.add(jLabelid_empresaInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		//this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = 0;
		this.gridBagConstraintsInformacionFinanciera.gridx = 2;
		this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
		this.gridBagConstraintsInformacionFinanciera.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaInformacionFinanciera.add(jButtonid_empresaInformacionFinancieraBusqueda, this.gridBagConstraintsInformacionFinanciera);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		//this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = 0;
		this.gridBagConstraintsInformacionFinanciera.gridx = 3;
		this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
		this.gridBagConstraintsInformacionFinanciera.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaInformacionFinanciera.add(jButtonid_empresaInformacionFinancieraUpdate, this.gridBagConstraintsInformacionFinanciera);
	}

	this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
	this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionFinanciera.gridy = 0;
	this.gridBagConstraintsInformacionFinanciera.gridx = 1;
	this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
	this.gridBagConstraintsInformacionFinanciera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaInformacionFinanciera.add(jComboBoxid_empresaInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);


	this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
	this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionFinanciera.gridy = 0;
	this.gridBagConstraintsInformacionFinanciera.gridx = 0;
	this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
	this.gridBagConstraintsInformacionFinanciera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidclienteInformacionFinanciera.add(jLabelidclienteInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
	//this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionFinanciera.gridy = 0;
	this.gridBagConstraintsInformacionFinanciera.gridx = 2;
	this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
	this.gridBagConstraintsInformacionFinanciera.insets = new Insets(0, 0, 0, 0);
	this.jPanelidclienteInformacionFinanciera.add(jButtonidclienteInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		//this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = 0;
		this.gridBagConstraintsInformacionFinanciera.gridx = 3;
		this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
		this.gridBagConstraintsInformacionFinanciera.insets = new Insets(0, 0, 0, 0);
		this.jPanelidclienteInformacionFinanciera.add(jButtonidclienteInformacionFinancieraBusqueda, this.gridBagConstraintsInformacionFinanciera);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		//this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = 0;
		this.gridBagConstraintsInformacionFinanciera.gridx = 4;
		this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
		this.gridBagConstraintsInformacionFinanciera.insets = new Insets(0, 0, 0, 0);
		this.jPanelidclienteInformacionFinanciera.add(jButtonidclienteInformacionFinancieraUpdate, this.gridBagConstraintsInformacionFinanciera);
	}

	this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
	this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionFinanciera.gridy = 0;
	this.gridBagConstraintsInformacionFinanciera.gridx = 1;
	this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
	this.gridBagConstraintsInformacionFinanciera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidclienteInformacionFinanciera.add(jComboBoxidclienteInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);


	this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
	this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionFinanciera.gridy = 0;
	this.gridBagConstraintsInformacionFinanciera.gridx = 0;
	this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
	this.gridBagConstraintsInformacionFinanciera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidvalorclientemovimientoInformacionFinanciera.add(jLabelidvalorclientemovimientoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		//this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = 0;
		this.gridBagConstraintsInformacionFinanciera.gridx = 2;
		this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
		this.gridBagConstraintsInformacionFinanciera.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclientemovimientoInformacionFinanciera.add(jButtonidvalorclientemovimientoInformacionFinancieraBusqueda, this.gridBagConstraintsInformacionFinanciera);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		//this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = 0;
		this.gridBagConstraintsInformacionFinanciera.gridx = 3;
		this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
		this.gridBagConstraintsInformacionFinanciera.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclientemovimientoInformacionFinanciera.add(jButtonidvalorclientemovimientoInformacionFinancieraUpdate, this.gridBagConstraintsInformacionFinanciera);
	}

	this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
	this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionFinanciera.gridy = 0;
	this.gridBagConstraintsInformacionFinanciera.gridx = 1;
	this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
	this.gridBagConstraintsInformacionFinanciera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidvalorclientemovimientoInformacionFinanciera.add(jComboBoxidvalorclientemovimientoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);


	this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
	this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionFinanciera.gridy = 0;
	this.gridBagConstraintsInformacionFinanciera.gridx = 0;
	this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
	this.gridBagConstraintsInformacionFinanciera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorInformacionFinanciera.add(jLabelvalorInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		//this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = 0;
		this.gridBagConstraintsInformacionFinanciera.gridx = 2;
		this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
		this.gridBagConstraintsInformacionFinanciera.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorInformacionFinanciera.add(jButtonvalorInformacionFinancieraBusqueda, this.gridBagConstraintsInformacionFinanciera);
	}

	this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
	this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionFinanciera.gridy = 0;
	this.gridBagConstraintsInformacionFinanciera.gridx = 1;
	this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
	this.gridBagConstraintsInformacionFinanciera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorInformacionFinanciera.add(jTextFieldvalorInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);


	this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
	this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionFinanciera.gridy = 0;
	this.gridBagConstraintsInformacionFinanciera.gridx = 0;
	this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
	this.gridBagConstraintsInformacionFinanciera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionInformacionFinanciera.add(jLabeldescripcionInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		//this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = 0;
		this.gridBagConstraintsInformacionFinanciera.gridx = 2;
		this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
		this.gridBagConstraintsInformacionFinanciera.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionInformacionFinanciera.add(jButtondescripcionInformacionFinancieraBusqueda, this.gridBagConstraintsInformacionFinanciera);
	}

	this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
	this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionFinanciera.gridy = 0;
	this.gridBagConstraintsInformacionFinanciera.gridx = 1;
	this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
	this.gridBagConstraintsInformacionFinanciera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionInformacionFinanciera.add(jscrollPanedescripcionInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);


	this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
	this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionFinanciera.gridy = 0;
	this.gridBagConstraintsInformacionFinanciera.gridx = 0;
	this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
	this.gridBagConstraintsInformacionFinanciera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesactivoInformacionFinanciera.add(jLabelesactivoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		//this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = 0;
		this.gridBagConstraintsInformacionFinanciera.gridx = 2;
		this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
		this.gridBagConstraintsInformacionFinanciera.insets = new Insets(0, 0, 0, 0);
		this.jPanelesactivoInformacionFinanciera.add(jButtonesactivoInformacionFinancieraBusqueda, this.gridBagConstraintsInformacionFinanciera);
	}

	this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
	this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionFinanciera.gridy = 0;
	this.gridBagConstraintsInformacionFinanciera.gridx = 1;
	this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
	this.gridBagConstraintsInformacionFinanciera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesactivoInformacionFinanciera.add(jCheckBoxesactivoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
	this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionFinanciera.gridy = iYPanelCamposInformacionFinanciera;
	this.gridBagConstraintsInformacionFinanciera.gridx = iXPanelCamposInformacionFinanciera++;
	this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionFinanciera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionFinanciera.add(this.jPanelidInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);



	if(iXPanelCamposInformacionFinanciera % 1==0) {
		iXPanelCamposInformacionFinanciera=0;
		iYPanelCamposInformacionFinanciera++;
	}
	this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
	this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionFinanciera.gridy = iYPanelCamposInformacionFinanciera;
	this.gridBagConstraintsInformacionFinanciera.gridx = iXPanelCamposInformacionFinanciera++;
	this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionFinanciera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionFinanciera.add(this.jPanelidclienteInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);



	if(iXPanelCamposInformacionFinanciera % 1==0) {
		iXPanelCamposInformacionFinanciera=0;
		iYPanelCamposInformacionFinanciera++;
	}
	this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
	this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionFinanciera.gridy = iYPanelCamposInformacionFinanciera;
	this.gridBagConstraintsInformacionFinanciera.gridx = iXPanelCamposInformacionFinanciera++;
	this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionFinanciera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionFinanciera.add(this.jPanelidvalorclientemovimientoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);



	if(iXPanelCamposInformacionFinanciera % 1==0) {
		iXPanelCamposInformacionFinanciera=0;
		iYPanelCamposInformacionFinanciera++;
	}
	this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
	this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionFinanciera.gridy = iYPanelCamposInformacionFinanciera;
	this.gridBagConstraintsInformacionFinanciera.gridx = iXPanelCamposInformacionFinanciera++;
	this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionFinanciera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionFinanciera.add(this.jPanelvalorInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);



	if(iXPanelCamposInformacionFinanciera % 1==0) {
		iXPanelCamposInformacionFinanciera=0;
		iYPanelCamposInformacionFinanciera++;
	}
	this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
	this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionFinanciera.gridy = iYPanelCamposInformacionFinanciera;
	this.gridBagConstraintsInformacionFinanciera.gridx = iXPanelCamposInformacionFinanciera++;
	this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionFinanciera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionFinanciera.add(this.jPaneldescripcionInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);



	if(iXPanelCamposInformacionFinanciera % 1==0) {
		iXPanelCamposInformacionFinanciera=0;
		iYPanelCamposInformacionFinanciera++;
	}
	this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
	this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionFinanciera.gridy = iYPanelCamposInformacionFinanciera;
	this.gridBagConstraintsInformacionFinanciera.gridx = iXPanelCamposInformacionFinanciera++;
	this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionFinanciera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionFinanciera.add(this.jPanelesactivoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);



	if(iXPanelCamposInformacionFinanciera % 1==0) {
		iXPanelCamposInformacionFinanciera=0;
		iYPanelCamposInformacionFinanciera++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
	this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionFinanciera.gridy = iYPanelCamposOcultosInformacionFinanciera;
	this.gridBagConstraintsInformacionFinanciera.gridx = iXPanelCamposOcultosInformacionFinanciera++;
	this.gridBagConstraintsInformacionFinanciera.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionFinanciera.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosInformacionFinanciera.add(this.jPanelid_empresaInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);



	if(iXPanelCamposOcultosInformacionFinanciera % 1==0) {
		iXPanelCamposOcultosInformacionFinanciera=0;
		iYPanelCamposOcultosInformacionFinanciera++;
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
			
		GridBagLayout gridaBagLayoutAccionesInformacionFinanciera= new GridBagLayout();
		this.jPanelAccionesInformacionFinanciera.setLayout(gridaBagLayoutAccionesInformacionFinanciera);
		
		GridBagLayout gridaBagLayoutAccionesFormularioInformacionFinanciera= new GridBagLayout();
		this.jPanelAccionesFormularioInformacionFinanciera.setLayout(gridaBagLayoutAccionesFormularioInformacionFinanciera);
		
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsInformacionFinanciera.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioInformacionFinanciera.add(this.jComboBoxTiposAccionesFormularioInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);

		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsInformacionFinanciera.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioInformacionFinanciera.add(this.jCheckBoxPostAccionNuevoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.informacionfinancieraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsInformacionFinanciera.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioInformacionFinanciera.add(this.jCheckBoxPostAccionSinCerrarInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.informacionfinancieraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsInformacionFinanciera.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioInformacionFinanciera.add(this.jCheckBoxPostAccionSinMensajeInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = 0;
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXAccion++;
			
		this.jPanelAccionesInformacionFinanciera.add(this.jButtonModificarInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);							

		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = 0;
		this.gridBagConstraintsInformacionFinanciera.gridx =iPosXAccion++;
			
		this.jPanelAccionesInformacionFinanciera.add(this.jButtonEliminarInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		
			
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.gridy = 0;		
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXAccion++;
		
		this.jPanelAccionesInformacionFinanciera.add(this.jButtonActualizarInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);


		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.gridy = 0;		
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXAccion++;
		
		this.jPanelAccionesInformacionFinanciera.add(this.jButtonGuardarCambiosInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);	
		
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.gridy = 0;		
		this.gridBagConstraintsInformacionFinanciera.gridx =iPosXAccion++;
		
		this.jPanelAccionesInformacionFinanciera.add(this.jButtonCancelarInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutInformacionFinanciera = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutInformacionFinanciera);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();						
			this.gridBagConstraintsInformacionFinanciera.gridy = iGridyPrincipal++;
			this.gridBagConstraintsInformacionFinanciera.gridx = 0;		
			//this.gridBagConstraintsInformacionFinanciera.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsInformacionFinanciera.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.gridy =iGridyPrincipal++;
		this.gridBagConstraintsInformacionFinanciera.gridx =0;
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsInformacionFinanciera.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(InformacionFinancieraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleInformacionFinanciera = new InformacionFinancieraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Informacion Financiera DATOS");
			
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
			
	        //this.setTitle("[FOR] - Informacion Financiera DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Informacion Financiera Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			InformacionFinancieraModel informacionfinancieraModel=new InformacionFinancieraModel(this);
			
			//SI USARA CLASE INTERNA
			//InformacionFinancieraModel.InformacionFinancieraFocusTraversalPolicy informacionfinancieraFocusTraversalPolicy = informacionfinancieraModel.new InformacionFinancieraFocusTraversalPolicy(this);
			
			//informacionfinancieraFocusTraversalPolicy.setinformacionfinancieraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(informacionfinancieraModel);
			
			
			this.jContentPaneDetalleInformacionFinanciera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleInformacionFinanciera = new GridBagLayout();	
			this.jContentPaneDetalleInformacionFinanciera.setLayout(gridaBagLayoutDetalleInformacionFinanciera);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosInformacionFinanciera = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
				this.gridBagConstraintsInformacionFinanciera.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsInformacionFinanciera.gridx = 0;
					
				
				this.jContentPaneDetalleInformacionFinanciera.add(jTtoolBarDetalleInformacionFinanciera, gridBagConstraintsInformacionFinanciera);								
				
}
			
			this.jScrollPanelDatosEdicionInformacionFinanciera=   new JScrollPane(jContentPaneDetalleInformacionFinanciera,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionInformacionFinanciera.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionInformacionFinanciera.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionInformacionFinanciera.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralInformacionFinanciera=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralInformacionFinanciera.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralInformacionFinanciera.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralInformacionFinanciera.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			
			
	        this.gridBagConstraintsInformacionFinanciera.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsInformacionFinanciera.gridx = 0;
	        
			this.jContentPaneDetalleInformacionFinanciera.add(jPanelCamposInformacionFinanciera, gridBagConstraintsInformacionFinanciera);
			
			
			
			
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
						&& informacionfinancieraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.informacionfinancieraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsInformacionFinanciera= new GridBagConstraints();
						this.gridBagConstraintsInformacionFinanciera.gridy = iGridyRelaciones++;
						this.gridBagConstraintsInformacionFinanciera.gridx = 0;
						this.jContentPaneDetalleInformacionFinanciera.add(this.jTabbedPaneRelacionesInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesInformacionFinanciera.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosInformacionFinanciera.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
					this.gridBagConstraintsInformacionFinanciera.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsInformacionFinanciera.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsInformacionFinanciera.gridx = 0;
					
				
					this.jContentPaneDetalleInformacionFinanciera.add(jPanelCamposOcultosInformacionFinanciera, gridBagConstraintsInformacionFinanciera);
				
					this.jPanelCamposOcultosInformacionFinanciera.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsInformacionFinanciera.gridx = 0;
	        this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleInformacionFinanciera.add(this.jPanelAccionesFormularioInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);							
			
			
			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
	        this.gridBagConstraintsInformacionFinanciera.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsInformacionFinanciera.gridx = 0;
	        
			
			this.jContentPaneDetalleInformacionFinanciera.add(this.jPanelAccionesInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionInformacionFinanciera);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionInformacionFinanciera=   new JScrollPane(this.jPanelCamposInformacionFinanciera,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionInformacionFinanciera.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionInformacionFinanciera.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionInformacionFinanciera.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsInformacionFinanciera.gridx = 0;
			this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsInformacionFinanciera.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsInformacionFinanciera.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);			
			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsInformacionFinanciera.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformacionFinanciera.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
			
			
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformacionFinanciera.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		
			
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsInformacionFinanciera.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralInformacionFinanciera;//jContentPane;
		
		return jScrollPanelDatosEdicionInformacionFinanciera;
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
