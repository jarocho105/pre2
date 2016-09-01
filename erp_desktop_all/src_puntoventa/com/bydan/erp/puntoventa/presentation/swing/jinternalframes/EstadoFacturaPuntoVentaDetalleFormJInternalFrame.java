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

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.puntoventa.util.EstadoFacturaPuntoVentaConstantesFunciones;

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
public class EstadoFacturaPuntoVentaDetalleFormJInternalFrame extends EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoFacturaPuntoVenta;
	
	protected JMenuBar jmenuBarDetalleEstadoFacturaPuntoVenta;
	
	protected JMenu jmenuDetalleEstadoFacturaPuntoVenta;
	protected JMenu jmenuDetalleArchivoEstadoFacturaPuntoVenta;
	protected JMenu jmenuDetalleAccionesEstadoFacturaPuntoVenta;
	protected JMenu jmenuDetalleDatosEstadoFacturaPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoFacturaPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsEstadoFacturaPuntoVenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoFacturaPuntoVenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoFacturaPuntoVentaSessionBean estadofacturapuntoventaSessionBean;
	
	

	public FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame=null;
	public FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFacturaPuntoVenta=false;
	public FacturaPuntoVentaSessionBean facturapuntoventaSessionBean;
	
		
	
	public EstadoFacturaPuntoVentaLogic estadofacturapuntoventaLogic;
	
	public JScrollPane jScrollPanelDatosEstadoFacturaPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionEstadoFacturaPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralEstadoFacturaPuntoVenta;
	
	protected JPanel jPanelCamposEstadoFacturaPuntoVenta;    
	protected JPanel jPanelCamposOcultosEstadoFacturaPuntoVenta;    	
	protected JPanel jPanelAccionesEstadoFacturaPuntoVenta;
	protected JPanel jPanelAccionesFormularioEstadoFacturaPuntoVenta;
    
	
	
	protected Integer iXPanelCamposEstadoFacturaPuntoVenta=0;
	protected Integer iYPanelCamposEstadoFacturaPuntoVenta=0;
	
	protected Integer iXPanelCamposOcultosEstadoFacturaPuntoVenta=0;
	protected Integer iYPanelCamposOcultosEstadoFacturaPuntoVenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoFacturaPuntoVenta;
	public JButton jButtonModificarEstadoFacturaPuntoVenta;
	public JButton jButtonActualizarEstadoFacturaPuntoVenta;
    public JButton jButtonEliminarEstadoFacturaPuntoVenta;
	public JButton jButtonCancelarEstadoFacturaPuntoVenta;
    public JButton jButtonGuardarCambiosEstadoFacturaPuntoVenta;
	public JButton jButtonGuardarCambiosTablaEstadoFacturaPuntoVenta;
	protected JButton jButtonCerrarEstadoFacturaPuntoVenta;
	
	
	protected JButton jButtonProcesarInformacionEstadoFacturaPuntoVenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoFacturaPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoFacturaPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoFacturaPuntoVenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoFacturaPuntoVenta;
	protected JButton jButtonModificarToolBarEstadoFacturaPuntoVenta;
	protected JButton jButtonActualizarToolBarEstadoFacturaPuntoVenta;
    protected JButton jButtonEliminarToolBarEstadoFacturaPuntoVenta;
	protected JButton jButtonCancelarToolBarEstadoFacturaPuntoVenta;
    protected JButton jButtonGuardarCambiosToolBarEstadoFacturaPuntoVenta;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoFacturaPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoFacturaPuntoVenta;
	protected JButton jButtonCerrarToolBarEstadoFacturaPuntoVenta;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoFacturaPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemModificarEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemActualizarEstadoFacturaPuntoVenta;
    protected JMenuItem jMenuItemEliminarEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemCancelarEstadoFacturaPuntoVenta;
    protected JMenuItem jMenuItemGuardarCambiosEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemCerrarEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoFacturaPuntoVenta;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarEstadoFacturaPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoFacturaPuntoVenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoFacturaPuntoVenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoFacturaPuntoVenta;
	public JLabel jLabelIdEstadoFacturaPuntoVenta;
	public JTextFieldMe jTextFieldidEstadoFacturaPuntoVenta;
	public JButton jButtonidEstadoFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoFacturaPuntoVenta;
	public JLabel jLabelnombreEstadoFacturaPuntoVenta;
	public JTextArea jTextAreanombreEstadoFacturaPuntoVenta;
	public JScrollPane jscrollPanenombreEstadoFacturaPuntoVenta;
	public JButton jButtonnombreEstadoFacturaPuntoVentaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoFacturaPuntoVenta;
	
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
	
	public EstadoFacturaPuntoVentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoFacturaPuntoVenta=new JPanel();
				this.jPanelAccionesFormularioEstadoFacturaPuntoVenta=new JPanel();
				this.jmenuBarDetalleEstadoFacturaPuntoVenta=new JMenuBar();
				this.jTtoolBarDetalleEstadoFacturaPuntoVenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFacturaPuntoVentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoFacturaPuntoVentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFacturaPuntoVentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFacturaPuntoVentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFacturaPuntoVentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoFacturaPuntoVenta() {
		return this.jButtonActualizarToolBarEstadoFacturaPuntoVenta;
	}
	
	public JButton getjButtonEliminarToolBarEstadoFacturaPuntoVenta() {
		return this.jButtonEliminarToolBarEstadoFacturaPuntoVenta;
	}
	
	public JButton getjButtonCancelarToolBarEstadoFacturaPuntoVenta() {
		return this.jButtonCancelarToolBarEstadoFacturaPuntoVenta;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoFacturaPuntoVenta() {
		return this.jButtonProcesarInformacionEstadoFacturaPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoFacturaPuntoVenta)	{
		this.jButtonProcesarInformacionEstadoFacturaPuntoVenta = jButtonProcesarInformacionEstadoFacturaPuntoVenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoFacturaPuntoVenta() {
		return this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoFacturaPuntoVenta(
			JComboBox jComboBoxTiposRelacionesEstadoFacturaPuntoVenta) {
		this.jComboBoxTiposRelacionesEstadoFacturaPuntoVenta = jComboBoxTiposRelacionesEstadoFacturaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoFacturaPuntoVenta(
			JComboBox jComboBoxTiposAccionesEstadoFacturaPuntoVenta) {
		this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta = jComboBoxTiposAccionesEstadoFacturaPuntoVenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta() {
		return this.jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta(
			JComboBox jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta) {
		this.jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta = jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadofacturapuntoventaSessionBean=new EstadoFacturaPuntoVentaSessionBean();
		
		this.estadofacturapuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadofacturapuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.facturapuntoventaSessionBean=new FacturaPuntoVentaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoFacturaPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Factura MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoFacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoFacturaPuntoVenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoFacturaPuntoVenta=new JButtonMe();
				this.jButtonModificarToolBarEstadoFacturaPuntoVenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoFacturaPuntoVenta,this.jTtoolBarDetalleEstadoFacturaPuntoVenta,
							"actualizar","actualizar","Actualizar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoFacturaPuntoVenta,this.jTtoolBarDetalleEstadoFacturaPuntoVenta,
							"eliminar","eliminar","Eliminar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoFacturaPuntoVenta,this.jTtoolBarDetalleEstadoFacturaPuntoVenta,
							"cancelar","cancelar","Cancelar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoFacturaPuntoVenta,this.jTtoolBarDetalleEstadoFacturaPuntoVenta,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoFacturaPuntoVenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoFacturaPuntoVenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoFacturaPuntoVenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoFacturaPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoFacturaPuntoVenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoFacturaPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoFacturaPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoFacturaPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoFacturaPuntoVenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoFacturaPuntoVenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoFacturaPuntoVenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoFacturaPuntoVenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoFacturaPuntoVenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoFacturaPuntoVenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoFacturaPuntoVenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoFacturaPuntoVenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoFacturaPuntoVenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoFacturaPuntoVenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoFacturaPuntoVenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoFacturaPuntoVenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoFacturaPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoFacturaPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoFacturaPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoFacturaPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoFacturaPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoFacturaPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoFacturaPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoFacturaPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoFacturaPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoFacturaPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoFacturaPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoFacturaPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoFacturaPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoFacturaPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoFacturaPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoFacturaPuntoVenta.add(this.jMenuItemDetalleCerrarEstadoFacturaPuntoVenta);
		
		this.jmenuDetalleAccionesEstadoFacturaPuntoVenta.add(this.jMenuItemActualizarEstadoFacturaPuntoVenta);
		this.jmenuDetalleAccionesEstadoFacturaPuntoVenta.add(this.jMenuItemEliminarEstadoFacturaPuntoVenta);
		this.jmenuDetalleAccionesEstadoFacturaPuntoVenta.add(this.jMenuItemCancelarEstadoFacturaPuntoVenta);		
		
		//this.jmenuDetalleDatosEstadoFacturaPuntoVenta.add(this.jMenuItemDetalleAbrirOrderByEstadoFacturaPuntoVenta);				
		this.jmenuDetalleDatosEstadoFacturaPuntoVenta.add(this.jMenuItemDetalleMostarOcultarEstadoFacturaPuntoVenta);				
				
		//this.jmenuDetalleAccionesEstadoFacturaPuntoVenta.add(this.jMenuItemGuardarCambiosEstadoFacturaPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoFacturaPuntoVenta.add(this.jmenuDetalleArchivoEstadoFacturaPuntoVenta);		
		this.jmenuBarDetalleEstadoFacturaPuntoVenta.add(this.jmenuDetalleAccionesEstadoFacturaPuntoVenta);		
		this.jmenuBarDetalleEstadoFacturaPuntoVenta.add(this.jmenuDetalleDatosEstadoFacturaPuntoVenta);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoFacturaPuntoVenta.add(this.jmenuDetalleEstadoFacturaPuntoVenta);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoFacturaPuntoVenta);				
	}
	
	
	public void inicializarElementosCamposEstadoFacturaPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoFacturaPuntoVenta = new JLabelMe();
		jLabelIdEstadoFacturaPuntoVenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoFacturaPuntoVenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoFacturaPuntoVenta.setToolTipText(EstadoFacturaPuntoVentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoFacturaPuntoVenta= new GridBagLayout();

		this.jPanelidEstadoFacturaPuntoVenta.setLayout(this.gridaBagLayoutEstadoFacturaPuntoVenta);

		jTextFieldidEstadoFacturaPuntoVenta = new JTextFieldMe();
		jTextFieldidEstadoFacturaPuntoVenta.setText("Id");

		jTextFieldidEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreEstadoFacturaPuntoVenta = new JLabelMe();
		this.jLabelnombreEstadoFacturaPuntoVenta.setText(""+EstadoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoFacturaPuntoVenta.setToolTipText("Nombre");
		this.jLabelnombreEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoFacturaPuntoVenta.setToolTipText(EstadoFacturaPuntoVentaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoFacturaPuntoVenta = new GridBagLayout();
		this.jPanelnombreEstadoFacturaPuntoVenta.setLayout(this.gridaBagLayoutEstadoFacturaPuntoVenta);


		jTextAreanombreEstadoFacturaPuntoVenta= new JTextAreaMe();
		jTextAreanombreEstadoFacturaPuntoVenta.setEnabled(false);
		jTextAreanombreEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoFacturaPuntoVenta.setLineWrap(true);
		jTextAreanombreEstadoFacturaPuntoVenta.setWrapStyleWord(true);
		jTextAreanombreEstadoFacturaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoFacturaPuntoVenta.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoFacturaPuntoVenta = new JScrollPane(jTextAreanombreEstadoFacturaPuntoVenta);
		jscrollPanenombreEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonnombreEstadoFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonnombreEstadoFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoFacturaPuntoVentaBusqueda"));

		if(this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoFacturaPuntoVentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoFacturaPuntoVenta() {
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
		//this.jInternalFrameDetalleEstadoFacturaPuntoVenta = new EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Factura DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoFacturaPuntoVenta= new GridBagLayout();
		

		
		String sToolTipEstadoFacturaPuntoVenta="";
		sToolTipEstadoFacturaPuntoVenta=EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoFacturaPuntoVenta+="(PuntoVenta.EstadoFacturaPuntoVenta)";
		}
		
		if(!this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoFacturaPuntoVenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoFacturaPuntoVenta = new JButtonMe();
		this.jButtonModificarEstadoFacturaPuntoVenta = new JButtonMe();
        this.jButtonActualizarEstadoFacturaPuntoVenta = new JButtonMe();
        this.jButtonEliminarEstadoFacturaPuntoVenta = new JButtonMe();
        this.jButtonCancelarEstadoFacturaPuntoVenta = new JButtonMe();
        this.jButtonGuardarCambiosEstadoFacturaPuntoVenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoFacturaPuntoVenta = new JButtonMe();
		this.jButtonCerrarEstadoFacturaPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosEstadoFacturaPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoFacturaPuntoVenta = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Factura";
		
		if(!this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoFacturaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoFacturaPuntoVenta.setName("jPanelCamposEstadoFacturaPuntoVenta"); 

		this.jPanelCamposOcultosEstadoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoFacturaPuntoVenta.setName("jPanelCamposOcultosEstadoFacturaPuntoVenta"); 

        this.jPanelAccionesEstadoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoFacturaPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesEstadoFacturaPuntoVenta.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoFacturaPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoFacturaPuntoVenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoFacturaPuntoVenta.setText("Nuevo");
		this.jButtonModificarEstadoFacturaPuntoVenta.setText("Editar");
        this.jButtonActualizarEstadoFacturaPuntoVenta.setText("Actualizar");
        this.jButtonEliminarEstadoFacturaPuntoVenta.setText("Eliminar");
        this.jButtonCancelarEstadoFacturaPuntoVenta.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoFacturaPuntoVenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoFacturaPuntoVenta.setText("Guardar");
		this.jButtonCerrarEstadoFacturaPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoFacturaPuntoVenta,"nuevo_button","Nuevo",this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoFacturaPuntoVenta,"modificar_button","Editar",this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoFacturaPuntoVenta,"actualizar_button","Actualizar",this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoFacturaPuntoVenta,"eliminar_button","Eliminar",this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoFacturaPuntoVenta,"cancelar_button","Cancelar",this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoFacturaPuntoVenta,"guardarcambios_button","Guardar",this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoFacturaPuntoVenta,"guardarcambiostabla_button","Guardar",this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoFacturaPuntoVenta,"cerrar_button","Salir",this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoFacturaPuntoVenta.setToolTipText("Nuevo"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoFacturaPuntoVenta.setToolTipText("Editar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoFacturaPuntoVenta.setToolTipText("Actualizar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoFacturaPuntoVenta.setToolTipText("Eliminar)"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoFacturaPuntoVenta.setToolTipText("Cancelar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoFacturaPuntoVenta.setToolTipText("Guardar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoFacturaPuntoVenta.setToolTipText("Guardar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoFacturaPuntoVenta.setToolTipText("Salir"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoFacturaPuntoVenta";
		inputMap = this.jButtonNuevoEstadoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoFacturaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoFacturaPuntoVenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoFacturaPuntoVenta";
		inputMap = this.jButtonActualizarEstadoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoFacturaPuntoVenta"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoFacturaPuntoVenta";
		inputMap = this.jButtonEliminarEstadoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoFacturaPuntoVenta"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoFacturaPuntoVenta";
		inputMap = this.jButtonCancelarEstadoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoFacturaPuntoVenta"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoFacturaPuntoVenta";
		inputMap = this.jButtonCerrarEstadoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoFacturaPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoFacturaPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaEstadoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoFacturaPuntoVenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoFacturaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoFacturaPuntoVenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoFacturaPuntoVenta.setToolTipText("Nuevo EstadoFacturaPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoFacturaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoFacturaPuntoVenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoFacturaPuntoVenta.setToolTipText("Sin Cerrar Ventana EstadoFacturaPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoFacturaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoFacturaPuntoVenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoFacturaPuntoVenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoFacturaPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesEstadoFacturaPuntoVenta.setText("Acciones");		
		this.jLabelAccionesEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoFacturaPuntoVenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoFacturaPuntoVenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoFacturaPuntoVenta=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoFacturaPuntoVenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoFacturaPuntoVenta = new GridBagLayout();
		
		this.jPanelCamposEstadoFacturaPuntoVenta.setLayout(gridaBagLayoutCamposEstadoFacturaPuntoVenta);
		this.jPanelCamposOcultosEstadoFacturaPuntoVenta.setLayout(gridaBagLayoutCamposOcultosEstadoFacturaPuntoVenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoFacturaPuntoVenta.add(jLabelIdEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);



	this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoFacturaPuntoVenta.add(jTextFieldidEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);


	this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoFacturaPuntoVenta.add(jLabelnombreEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoFacturaPuntoVenta.add(jButtonnombreEstadoFacturaPuntoVentaBusqueda, this.gridBagConstraintsEstadoFacturaPuntoVenta);
	}

	this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoFacturaPuntoVenta.add(jscrollPanenombreEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iYPanelCamposEstadoFacturaPuntoVenta;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iXPanelCamposEstadoFacturaPuntoVenta++;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoFacturaPuntoVenta.add(this.jPanelidEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);



	if(iXPanelCamposEstadoFacturaPuntoVenta % 1==0) {
		iXPanelCamposEstadoFacturaPuntoVenta=0;
		iYPanelCamposEstadoFacturaPuntoVenta++;
	}
	this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iYPanelCamposEstadoFacturaPuntoVenta;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iXPanelCamposEstadoFacturaPuntoVenta++;
	this.gridBagConstraintsEstadoFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoFacturaPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoFacturaPuntoVenta.add(this.jPanelnombreEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);



	if(iXPanelCamposEstadoFacturaPuntoVenta % 1==0) {
		iXPanelCamposEstadoFacturaPuntoVenta=0;
		iYPanelCamposEstadoFacturaPuntoVenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoFacturaPuntoVenta= new GridBagLayout();
		this.jPanelAccionesEstadoFacturaPuntoVenta.setLayout(gridaBagLayoutAccionesEstadoFacturaPuntoVenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoFacturaPuntoVenta= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoFacturaPuntoVenta.setLayout(gridaBagLayoutAccionesFormularioEstadoFacturaPuntoVenta);
		
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoFacturaPuntoVenta.add(this.jComboBoxTiposAccionesFormularioEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);

		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoFacturaPuntoVenta.add(this.jCheckBoxPostAccionNuevoEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoFacturaPuntoVenta.add(this.jCheckBoxPostAccionSinCerrarEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadofacturapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoFacturaPuntoVenta.add(this.jCheckBoxPostAccionSinMensajeEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoFacturaPuntoVenta.add(this.jButtonModificarEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);							

		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoFacturaPuntoVenta.add(this.jButtonEliminarEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		
			
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = 0;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoFacturaPuntoVenta.add(this.jButtonActualizarEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);


		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = 0;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoFacturaPuntoVenta.add(this.jButtonGuardarCambiosEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);	
		
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = 0;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoFacturaPuntoVenta.add(this.jButtonCancelarEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoFacturaPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoFacturaPuntoVenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsEstadoFacturaPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoFacturaPuntoVenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx =0;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoFacturaPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoFacturaPuntoVenta = new EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Factura DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Factura DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Factura Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoFacturaPuntoVentaModel estadofacturapuntoventaModel=new EstadoFacturaPuntoVentaModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoFacturaPuntoVentaModel.EstadoFacturaPuntoVentaFocusTraversalPolicy estadofacturapuntoventaFocusTraversalPolicy = estadofacturapuntoventaModel.new EstadoFacturaPuntoVentaFocusTraversalPolicy(this);
			
			//estadofacturapuntoventaFocusTraversalPolicy.setestadofacturapuntoventaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadofacturapuntoventaModel);
			
			
			this.jContentPaneDetalleEstadoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoFacturaPuntoVenta = new GridBagLayout();	
			this.jContentPaneDetalleEstadoFacturaPuntoVenta.setLayout(gridaBagLayoutDetalleEstadoFacturaPuntoVenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoFacturaPuntoVenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoFacturaPuntoVenta.add(jTtoolBarDetalleEstadoFacturaPuntoVenta, gridBagConstraintsEstadoFacturaPuntoVenta);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta=   new JScrollPane(jContentPaneDetalleEstadoFacturaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoFacturaPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;
	        
			this.jContentPaneDetalleEstadoFacturaPuntoVenta.add(jPanelCamposEstadoFacturaPuntoVenta, gridBagConstraintsEstadoFacturaPuntoVenta);
			
			
			
			
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
						&& estadofacturapuntoventaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFacturaPuntoVenta(this.puedeCargarPorParteFacturaPuntoVenta,false,-1);
					
					if(this.estadofacturapuntoventaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoFacturaPuntoVenta= new GridBagConstraints();
						this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;
						this.jContentPaneDetalleEstadoFacturaPuntoVenta.add(this.jTabbedPaneRelacionesEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoFacturaPuntoVenta.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFacturaPuntoVenta(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoFacturaPuntoVenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
					this.gridBagConstraintsEstadoFacturaPuntoVenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoFacturaPuntoVenta.add(jPanelCamposOcultosEstadoFacturaPuntoVenta, gridBagConstraintsEstadoFacturaPuntoVenta);
				
					this.jPanelCamposOcultosEstadoFacturaPuntoVenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;
	        this.gridBagConstraintsEstadoFacturaPuntoVenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoFacturaPuntoVenta.add(this.jPanelAccionesFormularioEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);							
			
			
			
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
	        this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoFacturaPuntoVenta.add(this.jPanelAccionesEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoFacturaPuntoVenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta=   new JScrollPane(this.jPanelCamposEstadoFacturaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);			
			
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
			
			
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		
			
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoFacturaPuntoVenta;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoFacturaPuntoVenta;
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

				FacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
				FacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.facturapuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.facturapuntoventaBeanSwingJInternalFrame=new FacturaPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.facturapuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.facturapuntoventaBeanSwingJInternalFrame.setfacturapuntoventaSessionBean(this.facturapuntoventaSessionBean);

				//this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
				//this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;
				//this.jContentPaneDetalleEstadoFacturaPuntoVenta.add(this.facturapuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoFacturaPuntoVenta);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoFacturaPuntoVenta.add("Factura Punto Ventas",this.facturapuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoFacturaPuntoVenta.setComponentAt(iIndexTab,this.facturapuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//FacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.facturapuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.facturapuntoventaBeanSwingJInternalFrame=null;//new FacturaPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFacturaPuntoVenta) {
					this.jTabbedPaneRelacionesEstadoFacturaPuntoVenta.add("Factura Punto Ventas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFacturaPuntoVentaBeanSwingJInternalFrame(List<EstadoFacturaPuntoVenta> estadofacturapuntoventas,EstadoFacturaPuntoVenta estadofacturapuntoventa,FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//facturapuntoventaBeanSwingJInternalFrame=new FacturaPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					facturapuntoventaBeanSwingJInternalFrame.getFacturaPuntoVentaLogic().setConnexion(this.estadofacturapuntoventaLogic.getConnexion());

					facturapuntoventaBeanSwingJInternalFrame.setestadofacturapuntoventasForeignKey(estadofacturapuntoventas);
					facturapuntoventaBeanSwingJInternalFrame.setestadofacturapuntoventaForeignKey(estadofacturapuntoventa);
					facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionEstadoFacturaPuntoVenta(true);
					facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.setlidEstadoFacturaPuntoVentaActual(estadofacturapuntoventa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					facturapuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyFacturaPuntoVenta(facturapuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					facturapuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoFacturaPuntoVenta(true);
					facturapuntoventaBeanSwingJInternalFrame.setid_estado_factura_punto_ventaFK_IdEstadoFacturaPuntoVenta(estadofacturapuntoventa.getId());

					if(!this.conCargarFormDetalle) {
						facturapuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					facturapuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoFacturaPuntoVentaForeignKey(estadofacturapuntoventa,1,false,true,true);
					facturapuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					facturapuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoFacturaPuntoVenta");
					facturapuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoFacturaPuntoVenta");
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
