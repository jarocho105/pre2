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

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.puntoventa.util.EstadoPedidoPuntoVentaConstantesFunciones;

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
public class EstadoPedidoPuntoVentaDetalleFormJInternalFrame extends EstadoPedidoPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoPedidoPuntoVenta;
	
	protected JMenuBar jmenuBarDetalleEstadoPedidoPuntoVenta;
	
	protected JMenu jmenuDetalleEstadoPedidoPuntoVenta;
	protected JMenu jmenuDetalleArchivoEstadoPedidoPuntoVenta;
	protected JMenu jmenuDetalleAccionesEstadoPedidoPuntoVenta;
	protected JMenu jmenuDetalleDatosEstadoPedidoPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoPedidoPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsEstadoPedidoPuntoVenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoPedidoPuntoVentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoPedidoPuntoVenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoPedidoPuntoVentaSessionBean estadopedidopuntoventaSessionBean;
	
	

	public PedidoPuntoVentaBeanSwingJInternalFrame pedidopuntoventaBeanSwingJInternalFrame=null;
	public PedidoPuntoVentaBeanSwingJInternalFrame pedidopuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedidoPuntoVenta=false;
	public PedidoPuntoVentaSessionBean pedidopuntoventaSessionBean;
	
		
	
	public EstadoPedidoPuntoVentaLogic estadopedidopuntoventaLogic;
	
	public JScrollPane jScrollPanelDatosEstadoPedidoPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionEstadoPedidoPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralEstadoPedidoPuntoVenta;
	
	protected JPanel jPanelCamposEstadoPedidoPuntoVenta;    
	protected JPanel jPanelCamposOcultosEstadoPedidoPuntoVenta;    	
	protected JPanel jPanelAccionesEstadoPedidoPuntoVenta;
	protected JPanel jPanelAccionesFormularioEstadoPedidoPuntoVenta;
    
	
	
	protected Integer iXPanelCamposEstadoPedidoPuntoVenta=0;
	protected Integer iYPanelCamposEstadoPedidoPuntoVenta=0;
	
	protected Integer iXPanelCamposOcultosEstadoPedidoPuntoVenta=0;
	protected Integer iYPanelCamposOcultosEstadoPedidoPuntoVenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoPedidoPuntoVenta;
	public JButton jButtonModificarEstadoPedidoPuntoVenta;
	public JButton jButtonActualizarEstadoPedidoPuntoVenta;
    public JButton jButtonEliminarEstadoPedidoPuntoVenta;
	public JButton jButtonCancelarEstadoPedidoPuntoVenta;
    public JButton jButtonGuardarCambiosEstadoPedidoPuntoVenta;
	public JButton jButtonGuardarCambiosTablaEstadoPedidoPuntoVenta;
	protected JButton jButtonCerrarEstadoPedidoPuntoVenta;
	
	
	protected JButton jButtonProcesarInformacionEstadoPedidoPuntoVenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoPedidoPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoPedidoPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoPedidoPuntoVenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoPedidoPuntoVenta;
	protected JButton jButtonModificarToolBarEstadoPedidoPuntoVenta;
	protected JButton jButtonActualizarToolBarEstadoPedidoPuntoVenta;
    protected JButton jButtonEliminarToolBarEstadoPedidoPuntoVenta;
	protected JButton jButtonCancelarToolBarEstadoPedidoPuntoVenta;
    protected JButton jButtonGuardarCambiosToolBarEstadoPedidoPuntoVenta;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoPedidoPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoPedidoPuntoVenta;
	protected JButton jButtonCerrarToolBarEstadoPedidoPuntoVenta;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoPedidoPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemModificarEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemActualizarEstadoPedidoPuntoVenta;
    protected JMenuItem jMenuItemEliminarEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemCancelarEstadoPedidoPuntoVenta;
    protected JMenuItem jMenuItemGuardarCambiosEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemCerrarEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoPedidoPuntoVenta;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarEstadoPedidoPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoPedidoPuntoVenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoPedidoPuntoVenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoPedidoPuntoVenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoPedidoPuntoVenta;
	public JLabel jLabelIdEstadoPedidoPuntoVenta;
	public JTextFieldMe jTextFieldidEstadoPedidoPuntoVenta;
	public JButton jButtonidEstadoPedidoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoPedidoPuntoVenta;
	public JLabel jLabelnombreEstadoPedidoPuntoVenta;
	public JTextArea jTextAreanombreEstadoPedidoPuntoVenta;
	public JScrollPane jscrollPanenombreEstadoPedidoPuntoVenta;
	public JButton jButtonnombreEstadoPedidoPuntoVentaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoPedidoPuntoVenta;
	
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
	
	public EstadoPedidoPuntoVentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoPedidoPuntoVenta=new JPanel();
				this.jPanelAccionesFormularioEstadoPedidoPuntoVenta=new JPanel();
				this.jmenuBarDetalleEstadoPedidoPuntoVenta=new JMenuBar();
				this.jTtoolBarDetalleEstadoPedidoPuntoVenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPedidoPuntoVentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoPedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoPedidoPuntoVentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoPedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPedidoPuntoVentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPedidoPuntoVentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPedidoPuntoVentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoPedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoPedidoPuntoVenta() {
		return this.jButtonActualizarToolBarEstadoPedidoPuntoVenta;
	}
	
	public JButton getjButtonEliminarToolBarEstadoPedidoPuntoVenta() {
		return this.jButtonEliminarToolBarEstadoPedidoPuntoVenta;
	}
	
	public JButton getjButtonCancelarToolBarEstadoPedidoPuntoVenta() {
		return this.jButtonCancelarToolBarEstadoPedidoPuntoVenta;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoPedidoPuntoVenta() {
		return this.jButtonProcesarInformacionEstadoPedidoPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoPedidoPuntoVenta)	{
		this.jButtonProcesarInformacionEstadoPedidoPuntoVenta = jButtonProcesarInformacionEstadoPedidoPuntoVenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoPedidoPuntoVenta() {
		return this.jComboBoxTiposAccionesEstadoPedidoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoPedidoPuntoVenta(
			JComboBox jComboBoxTiposRelacionesEstadoPedidoPuntoVenta) {
		this.jComboBoxTiposRelacionesEstadoPedidoPuntoVenta = jComboBoxTiposRelacionesEstadoPedidoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoPedidoPuntoVenta(
			JComboBox jComboBoxTiposAccionesEstadoPedidoPuntoVenta) {
		this.jComboBoxTiposAccionesEstadoPedidoPuntoVenta = jComboBoxTiposAccionesEstadoPedidoPuntoVenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoPedidoPuntoVenta() {
		return this.jComboBoxTiposAccionesFormularioEstadoPedidoPuntoVenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoPedidoPuntoVenta(
			JComboBox jComboBoxTiposAccionesFormularioEstadoPedidoPuntoVenta) {
		this.jComboBoxTiposAccionesFormularioEstadoPedidoPuntoVenta = jComboBoxTiposAccionesFormularioEstadoPedidoPuntoVenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadopedidopuntoventaSessionBean=new EstadoPedidoPuntoVentaSessionBean();
		
		this.estadopedidopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadopedidopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.pedidopuntoventaSessionBean=new PedidoPuntoVentaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoPedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoPedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoPedidoPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Pedido MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoPedidoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoPedidoPuntoVenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoPedidoPuntoVenta=new JButtonMe();
				this.jButtonModificarToolBarEstadoPedidoPuntoVenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoPedidoPuntoVenta,this.jTtoolBarDetalleEstadoPedidoPuntoVenta,
							"actualizar","actualizar","Actualizar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoPedidoPuntoVenta,this.jTtoolBarDetalleEstadoPedidoPuntoVenta,
							"eliminar","eliminar","Eliminar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoPedidoPuntoVenta,this.jTtoolBarDetalleEstadoPedidoPuntoVenta,
							"cancelar","cancelar","Cancelar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoPedidoPuntoVenta,this.jTtoolBarDetalleEstadoPedidoPuntoVenta,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoPedidoPuntoVenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoPedidoPuntoVenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoPedidoPuntoVenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoPedidoPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoPedidoPuntoVenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoPedidoPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoPedidoPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoPedidoPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoPedidoPuntoVenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoPedidoPuntoVenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoPedidoPuntoVenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoPedidoPuntoVenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoPedidoPuntoVenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoPedidoPuntoVenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoPedidoPuntoVenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoPedidoPuntoVenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoPedidoPuntoVenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoPedidoPuntoVenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoPedidoPuntoVenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoPedidoPuntoVenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoPedidoPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoPedidoPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoPedidoPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoPedidoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoPedidoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoPedidoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoPedidoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoPedidoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoPedidoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoPedidoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoPedidoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoPedidoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoPedidoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoPedidoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoPedidoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoPedidoPuntoVenta.add(this.jMenuItemDetalleCerrarEstadoPedidoPuntoVenta);
		
		this.jmenuDetalleAccionesEstadoPedidoPuntoVenta.add(this.jMenuItemActualizarEstadoPedidoPuntoVenta);
		this.jmenuDetalleAccionesEstadoPedidoPuntoVenta.add(this.jMenuItemEliminarEstadoPedidoPuntoVenta);
		this.jmenuDetalleAccionesEstadoPedidoPuntoVenta.add(this.jMenuItemCancelarEstadoPedidoPuntoVenta);		
		
		//this.jmenuDetalleDatosEstadoPedidoPuntoVenta.add(this.jMenuItemDetalleAbrirOrderByEstadoPedidoPuntoVenta);				
		this.jmenuDetalleDatosEstadoPedidoPuntoVenta.add(this.jMenuItemDetalleMostarOcultarEstadoPedidoPuntoVenta);				
				
		//this.jmenuDetalleAccionesEstadoPedidoPuntoVenta.add(this.jMenuItemGuardarCambiosEstadoPedidoPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoPedidoPuntoVenta.add(this.jmenuDetalleArchivoEstadoPedidoPuntoVenta);		
		this.jmenuBarDetalleEstadoPedidoPuntoVenta.add(this.jmenuDetalleAccionesEstadoPedidoPuntoVenta);		
		this.jmenuBarDetalleEstadoPedidoPuntoVenta.add(this.jmenuDetalleDatosEstadoPedidoPuntoVenta);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoPedidoPuntoVenta.add(this.jmenuDetalleEstadoPedidoPuntoVenta);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoPedidoPuntoVenta);				
	}
	
	
	public void inicializarElementosCamposEstadoPedidoPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoPedidoPuntoVenta = new JLabelMe();
		jLabelIdEstadoPedidoPuntoVenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoPedidoPuntoVenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoPedidoPuntoVenta.setToolTipText(EstadoPedidoPuntoVentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoPedidoPuntoVenta= new GridBagLayout();

		this.jPanelidEstadoPedidoPuntoVenta.setLayout(this.gridaBagLayoutEstadoPedidoPuntoVenta);

		jTextFieldidEstadoPedidoPuntoVenta = new JTextFieldMe();
		jTextFieldidEstadoPedidoPuntoVenta.setText("Id");

		jTextFieldidEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreEstadoPedidoPuntoVenta = new JLabelMe();
		this.jLabelnombreEstadoPedidoPuntoVenta.setText(""+EstadoPedidoPuntoVentaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoPedidoPuntoVenta.setToolTipText("Nombre");
		this.jLabelnombreEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoPedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoPedidoPuntoVenta.setToolTipText(EstadoPedidoPuntoVentaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoPedidoPuntoVenta = new GridBagLayout();
		this.jPanelnombreEstadoPedidoPuntoVenta.setLayout(this.gridaBagLayoutEstadoPedidoPuntoVenta);


		jTextAreanombreEstadoPedidoPuntoVenta= new JTextAreaMe();
		jTextAreanombreEstadoPedidoPuntoVenta.setEnabled(false);
		jTextAreanombreEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoPedidoPuntoVenta.setLineWrap(true);
		jTextAreanombreEstadoPedidoPuntoVenta.setWrapStyleWord(true);
		jTextAreanombreEstadoPedidoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoPedidoPuntoVenta.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoPedidoPuntoVenta = new JScrollPane(jTextAreanombreEstadoPedidoPuntoVenta);
		jscrollPanenombreEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoPedidoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonnombreEstadoPedidoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoPedidoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoPedidoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoPedidoPuntoVentaBusqueda.setText("U");
		this.jButtonnombreEstadoPedidoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoPedidoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoPedidoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoPedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoPedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoPedidoPuntoVentaBusqueda"));

		if(this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoPedidoPuntoVentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoPedidoPuntoVenta() {
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
		//this.jInternalFrameDetalleEstadoPedidoPuntoVenta = new EstadoPedidoPuntoVentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Pedido DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoPedidoPuntoVenta= new GridBagLayout();
		

		
		String sToolTipEstadoPedidoPuntoVenta="";
		sToolTipEstadoPedidoPuntoVenta=EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoPedidoPuntoVenta+="(PuntoVenta.EstadoPedidoPuntoVenta)";
		}
		
		if(!this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoPedidoPuntoVenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoPedidoPuntoVenta = new JButtonMe();
		this.jButtonModificarEstadoPedidoPuntoVenta = new JButtonMe();
        this.jButtonActualizarEstadoPedidoPuntoVenta = new JButtonMe();
        this.jButtonEliminarEstadoPedidoPuntoVenta = new JButtonMe();
        this.jButtonCancelarEstadoPedidoPuntoVenta = new JButtonMe();
        this.jButtonGuardarCambiosEstadoPedidoPuntoVenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoPedidoPuntoVenta = new JButtonMe();
		this.jButtonCerrarEstadoPedidoPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosEstadoPedidoPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoPedidoPuntoVenta = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoPedidoPuntoVenta = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Pedido";
		
		if(!this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pedidos" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoPedidoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoPedidoPuntoVenta.setName("jPanelCamposEstadoPedidoPuntoVenta"); 

		this.jPanelCamposOcultosEstadoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoPedidoPuntoVenta.setName("jPanelCamposOcultosEstadoPedidoPuntoVenta"); 

        this.jPanelAccionesEstadoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoPedidoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesEstadoPedidoPuntoVenta.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoPedidoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoPedidoPuntoVenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoPedidoPuntoVenta.setText("Nuevo");
		this.jButtonModificarEstadoPedidoPuntoVenta.setText("Editar");
        this.jButtonActualizarEstadoPedidoPuntoVenta.setText("Actualizar");
        this.jButtonEliminarEstadoPedidoPuntoVenta.setText("Eliminar");
        this.jButtonCancelarEstadoPedidoPuntoVenta.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoPedidoPuntoVenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoPedidoPuntoVenta.setText("Guardar");
		this.jButtonCerrarEstadoPedidoPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoPedidoPuntoVenta,"nuevo_button","Nuevo",this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoPedidoPuntoVenta,"modificar_button","Editar",this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoPedidoPuntoVenta,"actualizar_button","Actualizar",this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoPedidoPuntoVenta,"eliminar_button","Eliminar",this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoPedidoPuntoVenta,"cancelar_button","Cancelar",this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoPedidoPuntoVenta,"guardarcambios_button","Guardar",this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoPedidoPuntoVenta,"guardarcambiostabla_button","Guardar",this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoPedidoPuntoVenta,"cerrar_button","Salir",this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoPedidoPuntoVenta.setToolTipText("Nuevo"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoPedidoPuntoVenta.setToolTipText("Editar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoPedidoPuntoVenta.setToolTipText("Actualizar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoPedidoPuntoVenta.setToolTipText("Eliminar)"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoPedidoPuntoVenta.setToolTipText("Cancelar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoPedidoPuntoVenta.setToolTipText("Guardar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoPedidoPuntoVenta.setToolTipText("Guardar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoPedidoPuntoVenta.setToolTipText("Salir"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoPedidoPuntoVenta";
		inputMap = this.jButtonNuevoEstadoPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoPedidoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoPedidoPuntoVenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoPedidoPuntoVenta";
		inputMap = this.jButtonActualizarEstadoPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoPedidoPuntoVenta"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoPedidoPuntoVenta";
		inputMap = this.jButtonEliminarEstadoPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoPedidoPuntoVenta"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoPedidoPuntoVenta";
		inputMap = this.jButtonCancelarEstadoPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoPedidoPuntoVenta"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoPedidoPuntoVenta";
		inputMap = this.jButtonCerrarEstadoPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoPedidoPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoPedidoPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaEstadoPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoPedidoPuntoVenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoPedidoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoPedidoPuntoVenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoPedidoPuntoVenta.setToolTipText("Nuevo EstadoPedidoPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoPedidoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoPedidoPuntoVenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoPedidoPuntoVenta.setToolTipText("Sin Cerrar Ventana EstadoPedidoPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoPedidoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoPedidoPuntoVenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoPedidoPuntoVenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoPedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoPedidoPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesEstadoPedidoPuntoVenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoPedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoPedidoPuntoVenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoPedidoPuntoVenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoPedidoPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesEstadoPedidoPuntoVenta.setText("Acciones");		
		this.jLabelAccionesEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoPedidoPuntoVenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoPedidoPuntoVenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoPedidoPuntoVenta=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoPedidoPuntoVenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoPedidoPuntoVenta = new GridBagLayout();
		
		this.jPanelCamposEstadoPedidoPuntoVenta.setLayout(gridaBagLayoutCamposEstadoPedidoPuntoVenta);
		this.jPanelCamposOcultosEstadoPedidoPuntoVenta.setLayout(gridaBagLayoutCamposOcultosEstadoPedidoPuntoVenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoPedidoPuntoVenta.add(jLabelIdEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);



	this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoPedidoPuntoVenta.add(jTextFieldidEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);


	this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoPedidoPuntoVenta.add(jLabelnombreEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 2;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoPedidoPuntoVenta.add(jButtonnombreEstadoPedidoPuntoVentaBusqueda, this.gridBagConstraintsEstadoPedidoPuntoVenta);
	}

	this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = 0;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 1;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoPedidoPuntoVenta.add(jscrollPanenombreEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iYPanelCamposEstadoPedidoPuntoVenta;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iXPanelCamposEstadoPedidoPuntoVenta++;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoPedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoPedidoPuntoVenta.add(this.jPanelidEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);



	if(iXPanelCamposEstadoPedidoPuntoVenta % 1==0) {
		iXPanelCamposEstadoPedidoPuntoVenta=0;
		iYPanelCamposEstadoPedidoPuntoVenta++;
	}
	this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iYPanelCamposEstadoPedidoPuntoVenta;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iXPanelCamposEstadoPedidoPuntoVenta++;
	this.gridBagConstraintsEstadoPedidoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoPedidoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoPedidoPuntoVenta.add(this.jPanelnombreEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);



	if(iXPanelCamposEstadoPedidoPuntoVenta % 1==0) {
		iXPanelCamposEstadoPedidoPuntoVenta=0;
		iYPanelCamposEstadoPedidoPuntoVenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoPedidoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesEstadoPedidoPuntoVenta.setLayout(gridaBagLayoutAccionesEstadoPedidoPuntoVenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoPedidoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoPedidoPuntoVenta.setLayout(gridaBagLayoutAccionesFormularioEstadoPedidoPuntoVenta);
		
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoPedidoPuntoVenta.add(this.jComboBoxTiposAccionesFormularioEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);

		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoPedidoPuntoVenta.add(this.jCheckBoxPostAccionNuevoEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadopedidopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoPedidoPuntoVenta.add(this.jCheckBoxPostAccionSinCerrarEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadopedidopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoPedidoPuntoVenta.add(this.jCheckBoxPostAccionSinMensajeEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoPedidoPuntoVenta.add(this.jButtonModificarEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);							

		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoPedidoPuntoVenta.add(this.jButtonEliminarEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		
			
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoPedidoPuntoVenta.add(this.jButtonActualizarEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);


		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoPedidoPuntoVenta.add(this.jButtonGuardarCambiosEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);	
		
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoPedidoPuntoVenta.add(this.jButtonCancelarEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoPedidoPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoPedidoPuntoVenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsEstadoPedidoPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoPedidoPuntoVenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx =0;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoPedidoPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoPedidoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoPedidoPuntoVenta = new EstadoPedidoPuntoVentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Pedido DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Pedido DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Pedido Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoPedidoPuntoVentaModel estadopedidopuntoventaModel=new EstadoPedidoPuntoVentaModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoPedidoPuntoVentaModel.EstadoPedidoPuntoVentaFocusTraversalPolicy estadopedidopuntoventaFocusTraversalPolicy = estadopedidopuntoventaModel.new EstadoPedidoPuntoVentaFocusTraversalPolicy(this);
			
			//estadopedidopuntoventaFocusTraversalPolicy.setestadopedidopuntoventaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadopedidopuntoventaModel);
			
			
			this.jContentPaneDetalleEstadoPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoPedidoPuntoVenta = new GridBagLayout();	
			this.jContentPaneDetalleEstadoPedidoPuntoVenta.setLayout(gridaBagLayoutDetalleEstadoPedidoPuntoVenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoPedidoPuntoVenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoPedidoPuntoVenta.add(jTtoolBarDetalleEstadoPedidoPuntoVenta, gridBagConstraintsEstadoPedidoPuntoVenta);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoPedidoPuntoVenta=   new JScrollPane(jContentPaneDetalleEstadoPedidoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoPedidoPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;
	        
			this.jContentPaneDetalleEstadoPedidoPuntoVenta.add(jPanelCamposEstadoPedidoPuntoVenta, gridBagConstraintsEstadoPedidoPuntoVenta);
			
			
			
			
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
						&& estadopedidopuntoventaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFramePedidoPuntoVenta(this.puedeCargarPorPartePedidoPuntoVenta,false,-1);
					
					if(this.estadopedidopuntoventaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoPedidoPuntoVenta= new GridBagConstraints();
						this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;
						this.jContentPaneDetalleEstadoPedidoPuntoVenta.add(this.jTabbedPaneRelacionesEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoPedidoPuntoVenta.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFramePedidoPuntoVenta(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoPedidoPuntoVenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
					this.gridBagConstraintsEstadoPedidoPuntoVenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoPedidoPuntoVenta.add(jPanelCamposOcultosEstadoPedidoPuntoVenta, gridBagConstraintsEstadoPedidoPuntoVenta);
				
					this.jPanelCamposOcultosEstadoPedidoPuntoVenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;
	        this.gridBagConstraintsEstadoPedidoPuntoVenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoPedidoPuntoVenta.add(this.jPanelAccionesFormularioEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);							
			
			
			
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
	        this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoPedidoPuntoVenta.add(this.jPanelAccionesEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoPedidoPuntoVenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoPedidoPuntoVenta=   new JScrollPane(this.jPanelCamposEstadoPedidoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);			
			
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
			
			
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		
			
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoPedidoPuntoVenta;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoPedidoPuntoVenta;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFramePedidoPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pedidopuntoventaSessionBean=new PedidoPuntoVentaSessionBean();
		this.pedidopuntoventaSessionBean.setConGuardarRelaciones(true);
		this.pedidopuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.pedidopuntoventaBeanSwingJInternalFrame=null;//new PedidoPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pedidopuntoventaBeanSwingJInternalFramePopup=new PedidoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pedidopuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado()) {

				PedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoPedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoPedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidopuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.pedidopuntoventaBeanSwingJInternalFrame=new PedidoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.pedidopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidopuntoventaBeanSwingJInternalFrame.setpedidopuntoventaSessionBean(this.pedidopuntoventaSessionBean);

				//this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
				//this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;
				//this.jContentPaneDetalleEstadoPedidoPuntoVenta.add(this.pedidopuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoPedidoPuntoVenta);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoPedidoPuntoVenta.add("Pedido Punto Ventas",this.pedidopuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoPedidoPuntoVenta.setComponentAt(iIndexTab,this.pedidopuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidopuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.pedidopuntoventaBeanSwingJInternalFrame=null;//new PedidoPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedidoPuntoVenta) {
					this.jTabbedPaneRelacionesEstadoPedidoPuntoVenta.add("Pedido Punto Ventas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPedidoPuntoVentaBeanSwingJInternalFrame(List<EstadoPedidoPuntoVenta> estadopedidopuntoventas,EstadoPedidoPuntoVenta estadopedidopuntoventa,PedidoPuntoVentaBeanSwingJInternalFrame pedidopuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidopuntoventaBeanSwingJInternalFrame=new PedidoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidopuntoventaBeanSwingJInternalFrame.getPedidoPuntoVentaLogic().setConnexion(this.estadopedidopuntoventaLogic.getConnexion());

					pedidopuntoventaBeanSwingJInternalFrame.setestadopedidopuntoventasForeignKey(estadopedidopuntoventas);
					pedidopuntoventaBeanSwingJInternalFrame.setestadopedidopuntoventaForeignKey(estadopedidopuntoventa);
					pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionEstadoPedidoPuntoVenta(true);
					pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaSessionBean.setlidEstadoPedidoPuntoVentaActual(estadopedidopuntoventa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidopuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyPedidoPuntoVenta(pedidopuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidopuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoPedidoPuntoVenta(true);
					pedidopuntoventaBeanSwingJInternalFrame.setid_estado_pedido_punto_ventaFK_IdEstadoPedidoPuntoVenta(estadopedidopuntoventa.getId());

					if(!this.conCargarFormDetalle) {
						pedidopuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidopuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoPedidoPuntoVentaForeignKey(estadopedidopuntoventa,1,false,true,true);
					pedidopuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidopuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoPedidoPuntoVenta");
					pedidopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoPedidoPuntoVenta");
					pedidopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoPuntoVenta(true);
					pedidopuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPedidoPuntoVenta("n",pedidopuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, pedidopuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pedidopuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					pedidopuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pedidopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoPuntoVenta("relacionado");
					} else {
						pedidopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoPuntoVenta("no_relacionado");
					}

					pedidopuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionPedidoPuntoVenta().setVisible(false);

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
