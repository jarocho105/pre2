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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.comisiones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.comisiones.util.TipoComisionConfigConstantesFunciones;

import com.bydan.erp.comisiones.business.logic.*;
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
public class TipoComisionConfigDetalleFormJInternalFrame extends TipoComisionConfigBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoComisionConfig;
	
	protected JMenuBar jmenuBarDetalleTipoComisionConfig;
	
	protected JMenu jmenuDetalleTipoComisionConfig;
	protected JMenu jmenuDetalleArchivoTipoComisionConfig;
	protected JMenu jmenuDetalleAccionesTipoComisionConfig;
	protected JMenu jmenuDetalleDatosTipoComisionConfig;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoComisionConfig;	
	protected GridBagConstraints gridBagConstraintsTipoComisionConfig;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoComisionConfigBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoComisionConfig;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoComisionConfigSessionBean tipocomisionconfigSessionBean;
	
	

	public ComisionConfigBeanSwingJInternalFrame comisionconfigBeanSwingJInternalFrame=null;
	public ComisionConfigBeanSwingJInternalFrame comisionconfigBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteComisionConfig=false;
	public ComisionConfigSessionBean comisionconfigSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoComisionConfigLogic tipocomisionconfigLogic;
	
	public JScrollPane jScrollPanelDatosTipoComisionConfig;
	public JScrollPane jScrollPanelDatosEdicionTipoComisionConfig;
	public JScrollPane jScrollPanelDatosGeneralTipoComisionConfig;
	
	protected JPanel jPanelCamposTipoComisionConfig;    
	protected JPanel jPanelCamposOcultosTipoComisionConfig;    	
	protected JPanel jPanelAccionesTipoComisionConfig;
	protected JPanel jPanelAccionesFormularioTipoComisionConfig;
    
	
	
	protected Integer iXPanelCamposTipoComisionConfig=0;
	protected Integer iYPanelCamposTipoComisionConfig=0;
	
	protected Integer iXPanelCamposOcultosTipoComisionConfig=0;
	protected Integer iYPanelCamposOcultosTipoComisionConfig=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoComisionConfig;
	public JButton jButtonModificarTipoComisionConfig;
	public JButton jButtonActualizarTipoComisionConfig;
    public JButton jButtonEliminarTipoComisionConfig;
	public JButton jButtonCancelarTipoComisionConfig;
    public JButton jButtonGuardarCambiosTipoComisionConfig;
	public JButton jButtonGuardarCambiosTablaTipoComisionConfig;
	protected JButton jButtonCerrarTipoComisionConfig;
	
	
	protected JButton jButtonProcesarInformacionTipoComisionConfig;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoComisionConfig;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoComisionConfig;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoComisionConfig;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoComisionConfig;
	protected JButton jButtonModificarToolBarTipoComisionConfig;
	protected JButton jButtonActualizarToolBarTipoComisionConfig;
    protected JButton jButtonEliminarToolBarTipoComisionConfig;
	protected JButton jButtonCancelarToolBarTipoComisionConfig;
    protected JButton jButtonGuardarCambiosToolBarTipoComisionConfig;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoComisionConfig;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoComisionConfig;
	protected JButton jButtonCerrarToolBarTipoComisionConfig;
	
	protected JButton jButtonProcesarInformacionToolBarTipoComisionConfig;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoComisionConfig;
	protected JMenuItem jMenuItemModificarTipoComisionConfig;
	protected JMenuItem jMenuItemActualizarTipoComisionConfig;
    protected JMenuItem jMenuItemEliminarTipoComisionConfig;
	protected JMenuItem jMenuItemCancelarTipoComisionConfig;
    protected JMenuItem jMenuItemGuardarCambiosTipoComisionConfig;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoComisionConfig;
	protected JMenuItem jMenuItemCerrarTipoComisionConfig;
	protected JMenuItem jMenuItemDetalleCerrarTipoComisionConfig;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoComisionConfig;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoComisionConfig;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoComisionConfig;
	protected JMenuItem jMenuItemMostrarOcultarTipoComisionConfig;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoComisionConfig;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoComisionConfig;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoComisionConfig;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoComisionConfig;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoComisionConfig;
	public JLabel jLabelIdTipoComisionConfig;
	public JLabel jLabelidTipoComisionConfig;
	public JButton jButtonidTipoComisionConfigBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoComisionConfig;
	public JLabel jLabelcodigoTipoComisionConfig;
	public JTextField jTextFieldcodigoTipoComisionConfig;
	public JButton jButtoncodigoTipoComisionConfigBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoComisionConfig;
	public JLabel jLabelnombreTipoComisionConfig;
	public JTextArea jTextAreanombreTipoComisionConfig;
	public JScrollPane jscrollPanenombreTipoComisionConfig;
	public JButton jButtonnombreTipoComisionConfigBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoComisionConfig;
	public JLabel jLabelid_empresaTipoComisionConfig;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoComisionConfig;
	public JButton jButtonid_empresaTipoComisionConfig= new JButtonMe();
	public JButton jButtonid_empresaTipoComisionConfigUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoComisionConfigBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoComisionConfig;
	
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
	
	public TipoComisionConfigDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoComisionConfig=new JPanel();
				this.jPanelAccionesFormularioTipoComisionConfig=new JPanel();
				this.jmenuBarDetalleTipoComisionConfig=new JMenuBar();
				this.jTtoolBarDetalleTipoComisionConfig=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoComisionConfigDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoComisionConfig No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoComisionConfigDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoComisionConfig No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoComisionConfigDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoComisionConfig No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoComisionConfigDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoComisionConfig No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoComisionConfigDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoComisionConfig No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoComisionConfig() {
		return this.jButtonActualizarToolBarTipoComisionConfig;
	}
	
	public JButton getjButtonEliminarToolBarTipoComisionConfig() {
		return this.jButtonEliminarToolBarTipoComisionConfig;
	}
	
	public JButton getjButtonCancelarToolBarTipoComisionConfig() {
		return this.jButtonCancelarToolBarTipoComisionConfig;
	}		
	
	public JButton getjButtonProcesarInformacionTipoComisionConfig() {
		return this.jButtonProcesarInformacionTipoComisionConfig;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoComisionConfig)	{
		this.jButtonProcesarInformacionTipoComisionConfig = jButtonProcesarInformacionTipoComisionConfig;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoComisionConfig() {
		return this.jComboBoxTiposAccionesTipoComisionConfig;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoComisionConfig(
			JComboBox jComboBoxTiposRelacionesTipoComisionConfig) {
		this.jComboBoxTiposRelacionesTipoComisionConfig = jComboBoxTiposRelacionesTipoComisionConfig;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoComisionConfig(
			JComboBox jComboBoxTiposAccionesTipoComisionConfig) {
		this.jComboBoxTiposAccionesTipoComisionConfig = jComboBoxTiposAccionesTipoComisionConfig;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoComisionConfig() {
		return this.jComboBoxTiposAccionesFormularioTipoComisionConfig;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoComisionConfig(
			JComboBox jComboBoxTiposAccionesFormularioTipoComisionConfig) {
		this.jComboBoxTiposAccionesFormularioTipoComisionConfig = jComboBoxTiposAccionesFormularioTipoComisionConfig;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocomisionconfigSessionBean=new TipoComisionConfigSessionBean();
		
		this.tipocomisionconfigSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocomisionconfigSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocomisionconfigSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.comisionconfigSessionBean=new ComisionConfigSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoComisionConfigJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Comision Config MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoComisionConfigJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoComisionConfig= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoComisionConfig=new JButtonMe();
				this.jButtonModificarToolBarTipoComisionConfig=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoComisionConfig,this.jTtoolBarDetalleTipoComisionConfig,
							"actualizar","actualizar","Actualizar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoComisionConfig,this.jTtoolBarDetalleTipoComisionConfig,
							"eliminar","eliminar","Eliminar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoComisionConfig,this.jTtoolBarDetalleTipoComisionConfig,
							"cancelar","cancelar","Cancelar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoComisionConfig,this.jTtoolBarDetalleTipoComisionConfig,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoComisionConfig=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoComisionConfig=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoComisionConfig=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoComisionConfig=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoComisionConfig=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoComisionConfig= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoComisionConfig.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoComisionConfig,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoComisionConfig= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoComisionConfig.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoComisionConfig,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoComisionConfig= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoComisionConfig.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoComisionConfig,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoComisionConfig= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoComisionConfig.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoComisionConfig,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoComisionConfig= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoComisionConfig.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoComisionConfig,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoComisionConfig= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoComisionConfig.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoComisionConfig,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoComisionConfig= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoComisionConfig.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoComisionConfig,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoComisionConfig= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoComisionConfig.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoComisionConfig,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoComisionConfig= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoComisionConfig.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoComisionConfig,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoComisionConfig= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoComisionConfig.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoComisionConfig,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoComisionConfig.add(this.jMenuItemDetalleCerrarTipoComisionConfig);
		
		this.jmenuDetalleAccionesTipoComisionConfig.add(this.jMenuItemActualizarTipoComisionConfig);
		this.jmenuDetalleAccionesTipoComisionConfig.add(this.jMenuItemEliminarTipoComisionConfig);
		this.jmenuDetalleAccionesTipoComisionConfig.add(this.jMenuItemCancelarTipoComisionConfig);		
		
		//this.jmenuDetalleDatosTipoComisionConfig.add(this.jMenuItemDetalleAbrirOrderByTipoComisionConfig);				
		this.jmenuDetalleDatosTipoComisionConfig.add(this.jMenuItemDetalleMostarOcultarTipoComisionConfig);				
				
		//this.jmenuDetalleAccionesTipoComisionConfig.add(this.jMenuItemGuardarCambiosTipoComisionConfig);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoComisionConfig.add(this.jmenuDetalleArchivoTipoComisionConfig);		
		this.jmenuBarDetalleTipoComisionConfig.add(this.jmenuDetalleAccionesTipoComisionConfig);		
		this.jmenuBarDetalleTipoComisionConfig.add(this.jmenuDetalleDatosTipoComisionConfig);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoComisionConfig.add(this.jmenuDetalleTipoComisionConfig);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoComisionConfig);				
	}
	
	
	public void inicializarElementosCamposTipoComisionConfig() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoComisionConfig = new JLabelMe();
		jLabelIdTipoComisionConfig.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoComisionConfig = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoComisionConfig.setToolTipText(TipoComisionConfigConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoComisionConfig= new GridBagLayout();

		this.jPanelidTipoComisionConfig.setLayout(this.gridaBagLayoutTipoComisionConfig);

		jLabelidTipoComisionConfig = new JLabel();
		jLabelidTipoComisionConfig.setText("Id");

		jLabelidTipoComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoComisionConfig = new JLabelMe();
		this.jLabelcodigoTipoComisionConfig.setText(""+TipoComisionConfigConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoComisionConfig.setToolTipText("Codigo");
		this.jLabelcodigoTipoComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoComisionConfig=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoComisionConfig.setToolTipText(TipoComisionConfigConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoComisionConfig = new GridBagLayout();
		this.jPanelcodigoTipoComisionConfig.setLayout(this.gridaBagLayoutTipoComisionConfig);


		jTextFieldcodigoTipoComisionConfig= new JTextFieldMe();

		jTextFieldcodigoTipoComisionConfig.setEnabled(false);
		jTextFieldcodigoTipoComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoComisionConfigBusqueda= new JButtonMe();
		this.jButtoncodigoTipoComisionConfigBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoComisionConfigBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoComisionConfigBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoComisionConfigBusqueda.setText("U");
		this.jButtoncodigoTipoComisionConfigBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoComisionConfigBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoComisionConfigBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoComisionConfigBusqueda"));

		if(this.tipocomisionconfigSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoComisionConfigBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoComisionConfig = new JLabelMe();
		this.jLabelnombreTipoComisionConfig.setText(""+TipoComisionConfigConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoComisionConfig.setToolTipText("Nombre");
		this.jLabelnombreTipoComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoComisionConfig=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoComisionConfig.setToolTipText(TipoComisionConfigConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoComisionConfig = new GridBagLayout();
		this.jPanelnombreTipoComisionConfig.setLayout(this.gridaBagLayoutTipoComisionConfig);


		jTextAreanombreTipoComisionConfig= new JTextAreaMe();
		jTextAreanombreTipoComisionConfig.setEnabled(false);
		jTextAreanombreTipoComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoComisionConfig.setLineWrap(true);
		jTextAreanombreTipoComisionConfig.setWrapStyleWord(true);
		jTextAreanombreTipoComisionConfig.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoComisionConfig.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoComisionConfig = new JScrollPane(jTextAreanombreTipoComisionConfig);
		jscrollPanenombreTipoComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoComisionConfigBusqueda= new JButtonMe();
		this.jButtonnombreTipoComisionConfigBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoComisionConfigBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoComisionConfigBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoComisionConfigBusqueda.setText("U");
		this.jButtonnombreTipoComisionConfigBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoComisionConfigBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoComisionConfigBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoComisionConfigBusqueda"));

		if(this.tipocomisionconfigSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoComisionConfigBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoComisionConfig() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoComisionConfig = new JLabelMe();
		this.jLabelid_empresaTipoComisionConfig.setText(""+TipoComisionConfigConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoComisionConfig.setToolTipText("Empresa");
		this.jLabelid_empresaTipoComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoComisionConfig=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoComisionConfig.setToolTipText(TipoComisionConfigConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoComisionConfig = new GridBagLayout();
		this.jPanelid_empresaTipoComisionConfig.setLayout(this.gridaBagLayoutTipoComisionConfig);


		jComboBoxid_empresaTipoComisionConfig= new JComboBoxMe();
		jComboBoxid_empresaTipoComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoComisionConfig.setEnabled(false);

		this.jButtonid_empresaTipoComisionConfig= new JButtonMe();
		this.jButtonid_empresaTipoComisionConfig.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoComisionConfig.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoComisionConfig.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoComisionConfig.setText("Buscar");
		this.jButtonid_empresaTipoComisionConfig.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoComisionConfig.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoComisionConfig,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoComisionConfig"));

		this.jButtonid_empresaTipoComisionConfigBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoComisionConfigBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoComisionConfigBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoComisionConfigBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoComisionConfigBusqueda.setText("U");
		this.jButtonid_empresaTipoComisionConfigBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoComisionConfigBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoComisionConfigBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoComisionConfigBusqueda"));

		if(this.tipocomisionconfigSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoComisionConfigBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoComisionConfigUpdate= new JButtonMe();
		this.jButtonid_empresaTipoComisionConfigUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoComisionConfigUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoComisionConfigUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoComisionConfigUpdate.setText("U");
		this.jButtonid_empresaTipoComisionConfigUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoComisionConfigUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoComisionConfigUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoComisionConfigUpdate"));



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
		//this.jInternalFrameDetalleTipoComisionConfig = new TipoComisionConfigBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Comision Config DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoComisionConfig= new GridBagLayout();
		

		
		String sToolTipTipoComisionConfig="";
		sToolTipTipoComisionConfig=TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoComisionConfig+="(Comisiones.TipoComisionConfig)";
		}
		
		if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoComisionConfig+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoComisionConfig = new JButtonMe();
		this.jButtonModificarTipoComisionConfig = new JButtonMe();
        this.jButtonActualizarTipoComisionConfig = new JButtonMe();
        this.jButtonEliminarTipoComisionConfig = new JButtonMe();
        this.jButtonCancelarTipoComisionConfig = new JButtonMe();
        this.jButtonGuardarCambiosTipoComisionConfig = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoComisionConfig = new JButtonMe();
		this.jButtonCerrarTipoComisionConfig = new JButtonMe();
		
		this.jScrollPanelDatosTipoComisionConfig = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoComisionConfig = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoComisionConfig = new JScrollPane();
				
		
		
		this.jPanelCamposTipoComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Comision Config";
		
		if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Comision Configes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoComisionConfig.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoComisionConfig.setName("jPanelCamposTipoComisionConfig"); 

		this.jPanelCamposOcultosTipoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoComisionConfig.setName("jPanelCamposOcultosTipoComisionConfig"); 

        this.jPanelAccionesTipoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoComisionConfig.setToolTipText("Acciones");
        this.jPanelAccionesTipoComisionConfig.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoComisionConfig.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoComisionConfig.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoComisionConfig.setText("Nuevo");
		this.jButtonModificarTipoComisionConfig.setText("Editar");
        this.jButtonActualizarTipoComisionConfig.setText("Actualizar");
        this.jButtonEliminarTipoComisionConfig.setText("Eliminar");
        this.jButtonCancelarTipoComisionConfig.setText("Cancelar");
        this.jButtonGuardarCambiosTipoComisionConfig.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoComisionConfig.setText("Guardar");
		this.jButtonCerrarTipoComisionConfig.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoComisionConfig,"nuevo_button","Nuevo",this.tipocomisionconfigSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoComisionConfig,"modificar_button","Editar",this.tipocomisionconfigSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoComisionConfig,"actualizar_button","Actualizar",this.tipocomisionconfigSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoComisionConfig,"eliminar_button","Eliminar",this.tipocomisionconfigSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoComisionConfig,"cancelar_button","Cancelar",this.tipocomisionconfigSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoComisionConfig,"guardarcambios_button","Guardar",this.tipocomisionconfigSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoComisionConfig,"guardarcambiostabla_button","Guardar",this.tipocomisionconfigSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoComisionConfig,"cerrar_button","Salir",this.tipocomisionconfigSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoComisionConfig.setToolTipText("Nuevo"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoComisionConfig.setToolTipText("Editar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoComisionConfig.setToolTipText("Actualizar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoComisionConfig.setToolTipText("Eliminar)"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoComisionConfig.setToolTipText("Cancelar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoComisionConfig.setToolTipText("Guardar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoComisionConfig.setToolTipText("Guardar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoComisionConfig.setToolTipText("Salir"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoComisionConfig";
		inputMap = this.jButtonNuevoTipoComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoComisionConfig.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoComisionConfig"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoComisionConfig";
		inputMap = this.jButtonActualizarTipoComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoComisionConfig"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoComisionConfig";
		inputMap = this.jButtonEliminarTipoComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoComisionConfig"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoComisionConfig";
		inputMap = this.jButtonCancelarTipoComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoComisionConfig"));
		
		//CERRAR		
		sMapKey = "CerrarTipoComisionConfig";
		inputMap = this.jButtonCerrarTipoComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoComisionConfig"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoComisionConfig";
		inputMap = this.jButtonGuardarCambiosTablaTipoComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoComisionConfig"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoComisionConfig = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoComisionConfig.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoComisionConfig.setToolTipText("Nuevo TipoComisionConfig");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoComisionConfig = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoComisionConfig.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoComisionConfig.setToolTipText("Sin Cerrar Ventana TipoComisionConfig");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoComisionConfig = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoComisionConfig.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoComisionConfig.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoComisionConfig = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoComisionConfig.setText("Accion");
		this.jComboBoxTiposAccionesTipoComisionConfig.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoComisionConfig = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoComisionConfig.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoComisionConfig.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoComisionConfig = new JLabelMe();
		
		this.jLabelAccionesTipoComisionConfig.setText("Acciones");		
		this.jLabelAccionesTipoComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoComisionConfig();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoComisionConfig();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoComisionConfig=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoComisionConfig.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoComisionConfig.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoComisionConfig.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoComisionConfig.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoComisionConfig.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoComisionConfig.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoComisionConfig = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoComisionConfig = new GridBagLayout();
		
		this.jPanelCamposTipoComisionConfig.setLayout(gridaBagLayoutCamposTipoComisionConfig);
		this.jPanelCamposOcultosTipoComisionConfig.setLayout(gridaBagLayoutCamposOcultosTipoComisionConfig);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoComisionConfig.gridy = 0;
	this.gridBagConstraintsTipoComisionConfig.gridx = 0;
	this.gridBagConstraintsTipoComisionConfig.ipadx = 0;
	this.gridBagConstraintsTipoComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoComisionConfig.add(jLabelIdTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);



	this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoComisionConfig.gridy = 0;
	this.gridBagConstraintsTipoComisionConfig.gridx = 1;
	this.gridBagConstraintsTipoComisionConfig.ipadx = 0;
	this.gridBagConstraintsTipoComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoComisionConfig.add(jLabelidTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);


	this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoComisionConfig.gridy = 0;
	this.gridBagConstraintsTipoComisionConfig.gridx = 0;
	this.gridBagConstraintsTipoComisionConfig.ipadx = 0;
	this.gridBagConstraintsTipoComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoComisionConfig.add(jLabelid_empresaTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		//this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoComisionConfig.gridy = 0;
		this.gridBagConstraintsTipoComisionConfig.gridx = 2;
		this.gridBagConstraintsTipoComisionConfig.ipadx = 0;
		this.gridBagConstraintsTipoComisionConfig.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoComisionConfig.add(jButtonid_empresaTipoComisionConfigBusqueda, this.gridBagConstraintsTipoComisionConfig);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		//this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoComisionConfig.gridy = 0;
		this.gridBagConstraintsTipoComisionConfig.gridx = 3;
		this.gridBagConstraintsTipoComisionConfig.ipadx = 0;
		this.gridBagConstraintsTipoComisionConfig.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoComisionConfig.add(jButtonid_empresaTipoComisionConfigUpdate, this.gridBagConstraintsTipoComisionConfig);
	}

	this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoComisionConfig.gridy = 0;
	this.gridBagConstraintsTipoComisionConfig.gridx = 1;
	this.gridBagConstraintsTipoComisionConfig.ipadx = 0;
	this.gridBagConstraintsTipoComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoComisionConfig.add(jComboBoxid_empresaTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);


	this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoComisionConfig.gridy = 0;
	this.gridBagConstraintsTipoComisionConfig.gridx = 0;
	this.gridBagConstraintsTipoComisionConfig.ipadx = 0;
	this.gridBagConstraintsTipoComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoComisionConfig.add(jLabelcodigoTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		//this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoComisionConfig.gridy = 0;
		this.gridBagConstraintsTipoComisionConfig.gridx = 2;
		this.gridBagConstraintsTipoComisionConfig.ipadx = 0;
		this.gridBagConstraintsTipoComisionConfig.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoComisionConfig.add(jButtoncodigoTipoComisionConfigBusqueda, this.gridBagConstraintsTipoComisionConfig);
	}

	this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoComisionConfig.gridy = 0;
	this.gridBagConstraintsTipoComisionConfig.gridx = 1;
	this.gridBagConstraintsTipoComisionConfig.ipadx = 0;
	this.gridBagConstraintsTipoComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoComisionConfig.add(jTextFieldcodigoTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);


	this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoComisionConfig.gridy = 0;
	this.gridBagConstraintsTipoComisionConfig.gridx = 0;
	this.gridBagConstraintsTipoComisionConfig.ipadx = 0;
	this.gridBagConstraintsTipoComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoComisionConfig.add(jLabelnombreTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		//this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoComisionConfig.gridy = 0;
		this.gridBagConstraintsTipoComisionConfig.gridx = 2;
		this.gridBagConstraintsTipoComisionConfig.ipadx = 0;
		this.gridBagConstraintsTipoComisionConfig.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoComisionConfig.add(jButtonnombreTipoComisionConfigBusqueda, this.gridBagConstraintsTipoComisionConfig);
	}

	this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoComisionConfig.gridy = 0;
	this.gridBagConstraintsTipoComisionConfig.gridx = 1;
	this.gridBagConstraintsTipoComisionConfig.ipadx = 0;
	this.gridBagConstraintsTipoComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoComisionConfig.add(jscrollPanenombreTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoComisionConfig.gridy = iYPanelCamposTipoComisionConfig;
	this.gridBagConstraintsTipoComisionConfig.gridx = iXPanelCamposTipoComisionConfig++;
	this.gridBagConstraintsTipoComisionConfig.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoComisionConfig.add(this.jPanelidTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);



	if(iXPanelCamposTipoComisionConfig % 1==0) {
		iXPanelCamposTipoComisionConfig=0;
		iYPanelCamposTipoComisionConfig++;
	}
	this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoComisionConfig.gridy = iYPanelCamposTipoComisionConfig;
	this.gridBagConstraintsTipoComisionConfig.gridx = iXPanelCamposTipoComisionConfig++;
	this.gridBagConstraintsTipoComisionConfig.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoComisionConfig.add(this.jPanelcodigoTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);



	if(iXPanelCamposTipoComisionConfig % 1==0) {
		iXPanelCamposTipoComisionConfig=0;
		iYPanelCamposTipoComisionConfig++;
	}
	this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoComisionConfig.gridy = iYPanelCamposTipoComisionConfig;
	this.gridBagConstraintsTipoComisionConfig.gridx = iXPanelCamposTipoComisionConfig++;
	this.gridBagConstraintsTipoComisionConfig.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoComisionConfig.add(this.jPanelnombreTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);



	if(iXPanelCamposTipoComisionConfig % 1==0) {
		iXPanelCamposTipoComisionConfig=0;
		iYPanelCamposTipoComisionConfig++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoComisionConfig.gridy = iYPanelCamposOcultosTipoComisionConfig;
	this.gridBagConstraintsTipoComisionConfig.gridx = iXPanelCamposOcultosTipoComisionConfig++;
	this.gridBagConstraintsTipoComisionConfig.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoComisionConfig.add(this.jPanelid_empresaTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);



	if(iXPanelCamposOcultosTipoComisionConfig % 1==0) {
		iXPanelCamposOcultosTipoComisionConfig=0;
		iYPanelCamposOcultosTipoComisionConfig++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoComisionConfig= new GridBagLayout();
		this.jPanelAccionesTipoComisionConfig.setLayout(gridaBagLayoutAccionesTipoComisionConfig);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoComisionConfig= new GridBagLayout();
		this.jPanelAccionesFormularioTipoComisionConfig.setLayout(gridaBagLayoutAccionesFormularioTipoComisionConfig);
		
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoComisionConfig.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoComisionConfig.add(this.jComboBoxTiposAccionesFormularioTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);

		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoComisionConfig.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoComisionConfig.add(this.jCheckBoxPostAccionNuevoTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocomisionconfigSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoComisionConfig.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoComisionConfig.add(this.jCheckBoxPostAccionSinCerrarTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocomisionconfigSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoComisionConfig.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoComisionConfig.add(this.jCheckBoxPostAccionSinMensajeTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComisionConfig.gridy = 0;
		this.gridBagConstraintsTipoComisionConfig.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoComisionConfig.add(this.jButtonModificarTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);							

		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComisionConfig.gridy = 0;
		this.gridBagConstraintsTipoComisionConfig.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoComisionConfig.add(this.jButtonEliminarTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		
			
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.gridy = 0;		
		this.gridBagConstraintsTipoComisionConfig.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoComisionConfig.add(this.jButtonActualizarTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);


		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.gridy = 0;		
		this.gridBagConstraintsTipoComisionConfig.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoComisionConfig.add(this.jButtonGuardarCambiosTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);	
		
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.gridy = 0;		
		this.gridBagConstraintsTipoComisionConfig.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoComisionConfig.add(this.jButtonCancelarTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoComisionConfig = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoComisionConfig);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();						
			this.gridBagConstraintsTipoComisionConfig.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoComisionConfig.gridx = 0;		
			//this.gridBagConstraintsTipoComisionConfig.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoComisionConfig.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoComisionConfig.gridx =0;
		this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoComisionConfig.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoComisionConfigJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoComisionConfig = new TipoComisionConfigBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Comision Config DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Comision Config DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Comision Config Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoComisionConfigModel tipocomisionconfigModel=new TipoComisionConfigModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoComisionConfigModel.TipoComisionConfigFocusTraversalPolicy tipocomisionconfigFocusTraversalPolicy = tipocomisionconfigModel.new TipoComisionConfigFocusTraversalPolicy(this);
			
			//tipocomisionconfigFocusTraversalPolicy.settipocomisionconfigJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocomisionconfigModel);
			
			
			this.jContentPaneDetalleTipoComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoComisionConfig = new GridBagLayout();	
			this.jContentPaneDetalleTipoComisionConfig.setLayout(gridaBagLayoutDetalleTipoComisionConfig);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoComisionConfig = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
				this.gridBagConstraintsTipoComisionConfig.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoComisionConfig.gridx = 0;
					
				
				this.jContentPaneDetalleTipoComisionConfig.add(jTtoolBarDetalleTipoComisionConfig, gridBagConstraintsTipoComisionConfig);								
				
}
			
			this.jScrollPanelDatosEdicionTipoComisionConfig=   new JScrollPane(jContentPaneDetalleTipoComisionConfig,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoComisionConfig.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoComisionConfig.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoComisionConfig.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoComisionConfig=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoComisionConfig.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoComisionConfig.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoComisionConfig.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoComisionConfig.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoComisionConfig.gridx = 0;
	        
			this.jContentPaneDetalleTipoComisionConfig.add(jPanelCamposTipoComisionConfig, gridBagConstraintsTipoComisionConfig);
			
			
			
			
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
						&& tipocomisionconfigSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameComisionConfig(this.puedeCargarPorParteComisionConfig,false,-1);
					
					if(this.tipocomisionconfigSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoComisionConfig= new GridBagConstraints();
						this.gridBagConstraintsTipoComisionConfig.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoComisionConfig.gridx = 0;
						this.jContentPaneDetalleTipoComisionConfig.add(this.jTabbedPaneRelacionesTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoComisionConfig.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameComisionConfig(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoComisionConfig.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
					this.gridBagConstraintsTipoComisionConfig.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoComisionConfig.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoComisionConfig.gridx = 0;
					
				
					this.jContentPaneDetalleTipoComisionConfig.add(jPanelCamposOcultosTipoComisionConfig, gridBagConstraintsTipoComisionConfig);
				
					this.jPanelCamposOcultosTipoComisionConfig.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoComisionConfig.gridx = 0;
	        this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoComisionConfig.add(this.jPanelAccionesFormularioTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);							
			
			
			
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
	        this.gridBagConstraintsTipoComisionConfig.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoComisionConfig.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoComisionConfig.add(this.jPanelAccionesTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoComisionConfig);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoComisionConfig=   new JScrollPane(this.jPanelCamposTipoComisionConfig,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoComisionConfig.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoComisionConfig.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoComisionConfig.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoComisionConfig.gridx = 0;
			this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoComisionConfig.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoComisionConfig.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);			
			
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoComisionConfig.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoComisionConfig.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
			
			
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoComisionConfig.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		
			
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoComisionConfig.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoComisionConfig;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoComisionConfig;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameComisionConfig(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.comisionconfigSessionBean=new ComisionConfigSessionBean();
		this.comisionconfigSessionBean.setConGuardarRelaciones(false);
		this.comisionconfigSessionBean.setEsGuardarRelacionado(true);

		this.comisionconfigBeanSwingJInternalFrame=null;//new ComisionConfigBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.comisionconfigBeanSwingJInternalFramePopup=new ComisionConfigBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.comisionconfigBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.comisionconfigSessionBean.getEsGuardarRelacionado()) {

				ComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL=TipoComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL;
				ComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.comisionconfigSessionBean.setEsGuardarRelacionado(true);

				this.comisionconfigBeanSwingJInternalFrame=new ComisionConfigBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.comisionconfigBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.comisionconfigBeanSwingJInternalFrame.setcomisionconfigSessionBean(this.comisionconfigSessionBean);

				//this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
				//this.gridBagConstraintsTipoComisionConfig.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoComisionConfig.gridx = 0;
				//this.jContentPaneDetalleTipoComisionConfig.add(this.comisionconfigBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoComisionConfig);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoComisionConfig.add("Comision Configes",this.comisionconfigBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoComisionConfig.setComponentAt(iIndexTab,this.comisionconfigBeanSwingJInternalFrame.getContentPane());
				}

				//ComisionConfigJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.comisionconfigSessionBean.setEsGuardarRelacionado(false);
				this.comisionconfigBeanSwingJInternalFrame=null;//new ComisionConfigBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteComisionConfig) {
					this.jTabbedPaneRelacionesTipoComisionConfig.add("Comision Configes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarComisionConfigBeanSwingJInternalFrame(List<TipoComisionConfig> tipocomisionconfigs,TipoComisionConfig tipocomisionconfig,ComisionConfigBeanSwingJInternalFrame comisionconfigBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//comisionconfigBeanSwingJInternalFrame=new ComisionConfigBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					comisionconfigBeanSwingJInternalFrame.getComisionConfigLogic().setConnexion(this.tipocomisionconfigLogic.getConnexion());

					comisionconfigBeanSwingJInternalFrame.settipocomisionconfigsForeignKey(tipocomisionconfigs);
					comisionconfigBeanSwingJInternalFrame.settipocomisionconfigForeignKey(tipocomisionconfig);
					comisionconfigBeanSwingJInternalFrame.comisionconfigSessionBean.setisBusquedaDesdeForeignKeySesionTipoComisionConfig(true);
					comisionconfigBeanSwingJInternalFrame.comisionconfigSessionBean.setlidTipoComisionConfigActual(tipocomisionconfig.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					comisionconfigBeanSwingJInternalFrame.cargarCombosForeignKeyComisionConfig(comisionconfigBeanSwingJInternalFrame.isCargarCombosDependencia);
					comisionconfigBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoComisionConfig(true);
					comisionconfigBeanSwingJInternalFrame.setid_tipo_comision_configFK_IdTipoComisionConfig(tipocomisionconfig.getId());

					if(!this.conCargarFormDetalle) {
						comisionconfigBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					comisionconfigBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoComisionConfigForeignKey(tipocomisionconfig,1,false,true,true);
					comisionconfigBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					comisionconfigBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoComisionConfig");
					comisionconfigBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoComisionConfig");
					comisionconfigBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionConfig(true);
					comisionconfigBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesComisionConfig("n",comisionconfigBeanSwingJInternalFrame.isGuardarCambiosEnLote, comisionconfigBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					comisionconfigBeanSwingJInternalFrame.setAutoscrolls(true);
					comisionconfigBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						comisionconfigBeanSwingJInternalFrame.actualizarEstadoPanelsComisionConfig("relacionado");
					} else {
						comisionconfigBeanSwingJInternalFrame.actualizarEstadoPanelsComisionConfig("no_relacionado");
					}

					comisionconfigBeanSwingJInternalFrame.getjButtonRecargarInformacionComisionConfig().setVisible(false);

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
