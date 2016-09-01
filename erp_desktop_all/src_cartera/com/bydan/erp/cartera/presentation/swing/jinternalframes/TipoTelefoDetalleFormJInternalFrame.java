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
import com.bydan.erp.cartera.util.TipoTelefoConstantesFunciones;

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
public class TipoTelefoDetalleFormJInternalFrame extends TipoTelefoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoTelefo;
	
	protected JMenuBar jmenuBarDetalleTipoTelefo;
	
	protected JMenu jmenuDetalleTipoTelefo;
	protected JMenu jmenuDetalleArchivoTipoTelefo;
	protected JMenu jmenuDetalleAccionesTipoTelefo;
	protected JMenu jmenuDetalleDatosTipoTelefo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoTelefo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoTelefo;	
	protected GridBagConstraints gridBagConstraintsTipoTelefo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoTelefoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoTelefo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoTelefoSessionBean tipotelefoSessionBean;
	
	

	public TelefonoBeanSwingJInternalFrame telefonoBeanSwingJInternalFrame=null;
	public TelefonoBeanSwingJInternalFrame telefonoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTelefono=false;
	public TelefonoSessionBean telefonoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoTelefoLogic tipotelefoLogic;
	
	public JScrollPane jScrollPanelDatosTipoTelefo;
	public JScrollPane jScrollPanelDatosEdicionTipoTelefo;
	public JScrollPane jScrollPanelDatosGeneralTipoTelefo;
	
	protected JPanel jPanelCamposTipoTelefo;    
	protected JPanel jPanelCamposOcultosTipoTelefo;    	
	protected JPanel jPanelAccionesTipoTelefo;
	protected JPanel jPanelAccionesFormularioTipoTelefo;
    
	
	
	protected Integer iXPanelCamposTipoTelefo=0;
	protected Integer iYPanelCamposTipoTelefo=0;
	
	protected Integer iXPanelCamposOcultosTipoTelefo=0;
	protected Integer iYPanelCamposOcultosTipoTelefo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoTelefo;
	public JButton jButtonModificarTipoTelefo;
	public JButton jButtonActualizarTipoTelefo;
    public JButton jButtonEliminarTipoTelefo;
	public JButton jButtonCancelarTipoTelefo;
    public JButton jButtonGuardarCambiosTipoTelefo;
	public JButton jButtonGuardarCambiosTablaTipoTelefo;
	protected JButton jButtonCerrarTipoTelefo;
	
	
	protected JButton jButtonProcesarInformacionTipoTelefo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoTelefo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoTelefo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoTelefo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoTelefo;
	protected JButton jButtonModificarToolBarTipoTelefo;
	protected JButton jButtonActualizarToolBarTipoTelefo;
    protected JButton jButtonEliminarToolBarTipoTelefo;
	protected JButton jButtonCancelarToolBarTipoTelefo;
    protected JButton jButtonGuardarCambiosToolBarTipoTelefo;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoTelefo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoTelefo;
	protected JButton jButtonCerrarToolBarTipoTelefo;
	
	protected JButton jButtonProcesarInformacionToolBarTipoTelefo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoTelefo;
	protected JMenuItem jMenuItemModificarTipoTelefo;
	protected JMenuItem jMenuItemActualizarTipoTelefo;
    protected JMenuItem jMenuItemEliminarTipoTelefo;
	protected JMenuItem jMenuItemCancelarTipoTelefo;
    protected JMenuItem jMenuItemGuardarCambiosTipoTelefo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoTelefo;
	protected JMenuItem jMenuItemCerrarTipoTelefo;
	protected JMenuItem jMenuItemDetalleCerrarTipoTelefo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoTelefo;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoTelefo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoTelefo;
	protected JMenuItem jMenuItemMostrarOcultarTipoTelefo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoTelefo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoTelefo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoTelefo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoTelefo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoTelefo;
	public JLabel jLabelIdTipoTelefo;
	public JLabel jLabelidTipoTelefo;
	public JButton jButtonidTipoTelefoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoTelefo;
	public JLabel jLabelcodigoTipoTelefo;
	public JTextField jTextFieldcodigoTipoTelefo;
	public JButton jButtoncodigoTipoTelefoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoTelefo;
	public JLabel jLabelnombreTipoTelefo;
	public JTextArea jTextAreanombreTipoTelefo;
	public JScrollPane jscrollPanenombreTipoTelefo;
	public JButton jButtonnombreTipoTelefoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoTelefo;
	public JLabel jLabelid_empresaTipoTelefo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoTelefo;
	public JButton jButtonid_empresaTipoTelefo= new JButtonMe();
	public JButton jButtonid_empresaTipoTelefoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoTelefoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoTelefo;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoTelefoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoTelefo=new JPanel();
				this.jPanelAccionesFormularioTipoTelefo=new JPanel();
				this.jmenuBarDetalleTipoTelefo=new JMenuBar();
				this.jTtoolBarDetalleTipoTelefo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTelefoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoTelefo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoTelefoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoTelefo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTelefoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTelefo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTelefoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTelefo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTelefoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoTelefo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoTelefo() {
		return this.jButtonActualizarToolBarTipoTelefo;
	}
	
	public JButton getjButtonEliminarToolBarTipoTelefo() {
		return this.jButtonEliminarToolBarTipoTelefo;
	}
	
	public JButton getjButtonCancelarToolBarTipoTelefo() {
		return this.jButtonCancelarToolBarTipoTelefo;
	}		
	
	public JButton getjButtonProcesarInformacionTipoTelefo() {
		return this.jButtonProcesarInformacionTipoTelefo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoTelefo)	{
		this.jButtonProcesarInformacionTipoTelefo = jButtonProcesarInformacionTipoTelefo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoTelefo() {
		return this.jComboBoxTiposAccionesTipoTelefo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoTelefo(
			JComboBox jComboBoxTiposRelacionesTipoTelefo) {
		this.jComboBoxTiposRelacionesTipoTelefo = jComboBoxTiposRelacionesTipoTelefo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoTelefo(
			JComboBox jComboBoxTiposAccionesTipoTelefo) {
		this.jComboBoxTiposAccionesTipoTelefo = jComboBoxTiposAccionesTipoTelefo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoTelefo() {
		return this.jComboBoxTiposAccionesFormularioTipoTelefo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoTelefo(
			JComboBox jComboBoxTiposAccionesFormularioTipoTelefo) {
		this.jComboBoxTiposAccionesFormularioTipoTelefo = jComboBoxTiposAccionesFormularioTipoTelefo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipotelefoSessionBean=new TipoTelefoSessionBean();
		
		this.tipotelefoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipotelefoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipotelefoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.telefonoSessionBean=new TelefonoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoTelefoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoTelefoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoTelefoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Telefo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoTelefoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoTelefo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoTelefo=new JButtonMe();
				this.jButtonModificarToolBarTipoTelefo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoTelefo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoTelefo,this.jTtoolBarDetalleTipoTelefo,
							"actualizar","actualizar","Actualizar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoTelefo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoTelefo,this.jTtoolBarDetalleTipoTelefo,
							"eliminar","eliminar","Eliminar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoTelefo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoTelefo,this.jTtoolBarDetalleTipoTelefo,
							"cancelar","cancelar","Cancelar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoTelefo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoTelefo,this.jTtoolBarDetalleTipoTelefo,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoTelefo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoTelefo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoTelefo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoTelefo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoTelefo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoTelefo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoTelefo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoTelefo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoTelefo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoTelefo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoTelefo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoTelefo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoTelefo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoTelefo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoTelefo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoTelefo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoTelefo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoTelefo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoTelefo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoTelefo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoTelefo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoTelefo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoTelefo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoTelefo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoTelefo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoTelefo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoTelefo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoTelefo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoTelefo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoTelefo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoTelefo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoTelefo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoTelefo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoTelefo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoTelefo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoTelefo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoTelefo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoTelefo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoTelefo.add(this.jMenuItemDetalleCerrarTipoTelefo);
		
		this.jmenuDetalleAccionesTipoTelefo.add(this.jMenuItemActualizarTipoTelefo);
		this.jmenuDetalleAccionesTipoTelefo.add(this.jMenuItemEliminarTipoTelefo);
		this.jmenuDetalleAccionesTipoTelefo.add(this.jMenuItemCancelarTipoTelefo);		
		
		//this.jmenuDetalleDatosTipoTelefo.add(this.jMenuItemDetalleAbrirOrderByTipoTelefo);				
		this.jmenuDetalleDatosTipoTelefo.add(this.jMenuItemDetalleMostarOcultarTipoTelefo);				
				
		//this.jmenuDetalleAccionesTipoTelefo.add(this.jMenuItemGuardarCambiosTipoTelefo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoTelefo.add(this.jmenuDetalleArchivoTipoTelefo);		
		this.jmenuBarDetalleTipoTelefo.add(this.jmenuDetalleAccionesTipoTelefo);		
		this.jmenuBarDetalleTipoTelefo.add(this.jmenuDetalleDatosTipoTelefo);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoTelefo.add(this.jmenuDetalleTipoTelefo);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoTelefo);				
	}
	
	
	public void inicializarElementosCamposTipoTelefo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoTelefo = new JLabelMe();
		jLabelIdTipoTelefo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoTelefo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoTelefo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoTelefo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoTelefo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoTelefo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoTelefo.setToolTipText(TipoTelefoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoTelefo= new GridBagLayout();

		this.jPanelidTipoTelefo.setLayout(this.gridaBagLayoutTipoTelefo);

		jLabelidTipoTelefo = new JLabel();
		jLabelidTipoTelefo.setText("Id");

		jLabelidTipoTelefo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoTelefo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoTelefo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoTelefo = new JLabelMe();
		this.jLabelcodigoTipoTelefo.setText(""+TipoTelefoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoTelefo.setToolTipText("Codigo");
		this.jLabelcodigoTipoTelefo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoTelefo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoTelefo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoTelefo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoTelefo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoTelefo.setToolTipText(TipoTelefoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoTelefo = new GridBagLayout();
		this.jPanelcodigoTipoTelefo.setLayout(this.gridaBagLayoutTipoTelefo);


		jTextFieldcodigoTipoTelefo= new JTextFieldMe();

		jTextFieldcodigoTipoTelefo.setEnabled(false);
		jTextFieldcodigoTipoTelefo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoTelefo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoTelefo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoTelefo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoTelefoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoTelefoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoTelefoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoTelefoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoTelefoBusqueda.setText("U");
		this.jButtoncodigoTipoTelefoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoTelefoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoTelefoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoTelefo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoTelefo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoTelefoBusqueda"));

		if(this.tipotelefoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoTelefoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoTelefo = new JLabelMe();
		this.jLabelnombreTipoTelefo.setText(""+TipoTelefoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoTelefo.setToolTipText("Nombre");
		this.jLabelnombreTipoTelefo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoTelefo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoTelefo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoTelefo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoTelefo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoTelefo.setToolTipText(TipoTelefoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoTelefo = new GridBagLayout();
		this.jPanelnombreTipoTelefo.setLayout(this.gridaBagLayoutTipoTelefo);


		jTextAreanombreTipoTelefo= new JTextAreaMe();
		jTextAreanombreTipoTelefo.setEnabled(false);
		jTextAreanombreTipoTelefo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoTelefo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoTelefo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoTelefo.setLineWrap(true);
		jTextAreanombreTipoTelefo.setWrapStyleWord(true);
		jTextAreanombreTipoTelefo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoTelefo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoTelefo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoTelefo = new JScrollPane(jTextAreanombreTipoTelefo);
		jscrollPanenombreTipoTelefo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoTelefo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoTelefo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));

		this.jButtonnombreTipoTelefoBusqueda= new JButtonMe();
		this.jButtonnombreTipoTelefoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoTelefoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoTelefoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoTelefoBusqueda.setText("U");
		this.jButtonnombreTipoTelefoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoTelefoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoTelefoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoTelefo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoTelefo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoTelefoBusqueda"));

		if(this.tipotelefoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoTelefoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoTelefo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoTelefo = new JLabelMe();
		this.jLabelid_empresaTipoTelefo.setText(""+TipoTelefoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoTelefo.setToolTipText("Empresa");
		this.jLabelid_empresaTipoTelefo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoTelefo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoTelefo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoTelefo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoTelefo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoTelefo.setToolTipText(TipoTelefoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoTelefo = new GridBagLayout();
		this.jPanelid_empresaTipoTelefo.setLayout(this.gridaBagLayoutTipoTelefo);


		jComboBoxid_empresaTipoTelefo= new JComboBoxMe();
		jComboBoxid_empresaTipoTelefo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoTelefo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoTelefo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoTelefo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoTelefo.setEnabled(false);

		this.jButtonid_empresaTipoTelefo= new JButtonMe();
		this.jButtonid_empresaTipoTelefo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoTelefo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoTelefo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoTelefo.setText("Buscar");
		this.jButtonid_empresaTipoTelefo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoTelefo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoTelefo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoTelefo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoTelefo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoTelefo"));

		this.jButtonid_empresaTipoTelefoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoTelefoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoTelefoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoTelefoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoTelefoBusqueda.setText("U");
		this.jButtonid_empresaTipoTelefoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoTelefoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoTelefoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoTelefo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoTelefo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoTelefoBusqueda"));

		if(this.tipotelefoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoTelefoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoTelefoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoTelefoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoTelefoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoTelefoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoTelefoUpdate.setText("U");
		this.jButtonid_empresaTipoTelefoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoTelefoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoTelefoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoTelefo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoTelefo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoTelefoUpdate"));



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
		//this.jInternalFrameDetalleTipoTelefo = new TipoTelefoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Telefo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoTelefo= new GridBagLayout();
		

		
		String sToolTipTipoTelefo="";
		sToolTipTipoTelefo=TipoTelefoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoTelefo+="(Cartera.TipoTelefo)";
		}
		
		if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoTelefo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoTelefo = new JButtonMe();
		this.jButtonModificarTipoTelefo = new JButtonMe();
        this.jButtonActualizarTipoTelefo = new JButtonMe();
        this.jButtonEliminarTipoTelefo = new JButtonMe();
        this.jButtonCancelarTipoTelefo = new JButtonMe();
        this.jButtonGuardarCambiosTipoTelefo = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoTelefo = new JButtonMe();
		this.jButtonCerrarTipoTelefo = new JButtonMe();
		
		this.jScrollPanelDatosTipoTelefo = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoTelefo = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoTelefo = new JScrollPane();
				
		
		
		this.jPanelCamposTipoTelefo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoTelefo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoTelefo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoTelefo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Telefo";
		
		if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoTelefo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Telefos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoTelefo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoTelefo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoTelefo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoTelefo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoTelefo.setName("jPanelCamposTipoTelefo"); 

		this.jPanelCamposOcultosTipoTelefo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoTelefo.setName("jPanelCamposOcultosTipoTelefo"); 

        this.jPanelAccionesTipoTelefo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoTelefo.setToolTipText("Acciones");
        this.jPanelAccionesTipoTelefo.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoTelefo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoTelefo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoTelefo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoTelefo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoTelefo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoTelefo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoTelefo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoTelefo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoTelefo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoTelefo.setText("Nuevo");
		this.jButtonModificarTipoTelefo.setText("Editar");
        this.jButtonActualizarTipoTelefo.setText("Actualizar");
        this.jButtonEliminarTipoTelefo.setText("Eliminar");
        this.jButtonCancelarTipoTelefo.setText("Cancelar");
        this.jButtonGuardarCambiosTipoTelefo.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoTelefo.setText("Guardar");
		this.jButtonCerrarTipoTelefo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoTelefo,"nuevo_button","Nuevo",this.tipotelefoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoTelefo,"modificar_button","Editar",this.tipotelefoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoTelefo,"actualizar_button","Actualizar",this.tipotelefoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoTelefo,"eliminar_button","Eliminar",this.tipotelefoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoTelefo,"cancelar_button","Cancelar",this.tipotelefoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoTelefo,"guardarcambios_button","Guardar",this.tipotelefoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoTelefo,"guardarcambiostabla_button","Guardar",this.tipotelefoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoTelefo,"cerrar_button","Salir",this.tipotelefoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoTelefo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoTelefo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoTelefo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoTelefo.setToolTipText("Nuevo"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoTelefo.setToolTipText("Editar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoTelefo.setToolTipText("Actualizar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoTelefo.setToolTipText("Eliminar)"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoTelefo.setToolTipText("Cancelar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoTelefo.setToolTipText("Guardar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoTelefo.setToolTipText("Guardar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoTelefo.setToolTipText("Salir"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoTelefo";
		inputMap = this.jButtonNuevoTipoTelefo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoTelefo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoTelefo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoTelefo";
		inputMap = this.jButtonActualizarTipoTelefo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoTelefo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoTelefo"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoTelefo";
		inputMap = this.jButtonEliminarTipoTelefo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoTelefo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoTelefo"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoTelefo";
		inputMap = this.jButtonCancelarTipoTelefo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoTelefo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoTelefo"));
		
		//CERRAR		
		sMapKey = "CerrarTipoTelefo";
		inputMap = this.jButtonCerrarTipoTelefo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoTelefo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoTelefo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoTelefo";
		inputMap = this.jButtonGuardarCambiosTablaTipoTelefo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoTelefo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoTelefo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoTelefo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoTelefo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoTelefo.setToolTipText("Nuevo TipoTelefo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoTelefo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoTelefo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoTelefo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoTelefo.setToolTipText("Sin Cerrar Ventana TipoTelefo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoTelefo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoTelefo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoTelefo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoTelefo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoTelefo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoTelefo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoTelefo.setText("Accion");
		this.jComboBoxTiposAccionesTipoTelefo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoTelefo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoTelefo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoTelefo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoTelefo = new JLabelMe();
		
		this.jLabelAccionesTipoTelefo.setText("Acciones");		
		this.jLabelAccionesTipoTelefo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTelefo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTelefo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoTelefo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoTelefo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoTelefo=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoTelefo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoTelefo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoTelefo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTelefo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTelefo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoTelefo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoTelefo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoTelefo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoTelefo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoTelefo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoTelefo = new GridBagLayout();
		
		this.jPanelCamposTipoTelefo.setLayout(gridaBagLayoutCamposTipoTelefo);
		this.jPanelCamposOcultosTipoTelefo.setLayout(gridaBagLayoutCamposOcultosTipoTelefo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
	this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTelefo.gridy = 0;
	this.gridBagConstraintsTipoTelefo.gridx = 0;
	this.gridBagConstraintsTipoTelefo.ipadx = 0;
	this.gridBagConstraintsTipoTelefo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoTelefo.add(jLabelIdTipoTelefo, this.gridBagConstraintsTipoTelefo);



	this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
	this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTelefo.gridy = 0;
	this.gridBagConstraintsTipoTelefo.gridx = 1;
	this.gridBagConstraintsTipoTelefo.ipadx = 0;
	this.gridBagConstraintsTipoTelefo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoTelefo.add(jLabelidTipoTelefo, this.gridBagConstraintsTipoTelefo);


	this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
	this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTelefo.gridy = 0;
	this.gridBagConstraintsTipoTelefo.gridx = 0;
	this.gridBagConstraintsTipoTelefo.ipadx = 0;
	this.gridBagConstraintsTipoTelefo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoTelefo.add(jLabelid_empresaTipoTelefo, this.gridBagConstraintsTipoTelefo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		//this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTelefo.gridy = 0;
		this.gridBagConstraintsTipoTelefo.gridx = 2;
		this.gridBagConstraintsTipoTelefo.ipadx = 0;
		this.gridBagConstraintsTipoTelefo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoTelefo.add(jButtonid_empresaTipoTelefoBusqueda, this.gridBagConstraintsTipoTelefo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		//this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTelefo.gridy = 0;
		this.gridBagConstraintsTipoTelefo.gridx = 3;
		this.gridBagConstraintsTipoTelefo.ipadx = 0;
		this.gridBagConstraintsTipoTelefo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoTelefo.add(jButtonid_empresaTipoTelefoUpdate, this.gridBagConstraintsTipoTelefo);
	}

	this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
	this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTelefo.gridy = 0;
	this.gridBagConstraintsTipoTelefo.gridx = 1;
	this.gridBagConstraintsTipoTelefo.ipadx = 0;
	this.gridBagConstraintsTipoTelefo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoTelefo.add(jComboBoxid_empresaTipoTelefo, this.gridBagConstraintsTipoTelefo);


	this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
	this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTelefo.gridy = 0;
	this.gridBagConstraintsTipoTelefo.gridx = 0;
	this.gridBagConstraintsTipoTelefo.ipadx = 0;
	this.gridBagConstraintsTipoTelefo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoTelefo.add(jLabelcodigoTipoTelefo, this.gridBagConstraintsTipoTelefo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		//this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTelefo.gridy = 0;
		this.gridBagConstraintsTipoTelefo.gridx = 2;
		this.gridBagConstraintsTipoTelefo.ipadx = 0;
		this.gridBagConstraintsTipoTelefo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoTelefo.add(jButtoncodigoTipoTelefoBusqueda, this.gridBagConstraintsTipoTelefo);
	}

	this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
	this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTelefo.gridy = 0;
	this.gridBagConstraintsTipoTelefo.gridx = 1;
	this.gridBagConstraintsTipoTelefo.ipadx = 0;
	this.gridBagConstraintsTipoTelefo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoTelefo.add(jTextFieldcodigoTipoTelefo, this.gridBagConstraintsTipoTelefo);


	this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
	this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTelefo.gridy = 0;
	this.gridBagConstraintsTipoTelefo.gridx = 0;
	this.gridBagConstraintsTipoTelefo.ipadx = 0;
	this.gridBagConstraintsTipoTelefo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoTelefo.add(jLabelnombreTipoTelefo, this.gridBagConstraintsTipoTelefo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		//this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTelefo.gridy = 0;
		this.gridBagConstraintsTipoTelefo.gridx = 2;
		this.gridBagConstraintsTipoTelefo.ipadx = 0;
		this.gridBagConstraintsTipoTelefo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoTelefo.add(jButtonnombreTipoTelefoBusqueda, this.gridBagConstraintsTipoTelefo);
	}

	this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
	this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTelefo.gridy = 0;
	this.gridBagConstraintsTipoTelefo.gridx = 1;
	this.gridBagConstraintsTipoTelefo.ipadx = 0;
	this.gridBagConstraintsTipoTelefo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoTelefo.add(jscrollPanenombreTipoTelefo, this.gridBagConstraintsTipoTelefo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
	this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTelefo.gridy = iYPanelCamposTipoTelefo;
	this.gridBagConstraintsTipoTelefo.gridx = iXPanelCamposTipoTelefo++;
	this.gridBagConstraintsTipoTelefo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTelefo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTelefo.add(this.jPanelidTipoTelefo, this.gridBagConstraintsTipoTelefo);



	if(iXPanelCamposTipoTelefo % 1==0) {
		iXPanelCamposTipoTelefo=0;
		iYPanelCamposTipoTelefo++;
	}
	this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
	this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTelefo.gridy = iYPanelCamposTipoTelefo;
	this.gridBagConstraintsTipoTelefo.gridx = iXPanelCamposTipoTelefo++;
	this.gridBagConstraintsTipoTelefo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTelefo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTelefo.add(this.jPanelcodigoTipoTelefo, this.gridBagConstraintsTipoTelefo);



	if(iXPanelCamposTipoTelefo % 1==0) {
		iXPanelCamposTipoTelefo=0;
		iYPanelCamposTipoTelefo++;
	}
	this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
	this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTelefo.gridy = iYPanelCamposTipoTelefo;
	this.gridBagConstraintsTipoTelefo.gridx = iXPanelCamposTipoTelefo++;
	this.gridBagConstraintsTipoTelefo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTelefo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTelefo.add(this.jPanelnombreTipoTelefo, this.gridBagConstraintsTipoTelefo);



	if(iXPanelCamposTipoTelefo % 1==0) {
		iXPanelCamposTipoTelefo=0;
		iYPanelCamposTipoTelefo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
	this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTelefo.gridy = iYPanelCamposOcultosTipoTelefo;
	this.gridBagConstraintsTipoTelefo.gridx = iXPanelCamposOcultosTipoTelefo++;
	this.gridBagConstraintsTipoTelefo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTelefo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoTelefo.add(this.jPanelid_empresaTipoTelefo, this.gridBagConstraintsTipoTelefo);



	if(iXPanelCamposOcultosTipoTelefo % 1==0) {
		iXPanelCamposOcultosTipoTelefo=0;
		iYPanelCamposOcultosTipoTelefo++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoTelefo= new GridBagLayout();
		this.jPanelAccionesTipoTelefo.setLayout(gridaBagLayoutAccionesTipoTelefo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoTelefo= new GridBagLayout();
		this.jPanelAccionesFormularioTipoTelefo.setLayout(gridaBagLayoutAccionesFormularioTipoTelefo);
		
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoTelefo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoTelefo.add(this.jComboBoxTiposAccionesFormularioTipoTelefo, this.gridBagConstraintsTipoTelefo);

		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoTelefo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoTelefo.add(this.jCheckBoxPostAccionNuevoTipoTelefo, this.gridBagConstraintsTipoTelefo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipotelefoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoTelefo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoTelefo.add(this.jCheckBoxPostAccionSinCerrarTipoTelefo, this.gridBagConstraintsTipoTelefo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipotelefoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoTelefo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoTelefo.add(this.jCheckBoxPostAccionSinMensajeTipoTelefo, this.gridBagConstraintsTipoTelefo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTelefo.gridy = 0;
		this.gridBagConstraintsTipoTelefo.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoTelefo.add(this.jButtonModificarTipoTelefo, this.gridBagConstraintsTipoTelefo);							

		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTelefo.gridy = 0;
		this.gridBagConstraintsTipoTelefo.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoTelefo.add(this.jButtonEliminarTipoTelefo, this.gridBagConstraintsTipoTelefo);
		
			
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.gridy = 0;		
		this.gridBagConstraintsTipoTelefo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoTelefo.add(this.jButtonActualizarTipoTelefo, this.gridBagConstraintsTipoTelefo);


		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.gridy = 0;		
		this.gridBagConstraintsTipoTelefo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoTelefo.add(this.jButtonGuardarCambiosTipoTelefo, this.gridBagConstraintsTipoTelefo);	
		
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.gridy = 0;		
		this.gridBagConstraintsTipoTelefo.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoTelefo.add(this.jButtonCancelarTipoTelefo, this.gridBagConstraintsTipoTelefo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoTelefo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoTelefo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipotelefoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();						
			this.gridBagConstraintsTipoTelefo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoTelefo.gridx = 0;		
			//this.gridBagConstraintsTipoTelefo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoTelefo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoTelefo.gridx =0;
		this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoTelefo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoTelefo, this.gridBagConstraintsTipoTelefo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoTelefoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoTelefo = new TipoTelefoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Telefo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Telefo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Telefo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoTelefoModel tipotelefoModel=new TipoTelefoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoTelefoModel.TipoTelefoFocusTraversalPolicy tipotelefoFocusTraversalPolicy = tipotelefoModel.new TipoTelefoFocusTraversalPolicy(this);
			
			//tipotelefoFocusTraversalPolicy.settipotelefoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipotelefoModel);
			
			
			this.jContentPaneDetalleTipoTelefo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoTelefo = new GridBagLayout();	
			this.jContentPaneDetalleTipoTelefo.setLayout(gridaBagLayoutDetalleTipoTelefo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoTelefo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
				this.gridBagConstraintsTipoTelefo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoTelefo.gridx = 0;
					
				
				this.jContentPaneDetalleTipoTelefo.add(jTtoolBarDetalleTipoTelefo, gridBagConstraintsTipoTelefo);								
				
}
			
			this.jScrollPanelDatosEdicionTipoTelefo=   new JScrollPane(jContentPaneDetalleTipoTelefo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoTelefo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTelefo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTelefo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoTelefo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoTelefo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTelefo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTelefo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoTelefo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoTelefo.gridx = 0;
	        
			this.jContentPaneDetalleTipoTelefo.add(jPanelCamposTipoTelefo, gridBagConstraintsTipoTelefo);
			
			
			
			
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
						&& tipotelefoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameTelefono(this.puedeCargarPorParteTelefono,false,-1);
					
					if(this.tipotelefoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoTelefo= new GridBagConstraints();
						this.gridBagConstraintsTipoTelefo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoTelefo.gridx = 0;
						this.jContentPaneDetalleTipoTelefo.add(this.jTabbedPaneRelacionesTipoTelefo, this.gridBagConstraintsTipoTelefo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoTelefo.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameTelefono(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoTelefo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
					this.gridBagConstraintsTipoTelefo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoTelefo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoTelefo.gridx = 0;
					
				
					this.jContentPaneDetalleTipoTelefo.add(jPanelCamposOcultosTipoTelefo, gridBagConstraintsTipoTelefo);
				
					this.jPanelCamposOcultosTipoTelefo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoTelefo.gridx = 0;
	        this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoTelefo.add(this.jPanelAccionesFormularioTipoTelefo, this.gridBagConstraintsTipoTelefo);							
			
			
			
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
	        this.gridBagConstraintsTipoTelefo.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoTelefo.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoTelefo.add(this.jPanelAccionesTipoTelefo, this.gridBagConstraintsTipoTelefo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoTelefo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoTelefo=   new JScrollPane(this.jPanelCamposTipoTelefo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoTelefo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTelefo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTelefo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoTelefo.gridx = 0;
			this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoTelefo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoTelefo, this.gridBagConstraintsTipoTelefo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoTelefo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoTelefo, this.gridBagConstraintsTipoTelefo);			
			
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoTelefo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoTelefo, this.gridBagConstraintsTipoTelefo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTelefo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoTelefo, this.gridBagConstraintsTipoTelefo);
			
			
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTelefo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoTelefo, this.gridBagConstraintsTipoTelefo);
		
			
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoTelefo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoTelefo, this.gridBagConstraintsTipoTelefo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoTelefo;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoTelefo;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameTelefono(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.telefonoSessionBean=new TelefonoSessionBean();
		this.telefonoSessionBean.setConGuardarRelaciones(false);
		this.telefonoSessionBean.setEsGuardarRelacionado(true);

		this.telefonoBeanSwingJInternalFrame=null;//new TelefonoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.telefonoBeanSwingJInternalFramePopup=new TelefonoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.telefonoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.telefonoSessionBean.getEsGuardarRelacionado()) {

				TelefonoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoTelefoJInternalFrame.STIPO_TAMANIO_GENERAL;
				TelefonoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoTelefoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.telefonoSessionBean.setEsGuardarRelacionado(true);

				this.telefonoBeanSwingJInternalFrame=new TelefonoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.telefonoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.telefonoBeanSwingJInternalFrame.settelefonoSessionBean(this.telefonoSessionBean);

				//this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
				//this.gridBagConstraintsTipoTelefo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoTelefo.gridx = 0;
				//this.jContentPaneDetalleTipoTelefo.add(this.telefonoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoTelefo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoTelefo.add("Telefonos",this.telefonoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoTelefo.setComponentAt(iIndexTab,this.telefonoBeanSwingJInternalFrame.getContentPane());
				}

				//TelefonoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.telefonoSessionBean.setEsGuardarRelacionado(false);
				this.telefonoBeanSwingJInternalFrame=null;//new TelefonoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.telefonoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTelefono) {
					this.jTabbedPaneRelacionesTipoTelefo.add("Telefonos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarTelefonoBeanSwingJInternalFrame(List<TipoTelefo> tipotelefos,TipoTelefo tipotelefo,TelefonoBeanSwingJInternalFrame telefonoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//telefonoBeanSwingJInternalFrame=new TelefonoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					telefonoBeanSwingJInternalFrame.getTelefonoLogic().setConnexion(this.tipotelefoLogic.getConnexion());

					telefonoBeanSwingJInternalFrame.settipotelefosForeignKey(tipotelefos);
					telefonoBeanSwingJInternalFrame.settipotelefoForeignKey(tipotelefo);
					telefonoBeanSwingJInternalFrame.telefonoSessionBean.setisBusquedaDesdeForeignKeySesionTipoTelefo(true);
					telefonoBeanSwingJInternalFrame.telefonoSessionBean.setlidTipoTelefoActual(tipotelefo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					telefonoBeanSwingJInternalFrame.cargarCombosForeignKeyTelefono(telefonoBeanSwingJInternalFrame.isCargarCombosDependencia);
					telefonoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoTelefo(true);
					telefonoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					telefonoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoTelefo");
					telefonoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoTelefo");
					telefonoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTelefono(true);
					telefonoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTelefono("n",telefonoBeanSwingJInternalFrame.isGuardarCambiosEnLote, telefonoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					telefonoBeanSwingJInternalFrame.setAutoscrolls(true);
					telefonoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						telefonoBeanSwingJInternalFrame.actualizarEstadoPanelsTelefono("relacionado");
					} else {
						telefonoBeanSwingJInternalFrame.actualizarEstadoPanelsTelefono("no_relacionado");
					}

					telefonoBeanSwingJInternalFrame.getjButtonRecargarInformacionTelefono().setVisible(false);

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
