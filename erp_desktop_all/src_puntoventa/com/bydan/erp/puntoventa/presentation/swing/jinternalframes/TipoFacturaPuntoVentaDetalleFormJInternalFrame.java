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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.puntoventa.util.TipoFacturaPuntoVentaConstantesFunciones;

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
public class TipoFacturaPuntoVentaDetalleFormJInternalFrame extends TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoFacturaPuntoVenta;
	
	protected JMenuBar jmenuBarDetalleTipoFacturaPuntoVenta;
	
	protected JMenu jmenuDetalleTipoFacturaPuntoVenta;
	protected JMenu jmenuDetalleArchivoTipoFacturaPuntoVenta;
	protected JMenu jmenuDetalleAccionesTipoFacturaPuntoVenta;
	protected JMenu jmenuDetalleDatosTipoFacturaPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoFacturaPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsTipoFacturaPuntoVenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoFacturaPuntoVenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoFacturaPuntoVentaSessionBean tipofacturapuntoventaSessionBean;
	
	

	public FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame=null;
	public FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFacturaPuntoVenta=false;
	public FacturaPuntoVentaSessionBean facturapuntoventaSessionBean;

	public NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFrame=null;
	public NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteNotaCreditoPuntoVenta=false;
	public NotaCreditoPuntoVentaSessionBean notacreditopuntoventaSessionBean;
	
		
	
	public TipoFacturaPuntoVentaLogic tipofacturapuntoventaLogic;
	
	public JScrollPane jScrollPanelDatosTipoFacturaPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionTipoFacturaPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralTipoFacturaPuntoVenta;
	
	protected JPanel jPanelCamposTipoFacturaPuntoVenta;    
	protected JPanel jPanelCamposOcultosTipoFacturaPuntoVenta;    	
	protected JPanel jPanelAccionesTipoFacturaPuntoVenta;
	protected JPanel jPanelAccionesFormularioTipoFacturaPuntoVenta;
    
	
	
	protected Integer iXPanelCamposTipoFacturaPuntoVenta=0;
	protected Integer iYPanelCamposTipoFacturaPuntoVenta=0;
	
	protected Integer iXPanelCamposOcultosTipoFacturaPuntoVenta=0;
	protected Integer iYPanelCamposOcultosTipoFacturaPuntoVenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoFacturaPuntoVenta;
	public JButton jButtonModificarTipoFacturaPuntoVenta;
	public JButton jButtonActualizarTipoFacturaPuntoVenta;
    public JButton jButtonEliminarTipoFacturaPuntoVenta;
	public JButton jButtonCancelarTipoFacturaPuntoVenta;
    public JButton jButtonGuardarCambiosTipoFacturaPuntoVenta;
	public JButton jButtonGuardarCambiosTablaTipoFacturaPuntoVenta;
	protected JButton jButtonCerrarTipoFacturaPuntoVenta;
	
	
	protected JButton jButtonProcesarInformacionTipoFacturaPuntoVenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoFacturaPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoFacturaPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoFacturaPuntoVenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoFacturaPuntoVenta;
	protected JButton jButtonModificarToolBarTipoFacturaPuntoVenta;
	protected JButton jButtonActualizarToolBarTipoFacturaPuntoVenta;
    protected JButton jButtonEliminarToolBarTipoFacturaPuntoVenta;
	protected JButton jButtonCancelarToolBarTipoFacturaPuntoVenta;
    protected JButton jButtonGuardarCambiosToolBarTipoFacturaPuntoVenta;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoFacturaPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoFacturaPuntoVenta;
	protected JButton jButtonCerrarToolBarTipoFacturaPuntoVenta;
	
	protected JButton jButtonProcesarInformacionToolBarTipoFacturaPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemModificarTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemActualizarTipoFacturaPuntoVenta;
    protected JMenuItem jMenuItemEliminarTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemCancelarTipoFacturaPuntoVenta;
    protected JMenuItem jMenuItemGuardarCambiosTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemCerrarTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoFacturaPuntoVenta;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarTipoFacturaPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoFacturaPuntoVenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoFacturaPuntoVenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoFacturaPuntoVenta;
	public JLabel jLabelIdTipoFacturaPuntoVenta;
	public JTextFieldMe jTextFieldidTipoFacturaPuntoVenta;
	public JButton jButtonidTipoFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoFacturaPuntoVenta;
	public JLabel jLabelnombreTipoFacturaPuntoVenta;
	public JTextArea jTextAreanombreTipoFacturaPuntoVenta;
	public JScrollPane jscrollPanenombreTipoFacturaPuntoVenta;
	public JButton jButtonnombreTipoFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTipoFacturaPuntoVenta;
	public JLabel jLabeldescripcionTipoFacturaPuntoVenta;
	public JTextArea jTextAreadescripcionTipoFacturaPuntoVenta;
	public JScrollPane jscrollPanedescripcionTipoFacturaPuntoVenta;
	public JButton jButtondescripcionTipoFacturaPuntoVentaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoFacturaPuntoVenta;
	
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
	
	public TipoFacturaPuntoVentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoFacturaPuntoVenta=new JPanel();
				this.jPanelAccionesFormularioTipoFacturaPuntoVenta=new JPanel();
				this.jmenuBarDetalleTipoFacturaPuntoVenta=new JMenuBar();
				this.jTtoolBarDetalleTipoFacturaPuntoVenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFacturaPuntoVentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoFacturaPuntoVentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFacturaPuntoVentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFacturaPuntoVentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFacturaPuntoVentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoFacturaPuntoVenta() {
		return this.jButtonActualizarToolBarTipoFacturaPuntoVenta;
	}
	
	public JButton getjButtonEliminarToolBarTipoFacturaPuntoVenta() {
		return this.jButtonEliminarToolBarTipoFacturaPuntoVenta;
	}
	
	public JButton getjButtonCancelarToolBarTipoFacturaPuntoVenta() {
		return this.jButtonCancelarToolBarTipoFacturaPuntoVenta;
	}		
	
	public JButton getjButtonProcesarInformacionTipoFacturaPuntoVenta() {
		return this.jButtonProcesarInformacionTipoFacturaPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoFacturaPuntoVenta)	{
		this.jButtonProcesarInformacionTipoFacturaPuntoVenta = jButtonProcesarInformacionTipoFacturaPuntoVenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoFacturaPuntoVenta() {
		return this.jComboBoxTiposAccionesTipoFacturaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoFacturaPuntoVenta(
			JComboBox jComboBoxTiposRelacionesTipoFacturaPuntoVenta) {
		this.jComboBoxTiposRelacionesTipoFacturaPuntoVenta = jComboBoxTiposRelacionesTipoFacturaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoFacturaPuntoVenta(
			JComboBox jComboBoxTiposAccionesTipoFacturaPuntoVenta) {
		this.jComboBoxTiposAccionesTipoFacturaPuntoVenta = jComboBoxTiposAccionesTipoFacturaPuntoVenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta() {
		return this.jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta(
			JComboBox jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta) {
		this.jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta = jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipofacturapuntoventaSessionBean=new TipoFacturaPuntoVentaSessionBean();
		
		this.tipofacturapuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipofacturapuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.facturapuntoventaSessionBean=new FacturaPuntoVentaSessionBean();
		//this.notacreditopuntoventaSessionBean=new NotaCreditoPuntoVentaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoFacturaPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Factura Punto Venta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoFacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoFacturaPuntoVenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoFacturaPuntoVenta=new JButtonMe();
				this.jButtonModificarToolBarTipoFacturaPuntoVenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoFacturaPuntoVenta,this.jTtoolBarDetalleTipoFacturaPuntoVenta,
							"actualizar","actualizar","Actualizar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoFacturaPuntoVenta,this.jTtoolBarDetalleTipoFacturaPuntoVenta,
							"eliminar","eliminar","Eliminar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoFacturaPuntoVenta,this.jTtoolBarDetalleTipoFacturaPuntoVenta,
							"cancelar","cancelar","Cancelar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoFacturaPuntoVenta,this.jTtoolBarDetalleTipoFacturaPuntoVenta,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoFacturaPuntoVenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoFacturaPuntoVenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoFacturaPuntoVenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoFacturaPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoFacturaPuntoVenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoFacturaPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoFacturaPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoFacturaPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoFacturaPuntoVenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoFacturaPuntoVenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoFacturaPuntoVenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoFacturaPuntoVenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoFacturaPuntoVenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoFacturaPuntoVenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoFacturaPuntoVenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoFacturaPuntoVenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoFacturaPuntoVenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoFacturaPuntoVenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoFacturaPuntoVenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoFacturaPuntoVenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoFacturaPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoFacturaPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoFacturaPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoFacturaPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoFacturaPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoFacturaPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoFacturaPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoFacturaPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoFacturaPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoFacturaPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoFacturaPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoFacturaPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoFacturaPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoFacturaPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoFacturaPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoFacturaPuntoVenta.add(this.jMenuItemDetalleCerrarTipoFacturaPuntoVenta);
		
		this.jmenuDetalleAccionesTipoFacturaPuntoVenta.add(this.jMenuItemActualizarTipoFacturaPuntoVenta);
		this.jmenuDetalleAccionesTipoFacturaPuntoVenta.add(this.jMenuItemEliminarTipoFacturaPuntoVenta);
		this.jmenuDetalleAccionesTipoFacturaPuntoVenta.add(this.jMenuItemCancelarTipoFacturaPuntoVenta);		
		
		//this.jmenuDetalleDatosTipoFacturaPuntoVenta.add(this.jMenuItemDetalleAbrirOrderByTipoFacturaPuntoVenta);				
		this.jmenuDetalleDatosTipoFacturaPuntoVenta.add(this.jMenuItemDetalleMostarOcultarTipoFacturaPuntoVenta);				
				
		//this.jmenuDetalleAccionesTipoFacturaPuntoVenta.add(this.jMenuItemGuardarCambiosTipoFacturaPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoFacturaPuntoVenta.add(this.jmenuDetalleArchivoTipoFacturaPuntoVenta);		
		this.jmenuBarDetalleTipoFacturaPuntoVenta.add(this.jmenuDetalleAccionesTipoFacturaPuntoVenta);		
		this.jmenuBarDetalleTipoFacturaPuntoVenta.add(this.jmenuDetalleDatosTipoFacturaPuntoVenta);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoFacturaPuntoVenta.add(this.jmenuDetalleTipoFacturaPuntoVenta);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoFacturaPuntoVenta);				
	}
	
	
	public void inicializarElementosCamposTipoFacturaPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoFacturaPuntoVenta = new JLabelMe();
		jLabelIdTipoFacturaPuntoVenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoFacturaPuntoVenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoFacturaPuntoVenta.setToolTipText(TipoFacturaPuntoVentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoFacturaPuntoVenta= new GridBagLayout();

		this.jPanelidTipoFacturaPuntoVenta.setLayout(this.gridaBagLayoutTipoFacturaPuntoVenta);

		jTextFieldidTipoFacturaPuntoVenta = new JTextFieldMe();
		jTextFieldidTipoFacturaPuntoVenta.setText("Id");

		jTextFieldidTipoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoFacturaPuntoVenta = new JLabelMe();
		this.jLabelnombreTipoFacturaPuntoVenta.setText(""+TipoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoFacturaPuntoVenta.setToolTipText("Nombre");
		this.jLabelnombreTipoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoFacturaPuntoVenta.setToolTipText(TipoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoFacturaPuntoVenta = new GridBagLayout();
		this.jPanelnombreTipoFacturaPuntoVenta.setLayout(this.gridaBagLayoutTipoFacturaPuntoVenta);


		jTextAreanombreTipoFacturaPuntoVenta= new JTextAreaMe();
		jTextAreanombreTipoFacturaPuntoVenta.setEnabled(false);
		jTextAreanombreTipoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFacturaPuntoVenta.setLineWrap(true);
		jTextAreanombreTipoFacturaPuntoVenta.setWrapStyleWord(true);
		jTextAreanombreTipoFacturaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoFacturaPuntoVenta.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoFacturaPuntoVenta = new JScrollPane(jTextAreanombreTipoFacturaPuntoVenta);
		jscrollPanenombreTipoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonnombreTipoFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonnombreTipoFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoFacturaPuntoVentaBusqueda"));

		if(this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTipoFacturaPuntoVenta = new JLabelMe();
		this.jLabeldescripcionTipoFacturaPuntoVenta.setText(""+TipoFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionTipoFacturaPuntoVenta.setToolTipText("Descripcion");
		this.jLabeldescripcionTipoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTipoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTipoFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTipoFacturaPuntoVenta.setToolTipText(TipoFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTipoFacturaPuntoVenta = new GridBagLayout();
		this.jPaneldescripcionTipoFacturaPuntoVenta.setLayout(this.gridaBagLayoutTipoFacturaPuntoVenta);


		jTextAreadescripcionTipoFacturaPuntoVenta= new JTextAreaMe();
		jTextAreadescripcionTipoFacturaPuntoVenta.setEnabled(false);
		jTextAreadescripcionTipoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoFacturaPuntoVenta.setLineWrap(true);
		jTextAreadescripcionTipoFacturaPuntoVenta.setWrapStyleWord(true);
		jTextAreadescripcionTipoFacturaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTipoFacturaPuntoVenta.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTipoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTipoFacturaPuntoVenta = new JScrollPane(jTextAreadescripcionTipoFacturaPuntoVenta);
		jscrollPanedescripcionTipoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionTipoFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtondescripcionTipoFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTipoFacturaPuntoVentaBusqueda.setText("U");
		this.jButtondescripcionTipoFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTipoFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTipoFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTipoFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTipoFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTipoFacturaPuntoVentaBusqueda"));

		if(this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTipoFacturaPuntoVentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoFacturaPuntoVenta() {
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
		//this.jInternalFrameDetalleTipoFacturaPuntoVenta = new TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Factura Punto Venta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoFacturaPuntoVenta= new GridBagLayout();
		

		
		String sToolTipTipoFacturaPuntoVenta="";
		sToolTipTipoFacturaPuntoVenta=TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoFacturaPuntoVenta+="(PuntoVenta.TipoFacturaPuntoVenta)";
		}
		
		if(!this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoFacturaPuntoVenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoFacturaPuntoVenta = new JButtonMe();
		this.jButtonModificarTipoFacturaPuntoVenta = new JButtonMe();
        this.jButtonActualizarTipoFacturaPuntoVenta = new JButtonMe();
        this.jButtonEliminarTipoFacturaPuntoVenta = new JButtonMe();
        this.jButtonCancelarTipoFacturaPuntoVenta = new JButtonMe();
        this.jButtonGuardarCambiosTipoFacturaPuntoVenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoFacturaPuntoVenta = new JButtonMe();
		this.jButtonCerrarTipoFacturaPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosTipoFacturaPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoFacturaPuntoVenta = new JScrollPane();
				
		
		
		this.jPanelCamposTipoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Factura Punto Venta";
		
		if(!this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Factura Punto Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoFacturaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoFacturaPuntoVenta.setName("jPanelCamposTipoFacturaPuntoVenta"); 

		this.jPanelCamposOcultosTipoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoFacturaPuntoVenta.setName("jPanelCamposOcultosTipoFacturaPuntoVenta"); 

        this.jPanelAccionesTipoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoFacturaPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesTipoFacturaPuntoVenta.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoFacturaPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoFacturaPuntoVenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoFacturaPuntoVenta.setText("Nuevo");
		this.jButtonModificarTipoFacturaPuntoVenta.setText("Editar");
        this.jButtonActualizarTipoFacturaPuntoVenta.setText("Actualizar");
        this.jButtonEliminarTipoFacturaPuntoVenta.setText("Eliminar");
        this.jButtonCancelarTipoFacturaPuntoVenta.setText("Cancelar");
        this.jButtonGuardarCambiosTipoFacturaPuntoVenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoFacturaPuntoVenta.setText("Guardar");
		this.jButtonCerrarTipoFacturaPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoFacturaPuntoVenta,"nuevo_button","Nuevo",this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoFacturaPuntoVenta,"modificar_button","Editar",this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoFacturaPuntoVenta,"actualizar_button","Actualizar",this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoFacturaPuntoVenta,"eliminar_button","Eliminar",this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoFacturaPuntoVenta,"cancelar_button","Cancelar",this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoFacturaPuntoVenta,"guardarcambios_button","Guardar",this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoFacturaPuntoVenta,"guardarcambiostabla_button","Guardar",this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoFacturaPuntoVenta,"cerrar_button","Salir",this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoFacturaPuntoVenta.setToolTipText("Nuevo"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoFacturaPuntoVenta.setToolTipText("Editar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoFacturaPuntoVenta.setToolTipText("Actualizar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoFacturaPuntoVenta.setToolTipText("Eliminar)"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoFacturaPuntoVenta.setToolTipText("Cancelar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoFacturaPuntoVenta.setToolTipText("Guardar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoFacturaPuntoVenta.setToolTipText("Guardar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoFacturaPuntoVenta.setToolTipText("Salir"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoFacturaPuntoVenta";
		inputMap = this.jButtonNuevoTipoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoFacturaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoFacturaPuntoVenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoFacturaPuntoVenta";
		inputMap = this.jButtonActualizarTipoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoFacturaPuntoVenta"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoFacturaPuntoVenta";
		inputMap = this.jButtonEliminarTipoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoFacturaPuntoVenta"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoFacturaPuntoVenta";
		inputMap = this.jButtonCancelarTipoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoFacturaPuntoVenta"));
		
		//CERRAR		
		sMapKey = "CerrarTipoFacturaPuntoVenta";
		inputMap = this.jButtonCerrarTipoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoFacturaPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoFacturaPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaTipoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoFacturaPuntoVenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoFacturaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoFacturaPuntoVenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoFacturaPuntoVenta.setToolTipText("Nuevo TipoFacturaPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoFacturaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoFacturaPuntoVenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoFacturaPuntoVenta.setToolTipText("Sin Cerrar Ventana TipoFacturaPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoFacturaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoFacturaPuntoVenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoFacturaPuntoVenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoFacturaPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesTipoFacturaPuntoVenta.setText("Acciones");		
		this.jLabelAccionesTipoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoFacturaPuntoVenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoFacturaPuntoVenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoFacturaPuntoVenta=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoFacturaPuntoVenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoFacturaPuntoVenta = new GridBagLayout();
		
		this.jPanelCamposTipoFacturaPuntoVenta.setLayout(gridaBagLayoutCamposTipoFacturaPuntoVenta);
		this.jPanelCamposOcultosTipoFacturaPuntoVenta.setLayout(gridaBagLayoutCamposOcultosTipoFacturaPuntoVenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsTipoFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsTipoFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoFacturaPuntoVenta.add(jLabelIdTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);



	this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsTipoFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsTipoFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoFacturaPuntoVenta.add(jTextFieldidTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);


	this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsTipoFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsTipoFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoFacturaPuntoVenta.add(jLabelnombreTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsTipoFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsTipoFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoFacturaPuntoVenta.add(jButtonnombreTipoFacturaPuntoVentaBusqueda, this.gridBagConstraintsTipoFacturaPuntoVenta);
	}

	this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsTipoFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsTipoFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoFacturaPuntoVenta.add(jscrollPanenombreTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);


	this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsTipoFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsTipoFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTipoFacturaPuntoVenta.add(jLabeldescripcionTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsTipoFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsTipoFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTipoFacturaPuntoVenta.add(jButtondescripcionTipoFacturaPuntoVentaBusqueda, this.gridBagConstraintsTipoFacturaPuntoVenta);
	}

	this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsTipoFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsTipoFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTipoFacturaPuntoVenta.add(jscrollPanedescripcionTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iYPanelCamposTipoFacturaPuntoVenta;
	this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iXPanelCamposTipoFacturaPuntoVenta++;
	this.gridBagConstraintsTipoFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFacturaPuntoVenta.add(this.jPanelidTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);



	if(iXPanelCamposTipoFacturaPuntoVenta % 1==0) {
		iXPanelCamposTipoFacturaPuntoVenta=0;
		iYPanelCamposTipoFacturaPuntoVenta++;
	}
	this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iYPanelCamposTipoFacturaPuntoVenta;
	this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iXPanelCamposTipoFacturaPuntoVenta++;
	this.gridBagConstraintsTipoFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFacturaPuntoVenta.add(this.jPanelnombreTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);



	if(iXPanelCamposTipoFacturaPuntoVenta % 1==0) {
		iXPanelCamposTipoFacturaPuntoVenta=0;
		iYPanelCamposTipoFacturaPuntoVenta++;
	}
	this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iYPanelCamposTipoFacturaPuntoVenta;
	this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iXPanelCamposTipoFacturaPuntoVenta++;
	this.gridBagConstraintsTipoFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFacturaPuntoVenta.add(this.jPaneldescripcionTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);



	if(iXPanelCamposTipoFacturaPuntoVenta % 1==0) {
		iXPanelCamposTipoFacturaPuntoVenta=0;
		iYPanelCamposTipoFacturaPuntoVenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoFacturaPuntoVenta= new GridBagLayout();
		this.jPanelAccionesTipoFacturaPuntoVenta.setLayout(gridaBagLayoutAccionesTipoFacturaPuntoVenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoFacturaPuntoVenta= new GridBagLayout();
		this.jPanelAccionesFormularioTipoFacturaPuntoVenta.setLayout(gridaBagLayoutAccionesFormularioTipoFacturaPuntoVenta);
		
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoFacturaPuntoVenta.add(this.jComboBoxTiposAccionesFormularioTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);

		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoFacturaPuntoVenta.add(this.jCheckBoxPostAccionNuevoTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoFacturaPuntoVenta.add(this.jCheckBoxPostAccionSinCerrarTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoFacturaPuntoVenta.add(this.jCheckBoxPostAccionSinMensajeTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoFacturaPuntoVenta.add(this.jButtonModificarTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);							

		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoFacturaPuntoVenta.add(this.jButtonEliminarTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		
			
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 0;		
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoFacturaPuntoVenta.add(this.jButtonActualizarTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);


		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 0;		
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoFacturaPuntoVenta.add(this.jButtonGuardarCambiosTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);	
		
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 0;		
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoFacturaPuntoVenta.add(this.jButtonCancelarTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoFacturaPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoFacturaPuntoVenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsTipoFacturaPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFacturaPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoFacturaPuntoVenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx =0;
		this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoFacturaPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoFacturaPuntoVenta = new TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Factura Punto Venta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Factura Punto Venta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Factura Punto Venta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoFacturaPuntoVentaModel tipofacturapuntoventaModel=new TipoFacturaPuntoVentaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoFacturaPuntoVentaModel.TipoFacturaPuntoVentaFocusTraversalPolicy tipofacturapuntoventaFocusTraversalPolicy = tipofacturapuntoventaModel.new TipoFacturaPuntoVentaFocusTraversalPolicy(this);
			
			//tipofacturapuntoventaFocusTraversalPolicy.settipofacturapuntoventaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipofacturapuntoventaModel);
			
			
			this.jContentPaneDetalleTipoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoFacturaPuntoVenta = new GridBagLayout();	
			this.jContentPaneDetalleTipoFacturaPuntoVenta.setLayout(gridaBagLayoutDetalleTipoFacturaPuntoVenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoFacturaPuntoVenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;
					
				
				this.jContentPaneDetalleTipoFacturaPuntoVenta.add(jTtoolBarDetalleTipoFacturaPuntoVenta, gridBagConstraintsTipoFacturaPuntoVenta);								
				
}
			
			this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta=   new JScrollPane(jContentPaneDetalleTipoFacturaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoFacturaPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;
	        
			this.jContentPaneDetalleTipoFacturaPuntoVenta.add(jPanelCamposTipoFacturaPuntoVenta, gridBagConstraintsTipoFacturaPuntoVenta);
			
			
			
			
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
						&& tipofacturapuntoventaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFacturaPuntoVenta(this.puedeCargarPorParteFacturaPuntoVenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoPuntoVenta(this.puedeCargarPorParteNotaCreditoPuntoVenta,false,-1);
					
					if(this.tipofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoFacturaPuntoVenta= new GridBagConstraints();
						this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;
						this.jContentPaneDetalleTipoFacturaPuntoVenta.add(this.jTabbedPaneRelacionesTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoFacturaPuntoVenta.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFacturaPuntoVenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoPuntoVenta(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoFacturaPuntoVenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
					this.gridBagConstraintsTipoFacturaPuntoVenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;
					
				
					this.jContentPaneDetalleTipoFacturaPuntoVenta.add(jPanelCamposOcultosTipoFacturaPuntoVenta, gridBagConstraintsTipoFacturaPuntoVenta);
				
					this.jPanelCamposOcultosTipoFacturaPuntoVenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;
	        this.gridBagConstraintsTipoFacturaPuntoVenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoFacturaPuntoVenta.add(this.jPanelAccionesFormularioTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);							
			
			
			
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
	        this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoFacturaPuntoVenta.add(this.jPanelAccionesTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoFacturaPuntoVenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta=   new JScrollPane(this.jPanelCamposTipoFacturaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;
			this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoFacturaPuntoVenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);			
			
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
			
			
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		
			
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoFacturaPuntoVenta;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoFacturaPuntoVenta;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameFacturaPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.facturapuntoventaSessionBean=new FacturaPuntoVentaSessionBean();
		this.facturapuntoventaSessionBean.setConGuardarRelaciones(true);
		this.facturapuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.facturapuntoventaBeanSwingJInternalFrame=null;//new FacturaPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.facturapuntoventaBeanSwingJInternalFramePopup=new FacturaPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.facturapuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado()) {

				FacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
				FacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.facturapuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.facturapuntoventaBeanSwingJInternalFrame=new FacturaPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.facturapuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.facturapuntoventaBeanSwingJInternalFrame.setfacturapuntoventaSessionBean(this.facturapuntoventaSessionBean);

				//this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
				//this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;
				//this.jContentPaneDetalleTipoFacturaPuntoVenta.add(this.facturapuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoFacturaPuntoVenta);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoFacturaPuntoVenta.add("Factura Punto Ventas",this.facturapuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoFacturaPuntoVenta.setComponentAt(iIndexTab,this.facturapuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//FacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.facturapuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.facturapuntoventaBeanSwingJInternalFrame=null;//new FacturaPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFacturaPuntoVenta) {
					this.jTabbedPaneRelacionesTipoFacturaPuntoVenta.add("Factura Punto Ventas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameNotaCreditoPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.notacreditopuntoventaSessionBean=new NotaCreditoPuntoVentaSessionBean();
		this.notacreditopuntoventaSessionBean.setConGuardarRelaciones(true);
		this.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.notacreditopuntoventaBeanSwingJInternalFrame=null;//new NotaCreditoPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.notacreditopuntoventaBeanSwingJInternalFramePopup=new NotaCreditoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.notacreditopuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {

				NotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
				NotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.notacreditopuntoventaBeanSwingJInternalFrame=new NotaCreditoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.notacreditopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.notacreditopuntoventaBeanSwingJInternalFrame.setnotacreditopuntoventaSessionBean(this.notacreditopuntoventaSessionBean);

				//this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
				//this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;
				//this.jContentPaneDetalleTipoFacturaPuntoVenta.add(this.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoFacturaPuntoVenta);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoFacturaPuntoVenta.add("Nota Creditos",this.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoFacturaPuntoVenta.setComponentAt(iIndexTab,this.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//NotaCreditoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.notacreditopuntoventaBeanSwingJInternalFrame=null;//new NotaCreditoPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteNotaCreditoPuntoVenta) {
					this.jTabbedPaneRelacionesTipoFacturaPuntoVenta.add("Nota Creditos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFacturaPuntoVentaBeanSwingJInternalFrame(List<TipoFacturaPuntoVenta> tipofacturapuntoventas,TipoFacturaPuntoVenta tipofacturapuntoventa,FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//facturapuntoventaBeanSwingJInternalFrame=new FacturaPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					facturapuntoventaBeanSwingJInternalFrame.getFacturaPuntoVentaLogic().setConnexion(this.tipofacturapuntoventaLogic.getConnexion());

					facturapuntoventaBeanSwingJInternalFrame.settipofacturapuntoventasForeignKey(tipofacturapuntoventas);
					facturapuntoventaBeanSwingJInternalFrame.settipofacturapuntoventaForeignKey(tipofacturapuntoventa);
					facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionTipoFacturaPuntoVenta(true);
					facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.setlidTipoFacturaPuntoVentaActual(tipofacturapuntoventa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					facturapuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyFacturaPuntoVenta(facturapuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					facturapuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoFacturaPuntoVenta(true);
					facturapuntoventaBeanSwingJInternalFrame.setid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVenta(tipofacturapuntoventa.getId());

					if(!this.conCargarFormDetalle) {
						facturapuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					facturapuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoFacturaPuntoVentaForeignKey(tipofacturapuntoventa,1,false,true,true);
					facturapuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					facturapuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoFacturaPuntoVenta");
					facturapuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoFacturaPuntoVenta");
					facturapuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaPuntoVenta(true);
					facturapuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFacturaPuntoVenta("n",facturapuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, facturapuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					facturapuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					facturapuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						facturapuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaPuntoVenta("relacionado");
					} else {
						facturapuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaPuntoVenta("no_relacionado");
					}

					facturapuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionFacturaPuntoVenta().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarNotaCreditoPuntoVentaBeanSwingJInternalFrame(List<TipoFacturaPuntoVenta> tipofacturapuntoventas,TipoFacturaPuntoVenta tipofacturapuntoventa,NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//notacreditopuntoventaBeanSwingJInternalFrame=new NotaCreditoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					notacreditopuntoventaBeanSwingJInternalFrame.getNotaCreditoPuntoVentaLogic().setConnexion(this.tipofacturapuntoventaLogic.getConnexion());

					notacreditopuntoventaBeanSwingJInternalFrame.settipofacturapuntoventasForeignKey(tipofacturapuntoventas);
					notacreditopuntoventaBeanSwingJInternalFrame.settipofacturapuntoventaForeignKey(tipofacturapuntoventa);
					notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionTipoFacturaPuntoVenta(true);
					notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setlidTipoFacturaPuntoVentaActual(tipofacturapuntoventa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					notacreditopuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyNotaCreditoPuntoVenta(notacreditopuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					notacreditopuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoFacturaPuntoVenta(true);
					notacreditopuntoventaBeanSwingJInternalFrame.setid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVenta(tipofacturapuntoventa.getId());

					if(!this.conCargarFormDetalle) {
						notacreditopuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					notacreditopuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoFacturaPuntoVentaForeignKey(tipofacturapuntoventa,1,false,true,true);
					notacreditopuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					notacreditopuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoFacturaPuntoVenta");
					notacreditopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoFacturaPuntoVenta");
					notacreditopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaNotaCreditoPuntoVenta(true);
					notacreditopuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesNotaCreditoPuntoVenta("n",notacreditopuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, notacreditopuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					notacreditopuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					notacreditopuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						notacreditopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoPuntoVenta("relacionado");
					} else {
						notacreditopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoPuntoVenta("no_relacionado");
					}

					notacreditopuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionNotaCreditoPuntoVenta().setVisible(false);

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
