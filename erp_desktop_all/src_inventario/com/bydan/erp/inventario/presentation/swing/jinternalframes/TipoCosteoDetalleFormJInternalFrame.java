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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.TipoCosteoConstantesFunciones;

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
public class TipoCosteoDetalleFormJInternalFrame extends TipoCosteoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoCosteo;
	
	protected JMenuBar jmenuBarDetalleTipoCosteo;
	
	protected JMenu jmenuDetalleTipoCosteo;
	protected JMenu jmenuDetalleArchivoTipoCosteo;
	protected JMenu jmenuDetalleAccionesTipoCosteo;
	protected JMenu jmenuDetalleDatosTipoCosteo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoCosteo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCosteo;	
	protected GridBagConstraints gridBagConstraintsTipoCosteo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoCosteoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoCosteo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoCosteoSessionBean tipocosteoSessionBean;
	
	

	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;
	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroInventarioDefecto=false;
	public ParametroInventarioDefectoSessionBean parametroinventariodefectoSessionBean;
	
		
	
	public TipoCosteoLogic tipocosteoLogic;
	
	public JScrollPane jScrollPanelDatosTipoCosteo;
	public JScrollPane jScrollPanelDatosEdicionTipoCosteo;
	public JScrollPane jScrollPanelDatosGeneralTipoCosteo;
	
	protected JPanel jPanelCamposTipoCosteo;    
	protected JPanel jPanelCamposOcultosTipoCosteo;    	
	protected JPanel jPanelAccionesTipoCosteo;
	protected JPanel jPanelAccionesFormularioTipoCosteo;
    
	
	
	protected Integer iXPanelCamposTipoCosteo=0;
	protected Integer iYPanelCamposTipoCosteo=0;
	
	protected Integer iXPanelCamposOcultosTipoCosteo=0;
	protected Integer iYPanelCamposOcultosTipoCosteo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoCosteo;
	public JButton jButtonModificarTipoCosteo;
	public JButton jButtonActualizarTipoCosteo;
    public JButton jButtonEliminarTipoCosteo;
	public JButton jButtonCancelarTipoCosteo;
    public JButton jButtonGuardarCambiosTipoCosteo;
	public JButton jButtonGuardarCambiosTablaTipoCosteo;
	protected JButton jButtonCerrarTipoCosteo;
	
	
	protected JButton jButtonProcesarInformacionTipoCosteo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoCosteo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoCosteo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoCosteo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCosteo;
	protected JButton jButtonModificarToolBarTipoCosteo;
	protected JButton jButtonActualizarToolBarTipoCosteo;
    protected JButton jButtonEliminarToolBarTipoCosteo;
	protected JButton jButtonCancelarToolBarTipoCosteo;
    protected JButton jButtonGuardarCambiosToolBarTipoCosteo;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoCosteo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCosteo;
	protected JButton jButtonCerrarToolBarTipoCosteo;
	
	protected JButton jButtonProcesarInformacionToolBarTipoCosteo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCosteo;
	protected JMenuItem jMenuItemModificarTipoCosteo;
	protected JMenuItem jMenuItemActualizarTipoCosteo;
    protected JMenuItem jMenuItemEliminarTipoCosteo;
	protected JMenuItem jMenuItemCancelarTipoCosteo;
    protected JMenuItem jMenuItemGuardarCambiosTipoCosteo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCosteo;
	protected JMenuItem jMenuItemCerrarTipoCosteo;
	protected JMenuItem jMenuItemDetalleCerrarTipoCosteo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCosteo;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoCosteo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCosteo;
	protected JMenuItem jMenuItemMostrarOcultarTipoCosteo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCosteo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCosteo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCosteo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoCosteo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoCosteo;
	public JLabel jLabelIdTipoCosteo;
	public JTextFieldMe jTextFieldidTipoCosteo;
	public JButton jButtonidTipoCosteoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoCosteo;
	public JLabel jLabelnombreTipoCosteo;
	public JTextArea jTextAreanombreTipoCosteo;
	public JScrollPane jscrollPanenombreTipoCosteo;
	public JButton jButtonnombreTipoCosteoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoCosteo;
	
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
	
	public TipoCosteoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoCosteo=new JPanel();
				this.jPanelAccionesFormularioTipoCosteo=new JPanel();
				this.jmenuBarDetalleTipoCosteo=new JMenuBar();
				this.jTtoolBarDetalleTipoCosteo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCosteoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoCosteo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoCosteoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoCosteo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCosteoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCosteo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCosteoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCosteo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCosteoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCosteo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoCosteo() {
		return this.jButtonActualizarToolBarTipoCosteo;
	}
	
	public JButton getjButtonEliminarToolBarTipoCosteo() {
		return this.jButtonEliminarToolBarTipoCosteo;
	}
	
	public JButton getjButtonCancelarToolBarTipoCosteo() {
		return this.jButtonCancelarToolBarTipoCosteo;
	}		
	
	public JButton getjButtonProcesarInformacionTipoCosteo() {
		return this.jButtonProcesarInformacionTipoCosteo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCosteo)	{
		this.jButtonProcesarInformacionTipoCosteo = jButtonProcesarInformacionTipoCosteo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCosteo() {
		return this.jComboBoxTiposAccionesTipoCosteo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCosteo(
			JComboBox jComboBoxTiposRelacionesTipoCosteo) {
		this.jComboBoxTiposRelacionesTipoCosteo = jComboBoxTiposRelacionesTipoCosteo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCosteo(
			JComboBox jComboBoxTiposAccionesTipoCosteo) {
		this.jComboBoxTiposAccionesTipoCosteo = jComboBoxTiposAccionesTipoCosteo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoCosteo() {
		return this.jComboBoxTiposAccionesFormularioTipoCosteo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoCosteo(
			JComboBox jComboBoxTiposAccionesFormularioTipoCosteo) {
		this.jComboBoxTiposAccionesFormularioTipoCosteo = jComboBoxTiposAccionesFormularioTipoCosteo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocosteoSessionBean=new TipoCosteoSessionBean();
		
		this.tipocosteoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocosteoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocosteoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCosteoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCosteoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCosteoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Costeo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoCosteoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoCosteo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoCosteo=new JButtonMe();
				this.jButtonModificarToolBarTipoCosteo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoCosteo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoCosteo,this.jTtoolBarDetalleTipoCosteo,
							"actualizar","actualizar","Actualizar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoCosteo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoCosteo,this.jTtoolBarDetalleTipoCosteo,
							"eliminar","eliminar","Eliminar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoCosteo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoCosteo,this.jTtoolBarDetalleTipoCosteo,
							"cancelar","cancelar","Cancelar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoCosteo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoCosteo,this.jTtoolBarDetalleTipoCosteo,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoCosteo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoCosteo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoCosteo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoCosteo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoCosteo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoCosteo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoCosteo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoCosteo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCosteo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCosteo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCosteo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoCosteo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoCosteo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoCosteo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoCosteo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoCosteo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoCosteo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoCosteo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoCosteo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoCosteo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoCosteo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoCosteo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoCosteo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoCosteo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCosteo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCosteo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCosteo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCosteo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCosteo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoCosteo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoCosteo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoCosteo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCosteo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCosteo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCosteo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCosteo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCosteo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCosteo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoCosteo.add(this.jMenuItemDetalleCerrarTipoCosteo);
		
		this.jmenuDetalleAccionesTipoCosteo.add(this.jMenuItemActualizarTipoCosteo);
		this.jmenuDetalleAccionesTipoCosteo.add(this.jMenuItemEliminarTipoCosteo);
		this.jmenuDetalleAccionesTipoCosteo.add(this.jMenuItemCancelarTipoCosteo);		
		
		//this.jmenuDetalleDatosTipoCosteo.add(this.jMenuItemDetalleAbrirOrderByTipoCosteo);				
		this.jmenuDetalleDatosTipoCosteo.add(this.jMenuItemDetalleMostarOcultarTipoCosteo);				
				
		//this.jmenuDetalleAccionesTipoCosteo.add(this.jMenuItemGuardarCambiosTipoCosteo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoCosteo.add(this.jmenuDetalleArchivoTipoCosteo);		
		this.jmenuBarDetalleTipoCosteo.add(this.jmenuDetalleAccionesTipoCosteo);		
		this.jmenuBarDetalleTipoCosteo.add(this.jmenuDetalleDatosTipoCosteo);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoCosteo.add(this.jmenuDetalleTipoCosteo);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoCosteo);				
	}
	
	
	public void inicializarElementosCamposTipoCosteo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoCosteo = new JLabelMe();
		jLabelIdTipoCosteo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoCosteo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCosteo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCosteo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoCosteo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoCosteo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoCosteo.setToolTipText(TipoCosteoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoCosteo= new GridBagLayout();

		this.jPanelidTipoCosteo.setLayout(this.gridaBagLayoutTipoCosteo);

		jTextFieldidTipoCosteo = new JTextFieldMe();
		jTextFieldidTipoCosteo.setText("Id");

		jTextFieldidTipoCosteo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCosteo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCosteo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoCosteo = new JLabelMe();
		this.jLabelnombreTipoCosteo.setText(""+TipoCosteoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoCosteo.setToolTipText("Nombre");
		this.jLabelnombreTipoCosteo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCosteo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCosteo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoCosteo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoCosteo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoCosteo.setToolTipText(TipoCosteoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoCosteo = new GridBagLayout();
		this.jPanelnombreTipoCosteo.setLayout(this.gridaBagLayoutTipoCosteo);


		jTextAreanombreTipoCosteo= new JTextAreaMe();
		jTextAreanombreTipoCosteo.setEnabled(false);
		jTextAreanombreTipoCosteo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCosteo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCosteo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCosteo.setLineWrap(true);
		jTextAreanombreTipoCosteo.setWrapStyleWord(true);
		jTextAreanombreTipoCosteo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoCosteo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoCosteo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoCosteo = new JScrollPane(jTextAreanombreTipoCosteo);
		jscrollPanenombreTipoCosteo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCosteo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCosteo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoCosteoBusqueda= new JButtonMe();
		this.jButtonnombreTipoCosteoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCosteoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCosteoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoCosteoBusqueda.setText("U");
		this.jButtonnombreTipoCosteoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoCosteoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoCosteoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoCosteo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoCosteo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoCosteoBusqueda"));

		if(this.tipocosteoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoCosteoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoCosteo() {
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
		//this.jInternalFrameDetalleTipoCosteo = new TipoCosteoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Costeo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCosteo= new GridBagLayout();
		

		
		String sToolTipTipoCosteo="";
		sToolTipTipoCosteo=TipoCosteoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCosteo+="(Inventario.TipoCosteo)";
		}
		
		if(!this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCosteo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoCosteo = new JButtonMe();
		this.jButtonModificarTipoCosteo = new JButtonMe();
        this.jButtonActualizarTipoCosteo = new JButtonMe();
        this.jButtonEliminarTipoCosteo = new JButtonMe();
        this.jButtonCancelarTipoCosteo = new JButtonMe();
        this.jButtonGuardarCambiosTipoCosteo = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoCosteo = new JButtonMe();
		this.jButtonCerrarTipoCosteo = new JButtonMe();
		
		this.jScrollPanelDatosTipoCosteo = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoCosteo = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoCosteo = new JScrollPane();
				
		
		
		this.jPanelCamposTipoCosteo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoCosteo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoCosteo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoCosteo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Costeo";
		
		if(!this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCosteo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costeos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCosteo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoCosteo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoCosteo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoCosteo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoCosteo.setName("jPanelCamposTipoCosteo"); 

		this.jPanelCamposOcultosTipoCosteo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoCosteo.setName("jPanelCamposOcultosTipoCosteo"); 

        this.jPanelAccionesTipoCosteo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCosteo.setToolTipText("Acciones");
        this.jPanelAccionesTipoCosteo.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoCosteo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoCosteo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoCosteo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoCosteo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCosteo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCosteo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoCosteo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoCosteo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoCosteo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoCosteo.setText("Nuevo");
		this.jButtonModificarTipoCosteo.setText("Editar");
        this.jButtonActualizarTipoCosteo.setText("Actualizar");
        this.jButtonEliminarTipoCosteo.setText("Eliminar");
        this.jButtonCancelarTipoCosteo.setText("Cancelar");
        this.jButtonGuardarCambiosTipoCosteo.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoCosteo.setText("Guardar");
		this.jButtonCerrarTipoCosteo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCosteo,"nuevo_button","Nuevo",this.tipocosteoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoCosteo,"modificar_button","Editar",this.tipocosteoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoCosteo,"actualizar_button","Actualizar",this.tipocosteoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoCosteo,"eliminar_button","Eliminar",this.tipocosteoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoCosteo,"cancelar_button","Cancelar",this.tipocosteoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoCosteo,"guardarcambios_button","Guardar",this.tipocosteoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCosteo,"guardarcambiostabla_button","Guardar",this.tipocosteoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCosteo,"cerrar_button","Salir",this.tipocosteoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoCosteo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoCosteo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoCosteo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoCosteo.setToolTipText("Nuevo"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoCosteo.setToolTipText("Editar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoCosteo.setToolTipText("Actualizar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoCosteo.setToolTipText("Eliminar)"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoCosteo.setToolTipText("Cancelar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoCosteo.setToolTipText("Guardar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoCosteo.setToolTipText("Guardar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCosteo.setToolTipText("Salir"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCosteo";
		inputMap = this.jButtonNuevoTipoCosteo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCosteo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCosteo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoCosteo";
		inputMap = this.jButtonActualizarTipoCosteo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoCosteo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoCosteo"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoCosteo";
		inputMap = this.jButtonEliminarTipoCosteo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoCosteo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoCosteo"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoCosteo";
		inputMap = this.jButtonCancelarTipoCosteo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoCosteo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoCosteo"));
		
		//CERRAR		
		sMapKey = "CerrarTipoCosteo";
		inputMap = this.jButtonCerrarTipoCosteo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCosteo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCosteo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCosteo";
		inputMap = this.jButtonGuardarCambiosTablaTipoCosteo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCosteo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCosteo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoCosteo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoCosteo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoCosteo.setToolTipText("Nuevo TipoCosteo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoCosteo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoCosteo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoCosteo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoCosteo.setToolTipText("Sin Cerrar Ventana TipoCosteo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoCosteo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoCosteo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoCosteo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoCosteo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoCosteo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoCosteo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCosteo.setText("Accion");
		this.jComboBoxTiposAccionesTipoCosteo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoCosteo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoCosteo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoCosteo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoCosteo = new JLabelMe();
		
		this.jLabelAccionesTipoCosteo.setText("Acciones");		
		this.jLabelAccionesTipoCosteo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCosteo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCosteo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoCosteo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoCosteo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoCosteo=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoCosteo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoCosteo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoCosteo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCosteo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCosteo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoCosteo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCosteo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCosteo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoCosteo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoCosteo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoCosteo = new GridBagLayout();
		
		this.jPanelCamposTipoCosteo.setLayout(gridaBagLayoutCamposTipoCosteo);
		this.jPanelCamposOcultosTipoCosteo.setLayout(gridaBagLayoutCamposOcultosTipoCosteo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
	this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCosteo.gridy = 0;
	this.gridBagConstraintsTipoCosteo.gridx = 0;
	this.gridBagConstraintsTipoCosteo.ipadx = 0;
	this.gridBagConstraintsTipoCosteo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoCosteo.add(jLabelIdTipoCosteo, this.gridBagConstraintsTipoCosteo);



	this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
	this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCosteo.gridy = 0;
	this.gridBagConstraintsTipoCosteo.gridx = 1;
	this.gridBagConstraintsTipoCosteo.ipadx = 0;
	this.gridBagConstraintsTipoCosteo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoCosteo.add(jTextFieldidTipoCosteo, this.gridBagConstraintsTipoCosteo);


	this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
	this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCosteo.gridy = 0;
	this.gridBagConstraintsTipoCosteo.gridx = 0;
	this.gridBagConstraintsTipoCosteo.ipadx = 0;
	this.gridBagConstraintsTipoCosteo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoCosteo.add(jLabelnombreTipoCosteo, this.gridBagConstraintsTipoCosteo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		//this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosteo.gridy = 0;
		this.gridBagConstraintsTipoCosteo.gridx = 2;
		this.gridBagConstraintsTipoCosteo.ipadx = 0;
		this.gridBagConstraintsTipoCosteo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoCosteo.add(jButtonnombreTipoCosteoBusqueda, this.gridBagConstraintsTipoCosteo);
	}

	this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
	this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCosteo.gridy = 0;
	this.gridBagConstraintsTipoCosteo.gridx = 1;
	this.gridBagConstraintsTipoCosteo.ipadx = 0;
	this.gridBagConstraintsTipoCosteo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoCosteo.add(jscrollPanenombreTipoCosteo, this.gridBagConstraintsTipoCosteo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
	this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCosteo.gridy = iYPanelCamposTipoCosteo;
	this.gridBagConstraintsTipoCosteo.gridx = iXPanelCamposTipoCosteo++;
	this.gridBagConstraintsTipoCosteo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCosteo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCosteo.add(this.jPanelidTipoCosteo, this.gridBagConstraintsTipoCosteo);



	if(iXPanelCamposTipoCosteo % 1==0) {
		iXPanelCamposTipoCosteo=0;
		iYPanelCamposTipoCosteo++;
	}
	this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
	this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCosteo.gridy = iYPanelCamposTipoCosteo;
	this.gridBagConstraintsTipoCosteo.gridx = iXPanelCamposTipoCosteo++;
	this.gridBagConstraintsTipoCosteo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCosteo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCosteo.add(this.jPanelnombreTipoCosteo, this.gridBagConstraintsTipoCosteo);



	if(iXPanelCamposTipoCosteo % 1==0) {
		iXPanelCamposTipoCosteo=0;
		iYPanelCamposTipoCosteo++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoCosteo= new GridBagLayout();
		this.jPanelAccionesTipoCosteo.setLayout(gridaBagLayoutAccionesTipoCosteo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoCosteo= new GridBagLayout();
		this.jPanelAccionesFormularioTipoCosteo.setLayout(gridaBagLayoutAccionesFormularioTipoCosteo);
		
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCosteo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCosteo.add(this.jComboBoxTiposAccionesFormularioTipoCosteo, this.gridBagConstraintsTipoCosteo);

		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCosteo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCosteo.add(this.jCheckBoxPostAccionNuevoTipoCosteo, this.gridBagConstraintsTipoCosteo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocosteoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCosteo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCosteo.add(this.jCheckBoxPostAccionSinCerrarTipoCosteo, this.gridBagConstraintsTipoCosteo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocosteoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocosteoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCosteo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCosteo.add(this.jCheckBoxPostAccionSinMensajeTipoCosteo, this.gridBagConstraintsTipoCosteo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteo.gridy = 0;
		this.gridBagConstraintsTipoCosteo.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoCosteo.add(this.jButtonModificarTipoCosteo, this.gridBagConstraintsTipoCosteo);							

		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteo.gridy = 0;
		this.gridBagConstraintsTipoCosteo.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoCosteo.add(this.jButtonEliminarTipoCosteo, this.gridBagConstraintsTipoCosteo);
		
			
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.gridy = 0;		
		this.gridBagConstraintsTipoCosteo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCosteo.add(this.jButtonActualizarTipoCosteo, this.gridBagConstraintsTipoCosteo);


		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.gridy = 0;		
		this.gridBagConstraintsTipoCosteo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCosteo.add(this.jButtonGuardarCambiosTipoCosteo, this.gridBagConstraintsTipoCosteo);	
		
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.gridy = 0;		
		this.gridBagConstraintsTipoCosteo.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoCosteo.add(this.jButtonCancelarTipoCosteo, this.gridBagConstraintsTipoCosteo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCosteo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCosteo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocosteoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();						
			this.gridBagConstraintsTipoCosteo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCosteo.gridx = 0;		
			//this.gridBagConstraintsTipoCosteo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCosteo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCosteo.gridx =0;
		this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCosteo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCosteo, this.gridBagConstraintsTipoCosteo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoCosteoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoCosteo = new TipoCosteoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Costeo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Costeo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Costeo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoCosteoModel tipocosteoModel=new TipoCosteoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoCosteoModel.TipoCosteoFocusTraversalPolicy tipocosteoFocusTraversalPolicy = tipocosteoModel.new TipoCosteoFocusTraversalPolicy(this);
			
			//tipocosteoFocusTraversalPolicy.settipocosteoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocosteoModel);
			
			
			this.jContentPaneDetalleTipoCosteo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoCosteo = new GridBagLayout();	
			this.jContentPaneDetalleTipoCosteo.setLayout(gridaBagLayoutDetalleTipoCosteo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCosteo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
				this.gridBagConstraintsTipoCosteo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoCosteo.gridx = 0;
					
				
				this.jContentPaneDetalleTipoCosteo.add(jTtoolBarDetalleTipoCosteo, gridBagConstraintsTipoCosteo);								
				
}
			
			this.jScrollPanelDatosEdicionTipoCosteo=   new JScrollPane(jContentPaneDetalleTipoCosteo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCosteo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCosteo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCosteo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoCosteo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCosteo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCosteo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCosteo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoCosteo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoCosteo.gridx = 0;
	        
			this.jContentPaneDetalleTipoCosteo.add(jPanelCamposTipoCosteo, gridBagConstraintsTipoCosteo);
			
			
			
			
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
						&& tipocosteoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(this.puedeCargarPorParteParametroInventarioDefecto,false,-1);
					
					if(this.tipocosteoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoCosteo= new GridBagConstraints();
						this.gridBagConstraintsTipoCosteo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoCosteo.gridx = 0;
						this.jContentPaneDetalleTipoCosteo.add(this.jTabbedPaneRelacionesTipoCosteo, this.gridBagConstraintsTipoCosteo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoCosteo.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoCosteo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
					this.gridBagConstraintsTipoCosteo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoCosteo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoCosteo.gridx = 0;
					
				
					this.jContentPaneDetalleTipoCosteo.add(jPanelCamposOcultosTipoCosteo, gridBagConstraintsTipoCosteo);
				
					this.jPanelCamposOcultosTipoCosteo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoCosteo.gridx = 0;
	        this.gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoCosteo.add(this.jPanelAccionesFormularioTipoCosteo, this.gridBagConstraintsTipoCosteo);							
			
			
			
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
	        this.gridBagConstraintsTipoCosteo.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoCosteo.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoCosteo.add(this.jPanelAccionesTipoCosteo, this.gridBagConstraintsTipoCosteo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoCosteo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoCosteo=   new JScrollPane(this.jPanelCamposTipoCosteo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCosteo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCosteo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCosteo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoCosteo.gridx = 0;
			this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoCosteo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoCosteo, this.gridBagConstraintsTipoCosteo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCosteo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoCosteo, this.gridBagConstraintsTipoCosteo);			
			
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCosteo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoCosteo, this.gridBagConstraintsTipoCosteo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosteo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCosteo, this.gridBagConstraintsTipoCosteo);
			
			
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosteo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCosteo, this.gridBagConstraintsTipoCosteo);
		
			
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosteo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCosteo, this.gridBagConstraintsTipoCosteo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoCosteo;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoCosteo;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		this.parametroinventariodefectoSessionBean.setConGuardarRelaciones(false);
		this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);

		this.parametroinventariodefectoBeanSwingJInternalFrame=null;//new ParametroInventarioDefectoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametroinventariodefectoBeanSwingJInternalFramePopup=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametroinventariodefectoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {

				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoCosteoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoCosteoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametroinventariodefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametroinventariodefectoBeanSwingJInternalFrame.setparametroinventariodefectoSessionBean(this.parametroinventariodefectoSessionBean);

				//this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
				//this.gridBagConstraintsTipoCosteo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoCosteo.gridx = 0;
				//this.jContentPaneDetalleTipoCosteo.add(this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoCosteo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoCosteo.add("Parametro Inventario Defectos",this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoCosteo.setComponentAt(iIndexTab,this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametroinventariodefectoBeanSwingJInternalFrame=null;//new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroInventarioDefecto) {
					this.jTabbedPaneRelacionesTipoCosteo.add("Parametro Inventario Defectos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarParametroInventarioDefectoBeanSwingJInternalFrame(List<TipoCosteo> tipocosteos,TipoCosteo tipocosteo,ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametroinventariodefectoBeanSwingJInternalFrame.getParametroInventarioDefectoLogic().setConnexion(this.tipocosteoLogic.getConnexion());

					parametroinventariodefectoBeanSwingJInternalFrame.settipocosteosForeignKey(tipocosteos);
					parametroinventariodefectoBeanSwingJInternalFrame.settipocosteoForeignKey(tipocosteo);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoCosteo(true);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setlidTipoCosteoActual(tipocosteo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametroinventariodefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroInventarioDefecto(parametroinventariodefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametroinventariodefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoCosteo(true);
					parametroinventariodefectoBeanSwingJInternalFrame.setid_tipo_costeoFK_IdTipoCosteo(tipocosteo.getId());

					if(!this.conCargarFormDetalle) {
						parametroinventariodefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametroinventariodefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoCosteoForeignKey(tipocosteo,1,false,true,true);
					parametroinventariodefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametroinventariodefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoCosteo");
					parametroinventariodefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoCosteo");
					parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroInventarioDefecto("n",parametroinventariodefectoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametroinventariodefectoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametroinventariodefectoBeanSwingJInternalFrame.setAutoscrolls(true);
					parametroinventariodefectoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("relacionado");
					} else {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("no_relacionado");
					}

					parametroinventariodefectoBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroInventarioDefecto().setVisible(false);

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
