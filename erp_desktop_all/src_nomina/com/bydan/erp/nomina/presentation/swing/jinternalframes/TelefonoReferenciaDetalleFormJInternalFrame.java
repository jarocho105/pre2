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



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.nomina.util.TelefonoReferenciaConstantesFunciones;

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
public class TelefonoReferenciaDetalleFormJInternalFrame extends TelefonoReferenciaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTelefonoReferencia;
	
	protected JMenuBar jmenuBarDetalleTelefonoReferencia;
	
	protected JMenu jmenuDetalleTelefonoReferencia;
	protected JMenu jmenuDetalleArchivoTelefonoReferencia;
	protected JMenu jmenuDetalleAccionesTelefonoReferencia;
	protected JMenu jmenuDetalleDatosTelefonoReferencia;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTelefonoReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTelefonoReferencia;	
	protected GridBagConstraints gridBagConstraintsTelefonoReferencia;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TelefonoReferenciaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTelefonoReferencia;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ReferenciaBeanSwingJInternalFrame referenciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_referencia="";
	
	public TelefonoReferenciaSessionBean telefonoreferenciaSessionBean;
	
	
	
	
	public ReferenciaSessionBean referenciaSessionBean;	
	
	public TelefonoReferenciaLogic telefonoreferenciaLogic;
	
	public JScrollPane jScrollPanelDatosTelefonoReferencia;
	public JScrollPane jScrollPanelDatosEdicionTelefonoReferencia;
	public JScrollPane jScrollPanelDatosGeneralTelefonoReferencia;
	
	protected JPanel jPanelCamposTelefonoReferencia;    
	protected JPanel jPanelCamposOcultosTelefonoReferencia;    	
	protected JPanel jPanelAccionesTelefonoReferencia;
	protected JPanel jPanelAccionesFormularioTelefonoReferencia;
    
	
	
	protected Integer iXPanelCamposTelefonoReferencia=0;
	protected Integer iYPanelCamposTelefonoReferencia=0;
	
	protected Integer iXPanelCamposOcultosTelefonoReferencia=0;
	protected Integer iYPanelCamposOcultosTelefonoReferencia=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTelefonoReferencia;
	public JButton jButtonModificarTelefonoReferencia;
	public JButton jButtonActualizarTelefonoReferencia;
    public JButton jButtonEliminarTelefonoReferencia;
	public JButton jButtonCancelarTelefonoReferencia;
    public JButton jButtonGuardarCambiosTelefonoReferencia;
	public JButton jButtonGuardarCambiosTablaTelefonoReferencia;
	protected JButton jButtonCerrarTelefonoReferencia;
	
	
	protected JButton jButtonProcesarInformacionTelefonoReferencia;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTelefonoReferencia;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTelefonoReferencia;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTelefonoReferencia;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTelefonoReferencia;
	protected JButton jButtonModificarToolBarTelefonoReferencia;
	protected JButton jButtonActualizarToolBarTelefonoReferencia;
    protected JButton jButtonEliminarToolBarTelefonoReferencia;
	protected JButton jButtonCancelarToolBarTelefonoReferencia;
    protected JButton jButtonGuardarCambiosToolBarTelefonoReferencia;
	protected JButton jButtonGuardarCambiosTablaToolBarTelefonoReferencia;
	protected JButton jButtonMostrarOcultarTablaToolBarTelefonoReferencia;
	protected JButton jButtonCerrarToolBarTelefonoReferencia;
	
	protected JButton jButtonProcesarInformacionToolBarTelefonoReferencia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTelefonoReferencia;
	protected JMenuItem jMenuItemModificarTelefonoReferencia;
	protected JMenuItem jMenuItemActualizarTelefonoReferencia;
    protected JMenuItem jMenuItemEliminarTelefonoReferencia;
	protected JMenuItem jMenuItemCancelarTelefonoReferencia;
    protected JMenuItem jMenuItemGuardarCambiosTelefonoReferencia;
	protected JMenuItem jMenuItemGuardarCambiosTablaTelefonoReferencia;
	protected JMenuItem jMenuItemCerrarTelefonoReferencia;
	protected JMenuItem jMenuItemDetalleCerrarTelefonoReferencia;
	protected JMenuItem jMenuItemDetalleMostarOcultarTelefonoReferencia;
	
	protected JMenuItem jMenuItemProcesarInformacionTelefonoReferencia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTelefonoReferencia;
	protected JMenuItem jMenuItemMostrarOcultarTelefonoReferencia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTelefonoReferencia;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTelefonoReferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTelefonoReferencia;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTelefonoReferencia;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTelefonoReferencia;
	public JLabel jLabelIdTelefonoReferencia;
	public JLabel jLabelidTelefonoReferencia;
	public JButton jButtonidTelefonoReferenciaBusqueda= new JButtonMe();

	public JPanel jPanelnumeroTelefonoReferencia;
	public JLabel jLabelnumeroTelefonoReferencia;
	public JTextField jTextFieldnumeroTelefonoReferencia;
	public JButton jButtonnumeroTelefonoReferenciaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_referenciaTelefonoReferencia;
	public JLabel jLabelid_referenciaTelefonoReferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_referenciaTelefonoReferencia;
	public JButton jButtonid_referenciaTelefonoReferencia= new JButtonMe();
	public JButton jButtonid_referenciaTelefonoReferenciaUpdate= new JButtonMe();
	public JButton jButtonid_referenciaTelefonoReferenciaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTelefonoReferencia;
	
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
	
	public TelefonoReferenciaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTelefonoReferencia=new JPanel();
				this.jPanelAccionesFormularioTelefonoReferencia=new JPanel();
				this.jmenuBarDetalleTelefonoReferencia=new JMenuBar();
				this.jTtoolBarDetalleTelefonoReferencia=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TelefonoReferenciaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TelefonoReferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TelefonoReferenciaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TelefonoReferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TelefonoReferenciaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TelefonoReferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TelefonoReferenciaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TelefonoReferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TelefonoReferenciaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TelefonoReferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTelefonoReferencia() {
		return this.jButtonActualizarToolBarTelefonoReferencia;
	}
	
	public JButton getjButtonEliminarToolBarTelefonoReferencia() {
		return this.jButtonEliminarToolBarTelefonoReferencia;
	}
	
	public JButton getjButtonCancelarToolBarTelefonoReferencia() {
		return this.jButtonCancelarToolBarTelefonoReferencia;
	}		
	
	public JButton getjButtonProcesarInformacionTelefonoReferencia() {
		return this.jButtonProcesarInformacionTelefonoReferencia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTelefonoReferencia)	{
		this.jButtonProcesarInformacionTelefonoReferencia = jButtonProcesarInformacionTelefonoReferencia;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTelefonoReferencia() {
		return this.jComboBoxTiposAccionesTelefonoReferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTelefonoReferencia(
			JComboBox jComboBoxTiposRelacionesTelefonoReferencia) {
		this.jComboBoxTiposRelacionesTelefonoReferencia = jComboBoxTiposRelacionesTelefonoReferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTelefonoReferencia(
			JComboBox jComboBoxTiposAccionesTelefonoReferencia) {
		this.jComboBoxTiposAccionesTelefonoReferencia = jComboBoxTiposAccionesTelefonoReferencia;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTelefonoReferencia() {
		return this.jComboBoxTiposAccionesFormularioTelefonoReferencia;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTelefonoReferencia(
			JComboBox jComboBoxTiposAccionesFormularioTelefonoReferencia) {
		this.jComboBoxTiposAccionesFormularioTelefonoReferencia = jComboBoxTiposAccionesFormularioTelefonoReferencia;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.telefonoreferenciaSessionBean=new TelefonoReferenciaSessionBean();
		
		this.telefonoreferenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.telefonoreferenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.telefonoreferenciaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TelefonoReferenciaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TelefonoReferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TelefonoReferenciaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Telefono Referencia MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
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
	
		TelefonoReferenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTelefonoReferencia= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTelefonoReferencia=new JButtonMe();
				this.jButtonModificarToolBarTelefonoReferencia=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTelefonoReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTelefonoReferencia,this.jTtoolBarDetalleTelefonoReferencia,
							"actualizar","actualizar","Actualizar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTelefonoReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTelefonoReferencia,this.jTtoolBarDetalleTelefonoReferencia,
							"eliminar","eliminar","Eliminar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTelefonoReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTelefonoReferencia,this.jTtoolBarDetalleTelefonoReferencia,
							"cancelar","cancelar","Cancelar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTelefonoReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTelefonoReferencia,this.jTtoolBarDetalleTelefonoReferencia,
							"guardarcambios","guardarcambios","Guardar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTelefonoReferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTelefonoReferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTelefonoReferencia,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTelefonoReferencia=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTelefonoReferencia=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTelefonoReferencia=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTelefonoReferencia=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTelefonoReferencia=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTelefonoReferencia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTelefonoReferencia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTelefonoReferencia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTelefonoReferencia= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTelefonoReferencia.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTelefonoReferencia,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTelefonoReferencia= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTelefonoReferencia.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTelefonoReferencia,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTelefonoReferencia= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTelefonoReferencia.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTelefonoReferencia,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTelefonoReferencia= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTelefonoReferencia.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTelefonoReferencia,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTelefonoReferencia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTelefonoReferencia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTelefonoReferencia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTelefonoReferencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTelefonoReferencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTelefonoReferencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTelefonoReferencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTelefonoReferencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTelefonoReferencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTelefonoReferencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTelefonoReferencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTelefonoReferencia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTelefonoReferencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTelefonoReferencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTelefonoReferencia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTelefonoReferencia.add(this.jMenuItemDetalleCerrarTelefonoReferencia);
		
		this.jmenuDetalleAccionesTelefonoReferencia.add(this.jMenuItemActualizarTelefonoReferencia);
		this.jmenuDetalleAccionesTelefonoReferencia.add(this.jMenuItemEliminarTelefonoReferencia);
		this.jmenuDetalleAccionesTelefonoReferencia.add(this.jMenuItemCancelarTelefonoReferencia);		
		
		//this.jmenuDetalleDatosTelefonoReferencia.add(this.jMenuItemDetalleAbrirOrderByTelefonoReferencia);				
		this.jmenuDetalleDatosTelefonoReferencia.add(this.jMenuItemDetalleMostarOcultarTelefonoReferencia);				
				
		//this.jmenuDetalleAccionesTelefonoReferencia.add(this.jMenuItemGuardarCambiosTelefonoReferencia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTelefonoReferencia.add(this.jmenuDetalleArchivoTelefonoReferencia);		
		this.jmenuBarDetalleTelefonoReferencia.add(this.jmenuDetalleAccionesTelefonoReferencia);		
		this.jmenuBarDetalleTelefonoReferencia.add(this.jmenuDetalleDatosTelefonoReferencia);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTelefonoReferencia);				
	}
	
	
	public void inicializarElementosCamposTelefonoReferencia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTelefonoReferencia = new JLabelMe();
		jLabelIdTelefonoReferencia.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTelefonoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTelefonoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTelefonoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTelefonoReferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTelefonoReferencia = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTelefonoReferencia.setToolTipText(TelefonoReferenciaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTelefonoReferencia= new GridBagLayout();

		this.jPanelidTelefonoReferencia.setLayout(this.gridaBagLayoutTelefonoReferencia);

		jLabelidTelefonoReferencia = new JLabel();
		jLabelidTelefonoReferencia.setText("Id");

		jLabelidTelefonoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTelefonoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTelefonoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumeroTelefonoReferencia = new JLabelMe();
		this.jLabelnumeroTelefonoReferencia.setText(""+TelefonoReferenciaConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroTelefonoReferencia.setToolTipText("Numero");
		this.jLabelnumeroTelefonoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroTelefonoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroTelefonoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroTelefonoReferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroTelefonoReferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroTelefonoReferencia.setToolTipText(TelefonoReferenciaConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutTelefonoReferencia = new GridBagLayout();
		this.jPanelnumeroTelefonoReferencia.setLayout(this.gridaBagLayoutTelefonoReferencia);


		jTextFieldnumeroTelefonoReferencia= new JTextFieldMe();

		jTextFieldnumeroTelefonoReferencia.setEnabled(false);
		jTextFieldnumeroTelefonoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroTelefonoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroTelefonoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroTelefonoReferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroTelefonoReferenciaBusqueda= new JButtonMe();
		this.jButtonnumeroTelefonoReferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroTelefonoReferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroTelefonoReferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroTelefonoReferenciaBusqueda.setText("U");
		this.jButtonnumeroTelefonoReferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroTelefonoReferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroTelefonoReferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroTelefonoReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroTelefonoReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroTelefonoReferenciaBusqueda"));

		if(this.telefonoreferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroTelefonoReferenciaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTelefonoReferencia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_referenciaTelefonoReferencia = new JLabelMe();
		this.jLabelid_referenciaTelefonoReferencia.setText(""+TelefonoReferenciaConstantesFunciones.LABEL_IDREFERENCIA+" : *");
		this.jLabelid_referenciaTelefonoReferencia.setToolTipText("Referencia");
		this.jLabelid_referenciaTelefonoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_referenciaTelefonoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_referenciaTelefonoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_referenciaTelefonoReferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_referenciaTelefonoReferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_referenciaTelefonoReferencia.setToolTipText(TelefonoReferenciaConstantesFunciones.LABEL_IDREFERENCIA);
		this.gridaBagLayoutTelefonoReferencia = new GridBagLayout();
		this.jPanelid_referenciaTelefonoReferencia.setLayout(this.gridaBagLayoutTelefonoReferencia);


		jComboBoxid_referenciaTelefonoReferencia= new JComboBoxMe();
		jComboBoxid_referenciaTelefonoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_referenciaTelefonoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_referenciaTelefonoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_referenciaTelefonoReferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_referenciaTelefonoReferencia= new JButtonMe();
		this.jButtonid_referenciaTelefonoReferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_referenciaTelefonoReferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_referenciaTelefonoReferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_referenciaTelefonoReferencia.setText("Buscar");
		this.jButtonid_referenciaTelefonoReferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_referenciaTelefonoReferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_referenciaTelefonoReferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_referenciaTelefonoReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_referenciaTelefonoReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_referenciaTelefonoReferencia"));

		this.jButtonid_referenciaTelefonoReferenciaBusqueda= new JButtonMe();
		this.jButtonid_referenciaTelefonoReferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_referenciaTelefonoReferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_referenciaTelefonoReferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_referenciaTelefonoReferenciaBusqueda.setText("U");
		this.jButtonid_referenciaTelefonoReferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_referenciaTelefonoReferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_referenciaTelefonoReferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_referenciaTelefonoReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_referenciaTelefonoReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_referenciaTelefonoReferenciaBusqueda"));

		if(this.telefonoreferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_referenciaTelefonoReferenciaBusqueda.setVisible(false);		}

		this.jButtonid_referenciaTelefonoReferenciaUpdate= new JButtonMe();
		this.jButtonid_referenciaTelefonoReferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_referenciaTelefonoReferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_referenciaTelefonoReferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_referenciaTelefonoReferenciaUpdate.setText("U");
		this.jButtonid_referenciaTelefonoReferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_referenciaTelefonoReferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_referenciaTelefonoReferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_referenciaTelefonoReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_referenciaTelefonoReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_referenciaTelefonoReferenciaUpdate"));



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
		//this.jInternalFrameDetalleTelefonoReferencia = new TelefonoReferenciaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Telefono Referencia DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTelefonoReferencia= new GridBagLayout();
		

		
		String sToolTipTelefonoReferencia="";
		sToolTipTelefonoReferencia=TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTelefonoReferencia+="(Nomina.TelefonoReferencia)";
		}
		
		if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTelefonoReferencia+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTelefonoReferencia = new JButtonMe();
		this.jButtonModificarTelefonoReferencia = new JButtonMe();
        this.jButtonActualizarTelefonoReferencia = new JButtonMe();
        this.jButtonEliminarTelefonoReferencia = new JButtonMe();
        this.jButtonCancelarTelefonoReferencia = new JButtonMe();
        this.jButtonGuardarCambiosTelefonoReferencia = new JButtonMe();
		this.jButtonGuardarCambiosTablaTelefonoReferencia = new JButtonMe();
		this.jButtonCerrarTelefonoReferencia = new JButtonMe();
		
		this.jScrollPanelDatosTelefonoReferencia = new JScrollPane();   
        this.jScrollPanelDatosEdicionTelefonoReferencia = new JScrollPane();
		this.jScrollPanelDatosGeneralTelefonoReferencia = new JScrollPane();
				
		
		
		this.jPanelCamposTelefonoReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTelefonoReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTelefonoReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTelefonoReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Telefono Referencia";
		
		if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTelefonoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Telefono Referencias" + this.sPath));
		} else {
			this.jScrollPanelDatosTelefonoReferencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTelefonoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTelefonoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTelefonoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTelefonoReferencia.setName("jPanelCamposTelefonoReferencia"); 

		this.jPanelCamposOcultosTelefonoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTelefonoReferencia.setName("jPanelCamposOcultosTelefonoReferencia"); 

        this.jPanelAccionesTelefonoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTelefonoReferencia.setToolTipText("Acciones");
        this.jPanelAccionesTelefonoReferencia.setName("Acciones"); 

		this.jPanelAccionesFormularioTelefonoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTelefonoReferencia.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTelefonoReferencia.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTelefonoReferencia.setText("Nuevo");
		this.jButtonModificarTelefonoReferencia.setText("Editar");
        this.jButtonActualizarTelefonoReferencia.setText("Actualizar");
        this.jButtonEliminarTelefonoReferencia.setText("Eliminar");
        this.jButtonCancelarTelefonoReferencia.setText("Cancelar");
        this.jButtonGuardarCambiosTelefonoReferencia.setText("Guardar");
		this.jButtonGuardarCambiosTablaTelefonoReferencia.setText("Guardar");
		this.jButtonCerrarTelefonoReferencia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTelefonoReferencia,"nuevo_button","Nuevo",this.telefonoreferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTelefonoReferencia,"modificar_button","Editar",this.telefonoreferenciaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTelefonoReferencia,"actualizar_button","Actualizar",this.telefonoreferenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTelefonoReferencia,"eliminar_button","Eliminar",this.telefonoreferenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTelefonoReferencia,"cancelar_button","Cancelar",this.telefonoreferenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTelefonoReferencia,"guardarcambios_button","Guardar",this.telefonoreferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTelefonoReferencia,"guardarcambiostabla_button","Guardar",this.telefonoreferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTelefonoReferencia,"cerrar_button","Salir",this.telefonoreferenciaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTelefonoReferencia.setToolTipText("Nuevo"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTelefonoReferencia.setToolTipText("Editar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTelefonoReferencia.setToolTipText("Actualizar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTelefonoReferencia.setToolTipText("Eliminar)"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTelefonoReferencia.setToolTipText("Cancelar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTelefonoReferencia.setToolTipText("Guardar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTelefonoReferencia.setToolTipText("Guardar"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTelefonoReferencia.setToolTipText("Salir"+" "+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTelefonoReferencia";
		inputMap = this.jButtonNuevoTelefonoReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTelefonoReferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTelefonoReferencia"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTelefonoReferencia";
		inputMap = this.jButtonActualizarTelefonoReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTelefonoReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTelefonoReferencia"));
		
		//ELIMINAR
		sMapKey = "EliminarTelefonoReferencia";
		inputMap = this.jButtonEliminarTelefonoReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTelefonoReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTelefonoReferencia"));
		
		//CANCELAR	
		sMapKey = "CancelarTelefonoReferencia";
		inputMap = this.jButtonCancelarTelefonoReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTelefonoReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTelefonoReferencia"));
		
		//CERRAR		
		sMapKey = "CerrarTelefonoReferencia";
		inputMap = this.jButtonCerrarTelefonoReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTelefonoReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTelefonoReferencia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTelefonoReferencia";
		inputMap = this.jButtonGuardarCambiosTablaTelefonoReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTelefonoReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTelefonoReferencia"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTelefonoReferencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTelefonoReferencia.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTelefonoReferencia.setToolTipText("Nuevo TelefonoReferencia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTelefonoReferencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTelefonoReferencia.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTelefonoReferencia.setToolTipText("Sin Cerrar Ventana TelefonoReferencia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTelefonoReferencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTelefonoReferencia.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTelefonoReferencia.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTelefonoReferencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTelefonoReferencia.setText("Accion");
		this.jComboBoxTiposAccionesTelefonoReferencia.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTelefonoReferencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTelefonoReferencia.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTelefonoReferencia.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTelefonoReferencia = new JLabelMe();
		
		this.jLabelAccionesTelefonoReferencia.setText("Acciones");		
		this.jLabelAccionesTelefonoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTelefonoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTelefonoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTelefonoReferencia();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTelefonoReferencia();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTelefonoReferencia=new JTabbedPane();
		this.jTabbedPaneRelacionesTelefonoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTelefonoReferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTelefonoReferencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTelefonoReferencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTelefonoReferencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTelefonoReferencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTelefonoReferencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTelefonoReferencia.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTelefonoReferencia, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTelefonoReferencia = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTelefonoReferencia = new GridBagLayout();
		
		this.jPanelCamposTelefonoReferencia.setLayout(gridaBagLayoutCamposTelefonoReferencia);
		this.jPanelCamposOcultosTelefonoReferencia.setLayout(gridaBagLayoutCamposOcultosTelefonoReferencia);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
	this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefonoReferencia.gridy = 0;
	this.gridBagConstraintsTelefonoReferencia.gridx = 0;
	this.gridBagConstraintsTelefonoReferencia.ipadx = 0;
	this.gridBagConstraintsTelefonoReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTelefonoReferencia.add(jLabelIdTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);



	this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
	this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefonoReferencia.gridy = 0;
	this.gridBagConstraintsTelefonoReferencia.gridx = 1;
	this.gridBagConstraintsTelefonoReferencia.ipadx = 0;
	this.gridBagConstraintsTelefonoReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTelefonoReferencia.add(jLabelidTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);


	this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
	this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefonoReferencia.gridy = 0;
	this.gridBagConstraintsTelefonoReferencia.gridx = 0;
	this.gridBagConstraintsTelefonoReferencia.ipadx = 0;
	this.gridBagConstraintsTelefonoReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_referenciaTelefonoReferencia.add(jLabelid_referenciaTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		//this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefonoReferencia.gridy = 0;
		this.gridBagConstraintsTelefonoReferencia.gridx = 2;
		this.gridBagConstraintsTelefonoReferencia.ipadx = 0;
		this.gridBagConstraintsTelefonoReferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_referenciaTelefonoReferencia.add(jButtonid_referenciaTelefonoReferenciaBusqueda, this.gridBagConstraintsTelefonoReferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		//this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefonoReferencia.gridy = 0;
		this.gridBagConstraintsTelefonoReferencia.gridx = 3;
		this.gridBagConstraintsTelefonoReferencia.ipadx = 0;
		this.gridBagConstraintsTelefonoReferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_referenciaTelefonoReferencia.add(jButtonid_referenciaTelefonoReferenciaUpdate, this.gridBagConstraintsTelefonoReferencia);
	}

	this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
	this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefonoReferencia.gridy = 0;
	this.gridBagConstraintsTelefonoReferencia.gridx = 1;
	this.gridBagConstraintsTelefonoReferencia.ipadx = 0;
	this.gridBagConstraintsTelefonoReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_referenciaTelefonoReferencia.add(jComboBoxid_referenciaTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);


	this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
	this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefonoReferencia.gridy = 0;
	this.gridBagConstraintsTelefonoReferencia.gridx = 0;
	this.gridBagConstraintsTelefonoReferencia.ipadx = 0;
	this.gridBagConstraintsTelefonoReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroTelefonoReferencia.add(jLabelnumeroTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		//this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefonoReferencia.gridy = 0;
		this.gridBagConstraintsTelefonoReferencia.gridx = 2;
		this.gridBagConstraintsTelefonoReferencia.ipadx = 0;
		this.gridBagConstraintsTelefonoReferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroTelefonoReferencia.add(jButtonnumeroTelefonoReferenciaBusqueda, this.gridBagConstraintsTelefonoReferencia);
	}

	this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
	this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTelefonoReferencia.gridy = 0;
	this.gridBagConstraintsTelefonoReferencia.gridx = 1;
	this.gridBagConstraintsTelefonoReferencia.ipadx = 0;
	this.gridBagConstraintsTelefonoReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroTelefonoReferencia.add(jTextFieldnumeroTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
	this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTelefonoReferencia.gridy = iYPanelCamposTelefonoReferencia;
	this.gridBagConstraintsTelefonoReferencia.gridx = iXPanelCamposTelefonoReferencia++;
	this.gridBagConstraintsTelefonoReferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTelefonoReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTelefonoReferencia.add(this.jPanelidTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);



	if(iXPanelCamposTelefonoReferencia % 1==0) {
		iXPanelCamposTelefonoReferencia=0;
		iYPanelCamposTelefonoReferencia++;
	}
	this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
	this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTelefonoReferencia.gridy = iYPanelCamposTelefonoReferencia;
	this.gridBagConstraintsTelefonoReferencia.gridx = iXPanelCamposTelefonoReferencia++;
	this.gridBagConstraintsTelefonoReferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTelefonoReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTelefonoReferencia.add(this.jPanelid_referenciaTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);



	if(iXPanelCamposTelefonoReferencia % 1==0) {
		iXPanelCamposTelefonoReferencia=0;
		iYPanelCamposTelefonoReferencia++;
	}
	this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
	this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTelefonoReferencia.gridy = iYPanelCamposTelefonoReferencia;
	this.gridBagConstraintsTelefonoReferencia.gridx = iXPanelCamposTelefonoReferencia++;
	this.gridBagConstraintsTelefonoReferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTelefonoReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTelefonoReferencia.add(this.jPanelnumeroTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);



	if(iXPanelCamposTelefonoReferencia % 1==0) {
		iXPanelCamposTelefonoReferencia=0;
		iYPanelCamposTelefonoReferencia++;
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
			
		GridBagLayout gridaBagLayoutAccionesTelefonoReferencia= new GridBagLayout();
		this.jPanelAccionesTelefonoReferencia.setLayout(gridaBagLayoutAccionesTelefonoReferencia);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTelefonoReferencia= new GridBagLayout();
		this.jPanelAccionesFormularioTelefonoReferencia.setLayout(gridaBagLayoutAccionesFormularioTelefonoReferencia);
		
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTelefonoReferencia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTelefonoReferencia.add(this.jComboBoxTiposAccionesFormularioTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);

		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTelefonoReferencia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTelefonoReferencia.add(this.jCheckBoxPostAccionNuevoTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.telefonoreferenciaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTelefonoReferencia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTelefonoReferencia.add(this.jCheckBoxPostAccionSinCerrarTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.telefonoreferenciaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTelefonoReferencia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTelefonoReferencia.add(this.jCheckBoxPostAccionSinMensajeTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefonoReferencia.gridy = 0;
		this.gridBagConstraintsTelefonoReferencia.gridx = iPosXAccion++;
			
		this.jPanelAccionesTelefonoReferencia.add(this.jButtonModificarTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);							

		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefonoReferencia.gridy = 0;
		this.gridBagConstraintsTelefonoReferencia.gridx =iPosXAccion++;
			
		this.jPanelAccionesTelefonoReferencia.add(this.jButtonEliminarTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
		
			
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.gridy = 0;		
		this.gridBagConstraintsTelefonoReferencia.gridx = iPosXAccion++;
		
		this.jPanelAccionesTelefonoReferencia.add(this.jButtonActualizarTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);


		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.gridy = 0;		
		this.gridBagConstraintsTelefonoReferencia.gridx = iPosXAccion++;
		
		this.jPanelAccionesTelefonoReferencia.add(this.jButtonGuardarCambiosTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);	
		
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.gridy = 0;		
		this.gridBagConstraintsTelefonoReferencia.gridx =iPosXAccion++;
		
		this.jPanelAccionesTelefonoReferencia.add(this.jButtonCancelarTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTelefonoReferencia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTelefonoReferencia);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();						
			this.gridBagConstraintsTelefonoReferencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTelefonoReferencia.gridx = 0;		
			//this.gridBagConstraintsTelefonoReferencia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTelefonoReferencia.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTelefonoReferencia.gridx =0;
		this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTelefonoReferencia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TelefonoReferenciaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTelefonoReferencia = new TelefonoReferenciaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Telefono Referencia DATOS");
			
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
			
	        //this.setTitle("[FOR] - Telefono Referencia DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Telefono Referencia Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TelefonoReferenciaModel telefonoreferenciaModel=new TelefonoReferenciaModel(this);
			
			//SI USARA CLASE INTERNA
			//TelefonoReferenciaModel.TelefonoReferenciaFocusTraversalPolicy telefonoreferenciaFocusTraversalPolicy = telefonoreferenciaModel.new TelefonoReferenciaFocusTraversalPolicy(this);
			
			//telefonoreferenciaFocusTraversalPolicy.settelefonoreferenciaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(telefonoreferenciaModel);
			
			
			this.jContentPaneDetalleTelefonoReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTelefonoReferencia = new GridBagLayout();	
			this.jContentPaneDetalleTelefonoReferencia.setLayout(gridaBagLayoutDetalleTelefonoReferencia);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTelefonoReferencia = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
				this.gridBagConstraintsTelefonoReferencia.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTelefonoReferencia.gridx = 0;
					
				
				this.jContentPaneDetalleTelefonoReferencia.add(jTtoolBarDetalleTelefonoReferencia, gridBagConstraintsTelefonoReferencia);								
				
}
			
			this.jScrollPanelDatosEdicionTelefonoReferencia=   new JScrollPane(jContentPaneDetalleTelefonoReferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTelefonoReferencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTelefonoReferencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTelefonoReferencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTelefonoReferencia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTelefonoReferencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTelefonoReferencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTelefonoReferencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTelefonoReferencia.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTelefonoReferencia.gridx = 0;
	        
			this.jContentPaneDetalleTelefonoReferencia.add(jPanelCamposTelefonoReferencia, gridBagConstraintsTelefonoReferencia);
			
			
			
			
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
						&& telefonoreferenciaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.telefonoreferenciaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTelefonoReferencia= new GridBagConstraints();
						this.gridBagConstraintsTelefonoReferencia.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTelefonoReferencia.gridx = 0;
						this.jContentPaneDetalleTelefonoReferencia.add(this.jTabbedPaneRelacionesTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTelefonoReferencia.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTelefonoReferencia.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
					this.gridBagConstraintsTelefonoReferencia.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTelefonoReferencia.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTelefonoReferencia.gridx = 0;
					
				
					this.jContentPaneDetalleTelefonoReferencia.add(jPanelCamposOcultosTelefonoReferencia, gridBagConstraintsTelefonoReferencia);
				
					this.jPanelCamposOcultosTelefonoReferencia.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTelefonoReferencia.gridx = 0;
	        this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTelefonoReferencia.add(this.jPanelAccionesFormularioTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);							
			
			
			
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
	        this.gridBagConstraintsTelefonoReferencia.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTelefonoReferencia.gridx = 0;
	        
			
			this.jContentPaneDetalleTelefonoReferencia.add(this.jPanelAccionesTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTelefonoReferencia);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTelefonoReferencia=   new JScrollPane(this.jPanelCamposTelefonoReferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTelefonoReferencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTelefonoReferencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTelefonoReferencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTelefonoReferencia.gridx = 0;
			this.gridBagConstraintsTelefonoReferencia.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTelefonoReferencia.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTelefonoReferencia.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTelefonoReferencia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);			
			
			this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
			this.gridBagConstraintsTelefonoReferencia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTelefonoReferencia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTelefonoReferencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
			
			
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTelefonoReferencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
		
			
		this.gridBagConstraintsTelefonoReferencia = new GridBagConstraints();
		this.gridBagConstraintsTelefonoReferencia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTelefonoReferencia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTelefonoReferencia, this.gridBagConstraintsTelefonoReferencia);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTelefonoReferencia;//jContentPane;
		
		return jScrollPanelDatosEdicionTelefonoReferencia;
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
