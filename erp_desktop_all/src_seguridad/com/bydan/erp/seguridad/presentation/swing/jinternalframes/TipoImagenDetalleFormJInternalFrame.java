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


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.TipoImagenConstantesFunciones;

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
public class TipoImagenDetalleFormJInternalFrame extends TipoImagenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoImagen;
	
	protected JMenuBar jmenuBarDetalleTipoImagen;
	
	protected JMenu jmenuDetalleTipoImagen;
	protected JMenu jmenuDetalleArchivoTipoImagen;
	protected JMenu jmenuDetalleAccionesTipoImagen;
	protected JMenu jmenuDetalleDatosTipoImagen;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoImagen;	
	protected GridBagConstraints gridBagConstraintsTipoImagen;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoImagenBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoImagen;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoImagenSessionBean tipoimagenSessionBean;
	
	
	
		
	
	public TipoImagenLogic tipoimagenLogic;
	
	public JScrollPane jScrollPanelDatosTipoImagen;
	public JScrollPane jScrollPanelDatosEdicionTipoImagen;
	public JScrollPane jScrollPanelDatosGeneralTipoImagen;
	
	protected JPanel jPanelCamposTipoImagen;    
	protected JPanel jPanelCamposOcultosTipoImagen;    	
	protected JPanel jPanelAccionesTipoImagen;
	protected JPanel jPanelAccionesFormularioTipoImagen;
    
	
	
	protected Integer iXPanelCamposTipoImagen=0;
	protected Integer iYPanelCamposTipoImagen=0;
	
	protected Integer iXPanelCamposOcultosTipoImagen=0;
	protected Integer iYPanelCamposOcultosTipoImagen=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoImagen;
	public JButton jButtonModificarTipoImagen;
	public JButton jButtonActualizarTipoImagen;
    public JButton jButtonEliminarTipoImagen;
	public JButton jButtonCancelarTipoImagen;
    public JButton jButtonGuardarCambiosTipoImagen;
	public JButton jButtonGuardarCambiosTablaTipoImagen;
	protected JButton jButtonCerrarTipoImagen;
	
	
	protected JButton jButtonProcesarInformacionTipoImagen;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoImagen;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoImagen;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoImagen;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoImagen;
	protected JButton jButtonModificarToolBarTipoImagen;
	protected JButton jButtonActualizarToolBarTipoImagen;
    protected JButton jButtonEliminarToolBarTipoImagen;
	protected JButton jButtonCancelarToolBarTipoImagen;
    protected JButton jButtonGuardarCambiosToolBarTipoImagen;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoImagen;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoImagen;
	protected JButton jButtonCerrarToolBarTipoImagen;
	
	protected JButton jButtonProcesarInformacionToolBarTipoImagen;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoImagen;
	protected JMenuItem jMenuItemModificarTipoImagen;
	protected JMenuItem jMenuItemActualizarTipoImagen;
    protected JMenuItem jMenuItemEliminarTipoImagen;
	protected JMenuItem jMenuItemCancelarTipoImagen;
    protected JMenuItem jMenuItemGuardarCambiosTipoImagen;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoImagen;
	protected JMenuItem jMenuItemCerrarTipoImagen;
	protected JMenuItem jMenuItemDetalleCerrarTipoImagen;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoImagen;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoImagen;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoImagen;
	protected JMenuItem jMenuItemMostrarOcultarTipoImagen;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoImagen;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoImagen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoImagen;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoImagen;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoImagen;
	public JLabel jLabelIdTipoImagen;
	public JTextFieldMe jTextFieldidTipoImagen;
	public JButton jButtonidTipoImagenBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoImagen;
	public JLabel jLabelcodigoTipoImagen;
	public JTextField jTextFieldcodigoTipoImagen;
	public JButton jButtoncodigoTipoImagenBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoImagen;
	public JLabel jLabelnombreTipoImagen;
	public JTextArea jTextAreanombreTipoImagen;
	public JScrollPane jscrollPanenombreTipoImagen;
	public JButton jButtonnombreTipoImagenBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoImagen;
	
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
	
	public TipoImagenDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoImagen=new JPanel();
				this.jPanelAccionesFormularioTipoImagen=new JPanel();
				this.jmenuBarDetalleTipoImagen=new JMenuBar();
				this.jTtoolBarDetalleTipoImagen=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoImagenDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoImagen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoImagenDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoImagen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoImagenDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoImagen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoImagenDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoImagen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoImagenDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoImagen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoImagen() {
		return this.jButtonActualizarToolBarTipoImagen;
	}
	
	public JButton getjButtonEliminarToolBarTipoImagen() {
		return this.jButtonEliminarToolBarTipoImagen;
	}
	
	public JButton getjButtonCancelarToolBarTipoImagen() {
		return this.jButtonCancelarToolBarTipoImagen;
	}		
	
	public JButton getjButtonProcesarInformacionTipoImagen() {
		return this.jButtonProcesarInformacionTipoImagen;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoImagen)	{
		this.jButtonProcesarInformacionTipoImagen = jButtonProcesarInformacionTipoImagen;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoImagen() {
		return this.jComboBoxTiposAccionesTipoImagen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoImagen(
			JComboBox jComboBoxTiposRelacionesTipoImagen) {
		this.jComboBoxTiposRelacionesTipoImagen = jComboBoxTiposRelacionesTipoImagen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoImagen(
			JComboBox jComboBoxTiposAccionesTipoImagen) {
		this.jComboBoxTiposAccionesTipoImagen = jComboBoxTiposAccionesTipoImagen;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoImagen() {
		return this.jComboBoxTiposAccionesFormularioTipoImagen;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoImagen(
			JComboBox jComboBoxTiposAccionesFormularioTipoImagen) {
		this.jComboBoxTiposAccionesFormularioTipoImagen = jComboBoxTiposAccionesFormularioTipoImagen;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoimagenSessionBean=new TipoImagenSessionBean();
		
		this.tipoimagenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoimagenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoimagenSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoImagenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoImagenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoImagenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Imagen MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoImagenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoImagen= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoImagen=new JButtonMe();
				this.jButtonModificarToolBarTipoImagen=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoImagen,this.jTtoolBarDetalleTipoImagen,
							"actualizar","actualizar","Actualizar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoImagen,this.jTtoolBarDetalleTipoImagen,
							"eliminar","eliminar","Eliminar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoImagen,this.jTtoolBarDetalleTipoImagen,
							"cancelar","cancelar","Cancelar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoImagen,this.jTtoolBarDetalleTipoImagen,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoImagen,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoImagen,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoImagen,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoImagen=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoImagen=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoImagen=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoImagen=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoImagen=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoImagen= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoImagen.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoImagen,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoImagen= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoImagen.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoImagen,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoImagen= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoImagen.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoImagen,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoImagen= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoImagen.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoImagen,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoImagen= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoImagen.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoImagen,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoImagen= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoImagen.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoImagen,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoImagen= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoImagen.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoImagen,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoImagen= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoImagen.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoImagen,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoImagen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoImagen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoImagen,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoImagen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoImagen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoImagen,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoImagen.add(this.jMenuItemDetalleCerrarTipoImagen);
		
		this.jmenuDetalleAccionesTipoImagen.add(this.jMenuItemActualizarTipoImagen);
		this.jmenuDetalleAccionesTipoImagen.add(this.jMenuItemEliminarTipoImagen);
		this.jmenuDetalleAccionesTipoImagen.add(this.jMenuItemCancelarTipoImagen);		
		
		//this.jmenuDetalleDatosTipoImagen.add(this.jMenuItemDetalleAbrirOrderByTipoImagen);				
		this.jmenuDetalleDatosTipoImagen.add(this.jMenuItemDetalleMostarOcultarTipoImagen);				
				
		//this.jmenuDetalleAccionesTipoImagen.add(this.jMenuItemGuardarCambiosTipoImagen);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoImagen.add(this.jmenuDetalleArchivoTipoImagen);		
		this.jmenuBarDetalleTipoImagen.add(this.jmenuDetalleAccionesTipoImagen);		
		this.jmenuBarDetalleTipoImagen.add(this.jmenuDetalleDatosTipoImagen);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoImagen);				
	}
	
	
	public void inicializarElementosCamposTipoImagen() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoImagen = new JLabelMe();
		jLabelIdTipoImagen.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoImagen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoImagen = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoImagen.setToolTipText(TipoImagenConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoImagen= new GridBagLayout();

		this.jPanelidTipoImagen.setLayout(this.gridaBagLayoutTipoImagen);

		jTextFieldidTipoImagen = new JTextFieldMe();
		jTextFieldidTipoImagen.setText("Id");

		jTextFieldidTipoImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoImagen = new JLabelMe();
		this.jLabelcodigoTipoImagen.setText(""+TipoImagenConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoImagen.setToolTipText("Codigo");
		this.jLabelcodigoTipoImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoImagen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoImagen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoImagen.setToolTipText(TipoImagenConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoImagen = new GridBagLayout();
		this.jPanelcodigoTipoImagen.setLayout(this.gridaBagLayoutTipoImagen);


		jTextFieldcodigoTipoImagen= new JTextFieldMe();

		jTextFieldcodigoTipoImagen.setEnabled(false);
		jTextFieldcodigoTipoImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoImagen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoImagenBusqueda= new JButtonMe();
		this.jButtoncodigoTipoImagenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoImagenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoImagenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoImagenBusqueda.setText("U");
		this.jButtoncodigoTipoImagenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoImagenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoImagenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoImagen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoImagen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoImagenBusqueda"));

		if(this.tipoimagenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoImagenBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoImagen = new JLabelMe();
		this.jLabelnombreTipoImagen.setText(""+TipoImagenConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoImagen.setToolTipText("Nombre");
		this.jLabelnombreTipoImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoImagen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoImagen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoImagen.setToolTipText(TipoImagenConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoImagen = new GridBagLayout();
		this.jPanelnombreTipoImagen.setLayout(this.gridaBagLayoutTipoImagen);


		jTextAreanombreTipoImagen= new JTextAreaMe();
		jTextAreanombreTipoImagen.setEnabled(false);
		jTextAreanombreTipoImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoImagen.setLineWrap(true);
		jTextAreanombreTipoImagen.setWrapStyleWord(true);
		jTextAreanombreTipoImagen.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoImagen.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoImagen,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoImagen = new JScrollPane(jTextAreanombreTipoImagen);
		jscrollPanenombreTipoImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoImagenBusqueda= new JButtonMe();
		this.jButtonnombreTipoImagenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoImagenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoImagenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoImagenBusqueda.setText("U");
		this.jButtonnombreTipoImagenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoImagenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoImagenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoImagen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoImagen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoImagenBusqueda"));

		if(this.tipoimagenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoImagenBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoImagen() {
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
		//this.jInternalFrameDetalleTipoImagen = new TipoImagenBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Imagen DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoImagen= new GridBagLayout();
		

		
		String sToolTipTipoImagen="";
		sToolTipTipoImagen=TipoImagenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoImagen+="(Seguridad.TipoImagen)";
		}
		
		if(!this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoImagen+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoImagen = new JButtonMe();
		this.jButtonModificarTipoImagen = new JButtonMe();
        this.jButtonActualizarTipoImagen = new JButtonMe();
        this.jButtonEliminarTipoImagen = new JButtonMe();
        this.jButtonCancelarTipoImagen = new JButtonMe();
        this.jButtonGuardarCambiosTipoImagen = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoImagen = new JButtonMe();
		this.jButtonCerrarTipoImagen = new JButtonMe();
		
		this.jScrollPanelDatosTipoImagen = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoImagen = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoImagen = new JScrollPane();
				
		
		
		this.jPanelCamposTipoImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Imagen";
		
		if(!this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Imagens" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoImagen.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoImagen.setName("jPanelCamposTipoImagen"); 

		this.jPanelCamposOcultosTipoImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoImagen.setName("jPanelCamposOcultosTipoImagen"); 

        this.jPanelAccionesTipoImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoImagen.setToolTipText("Acciones");
        this.jPanelAccionesTipoImagen.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoImagen.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoImagen.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoImagen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoImagen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoImagen, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoImagen, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoImagen, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoImagen, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoImagen.setText("Nuevo");
		this.jButtonModificarTipoImagen.setText("Editar");
        this.jButtonActualizarTipoImagen.setText("Actualizar");
        this.jButtonEliminarTipoImagen.setText("Eliminar");
        this.jButtonCancelarTipoImagen.setText("Cancelar");
        this.jButtonGuardarCambiosTipoImagen.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoImagen.setText("Guardar");
		this.jButtonCerrarTipoImagen.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoImagen,"nuevo_button","Nuevo",this.tipoimagenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoImagen,"modificar_button","Editar",this.tipoimagenSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoImagen,"actualizar_button","Actualizar",this.tipoimagenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoImagen,"eliminar_button","Eliminar",this.tipoimagenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoImagen,"cancelar_button","Cancelar",this.tipoimagenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoImagen,"guardarcambios_button","Guardar",this.tipoimagenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoImagen,"guardarcambiostabla_button","Guardar",this.tipoimagenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoImagen,"cerrar_button","Salir",this.tipoimagenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoImagen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoImagen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoImagen, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoImagen.setToolTipText("Nuevo"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoImagen.setToolTipText("Editar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoImagen.setToolTipText("Actualizar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoImagen.setToolTipText("Eliminar)"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoImagen.setToolTipText("Cancelar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoImagen.setToolTipText("Guardar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoImagen.setToolTipText("Guardar"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoImagen.setToolTipText("Salir"+" "+TipoImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoImagen";
		inputMap = this.jButtonNuevoTipoImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoImagen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoImagen"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoImagen";
		inputMap = this.jButtonActualizarTipoImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoImagen"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoImagen";
		inputMap = this.jButtonEliminarTipoImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoImagen"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoImagen";
		inputMap = this.jButtonCancelarTipoImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoImagen"));
		
		//CERRAR		
		sMapKey = "CerrarTipoImagen";
		inputMap = this.jButtonCerrarTipoImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoImagen"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoImagen";
		inputMap = this.jButtonGuardarCambiosTablaTipoImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoImagen"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoImagen = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoImagen.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoImagen.setToolTipText("Nuevo TipoImagen");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoImagen, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoImagen = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoImagen.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoImagen.setToolTipText("Sin Cerrar Ventana TipoImagen");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoImagen, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoImagen = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoImagen.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoImagen.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoImagen, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoImagen = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoImagen.setText("Accion");
		this.jComboBoxTiposAccionesTipoImagen.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoImagen = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoImagen.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoImagen.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoImagen = new JLabelMe();
		
		this.jLabelAccionesTipoImagen.setText("Acciones");		
		this.jLabelAccionesTipoImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoImagen();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoImagen();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoImagen=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoImagen,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoImagen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoImagen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoImagen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoImagen.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoImagen.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoImagen.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoImagen, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoImagen = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoImagen = new GridBagLayout();
		
		this.jPanelCamposTipoImagen.setLayout(gridaBagLayoutCamposTipoImagen);
		this.jPanelCamposOcultosTipoImagen.setLayout(gridaBagLayoutCamposOcultosTipoImagen);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoImagen = new GridBagConstraints();
	this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoImagen.gridy = 0;
	this.gridBagConstraintsTipoImagen.gridx = 0;
	this.gridBagConstraintsTipoImagen.ipadx = 0;
	this.gridBagConstraintsTipoImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoImagen.add(jLabelIdTipoImagen, this.gridBagConstraintsTipoImagen);



	this.gridBagConstraintsTipoImagen = new GridBagConstraints();
	this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoImagen.gridy = 0;
	this.gridBagConstraintsTipoImagen.gridx = 1;
	this.gridBagConstraintsTipoImagen.ipadx = 0;
	this.gridBagConstraintsTipoImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoImagen.add(jTextFieldidTipoImagen, this.gridBagConstraintsTipoImagen);


	this.gridBagConstraintsTipoImagen = new GridBagConstraints();
	this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoImagen.gridy = 0;
	this.gridBagConstraintsTipoImagen.gridx = 0;
	this.gridBagConstraintsTipoImagen.ipadx = 0;
	this.gridBagConstraintsTipoImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoImagen.add(jLabelcodigoTipoImagen, this.gridBagConstraintsTipoImagen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		//this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImagen.gridy = 0;
		this.gridBagConstraintsTipoImagen.gridx = 2;
		this.gridBagConstraintsTipoImagen.ipadx = 0;
		this.gridBagConstraintsTipoImagen.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoImagen.add(jButtoncodigoTipoImagenBusqueda, this.gridBagConstraintsTipoImagen);
	}

	this.gridBagConstraintsTipoImagen = new GridBagConstraints();
	this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoImagen.gridy = 0;
	this.gridBagConstraintsTipoImagen.gridx = 1;
	this.gridBagConstraintsTipoImagen.ipadx = 0;
	this.gridBagConstraintsTipoImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoImagen.add(jTextFieldcodigoTipoImagen, this.gridBagConstraintsTipoImagen);


	this.gridBagConstraintsTipoImagen = new GridBagConstraints();
	this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoImagen.gridy = 0;
	this.gridBagConstraintsTipoImagen.gridx = 0;
	this.gridBagConstraintsTipoImagen.ipadx = 0;
	this.gridBagConstraintsTipoImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoImagen.add(jLabelnombreTipoImagen, this.gridBagConstraintsTipoImagen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		//this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImagen.gridy = 0;
		this.gridBagConstraintsTipoImagen.gridx = 2;
		this.gridBagConstraintsTipoImagen.ipadx = 0;
		this.gridBagConstraintsTipoImagen.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoImagen.add(jButtonnombreTipoImagenBusqueda, this.gridBagConstraintsTipoImagen);
	}

	this.gridBagConstraintsTipoImagen = new GridBagConstraints();
	this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoImagen.gridy = 0;
	this.gridBagConstraintsTipoImagen.gridx = 1;
	this.gridBagConstraintsTipoImagen.ipadx = 0;
	this.gridBagConstraintsTipoImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoImagen.add(jscrollPanenombreTipoImagen, this.gridBagConstraintsTipoImagen);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoImagen = new GridBagConstraints();
	this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoImagen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoImagen.gridy = iYPanelCamposTipoImagen;
	this.gridBagConstraintsTipoImagen.gridx = iXPanelCamposTipoImagen++;
	this.gridBagConstraintsTipoImagen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoImagen.add(this.jPanelidTipoImagen, this.gridBagConstraintsTipoImagen);



	if(iXPanelCamposTipoImagen % 1==0) {
		iXPanelCamposTipoImagen=0;
		iYPanelCamposTipoImagen++;
	}
	this.gridBagConstraintsTipoImagen = new GridBagConstraints();
	this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoImagen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoImagen.gridy = iYPanelCamposTipoImagen;
	this.gridBagConstraintsTipoImagen.gridx = iXPanelCamposTipoImagen++;
	this.gridBagConstraintsTipoImagen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoImagen.add(this.jPanelcodigoTipoImagen, this.gridBagConstraintsTipoImagen);



	if(iXPanelCamposTipoImagen % 1==0) {
		iXPanelCamposTipoImagen=0;
		iYPanelCamposTipoImagen++;
	}
	this.gridBagConstraintsTipoImagen = new GridBagConstraints();
	this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoImagen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoImagen.gridy = iYPanelCamposTipoImagen;
	this.gridBagConstraintsTipoImagen.gridx = iXPanelCamposTipoImagen++;
	this.gridBagConstraintsTipoImagen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoImagen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoImagen.add(this.jPanelnombreTipoImagen, this.gridBagConstraintsTipoImagen);



	if(iXPanelCamposTipoImagen % 1==0) {
		iXPanelCamposTipoImagen=0;
		iYPanelCamposTipoImagen++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoImagen= new GridBagLayout();
		this.jPanelAccionesTipoImagen.setLayout(gridaBagLayoutAccionesTipoImagen);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoImagen= new GridBagLayout();
		this.jPanelAccionesFormularioTipoImagen.setLayout(gridaBagLayoutAccionesFormularioTipoImagen);
		
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoImagen.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoImagen.add(this.jComboBoxTiposAccionesFormularioTipoImagen, this.gridBagConstraintsTipoImagen);

		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoImagen.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoImagen.add(this.jCheckBoxPostAccionNuevoTipoImagen, this.gridBagConstraintsTipoImagen);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoimagenSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoImagen.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoImagen.add(this.jCheckBoxPostAccionSinCerrarTipoImagen, this.gridBagConstraintsTipoImagen);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoimagenSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoimagenSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoImagen.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoImagen.add(this.jCheckBoxPostAccionSinMensajeTipoImagen, this.gridBagConstraintsTipoImagen);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagen.gridy = 0;
		this.gridBagConstraintsTipoImagen.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoImagen.add(this.jButtonModificarTipoImagen, this.gridBagConstraintsTipoImagen);							

		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagen.gridy = 0;
		this.gridBagConstraintsTipoImagen.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoImagen.add(this.jButtonEliminarTipoImagen, this.gridBagConstraintsTipoImagen);
		
			
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.gridy = 0;		
		this.gridBagConstraintsTipoImagen.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoImagen.add(this.jButtonActualizarTipoImagen, this.gridBagConstraintsTipoImagen);


		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.gridy = 0;		
		this.gridBagConstraintsTipoImagen.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoImagen.add(this.jButtonGuardarCambiosTipoImagen, this.gridBagConstraintsTipoImagen);	
		
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.gridy = 0;		
		this.gridBagConstraintsTipoImagen.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoImagen.add(this.jButtonCancelarTipoImagen, this.gridBagConstraintsTipoImagen);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoImagen = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoImagen);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoimagenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();						
			this.gridBagConstraintsTipoImagen.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoImagen.gridx = 0;		
			//this.gridBagConstraintsTipoImagen.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagen.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoImagen.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoImagen.gridx =0;
		this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoImagen.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoImagen, this.gridBagConstraintsTipoImagen);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoImagenJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoImagen = new TipoImagenBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Imagen DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Imagen DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Imagen Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoImagenModel tipoimagenModel=new TipoImagenModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoImagenModel.TipoImagenFocusTraversalPolicy tipoimagenFocusTraversalPolicy = tipoimagenModel.new TipoImagenFocusTraversalPolicy(this);
			
			//tipoimagenFocusTraversalPolicy.settipoimagenJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoimagenModel);
			
			
			this.jContentPaneDetalleTipoImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoImagen = new GridBagLayout();	
			this.jContentPaneDetalleTipoImagen.setLayout(gridaBagLayoutDetalleTipoImagen);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoImagen = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoImagen = new GridBagConstraints();
				this.gridBagConstraintsTipoImagen.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoImagen.gridx = 0;
					
				
				this.jContentPaneDetalleTipoImagen.add(jTtoolBarDetalleTipoImagen, gridBagConstraintsTipoImagen);								
				
}
			
			this.jScrollPanelDatosEdicionTipoImagen=   new JScrollPane(jContentPaneDetalleTipoImagen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoImagen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoImagen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoImagen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoImagen=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoImagen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoImagen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoImagen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoImagen.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoImagen.gridx = 0;
	        
			this.jContentPaneDetalleTipoImagen.add(jPanelCamposTipoImagen, gridBagConstraintsTipoImagen);
			
			
			
			
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
						&& tipoimagenSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipoimagenSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoImagen= new GridBagConstraints();
						this.gridBagConstraintsTipoImagen.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoImagen.gridx = 0;
						this.jContentPaneDetalleTipoImagen.add(this.jTabbedPaneRelacionesTipoImagen, this.gridBagConstraintsTipoImagen);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoImagen.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoImagen.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoImagen = new GridBagConstraints();
					this.gridBagConstraintsTipoImagen.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoImagen.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoImagen.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoImagen.gridx = 0;
					
				
					this.jContentPaneDetalleTipoImagen.add(jPanelCamposOcultosTipoImagen, gridBagConstraintsTipoImagen);
				
					this.jPanelCamposOcultosTipoImagen.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoImagen.gridx = 0;
	        this.gridBagConstraintsTipoImagen.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoImagen.add(this.jPanelAccionesFormularioTipoImagen, this.gridBagConstraintsTipoImagen);							
			
			
			
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
	        this.gridBagConstraintsTipoImagen.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoImagen.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoImagen.add(this.jPanelAccionesTipoImagen, this.gridBagConstraintsTipoImagen);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoImagen);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoImagen=   new JScrollPane(this.jPanelCamposTipoImagen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoImagen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoImagen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoImagen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoImagen.gridx = 0;
			this.gridBagConstraintsTipoImagen.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoImagen.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoImagen.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoImagen, this.gridBagConstraintsTipoImagen);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoImagen.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoImagen, this.gridBagConstraintsTipoImagen);			
			
			this.gridBagConstraintsTipoImagen = new GridBagConstraints();
			this.gridBagConstraintsTipoImagen.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoImagen.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoImagen, this.gridBagConstraintsTipoImagen);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoImagen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoImagen, this.gridBagConstraintsTipoImagen);
			
			
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoImagen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoImagen, this.gridBagConstraintsTipoImagen);
		
			
		this.gridBagConstraintsTipoImagen = new GridBagConstraints();
		this.gridBagConstraintsTipoImagen.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoImagen.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoImagen, this.gridBagConstraintsTipoImagen);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoImagen;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoImagen;
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
