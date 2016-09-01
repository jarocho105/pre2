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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.TipoFondoConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class TipoFondoDetalleFormJInternalFrame extends TipoFondoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoFondo;
	
	protected JMenuBar jmenuBarDetalleTipoFondo;
	
	protected JMenu jmenuDetalleTipoFondo;
	protected JMenu jmenuDetalleArchivoTipoFondo;
	protected JMenu jmenuDetalleAccionesTipoFondo;
	protected JMenu jmenuDetalleDatosTipoFondo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoFondo;	
	protected GridBagConstraints gridBagConstraintsTipoFondo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoFondoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoFondo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoFondoSessionBean tipofondoSessionBean;
	
	
	
		
	
	public TipoFondoLogic tipofondoLogic;
	
	public JScrollPane jScrollPanelDatosTipoFondo;
	public JScrollPane jScrollPanelDatosEdicionTipoFondo;
	public JScrollPane jScrollPanelDatosGeneralTipoFondo;
	
	protected JPanel jPanelCamposTipoFondo;    
	protected JPanel jPanelCamposOcultosTipoFondo;    	
	protected JPanel jPanelAccionesTipoFondo;
	protected JPanel jPanelAccionesFormularioTipoFondo;
    
	
	
	protected Integer iXPanelCamposTipoFondo=0;
	protected Integer iYPanelCamposTipoFondo=0;
	
	protected Integer iXPanelCamposOcultosTipoFondo=0;
	protected Integer iYPanelCamposOcultosTipoFondo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoFondo;
	public JButton jButtonModificarTipoFondo;
	public JButton jButtonActualizarTipoFondo;
    public JButton jButtonEliminarTipoFondo;
	public JButton jButtonCancelarTipoFondo;
    public JButton jButtonGuardarCambiosTipoFondo;
	public JButton jButtonGuardarCambiosTablaTipoFondo;
	protected JButton jButtonCerrarTipoFondo;
	
	
	protected JButton jButtonProcesarInformacionTipoFondo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoFondo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoFondo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoFondo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoFondo;
	protected JButton jButtonModificarToolBarTipoFondo;
	protected JButton jButtonActualizarToolBarTipoFondo;
    protected JButton jButtonEliminarToolBarTipoFondo;
	protected JButton jButtonCancelarToolBarTipoFondo;
    protected JButton jButtonGuardarCambiosToolBarTipoFondo;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoFondo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoFondo;
	protected JButton jButtonCerrarToolBarTipoFondo;
	
	protected JButton jButtonProcesarInformacionToolBarTipoFondo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoFondo;
	protected JMenuItem jMenuItemModificarTipoFondo;
	protected JMenuItem jMenuItemActualizarTipoFondo;
    protected JMenuItem jMenuItemEliminarTipoFondo;
	protected JMenuItem jMenuItemCancelarTipoFondo;
    protected JMenuItem jMenuItemGuardarCambiosTipoFondo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoFondo;
	protected JMenuItem jMenuItemCerrarTipoFondo;
	protected JMenuItem jMenuItemDetalleCerrarTipoFondo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoFondo;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoFondo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoFondo;
	protected JMenuItem jMenuItemMostrarOcultarTipoFondo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoFondo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoFondo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoFondo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoFondo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoFondo;
	public JLabel jLabelIdTipoFondo;
	public JTextFieldMe jTextFieldidTipoFondo;
	public JButton jButtonidTipoFondoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoFondo;
	public JLabel jLabelcodigoTipoFondo;
	public JTextField jTextFieldcodigoTipoFondo;
	public JButton jButtoncodigoTipoFondoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoFondo;
	public JLabel jLabelnombreTipoFondo;
	public JTextArea jTextAreanombreTipoFondo;
	public JScrollPane jscrollPanenombreTipoFondo;
	public JButton jButtonnombreTipoFondoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoFondo;
	
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
	
	public TipoFondoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoFondo=new JPanel();
				this.jPanelAccionesFormularioTipoFondo=new JPanel();
				this.jmenuBarDetalleTipoFondo=new JMenuBar();
				this.jTtoolBarDetalleTipoFondo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFondoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoFondo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoFondoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoFondo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFondoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFondo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFondoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFondo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFondoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoFondo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoFondo() {
		return this.jButtonActualizarToolBarTipoFondo;
	}
	
	public JButton getjButtonEliminarToolBarTipoFondo() {
		return this.jButtonEliminarToolBarTipoFondo;
	}
	
	public JButton getjButtonCancelarToolBarTipoFondo() {
		return this.jButtonCancelarToolBarTipoFondo;
	}		
	
	public JButton getjButtonProcesarInformacionTipoFondo() {
		return this.jButtonProcesarInformacionTipoFondo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoFondo)	{
		this.jButtonProcesarInformacionTipoFondo = jButtonProcesarInformacionTipoFondo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoFondo() {
		return this.jComboBoxTiposAccionesTipoFondo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoFondo(
			JComboBox jComboBoxTiposRelacionesTipoFondo) {
		this.jComboBoxTiposRelacionesTipoFondo = jComboBoxTiposRelacionesTipoFondo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoFondo(
			JComboBox jComboBoxTiposAccionesTipoFondo) {
		this.jComboBoxTiposAccionesTipoFondo = jComboBoxTiposAccionesTipoFondo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoFondo() {
		return this.jComboBoxTiposAccionesFormularioTipoFondo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoFondo(
			JComboBox jComboBoxTiposAccionesFormularioTipoFondo) {
		this.jComboBoxTiposAccionesFormularioTipoFondo = jComboBoxTiposAccionesFormularioTipoFondo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipofondoSessionBean=new TipoFondoSessionBean();
		
		this.tipofondoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipofondoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipofondoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoFondoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoFondoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoFondoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Fondo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipofondoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoFondoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoFondo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoFondo=new JButtonMe();
				this.jButtonModificarToolBarTipoFondo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoFondo,this.jTtoolBarDetalleTipoFondo,
							"actualizar","actualizar","Actualizar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoFondo,this.jTtoolBarDetalleTipoFondo,
							"eliminar","eliminar","Eliminar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoFondo,this.jTtoolBarDetalleTipoFondo,
							"cancelar","cancelar","Cancelar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoFondo,this.jTtoolBarDetalleTipoFondo,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoFondo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoFondo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoFondo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoFondo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoFondo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoFondo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoFondo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoFondo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoFondo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoFondo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoFondo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoFondo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoFondo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoFondo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoFondo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoFondo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoFondo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoFondo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoFondo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoFondo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoFondo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoFondo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoFondo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoFondo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoFondo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoFondo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoFondo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoFondo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoFondo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoFondo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoFondo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoFondo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoFondo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoFondo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoFondo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoFondo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoFondo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoFondo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoFondo.add(this.jMenuItemDetalleCerrarTipoFondo);
		
		this.jmenuDetalleAccionesTipoFondo.add(this.jMenuItemActualizarTipoFondo);
		this.jmenuDetalleAccionesTipoFondo.add(this.jMenuItemEliminarTipoFondo);
		this.jmenuDetalleAccionesTipoFondo.add(this.jMenuItemCancelarTipoFondo);		
		
		//this.jmenuDetalleDatosTipoFondo.add(this.jMenuItemDetalleAbrirOrderByTipoFondo);				
		this.jmenuDetalleDatosTipoFondo.add(this.jMenuItemDetalleMostarOcultarTipoFondo);				
				
		//this.jmenuDetalleAccionesTipoFondo.add(this.jMenuItemGuardarCambiosTipoFondo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoFondo.add(this.jmenuDetalleArchivoTipoFondo);		
		this.jmenuBarDetalleTipoFondo.add(this.jmenuDetalleAccionesTipoFondo);		
		this.jmenuBarDetalleTipoFondo.add(this.jmenuDetalleDatosTipoFondo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoFondo);				
	}
	
	
	public void inicializarElementosCamposTipoFondo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoFondo = new JLabelMe();
		jLabelIdTipoFondo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoFondo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoFondo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoFondo.setToolTipText(TipoFondoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoFondo= new GridBagLayout();

		this.jPanelidTipoFondo.setLayout(this.gridaBagLayoutTipoFondo);

		jTextFieldidTipoFondo = new JTextFieldMe();
		jTextFieldidTipoFondo.setText("Id");

		jTextFieldidTipoFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoFondo = new JLabelMe();
		this.jLabelcodigoTipoFondo.setText(""+TipoFondoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoFondo.setToolTipText("Codigo");
		this.jLabelcodigoTipoFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoFondo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoFondo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoFondo.setToolTipText(TipoFondoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoFondo = new GridBagLayout();
		this.jPanelcodigoTipoFondo.setLayout(this.gridaBagLayoutTipoFondo);


		jTextFieldcodigoTipoFondo= new JTextFieldMe();

		jTextFieldcodigoTipoFondo.setEnabled(false);
		jTextFieldcodigoTipoFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoFondo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoFondoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoFondoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoFondoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoFondoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoFondoBusqueda.setText("U");
		this.jButtoncodigoTipoFondoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoFondoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoFondoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoFondo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoFondo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoFondoBusqueda"));

		if(this.tipofondoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoFondoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoFondo = new JLabelMe();
		this.jLabelnombreTipoFondo.setText(""+TipoFondoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoFondo.setToolTipText("Nombre");
		this.jLabelnombreTipoFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoFondo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoFondo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoFondo.setToolTipText(TipoFondoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoFondo = new GridBagLayout();
		this.jPanelnombreTipoFondo.setLayout(this.gridaBagLayoutTipoFondo);


		jTextAreanombreTipoFondo= new JTextAreaMe();
		jTextAreanombreTipoFondo.setEnabled(false);
		jTextAreanombreTipoFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFondo.setLineWrap(true);
		jTextAreanombreTipoFondo.setWrapStyleWord(true);
		jTextAreanombreTipoFondo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoFondo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoFondo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoFondo = new JScrollPane(jTextAreanombreTipoFondo);
		jscrollPanenombreTipoFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoFondoBusqueda= new JButtonMe();
		this.jButtonnombreTipoFondoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoFondoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoFondoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoFondoBusqueda.setText("U");
		this.jButtonnombreTipoFondoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoFondoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoFondoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoFondo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoFondo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoFondoBusqueda"));

		if(this.tipofondoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoFondoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoFondo() {
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
		//this.jInternalFrameDetalleTipoFondo = new TipoFondoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Fondo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoFondo= new GridBagLayout();
		

		
		String sToolTipTipoFondo="";
		sToolTipTipoFondo=TipoFondoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoFondo+="(Seguridad.TipoFondo)";
		}
		
		if(!this.tipofondoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoFondo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoFondo = new JButtonMe();
		this.jButtonModificarTipoFondo = new JButtonMe();
        this.jButtonActualizarTipoFondo = new JButtonMe();
        this.jButtonEliminarTipoFondo = new JButtonMe();
        this.jButtonCancelarTipoFondo = new JButtonMe();
        this.jButtonGuardarCambiosTipoFondo = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoFondo = new JButtonMe();
		this.jButtonCerrarTipoFondo = new JButtonMe();
		
		this.jScrollPanelDatosTipoFondo = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoFondo = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoFondo = new JScrollPane();
				
		
		
		this.jPanelCamposTipoFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Fondo";
		
		if(!this.tipofondoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Fondos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoFondo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoFondo.setName("jPanelCamposTipoFondo"); 

		this.jPanelCamposOcultosTipoFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoFondo.setName("jPanelCamposOcultosTipoFondo"); 

        this.jPanelAccionesTipoFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoFondo.setToolTipText("Acciones");
        this.jPanelAccionesTipoFondo.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoFondo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoFondo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoFondo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoFondo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoFondo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoFondo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoFondo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoFondo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoFondo.setText("Nuevo");
		this.jButtonModificarTipoFondo.setText("Editar");
        this.jButtonActualizarTipoFondo.setText("Actualizar");
        this.jButtonEliminarTipoFondo.setText("Eliminar");
        this.jButtonCancelarTipoFondo.setText("Cancelar");
        this.jButtonGuardarCambiosTipoFondo.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoFondo.setText("Guardar");
		this.jButtonCerrarTipoFondo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoFondo,"nuevo_button","Nuevo",this.tipofondoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoFondo,"modificar_button","Editar",this.tipofondoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoFondo,"actualizar_button","Actualizar",this.tipofondoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoFondo,"eliminar_button","Eliminar",this.tipofondoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoFondo,"cancelar_button","Cancelar",this.tipofondoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoFondo,"guardarcambios_button","Guardar",this.tipofondoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoFondo,"guardarcambiostabla_button","Guardar",this.tipofondoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoFondo,"cerrar_button","Salir",this.tipofondoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoFondo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoFondo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoFondo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoFondo.setToolTipText("Nuevo"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoFondo.setToolTipText("Editar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoFondo.setToolTipText("Actualizar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoFondo.setToolTipText("Eliminar)"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoFondo.setToolTipText("Cancelar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoFondo.setToolTipText("Guardar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoFondo.setToolTipText("Guardar"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoFondo.setToolTipText("Salir"+" "+TipoFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoFondo";
		inputMap = this.jButtonNuevoTipoFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoFondo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoFondo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoFondo";
		inputMap = this.jButtonActualizarTipoFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoFondo"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoFondo";
		inputMap = this.jButtonEliminarTipoFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoFondo"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoFondo";
		inputMap = this.jButtonCancelarTipoFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoFondo"));
		
		//CERRAR		
		sMapKey = "CerrarTipoFondo";
		inputMap = this.jButtonCerrarTipoFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoFondo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoFondo";
		inputMap = this.jButtonGuardarCambiosTablaTipoFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoFondo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoFondo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoFondo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoFondo.setToolTipText("Nuevo TipoFondo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoFondo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoFondo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoFondo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoFondo.setToolTipText("Sin Cerrar Ventana TipoFondo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoFondo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoFondo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoFondo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoFondo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoFondo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoFondo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoFondo.setText("Accion");
		this.jComboBoxTiposAccionesTipoFondo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoFondo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoFondo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoFondo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoFondo = new JLabelMe();
		
		this.jLabelAccionesTipoFondo.setText("Acciones");		
		this.jLabelAccionesTipoFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoFondo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoFondo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoFondo=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoFondo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoFondo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFondo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFondo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoFondo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoFondo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoFondo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoFondo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoFondo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoFondo = new GridBagLayout();
		
		this.jPanelCamposTipoFondo.setLayout(gridaBagLayoutCamposTipoFondo);
		this.jPanelCamposOcultosTipoFondo.setLayout(gridaBagLayoutCamposOcultosTipoFondo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoFondo = new GridBagConstraints();
	this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFondo.gridy = 0;
	this.gridBagConstraintsTipoFondo.gridx = 0;
	this.gridBagConstraintsTipoFondo.ipadx = 0;
	this.gridBagConstraintsTipoFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoFondo.add(jLabelIdTipoFondo, this.gridBagConstraintsTipoFondo);



	this.gridBagConstraintsTipoFondo = new GridBagConstraints();
	this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFondo.gridy = 0;
	this.gridBagConstraintsTipoFondo.gridx = 1;
	this.gridBagConstraintsTipoFondo.ipadx = 0;
	this.gridBagConstraintsTipoFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoFondo.add(jTextFieldidTipoFondo, this.gridBagConstraintsTipoFondo);


	this.gridBagConstraintsTipoFondo = new GridBagConstraints();
	this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFondo.gridy = 0;
	this.gridBagConstraintsTipoFondo.gridx = 0;
	this.gridBagConstraintsTipoFondo.ipadx = 0;
	this.gridBagConstraintsTipoFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoFondo.add(jLabelcodigoTipoFondo, this.gridBagConstraintsTipoFondo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		//this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFondo.gridy = 0;
		this.gridBagConstraintsTipoFondo.gridx = 2;
		this.gridBagConstraintsTipoFondo.ipadx = 0;
		this.gridBagConstraintsTipoFondo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoFondo.add(jButtoncodigoTipoFondoBusqueda, this.gridBagConstraintsTipoFondo);
	}

	this.gridBagConstraintsTipoFondo = new GridBagConstraints();
	this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFondo.gridy = 0;
	this.gridBagConstraintsTipoFondo.gridx = 1;
	this.gridBagConstraintsTipoFondo.ipadx = 0;
	this.gridBagConstraintsTipoFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoFondo.add(jTextFieldcodigoTipoFondo, this.gridBagConstraintsTipoFondo);


	this.gridBagConstraintsTipoFondo = new GridBagConstraints();
	this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFondo.gridy = 0;
	this.gridBagConstraintsTipoFondo.gridx = 0;
	this.gridBagConstraintsTipoFondo.ipadx = 0;
	this.gridBagConstraintsTipoFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoFondo.add(jLabelnombreTipoFondo, this.gridBagConstraintsTipoFondo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		//this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFondo.gridy = 0;
		this.gridBagConstraintsTipoFondo.gridx = 2;
		this.gridBagConstraintsTipoFondo.ipadx = 0;
		this.gridBagConstraintsTipoFondo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoFondo.add(jButtonnombreTipoFondoBusqueda, this.gridBagConstraintsTipoFondo);
	}

	this.gridBagConstraintsTipoFondo = new GridBagConstraints();
	this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFondo.gridy = 0;
	this.gridBagConstraintsTipoFondo.gridx = 1;
	this.gridBagConstraintsTipoFondo.ipadx = 0;
	this.gridBagConstraintsTipoFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoFondo.add(jscrollPanenombreTipoFondo, this.gridBagConstraintsTipoFondo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoFondo = new GridBagConstraints();
	this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFondo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFondo.gridy = iYPanelCamposTipoFondo;
	this.gridBagConstraintsTipoFondo.gridx = iXPanelCamposTipoFondo++;
	this.gridBagConstraintsTipoFondo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFondo.add(this.jPanelidTipoFondo, this.gridBagConstraintsTipoFondo);



	if(iXPanelCamposTipoFondo % 1==0) {
		iXPanelCamposTipoFondo=0;
		iYPanelCamposTipoFondo++;
	}
	this.gridBagConstraintsTipoFondo = new GridBagConstraints();
	this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFondo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFondo.gridy = iYPanelCamposTipoFondo;
	this.gridBagConstraintsTipoFondo.gridx = iXPanelCamposTipoFondo++;
	this.gridBagConstraintsTipoFondo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFondo.add(this.jPanelcodigoTipoFondo, this.gridBagConstraintsTipoFondo);



	if(iXPanelCamposTipoFondo % 1==0) {
		iXPanelCamposTipoFondo=0;
		iYPanelCamposTipoFondo++;
	}
	this.gridBagConstraintsTipoFondo = new GridBagConstraints();
	this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFondo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFondo.gridy = iYPanelCamposTipoFondo;
	this.gridBagConstraintsTipoFondo.gridx = iXPanelCamposTipoFondo++;
	this.gridBagConstraintsTipoFondo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFondo.add(this.jPanelnombreTipoFondo, this.gridBagConstraintsTipoFondo);



	if(iXPanelCamposTipoFondo % 1==0) {
		iXPanelCamposTipoFondo=0;
		iYPanelCamposTipoFondo++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoFondo= new GridBagLayout();
		this.jPanelAccionesTipoFondo.setLayout(gridaBagLayoutAccionesTipoFondo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoFondo= new GridBagLayout();
		this.jPanelAccionesFormularioTipoFondo.setLayout(gridaBagLayoutAccionesFormularioTipoFondo);
		
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoFondo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoFondo.add(this.jComboBoxTiposAccionesFormularioTipoFondo, this.gridBagConstraintsTipoFondo);

		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoFondo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoFondo.add(this.jCheckBoxPostAccionNuevoTipoFondo, this.gridBagConstraintsTipoFondo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipofondoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoFondo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoFondo.add(this.jCheckBoxPostAccionSinCerrarTipoFondo, this.gridBagConstraintsTipoFondo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipofondoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipofondoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoFondo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoFondo.add(this.jCheckBoxPostAccionSinMensajeTipoFondo, this.gridBagConstraintsTipoFondo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondo.gridy = 0;
		this.gridBagConstraintsTipoFondo.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoFondo.add(this.jButtonModificarTipoFondo, this.gridBagConstraintsTipoFondo);							

		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondo.gridy = 0;
		this.gridBagConstraintsTipoFondo.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoFondo.add(this.jButtonEliminarTipoFondo, this.gridBagConstraintsTipoFondo);
		
			
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.gridy = 0;		
		this.gridBagConstraintsTipoFondo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoFondo.add(this.jButtonActualizarTipoFondo, this.gridBagConstraintsTipoFondo);


		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.gridy = 0;		
		this.gridBagConstraintsTipoFondo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoFondo.add(this.jButtonGuardarCambiosTipoFondo, this.gridBagConstraintsTipoFondo);	
		
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.gridy = 0;		
		this.gridBagConstraintsTipoFondo.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoFondo.add(this.jButtonCancelarTipoFondo, this.gridBagConstraintsTipoFondo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoFondo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoFondo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipofondoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();						
			this.gridBagConstraintsTipoFondo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoFondo.gridx = 0;		
			//this.gridBagConstraintsTipoFondo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoFondo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoFondo.gridx =0;
		this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoFondo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoFondo, this.gridBagConstraintsTipoFondo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoFondoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoFondo = new TipoFondoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Fondo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Fondo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Fondo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoFondoModel tipofondoModel=new TipoFondoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoFondoModel.TipoFondoFocusTraversalPolicy tipofondoFocusTraversalPolicy = tipofondoModel.new TipoFondoFocusTraversalPolicy(this);
			
			//tipofondoFocusTraversalPolicy.settipofondoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipofondoModel);
			
			
			this.jContentPaneDetalleTipoFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoFondo = new GridBagLayout();	
			this.jContentPaneDetalleTipoFondo.setLayout(gridaBagLayoutDetalleTipoFondo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoFondo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoFondo = new GridBagConstraints();
				this.gridBagConstraintsTipoFondo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoFondo.gridx = 0;
					
				
				this.jContentPaneDetalleTipoFondo.add(jTtoolBarDetalleTipoFondo, gridBagConstraintsTipoFondo);								
				
}
			
			this.jScrollPanelDatosEdicionTipoFondo=   new JScrollPane(jContentPaneDetalleTipoFondo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoFondo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFondo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFondo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoFondo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoFondo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFondo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFondo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoFondo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoFondo.gridx = 0;
	        
			this.jContentPaneDetalleTipoFondo.add(jPanelCamposTipoFondo, gridBagConstraintsTipoFondo);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& tipofondoSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipofondoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoFondo= new GridBagConstraints();
						this.gridBagConstraintsTipoFondo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoFondo.gridx = 0;
						this.jContentPaneDetalleTipoFondo.add(this.jTabbedPaneRelacionesTipoFondo, this.gridBagConstraintsTipoFondo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoFondo.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoFondo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoFondo = new GridBagConstraints();
					this.gridBagConstraintsTipoFondo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoFondo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoFondo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoFondo.gridx = 0;
					
				
					this.jContentPaneDetalleTipoFondo.add(jPanelCamposOcultosTipoFondo, gridBagConstraintsTipoFondo);
				
					this.jPanelCamposOcultosTipoFondo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoFondo.gridx = 0;
	        this.gridBagConstraintsTipoFondo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoFondo.add(this.jPanelAccionesFormularioTipoFondo, this.gridBagConstraintsTipoFondo);							
			
			
			
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
	        this.gridBagConstraintsTipoFondo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoFondo.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoFondo.add(this.jPanelAccionesTipoFondo, this.gridBagConstraintsTipoFondo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoFondo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoFondo=   new JScrollPane(this.jPanelCamposTipoFondo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoFondo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFondo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFondo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoFondo.gridx = 0;
			this.gridBagConstraintsTipoFondo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoFondo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoFondo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoFondo, this.gridBagConstraintsTipoFondo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoFondo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoFondo, this.gridBagConstraintsTipoFondo);			
			
			this.gridBagConstraintsTipoFondo = new GridBagConstraints();
			this.gridBagConstraintsTipoFondo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoFondo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoFondo, this.gridBagConstraintsTipoFondo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFondo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoFondo, this.gridBagConstraintsTipoFondo);
			
			
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFondo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoFondo, this.gridBagConstraintsTipoFondo);
		
			
		this.gridBagConstraintsTipoFondo = new GridBagConstraints();
		this.gridBagConstraintsTipoFondo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoFondo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoFondo, this.gridBagConstraintsTipoFondo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoFondo;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoFondo;
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
