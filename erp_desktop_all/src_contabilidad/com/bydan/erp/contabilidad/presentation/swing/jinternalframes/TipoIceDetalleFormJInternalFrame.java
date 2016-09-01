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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;



import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.TipoIceConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class TipoIceDetalleFormJInternalFrame extends TipoIceBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoIce;
	
	protected JMenuBar jmenuBarDetalleTipoIce;
	
	protected JMenu jmenuDetalleTipoIce;
	protected JMenu jmenuDetalleArchivoTipoIce;
	protected JMenu jmenuDetalleAccionesTipoIce;
	protected JMenu jmenuDetalleDatosTipoIce;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoIce = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoIce;	
	protected GridBagConstraints gridBagConstraintsTipoIce;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoIceBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoIce;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoIceSessionBean tipoiceSessionBean;
	
	
	
		
	
	public TipoIceLogic tipoiceLogic;
	
	public JScrollPane jScrollPanelDatosTipoIce;
	public JScrollPane jScrollPanelDatosEdicionTipoIce;
	public JScrollPane jScrollPanelDatosGeneralTipoIce;
	
	protected JPanel jPanelCamposTipoIce;    
	protected JPanel jPanelCamposOcultosTipoIce;    	
	protected JPanel jPanelAccionesTipoIce;
	protected JPanel jPanelAccionesFormularioTipoIce;
    
	
	
	protected Integer iXPanelCamposTipoIce=0;
	protected Integer iYPanelCamposTipoIce=0;
	
	protected Integer iXPanelCamposOcultosTipoIce=0;
	protected Integer iYPanelCamposOcultosTipoIce=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoIce;
	public JButton jButtonModificarTipoIce;
	public JButton jButtonActualizarTipoIce;
    public JButton jButtonEliminarTipoIce;
	public JButton jButtonCancelarTipoIce;
    public JButton jButtonGuardarCambiosTipoIce;
	public JButton jButtonGuardarCambiosTablaTipoIce;
	protected JButton jButtonCerrarTipoIce;
	
	
	protected JButton jButtonProcesarInformacionTipoIce;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoIce;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoIce;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoIce;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoIce;
	protected JButton jButtonModificarToolBarTipoIce;
	protected JButton jButtonActualizarToolBarTipoIce;
    protected JButton jButtonEliminarToolBarTipoIce;
	protected JButton jButtonCancelarToolBarTipoIce;
    protected JButton jButtonGuardarCambiosToolBarTipoIce;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoIce;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoIce;
	protected JButton jButtonCerrarToolBarTipoIce;
	
	protected JButton jButtonProcesarInformacionToolBarTipoIce;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoIce;
	protected JMenuItem jMenuItemModificarTipoIce;
	protected JMenuItem jMenuItemActualizarTipoIce;
    protected JMenuItem jMenuItemEliminarTipoIce;
	protected JMenuItem jMenuItemCancelarTipoIce;
    protected JMenuItem jMenuItemGuardarCambiosTipoIce;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoIce;
	protected JMenuItem jMenuItemCerrarTipoIce;
	protected JMenuItem jMenuItemDetalleCerrarTipoIce;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoIce;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoIce;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoIce;
	protected JMenuItem jMenuItemMostrarOcultarTipoIce;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoIce;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoIce;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoIce;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoIce;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoIce;
	public JLabel jLabelIdTipoIce;
	public JTextFieldMe jTextFieldidTipoIce;
	public JButton jButtonidTipoIceBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoIce;
	public JLabel jLabelnombreTipoIce;
	public JTextArea jTextAreanombreTipoIce;
	public JScrollPane jscrollPanenombreTipoIce;
	public JButton jButtonnombreTipoIceBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeTipoIce;
	public JLabel jLabelporcentajeTipoIce;
	public JTextField jTextFieldporcentajeTipoIce;
	public JButton jButtonporcentajeTipoIceBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoIce;
	
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
	
	public TipoIceDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoIce=new JPanel();
				this.jPanelAccionesFormularioTipoIce=new JPanel();
				this.jmenuBarDetalleTipoIce=new JMenuBar();
				this.jTtoolBarDetalleTipoIce=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIceDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoIce No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoIceDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoIce No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIceDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoIce No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIceDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoIce No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIceDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoIce No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoIce() {
		return this.jButtonActualizarToolBarTipoIce;
	}
	
	public JButton getjButtonEliminarToolBarTipoIce() {
		return this.jButtonEliminarToolBarTipoIce;
	}
	
	public JButton getjButtonCancelarToolBarTipoIce() {
		return this.jButtonCancelarToolBarTipoIce;
	}		
	
	public JButton getjButtonProcesarInformacionTipoIce() {
		return this.jButtonProcesarInformacionTipoIce;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoIce)	{
		this.jButtonProcesarInformacionTipoIce = jButtonProcesarInformacionTipoIce;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoIce() {
		return this.jComboBoxTiposAccionesTipoIce;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoIce(
			JComboBox jComboBoxTiposRelacionesTipoIce) {
		this.jComboBoxTiposRelacionesTipoIce = jComboBoxTiposRelacionesTipoIce;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoIce(
			JComboBox jComboBoxTiposAccionesTipoIce) {
		this.jComboBoxTiposAccionesTipoIce = jComboBoxTiposAccionesTipoIce;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoIce() {
		return this.jComboBoxTiposAccionesFormularioTipoIce;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoIce(
			JComboBox jComboBoxTiposAccionesFormularioTipoIce) {
		this.jComboBoxTiposAccionesFormularioTipoIce = jComboBoxTiposAccionesFormularioTipoIce;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoiceSessionBean=new TipoIceSessionBean();
		
		this.tipoiceSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoiceSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoiceSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoIceJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoIceJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoIceJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Ice MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoiceSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoIceJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoIce= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoIce=new JButtonMe();
				this.jButtonModificarToolBarTipoIce=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoIce=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoIce,this.jTtoolBarDetalleTipoIce,
							"actualizar","actualizar","Actualizar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoIce=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoIce,this.jTtoolBarDetalleTipoIce,
							"eliminar","eliminar","Eliminar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoIce=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoIce,this.jTtoolBarDetalleTipoIce,
							"cancelar","cancelar","Cancelar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoIce=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoIce,this.jTtoolBarDetalleTipoIce,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoIce,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoIce,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoIce,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoIce=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoIce=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoIce=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoIce=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoIce=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoIce= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoIce.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoIce,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoIce= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoIce.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoIce,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoIce= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoIce.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoIce,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoIce= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoIce.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoIce,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoIce= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoIce.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoIce,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoIce= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoIce.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoIce,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoIce= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoIce.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoIce,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoIce= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoIce.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoIce,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoIce= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoIce.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoIce,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoIce= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoIce.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoIce,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoIce.add(this.jMenuItemDetalleCerrarTipoIce);
		
		this.jmenuDetalleAccionesTipoIce.add(this.jMenuItemActualizarTipoIce);
		this.jmenuDetalleAccionesTipoIce.add(this.jMenuItemEliminarTipoIce);
		this.jmenuDetalleAccionesTipoIce.add(this.jMenuItemCancelarTipoIce);		
		
		//this.jmenuDetalleDatosTipoIce.add(this.jMenuItemDetalleAbrirOrderByTipoIce);				
		this.jmenuDetalleDatosTipoIce.add(this.jMenuItemDetalleMostarOcultarTipoIce);				
				
		//this.jmenuDetalleAccionesTipoIce.add(this.jMenuItemGuardarCambiosTipoIce);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoIce.add(this.jmenuDetalleArchivoTipoIce);		
		this.jmenuBarDetalleTipoIce.add(this.jmenuDetalleAccionesTipoIce);		
		this.jmenuBarDetalleTipoIce.add(this.jmenuDetalleDatosTipoIce);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoIce);				
	}
	
	
	public void inicializarElementosCamposTipoIce() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoIce = new JLabelMe();
		jLabelIdTipoIce.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoIce.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoIce.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoIce.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoIce,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoIce = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoIce.setToolTipText(TipoIceConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoIce= new GridBagLayout();

		this.jPanelidTipoIce.setLayout(this.gridaBagLayoutTipoIce);

		jTextFieldidTipoIce = new JTextFieldMe();
		jTextFieldidTipoIce.setText("Id");

		jTextFieldidTipoIce.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoIce.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoIce.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoIce = new JLabelMe();
		this.jLabelnombreTipoIce.setText(""+TipoIceConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoIce.setToolTipText("Nombre");
		this.jLabelnombreTipoIce.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoIce.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoIce.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoIce,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoIce=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoIce.setToolTipText(TipoIceConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoIce = new GridBagLayout();
		this.jPanelnombreTipoIce.setLayout(this.gridaBagLayoutTipoIce);


		jTextAreanombreTipoIce= new JTextAreaMe();
		jTextAreanombreTipoIce.setEnabled(false);
		jTextAreanombreTipoIce.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoIce.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoIce.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoIce.setLineWrap(true);
		jTextAreanombreTipoIce.setWrapStyleWord(true);
		jTextAreanombreTipoIce.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoIce.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoIce,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoIce = new JScrollPane(jTextAreanombreTipoIce);
		jscrollPanenombreTipoIce.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoIce.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoIce.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));

		this.jButtonnombreTipoIceBusqueda= new JButtonMe();
		this.jButtonnombreTipoIceBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoIceBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoIceBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoIceBusqueda.setText("U");
		this.jButtonnombreTipoIceBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoIceBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoIceBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoIce.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoIce.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoIceBusqueda"));

		if(this.tipoiceSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoIceBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeTipoIce = new JLabelMe();
		this.jLabelporcentajeTipoIce.setText(""+TipoIceConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeTipoIce.setToolTipText("Porcentaje");
		this.jLabelporcentajeTipoIce.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeTipoIce.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeTipoIce.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeTipoIce,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeTipoIce=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeTipoIce.setToolTipText(TipoIceConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutTipoIce = new GridBagLayout();
		this.jPanelporcentajeTipoIce.setLayout(this.gridaBagLayoutTipoIce);


		jTextFieldporcentajeTipoIce= new JTextFieldMe();
		jTextFieldporcentajeTipoIce.setEnabled(false);
		jTextFieldporcentajeTipoIce.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeTipoIce.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeTipoIce.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeTipoIce,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeTipoIce.setText("0.0");

		this.jButtonporcentajeTipoIceBusqueda= new JButtonMe();
		this.jButtonporcentajeTipoIceBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeTipoIceBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeTipoIceBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeTipoIceBusqueda.setText("U");
		this.jButtonporcentajeTipoIceBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeTipoIceBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeTipoIceBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeTipoIce.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeTipoIce.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeTipoIceBusqueda"));

		if(this.tipoiceSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeTipoIceBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoIce() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
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
		//this.jInternalFrameDetalleTipoIce = new TipoIceBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Ice DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoIce= new GridBagLayout();
		

		
		String sToolTipTipoIce="";
		sToolTipTipoIce=TipoIceConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoIce+="(Contabilidad.TipoIce)";
		}
		
		if(!this.tipoiceSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoIce+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoIce = new JButtonMe();
		this.jButtonModificarTipoIce = new JButtonMe();
        this.jButtonActualizarTipoIce = new JButtonMe();
        this.jButtonEliminarTipoIce = new JButtonMe();
        this.jButtonCancelarTipoIce = new JButtonMe();
        this.jButtonGuardarCambiosTipoIce = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoIce = new JButtonMe();
		this.jButtonCerrarTipoIce = new JButtonMe();
		
		this.jScrollPanelDatosTipoIce = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoIce = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoIce = new JScrollPane();
				
		
		
		this.jPanelCamposTipoIce = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoIce = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoIce = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoIce = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Ice";
		
		if(!this.tipoiceSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ices" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoIce.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoIce.setName("jPanelCamposTipoIce"); 

		this.jPanelCamposOcultosTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoIce.setName("jPanelCamposOcultosTipoIce"); 

        this.jPanelAccionesTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoIce.setToolTipText("Acciones");
        this.jPanelAccionesTipoIce.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoIce.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoIce.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoIce, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoIce, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoIce, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoIce, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoIce, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoIce, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoIce.setText("Nuevo");
		this.jButtonModificarTipoIce.setText("Editar");
        this.jButtonActualizarTipoIce.setText("Actualizar");
        this.jButtonEliminarTipoIce.setText("Eliminar");
        this.jButtonCancelarTipoIce.setText("Cancelar");
        this.jButtonGuardarCambiosTipoIce.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoIce.setText("Guardar");
		this.jButtonCerrarTipoIce.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoIce,"nuevo_button","Nuevo",this.tipoiceSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoIce,"modificar_button","Editar",this.tipoiceSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoIce,"actualizar_button","Actualizar",this.tipoiceSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoIce,"eliminar_button","Eliminar",this.tipoiceSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoIce,"cancelar_button","Cancelar",this.tipoiceSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoIce,"guardarcambios_button","Guardar",this.tipoiceSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoIce,"guardarcambiostabla_button","Guardar",this.tipoiceSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoIce,"cerrar_button","Salir",this.tipoiceSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoIce, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoIce, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoIce, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoIce.setToolTipText("Nuevo"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoIce.setToolTipText("Editar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoIce.setToolTipText("Actualizar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoIce.setToolTipText("Eliminar)"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoIce.setToolTipText("Cancelar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoIce.setToolTipText("Guardar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoIce.setToolTipText("Guardar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoIce.setToolTipText("Salir"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoIce";
		inputMap = this.jButtonNuevoTipoIce.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoIce.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoIce"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoIce";
		inputMap = this.jButtonActualizarTipoIce.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoIce.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoIce"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoIce";
		inputMap = this.jButtonEliminarTipoIce.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoIce.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoIce"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoIce";
		inputMap = this.jButtonCancelarTipoIce.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoIce.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoIce"));
		
		//CERRAR		
		sMapKey = "CerrarTipoIce";
		inputMap = this.jButtonCerrarTipoIce.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoIce.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoIce"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoIce";
		inputMap = this.jButtonGuardarCambiosTablaTipoIce.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoIce.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoIce"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoIce = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoIce.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoIce.setToolTipText("Nuevo TipoIce");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoIce, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoIce = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoIce.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoIce.setToolTipText("Sin Cerrar Ventana TipoIce");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoIce, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoIce = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoIce.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoIce.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoIce, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoIce = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoIce.setText("Accion");
		this.jComboBoxTiposAccionesTipoIce.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoIce = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoIce.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoIce.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoIce = new JLabelMe();
		
		this.jLabelAccionesTipoIce.setText("Acciones");		
		this.jLabelAccionesTipoIce.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoIce.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoIce.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoIce();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoIce();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoIce=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoIce,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoIce.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoIce.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoIce.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoIce.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoIce.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoIce.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoIce, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoIce = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoIce = new GridBagLayout();
		
		this.jPanelCamposTipoIce.setLayout(gridaBagLayoutCamposTipoIce);
		this.jPanelCamposOcultosTipoIce.setLayout(gridaBagLayoutCamposOcultosTipoIce);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoIce = new GridBagConstraints();
	this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIce.gridy = 0;
	this.gridBagConstraintsTipoIce.gridx = 0;
	this.gridBagConstraintsTipoIce.ipadx = 0;
	this.gridBagConstraintsTipoIce.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoIce.add(jLabelIdTipoIce, this.gridBagConstraintsTipoIce);



	this.gridBagConstraintsTipoIce = new GridBagConstraints();
	this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIce.gridy = 0;
	this.gridBagConstraintsTipoIce.gridx = 1;
	this.gridBagConstraintsTipoIce.ipadx = 0;
	this.gridBagConstraintsTipoIce.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoIce.add(jTextFieldidTipoIce, this.gridBagConstraintsTipoIce);


	this.gridBagConstraintsTipoIce = new GridBagConstraints();
	this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIce.gridy = 0;
	this.gridBagConstraintsTipoIce.gridx = 0;
	this.gridBagConstraintsTipoIce.ipadx = 0;
	this.gridBagConstraintsTipoIce.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoIce.add(jLabelnombreTipoIce, this.gridBagConstraintsTipoIce);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		//this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIce.gridy = 0;
		this.gridBagConstraintsTipoIce.gridx = 2;
		this.gridBagConstraintsTipoIce.ipadx = 0;
		this.gridBagConstraintsTipoIce.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoIce.add(jButtonnombreTipoIceBusqueda, this.gridBagConstraintsTipoIce);
	}

	this.gridBagConstraintsTipoIce = new GridBagConstraints();
	this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIce.gridy = 0;
	this.gridBagConstraintsTipoIce.gridx = 1;
	this.gridBagConstraintsTipoIce.ipadx = 0;
	this.gridBagConstraintsTipoIce.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoIce.add(jscrollPanenombreTipoIce, this.gridBagConstraintsTipoIce);


	this.gridBagConstraintsTipoIce = new GridBagConstraints();
	this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIce.gridy = 0;
	this.gridBagConstraintsTipoIce.gridx = 0;
	this.gridBagConstraintsTipoIce.ipadx = 0;
	this.gridBagConstraintsTipoIce.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeTipoIce.add(jLabelporcentajeTipoIce, this.gridBagConstraintsTipoIce);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		//this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIce.gridy = 0;
		this.gridBagConstraintsTipoIce.gridx = 2;
		this.gridBagConstraintsTipoIce.ipadx = 0;
		this.gridBagConstraintsTipoIce.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeTipoIce.add(jButtonporcentajeTipoIceBusqueda, this.gridBagConstraintsTipoIce);
	}

	this.gridBagConstraintsTipoIce = new GridBagConstraints();
	this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIce.gridy = 0;
	this.gridBagConstraintsTipoIce.gridx = 1;
	this.gridBagConstraintsTipoIce.ipadx = 0;
	this.gridBagConstraintsTipoIce.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeTipoIce.add(jTextFieldporcentajeTipoIce, this.gridBagConstraintsTipoIce);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoIce = new GridBagConstraints();
	this.gridBagConstraintsTipoIce.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoIce.gridy = iYPanelCamposTipoIce;
	this.gridBagConstraintsTipoIce.gridx = iXPanelCamposTipoIce++;
	this.gridBagConstraintsTipoIce.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoIce.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoIce.add(this.jPanelidTipoIce, this.gridBagConstraintsTipoIce);



	if(iXPanelCamposTipoIce % 1==0) {
		iXPanelCamposTipoIce=0;
		iYPanelCamposTipoIce++;
	}
	this.gridBagConstraintsTipoIce = new GridBagConstraints();
	this.gridBagConstraintsTipoIce.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoIce.gridy = iYPanelCamposTipoIce;
	this.gridBagConstraintsTipoIce.gridx = iXPanelCamposTipoIce++;
	this.gridBagConstraintsTipoIce.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoIce.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoIce.add(this.jPanelnombreTipoIce, this.gridBagConstraintsTipoIce);



	if(iXPanelCamposTipoIce % 1==0) {
		iXPanelCamposTipoIce=0;
		iYPanelCamposTipoIce++;
	}
	this.gridBagConstraintsTipoIce = new GridBagConstraints();
	this.gridBagConstraintsTipoIce.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoIce.gridy = iYPanelCamposTipoIce;
	this.gridBagConstraintsTipoIce.gridx = iXPanelCamposTipoIce++;
	this.gridBagConstraintsTipoIce.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoIce.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoIce.add(this.jPanelporcentajeTipoIce, this.gridBagConstraintsTipoIce);



	if(iXPanelCamposTipoIce % 1==0) {
		iXPanelCamposTipoIce=0;
		iYPanelCamposTipoIce++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoIce= new GridBagLayout();
		this.jPanelAccionesTipoIce.setLayout(gridaBagLayoutAccionesTipoIce);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoIce= new GridBagLayout();
		this.jPanelAccionesFormularioTipoIce.setLayout(gridaBagLayoutAccionesFormularioTipoIce);
		
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoIce.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoIce.add(this.jComboBoxTiposAccionesFormularioTipoIce, this.gridBagConstraintsTipoIce);

		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoIce.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoIce.add(this.jCheckBoxPostAccionNuevoTipoIce, this.gridBagConstraintsTipoIce);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoiceSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoIce.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoIce.add(this.jCheckBoxPostAccionSinCerrarTipoIce, this.gridBagConstraintsTipoIce);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoiceSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoiceSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoIce.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoIce.add(this.jCheckBoxPostAccionSinMensajeTipoIce, this.gridBagConstraintsTipoIce);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIce.gridy = 0;
		this.gridBagConstraintsTipoIce.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoIce.add(this.jButtonModificarTipoIce, this.gridBagConstraintsTipoIce);							

		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIce.gridy = 0;
		this.gridBagConstraintsTipoIce.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoIce.add(this.jButtonEliminarTipoIce, this.gridBagConstraintsTipoIce);
		
			
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.gridy = 0;		
		this.gridBagConstraintsTipoIce.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoIce.add(this.jButtonActualizarTipoIce, this.gridBagConstraintsTipoIce);


		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.gridy = 0;		
		this.gridBagConstraintsTipoIce.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoIce.add(this.jButtonGuardarCambiosTipoIce, this.gridBagConstraintsTipoIce);	
		
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.gridy = 0;		
		this.gridBagConstraintsTipoIce.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoIce.add(this.jButtonCancelarTipoIce, this.gridBagConstraintsTipoIce);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoIce = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoIce);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoiceSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoIce = new GridBagConstraints();						
			this.gridBagConstraintsTipoIce.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoIce.gridx = 0;		
			//this.gridBagConstraintsTipoIce.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoIce.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoIce.gridx =0;
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoIce.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoIce, this.gridBagConstraintsTipoIce);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoIceJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoIce = new TipoIceBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Ice DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Ice DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Ice Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoIceModel tipoiceModel=new TipoIceModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoIceModel.TipoIceFocusTraversalPolicy tipoiceFocusTraversalPolicy = tipoiceModel.new TipoIceFocusTraversalPolicy(this);
			
			//tipoiceFocusTraversalPolicy.settipoiceJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoiceModel);
			
			
			this.jContentPaneDetalleTipoIce = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoIce = new GridBagLayout();	
			this.jContentPaneDetalleTipoIce.setLayout(gridaBagLayoutDetalleTipoIce);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoIce = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoIce = new GridBagConstraints();
				this.gridBagConstraintsTipoIce.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoIce.gridx = 0;
					
				
				this.jContentPaneDetalleTipoIce.add(jTtoolBarDetalleTipoIce, gridBagConstraintsTipoIce);								
				
}
			
			this.jScrollPanelDatosEdicionTipoIce=   new JScrollPane(jContentPaneDetalleTipoIce,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoIce.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoIce.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoIce.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoIce=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoIce.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoIce.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoIce.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoIce.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoIce.gridx = 0;
	        
			this.jContentPaneDetalleTipoIce.add(jPanelCamposTipoIce, gridBagConstraintsTipoIce);
			
			
			
			
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
						&& tipoiceSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipoiceSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoIce= new GridBagConstraints();
						this.gridBagConstraintsTipoIce.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoIce.gridx = 0;
						this.jContentPaneDetalleTipoIce.add(this.jTabbedPaneRelacionesTipoIce, this.gridBagConstraintsTipoIce);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoIce.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoIce.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoIce = new GridBagConstraints();
					this.gridBagConstraintsTipoIce.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoIce.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoIce.gridx = 0;
					
				
					this.jContentPaneDetalleTipoIce.add(jPanelCamposOcultosTipoIce, gridBagConstraintsTipoIce);
				
					this.jPanelCamposOcultosTipoIce.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoIce.gridx = 0;
	        this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoIce.add(this.jPanelAccionesFormularioTipoIce, this.gridBagConstraintsTipoIce);							
			
			
			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
	        this.gridBagConstraintsTipoIce.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoIce.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoIce.add(this.jPanelAccionesTipoIce, this.gridBagConstraintsTipoIce);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoIce);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoIce=   new JScrollPane(this.jPanelCamposTipoIce,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoIce.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoIce.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoIce.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoIce.gridx = 0;
			this.gridBagConstraintsTipoIce.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoIce.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoIce, this.gridBagConstraintsTipoIce);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoIce.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoIce, this.gridBagConstraintsTipoIce);			
			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoIce.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoIce, this.gridBagConstraintsTipoIce);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIce.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoIce, this.gridBagConstraintsTipoIce);
			
			
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIce.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoIce, this.gridBagConstraintsTipoIce);
		
			
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoIce.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoIce, this.gridBagConstraintsTipoIce);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoIce;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoIce;
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
