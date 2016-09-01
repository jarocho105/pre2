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
import com.bydan.erp.puntoventa.util.TipoPagoTarjetaConstantesFunciones;

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
public class TipoPagoTarjetaDetalleFormJInternalFrame extends TipoPagoTarjetaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoPagoTarjeta;
	
	protected JMenuBar jmenuBarDetalleTipoPagoTarjeta;
	
	protected JMenu jmenuDetalleTipoPagoTarjeta;
	protected JMenu jmenuDetalleArchivoTipoPagoTarjeta;
	protected JMenu jmenuDetalleAccionesTipoPagoTarjeta;
	protected JMenu jmenuDetalleDatosTipoPagoTarjeta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoPagoTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoPagoTarjeta;	
	protected GridBagConstraints gridBagConstraintsTipoPagoTarjeta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoPagoTarjetaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoPagoTarjeta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoPagoTarjetaSessionBean tipopagotarjetaSessionBean;
	
	

	public FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame=null;
	public FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormaPagoPuntoVenta=false;
	public FormaPagoPuntoVentaSessionBean formapagopuntoventaSessionBean;
	
		
	
	public TipoPagoTarjetaLogic tipopagotarjetaLogic;
	
	public JScrollPane jScrollPanelDatosTipoPagoTarjeta;
	public JScrollPane jScrollPanelDatosEdicionTipoPagoTarjeta;
	public JScrollPane jScrollPanelDatosGeneralTipoPagoTarjeta;
	
	protected JPanel jPanelCamposTipoPagoTarjeta;    
	protected JPanel jPanelCamposOcultosTipoPagoTarjeta;    	
	protected JPanel jPanelAccionesTipoPagoTarjeta;
	protected JPanel jPanelAccionesFormularioTipoPagoTarjeta;
    
	
	
	protected Integer iXPanelCamposTipoPagoTarjeta=0;
	protected Integer iYPanelCamposTipoPagoTarjeta=0;
	
	protected Integer iXPanelCamposOcultosTipoPagoTarjeta=0;
	protected Integer iYPanelCamposOcultosTipoPagoTarjeta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoPagoTarjeta;
	public JButton jButtonModificarTipoPagoTarjeta;
	public JButton jButtonActualizarTipoPagoTarjeta;
    public JButton jButtonEliminarTipoPagoTarjeta;
	public JButton jButtonCancelarTipoPagoTarjeta;
    public JButton jButtonGuardarCambiosTipoPagoTarjeta;
	public JButton jButtonGuardarCambiosTablaTipoPagoTarjeta;
	protected JButton jButtonCerrarTipoPagoTarjeta;
	
	
	protected JButton jButtonProcesarInformacionTipoPagoTarjeta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoPagoTarjeta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoPagoTarjeta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoPagoTarjeta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoPagoTarjeta;
	protected JButton jButtonModificarToolBarTipoPagoTarjeta;
	protected JButton jButtonActualizarToolBarTipoPagoTarjeta;
    protected JButton jButtonEliminarToolBarTipoPagoTarjeta;
	protected JButton jButtonCancelarToolBarTipoPagoTarjeta;
    protected JButton jButtonGuardarCambiosToolBarTipoPagoTarjeta;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoPagoTarjeta;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoPagoTarjeta;
	protected JButton jButtonCerrarToolBarTipoPagoTarjeta;
	
	protected JButton jButtonProcesarInformacionToolBarTipoPagoTarjeta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoPagoTarjeta;
	protected JMenuItem jMenuItemModificarTipoPagoTarjeta;
	protected JMenuItem jMenuItemActualizarTipoPagoTarjeta;
    protected JMenuItem jMenuItemEliminarTipoPagoTarjeta;
	protected JMenuItem jMenuItemCancelarTipoPagoTarjeta;
    protected JMenuItem jMenuItemGuardarCambiosTipoPagoTarjeta;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoPagoTarjeta;
	protected JMenuItem jMenuItemCerrarTipoPagoTarjeta;
	protected JMenuItem jMenuItemDetalleCerrarTipoPagoTarjeta;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoPagoTarjeta;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoPagoTarjeta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoPagoTarjeta;
	protected JMenuItem jMenuItemMostrarOcultarTipoPagoTarjeta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoPagoTarjeta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoPagoTarjeta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoPagoTarjeta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoPagoTarjeta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoPagoTarjeta;
	public JLabel jLabelIdTipoPagoTarjeta;
	public JTextFieldMe jTextFieldidTipoPagoTarjeta;
	public JButton jButtonidTipoPagoTarjetaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoPagoTarjeta;
	public JLabel jLabelnombreTipoPagoTarjeta;
	public JTextArea jTextAreanombreTipoPagoTarjeta;
	public JScrollPane jscrollPanenombreTipoPagoTarjeta;
	public JButton jButtonnombreTipoPagoTarjetaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTipoPagoTarjeta;
	public JLabel jLabeldescripcionTipoPagoTarjeta;
	public JTextArea jTextAreadescripcionTipoPagoTarjeta;
	public JScrollPane jscrollPanedescripcionTipoPagoTarjeta;
	public JButton jButtondescripcionTipoPagoTarjetaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoPagoTarjeta;
	
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
	
	public TipoPagoTarjetaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoPagoTarjeta=new JPanel();
				this.jPanelAccionesFormularioTipoPagoTarjeta=new JPanel();
				this.jmenuBarDetalleTipoPagoTarjeta=new JMenuBar();
				this.jTtoolBarDetalleTipoPagoTarjeta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPagoTarjetaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoPagoTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoPagoTarjetaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoPagoTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPagoTarjetaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPagoTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPagoTarjetaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPagoTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPagoTarjetaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoPagoTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoPagoTarjeta() {
		return this.jButtonActualizarToolBarTipoPagoTarjeta;
	}
	
	public JButton getjButtonEliminarToolBarTipoPagoTarjeta() {
		return this.jButtonEliminarToolBarTipoPagoTarjeta;
	}
	
	public JButton getjButtonCancelarToolBarTipoPagoTarjeta() {
		return this.jButtonCancelarToolBarTipoPagoTarjeta;
	}		
	
	public JButton getjButtonProcesarInformacionTipoPagoTarjeta() {
		return this.jButtonProcesarInformacionTipoPagoTarjeta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoPagoTarjeta)	{
		this.jButtonProcesarInformacionTipoPagoTarjeta = jButtonProcesarInformacionTipoPagoTarjeta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoPagoTarjeta() {
		return this.jComboBoxTiposAccionesTipoPagoTarjeta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoPagoTarjeta(
			JComboBox jComboBoxTiposRelacionesTipoPagoTarjeta) {
		this.jComboBoxTiposRelacionesTipoPagoTarjeta = jComboBoxTiposRelacionesTipoPagoTarjeta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoPagoTarjeta(
			JComboBox jComboBoxTiposAccionesTipoPagoTarjeta) {
		this.jComboBoxTiposAccionesTipoPagoTarjeta = jComboBoxTiposAccionesTipoPagoTarjeta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoPagoTarjeta() {
		return this.jComboBoxTiposAccionesFormularioTipoPagoTarjeta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoPagoTarjeta(
			JComboBox jComboBoxTiposAccionesFormularioTipoPagoTarjeta) {
		this.jComboBoxTiposAccionesFormularioTipoPagoTarjeta = jComboBoxTiposAccionesFormularioTipoPagoTarjeta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipopagotarjetaSessionBean=new TipoPagoTarjetaSessionBean();
		
		this.tipopagotarjetaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipopagotarjetaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipopagotarjetaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoPagoTarjetaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoPagoTarjetaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoPagoTarjetaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Pago MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoPagoTarjetaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoPagoTarjeta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoPagoTarjeta=new JButtonMe();
				this.jButtonModificarToolBarTipoPagoTarjeta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoPagoTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoPagoTarjeta,this.jTtoolBarDetalleTipoPagoTarjeta,
							"actualizar","actualizar","Actualizar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoPagoTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoPagoTarjeta,this.jTtoolBarDetalleTipoPagoTarjeta,
							"eliminar","eliminar","Eliminar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoPagoTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoPagoTarjeta,this.jTtoolBarDetalleTipoPagoTarjeta,
							"cancelar","cancelar","Cancelar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoPagoTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoPagoTarjeta,this.jTtoolBarDetalleTipoPagoTarjeta,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoPagoTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoPagoTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoPagoTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoPagoTarjeta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoPagoTarjeta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoPagoTarjeta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoPagoTarjeta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoPagoTarjeta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoPagoTarjeta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoPagoTarjeta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoPagoTarjeta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoPagoTarjeta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoPagoTarjeta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoPagoTarjeta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoPagoTarjeta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoPagoTarjeta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoPagoTarjeta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoPagoTarjeta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoPagoTarjeta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoPagoTarjeta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoPagoTarjeta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoPagoTarjeta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoPagoTarjeta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoPagoTarjeta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoPagoTarjeta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoPagoTarjeta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoPagoTarjeta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoPagoTarjeta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoPagoTarjeta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoPagoTarjeta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoPagoTarjeta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoPagoTarjeta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoPagoTarjeta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoPagoTarjeta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoPagoTarjeta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoPagoTarjeta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoPagoTarjeta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoPagoTarjeta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoPagoTarjeta.add(this.jMenuItemDetalleCerrarTipoPagoTarjeta);
		
		this.jmenuDetalleAccionesTipoPagoTarjeta.add(this.jMenuItemActualizarTipoPagoTarjeta);
		this.jmenuDetalleAccionesTipoPagoTarjeta.add(this.jMenuItemEliminarTipoPagoTarjeta);
		this.jmenuDetalleAccionesTipoPagoTarjeta.add(this.jMenuItemCancelarTipoPagoTarjeta);		
		
		//this.jmenuDetalleDatosTipoPagoTarjeta.add(this.jMenuItemDetalleAbrirOrderByTipoPagoTarjeta);				
		this.jmenuDetalleDatosTipoPagoTarjeta.add(this.jMenuItemDetalleMostarOcultarTipoPagoTarjeta);				
				
		//this.jmenuDetalleAccionesTipoPagoTarjeta.add(this.jMenuItemGuardarCambiosTipoPagoTarjeta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoPagoTarjeta.add(this.jmenuDetalleArchivoTipoPagoTarjeta);		
		this.jmenuBarDetalleTipoPagoTarjeta.add(this.jmenuDetalleAccionesTipoPagoTarjeta);		
		this.jmenuBarDetalleTipoPagoTarjeta.add(this.jmenuDetalleDatosTipoPagoTarjeta);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoPagoTarjeta.add(this.jmenuDetalleTipoPagoTarjeta);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoPagoTarjeta);				
	}
	
	
	public void inicializarElementosCamposTipoPagoTarjeta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoPagoTarjeta = new JLabelMe();
		jLabelIdTipoPagoTarjeta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoPagoTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoPagoTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoPagoTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoPagoTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoPagoTarjeta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoPagoTarjeta.setToolTipText(TipoPagoTarjetaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoPagoTarjeta= new GridBagLayout();

		this.jPanelidTipoPagoTarjeta.setLayout(this.gridaBagLayoutTipoPagoTarjeta);

		jTextFieldidTipoPagoTarjeta = new JTextFieldMe();
		jTextFieldidTipoPagoTarjeta.setText("Id");

		jTextFieldidTipoPagoTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoPagoTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoPagoTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoPagoTarjeta = new JLabelMe();
		this.jLabelnombreTipoPagoTarjeta.setText(""+TipoPagoTarjetaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoPagoTarjeta.setToolTipText("Nombre");
		this.jLabelnombreTipoPagoTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoPagoTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoPagoTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoPagoTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoPagoTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoPagoTarjeta.setToolTipText(TipoPagoTarjetaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoPagoTarjeta = new GridBagLayout();
		this.jPanelnombreTipoPagoTarjeta.setLayout(this.gridaBagLayoutTipoPagoTarjeta);


		jTextAreanombreTipoPagoTarjeta= new JTextAreaMe();
		jTextAreanombreTipoPagoTarjeta.setEnabled(false);
		jTextAreanombreTipoPagoTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPagoTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPagoTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPagoTarjeta.setLineWrap(true);
		jTextAreanombreTipoPagoTarjeta.setWrapStyleWord(true);
		jTextAreanombreTipoPagoTarjeta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoPagoTarjeta.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoPagoTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoPagoTarjeta = new JScrollPane(jTextAreanombreTipoPagoTarjeta);
		jscrollPanenombreTipoPagoTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoPagoTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoPagoTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoPagoTarjetaBusqueda= new JButtonMe();
		this.jButtonnombreTipoPagoTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoPagoTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoPagoTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoPagoTarjetaBusqueda.setText("U");
		this.jButtonnombreTipoPagoTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoPagoTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoPagoTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoPagoTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoPagoTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoPagoTarjetaBusqueda"));

		if(this.tipopagotarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoPagoTarjetaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTipoPagoTarjeta = new JLabelMe();
		this.jLabeldescripcionTipoPagoTarjeta.setText(""+TipoPagoTarjetaConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionTipoPagoTarjeta.setToolTipText("Descripcion");
		this.jLabeldescripcionTipoPagoTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoPagoTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoPagoTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTipoPagoTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTipoPagoTarjeta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTipoPagoTarjeta.setToolTipText(TipoPagoTarjetaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTipoPagoTarjeta = new GridBagLayout();
		this.jPaneldescripcionTipoPagoTarjeta.setLayout(this.gridaBagLayoutTipoPagoTarjeta);


		jTextAreadescripcionTipoPagoTarjeta= new JTextAreaMe();
		jTextAreadescripcionTipoPagoTarjeta.setEnabled(false);
		jTextAreadescripcionTipoPagoTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoPagoTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoPagoTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoPagoTarjeta.setLineWrap(true);
		jTextAreadescripcionTipoPagoTarjeta.setWrapStyleWord(true);
		jTextAreadescripcionTipoPagoTarjeta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTipoPagoTarjeta.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTipoPagoTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTipoPagoTarjeta = new JScrollPane(jTextAreadescripcionTipoPagoTarjeta);
		jscrollPanedescripcionTipoPagoTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoPagoTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoPagoTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionTipoPagoTarjetaBusqueda= new JButtonMe();
		this.jButtondescripcionTipoPagoTarjetaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoPagoTarjetaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoPagoTarjetaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTipoPagoTarjetaBusqueda.setText("U");
		this.jButtondescripcionTipoPagoTarjetaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTipoPagoTarjetaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTipoPagoTarjetaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTipoPagoTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTipoPagoTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTipoPagoTarjetaBusqueda"));

		if(this.tipopagotarjetaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTipoPagoTarjetaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoPagoTarjeta() {
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
		//this.jInternalFrameDetalleTipoPagoTarjeta = new TipoPagoTarjetaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Pago DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoPagoTarjeta= new GridBagLayout();
		

		
		String sToolTipTipoPagoTarjeta="";
		sToolTipTipoPagoTarjeta=TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoPagoTarjeta+="(PuntoVenta.TipoPagoTarjeta)";
		}
		
		if(!this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoPagoTarjeta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoPagoTarjeta = new JButtonMe();
		this.jButtonModificarTipoPagoTarjeta = new JButtonMe();
        this.jButtonActualizarTipoPagoTarjeta = new JButtonMe();
        this.jButtonEliminarTipoPagoTarjeta = new JButtonMe();
        this.jButtonCancelarTipoPagoTarjeta = new JButtonMe();
        this.jButtonGuardarCambiosTipoPagoTarjeta = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoPagoTarjeta = new JButtonMe();
		this.jButtonCerrarTipoPagoTarjeta = new JButtonMe();
		
		this.jScrollPanelDatosTipoPagoTarjeta = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoPagoTarjeta = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoPagoTarjeta = new JScrollPane();
				
		
		
		this.jPanelCamposTipoPagoTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoPagoTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoPagoTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoPagoTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Pago";
		
		if(!this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoPagoTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoPagoTarjeta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoPagoTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoPagoTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoPagoTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoPagoTarjeta.setName("jPanelCamposTipoPagoTarjeta"); 

		this.jPanelCamposOcultosTipoPagoTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoPagoTarjeta.setName("jPanelCamposOcultosTipoPagoTarjeta"); 

        this.jPanelAccionesTipoPagoTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoPagoTarjeta.setToolTipText("Acciones");
        this.jPanelAccionesTipoPagoTarjeta.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoPagoTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoPagoTarjeta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoPagoTarjeta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoPagoTarjeta.setText("Nuevo");
		this.jButtonModificarTipoPagoTarjeta.setText("Editar");
        this.jButtonActualizarTipoPagoTarjeta.setText("Actualizar");
        this.jButtonEliminarTipoPagoTarjeta.setText("Eliminar");
        this.jButtonCancelarTipoPagoTarjeta.setText("Cancelar");
        this.jButtonGuardarCambiosTipoPagoTarjeta.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoPagoTarjeta.setText("Guardar");
		this.jButtonCerrarTipoPagoTarjeta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoPagoTarjeta,"nuevo_button","Nuevo",this.tipopagotarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoPagoTarjeta,"modificar_button","Editar",this.tipopagotarjetaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoPagoTarjeta,"actualizar_button","Actualizar",this.tipopagotarjetaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoPagoTarjeta,"eliminar_button","Eliminar",this.tipopagotarjetaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoPagoTarjeta,"cancelar_button","Cancelar",this.tipopagotarjetaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoPagoTarjeta,"guardarcambios_button","Guardar",this.tipopagotarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoPagoTarjeta,"guardarcambiostabla_button","Guardar",this.tipopagotarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoPagoTarjeta,"cerrar_button","Salir",this.tipopagotarjetaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoPagoTarjeta.setToolTipText("Nuevo"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoPagoTarjeta.setToolTipText("Editar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoPagoTarjeta.setToolTipText("Actualizar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoPagoTarjeta.setToolTipText("Eliminar)"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoPagoTarjeta.setToolTipText("Cancelar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoPagoTarjeta.setToolTipText("Guardar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoPagoTarjeta.setToolTipText("Guardar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoPagoTarjeta.setToolTipText("Salir"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoPagoTarjeta";
		inputMap = this.jButtonNuevoTipoPagoTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoPagoTarjeta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoPagoTarjeta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoPagoTarjeta";
		inputMap = this.jButtonActualizarTipoPagoTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoPagoTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoPagoTarjeta"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoPagoTarjeta";
		inputMap = this.jButtonEliminarTipoPagoTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoPagoTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoPagoTarjeta"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoPagoTarjeta";
		inputMap = this.jButtonCancelarTipoPagoTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoPagoTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoPagoTarjeta"));
		
		//CERRAR		
		sMapKey = "CerrarTipoPagoTarjeta";
		inputMap = this.jButtonCerrarTipoPagoTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoPagoTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoPagoTarjeta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoPagoTarjeta";
		inputMap = this.jButtonGuardarCambiosTablaTipoPagoTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoPagoTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoPagoTarjeta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoPagoTarjeta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoPagoTarjeta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoPagoTarjeta.setToolTipText("Nuevo TipoPagoTarjeta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoPagoTarjeta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoPagoTarjeta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoPagoTarjeta.setToolTipText("Sin Cerrar Ventana TipoPagoTarjeta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoPagoTarjeta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoPagoTarjeta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoPagoTarjeta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoPagoTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoPagoTarjeta.setText("Accion");
		this.jComboBoxTiposAccionesTipoPagoTarjeta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoPagoTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoPagoTarjeta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoPagoTarjeta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoPagoTarjeta = new JLabelMe();
		
		this.jLabelAccionesTipoPagoTarjeta.setText("Acciones");		
		this.jLabelAccionesTipoPagoTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPagoTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPagoTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoPagoTarjeta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoPagoTarjeta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoPagoTarjeta=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoPagoTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoPagoTarjeta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoPagoTarjeta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPagoTarjeta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPagoTarjeta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoPagoTarjeta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoPagoTarjeta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoPagoTarjeta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoPagoTarjeta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoPagoTarjeta = new GridBagLayout();
		
		this.jPanelCamposTipoPagoTarjeta.setLayout(gridaBagLayoutCamposTipoPagoTarjeta);
		this.jPanelCamposOcultosTipoPagoTarjeta.setLayout(gridaBagLayoutCamposOcultosTipoPagoTarjeta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
	this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPagoTarjeta.gridy = 0;
	this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;
	this.gridBagConstraintsTipoPagoTarjeta.ipadx = 0;
	this.gridBagConstraintsTipoPagoTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoPagoTarjeta.add(jLabelIdTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);



	this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
	this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPagoTarjeta.gridy = 0;
	this.gridBagConstraintsTipoPagoTarjeta.gridx = 1;
	this.gridBagConstraintsTipoPagoTarjeta.ipadx = 0;
	this.gridBagConstraintsTipoPagoTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoPagoTarjeta.add(jTextFieldidTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);


	this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
	this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPagoTarjeta.gridy = 0;
	this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;
	this.gridBagConstraintsTipoPagoTarjeta.ipadx = 0;
	this.gridBagConstraintsTipoPagoTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoPagoTarjeta.add(jLabelnombreTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPagoTarjeta.gridy = 0;
		this.gridBagConstraintsTipoPagoTarjeta.gridx = 2;
		this.gridBagConstraintsTipoPagoTarjeta.ipadx = 0;
		this.gridBagConstraintsTipoPagoTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoPagoTarjeta.add(jButtonnombreTipoPagoTarjetaBusqueda, this.gridBagConstraintsTipoPagoTarjeta);
	}

	this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
	this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPagoTarjeta.gridy = 0;
	this.gridBagConstraintsTipoPagoTarjeta.gridx = 1;
	this.gridBagConstraintsTipoPagoTarjeta.ipadx = 0;
	this.gridBagConstraintsTipoPagoTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoPagoTarjeta.add(jscrollPanenombreTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);


	this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
	this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPagoTarjeta.gridy = 0;
	this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;
	this.gridBagConstraintsTipoPagoTarjeta.ipadx = 0;
	this.gridBagConstraintsTipoPagoTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTipoPagoTarjeta.add(jLabeldescripcionTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPagoTarjeta.gridy = 0;
		this.gridBagConstraintsTipoPagoTarjeta.gridx = 2;
		this.gridBagConstraintsTipoPagoTarjeta.ipadx = 0;
		this.gridBagConstraintsTipoPagoTarjeta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTipoPagoTarjeta.add(jButtondescripcionTipoPagoTarjetaBusqueda, this.gridBagConstraintsTipoPagoTarjeta);
	}

	this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
	this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPagoTarjeta.gridy = 0;
	this.gridBagConstraintsTipoPagoTarjeta.gridx = 1;
	this.gridBagConstraintsTipoPagoTarjeta.ipadx = 0;
	this.gridBagConstraintsTipoPagoTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTipoPagoTarjeta.add(jscrollPanedescripcionTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
	this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPagoTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPagoTarjeta.gridy = iYPanelCamposTipoPagoTarjeta;
	this.gridBagConstraintsTipoPagoTarjeta.gridx = iXPanelCamposTipoPagoTarjeta++;
	this.gridBagConstraintsTipoPagoTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPagoTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPagoTarjeta.add(this.jPanelidTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);



	if(iXPanelCamposTipoPagoTarjeta % 1==0) {
		iXPanelCamposTipoPagoTarjeta=0;
		iYPanelCamposTipoPagoTarjeta++;
	}
	this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
	this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPagoTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPagoTarjeta.gridy = iYPanelCamposTipoPagoTarjeta;
	this.gridBagConstraintsTipoPagoTarjeta.gridx = iXPanelCamposTipoPagoTarjeta++;
	this.gridBagConstraintsTipoPagoTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPagoTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPagoTarjeta.add(this.jPanelnombreTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);



	if(iXPanelCamposTipoPagoTarjeta % 1==0) {
		iXPanelCamposTipoPagoTarjeta=0;
		iYPanelCamposTipoPagoTarjeta++;
	}
	this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
	this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPagoTarjeta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPagoTarjeta.gridy = iYPanelCamposTipoPagoTarjeta;
	this.gridBagConstraintsTipoPagoTarjeta.gridx = iXPanelCamposTipoPagoTarjeta++;
	this.gridBagConstraintsTipoPagoTarjeta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPagoTarjeta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPagoTarjeta.add(this.jPaneldescripcionTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);



	if(iXPanelCamposTipoPagoTarjeta % 1==0) {
		iXPanelCamposTipoPagoTarjeta=0;
		iYPanelCamposTipoPagoTarjeta++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoPagoTarjeta= new GridBagLayout();
		this.jPanelAccionesTipoPagoTarjeta.setLayout(gridaBagLayoutAccionesTipoPagoTarjeta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoPagoTarjeta= new GridBagLayout();
		this.jPanelAccionesFormularioTipoPagoTarjeta.setLayout(gridaBagLayoutAccionesFormularioTipoPagoTarjeta);
		
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoPagoTarjeta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoPagoTarjeta.add(this.jComboBoxTiposAccionesFormularioTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);

		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoPagoTarjeta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoPagoTarjeta.add(this.jCheckBoxPostAccionNuevoTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipopagotarjetaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoPagoTarjeta.add(this.jCheckBoxPostAccionSinCerrarTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipopagotarjetaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoPagoTarjeta.add(this.jCheckBoxPostAccionSinMensajeTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPagoTarjeta.gridy = 0;
		this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoPagoTarjeta.add(this.jButtonModificarTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);							

		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPagoTarjeta.gridy = 0;
		this.gridBagConstraintsTipoPagoTarjeta.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoPagoTarjeta.add(this.jButtonEliminarTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		
			
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.gridy = 0;		
		this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoPagoTarjeta.add(this.jButtonActualizarTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);


		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.gridy = 0;		
		this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoPagoTarjeta.add(this.jButtonGuardarCambiosTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);	
		
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.gridy = 0;		
		this.gridBagConstraintsTipoPagoTarjeta.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoPagoTarjeta.add(this.jButtonCancelarTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoPagoTarjeta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoPagoTarjeta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();						
			this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;		
			//this.gridBagConstraintsTipoPagoTarjeta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPagoTarjeta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoPagoTarjeta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoPagoTarjeta.gridx =0;
		this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoPagoTarjeta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoPagoTarjetaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoPagoTarjeta = new TipoPagoTarjetaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Pago DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Pago DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Pago Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoPagoTarjetaModel tipopagotarjetaModel=new TipoPagoTarjetaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoPagoTarjetaModel.TipoPagoTarjetaFocusTraversalPolicy tipopagotarjetaFocusTraversalPolicy = tipopagotarjetaModel.new TipoPagoTarjetaFocusTraversalPolicy(this);
			
			//tipopagotarjetaFocusTraversalPolicy.settipopagotarjetaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipopagotarjetaModel);
			
			
			this.jContentPaneDetalleTipoPagoTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoPagoTarjeta = new GridBagLayout();	
			this.jContentPaneDetalleTipoPagoTarjeta.setLayout(gridaBagLayoutDetalleTipoPagoTarjeta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoPagoTarjeta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
				this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;
					
				
				this.jContentPaneDetalleTipoPagoTarjeta.add(jTtoolBarDetalleTipoPagoTarjeta, gridBagConstraintsTipoPagoTarjeta);								
				
}
			
			this.jScrollPanelDatosEdicionTipoPagoTarjeta=   new JScrollPane(jContentPaneDetalleTipoPagoTarjeta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoPagoTarjeta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPagoTarjeta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPagoTarjeta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoPagoTarjeta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoPagoTarjeta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPagoTarjeta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPagoTarjeta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;
	        
			this.jContentPaneDetalleTipoPagoTarjeta.add(jPanelCamposTipoPagoTarjeta, gridBagConstraintsTipoPagoTarjeta);
			
			
			
			
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
						&& tipopagotarjetaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(this.puedeCargarPorParteFormaPagoPuntoVenta,false,-1);
					
					if(this.tipopagotarjetaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoPagoTarjeta= new GridBagConstraints();
						this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;
						this.jContentPaneDetalleTipoPagoTarjeta.add(this.jTabbedPaneRelacionesTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoPagoTarjeta.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoPagoTarjeta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
					this.gridBagConstraintsTipoPagoTarjeta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoPagoTarjeta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;
					
				
					this.jContentPaneDetalleTipoPagoTarjeta.add(jPanelCamposOcultosTipoPagoTarjeta, gridBagConstraintsTipoPagoTarjeta);
				
					this.jPanelCamposOcultosTipoPagoTarjeta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;
	        this.gridBagConstraintsTipoPagoTarjeta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoPagoTarjeta.add(this.jPanelAccionesFormularioTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);							
			
			
			
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
	        this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoPagoTarjeta.add(this.jPanelAccionesTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoPagoTarjeta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoPagoTarjeta=   new JScrollPane(this.jPanelCamposTipoPagoTarjeta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoPagoTarjeta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPagoTarjeta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPagoTarjeta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;
			this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoPagoTarjeta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoPagoTarjeta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);			
			
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
			
			
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		
			
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoPagoTarjeta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoPagoTarjeta;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoPagoTarjeta;
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

				FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoPagoTarjetaJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoPagoTarjetaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.formapagopuntoventaBeanSwingJInternalFrame=new FormaPagoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formapagopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formapagopuntoventaBeanSwingJInternalFrame.setformapagopuntoventaSessionBean(this.formapagopuntoventaSessionBean);

				//this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
				//this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;
				//this.jContentPaneDetalleTipoPagoTarjeta.add(this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoPagoTarjeta);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoPagoTarjeta.add("Forma Pagoes",this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoPagoTarjeta.setComponentAt(iIndexTab,this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.formapagopuntoventaBeanSwingJInternalFrame=null;//new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormaPagoPuntoVenta) {
					this.jTabbedPaneRelacionesTipoPagoTarjeta.add("Forma Pagoes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFormaPagoPuntoVentaBeanSwingJInternalFrame(List<TipoPagoTarjeta> tipopagotarjetas,TipoPagoTarjeta tipopagotarjeta,FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formapagopuntoventaBeanSwingJInternalFrame=new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formapagopuntoventaBeanSwingJInternalFrame.getFormaPagoPuntoVentaLogic().setConnexion(this.tipopagotarjetaLogic.getConnexion());

					formapagopuntoventaBeanSwingJInternalFrame.settipopagotarjetasForeignKey(tipopagotarjetas);
					formapagopuntoventaBeanSwingJInternalFrame.settipopagotarjetaForeignKey(tipopagotarjeta);
					formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionTipoPagoTarjeta(true);
					formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setlidTipoPagoTarjetaActual(tipopagotarjeta.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formapagopuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyFormaPagoPuntoVenta(formapagopuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					formapagopuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoPagoTarjeta(true);
					formapagopuntoventaBeanSwingJInternalFrame.setid_tipo_pago_tarjetaFK_IdTipoPagoTarjeta(tipopagotarjeta.getId());

					if(!this.conCargarFormDetalle) {
						formapagopuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formapagopuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoPagoTarjetaForeignKey(tipopagotarjeta,1,false,true,true);
					formapagopuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formapagopuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoPagoTarjeta");
					formapagopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoPagoTarjeta");
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
