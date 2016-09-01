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
package com.bydan.erp.sris.presentation.swing.jinternalframes;



import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.sris.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.util.SrisConstantesFunciones;

import com.bydan.erp.sris.business.logic.*;
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
public class SrisDetalleFormJInternalFrame extends SrisBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSris;
	
	protected JMenuBar jmenuBarDetalleSris;
	
	protected JMenu jmenuDetalleSris;
	protected JMenu jmenuDetalleArchivoSris;
	protected JMenu jmenuDetalleAccionesSris;
	protected JMenu jmenuDetalleDatosSris;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSris = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSris;	
	protected GridBagConstraints gridBagConstraintsSris;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SrisBeanSwingJInternalFrameAdditional jInternalFrameDetalleSris;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public SrisSessionBean srisSessionBean;
	
	
	
		
	
	public SrisLogic srisLogic;
	
	public JScrollPane jScrollPanelDatosSris;
	public JScrollPane jScrollPanelDatosEdicionSris;
	public JScrollPane jScrollPanelDatosGeneralSris;
	
	protected JPanel jPanelCamposSris;    
	protected JPanel jPanelCamposOcultosSris;    	
	protected JPanel jPanelAccionesSris;
	protected JPanel jPanelAccionesFormularioSris;
    
	
	
	protected Integer iXPanelCamposSris=0;
	protected Integer iYPanelCamposSris=0;
	
	protected Integer iXPanelCamposOcultosSris=0;
	protected Integer iYPanelCamposOcultosSris=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSris;
	public JButton jButtonModificarSris;
	public JButton jButtonActualizarSris;
    public JButton jButtonEliminarSris;
	public JButton jButtonCancelarSris;
    public JButton jButtonGuardarCambiosSris;
	public JButton jButtonGuardarCambiosTablaSris;
	protected JButton jButtonCerrarSris;
	
	
	protected JButton jButtonProcesarInformacionSris;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSris;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSris;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSris;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSris;
	protected JButton jButtonModificarToolBarSris;
	protected JButton jButtonActualizarToolBarSris;
    protected JButton jButtonEliminarToolBarSris;
	protected JButton jButtonCancelarToolBarSris;
    protected JButton jButtonGuardarCambiosToolBarSris;
	protected JButton jButtonGuardarCambiosTablaToolBarSris;
	protected JButton jButtonMostrarOcultarTablaToolBarSris;
	protected JButton jButtonCerrarToolBarSris;
	
	protected JButton jButtonProcesarInformacionToolBarSris;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSris;
	protected JMenuItem jMenuItemModificarSris;
	protected JMenuItem jMenuItemActualizarSris;
    protected JMenuItem jMenuItemEliminarSris;
	protected JMenuItem jMenuItemCancelarSris;
    protected JMenuItem jMenuItemGuardarCambiosSris;
	protected JMenuItem jMenuItemGuardarCambiosTablaSris;
	protected JMenuItem jMenuItemCerrarSris;
	protected JMenuItem jMenuItemDetalleCerrarSris;
	protected JMenuItem jMenuItemDetalleMostarOcultarSris;
	
	protected JMenuItem jMenuItemProcesarInformacionSris;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSris;
	protected JMenuItem jMenuItemMostrarOcultarSris;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSris;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSris;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSris;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSris;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSris;
	public JLabel jLabelIdSris;
	public JLabel jLabelidSris;
	public JButton jButtonidSrisBusqueda= new JButtonMe();

	public JPanel jPanelcodigoSris;
	public JLabel jLabelcodigoSris;
	public JTextField jTextFieldcodigoSris;
	public JButton jButtoncodigoSrisBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSris;
	
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SrisDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSris=new JPanel();
				this.jPanelAccionesFormularioSris=new JPanel();
				this.jmenuBarDetalleSris=new JMenuBar();
				this.jTtoolBarDetalleSris=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SrisDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Sris No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SrisDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Sris No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SrisDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Sris No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SrisDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Sris No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SrisDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Sris No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSris() {
		return this.jButtonActualizarToolBarSris;
	}
	
	public JButton getjButtonEliminarToolBarSris() {
		return this.jButtonEliminarToolBarSris;
	}
	
	public JButton getjButtonCancelarToolBarSris() {
		return this.jButtonCancelarToolBarSris;
	}		
	
	public JButton getjButtonProcesarInformacionSris() {
		return this.jButtonProcesarInformacionSris;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSris)	{
		this.jButtonProcesarInformacionSris = jButtonProcesarInformacionSris;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSris() {
		return this.jComboBoxTiposAccionesSris;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSris(
			JComboBox jComboBoxTiposRelacionesSris) {
		this.jComboBoxTiposRelacionesSris = jComboBoxTiposRelacionesSris;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSris(
			JComboBox jComboBoxTiposAccionesSris) {
		this.jComboBoxTiposAccionesSris = jComboBoxTiposAccionesSris;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSris() {
		return this.jComboBoxTiposAccionesFormularioSris;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSris(
			JComboBox jComboBoxTiposAccionesFormularioSris) {
		this.jComboBoxTiposAccionesFormularioSris = jComboBoxTiposAccionesFormularioSris;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.srisSessionBean=new SrisSessionBean();
		
		this.srisSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.srisSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.srisSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SrisJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SrisJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SrisJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sris MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.srisSessionBean.getEsGuardarRelacionado()) {
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
	
		SrisJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSris= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSris=new JButtonMe();
				this.jButtonModificarToolBarSris=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSris=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSris,this.jTtoolBarDetalleSris,
							"actualizar","actualizar","Actualizar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSris=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSris,this.jTtoolBarDetalleSris,
							"eliminar","eliminar","Eliminar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSris=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSris,this.jTtoolBarDetalleSris,
							"cancelar","cancelar","Cancelar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSris=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSris,this.jTtoolBarDetalleSris,
							"guardarcambios","guardarcambios","Guardar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSris,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSris,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSris,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSris=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSris=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSris=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSris=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSris=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSris= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSris.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSris,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSris= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSris.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSris,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSris= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSris.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSris,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSris= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSris.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSris,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSris= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSris.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSris,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSris= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSris.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSris,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSris= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSris.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSris,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSris= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSris.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSris,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSris= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSris.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSris,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSris= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSris.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSris,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSris, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSris.add(this.jMenuItemDetalleCerrarSris);
		
		this.jmenuDetalleAccionesSris.add(this.jMenuItemActualizarSris);
		this.jmenuDetalleAccionesSris.add(this.jMenuItemEliminarSris);
		this.jmenuDetalleAccionesSris.add(this.jMenuItemCancelarSris);		
		
		//this.jmenuDetalleDatosSris.add(this.jMenuItemDetalleAbrirOrderBySris);				
		this.jmenuDetalleDatosSris.add(this.jMenuItemDetalleMostarOcultarSris);				
				
		//this.jmenuDetalleAccionesSris.add(this.jMenuItemGuardarCambiosSris);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSris, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSris, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSris, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSris.add(this.jmenuDetalleArchivoSris);		
		this.jmenuBarDetalleSris.add(this.jmenuDetalleAccionesSris);		
		this.jmenuBarDetalleSris.add(this.jmenuDetalleDatosSris);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSris);				
	}
	
	
	public void inicializarElementosCamposSris() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSris = new JLabelMe();
		jLabelIdSris.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSris.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSris.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSris.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSris,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSris = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSris.setToolTipText(SrisConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSris= new GridBagLayout();

		this.jPanelidSris.setLayout(this.gridaBagLayoutSris);

		jLabelidSris = new JLabel();
		jLabelidSris.setText("Id");

		jLabelidSris.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSris.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSris.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoSris = new JLabelMe();
		this.jLabelcodigoSris.setText(""+SrisConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoSris.setToolTipText("Codigo");
		this.jLabelcodigoSris.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoSris.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoSris.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoSris,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoSris=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoSris.setToolTipText(SrisConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutSris = new GridBagLayout();
		this.jPanelcodigoSris.setLayout(this.gridaBagLayoutSris);


		jTextFieldcodigoSris= new JTextFieldMe();

		jTextFieldcodigoSris.setEnabled(false);
		jTextFieldcodigoSris.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoSris.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoSris.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoSris,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoSrisBusqueda= new JButtonMe();
		this.jButtoncodigoSrisBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoSrisBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoSrisBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoSrisBusqueda.setText("U");
		this.jButtoncodigoSrisBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoSrisBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoSrisBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoSris.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoSris.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoSrisBusqueda"));

		if(this.srisSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoSrisBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSris() {
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
		//this.jInternalFrameDetalleSris = new SrisBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Sris DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSris= new GridBagLayout();
		

		
		String sToolTipSris="";
		sToolTipSris=SrisConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSris+="(Sris.Sris)";
		}
		
		if(!this.srisSessionBean.getEsGuardarRelacionado()) {
			sToolTipSris+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSris = new JButtonMe();
		this.jButtonModificarSris = new JButtonMe();
        this.jButtonActualizarSris = new JButtonMe();
        this.jButtonEliminarSris = new JButtonMe();
        this.jButtonCancelarSris = new JButtonMe();
        this.jButtonGuardarCambiosSris = new JButtonMe();
		this.jButtonGuardarCambiosTablaSris = new JButtonMe();
		this.jButtonCerrarSris = new JButtonMe();
		
		this.jScrollPanelDatosSris = new JScrollPane();   
        this.jScrollPanelDatosEdicionSris = new JScrollPane();
		this.jScrollPanelDatosGeneralSris = new JScrollPane();
				
		
		
		this.jPanelCamposSris = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSris = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSris = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSris = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Sris";
		
		if(!this.srisSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSris.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sriss" + this.sPath));
		} else {
			this.jScrollPanelDatosSris.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSris.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSris.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSris.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSris.setName("jPanelCamposSris"); 

		this.jPanelCamposOcultosSris.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSris.setName("jPanelCamposOcultosSris"); 

        this.jPanelAccionesSris.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSris.setToolTipText("Acciones");
        this.jPanelAccionesSris.setName("Acciones"); 

		this.jPanelAccionesFormularioSris.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSris.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSris.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSris, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSris, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSris, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSris, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSris, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSris, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSris.setText("Nuevo");
		this.jButtonModificarSris.setText("Editar");
        this.jButtonActualizarSris.setText("Actualizar");
        this.jButtonEliminarSris.setText("Eliminar");
        this.jButtonCancelarSris.setText("Cancelar");
        this.jButtonGuardarCambiosSris.setText("Guardar");
		this.jButtonGuardarCambiosTablaSris.setText("Guardar");
		this.jButtonCerrarSris.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSris,"nuevo_button","Nuevo",this.srisSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSris,"modificar_button","Editar",this.srisSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSris,"actualizar_button","Actualizar",this.srisSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSris,"eliminar_button","Eliminar",this.srisSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSris,"cancelar_button","Cancelar",this.srisSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSris,"guardarcambios_button","Guardar",this.srisSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSris,"guardarcambiostabla_button","Guardar",this.srisSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSris,"cerrar_button","Salir",this.srisSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSris, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSris, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSris, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSris, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSris, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSris, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSris, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSris.setToolTipText("Nuevo"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSris.setToolTipText("Editar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSris.setToolTipText("Actualizar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSris.setToolTipText("Eliminar)"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSris.setToolTipText("Cancelar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSris.setToolTipText("Guardar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSris.setToolTipText("Guardar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSris.setToolTipText("Salir"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSris";
		inputMap = this.jButtonNuevoSris.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSris.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSris"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSris";
		inputMap = this.jButtonActualizarSris.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSris.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSris"));
		
		//ELIMINAR
		sMapKey = "EliminarSris";
		inputMap = this.jButtonEliminarSris.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSris.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSris"));
		
		//CANCELAR	
		sMapKey = "CancelarSris";
		inputMap = this.jButtonCancelarSris.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSris.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSris"));
		
		//CERRAR		
		sMapKey = "CerrarSris";
		inputMap = this.jButtonCerrarSris.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSris.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSris"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSris";
		inputMap = this.jButtonGuardarCambiosTablaSris.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSris.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSris"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSris = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSris.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSris.setToolTipText("Nuevo Sris");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSris, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSris = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSris.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSris.setToolTipText("Sin Cerrar Ventana Sris");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSris, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSris = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSris.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSris.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSris, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSris = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSris.setText("Accion");
		this.jComboBoxTiposAccionesSris.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSris = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSris.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSris.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSris = new JLabelMe();
		
		this.jLabelAccionesSris.setText("Acciones");		
		this.jLabelAccionesSris.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSris.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSris.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSris();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSris();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSris=new JTabbedPane();
		this.jTabbedPaneRelacionesSris.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSris,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSris.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSris.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSris.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSris, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSris.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSris.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSris.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSris, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSris = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSris = new GridBagLayout();
		
		this.jPanelCamposSris.setLayout(gridaBagLayoutCamposSris);
		this.jPanelCamposOcultosSris.setLayout(gridaBagLayoutCamposOcultosSris);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSris = new GridBagConstraints();
	this.gridBagConstraintsSris.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSris.gridy = 0;
	this.gridBagConstraintsSris.gridx = 0;
	this.gridBagConstraintsSris.ipadx = 0;
	this.gridBagConstraintsSris.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSris.add(jLabelIdSris, this.gridBagConstraintsSris);



	this.gridBagConstraintsSris = new GridBagConstraints();
	this.gridBagConstraintsSris.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSris.gridy = 0;
	this.gridBagConstraintsSris.gridx = 1;
	this.gridBagConstraintsSris.ipadx = 0;
	this.gridBagConstraintsSris.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSris.add(jLabelidSris, this.gridBagConstraintsSris);


	this.gridBagConstraintsSris = new GridBagConstraints();
	this.gridBagConstraintsSris.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSris.gridy = 0;
	this.gridBagConstraintsSris.gridx = 0;
	this.gridBagConstraintsSris.ipadx = 0;
	this.gridBagConstraintsSris.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoSris.add(jLabelcodigoSris, this.gridBagConstraintsSris);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSris = new GridBagConstraints();
		//this.gridBagConstraintsSris.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSris.gridy = 0;
		this.gridBagConstraintsSris.gridx = 2;
		this.gridBagConstraintsSris.ipadx = 0;
		this.gridBagConstraintsSris.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoSris.add(jButtoncodigoSrisBusqueda, this.gridBagConstraintsSris);
	}

	this.gridBagConstraintsSris = new GridBagConstraints();
	this.gridBagConstraintsSris.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSris.gridy = 0;
	this.gridBagConstraintsSris.gridx = 1;
	this.gridBagConstraintsSris.ipadx = 0;
	this.gridBagConstraintsSris.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoSris.add(jTextFieldcodigoSris, this.gridBagConstraintsSris);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSris = new GridBagConstraints();
	this.gridBagConstraintsSris.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSris.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSris.gridy = iYPanelCamposSris;
	this.gridBagConstraintsSris.gridx = iXPanelCamposSris++;
	this.gridBagConstraintsSris.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSris.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSris.add(this.jPanelidSris, this.gridBagConstraintsSris);



	if(iXPanelCamposSris % 1==0) {
		iXPanelCamposSris=0;
		iYPanelCamposSris++;
	}
	this.gridBagConstraintsSris = new GridBagConstraints();
	this.gridBagConstraintsSris.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSris.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSris.gridy = iYPanelCamposSris;
	this.gridBagConstraintsSris.gridx = iXPanelCamposSris++;
	this.gridBagConstraintsSris.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSris.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSris.add(this.jPanelcodigoSris, this.gridBagConstraintsSris);



	if(iXPanelCamposSris % 1==0) {
		iXPanelCamposSris=0;
		iYPanelCamposSris++;
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
			
		GridBagLayout gridaBagLayoutAccionesSris= new GridBagLayout();
		this.jPanelAccionesSris.setLayout(gridaBagLayoutAccionesSris);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSris= new GridBagLayout();
		this.jPanelAccionesFormularioSris.setLayout(gridaBagLayoutAccionesFormularioSris);
		
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSris.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSris.add(this.jComboBoxTiposAccionesFormularioSris, this.gridBagConstraintsSris);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSris.gridy = 0;
		this.gridBagConstraintsSris.gridx = iPosXAccion++;
			
		this.jPanelAccionesSris.add(this.jButtonModificarSris, this.gridBagConstraintsSris);							

		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSris.gridy = 0;
		this.gridBagConstraintsSris.gridx =iPosXAccion++;
			
		this.jPanelAccionesSris.add(this.jButtonEliminarSris, this.gridBagConstraintsSris);
		
			
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.gridy = 0;		
		this.gridBagConstraintsSris.gridx = iPosXAccion++;
		
		this.jPanelAccionesSris.add(this.jButtonActualizarSris, this.gridBagConstraintsSris);


		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.gridy = 0;		
		this.gridBagConstraintsSris.gridx = iPosXAccion++;
		
		this.jPanelAccionesSris.add(this.jButtonGuardarCambiosSris, this.gridBagConstraintsSris);	
		
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.gridy = 0;		
		this.gridBagConstraintsSris.gridx =iPosXAccion++;
		
		this.jPanelAccionesSris.add(this.jButtonCancelarSris, this.gridBagConstraintsSris);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSris = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSris);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.srisSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSris = new GridBagConstraints();						
			this.gridBagConstraintsSris.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSris.gridx = 0;		
			//this.gridBagConstraintsSris.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSris.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSris.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSris.gridx =0;
		this.gridBagConstraintsSris.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSris.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSris, this.gridBagConstraintsSris);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SrisJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSris = new SrisBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Sris DATOS");
			
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
			
	        //this.setTitle("[FOR] - Sris DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sris Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SrisModel srisModel=new SrisModel(this);
			
			//SI USARA CLASE INTERNA
			//SrisModel.SrisFocusTraversalPolicy srisFocusTraversalPolicy = srisModel.new SrisFocusTraversalPolicy(this);
			
			//srisFocusTraversalPolicy.setsrisJInternalFrame(this);
			
			this.setFocusTraversalPolicy(srisModel);
			
			
			this.jContentPaneDetalleSris = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSris = new GridBagLayout();	
			this.jContentPaneDetalleSris.setLayout(gridaBagLayoutDetalleSris);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSris = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSris = new GridBagConstraints();
				this.gridBagConstraintsSris.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSris.gridx = 0;
					
				
				this.jContentPaneDetalleSris.add(jTtoolBarDetalleSris, gridBagConstraintsSris);								
				
}
			
			this.jScrollPanelDatosEdicionSris=   new JScrollPane(jContentPaneDetalleSris,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSris.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSris.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSris.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSris=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSris.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSris.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSris.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSris = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSris.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSris.gridx = 0;
	        
			this.jContentPaneDetalleSris.add(jPanelCamposSris, gridBagConstraintsSris);
			
			
			
			
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
						&& srisSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.srisSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSris= new GridBagConstraints();
						this.gridBagConstraintsSris.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSris.gridx = 0;
						this.jContentPaneDetalleSris.add(this.jTabbedPaneRelacionesSris, this.gridBagConstraintsSris);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSris.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSris.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSris = new GridBagConstraints();
					this.gridBagConstraintsSris.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSris.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSris.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSris.gridx = 0;
					
				
					this.jContentPaneDetalleSris.add(jPanelCamposOcultosSris, gridBagConstraintsSris);
				
					this.jPanelCamposOcultosSris.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsSris.gridx = 0;
	        this.gridBagConstraintsSris.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSris.add(this.jPanelAccionesFormularioSris, this.gridBagConstraintsSris);							
			
			
			
			this.gridBagConstraintsSris = new GridBagConstraints();
	        this.gridBagConstraintsSris.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsSris.gridx = 0;
	        
			
			this.jContentPaneDetalleSris.add(this.jPanelAccionesSris, this.gridBagConstraintsSris);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSris);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSris=   new JScrollPane(this.jPanelCamposSris,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSris.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSris.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSris.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSris.gridx = 0;
			this.gridBagConstraintsSris.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSris.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSris.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSris, this.gridBagConstraintsSris);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSris.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSris, this.gridBagConstraintsSris);			
			
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSris.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSris, this.gridBagConstraintsSris);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSris.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSris, this.gridBagConstraintsSris);
			
			
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSris.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSris, this.gridBagConstraintsSris);
		
			
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSris.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSris, this.gridBagConstraintsSris);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSris;//jContentPane;
		
		return jScrollPanelDatosEdicionSris;
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
