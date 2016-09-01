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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;



import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.TipoInteresTarjetaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class TipoInteresTarjetaDetalleFormJInternalFrame extends TipoInteresTarjetaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoInteresTarjeta;
	
	protected JMenuBar jmenuBarDetalleTipoInteresTarjeta;
	
	protected JMenu jmenuDetalleTipoInteresTarjeta;
	protected JMenu jmenuDetalleArchivoTipoInteresTarjeta;
	protected JMenu jmenuDetalleAccionesTipoInteresTarjeta;
	protected JMenu jmenuDetalleDatosTipoInteresTarjeta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoInteresTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoInteresTarjeta;	
	protected GridBagConstraints gridBagConstraintsTipoInteresTarjeta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoInteresTarjetaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoInteresTarjeta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoInteresTarjetaSessionBean tipointerestarjetaSessionBean;
	
	

	public FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame=null;
	public FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormaPagoPuntoVenta=false;
	public FormaPagoPuntoVentaSessionBean formapagopuntoventaSessionBean;
	
		
	
	public TipoInteresTarjetaLogic tipointerestarjetaLogic;
	
	public JScrollPane jScrollPanelDatosTipoInteresTarjeta;
	public JScrollPane jScrollPanelDatosEdicionTipoInteresTarjeta;
	public JScrollPane jScrollPanelDatosGeneralTipoInteresTarjeta;
	
	protected JPanel jPanelCamposTipoInteresTarjeta;    
	protected JPanel jPanelCamposOcultosTipoInteresTarjeta;    	
	protected JPanel jPanelAccionesTipoInteresTarjeta;
	protected JPanel jPanelAccionesFormularioTipoInteresTarjeta;
    
	
	
	protected Integer iXPanelCamposTipoInteresTarjeta=0;
	protected Integer iYPanelCamposTipoInteresTarjeta=0;
	
	protected Integer iXPanelCamposOcultosTipoInteresTarjeta=0;
	protected Integer iYPanelCamposOcultosTipoInteresTarjeta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoInteresTarjeta;
	public JButton jButtonModificarTipoInteresTarjeta;
	public JButton jButtonActualizarTipoInteresTarjeta;
    public JButton jButtonEliminarTipoInteresTarjeta;
	public JButton jButtonCancelarTipoInteresTarjeta;
    public JButton jButtonGuardarCambiosTipoInteresTarjeta;
	public JButton jButtonGuardarCambiosTablaTipoInteresTarjeta;
	protected JButton jButtonCerrarTipoInteresTarjeta;
	
	
	protected JButton jButtonProcesarInformacionTipoInteresTarjeta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoInteresTarjeta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoInteresTarjeta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoInteresTarjeta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoInteresTarjeta;
	protected JButton jButtonModificarToolBarTipoInteresTarjeta;
	protected JButton jButtonActualizarToolBarTipoInteresTarjeta;
    protected JButton jButtonEliminarToolBarTipoInteresTarjeta;
	protected JButton jButtonCancelarToolBarTipoInteresTarjeta;
    protected JButton jButtonGuardarCambiosToolBarTipoInteresTarjeta;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoInteresTarjeta;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoInteresTarjeta;
	protected JButton jButtonCerrarToolBarTipoInteresTarjeta;
	
	protected JButton jButtonProcesarInformacionToolBarTipoInteresTarjeta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoInteresTarjeta;
	protected JMenuItem jMenuItemModificarTipoInteresTarjeta;
	protected JMenuItem jMenuItemActualizarTipoInteresTarjeta;
    protected JMenuItem jMenuItemEliminarTipoInteresTarjeta;
	protected JMenuItem jMenuItemCancelarTipoInteresTarjeta;
    protected JMenuItem jMenuItemGuardarCambiosTipoInteresTarjeta;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoInteresTarjeta;
	protected JMenuItem jMenuItemCerrarTipoInteresTarjeta;
	protected JMenuItem jMenuItemDetalleCerrarTipoInteresTarjeta;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoInteresTarjeta;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoInteresTarjeta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoInteresTarjeta;
	protected JMenuItem jMenuItemMostrarOcultarTipoInteresTarjeta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoInteresTarjeta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoInteresTarjeta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoInteresTarjeta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoInteresTarjeta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoInteresTarjeta;
	public JLabel jLabelIdTipoInteresTarjeta;
	public JTextFieldMe jTextFieldidTipoInteresTarjeta;
	public JButton jButtonidTipoInteresTarjetaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoInteresTarjeta;
	public JLabel jLabelnombreTipoInteresTarjeta;
	public JTextArea jTextAreanombreTipoInteresTarjeta;
	public JScrollPane jscrollPanenombreTipoInteresTarjeta;
	public JButton jButtonnombreTipoInteresTarjetaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTipoInteresTarjeta;
	public JLabel jLabeldescripcionTipoInteresTarjeta;
	public JTextArea jTextAreadescripcionTipoInteresTarjeta;
	public JScrollPane jscrollPanedescripcionTipoInteresTarjeta;
	public JButton jButtondescripcionTipoInteresTarjetaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoInteresTarjeta;
	
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
	
	public TipoInteresTarjetaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoInteresTarjeta=new JPanel();
				this.jPanelAccionesFormularioTipoInteresTarjeta=new JPanel();
				this.jmenuBarDetalleTipoInteresTarjeta=new JMenuBar();
				this.jTtoolBarDetalleTipoInteresTarjeta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInteresTarjetaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoInteresTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoInteresTarjetaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoInteresTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInteresTarjetaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoInteresTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInteresTarjetaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoInteresTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInteresTarjetaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoInteresTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoInteresTarjeta() {
		return this.jButtonActualizarToolBarTipoInteresTarjeta;
	}
	
	public JButton getjButtonEliminarToolBarTipoInteresTarjeta() {
		return this.jButtonEliminarToolBarTipoInteresTarjeta;
	}
	
	public JButton getjButtonCancelarToolBarTipoInteresTarjeta() {
		return this.jButtonCancelarToolBarTipoInteresTarjeta;
	}		
	
	public JButton getjButtonProcesarInformacionTipoInteresTarjeta() {
		return this.jButtonProcesarInformacionTipoInteresTarjeta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoInteresTarjeta)	{
		this.jButtonProcesarInformacionTipoInteresTarjeta = jButtonProcesarInformacionTipoInteresTarjeta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoInteresTarjeta() {
		return this.jComboBoxTiposAccionesTipoInteresTarjeta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoInteresTarjeta(
			JComboBox jComboBoxTiposRelacionesTipoInteresTarjeta) {
		this.jComboBoxTiposRelacionesTipoInteresTarjeta = jComboBoxTiposRelacionesTipoInteresTarjeta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoInteresTarjeta(
			JComboBox jComboBoxTiposAccionesTipoInteresTarjeta) {
		this.jComboBoxTiposAccionesTipoInteresTarjeta = jComboBoxTiposAccionesTipoInteresTarjeta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoInteresTarjeta() {
		return this.jComboBoxTiposAccionesFormularioTipoInteresTarjeta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoInteresTarjeta(
			JComboBox jComboBoxTiposAccionesFormularioTipoInteresTarjeta) {
		this.jComboBoxTiposAccionesFormularioTipoInteresTarjeta = jComboBoxTiposAccionesFormularioTipoInteresTarjeta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipointerestarjetaSessionBean=new TipoInteresTarjetaSessionBean();
		
		this.tipointerestarjetaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipointerestarjetaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipointerestarjetaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoInteresTarjetaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoInteresTarjetaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoInteresTarjetaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Interes Tarjeta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoInteresTarjetaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoInteresTarjeta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoInteresTarjeta=new JButtonMe();
				this.jButtonModificarToolBarTipoInteresTarjeta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoInteresTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoInteresTarjeta,this.jTtoolBarDetalleTipoInteresTarjeta,
							"actualizar","actualizar","Actualizar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoInteresTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoInteresTarjeta,this.jTtoolBarDetalleTipoInteresTarjeta,
							"eliminar","eliminar","Eliminar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoInteresTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoInteresTarjeta,this.jTtoolBarDetalleTipoInteresTarjeta,
							"cancelar","cancelar","Cancelar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoInteresTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoInteresTarjeta,this.jTtoolBarDetalleTipoInteresTarjeta,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoInteresTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoInteresTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoInteresTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoInteresTarjeta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoInteresTarjeta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoInteresTarjeta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoInteresTarjeta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoInteresTarjeta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoInteresTarjeta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoInteresTarjeta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoInteresTarjeta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoInteresTarjeta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoInteresTarjeta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoInteresTarjeta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoInteresTarjeta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoInteresTarjeta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoInteresTarjeta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoInteresTarjeta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoInteresTarjeta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoInteresTarjeta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoInteresTarjeta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoInteresTarjeta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoInteresTarjeta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoInteresTarjeta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoInteresTarjeta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoInteresTarjeta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoInteresTarjeta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoInteresTarjeta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoInteresTarjeta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoInteresTarjeta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoInteresTarjeta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoInteresTarjeta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoInteresTarjeta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoInteresTarjeta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoInteresTarjeta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoInteresTarjeta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoInteresTarjeta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoInteresTarjeta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoInteresTarjeta.add(this.jMenuItemDetalleCerrarTipoInteresTarjeta);
		
		this.jmenuDetalleAccionesTipoInteresTarjeta.add(this.jMenuItemActualizarTipoInteresTarjeta);
		this.jmenuDetalleAccionesTipoInteresTarjeta.add(this.jMenuItemEliminarTipoInteresTarjeta);
		this.jmenuDetalleAccionesTipoInteresTarjeta.add(this.jMenuItemCancelarTipoInteresTarjeta);		
		
		//this.jmenuDetalleDatosTipoInteresTarjeta.add(this.jMenuItemDetalleAbrirOrderByTipoInteresTarjeta);				
		this.jmenuDetalleDatosTipoInteresTarjeta.add(this.jMenuItemDetalleMostarOcultarTipoInteresTarjeta);				
				
		//this.jmenuDetalleAccionesTipoInteresTarjeta.add(this.jMenuItemGuardarCambiosTipoInteresTarjeta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoInteresTarjeta.add(this.jmenuDetalleArchivoTipoInteresTarjeta);		
		this.jmenuBarDetalleTipoInteresTarjeta.add(this.jmenuDetalleAccionesTipoInteresTarjeta);		
		this.jmenuBarDetalleTipoInteresTarjeta.add(this.jmenuDetalleDatosTipoInteresTarjeta);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoInteresTarjeta.add(this.jmenuDetalleTipoInteresTarjeta);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoInteresTarjeta);				
	}
	
	
	public void inicializarElementosCamposTipoInteresTarjeta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoInteresTarjeta = new JLabelMe();
		jLabelIdTipoInteresTarjeta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoInteresTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoInteresTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoInteresTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoInteresTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoInteresTarjeta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoInteresTarjeta.setToolTipText(TipoInteresTarjetaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoInteresTarjeta= new GridBagLayout();

		this.jPanelidTipoInteresTarjeta.setLayout(this.gridaBagLayoutTipoInteresTarjeta);

		jTextFieldidTipoInteresTarjeta = new JTextFieldMe();
		jTextFieldidTipoInteresTarjeta.setText("Id");

		jTextFieldidTipoInteresTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoInteresTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoInteresTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoInteresTarjeta = new JLabelMe();
		this.jLabelnombreTipoInteresTarjeta.setText(""+TipoInteresTarjetaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoInteresTarjeta.setToolTipText("Nombre");
		this.jLabelnombreTipoInteresTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoInteresTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoInteresTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoInteresTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoInteresTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoInteresTarjeta.setToolTipText(TipoInteresTarjetaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoInteresTarjeta = new GridBagLayout();
		this.jPanelnombreTipoInteresTarjeta.setLayout(this.gridaBagLayoutTipoInteresTarjeta);


		jTextAreanombreTipoInteresTarjeta= new JTextAreaMe();
		jTextAreanombreTipoInteresTarjeta.setEnabled(false);
		jTextAreanombreTipoInteresTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoInteresTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoInteresTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoInteresTarjeta.setLineWrap(true);
		jTextAreanombreTipoInteresTarjeta.setWrapStyleWord(true);
		jTextAreanombreTipoInteresTarjeta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoInteresTarjeta.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoInteresTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoInteresTarjeta = new JScrollPane(jTextAreanombreTipoInteresTarjeta);
		jscrollPanenombreTipoInteresTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoInteresTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoInteresTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoInteresTarjetaBusqueda= new JButtonMe();
		this.jButtonnombreTipoInteresTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoInteresTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoInteresTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoInteresTarjetaBusqueda.setText("U");
		this.jButtonnombreTipoInteresTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoInteresTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoInteresTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoInteresTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoInteresTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoInteresTarjetaBusqueda"));

		if(this.tipointerestarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoInteresTarjetaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTipoInteresTarjeta = new JLabelMe();
		this.jLabeldescripcionTipoInteresTarjeta.setText(""+TipoInteresTarjetaConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionTipoInteresTarjeta.setToolTipText("Descripcion");
		this.jLabeldescripcionTipoInteresTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoInteresTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoInteresTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTipoInteresTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTipoInteresTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTipoInteresTarjeta.setToolTipText(TipoInteresTarjetaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTipoInteresTarjeta = new GridBagLayout();
		this.jPaneldescripcionTipoInteresTarjeta.setLayout(this.gridaBagLayoutTipoInteresTarjeta);


		jTextAreadescripcionTipoInteresTarjeta= new JTextAreaMe();
		jTextAreadescripcionTipoInteresTarjeta.setEnabled(false);
		jTextAreadescripcionTipoInteresTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoInteresTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoInteresTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoInteresTarjeta.setLineWrap(true);
		jTextAreadescripcionTipoInteresTarjeta.setWrapStyleWord(true);
		jTextAreadescripcionTipoInteresTarjeta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTipoInteresTarjeta.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTipoInteresTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTipoInteresTarjeta = new JScrollPane(jTextAreadescripcionTipoInteresTarjeta);
		jscrollPanedescripcionTipoInteresTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoInteresTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoInteresTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionTipoInteresTarjetaBusqueda= new JButtonMe();
		this.jButtondescripcionTipoInteresTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoInteresTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoInteresTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTipoInteresTarjetaBusqueda.setText("U");
		this.jButtondescripcionTipoInteresTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTipoInteresTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTipoInteresTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTipoInteresTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTipoInteresTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTipoInteresTarjetaBusqueda"));

		if(this.tipointerestarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTipoInteresTarjetaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoInteresTarjeta() {
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
		//this.jInternalFrameDetalleTipoInteresTarjeta = new TipoInteresTarjetaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Interes Tarjeta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoInteresTarjeta= new GridBagLayout();
		

		
		String sToolTipTipoInteresTarjeta="";
		sToolTipTipoInteresTarjeta=TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoInteresTarjeta+="(PuntoVenta.TipoInteresTarjeta)";
		}
		
		if(!this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoInteresTarjeta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoInteresTarjeta = new JButtonMe();
		this.jButtonModificarTipoInteresTarjeta = new JButtonMe();
        this.jButtonActualizarTipoInteresTarjeta = new JButtonMe();
        this.jButtonEliminarTipoInteresTarjeta = new JButtonMe();
        this.jButtonCancelarTipoInteresTarjeta = new JButtonMe();
        this.jButtonGuardarCambiosTipoInteresTarjeta = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoInteresTarjeta = new JButtonMe();
		this.jButtonCerrarTipoInteresTarjeta = new JButtonMe();
		
		this.jScrollPanelDatosTipoInteresTarjeta = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoInteresTarjeta = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoInteresTarjeta = new JScrollPane();
				
		
		
		this.jPanelCamposTipoInteresTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoInteresTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoInteresTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoInteresTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Interes Tarjeta";
		
		if(!this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoInteresTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Interes Tarjetas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoInteresTarjeta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoInteresTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoInteresTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoInteresTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoInteresTarjeta.setName("jPanelCamposTipoInteresTarjeta"); 

		this.jPanelCamposOcultosTipoInteresTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoInteresTarjeta.setName("jPanelCamposOcultosTipoInteresTarjeta"); 

        this.jPanelAccionesTipoInteresTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoInteresTarjeta.setToolTipText("Acciones");
        this.jPanelAccionesTipoInteresTarjeta.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoInteresTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoInteresTarjeta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoInteresTarjeta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoInteresTarjeta.setText("Nuevo");
		this.jButtonModificarTipoInteresTarjeta.setText("Editar");
        this.jButtonActualizarTipoInteresTarjeta.setText("Actualizar");
        this.jButtonEliminarTipoInteresTarjeta.setText("Eliminar");
        this.jButtonCancelarTipoInteresTarjeta.setText("Cancelar");
        this.jButtonGuardarCambiosTipoInteresTarjeta.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoInteresTarjeta.setText("Guardar");
		this.jButtonCerrarTipoInteresTarjeta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoInteresTarjeta,"nuevo_button","Nuevo",this.tipointerestarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoInteresTarjeta,"modificar_button","Editar",this.tipointerestarjetaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoInteresTarjeta,"actualizar_button","Actualizar",this.tipointerestarjetaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoInteresTarjeta,"eliminar_button","Eliminar",this.tipointerestarjetaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoInteresTarjeta,"cancelar_button","Cancelar",this.tipointerestarjetaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoInteresTarjeta,"guardarcambios_button","Guardar",this.tipointerestarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoInteresTarjeta,"guardarcambiostabla_button","Guardar",this.tipointerestarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoInteresTarjeta,"cerrar_button","Salir",this.tipointerestarjetaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoInteresTarjeta.setToolTipText("Nuevo"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoInteresTarjeta.setToolTipText("Editar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoInteresTarjeta.setToolTipText("Actualizar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoInteresTarjeta.setToolTipText("Eliminar)"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoInteresTarjeta.setToolTipText("Cancelar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoInteresTarjeta.setToolTipText("Guardar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoInteresTarjeta.setToolTipText("Guardar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoInteresTarjeta.setToolTipText("Salir"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoInteresTarjeta";
		inputMap = this.jButtonNuevoTipoInteresTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoInteresTarjeta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoInteresTarjeta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoInteresTarjeta";
		inputMap = this.jButtonActualizarTipoInteresTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoInteresTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoInteresTarjeta"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoInteresTarjeta";
		inputMap = this.jButtonEliminarTipoInteresTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoInteresTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoInteresTarjeta"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoInteresTarjeta";
		inputMap = this.jButtonCancelarTipoInteresTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoInteresTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoInteresTarjeta"));
		
		//CERRAR		
		sMapKey = "CerrarTipoInteresTarjeta";
		inputMap = this.jButtonCerrarTipoInteresTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoInteresTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoInteresTarjeta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoInteresTarjeta";
		inputMap = this.jButtonGuardarCambiosTablaTipoInteresTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoInteresTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoInteresTarjeta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoInteresTarjeta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoInteresTarjeta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoInteresTarjeta.setToolTipText("Nuevo TipoInteresTarjeta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoInteresTarjeta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoInteresTarjeta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoInteresTarjeta.setToolTipText("Sin Cerrar Ventana TipoInteresTarjeta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoInteresTarjeta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoInteresTarjeta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoInteresTarjeta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoInteresTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoInteresTarjeta.setText("Accion");
		this.jComboBoxTiposAccionesTipoInteresTarjeta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoInteresTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoInteresTarjeta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoInteresTarjeta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoInteresTarjeta = new JLabelMe();
		
		this.jLabelAccionesTipoInteresTarjeta.setText("Acciones");		
		this.jLabelAccionesTipoInteresTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoInteresTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoInteresTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoInteresTarjeta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoInteresTarjeta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoInteresTarjeta=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoInteresTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoInteresTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoInteresTarjeta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoInteresTarjeta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoInteresTarjeta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoInteresTarjeta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoInteresTarjeta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoInteresTarjeta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoInteresTarjeta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoInteresTarjeta = new GridBagLayout();
		
		this.jPanelCamposTipoInteresTarjeta.setLayout(gridaBagLayoutCamposTipoInteresTarjeta);
		this.jPanelCamposOcultosTipoInteresTarjeta.setLayout(gridaBagLayoutCamposOcultosTipoInteresTarjeta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
	this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInteresTarjeta.gridy = 0;
	this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;
	this.gridBagConstraintsTipoInteresTarjeta.ipadx = 0;
	this.gridBagConstraintsTipoInteresTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoInteresTarjeta.add(jLabelIdTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);



	this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
	this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInteresTarjeta.gridy = 0;
	this.gridBagConstraintsTipoInteresTarjeta.gridx = 1;
	this.gridBagConstraintsTipoInteresTarjeta.ipadx = 0;
	this.gridBagConstraintsTipoInteresTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoInteresTarjeta.add(jTextFieldidTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);


	this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
	this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInteresTarjeta.gridy = 0;
	this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;
	this.gridBagConstraintsTipoInteresTarjeta.ipadx = 0;
	this.gridBagConstraintsTipoInteresTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoInteresTarjeta.add(jLabelnombreTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInteresTarjeta.gridy = 0;
		this.gridBagConstraintsTipoInteresTarjeta.gridx = 2;
		this.gridBagConstraintsTipoInteresTarjeta.ipadx = 0;
		this.gridBagConstraintsTipoInteresTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoInteresTarjeta.add(jButtonnombreTipoInteresTarjetaBusqueda, this.gridBagConstraintsTipoInteresTarjeta);
	}

	this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
	this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInteresTarjeta.gridy = 0;
	this.gridBagConstraintsTipoInteresTarjeta.gridx = 1;
	this.gridBagConstraintsTipoInteresTarjeta.ipadx = 0;
	this.gridBagConstraintsTipoInteresTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoInteresTarjeta.add(jscrollPanenombreTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);


	this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
	this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInteresTarjeta.gridy = 0;
	this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;
	this.gridBagConstraintsTipoInteresTarjeta.ipadx = 0;
	this.gridBagConstraintsTipoInteresTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTipoInteresTarjeta.add(jLabeldescripcionTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInteresTarjeta.gridy = 0;
		this.gridBagConstraintsTipoInteresTarjeta.gridx = 2;
		this.gridBagConstraintsTipoInteresTarjeta.ipadx = 0;
		this.gridBagConstraintsTipoInteresTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTipoInteresTarjeta.add(jButtondescripcionTipoInteresTarjetaBusqueda, this.gridBagConstraintsTipoInteresTarjeta);
	}

	this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
	this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInteresTarjeta.gridy = 0;
	this.gridBagConstraintsTipoInteresTarjeta.gridx = 1;
	this.gridBagConstraintsTipoInteresTarjeta.ipadx = 0;
	this.gridBagConstraintsTipoInteresTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTipoInteresTarjeta.add(jscrollPanedescripcionTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
	this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoInteresTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoInteresTarjeta.gridy = iYPanelCamposTipoInteresTarjeta;
	this.gridBagConstraintsTipoInteresTarjeta.gridx = iXPanelCamposTipoInteresTarjeta++;
	this.gridBagConstraintsTipoInteresTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoInteresTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoInteresTarjeta.add(this.jPanelidTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);



	if(iXPanelCamposTipoInteresTarjeta % 1==0) {
		iXPanelCamposTipoInteresTarjeta=0;
		iYPanelCamposTipoInteresTarjeta++;
	}
	this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
	this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoInteresTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoInteresTarjeta.gridy = iYPanelCamposTipoInteresTarjeta;
	this.gridBagConstraintsTipoInteresTarjeta.gridx = iXPanelCamposTipoInteresTarjeta++;
	this.gridBagConstraintsTipoInteresTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoInteresTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoInteresTarjeta.add(this.jPanelnombreTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);



	if(iXPanelCamposTipoInteresTarjeta % 1==0) {
		iXPanelCamposTipoInteresTarjeta=0;
		iYPanelCamposTipoInteresTarjeta++;
	}
	this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
	this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoInteresTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoInteresTarjeta.gridy = iYPanelCamposTipoInteresTarjeta;
	this.gridBagConstraintsTipoInteresTarjeta.gridx = iXPanelCamposTipoInteresTarjeta++;
	this.gridBagConstraintsTipoInteresTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoInteresTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoInteresTarjeta.add(this.jPaneldescripcionTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);



	if(iXPanelCamposTipoInteresTarjeta % 1==0) {
		iXPanelCamposTipoInteresTarjeta=0;
		iYPanelCamposTipoInteresTarjeta++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoInteresTarjeta= new GridBagLayout();
		this.jPanelAccionesTipoInteresTarjeta.setLayout(gridaBagLayoutAccionesTipoInteresTarjeta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoInteresTarjeta= new GridBagLayout();
		this.jPanelAccionesFormularioTipoInteresTarjeta.setLayout(gridaBagLayoutAccionesFormularioTipoInteresTarjeta);
		
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoInteresTarjeta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoInteresTarjeta.add(this.jComboBoxTiposAccionesFormularioTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);

		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoInteresTarjeta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoInteresTarjeta.add(this.jCheckBoxPostAccionNuevoTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipointerestarjetaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoInteresTarjeta.add(this.jCheckBoxPostAccionSinCerrarTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipointerestarjetaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoInteresTarjeta.add(this.jCheckBoxPostAccionSinMensajeTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInteresTarjeta.gridy = 0;
		this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoInteresTarjeta.add(this.jButtonModificarTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);							

		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInteresTarjeta.gridy = 0;
		this.gridBagConstraintsTipoInteresTarjeta.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoInteresTarjeta.add(this.jButtonEliminarTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		
			
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.gridy = 0;		
		this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoInteresTarjeta.add(this.jButtonActualizarTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);


		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.gridy = 0;		
		this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoInteresTarjeta.add(this.jButtonGuardarCambiosTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);	
		
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.gridy = 0;		
		this.gridBagConstraintsTipoInteresTarjeta.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoInteresTarjeta.add(this.jButtonCancelarTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoInteresTarjeta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoInteresTarjeta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();						
			this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;		
			//this.gridBagConstraintsTipoInteresTarjeta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInteresTarjeta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoInteresTarjeta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoInteresTarjeta.gridx =0;
		this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoInteresTarjeta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoInteresTarjetaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoInteresTarjeta = new TipoInteresTarjetaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Interes Tarjeta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Interes Tarjeta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Interes Tarjeta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoInteresTarjetaModel tipointerestarjetaModel=new TipoInteresTarjetaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoInteresTarjetaModel.TipoInteresTarjetaFocusTraversalPolicy tipointerestarjetaFocusTraversalPolicy = tipointerestarjetaModel.new TipoInteresTarjetaFocusTraversalPolicy(this);
			
			//tipointerestarjetaFocusTraversalPolicy.settipointerestarjetaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipointerestarjetaModel);
			
			
			this.jContentPaneDetalleTipoInteresTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoInteresTarjeta = new GridBagLayout();	
			this.jContentPaneDetalleTipoInteresTarjeta.setLayout(gridaBagLayoutDetalleTipoInteresTarjeta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoInteresTarjeta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
				this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;
					
				
				this.jContentPaneDetalleTipoInteresTarjeta.add(jTtoolBarDetalleTipoInteresTarjeta, gridBagConstraintsTipoInteresTarjeta);								
				
}
			
			this.jScrollPanelDatosEdicionTipoInteresTarjeta=   new JScrollPane(jContentPaneDetalleTipoInteresTarjeta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoInteresTarjeta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoInteresTarjeta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoInteresTarjeta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoInteresTarjeta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoInteresTarjeta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoInteresTarjeta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoInteresTarjeta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;
	        
			this.jContentPaneDetalleTipoInteresTarjeta.add(jPanelCamposTipoInteresTarjeta, gridBagConstraintsTipoInteresTarjeta);
			
			
			
			
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
						&& tipointerestarjetaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(this.puedeCargarPorParteFormaPagoPuntoVenta,false,-1);
					
					if(this.tipointerestarjetaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoInteresTarjeta= new GridBagConstraints();
						this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;
						this.jContentPaneDetalleTipoInteresTarjeta.add(this.jTabbedPaneRelacionesTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoInteresTarjeta.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoInteresTarjeta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
					this.gridBagConstraintsTipoInteresTarjeta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoInteresTarjeta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;
					
				
					this.jContentPaneDetalleTipoInteresTarjeta.add(jPanelCamposOcultosTipoInteresTarjeta, gridBagConstraintsTipoInteresTarjeta);
				
					this.jPanelCamposOcultosTipoInteresTarjeta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;
	        this.gridBagConstraintsTipoInteresTarjeta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoInteresTarjeta.add(this.jPanelAccionesFormularioTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);							
			
			
			
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
	        this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoInteresTarjeta.add(this.jPanelAccionesTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoInteresTarjeta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoInteresTarjeta=   new JScrollPane(this.jPanelCamposTipoInteresTarjeta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoInteresTarjeta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoInteresTarjeta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoInteresTarjeta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;
			this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoInteresTarjeta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoInteresTarjeta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);			
			
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
			
			
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		
			
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoInteresTarjeta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoInteresTarjeta;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoInteresTarjeta;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
		this.formapagopuntoventaSessionBean.setConGuardarRelaciones(false);
		this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.formapagopuntoventaBeanSwingJInternalFrame=null;//new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formapagopuntoventaBeanSwingJInternalFramePopup=new FormaPagoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formapagopuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {

				FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoInteresTarjetaJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoInteresTarjetaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.formapagopuntoventaBeanSwingJInternalFrame=new FormaPagoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formapagopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formapagopuntoventaBeanSwingJInternalFrame.setformapagopuntoventaSessionBean(this.formapagopuntoventaSessionBean);

				//this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
				//this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;
				//this.jContentPaneDetalleTipoInteresTarjeta.add(this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoInteresTarjeta);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoInteresTarjeta.add("Forma Pagoes",this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoInteresTarjeta.setComponentAt(iIndexTab,this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.formapagopuntoventaBeanSwingJInternalFrame=null;//new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormaPagoPuntoVenta) {
					this.jTabbedPaneRelacionesTipoInteresTarjeta.add("Forma Pagoes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFormaPagoPuntoVentaBeanSwingJInternalFrame(List<TipoInteresTarjeta> tipointerestarjetas,TipoInteresTarjeta tipointerestarjeta,FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formapagopuntoventaBeanSwingJInternalFrame=new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formapagopuntoventaBeanSwingJInternalFrame.getFormaPagoPuntoVentaLogic().setConnexion(this.tipointerestarjetaLogic.getConnexion());

					formapagopuntoventaBeanSwingJInternalFrame.settipointerestarjetasForeignKey(tipointerestarjetas);
					formapagopuntoventaBeanSwingJInternalFrame.settipointerestarjetaForeignKey(tipointerestarjeta);
					formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionTipoInteresTarjeta(true);
					formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setlidTipoInteresTarjetaActual(tipointerestarjeta.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formapagopuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyFormaPagoPuntoVenta(formapagopuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					formapagopuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoInteresTarjeta(true);
					formapagopuntoventaBeanSwingJInternalFrame.setid_tipo_interes_tarjetaFK_IdTipoInteresTarjeta(tipointerestarjeta.getId());

					if(!this.conCargarFormDetalle) {
						formapagopuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formapagopuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoInteresTarjetaForeignKey(tipointerestarjeta,1,false,true,true);
					formapagopuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formapagopuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoInteresTarjeta");
					formapagopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoInteresTarjeta");
					formapagopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormaPagoPuntoVenta(true);
					formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormaPagoPuntoVenta("n",formapagopuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, formapagopuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formapagopuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					formapagopuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoPuntoVenta("relacionado");
					} else {
						formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoPuntoVenta("no_relacionado");
					}

					formapagopuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionFormaPagoPuntoVenta().setVisible(false);

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
