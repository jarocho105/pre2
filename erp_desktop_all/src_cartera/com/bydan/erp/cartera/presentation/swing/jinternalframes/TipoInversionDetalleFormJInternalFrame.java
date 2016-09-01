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
import com.bydan.erp.cartera.util.TipoInversionConstantesFunciones;

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
public class TipoInversionDetalleFormJInternalFrame extends TipoInversionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoInversion;
	
	protected JMenuBar jmenuBarDetalleTipoInversion;
	
	protected JMenu jmenuDetalleTipoInversion;
	protected JMenu jmenuDetalleArchivoTipoInversion;
	protected JMenu jmenuDetalleAccionesTipoInversion;
	protected JMenu jmenuDetalleDatosTipoInversion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoInversion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoInversion;	
	protected GridBagConstraints gridBagConstraintsTipoInversion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoInversionBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoInversion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoInversionSessionBean tipoinversionSessionBean;
	
	

	public AccionistaBeanSwingJInternalFrame accionistaBeanSwingJInternalFrame=null;
	public AccionistaBeanSwingJInternalFrame accionistaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteAccionista=false;
	public AccionistaSessionBean accionistaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoInversionLogic tipoinversionLogic;
	
	public JScrollPane jScrollPanelDatosTipoInversion;
	public JScrollPane jScrollPanelDatosEdicionTipoInversion;
	public JScrollPane jScrollPanelDatosGeneralTipoInversion;
	
	protected JPanel jPanelCamposTipoInversion;    
	protected JPanel jPanelCamposOcultosTipoInversion;    	
	protected JPanel jPanelAccionesTipoInversion;
	protected JPanel jPanelAccionesFormularioTipoInversion;
    
	
	
	protected Integer iXPanelCamposTipoInversion=0;
	protected Integer iYPanelCamposTipoInversion=0;
	
	protected Integer iXPanelCamposOcultosTipoInversion=0;
	protected Integer iYPanelCamposOcultosTipoInversion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoInversion;
	public JButton jButtonModificarTipoInversion;
	public JButton jButtonActualizarTipoInversion;
    public JButton jButtonEliminarTipoInversion;
	public JButton jButtonCancelarTipoInversion;
    public JButton jButtonGuardarCambiosTipoInversion;
	public JButton jButtonGuardarCambiosTablaTipoInversion;
	protected JButton jButtonCerrarTipoInversion;
	
	
	protected JButton jButtonProcesarInformacionTipoInversion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoInversion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoInversion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoInversion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoInversion;
	protected JButton jButtonModificarToolBarTipoInversion;
	protected JButton jButtonActualizarToolBarTipoInversion;
    protected JButton jButtonEliminarToolBarTipoInversion;
	protected JButton jButtonCancelarToolBarTipoInversion;
    protected JButton jButtonGuardarCambiosToolBarTipoInversion;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoInversion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoInversion;
	protected JButton jButtonCerrarToolBarTipoInversion;
	
	protected JButton jButtonProcesarInformacionToolBarTipoInversion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoInversion;
	protected JMenuItem jMenuItemModificarTipoInversion;
	protected JMenuItem jMenuItemActualizarTipoInversion;
    protected JMenuItem jMenuItemEliminarTipoInversion;
	protected JMenuItem jMenuItemCancelarTipoInversion;
    protected JMenuItem jMenuItemGuardarCambiosTipoInversion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoInversion;
	protected JMenuItem jMenuItemCerrarTipoInversion;
	protected JMenuItem jMenuItemDetalleCerrarTipoInversion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoInversion;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoInversion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoInversion;
	protected JMenuItem jMenuItemMostrarOcultarTipoInversion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoInversion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoInversion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoInversion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoInversion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoInversion;
	public JLabel jLabelIdTipoInversion;
	public JLabel jLabelidTipoInversion;
	public JButton jButtonidTipoInversionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoInversion;
	public JLabel jLabelcodigoTipoInversion;
	public JTextField jTextFieldcodigoTipoInversion;
	public JButton jButtoncodigoTipoInversionBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoInversion;
	public JLabel jLabelnombreTipoInversion;
	public JTextArea jTextAreanombreTipoInversion;
	public JScrollPane jscrollPanenombreTipoInversion;
	public JButton jButtonnombreTipoInversionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoInversion;
	public JLabel jLabelid_empresaTipoInversion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoInversion;
	public JButton jButtonid_empresaTipoInversion= new JButtonMe();
	public JButton jButtonid_empresaTipoInversionUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoInversionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoInversion;
	
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
	
	public TipoInversionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoInversion=new JPanel();
				this.jPanelAccionesFormularioTipoInversion=new JPanel();
				this.jmenuBarDetalleTipoInversion=new JMenuBar();
				this.jTtoolBarDetalleTipoInversion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInversionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoInversion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoInversionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoInversion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInversionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoInversion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInversionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoInversion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInversionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoInversion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoInversion() {
		return this.jButtonActualizarToolBarTipoInversion;
	}
	
	public JButton getjButtonEliminarToolBarTipoInversion() {
		return this.jButtonEliminarToolBarTipoInversion;
	}
	
	public JButton getjButtonCancelarToolBarTipoInversion() {
		return this.jButtonCancelarToolBarTipoInversion;
	}		
	
	public JButton getjButtonProcesarInformacionTipoInversion() {
		return this.jButtonProcesarInformacionTipoInversion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoInversion)	{
		this.jButtonProcesarInformacionTipoInversion = jButtonProcesarInformacionTipoInversion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoInversion() {
		return this.jComboBoxTiposAccionesTipoInversion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoInversion(
			JComboBox jComboBoxTiposRelacionesTipoInversion) {
		this.jComboBoxTiposRelacionesTipoInversion = jComboBoxTiposRelacionesTipoInversion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoInversion(
			JComboBox jComboBoxTiposAccionesTipoInversion) {
		this.jComboBoxTiposAccionesTipoInversion = jComboBoxTiposAccionesTipoInversion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoInversion() {
		return this.jComboBoxTiposAccionesFormularioTipoInversion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoInversion(
			JComboBox jComboBoxTiposAccionesFormularioTipoInversion) {
		this.jComboBoxTiposAccionesFormularioTipoInversion = jComboBoxTiposAccionesFormularioTipoInversion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoinversionSessionBean=new TipoInversionSessionBean();
		
		this.tipoinversionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoinversionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoinversionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.accionistaSessionBean=new AccionistaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoInversionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoInversionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoInversionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Inversion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoInversionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoInversion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoInversion=new JButtonMe();
				this.jButtonModificarToolBarTipoInversion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoInversion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoInversion,this.jTtoolBarDetalleTipoInversion,
							"actualizar","actualizar","Actualizar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoInversion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoInversion,this.jTtoolBarDetalleTipoInversion,
							"eliminar","eliminar","Eliminar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoInversion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoInversion,this.jTtoolBarDetalleTipoInversion,
							"cancelar","cancelar","Cancelar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoInversion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoInversion,this.jTtoolBarDetalleTipoInversion,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoInversion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoInversion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoInversion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoInversion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoInversion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoInversion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoInversion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoInversion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoInversion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoInversion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoInversion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoInversion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoInversion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoInversion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoInversion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoInversion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoInversion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoInversion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoInversion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoInversion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoInversion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoInversion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoInversion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoInversion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoInversion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoInversion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoInversion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoInversion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoInversion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoInversion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoInversion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoInversion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoInversion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoInversion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoInversion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoInversion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoInversion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoInversion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoInversion.add(this.jMenuItemDetalleCerrarTipoInversion);
		
		this.jmenuDetalleAccionesTipoInversion.add(this.jMenuItemActualizarTipoInversion);
		this.jmenuDetalleAccionesTipoInversion.add(this.jMenuItemEliminarTipoInversion);
		this.jmenuDetalleAccionesTipoInversion.add(this.jMenuItemCancelarTipoInversion);		
		
		//this.jmenuDetalleDatosTipoInversion.add(this.jMenuItemDetalleAbrirOrderByTipoInversion);				
		this.jmenuDetalleDatosTipoInversion.add(this.jMenuItemDetalleMostarOcultarTipoInversion);				
				
		//this.jmenuDetalleAccionesTipoInversion.add(this.jMenuItemGuardarCambiosTipoInversion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoInversion.add(this.jmenuDetalleArchivoTipoInversion);		
		this.jmenuBarDetalleTipoInversion.add(this.jmenuDetalleAccionesTipoInversion);		
		this.jmenuBarDetalleTipoInversion.add(this.jmenuDetalleDatosTipoInversion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoInversion.add(this.jmenuDetalleTipoInversion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoInversion);				
	}
	
	
	public void inicializarElementosCamposTipoInversion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoInversion = new JLabelMe();
		jLabelIdTipoInversion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoInversion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoInversion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoInversion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoInversion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoInversion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoInversion.setToolTipText(TipoInversionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoInversion= new GridBagLayout();

		this.jPanelidTipoInversion.setLayout(this.gridaBagLayoutTipoInversion);

		jLabelidTipoInversion = new JLabel();
		jLabelidTipoInversion.setText("Id");

		jLabelidTipoInversion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoInversion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoInversion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoInversion = new JLabelMe();
		this.jLabelcodigoTipoInversion.setText(""+TipoInversionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoInversion.setToolTipText("Codigo");
		this.jLabelcodigoTipoInversion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoInversion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoInversion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoInversion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoInversion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoInversion.setToolTipText(TipoInversionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoInversion = new GridBagLayout();
		this.jPanelcodigoTipoInversion.setLayout(this.gridaBagLayoutTipoInversion);


		jTextFieldcodigoTipoInversion= new JTextFieldMe();

		jTextFieldcodigoTipoInversion.setEnabled(false);
		jTextFieldcodigoTipoInversion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoInversion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoInversion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoInversion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoInversionBusqueda= new JButtonMe();
		this.jButtoncodigoTipoInversionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoInversionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoInversionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoInversionBusqueda.setText("U");
		this.jButtoncodigoTipoInversionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoInversionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoInversionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoInversion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoInversion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoInversionBusqueda"));

		if(this.tipoinversionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoInversionBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoInversion = new JLabelMe();
		this.jLabelnombreTipoInversion.setText(""+TipoInversionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoInversion.setToolTipText("Nombre");
		this.jLabelnombreTipoInversion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoInversion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoInversion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoInversion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoInversion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoInversion.setToolTipText(TipoInversionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoInversion = new GridBagLayout();
		this.jPanelnombreTipoInversion.setLayout(this.gridaBagLayoutTipoInversion);


		jTextAreanombreTipoInversion= new JTextAreaMe();
		jTextAreanombreTipoInversion.setEnabled(false);
		jTextAreanombreTipoInversion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoInversion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoInversion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoInversion.setLineWrap(true);
		jTextAreanombreTipoInversion.setWrapStyleWord(true);
		jTextAreanombreTipoInversion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoInversion.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoInversion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoInversion = new JScrollPane(jTextAreanombreTipoInversion);
		jscrollPanenombreTipoInversion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoInversion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoInversion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoInversionBusqueda= new JButtonMe();
		this.jButtonnombreTipoInversionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoInversionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoInversionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoInversionBusqueda.setText("U");
		this.jButtonnombreTipoInversionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoInversionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoInversionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoInversion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoInversion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoInversionBusqueda"));

		if(this.tipoinversionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoInversionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoInversion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoInversion = new JLabelMe();
		this.jLabelid_empresaTipoInversion.setText(""+TipoInversionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoInversion.setToolTipText("Empresa");
		this.jLabelid_empresaTipoInversion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoInversion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoInversion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoInversion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoInversion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoInversion.setToolTipText(TipoInversionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoInversion = new GridBagLayout();
		this.jPanelid_empresaTipoInversion.setLayout(this.gridaBagLayoutTipoInversion);


		jComboBoxid_empresaTipoInversion= new JComboBoxMe();
		jComboBoxid_empresaTipoInversion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoInversion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoInversion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoInversion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoInversion.setEnabled(false);

		this.jButtonid_empresaTipoInversion= new JButtonMe();
		this.jButtonid_empresaTipoInversion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoInversion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoInversion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoInversion.setText("Buscar");
		this.jButtonid_empresaTipoInversion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoInversion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoInversion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoInversion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoInversion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoInversion"));

		this.jButtonid_empresaTipoInversionBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoInversionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoInversionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoInversionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoInversionBusqueda.setText("U");
		this.jButtonid_empresaTipoInversionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoInversionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoInversionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoInversion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoInversion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoInversionBusqueda"));

		if(this.tipoinversionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoInversionBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoInversionUpdate= new JButtonMe();
		this.jButtonid_empresaTipoInversionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoInversionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoInversionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoInversionUpdate.setText("U");
		this.jButtonid_empresaTipoInversionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoInversionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoInversionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoInversion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoInversion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoInversionUpdate"));



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
		//this.jInternalFrameDetalleTipoInversion = new TipoInversionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Inversion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoInversion= new GridBagLayout();
		

		
		String sToolTipTipoInversion="";
		sToolTipTipoInversion=TipoInversionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoInversion+="(Cartera.TipoInversion)";
		}
		
		if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoInversion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoInversion = new JButtonMe();
		this.jButtonModificarTipoInversion = new JButtonMe();
        this.jButtonActualizarTipoInversion = new JButtonMe();
        this.jButtonEliminarTipoInversion = new JButtonMe();
        this.jButtonCancelarTipoInversion = new JButtonMe();
        this.jButtonGuardarCambiosTipoInversion = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoInversion = new JButtonMe();
		this.jButtonCerrarTipoInversion = new JButtonMe();
		
		this.jScrollPanelDatosTipoInversion = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoInversion = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoInversion = new JScrollPane();
				
		
		
		this.jPanelCamposTipoInversion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoInversion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoInversion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoInversion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Inversion";
		
		if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoInversion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Inversiones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoInversion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoInversion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoInversion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoInversion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoInversion.setName("jPanelCamposTipoInversion"); 

		this.jPanelCamposOcultosTipoInversion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoInversion.setName("jPanelCamposOcultosTipoInversion"); 

        this.jPanelAccionesTipoInversion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoInversion.setToolTipText("Acciones");
        this.jPanelAccionesTipoInversion.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoInversion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoInversion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoInversion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoInversion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoInversion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoInversion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoInversion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoInversion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoInversion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoInversion.setText("Nuevo");
		this.jButtonModificarTipoInversion.setText("Editar");
        this.jButtonActualizarTipoInversion.setText("Actualizar");
        this.jButtonEliminarTipoInversion.setText("Eliminar");
        this.jButtonCancelarTipoInversion.setText("Cancelar");
        this.jButtonGuardarCambiosTipoInversion.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoInversion.setText("Guardar");
		this.jButtonCerrarTipoInversion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoInversion,"nuevo_button","Nuevo",this.tipoinversionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoInversion,"modificar_button","Editar",this.tipoinversionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoInversion,"actualizar_button","Actualizar",this.tipoinversionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoInversion,"eliminar_button","Eliminar",this.tipoinversionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoInversion,"cancelar_button","Cancelar",this.tipoinversionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoInversion,"guardarcambios_button","Guardar",this.tipoinversionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoInversion,"guardarcambiostabla_button","Guardar",this.tipoinversionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoInversion,"cerrar_button","Salir",this.tipoinversionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoInversion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoInversion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoInversion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoInversion.setToolTipText("Nuevo"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoInversion.setToolTipText("Editar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoInversion.setToolTipText("Actualizar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoInversion.setToolTipText("Eliminar)"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoInversion.setToolTipText("Cancelar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoInversion.setToolTipText("Guardar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoInversion.setToolTipText("Guardar"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoInversion.setToolTipText("Salir"+" "+TipoInversionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoInversion";
		inputMap = this.jButtonNuevoTipoInversion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoInversion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoInversion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoInversion";
		inputMap = this.jButtonActualizarTipoInversion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoInversion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoInversion"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoInversion";
		inputMap = this.jButtonEliminarTipoInversion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoInversion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoInversion"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoInversion";
		inputMap = this.jButtonCancelarTipoInversion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoInversion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoInversion"));
		
		//CERRAR		
		sMapKey = "CerrarTipoInversion";
		inputMap = this.jButtonCerrarTipoInversion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoInversion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoInversion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoInversion";
		inputMap = this.jButtonGuardarCambiosTablaTipoInversion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoInversion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoInversion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoInversion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoInversion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoInversion.setToolTipText("Nuevo TipoInversion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoInversion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoInversion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoInversion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoInversion.setToolTipText("Sin Cerrar Ventana TipoInversion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoInversion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoInversion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoInversion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoInversion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoInversion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoInversion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoInversion.setText("Accion");
		this.jComboBoxTiposAccionesTipoInversion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoInversion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoInversion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoInversion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoInversion = new JLabelMe();
		
		this.jLabelAccionesTipoInversion.setText("Acciones");		
		this.jLabelAccionesTipoInversion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoInversion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoInversion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoInversion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoInversion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoInversion=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoInversion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoInversion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoInversion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoInversion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoInversion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoInversion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoInversion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoInversion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoInversion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoInversion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoInversion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoInversion = new GridBagLayout();
		
		this.jPanelCamposTipoInversion.setLayout(gridaBagLayoutCamposTipoInversion);
		this.jPanelCamposOcultosTipoInversion.setLayout(gridaBagLayoutCamposOcultosTipoInversion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoInversion = new GridBagConstraints();
	this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInversion.gridy = 0;
	this.gridBagConstraintsTipoInversion.gridx = 0;
	this.gridBagConstraintsTipoInversion.ipadx = 0;
	this.gridBagConstraintsTipoInversion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoInversion.add(jLabelIdTipoInversion, this.gridBagConstraintsTipoInversion);



	this.gridBagConstraintsTipoInversion = new GridBagConstraints();
	this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInversion.gridy = 0;
	this.gridBagConstraintsTipoInversion.gridx = 1;
	this.gridBagConstraintsTipoInversion.ipadx = 0;
	this.gridBagConstraintsTipoInversion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoInversion.add(jLabelidTipoInversion, this.gridBagConstraintsTipoInversion);


	this.gridBagConstraintsTipoInversion = new GridBagConstraints();
	this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInversion.gridy = 0;
	this.gridBagConstraintsTipoInversion.gridx = 0;
	this.gridBagConstraintsTipoInversion.ipadx = 0;
	this.gridBagConstraintsTipoInversion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoInversion.add(jLabelid_empresaTipoInversion, this.gridBagConstraintsTipoInversion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		//this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInversion.gridy = 0;
		this.gridBagConstraintsTipoInversion.gridx = 2;
		this.gridBagConstraintsTipoInversion.ipadx = 0;
		this.gridBagConstraintsTipoInversion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoInversion.add(jButtonid_empresaTipoInversionBusqueda, this.gridBagConstraintsTipoInversion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		//this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInversion.gridy = 0;
		this.gridBagConstraintsTipoInversion.gridx = 3;
		this.gridBagConstraintsTipoInversion.ipadx = 0;
		this.gridBagConstraintsTipoInversion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoInversion.add(jButtonid_empresaTipoInversionUpdate, this.gridBagConstraintsTipoInversion);
	}

	this.gridBagConstraintsTipoInversion = new GridBagConstraints();
	this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInversion.gridy = 0;
	this.gridBagConstraintsTipoInversion.gridx = 1;
	this.gridBagConstraintsTipoInversion.ipadx = 0;
	this.gridBagConstraintsTipoInversion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoInversion.add(jComboBoxid_empresaTipoInversion, this.gridBagConstraintsTipoInversion);


	this.gridBagConstraintsTipoInversion = new GridBagConstraints();
	this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInversion.gridy = 0;
	this.gridBagConstraintsTipoInversion.gridx = 0;
	this.gridBagConstraintsTipoInversion.ipadx = 0;
	this.gridBagConstraintsTipoInversion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoInversion.add(jLabelcodigoTipoInversion, this.gridBagConstraintsTipoInversion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		//this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInversion.gridy = 0;
		this.gridBagConstraintsTipoInversion.gridx = 2;
		this.gridBagConstraintsTipoInversion.ipadx = 0;
		this.gridBagConstraintsTipoInversion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoInversion.add(jButtoncodigoTipoInversionBusqueda, this.gridBagConstraintsTipoInversion);
	}

	this.gridBagConstraintsTipoInversion = new GridBagConstraints();
	this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInversion.gridy = 0;
	this.gridBagConstraintsTipoInversion.gridx = 1;
	this.gridBagConstraintsTipoInversion.ipadx = 0;
	this.gridBagConstraintsTipoInversion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoInversion.add(jTextFieldcodigoTipoInversion, this.gridBagConstraintsTipoInversion);


	this.gridBagConstraintsTipoInversion = new GridBagConstraints();
	this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInversion.gridy = 0;
	this.gridBagConstraintsTipoInversion.gridx = 0;
	this.gridBagConstraintsTipoInversion.ipadx = 0;
	this.gridBagConstraintsTipoInversion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoInversion.add(jLabelnombreTipoInversion, this.gridBagConstraintsTipoInversion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		//this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInversion.gridy = 0;
		this.gridBagConstraintsTipoInversion.gridx = 2;
		this.gridBagConstraintsTipoInversion.ipadx = 0;
		this.gridBagConstraintsTipoInversion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoInversion.add(jButtonnombreTipoInversionBusqueda, this.gridBagConstraintsTipoInversion);
	}

	this.gridBagConstraintsTipoInversion = new GridBagConstraints();
	this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInversion.gridy = 0;
	this.gridBagConstraintsTipoInversion.gridx = 1;
	this.gridBagConstraintsTipoInversion.ipadx = 0;
	this.gridBagConstraintsTipoInversion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoInversion.add(jscrollPanenombreTipoInversion, this.gridBagConstraintsTipoInversion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoInversion = new GridBagConstraints();
	this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoInversion.gridy = iYPanelCamposTipoInversion;
	this.gridBagConstraintsTipoInversion.gridx = iXPanelCamposTipoInversion++;
	this.gridBagConstraintsTipoInversion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoInversion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoInversion.add(this.jPanelidTipoInversion, this.gridBagConstraintsTipoInversion);



	if(iXPanelCamposTipoInversion % 1==0) {
		iXPanelCamposTipoInversion=0;
		iYPanelCamposTipoInversion++;
	}
	this.gridBagConstraintsTipoInversion = new GridBagConstraints();
	this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoInversion.gridy = iYPanelCamposTipoInversion;
	this.gridBagConstraintsTipoInversion.gridx = iXPanelCamposTipoInversion++;
	this.gridBagConstraintsTipoInversion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoInversion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoInversion.add(this.jPanelcodigoTipoInversion, this.gridBagConstraintsTipoInversion);



	if(iXPanelCamposTipoInversion % 1==0) {
		iXPanelCamposTipoInversion=0;
		iYPanelCamposTipoInversion++;
	}
	this.gridBagConstraintsTipoInversion = new GridBagConstraints();
	this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoInversion.gridy = iYPanelCamposTipoInversion;
	this.gridBagConstraintsTipoInversion.gridx = iXPanelCamposTipoInversion++;
	this.gridBagConstraintsTipoInversion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoInversion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoInversion.add(this.jPanelnombreTipoInversion, this.gridBagConstraintsTipoInversion);



	if(iXPanelCamposTipoInversion % 1==0) {
		iXPanelCamposTipoInversion=0;
		iYPanelCamposTipoInversion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoInversion = new GridBagConstraints();
	this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoInversion.gridy = iYPanelCamposOcultosTipoInversion;
	this.gridBagConstraintsTipoInversion.gridx = iXPanelCamposOcultosTipoInversion++;
	this.gridBagConstraintsTipoInversion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoInversion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoInversion.add(this.jPanelid_empresaTipoInversion, this.gridBagConstraintsTipoInversion);



	if(iXPanelCamposOcultosTipoInversion % 1==0) {
		iXPanelCamposOcultosTipoInversion=0;
		iYPanelCamposOcultosTipoInversion++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoInversion= new GridBagLayout();
		this.jPanelAccionesTipoInversion.setLayout(gridaBagLayoutAccionesTipoInversion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoInversion= new GridBagLayout();
		this.jPanelAccionesFormularioTipoInversion.setLayout(gridaBagLayoutAccionesFormularioTipoInversion);
		
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoInversion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoInversion.add(this.jComboBoxTiposAccionesFormularioTipoInversion, this.gridBagConstraintsTipoInversion);

		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoInversion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoInversion.add(this.jCheckBoxPostAccionNuevoTipoInversion, this.gridBagConstraintsTipoInversion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoinversionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoInversion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoInversion.add(this.jCheckBoxPostAccionSinCerrarTipoInversion, this.gridBagConstraintsTipoInversion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoinversionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoInversion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoInversion.add(this.jCheckBoxPostAccionSinMensajeTipoInversion, this.gridBagConstraintsTipoInversion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInversion.gridy = 0;
		this.gridBagConstraintsTipoInversion.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoInversion.add(this.jButtonModificarTipoInversion, this.gridBagConstraintsTipoInversion);							

		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInversion.gridy = 0;
		this.gridBagConstraintsTipoInversion.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoInversion.add(this.jButtonEliminarTipoInversion, this.gridBagConstraintsTipoInversion);
		
			
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.gridy = 0;		
		this.gridBagConstraintsTipoInversion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoInversion.add(this.jButtonActualizarTipoInversion, this.gridBagConstraintsTipoInversion);


		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.gridy = 0;		
		this.gridBagConstraintsTipoInversion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoInversion.add(this.jButtonGuardarCambiosTipoInversion, this.gridBagConstraintsTipoInversion);	
		
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.gridy = 0;		
		this.gridBagConstraintsTipoInversion.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoInversion.add(this.jButtonCancelarTipoInversion, this.gridBagConstraintsTipoInversion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoInversion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoInversion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoinversionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();						
			this.gridBagConstraintsTipoInversion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoInversion.gridx = 0;		
			//this.gridBagConstraintsTipoInversion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoInversion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoInversion.gridx =0;
		this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoInversion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoInversion, this.gridBagConstraintsTipoInversion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoInversionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoInversion = new TipoInversionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Inversion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Inversion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Inversion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoInversionModel tipoinversionModel=new TipoInversionModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoInversionModel.TipoInversionFocusTraversalPolicy tipoinversionFocusTraversalPolicy = tipoinversionModel.new TipoInversionFocusTraversalPolicy(this);
			
			//tipoinversionFocusTraversalPolicy.settipoinversionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoinversionModel);
			
			
			this.jContentPaneDetalleTipoInversion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoInversion = new GridBagLayout();	
			this.jContentPaneDetalleTipoInversion.setLayout(gridaBagLayoutDetalleTipoInversion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoInversion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoInversion = new GridBagConstraints();
				this.gridBagConstraintsTipoInversion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoInversion.gridx = 0;
					
				
				this.jContentPaneDetalleTipoInversion.add(jTtoolBarDetalleTipoInversion, gridBagConstraintsTipoInversion);								
				
}
			
			this.jScrollPanelDatosEdicionTipoInversion=   new JScrollPane(jContentPaneDetalleTipoInversion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoInversion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoInversion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoInversion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoInversion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoInversion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoInversion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoInversion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoInversion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoInversion.gridx = 0;
	        
			this.jContentPaneDetalleTipoInversion.add(jPanelCamposTipoInversion, gridBagConstraintsTipoInversion);
			
			
			
			
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
						&& tipoinversionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameAccionista(this.puedeCargarPorParteAccionista,false,-1);
					
					if(this.tipoinversionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoInversion= new GridBagConstraints();
						this.gridBagConstraintsTipoInversion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoInversion.gridx = 0;
						this.jContentPaneDetalleTipoInversion.add(this.jTabbedPaneRelacionesTipoInversion, this.gridBagConstraintsTipoInversion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoInversion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameAccionista(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoInversion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoInversion = new GridBagConstraints();
					this.gridBagConstraintsTipoInversion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoInversion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoInversion.gridx = 0;
					
				
					this.jContentPaneDetalleTipoInversion.add(jPanelCamposOcultosTipoInversion, gridBagConstraintsTipoInversion);
				
					this.jPanelCamposOcultosTipoInversion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoInversion.gridx = 0;
	        this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoInversion.add(this.jPanelAccionesFormularioTipoInversion, this.gridBagConstraintsTipoInversion);							
			
			
			
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
	        this.gridBagConstraintsTipoInversion.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoInversion.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoInversion.add(this.jPanelAccionesTipoInversion, this.gridBagConstraintsTipoInversion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoInversion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoInversion=   new JScrollPane(this.jPanelCamposTipoInversion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoInversion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoInversion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoInversion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoInversion.gridx = 0;
			this.gridBagConstraintsTipoInversion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoInversion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoInversion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoInversion, this.gridBagConstraintsTipoInversion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoInversion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoInversion, this.gridBagConstraintsTipoInversion);			
			
			this.gridBagConstraintsTipoInversion = new GridBagConstraints();
			this.gridBagConstraintsTipoInversion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoInversion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoInversion, this.gridBagConstraintsTipoInversion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInversion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoInversion, this.gridBagConstraintsTipoInversion);
			
			
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInversion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoInversion, this.gridBagConstraintsTipoInversion);
		
			
		this.gridBagConstraintsTipoInversion = new GridBagConstraints();
		this.gridBagConstraintsTipoInversion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoInversion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoInversion, this.gridBagConstraintsTipoInversion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoInversion;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoInversion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameAccionista(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.accionistaSessionBean=new AccionistaSessionBean();
		this.accionistaSessionBean.setConGuardarRelaciones(false);
		this.accionistaSessionBean.setEsGuardarRelacionado(true);

		this.accionistaBeanSwingJInternalFrame=null;//new AccionistaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.accionistaBeanSwingJInternalFramePopup=new AccionistaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.accionistaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.accionistaSessionBean.getEsGuardarRelacionado()) {

				AccionistaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoInversionJInternalFrame.STIPO_TAMANIO_GENERAL;
				AccionistaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoInversionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.accionistaSessionBean.setEsGuardarRelacionado(true);

				this.accionistaBeanSwingJInternalFrame=new AccionistaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.accionistaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.accionistaBeanSwingJInternalFrame.setaccionistaSessionBean(this.accionistaSessionBean);

				//this.gridBagConstraintsTipoInversion = new GridBagConstraints();
				//this.gridBagConstraintsTipoInversion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoInversion.gridx = 0;
				//this.jContentPaneDetalleTipoInversion.add(this.accionistaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoInversion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoInversion.add("Accionistas",this.accionistaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoInversion.setComponentAt(iIndexTab,this.accionistaBeanSwingJInternalFrame.getContentPane());
				}

				//AccionistaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.accionistaSessionBean.setEsGuardarRelacionado(false);
				this.accionistaBeanSwingJInternalFrame=null;//new AccionistaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.accionistaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteAccionista) {
					this.jTabbedPaneRelacionesTipoInversion.add("Accionistas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarAccionistaBeanSwingJInternalFrame(List<TipoInversion> tipoinversions,TipoInversion tipoinversion,AccionistaBeanSwingJInternalFrame accionistaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//accionistaBeanSwingJInternalFrame=new AccionistaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					accionistaBeanSwingJInternalFrame.getAccionistaLogic().setConnexion(this.tipoinversionLogic.getConnexion());

					accionistaBeanSwingJInternalFrame.settipoinversionsForeignKey(tipoinversions);
					accionistaBeanSwingJInternalFrame.settipoinversionForeignKey(tipoinversion);
					accionistaBeanSwingJInternalFrame.accionistaSessionBean.setisBusquedaDesdeForeignKeySesionTipoInversion(true);
					accionistaBeanSwingJInternalFrame.accionistaSessionBean.setlidTipoInversionActual(tipoinversion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					accionistaBeanSwingJInternalFrame.cargarCombosForeignKeyAccionista(accionistaBeanSwingJInternalFrame.isCargarCombosDependencia);
					accionistaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoInversion(true);
					accionistaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					accionistaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoInversion");
					accionistaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoInversion");
					accionistaBeanSwingJInternalFrame.inicializarActualizarBindingTablaAccionista(true);
					accionistaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesAccionista("n",accionistaBeanSwingJInternalFrame.isGuardarCambiosEnLote, accionistaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					accionistaBeanSwingJInternalFrame.setAutoscrolls(true);
					accionistaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						accionistaBeanSwingJInternalFrame.actualizarEstadoPanelsAccionista("relacionado");
					} else {
						accionistaBeanSwingJInternalFrame.actualizarEstadoPanelsAccionista("no_relacionado");
					}

					accionistaBeanSwingJInternalFrame.getjButtonRecargarInformacionAccionista().setVisible(false);

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
