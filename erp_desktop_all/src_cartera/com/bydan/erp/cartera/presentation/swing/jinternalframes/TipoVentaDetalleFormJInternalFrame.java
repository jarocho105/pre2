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
import com.bydan.erp.cartera.util.TipoVentaConstantesFunciones;

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
public class TipoVentaDetalleFormJInternalFrame extends TipoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoVenta;
	
	protected JMenuBar jmenuBarDetalleTipoVenta;
	
	protected JMenu jmenuDetalleTipoVenta;
	protected JMenu jmenuDetalleArchivoTipoVenta;
	protected JMenu jmenuDetalleAccionesTipoVenta;
	protected JMenu jmenuDetalleDatosTipoVenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoVenta;	
	protected GridBagConstraints gridBagConstraintsTipoVenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoVentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoVenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoVentaSessionBean tipoventaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoVentaLogic tipoventaLogic;
	
	public JScrollPane jScrollPanelDatosTipoVenta;
	public JScrollPane jScrollPanelDatosEdicionTipoVenta;
	public JScrollPane jScrollPanelDatosGeneralTipoVenta;
	
	protected JPanel jPanelCamposTipoVenta;    
	protected JPanel jPanelCamposOcultosTipoVenta;    	
	protected JPanel jPanelAccionesTipoVenta;
	protected JPanel jPanelAccionesFormularioTipoVenta;
    
	
	
	protected Integer iXPanelCamposTipoVenta=0;
	protected Integer iYPanelCamposTipoVenta=0;
	
	protected Integer iXPanelCamposOcultosTipoVenta=0;
	protected Integer iYPanelCamposOcultosTipoVenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoVenta;
	public JButton jButtonModificarTipoVenta;
	public JButton jButtonActualizarTipoVenta;
    public JButton jButtonEliminarTipoVenta;
	public JButton jButtonCancelarTipoVenta;
    public JButton jButtonGuardarCambiosTipoVenta;
	public JButton jButtonGuardarCambiosTablaTipoVenta;
	protected JButton jButtonCerrarTipoVenta;
	
	
	protected JButton jButtonProcesarInformacionTipoVenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoVenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoVenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoVenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoVenta;
	protected JButton jButtonModificarToolBarTipoVenta;
	protected JButton jButtonActualizarToolBarTipoVenta;
    protected JButton jButtonEliminarToolBarTipoVenta;
	protected JButton jButtonCancelarToolBarTipoVenta;
    protected JButton jButtonGuardarCambiosToolBarTipoVenta;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoVenta;
	protected JButton jButtonCerrarToolBarTipoVenta;
	
	protected JButton jButtonProcesarInformacionToolBarTipoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoVenta;
	protected JMenuItem jMenuItemModificarTipoVenta;
	protected JMenuItem jMenuItemActualizarTipoVenta;
    protected JMenuItem jMenuItemEliminarTipoVenta;
	protected JMenuItem jMenuItemCancelarTipoVenta;
    protected JMenuItem jMenuItemGuardarCambiosTipoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoVenta;
	protected JMenuItem jMenuItemCerrarTipoVenta;
	protected JMenuItem jMenuItemDetalleCerrarTipoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoVenta;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoVenta;
	protected JMenuItem jMenuItemMostrarOcultarTipoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoVenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoVenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoVenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoVenta;
	public JLabel jLabelIdTipoVenta;
	public JLabel jLabelidTipoVenta;
	public JButton jButtonidTipoVentaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoVenta;
	public JLabel jLabelcodigoTipoVenta;
	public JTextField jTextFieldcodigoTipoVenta;
	public JButton jButtoncodigoTipoVentaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoVenta;
	public JLabel jLabelnombreTipoVenta;
	public JTextArea jTextAreanombreTipoVenta;
	public JScrollPane jscrollPanenombreTipoVenta;
	public JButton jButtonnombreTipoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoVenta;
	public JLabel jLabelid_empresaTipoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoVenta;
	public JButton jButtonid_empresaTipoVenta= new JButtonMe();
	public JButton jButtonid_empresaTipoVentaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoVentaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoVenta;
	
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
	
	public TipoVentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoVenta=new JPanel();
				this.jPanelAccionesFormularioTipoVenta=new JPanel();
				this.jmenuBarDetalleTipoVenta=new JMenuBar();
				this.jTtoolBarDetalleTipoVenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoVentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoVenta() {
		return this.jButtonActualizarToolBarTipoVenta;
	}
	
	public JButton getjButtonEliminarToolBarTipoVenta() {
		return this.jButtonEliminarToolBarTipoVenta;
	}
	
	public JButton getjButtonCancelarToolBarTipoVenta() {
		return this.jButtonCancelarToolBarTipoVenta;
	}		
	
	public JButton getjButtonProcesarInformacionTipoVenta() {
		return this.jButtonProcesarInformacionTipoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoVenta)	{
		this.jButtonProcesarInformacionTipoVenta = jButtonProcesarInformacionTipoVenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoVenta() {
		return this.jComboBoxTiposAccionesTipoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoVenta(
			JComboBox jComboBoxTiposRelacionesTipoVenta) {
		this.jComboBoxTiposRelacionesTipoVenta = jComboBoxTiposRelacionesTipoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoVenta(
			JComboBox jComboBoxTiposAccionesTipoVenta) {
		this.jComboBoxTiposAccionesTipoVenta = jComboBoxTiposAccionesTipoVenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoVenta() {
		return this.jComboBoxTiposAccionesFormularioTipoVenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoVenta(
			JComboBox jComboBoxTiposAccionesFormularioTipoVenta) {
		this.jComboBoxTiposAccionesFormularioTipoVenta = jComboBoxTiposAccionesFormularioTipoVenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoventaSessionBean=new TipoVentaSessionBean();
		
		this.tipoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoventaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Venta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoventaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoVenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoVenta=new JButtonMe();
				this.jButtonModificarToolBarTipoVenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoVenta,this.jTtoolBarDetalleTipoVenta,
							"actualizar","actualizar","Actualizar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoVenta,this.jTtoolBarDetalleTipoVenta,
							"eliminar","eliminar","Eliminar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoVenta,this.jTtoolBarDetalleTipoVenta,
							"cancelar","cancelar","Cancelar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoVenta,this.jTtoolBarDetalleTipoVenta,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoVenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoVenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoVenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoVenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoVenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoVenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoVenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoVenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoVenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoVenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoVenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoVenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoVenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoVenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoVenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoVenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoVenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoVenta.add(this.jMenuItemDetalleCerrarTipoVenta);
		
		this.jmenuDetalleAccionesTipoVenta.add(this.jMenuItemActualizarTipoVenta);
		this.jmenuDetalleAccionesTipoVenta.add(this.jMenuItemEliminarTipoVenta);
		this.jmenuDetalleAccionesTipoVenta.add(this.jMenuItemCancelarTipoVenta);		
		
		//this.jmenuDetalleDatosTipoVenta.add(this.jMenuItemDetalleAbrirOrderByTipoVenta);				
		this.jmenuDetalleDatosTipoVenta.add(this.jMenuItemDetalleMostarOcultarTipoVenta);				
				
		//this.jmenuDetalleAccionesTipoVenta.add(this.jMenuItemGuardarCambiosTipoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoVenta.add(this.jmenuDetalleArchivoTipoVenta);		
		this.jmenuBarDetalleTipoVenta.add(this.jmenuDetalleAccionesTipoVenta);		
		this.jmenuBarDetalleTipoVenta.add(this.jmenuDetalleDatosTipoVenta);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoVenta);				
	}
	
	
	public void inicializarElementosCamposTipoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoVenta = new JLabelMe();
		jLabelIdTipoVenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoVenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoVenta.setToolTipText(TipoVentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoVenta= new GridBagLayout();

		this.jPanelidTipoVenta.setLayout(this.gridaBagLayoutTipoVenta);

		jLabelidTipoVenta = new JLabel();
		jLabelidTipoVenta.setText("Id");

		jLabelidTipoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoVenta = new JLabelMe();
		this.jLabelcodigoTipoVenta.setText(""+TipoVentaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoVenta.setToolTipText("Codigo");
		this.jLabelcodigoTipoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoVenta.setToolTipText(TipoVentaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoVenta = new GridBagLayout();
		this.jPanelcodigoTipoVenta.setLayout(this.gridaBagLayoutTipoVenta);


		jTextFieldcodigoTipoVenta= new JTextFieldMe();

		jTextFieldcodigoTipoVenta.setEnabled(false);
		jTextFieldcodigoTipoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoVentaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoVentaBusqueda.setText("U");
		this.jButtoncodigoTipoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoVentaBusqueda"));

		if(this.tipoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoVentaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoVenta = new JLabelMe();
		this.jLabelnombreTipoVenta.setText(""+TipoVentaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoVenta.setToolTipText("Nombre");
		this.jLabelnombreTipoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoVenta.setToolTipText(TipoVentaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoVenta = new GridBagLayout();
		this.jPanelnombreTipoVenta.setLayout(this.gridaBagLayoutTipoVenta);


		jTextAreanombreTipoVenta= new JTextAreaMe();
		jTextAreanombreTipoVenta.setEnabled(false);
		jTextAreanombreTipoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoVenta.setLineWrap(true);
		jTextAreanombreTipoVenta.setWrapStyleWord(true);
		jTextAreanombreTipoVenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoVenta.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoVenta = new JScrollPane(jTextAreanombreTipoVenta);
		jscrollPanenombreTipoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoVentaBusqueda= new JButtonMe();
		this.jButtonnombreTipoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoVentaBusqueda.setText("U");
		this.jButtonnombreTipoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoVentaBusqueda"));

		if(this.tipoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoVentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoVenta = new JLabelMe();
		this.jLabelid_empresaTipoVenta.setText(""+TipoVentaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoVenta.setToolTipText("Empresa");
		this.jLabelid_empresaTipoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoVenta.setToolTipText(TipoVentaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoVenta = new GridBagLayout();
		this.jPanelid_empresaTipoVenta.setLayout(this.gridaBagLayoutTipoVenta);


		jComboBoxid_empresaTipoVenta= new JComboBoxMe();
		jComboBoxid_empresaTipoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoVenta.setEnabled(false);

		this.jButtonid_empresaTipoVenta= new JButtonMe();
		this.jButtonid_empresaTipoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoVenta.setText("Buscar");
		this.jButtonid_empresaTipoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoVenta"));

		this.jButtonid_empresaTipoVentaBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoVentaBusqueda.setText("U");
		this.jButtonid_empresaTipoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoVentaBusqueda"));

		if(this.tipoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoVentaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoVentaUpdate= new JButtonMe();
		this.jButtonid_empresaTipoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoVentaUpdate.setText("U");
		this.jButtonid_empresaTipoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoVentaUpdate"));



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
		//this.jInternalFrameDetalleTipoVenta = new TipoVentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Venta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoVenta= new GridBagLayout();
		

		
		String sToolTipTipoVenta="";
		sToolTipTipoVenta=TipoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoVenta+="(Cartera.TipoVenta)";
		}
		
		if(!this.tipoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoVenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoVenta = new JButtonMe();
		this.jButtonModificarTipoVenta = new JButtonMe();
        this.jButtonActualizarTipoVenta = new JButtonMe();
        this.jButtonEliminarTipoVenta = new JButtonMe();
        this.jButtonCancelarTipoVenta = new JButtonMe();
        this.jButtonGuardarCambiosTipoVenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoVenta = new JButtonMe();
		this.jButtonCerrarTipoVenta = new JButtonMe();
		
		this.jScrollPanelDatosTipoVenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoVenta = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoVenta = new JScrollPane();
				
		
		
		this.jPanelCamposTipoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Venta";
		
		if(!this.tipoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoVenta.setName("jPanelCamposTipoVenta"); 

		this.jPanelCamposOcultosTipoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoVenta.setName("jPanelCamposOcultosTipoVenta"); 

        this.jPanelAccionesTipoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoVenta.setToolTipText("Acciones");
        this.jPanelAccionesTipoVenta.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoVenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoVenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoVenta.setText("Nuevo");
		this.jButtonModificarTipoVenta.setText("Editar");
        this.jButtonActualizarTipoVenta.setText("Actualizar");
        this.jButtonEliminarTipoVenta.setText("Eliminar");
        this.jButtonCancelarTipoVenta.setText("Cancelar");
        this.jButtonGuardarCambiosTipoVenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoVenta.setText("Guardar");
		this.jButtonCerrarTipoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoVenta,"nuevo_button","Nuevo",this.tipoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoVenta,"modificar_button","Editar",this.tipoventaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoVenta,"actualizar_button","Actualizar",this.tipoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoVenta,"eliminar_button","Eliminar",this.tipoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoVenta,"cancelar_button","Cancelar",this.tipoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoVenta,"guardarcambios_button","Guardar",this.tipoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoVenta,"guardarcambiostabla_button","Guardar",this.tipoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoVenta,"cerrar_button","Salir",this.tipoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoVenta.setToolTipText("Nuevo"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoVenta.setToolTipText("Editar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoVenta.setToolTipText("Actualizar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoVenta.setToolTipText("Eliminar)"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoVenta.setToolTipText("Cancelar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoVenta.setToolTipText("Guardar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoVenta.setToolTipText("Guardar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoVenta.setToolTipText("Salir"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoVenta";
		inputMap = this.jButtonNuevoTipoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoVenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoVenta";
		inputMap = this.jButtonActualizarTipoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoVenta"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoVenta";
		inputMap = this.jButtonEliminarTipoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoVenta"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoVenta";
		inputMap = this.jButtonCancelarTipoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoVenta"));
		
		//CERRAR		
		sMapKey = "CerrarTipoVenta";
		inputMap = this.jButtonCerrarTipoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoVenta";
		inputMap = this.jButtonGuardarCambiosTablaTipoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoVenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoVenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoVenta.setToolTipText("Nuevo TipoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoVenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoVenta.setToolTipText("Sin Cerrar Ventana TipoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoVenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoVenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoVenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoVenta.setText("Accion");
		this.jComboBoxTiposAccionesTipoVenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoVenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoVenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoVenta = new JLabelMe();
		
		this.jLabelAccionesTipoVenta.setText("Acciones");		
		this.jLabelAccionesTipoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoVenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoVenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoVenta=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoVenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoVenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoVenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoVenta = new GridBagLayout();
		
		this.jPanelCamposTipoVenta.setLayout(gridaBagLayoutCamposTipoVenta);
		this.jPanelCamposOcultosTipoVenta.setLayout(gridaBagLayoutCamposOcultosTipoVenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoVenta = new GridBagConstraints();
	this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVenta.gridy = 0;
	this.gridBagConstraintsTipoVenta.gridx = 0;
	this.gridBagConstraintsTipoVenta.ipadx = 0;
	this.gridBagConstraintsTipoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoVenta.add(jLabelIdTipoVenta, this.gridBagConstraintsTipoVenta);



	this.gridBagConstraintsTipoVenta = new GridBagConstraints();
	this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVenta.gridy = 0;
	this.gridBagConstraintsTipoVenta.gridx = 1;
	this.gridBagConstraintsTipoVenta.ipadx = 0;
	this.gridBagConstraintsTipoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoVenta.add(jLabelidTipoVenta, this.gridBagConstraintsTipoVenta);


	this.gridBagConstraintsTipoVenta = new GridBagConstraints();
	this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVenta.gridy = 0;
	this.gridBagConstraintsTipoVenta.gridx = 0;
	this.gridBagConstraintsTipoVenta.ipadx = 0;
	this.gridBagConstraintsTipoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoVenta.add(jLabelid_empresaTipoVenta, this.gridBagConstraintsTipoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		//this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVenta.gridy = 0;
		this.gridBagConstraintsTipoVenta.gridx = 2;
		this.gridBagConstraintsTipoVenta.ipadx = 0;
		this.gridBagConstraintsTipoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoVenta.add(jButtonid_empresaTipoVentaBusqueda, this.gridBagConstraintsTipoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		//this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVenta.gridy = 0;
		this.gridBagConstraintsTipoVenta.gridx = 3;
		this.gridBagConstraintsTipoVenta.ipadx = 0;
		this.gridBagConstraintsTipoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoVenta.add(jButtonid_empresaTipoVentaUpdate, this.gridBagConstraintsTipoVenta);
	}

	this.gridBagConstraintsTipoVenta = new GridBagConstraints();
	this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVenta.gridy = 0;
	this.gridBagConstraintsTipoVenta.gridx = 1;
	this.gridBagConstraintsTipoVenta.ipadx = 0;
	this.gridBagConstraintsTipoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoVenta.add(jComboBoxid_empresaTipoVenta, this.gridBagConstraintsTipoVenta);


	this.gridBagConstraintsTipoVenta = new GridBagConstraints();
	this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVenta.gridy = 0;
	this.gridBagConstraintsTipoVenta.gridx = 0;
	this.gridBagConstraintsTipoVenta.ipadx = 0;
	this.gridBagConstraintsTipoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoVenta.add(jLabelcodigoTipoVenta, this.gridBagConstraintsTipoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		//this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVenta.gridy = 0;
		this.gridBagConstraintsTipoVenta.gridx = 2;
		this.gridBagConstraintsTipoVenta.ipadx = 0;
		this.gridBagConstraintsTipoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoVenta.add(jButtoncodigoTipoVentaBusqueda, this.gridBagConstraintsTipoVenta);
	}

	this.gridBagConstraintsTipoVenta = new GridBagConstraints();
	this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVenta.gridy = 0;
	this.gridBagConstraintsTipoVenta.gridx = 1;
	this.gridBagConstraintsTipoVenta.ipadx = 0;
	this.gridBagConstraintsTipoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoVenta.add(jTextFieldcodigoTipoVenta, this.gridBagConstraintsTipoVenta);


	this.gridBagConstraintsTipoVenta = new GridBagConstraints();
	this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVenta.gridy = 0;
	this.gridBagConstraintsTipoVenta.gridx = 0;
	this.gridBagConstraintsTipoVenta.ipadx = 0;
	this.gridBagConstraintsTipoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoVenta.add(jLabelnombreTipoVenta, this.gridBagConstraintsTipoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		//this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVenta.gridy = 0;
		this.gridBagConstraintsTipoVenta.gridx = 2;
		this.gridBagConstraintsTipoVenta.ipadx = 0;
		this.gridBagConstraintsTipoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoVenta.add(jButtonnombreTipoVentaBusqueda, this.gridBagConstraintsTipoVenta);
	}

	this.gridBagConstraintsTipoVenta = new GridBagConstraints();
	this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVenta.gridy = 0;
	this.gridBagConstraintsTipoVenta.gridx = 1;
	this.gridBagConstraintsTipoVenta.ipadx = 0;
	this.gridBagConstraintsTipoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoVenta.add(jscrollPanenombreTipoVenta, this.gridBagConstraintsTipoVenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoVenta = new GridBagConstraints();
	this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoVenta.gridy = iYPanelCamposTipoVenta;
	this.gridBagConstraintsTipoVenta.gridx = iXPanelCamposTipoVenta++;
	this.gridBagConstraintsTipoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoVenta.add(this.jPanelidTipoVenta, this.gridBagConstraintsTipoVenta);



	if(iXPanelCamposTipoVenta % 1==0) {
		iXPanelCamposTipoVenta=0;
		iYPanelCamposTipoVenta++;
	}
	this.gridBagConstraintsTipoVenta = new GridBagConstraints();
	this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoVenta.gridy = iYPanelCamposTipoVenta;
	this.gridBagConstraintsTipoVenta.gridx = iXPanelCamposTipoVenta++;
	this.gridBagConstraintsTipoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoVenta.add(this.jPanelcodigoTipoVenta, this.gridBagConstraintsTipoVenta);



	if(iXPanelCamposTipoVenta % 1==0) {
		iXPanelCamposTipoVenta=0;
		iYPanelCamposTipoVenta++;
	}
	this.gridBagConstraintsTipoVenta = new GridBagConstraints();
	this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoVenta.gridy = iYPanelCamposTipoVenta;
	this.gridBagConstraintsTipoVenta.gridx = iXPanelCamposTipoVenta++;
	this.gridBagConstraintsTipoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoVenta.add(this.jPanelnombreTipoVenta, this.gridBagConstraintsTipoVenta);



	if(iXPanelCamposTipoVenta % 1==0) {
		iXPanelCamposTipoVenta=0;
		iYPanelCamposTipoVenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoVenta = new GridBagConstraints();
	this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoVenta.gridy = iYPanelCamposOcultosTipoVenta;
	this.gridBagConstraintsTipoVenta.gridx = iXPanelCamposOcultosTipoVenta++;
	this.gridBagConstraintsTipoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoVenta.add(this.jPanelid_empresaTipoVenta, this.gridBagConstraintsTipoVenta);



	if(iXPanelCamposOcultosTipoVenta % 1==0) {
		iXPanelCamposOcultosTipoVenta=0;
		iYPanelCamposOcultosTipoVenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoVenta= new GridBagLayout();
		this.jPanelAccionesTipoVenta.setLayout(gridaBagLayoutAccionesTipoVenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoVenta= new GridBagLayout();
		this.jPanelAccionesFormularioTipoVenta.setLayout(gridaBagLayoutAccionesFormularioTipoVenta);
		
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoVenta.add(this.jComboBoxTiposAccionesFormularioTipoVenta, this.gridBagConstraintsTipoVenta);

		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoVenta.add(this.jCheckBoxPostAccionNuevoTipoVenta, this.gridBagConstraintsTipoVenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoventaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoVenta.add(this.jCheckBoxPostAccionSinCerrarTipoVenta, this.gridBagConstraintsTipoVenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoventaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoventaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoVenta.add(this.jCheckBoxPostAccionSinMensajeTipoVenta, this.gridBagConstraintsTipoVenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVenta.gridy = 0;
		this.gridBagConstraintsTipoVenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoVenta.add(this.jButtonModificarTipoVenta, this.gridBagConstraintsTipoVenta);							

		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVenta.gridy = 0;
		this.gridBagConstraintsTipoVenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoVenta.add(this.jButtonEliminarTipoVenta, this.gridBagConstraintsTipoVenta);
		
			
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.gridy = 0;		
		this.gridBagConstraintsTipoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoVenta.add(this.jButtonActualizarTipoVenta, this.gridBagConstraintsTipoVenta);


		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.gridy = 0;		
		this.gridBagConstraintsTipoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoVenta.add(this.jButtonGuardarCambiosTipoVenta, this.gridBagConstraintsTipoVenta);	
		
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.gridy = 0;		
		this.gridBagConstraintsTipoVenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoVenta.add(this.jButtonCancelarTipoVenta, this.gridBagConstraintsTipoVenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoVenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();						
			this.gridBagConstraintsTipoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoVenta.gridx = 0;		
			//this.gridBagConstraintsTipoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoVenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoVenta.gridx =0;
		this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoVenta, this.gridBagConstraintsTipoVenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoVentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoVenta = new TipoVentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Venta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Venta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Venta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoVentaModel tipoventaModel=new TipoVentaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoVentaModel.TipoVentaFocusTraversalPolicy tipoventaFocusTraversalPolicy = tipoventaModel.new TipoVentaFocusTraversalPolicy(this);
			
			//tipoventaFocusTraversalPolicy.settipoventaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoventaModel);
			
			
			this.jContentPaneDetalleTipoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoVenta = new GridBagLayout();	
			this.jContentPaneDetalleTipoVenta.setLayout(gridaBagLayoutDetalleTipoVenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoVenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoVenta = new GridBagConstraints();
				this.gridBagConstraintsTipoVenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoVenta.gridx = 0;
					
				
				this.jContentPaneDetalleTipoVenta.add(jTtoolBarDetalleTipoVenta, gridBagConstraintsTipoVenta);								
				
}
			
			this.jScrollPanelDatosEdicionTipoVenta=   new JScrollPane(jContentPaneDetalleTipoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoVenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoVenta.gridx = 0;
	        
			this.jContentPaneDetalleTipoVenta.add(jPanelCamposTipoVenta, gridBagConstraintsTipoVenta);
			
			
			
			
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
						&& tipoventaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipoventaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoVenta= new GridBagConstraints();
						this.gridBagConstraintsTipoVenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoVenta.gridx = 0;
						this.jContentPaneDetalleTipoVenta.add(this.jTabbedPaneRelacionesTipoVenta, this.gridBagConstraintsTipoVenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoVenta.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoVenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoVenta = new GridBagConstraints();
					this.gridBagConstraintsTipoVenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoVenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoVenta.gridx = 0;
					
				
					this.jContentPaneDetalleTipoVenta.add(jPanelCamposOcultosTipoVenta, gridBagConstraintsTipoVenta);
				
					this.jPanelCamposOcultosTipoVenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoVenta.gridx = 0;
	        this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoVenta.add(this.jPanelAccionesFormularioTipoVenta, this.gridBagConstraintsTipoVenta);							
			
			
			
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
	        this.gridBagConstraintsTipoVenta.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoVenta.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoVenta.add(this.jPanelAccionesTipoVenta, this.gridBagConstraintsTipoVenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoVenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoVenta=   new JScrollPane(this.jPanelCamposTipoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoVenta.gridx = 0;
			this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoVenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoVenta, this.gridBagConstraintsTipoVenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoVenta, this.gridBagConstraintsTipoVenta);			
			
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoVenta, this.gridBagConstraintsTipoVenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoVenta, this.gridBagConstraintsTipoVenta);
			
			
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoVenta, this.gridBagConstraintsTipoVenta);
		
			
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoVenta, this.gridBagConstraintsTipoVenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoVenta;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoVenta;
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
