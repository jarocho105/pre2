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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.TipoUnidadConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class TipoUnidadDetalleFormJInternalFrame extends TipoUnidadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoUnidad;
	
	protected JMenuBar jmenuBarDetalleTipoUnidad;
	
	protected JMenu jmenuDetalleTipoUnidad;
	protected JMenu jmenuDetalleArchivoTipoUnidad;
	protected JMenu jmenuDetalleAccionesTipoUnidad;
	protected JMenu jmenuDetalleDatosTipoUnidad;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoUnidad;	
	protected GridBagConstraints gridBagConstraintsTipoUnidad;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoUnidadBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoUnidad;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoUnidadSessionBean tipounidadSessionBean;
	
	

	public UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame=null;
	public UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteUnidad=false;
	public UnidadSessionBean unidadSessionBean;
	
		
	
	public TipoUnidadLogic tipounidadLogic;
	
	public JScrollPane jScrollPanelDatosTipoUnidad;
	public JScrollPane jScrollPanelDatosEdicionTipoUnidad;
	public JScrollPane jScrollPanelDatosGeneralTipoUnidad;
	
	protected JPanel jPanelCamposTipoUnidad;    
	protected JPanel jPanelCamposOcultosTipoUnidad;    	
	protected JPanel jPanelAccionesTipoUnidad;
	protected JPanel jPanelAccionesFormularioTipoUnidad;
    
	
	
	protected Integer iXPanelCamposTipoUnidad=0;
	protected Integer iYPanelCamposTipoUnidad=0;
	
	protected Integer iXPanelCamposOcultosTipoUnidad=0;
	protected Integer iYPanelCamposOcultosTipoUnidad=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoUnidad;
	public JButton jButtonModificarTipoUnidad;
	public JButton jButtonActualizarTipoUnidad;
    public JButton jButtonEliminarTipoUnidad;
	public JButton jButtonCancelarTipoUnidad;
    public JButton jButtonGuardarCambiosTipoUnidad;
	public JButton jButtonGuardarCambiosTablaTipoUnidad;
	protected JButton jButtonCerrarTipoUnidad;
	
	
	protected JButton jButtonProcesarInformacionTipoUnidad;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoUnidad;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoUnidad;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoUnidad;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoUnidad;
	protected JButton jButtonModificarToolBarTipoUnidad;
	protected JButton jButtonActualizarToolBarTipoUnidad;
    protected JButton jButtonEliminarToolBarTipoUnidad;
	protected JButton jButtonCancelarToolBarTipoUnidad;
    protected JButton jButtonGuardarCambiosToolBarTipoUnidad;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoUnidad;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoUnidad;
	protected JButton jButtonCerrarToolBarTipoUnidad;
	
	protected JButton jButtonProcesarInformacionToolBarTipoUnidad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoUnidad;
	protected JMenuItem jMenuItemModificarTipoUnidad;
	protected JMenuItem jMenuItemActualizarTipoUnidad;
    protected JMenuItem jMenuItemEliminarTipoUnidad;
	protected JMenuItem jMenuItemCancelarTipoUnidad;
    protected JMenuItem jMenuItemGuardarCambiosTipoUnidad;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoUnidad;
	protected JMenuItem jMenuItemCerrarTipoUnidad;
	protected JMenuItem jMenuItemDetalleCerrarTipoUnidad;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoUnidad;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoUnidad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoUnidad;
	protected JMenuItem jMenuItemMostrarOcultarTipoUnidad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoUnidad;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoUnidad;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoUnidad;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoUnidad;
	public JLabel jLabelIdTipoUnidad;
	public JTextFieldMe jTextFieldidTipoUnidad;
	public JButton jButtonidTipoUnidadBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoUnidad;
	public JLabel jLabelnombreTipoUnidad;
	public JTextField jTextFieldnombreTipoUnidad;
	public JButton jButtonnombreTipoUnidadBusqueda= new JButtonMe();

	public JPanel jPanelsiglasTipoUnidad;
	public JLabel jLabelsiglasTipoUnidad;
	public JTextField jTextFieldsiglasTipoUnidad;
	public JButton jButtonsiglasTipoUnidadBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoUnidad;
	
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
	
	public TipoUnidadDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoUnidad=new JPanel();
				this.jPanelAccionesFormularioTipoUnidad=new JPanel();
				this.jmenuBarDetalleTipoUnidad=new JMenuBar();
				this.jTtoolBarDetalleTipoUnidad=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoUnidadDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoUnidadDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoUnidadDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoUnidadDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoUnidadDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoUnidad() {
		return this.jButtonActualizarToolBarTipoUnidad;
	}
	
	public JButton getjButtonEliminarToolBarTipoUnidad() {
		return this.jButtonEliminarToolBarTipoUnidad;
	}
	
	public JButton getjButtonCancelarToolBarTipoUnidad() {
		return this.jButtonCancelarToolBarTipoUnidad;
	}		
	
	public JButton getjButtonProcesarInformacionTipoUnidad() {
		return this.jButtonProcesarInformacionTipoUnidad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoUnidad)	{
		this.jButtonProcesarInformacionTipoUnidad = jButtonProcesarInformacionTipoUnidad;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoUnidad() {
		return this.jComboBoxTiposAccionesTipoUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoUnidad(
			JComboBox jComboBoxTiposRelacionesTipoUnidad) {
		this.jComboBoxTiposRelacionesTipoUnidad = jComboBoxTiposRelacionesTipoUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoUnidad(
			JComboBox jComboBoxTiposAccionesTipoUnidad) {
		this.jComboBoxTiposAccionesTipoUnidad = jComboBoxTiposAccionesTipoUnidad;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoUnidad() {
		return this.jComboBoxTiposAccionesFormularioTipoUnidad;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoUnidad(
			JComboBox jComboBoxTiposAccionesFormularioTipoUnidad) {
		this.jComboBoxTiposAccionesFormularioTipoUnidad = jComboBoxTiposAccionesFormularioTipoUnidad;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipounidadSessionBean=new TipoUnidadSessionBean();
		
		this.tipounidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipounidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipounidadSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.unidadSessionBean=new UnidadSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoUnidadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoUnidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoUnidadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Unidad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipounidadSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoUnidadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoUnidad= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoUnidad=new JButtonMe();
				this.jButtonModificarToolBarTipoUnidad=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoUnidad,this.jTtoolBarDetalleTipoUnidad,
							"actualizar","actualizar","Actualizar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoUnidad,this.jTtoolBarDetalleTipoUnidad,
							"eliminar","eliminar","Eliminar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoUnidad,this.jTtoolBarDetalleTipoUnidad,
							"cancelar","cancelar","Cancelar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoUnidad,this.jTtoolBarDetalleTipoUnidad,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoUnidad=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoUnidad=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoUnidad=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoUnidad=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoUnidad=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoUnidad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoUnidad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoUnidad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoUnidad= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoUnidad.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoUnidad,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoUnidad= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoUnidad.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoUnidad,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoUnidad= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoUnidad.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoUnidad,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoUnidad= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoUnidad.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoUnidad,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoUnidad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoUnidad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoUnidad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoUnidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoUnidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoUnidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoUnidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoUnidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoUnidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoUnidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoUnidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoUnidad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoUnidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoUnidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoUnidad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoUnidad.add(this.jMenuItemDetalleCerrarTipoUnidad);
		
		this.jmenuDetalleAccionesTipoUnidad.add(this.jMenuItemActualizarTipoUnidad);
		this.jmenuDetalleAccionesTipoUnidad.add(this.jMenuItemEliminarTipoUnidad);
		this.jmenuDetalleAccionesTipoUnidad.add(this.jMenuItemCancelarTipoUnidad);		
		
		//this.jmenuDetalleDatosTipoUnidad.add(this.jMenuItemDetalleAbrirOrderByTipoUnidad);				
		this.jmenuDetalleDatosTipoUnidad.add(this.jMenuItemDetalleMostarOcultarTipoUnidad);				
				
		//this.jmenuDetalleAccionesTipoUnidad.add(this.jMenuItemGuardarCambiosTipoUnidad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoUnidad.add(this.jmenuDetalleArchivoTipoUnidad);		
		this.jmenuBarDetalleTipoUnidad.add(this.jmenuDetalleAccionesTipoUnidad);		
		this.jmenuBarDetalleTipoUnidad.add(this.jmenuDetalleDatosTipoUnidad);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoUnidad.add(this.jmenuDetalleTipoUnidad);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoUnidad);				
	}
	
	
	public void inicializarElementosCamposTipoUnidad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoUnidad = new JLabelMe();
		jLabelIdTipoUnidad.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoUnidad = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoUnidad.setToolTipText(TipoUnidadConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoUnidad= new GridBagLayout();

		this.jPanelidTipoUnidad.setLayout(this.gridaBagLayoutTipoUnidad);

		jTextFieldidTipoUnidad = new JTextFieldMe();
		jTextFieldidTipoUnidad.setText("Id");

		jTextFieldidTipoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoUnidad = new JLabelMe();
		this.jLabelnombreTipoUnidad.setText(""+TipoUnidadConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoUnidad.setToolTipText("Nombre");
		this.jLabelnombreTipoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoUnidad.setToolTipText(TipoUnidadConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoUnidad = new GridBagLayout();
		this.jPanelnombreTipoUnidad.setLayout(this.gridaBagLayoutTipoUnidad);


		jTextFieldnombreTipoUnidad= new JTextFieldMe();

		jTextFieldnombreTipoUnidad.setEnabled(false);
		jTextFieldnombreTipoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreTipoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreTipoUnidadBusqueda= new JButtonMe();
		this.jButtonnombreTipoUnidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoUnidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoUnidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoUnidadBusqueda.setText("U");
		this.jButtonnombreTipoUnidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoUnidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoUnidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreTipoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreTipoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoUnidadBusqueda"));

		if(this.tipounidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoUnidadBusqueda.setVisible(false);		}


					
		this.jLabelsiglasTipoUnidad = new JLabelMe();
		this.jLabelsiglasTipoUnidad.setText(""+TipoUnidadConstantesFunciones.LABEL_SIGLAS+" : *");
		this.jLabelsiglasTipoUnidad.setToolTipText("Siglas");
		this.jLabelsiglasTipoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglasTipoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglasTipoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsiglasTipoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsiglasTipoUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsiglasTipoUnidad.setToolTipText(TipoUnidadConstantesFunciones.LABEL_SIGLAS);
		this.gridaBagLayoutTipoUnidad = new GridBagLayout();
		this.jPanelsiglasTipoUnidad.setLayout(this.gridaBagLayoutTipoUnidad);


		jTextFieldsiglasTipoUnidad= new JTextFieldMe();

		jTextFieldsiglasTipoUnidad.setEnabled(false);
		jTextFieldsiglasTipoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasTipoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasTipoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglasTipoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsiglasTipoUnidadBusqueda= new JButtonMe();
		this.jButtonsiglasTipoUnidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglasTipoUnidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglasTipoUnidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsiglasTipoUnidadBusqueda.setText("U");
		this.jButtonsiglasTipoUnidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsiglasTipoUnidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsiglasTipoUnidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsiglasTipoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsiglasTipoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"siglasTipoUnidadBusqueda"));

		if(this.tipounidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsiglasTipoUnidadBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoUnidad() {
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
		//this.jInternalFrameDetalleTipoUnidad = new TipoUnidadBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Unidad DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoUnidad= new GridBagLayout();
		

		
		String sToolTipTipoUnidad="";
		sToolTipTipoUnidad=TipoUnidadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoUnidad+="(Inventario.TipoUnidad)";
		}
		
		if(!this.tipounidadSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoUnidad+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoUnidad = new JButtonMe();
		this.jButtonModificarTipoUnidad = new JButtonMe();
        this.jButtonActualizarTipoUnidad = new JButtonMe();
        this.jButtonEliminarTipoUnidad = new JButtonMe();
        this.jButtonCancelarTipoUnidad = new JButtonMe();
        this.jButtonGuardarCambiosTipoUnidad = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoUnidad = new JButtonMe();
		this.jButtonCerrarTipoUnidad = new JButtonMe();
		
		this.jScrollPanelDatosTipoUnidad = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoUnidad = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoUnidad = new JScrollPane();
				
		
		
		this.jPanelCamposTipoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Unidad";
		
		if(!this.tipounidadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Unidades" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoUnidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoUnidad.setName("jPanelCamposTipoUnidad"); 

		this.jPanelCamposOcultosTipoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoUnidad.setName("jPanelCamposOcultosTipoUnidad"); 

        this.jPanelAccionesTipoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoUnidad.setToolTipText("Acciones");
        this.jPanelAccionesTipoUnidad.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoUnidad.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoUnidad.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoUnidad.setText("Nuevo");
		this.jButtonModificarTipoUnidad.setText("Editar");
        this.jButtonActualizarTipoUnidad.setText("Actualizar");
        this.jButtonEliminarTipoUnidad.setText("Eliminar");
        this.jButtonCancelarTipoUnidad.setText("Cancelar");
        this.jButtonGuardarCambiosTipoUnidad.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoUnidad.setText("Guardar");
		this.jButtonCerrarTipoUnidad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoUnidad,"nuevo_button","Nuevo",this.tipounidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoUnidad,"modificar_button","Editar",this.tipounidadSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoUnidad,"actualizar_button","Actualizar",this.tipounidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoUnidad,"eliminar_button","Eliminar",this.tipounidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoUnidad,"cancelar_button","Cancelar",this.tipounidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoUnidad,"guardarcambios_button","Guardar",this.tipounidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoUnidad,"guardarcambiostabla_button","Guardar",this.tipounidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoUnidad,"cerrar_button","Salir",this.tipounidadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoUnidad.setToolTipText("Nuevo"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoUnidad.setToolTipText("Editar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoUnidad.setToolTipText("Actualizar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoUnidad.setToolTipText("Eliminar)"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoUnidad.setToolTipText("Cancelar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoUnidad.setToolTipText("Guardar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoUnidad.setToolTipText("Guardar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoUnidad.setToolTipText("Salir"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoUnidad";
		inputMap = this.jButtonNuevoTipoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoUnidad"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoUnidad";
		inputMap = this.jButtonActualizarTipoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoUnidad"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoUnidad";
		inputMap = this.jButtonEliminarTipoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoUnidad"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoUnidad";
		inputMap = this.jButtonCancelarTipoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoUnidad"));
		
		//CERRAR		
		sMapKey = "CerrarTipoUnidad";
		inputMap = this.jButtonCerrarTipoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoUnidad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoUnidad";
		inputMap = this.jButtonGuardarCambiosTablaTipoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoUnidad"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoUnidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoUnidad.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoUnidad.setToolTipText("Nuevo TipoUnidad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoUnidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoUnidad.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoUnidad.setToolTipText("Sin Cerrar Ventana TipoUnidad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoUnidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoUnidad.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoUnidad.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoUnidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoUnidad.setText("Accion");
		this.jComboBoxTiposAccionesTipoUnidad.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoUnidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoUnidad.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoUnidad.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoUnidad = new JLabelMe();
		
		this.jLabelAccionesTipoUnidad.setText("Acciones");		
		this.jLabelAccionesTipoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoUnidad();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoUnidad();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoUnidad=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoUnidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoUnidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoUnidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoUnidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoUnidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoUnidad.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoUnidad = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoUnidad = new GridBagLayout();
		
		this.jPanelCamposTipoUnidad.setLayout(gridaBagLayoutCamposTipoUnidad);
		this.jPanelCamposOcultosTipoUnidad.setLayout(gridaBagLayoutCamposOcultosTipoUnidad);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
	this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoUnidad.gridy = 0;
	this.gridBagConstraintsTipoUnidad.gridx = 0;
	this.gridBagConstraintsTipoUnidad.ipadx = 0;
	this.gridBagConstraintsTipoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoUnidad.add(jLabelIdTipoUnidad, this.gridBagConstraintsTipoUnidad);



	this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
	this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoUnidad.gridy = 0;
	this.gridBagConstraintsTipoUnidad.gridx = 1;
	this.gridBagConstraintsTipoUnidad.ipadx = 0;
	this.gridBagConstraintsTipoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoUnidad.add(jTextFieldidTipoUnidad, this.gridBagConstraintsTipoUnidad);


	this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
	this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoUnidad.gridy = 0;
	this.gridBagConstraintsTipoUnidad.gridx = 0;
	this.gridBagConstraintsTipoUnidad.ipadx = 0;
	this.gridBagConstraintsTipoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoUnidad.add(jLabelnombreTipoUnidad, this.gridBagConstraintsTipoUnidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		//this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoUnidad.gridy = 0;
		this.gridBagConstraintsTipoUnidad.gridx = 2;
		this.gridBagConstraintsTipoUnidad.ipadx = 0;
		this.gridBagConstraintsTipoUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoUnidad.add(jButtonnombreTipoUnidadBusqueda, this.gridBagConstraintsTipoUnidad);
	}

	this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
	this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoUnidad.gridy = 0;
	this.gridBagConstraintsTipoUnidad.gridx = 1;
	this.gridBagConstraintsTipoUnidad.ipadx = 0;
	this.gridBagConstraintsTipoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoUnidad.add(jTextFieldnombreTipoUnidad, this.gridBagConstraintsTipoUnidad);


	this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
	this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoUnidad.gridy = 0;
	this.gridBagConstraintsTipoUnidad.gridx = 0;
	this.gridBagConstraintsTipoUnidad.ipadx = 0;
	this.gridBagConstraintsTipoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsiglasTipoUnidad.add(jLabelsiglasTipoUnidad, this.gridBagConstraintsTipoUnidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		//this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoUnidad.gridy = 0;
		this.gridBagConstraintsTipoUnidad.gridx = 2;
		this.gridBagConstraintsTipoUnidad.ipadx = 0;
		this.gridBagConstraintsTipoUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelsiglasTipoUnidad.add(jButtonsiglasTipoUnidadBusqueda, this.gridBagConstraintsTipoUnidad);
	}

	this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
	this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoUnidad.gridy = 0;
	this.gridBagConstraintsTipoUnidad.gridx = 1;
	this.gridBagConstraintsTipoUnidad.ipadx = 0;
	this.gridBagConstraintsTipoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsiglasTipoUnidad.add(jTextFieldsiglasTipoUnidad, this.gridBagConstraintsTipoUnidad);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
	this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoUnidad.gridy = iYPanelCamposTipoUnidad;
	this.gridBagConstraintsTipoUnidad.gridx = iXPanelCamposTipoUnidad++;
	this.gridBagConstraintsTipoUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoUnidad.add(this.jPanelidTipoUnidad, this.gridBagConstraintsTipoUnidad);



	if(iXPanelCamposTipoUnidad % 1==0) {
		iXPanelCamposTipoUnidad=0;
		iYPanelCamposTipoUnidad++;
	}
	this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
	this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoUnidad.gridy = iYPanelCamposTipoUnidad;
	this.gridBagConstraintsTipoUnidad.gridx = iXPanelCamposTipoUnidad++;
	this.gridBagConstraintsTipoUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoUnidad.add(this.jPanelnombreTipoUnidad, this.gridBagConstraintsTipoUnidad);



	if(iXPanelCamposTipoUnidad % 1==0) {
		iXPanelCamposTipoUnidad=0;
		iYPanelCamposTipoUnidad++;
	}
	this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
	this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoUnidad.gridy = iYPanelCamposTipoUnidad;
	this.gridBagConstraintsTipoUnidad.gridx = iXPanelCamposTipoUnidad++;
	this.gridBagConstraintsTipoUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoUnidad.add(this.jPanelsiglasTipoUnidad, this.gridBagConstraintsTipoUnidad);



	if(iXPanelCamposTipoUnidad % 1==0) {
		iXPanelCamposTipoUnidad=0;
		iYPanelCamposTipoUnidad++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoUnidad= new GridBagLayout();
		this.jPanelAccionesTipoUnidad.setLayout(gridaBagLayoutAccionesTipoUnidad);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoUnidad= new GridBagLayout();
		this.jPanelAccionesFormularioTipoUnidad.setLayout(gridaBagLayoutAccionesFormularioTipoUnidad);
		
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoUnidad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoUnidad.add(this.jComboBoxTiposAccionesFormularioTipoUnidad, this.gridBagConstraintsTipoUnidad);

		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoUnidad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoUnidad.add(this.jCheckBoxPostAccionNuevoTipoUnidad, this.gridBagConstraintsTipoUnidad);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipounidadSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoUnidad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoUnidad.add(this.jCheckBoxPostAccionSinCerrarTipoUnidad, this.gridBagConstraintsTipoUnidad);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipounidadSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipounidadSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoUnidad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoUnidad.add(this.jCheckBoxPostAccionSinMensajeTipoUnidad, this.gridBagConstraintsTipoUnidad);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUnidad.gridy = 0;
		this.gridBagConstraintsTipoUnidad.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoUnidad.add(this.jButtonModificarTipoUnidad, this.gridBagConstraintsTipoUnidad);							

		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUnidad.gridy = 0;
		this.gridBagConstraintsTipoUnidad.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoUnidad.add(this.jButtonEliminarTipoUnidad, this.gridBagConstraintsTipoUnidad);
		
			
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.gridy = 0;		
		this.gridBagConstraintsTipoUnidad.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoUnidad.add(this.jButtonActualizarTipoUnidad, this.gridBagConstraintsTipoUnidad);


		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.gridy = 0;		
		this.gridBagConstraintsTipoUnidad.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoUnidad.add(this.jButtonGuardarCambiosTipoUnidad, this.gridBagConstraintsTipoUnidad);	
		
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.gridy = 0;		
		this.gridBagConstraintsTipoUnidad.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoUnidad.add(this.jButtonCancelarTipoUnidad, this.gridBagConstraintsTipoUnidad);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoUnidad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoUnidad);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipounidadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();						
			this.gridBagConstraintsTipoUnidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoUnidad.gridx = 0;		
			//this.gridBagConstraintsTipoUnidad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoUnidad.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoUnidad.gridx =0;
		this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoUnidad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoUnidad, this.gridBagConstraintsTipoUnidad);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoUnidadJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoUnidad = new TipoUnidadBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Unidad DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Unidad DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Unidad Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoUnidadModel tipounidadModel=new TipoUnidadModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoUnidadModel.TipoUnidadFocusTraversalPolicy tipounidadFocusTraversalPolicy = tipounidadModel.new TipoUnidadFocusTraversalPolicy(this);
			
			//tipounidadFocusTraversalPolicy.settipounidadJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipounidadModel);
			
			
			this.jContentPaneDetalleTipoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoUnidad = new GridBagLayout();	
			this.jContentPaneDetalleTipoUnidad.setLayout(gridaBagLayoutDetalleTipoUnidad);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoUnidad = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
				this.gridBagConstraintsTipoUnidad.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoUnidad.gridx = 0;
					
				
				this.jContentPaneDetalleTipoUnidad.add(jTtoolBarDetalleTipoUnidad, gridBagConstraintsTipoUnidad);								
				
}
			
			this.jScrollPanelDatosEdicionTipoUnidad=   new JScrollPane(jContentPaneDetalleTipoUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoUnidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoUnidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoUnidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoUnidad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoUnidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoUnidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoUnidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoUnidad.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoUnidad.gridx = 0;
	        
			this.jContentPaneDetalleTipoUnidad.add(jPanelCamposTipoUnidad, gridBagConstraintsTipoUnidad);
			
			
			
			
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
						&& tipounidadSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameUnidad(this.puedeCargarPorParteUnidad,false,-1);
					
					if(this.tipounidadSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoUnidad= new GridBagConstraints();
						this.gridBagConstraintsTipoUnidad.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoUnidad.gridx = 0;
						this.jContentPaneDetalleTipoUnidad.add(this.jTabbedPaneRelacionesTipoUnidad, this.gridBagConstraintsTipoUnidad);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoUnidad.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameUnidad(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoUnidad.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
					this.gridBagConstraintsTipoUnidad.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoUnidad.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoUnidad.gridx = 0;
					
				
					this.jContentPaneDetalleTipoUnidad.add(jPanelCamposOcultosTipoUnidad, gridBagConstraintsTipoUnidad);
				
					this.jPanelCamposOcultosTipoUnidad.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoUnidad.gridx = 0;
	        this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoUnidad.add(this.jPanelAccionesFormularioTipoUnidad, this.gridBagConstraintsTipoUnidad);							
			
			
			
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
	        this.gridBagConstraintsTipoUnidad.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoUnidad.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoUnidad.add(this.jPanelAccionesTipoUnidad, this.gridBagConstraintsTipoUnidad);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoUnidad);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoUnidad=   new JScrollPane(this.jPanelCamposTipoUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoUnidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoUnidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoUnidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoUnidad.gridx = 0;
			this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoUnidad.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoUnidad, this.gridBagConstraintsTipoUnidad);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoUnidad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoUnidad, this.gridBagConstraintsTipoUnidad);			
			
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoUnidad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoUnidad, this.gridBagConstraintsTipoUnidad);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoUnidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoUnidad, this.gridBagConstraintsTipoUnidad);
			
			
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoUnidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoUnidad, this.gridBagConstraintsTipoUnidad);
		
			
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoUnidad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoUnidad, this.gridBagConstraintsTipoUnidad);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoUnidad;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoUnidad;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameUnidad(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.unidadSessionBean=new UnidadSessionBean();
		this.unidadSessionBean.setConGuardarRelaciones(false);
		this.unidadSessionBean.setEsGuardarRelacionado(true);

		this.unidadBeanSwingJInternalFrame=null;//new UnidadBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.unidadBeanSwingJInternalFramePopup=new UnidadBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.unidadBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.unidadSessionBean.getEsGuardarRelacionado()) {

				UnidadJInternalFrame.STIPO_TAMANIO_GENERAL=TipoUnidadJInternalFrame.STIPO_TAMANIO_GENERAL;
				UnidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoUnidadJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.unidadSessionBean.setEsGuardarRelacionado(true);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.unidadBeanSwingJInternalFrame.setunidadSessionBean(this.unidadSessionBean);

				//this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
				//this.gridBagConstraintsTipoUnidad.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoUnidad.gridx = 0;
				//this.jContentPaneDetalleTipoUnidad.add(this.unidadBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoUnidad);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoUnidad.add("Unidades",this.unidadBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoUnidad.setComponentAt(iIndexTab,this.unidadBeanSwingJInternalFrame.getContentPane());
				}

				//UnidadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.unidadSessionBean.setEsGuardarRelacionado(false);
				this.unidadBeanSwingJInternalFrame=null;//new UnidadBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.unidadSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteUnidad) {
					this.jTabbedPaneRelacionesTipoUnidad.add("Unidades",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarUnidadBeanSwingJInternalFrame(List<TipoUnidad> tipounidads,TipoUnidad tipounidad,UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.tipounidadLogic.getConnexion());

					unidadBeanSwingJInternalFrame.settipounidadsForeignKey(tipounidads);
					unidadBeanSwingJInternalFrame.settipounidadForeignKey(tipounidad);
					unidadBeanSwingJInternalFrame.unidadSessionBean.setisBusquedaDesdeForeignKeySesionTipoUnidad(true);
					unidadBeanSwingJInternalFrame.unidadSessionBean.setlidTipoUnidadActual(tipounidad.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					unidadBeanSwingJInternalFrame.cargarCombosForeignKeyUnidad(unidadBeanSwingJInternalFrame.isCargarCombosDependencia);
					unidadBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoUnidad(true);
					unidadBeanSwingJInternalFrame.setid_tipo_unidadFK_IdTipoUnidad(tipounidad.getId());

					if(!this.conCargarFormDetalle) {
						unidadBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					unidadBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoUnidadForeignKey(tipounidad,1,false,true,true);
					unidadBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					unidadBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoUnidad");
					unidadBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoUnidad");
					unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad(true);
					unidadBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesUnidad("n",unidadBeanSwingJInternalFrame.isGuardarCambiosEnLote, unidadBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					unidadBeanSwingJInternalFrame.setAutoscrolls(true);
					unidadBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						unidadBeanSwingJInternalFrame.actualizarEstadoPanelsUnidad("relacionado");
					} else {
						unidadBeanSwingJInternalFrame.actualizarEstadoPanelsUnidad("no_relacionado");
					}

					unidadBeanSwingJInternalFrame.getjButtonRecargarInformacionUnidad().setVisible(false);

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
